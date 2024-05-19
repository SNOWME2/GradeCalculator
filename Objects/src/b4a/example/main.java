package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.PanelWrapper _homepanel = null;
public b4a.example.asflowtabmenu _asflowtabmenu1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _grade1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _grade2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _grade3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _grade4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _grade5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _grade6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _grade7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _grade8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unit1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unit2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unit3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unit4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unit6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unit7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unit8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unit5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _gwa = null;
public static float _u1 = 0f;
public static float _u2 = 0f;
public static float _u3 = 0f;
public static float _u4 = 0f;
public static float _u5 = 0f;
public static float _u6 = 0f;
public static float _u7 = 0f;
public static float _u8 = 0f;
public static float _g1 = 0f;
public static float _g2 = 0f;
public static float _g3 = 0f;
public static float _g4 = 0f;
public static float _g5 = 0f;
public static float _g6 = 0f;
public static float _g7 = 0f;
public static float _g8 = 0f;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal8 = null;
public static double _totalsubtotal = 0;
public anywheresoftware.b4a.obejcts.TTS _voice = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clear = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
mostCurrent._asflowtabmenu1._addtab /*String*/ (null,mostCurrent._asflowtabmenu1._fonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe88a))),anywheresoftware.b4a.keywords.Common.True,(float) (25),_xui.Color_White),"Home");
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
mostCurrent._asflowtabmenu1._addtab /*String*/ (null,mostCurrent._asflowtabmenu1._fonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe5c3))),anywheresoftware.b4a.keywords.Common.True,(float) (25),_xui.Color_White),"Calcu");
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
mostCurrent._asflowtabmenu1._addtab /*String*/ (null,mostCurrent._asflowtabmenu1._fonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe88e))),anywheresoftware.b4a.keywords.Common.True,(float) (25),_xui.Color_White),"About");
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="voice.Initialize(\"TTS\")";
mostCurrent._voice.Initialize(processBA,"TTS");
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public static String  _calculatesubtotals() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calculatesubtotals", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calculatesubtotals", null));}
double _totalunits = 0;
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Sub CalculateSubtotals";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="totalSubtotal = 0";
_totalsubtotal = 0;
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="Dim totalUnits As Double = 0";
_totalunits = 0;
RDebugUtils.currentLine=47316996;
 //BA.debugLineNum = 47316996;BA.debugLine="If grade1.Text <> \"\" And unit1.Text <> \"\" Then";
if ((mostCurrent._grade1.getText()).equals("") == false && (mostCurrent._unit1.getText()).equals("") == false) { 
RDebugUtils.currentLine=47316997;
 //BA.debugLineNum = 47316997;BA.debugLine="g1 = grade1.Text";
_g1 = (float)(Double.parseDouble(mostCurrent._grade1.getText()));
RDebugUtils.currentLine=47316998;
 //BA.debugLineNum = 47316998;BA.debugLine="u1 = unit1.Text";
_u1 = (float)(Double.parseDouble(mostCurrent._unit1.getText()));
RDebugUtils.currentLine=47316999;
 //BA.debugLineNum = 47316999;BA.debugLine="subtotal1.Text = g1 * u1";
mostCurrent._subtotal1.setText(BA.ObjectToCharSequence(_g1*_u1));
RDebugUtils.currentLine=47317000;
 //BA.debugLineNum = 47317000;BA.debugLine="totalSubtotal = totalSubtotal + g1 * u1";
_totalsubtotal = _totalsubtotal+_g1*_u1;
RDebugUtils.currentLine=47317001;
 //BA.debugLineNum = 47317001;BA.debugLine="totalUnits = totalUnits + u1";
_totalunits = _totalunits+_u1;
 }else {
RDebugUtils.currentLine=47317003;
 //BA.debugLineNum = 47317003;BA.debugLine="subtotal1.Text =  GetMissingValue(grade1, unit1)";
mostCurrent._subtotal1.setText(BA.ObjectToCharSequence(_getmissingvalue(mostCurrent._grade1,mostCurrent._unit1)));
 };
RDebugUtils.currentLine=47317006;
 //BA.debugLineNum = 47317006;BA.debugLine="If grade2.Text <> \"\" And unit2.Text <> \"\" Then";
if ((mostCurrent._grade2.getText()).equals("") == false && (mostCurrent._unit2.getText()).equals("") == false) { 
RDebugUtils.currentLine=47317007;
 //BA.debugLineNum = 47317007;BA.debugLine="g2 = grade2.Text";
_g2 = (float)(Double.parseDouble(mostCurrent._grade2.getText()));
RDebugUtils.currentLine=47317008;
 //BA.debugLineNum = 47317008;BA.debugLine="u2 = unit2.Text";
_u2 = (float)(Double.parseDouble(mostCurrent._unit2.getText()));
RDebugUtils.currentLine=47317009;
 //BA.debugLineNum = 47317009;BA.debugLine="subtotal2.Text = g2 * u2";
mostCurrent._subtotal2.setText(BA.ObjectToCharSequence(_g2*_u2));
RDebugUtils.currentLine=47317010;
 //BA.debugLineNum = 47317010;BA.debugLine="totalSubtotal = totalSubtotal + g2 * u2";
_totalsubtotal = _totalsubtotal+_g2*_u2;
RDebugUtils.currentLine=47317011;
 //BA.debugLineNum = 47317011;BA.debugLine="totalUnits = totalUnits + u2";
_totalunits = _totalunits+_u2;
 }else {
RDebugUtils.currentLine=47317013;
 //BA.debugLineNum = 47317013;BA.debugLine="subtotal2.Text =  GetMissingValue(grade2, unit2)";
mostCurrent._subtotal2.setText(BA.ObjectToCharSequence(_getmissingvalue(mostCurrent._grade2,mostCurrent._unit2)));
 };
RDebugUtils.currentLine=47317016;
 //BA.debugLineNum = 47317016;BA.debugLine="If grade3.Text <> \"\" And unit3.Text <> \"\" Then";
if ((mostCurrent._grade3.getText()).equals("") == false && (mostCurrent._unit3.getText()).equals("") == false) { 
RDebugUtils.currentLine=47317017;
 //BA.debugLineNum = 47317017;BA.debugLine="g3 = grade3.Text";
_g3 = (float)(Double.parseDouble(mostCurrent._grade3.getText()));
RDebugUtils.currentLine=47317018;
 //BA.debugLineNum = 47317018;BA.debugLine="u3 = unit3.Text";
_u3 = (float)(Double.parseDouble(mostCurrent._unit3.getText()));
RDebugUtils.currentLine=47317019;
 //BA.debugLineNum = 47317019;BA.debugLine="subtotal3.Text = g3 * u3";
mostCurrent._subtotal3.setText(BA.ObjectToCharSequence(_g3*_u3));
RDebugUtils.currentLine=47317020;
 //BA.debugLineNum = 47317020;BA.debugLine="totalSubtotal = totalSubtotal + g3 * u3";
_totalsubtotal = _totalsubtotal+_g3*_u3;
RDebugUtils.currentLine=47317021;
 //BA.debugLineNum = 47317021;BA.debugLine="totalUnits = totalUnits + u3";
_totalunits = _totalunits+_u3;
 }else {
RDebugUtils.currentLine=47317023;
 //BA.debugLineNum = 47317023;BA.debugLine="subtotal3.Text =  GetMissingValue(grade3, unit3)";
mostCurrent._subtotal3.setText(BA.ObjectToCharSequence(_getmissingvalue(mostCurrent._grade3,mostCurrent._unit3)));
 };
RDebugUtils.currentLine=47317026;
 //BA.debugLineNum = 47317026;BA.debugLine="If grade4.Text <> \"\" And unit4.Text <> \"\" Then";
if ((mostCurrent._grade4.getText()).equals("") == false && (mostCurrent._unit4.getText()).equals("") == false) { 
RDebugUtils.currentLine=47317027;
 //BA.debugLineNum = 47317027;BA.debugLine="g4 = grade4.Text";
_g4 = (float)(Double.parseDouble(mostCurrent._grade4.getText()));
RDebugUtils.currentLine=47317028;
 //BA.debugLineNum = 47317028;BA.debugLine="u4 = unit4.Text";
_u4 = (float)(Double.parseDouble(mostCurrent._unit4.getText()));
RDebugUtils.currentLine=47317029;
 //BA.debugLineNum = 47317029;BA.debugLine="subtotal4.Text = g4 * u4";
mostCurrent._subtotal4.setText(BA.ObjectToCharSequence(_g4*_u4));
RDebugUtils.currentLine=47317030;
 //BA.debugLineNum = 47317030;BA.debugLine="totalSubtotal = totalSubtotal + g4 * u4";
_totalsubtotal = _totalsubtotal+_g4*_u4;
RDebugUtils.currentLine=47317031;
 //BA.debugLineNum = 47317031;BA.debugLine="totalUnits = totalUnits + u4";
_totalunits = _totalunits+_u4;
 }else {
RDebugUtils.currentLine=47317033;
 //BA.debugLineNum = 47317033;BA.debugLine="subtotal4.Text = GetMissingValue(grade4, unit4)";
mostCurrent._subtotal4.setText(BA.ObjectToCharSequence(_getmissingvalue(mostCurrent._grade4,mostCurrent._unit4)));
 };
RDebugUtils.currentLine=47317036;
 //BA.debugLineNum = 47317036;BA.debugLine="If grade5.Text <> \"\" And unit5.Text <> \"\" Then";
if ((mostCurrent._grade5.getText()).equals("") == false && (mostCurrent._unit5.getText()).equals("") == false) { 
RDebugUtils.currentLine=47317037;
 //BA.debugLineNum = 47317037;BA.debugLine="g5 = grade5.Text";
_g5 = (float)(Double.parseDouble(mostCurrent._grade5.getText()));
RDebugUtils.currentLine=47317038;
 //BA.debugLineNum = 47317038;BA.debugLine="u5 = unit5.Text";
_u5 = (float)(Double.parseDouble(mostCurrent._unit5.getText()));
RDebugUtils.currentLine=47317039;
 //BA.debugLineNum = 47317039;BA.debugLine="subtotal5.Text = g5 * u5";
mostCurrent._subtotal5.setText(BA.ObjectToCharSequence(_g5*_u5));
RDebugUtils.currentLine=47317040;
 //BA.debugLineNum = 47317040;BA.debugLine="totalSubtotal = totalSubtotal + g5 * u5";
_totalsubtotal = _totalsubtotal+_g5*_u5;
RDebugUtils.currentLine=47317041;
 //BA.debugLineNum = 47317041;BA.debugLine="totalUnits = totalUnits + u5";
_totalunits = _totalunits+_u5;
 }else {
RDebugUtils.currentLine=47317043;
 //BA.debugLineNum = 47317043;BA.debugLine="subtotal5.Text =  GetMissingValue(grade5, unit5)";
mostCurrent._subtotal5.setText(BA.ObjectToCharSequence(_getmissingvalue(mostCurrent._grade5,mostCurrent._unit5)));
 };
RDebugUtils.currentLine=47317046;
 //BA.debugLineNum = 47317046;BA.debugLine="If grade6.Text <> \"\" And unit6.Text <> \"\" Then";
if ((mostCurrent._grade6.getText()).equals("") == false && (mostCurrent._unit6.getText()).equals("") == false) { 
RDebugUtils.currentLine=47317047;
 //BA.debugLineNum = 47317047;BA.debugLine="g6 = grade6.Text";
_g6 = (float)(Double.parseDouble(mostCurrent._grade6.getText()));
RDebugUtils.currentLine=47317048;
 //BA.debugLineNum = 47317048;BA.debugLine="u6 = unit6.Text";
_u6 = (float)(Double.parseDouble(mostCurrent._unit6.getText()));
RDebugUtils.currentLine=47317049;
 //BA.debugLineNum = 47317049;BA.debugLine="subtotal6.Text = g6 * u6";
mostCurrent._subtotal6.setText(BA.ObjectToCharSequence(_g6*_u6));
RDebugUtils.currentLine=47317050;
 //BA.debugLineNum = 47317050;BA.debugLine="totalSubtotal = totalSubtotal + g6 * u6";
_totalsubtotal = _totalsubtotal+_g6*_u6;
RDebugUtils.currentLine=47317051;
 //BA.debugLineNum = 47317051;BA.debugLine="totalUnits = totalUnits + u6";
_totalunits = _totalunits+_u6;
 }else {
RDebugUtils.currentLine=47317053;
 //BA.debugLineNum = 47317053;BA.debugLine="subtotal6.Text =  GetMissingValue(grade6, unit6)";
mostCurrent._subtotal6.setText(BA.ObjectToCharSequence(_getmissingvalue(mostCurrent._grade6,mostCurrent._unit6)));
 };
RDebugUtils.currentLine=47317056;
 //BA.debugLineNum = 47317056;BA.debugLine="If grade7.Text <> \"\" And unit7.Text <> \"\" Then";
if ((mostCurrent._grade7.getText()).equals("") == false && (mostCurrent._unit7.getText()).equals("") == false) { 
RDebugUtils.currentLine=47317057;
 //BA.debugLineNum = 47317057;BA.debugLine="g7 = grade7.Text";
_g7 = (float)(Double.parseDouble(mostCurrent._grade7.getText()));
RDebugUtils.currentLine=47317058;
 //BA.debugLineNum = 47317058;BA.debugLine="u7 = unit7.Text";
_u7 = (float)(Double.parseDouble(mostCurrent._unit7.getText()));
RDebugUtils.currentLine=47317059;
 //BA.debugLineNum = 47317059;BA.debugLine="subtotal7.Text = g7 * u7";
mostCurrent._subtotal7.setText(BA.ObjectToCharSequence(_g7*_u7));
RDebugUtils.currentLine=47317060;
 //BA.debugLineNum = 47317060;BA.debugLine="totalSubtotal = totalSubtotal + g7 * u7";
_totalsubtotal = _totalsubtotal+_g7*_u7;
RDebugUtils.currentLine=47317061;
 //BA.debugLineNum = 47317061;BA.debugLine="totalUnits = totalUnits + u7";
_totalunits = _totalunits+_u7;
 }else {
RDebugUtils.currentLine=47317063;
 //BA.debugLineNum = 47317063;BA.debugLine="subtotal7.Text =  GetMissingValue(grade7, unit7)";
mostCurrent._subtotal7.setText(BA.ObjectToCharSequence(_getmissingvalue(mostCurrent._grade7,mostCurrent._unit7)));
 };
RDebugUtils.currentLine=47317066;
 //BA.debugLineNum = 47317066;BA.debugLine="If grade8.Text <> \"\" And unit8.Text <> \"\" Then";
if ((mostCurrent._grade8.getText()).equals("") == false && (mostCurrent._unit8.getText()).equals("") == false) { 
RDebugUtils.currentLine=47317067;
 //BA.debugLineNum = 47317067;BA.debugLine="g8 = grade8.Text";
_g8 = (float)(Double.parseDouble(mostCurrent._grade8.getText()));
RDebugUtils.currentLine=47317068;
 //BA.debugLineNum = 47317068;BA.debugLine="u8 = unit8.Text";
_u8 = (float)(Double.parseDouble(mostCurrent._unit8.getText()));
RDebugUtils.currentLine=47317069;
 //BA.debugLineNum = 47317069;BA.debugLine="subtotal8.Text = g8 * u8";
mostCurrent._subtotal8.setText(BA.ObjectToCharSequence(_g8*_u8));
RDebugUtils.currentLine=47317070;
 //BA.debugLineNum = 47317070;BA.debugLine="totalSubtotal = totalSubtotal + g8 * u8";
_totalsubtotal = _totalsubtotal+_g8*_u8;
RDebugUtils.currentLine=47317071;
 //BA.debugLineNum = 47317071;BA.debugLine="totalUnits = totalUnits + u8";
_totalunits = _totalunits+_u8;
 }else {
RDebugUtils.currentLine=47317073;
 //BA.debugLineNum = 47317073;BA.debugLine="subtotal8.Text = GetMissingValue(grade8, unit8)";
mostCurrent._subtotal8.setText(BA.ObjectToCharSequence(_getmissingvalue(mostCurrent._grade8,mostCurrent._unit8)));
 };
RDebugUtils.currentLine=47317076;
 //BA.debugLineNum = 47317076;BA.debugLine="CalculateGWA(totalSubtotal, totalUnits)";
_calculategwa(_totalsubtotal,_totalunits);
RDebugUtils.currentLine=47317077;
 //BA.debugLineNum = 47317077;BA.debugLine="End Sub";
return "";
}
public static String  _asflowtabmenu1_tabclick(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "asflowtabmenu1_tabclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "asflowtabmenu1_tabclick", new Object[] {_index}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub ASFlowTabMenu1_TabClick(index As Int)";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Select Case index";
switch (_index) {
case 0: {
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="HomePanel.SetLayoutAnimated(375, 0, HomePanel.t";
mostCurrent._homepanel.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._homepanel.getTop(),mostCurrent._homepanel.getWidth(),mostCurrent._homepanel.getHeight());
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Panel1.SetLayoutAnimated(375, 100%x, HomePanel.";
mostCurrent._panel1.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._homepanel.getTop(),mostCurrent._homepanel.getWidth(),mostCurrent._homepanel.getHeight());
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Panel2.SetLayoutAnimated(375, 200%x, HomePanel.";
mostCurrent._panel2.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (200),mostCurrent.activityBA),mostCurrent._homepanel.getTop(),mostCurrent._homepanel.getWidth(),mostCurrent._homepanel.getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="HomePanel.SetLayoutAnimated(375, -100%x, Panel1";
mostCurrent._homepanel.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)),mostCurrent._panel1.getTop(),mostCurrent._panel1.getWidth(),mostCurrent._panel1.getHeight());
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="Panel1.SetLayoutAnimated(375, 0, Panel1.top, Pa";
mostCurrent._panel1.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._panel1.getTop(),mostCurrent._panel1.getWidth(),mostCurrent._panel1.getHeight());
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="Panel2.SetLayoutAnimated(375, 100%x, Panel1.top";
mostCurrent._panel2.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._panel1.getTop(),mostCurrent._panel1.getWidth(),mostCurrent._panel1.getHeight());
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
 break; }
case 2: {
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="Panel2.SetLayoutAnimated(375, 0, Panel2.top, Pa";
mostCurrent._panel2.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._panel2.getHeight());
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="HomePanel.SetLayoutAnimated(375, -200%x, Panel2";
mostCurrent._homepanel.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (200),mostCurrent.activityBA)),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._panel2.getHeight());
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="Panel1.SetLayoutAnimated(375, -100%x, Panel2.to";
mostCurrent._panel1.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._panel2.getHeight());
 break; }
}
;
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="End Sub";
return "";
}
public static String  _calculategwa(double _totalsub,double _totalunits) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calculategwa", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calculategwa", new Object[] {_totalsub,_totalunits}));}
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Sub CalculateGWA(totalSub As Double, totalUnits As";
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="If totalUnits > 0 Then";
if (_totalunits>0) { 
RDebugUtils.currentLine=50724867;
 //BA.debugLineNum = 50724867;BA.debugLine="GWA.Text = (totalSub / totalUnits)";
mostCurrent._gwa.setText(BA.ObjectToCharSequence((_totalsub/(double)_totalunits)));
 }else {
RDebugUtils.currentLine=50724870;
 //BA.debugLineNum = 50724870;BA.debugLine="GWA.Text = \"0\"";
mostCurrent._gwa.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=50724873;
 //BA.debugLineNum = 50724873;BA.debugLine="End Sub";
return "";
}
public static String  _getmissingvalue(anywheresoftware.b4a.objects.EditTextWrapper _grade,anywheresoftware.b4a.objects.EditTextWrapper _unit) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getmissingvalue", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getmissingvalue", new Object[] {_grade,_unit}));}
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Private Sub GetMissingValue(grade As EditText, uni";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="If grade.Text = \"\" Then";
if ((_grade.getText()).equals("")) { 
RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="Return unit.text";
if (true) return _unit.getText();
 }else {
RDebugUtils.currentLine=47382532;
 //BA.debugLineNum = 47382532;BA.debugLine="Return grade.text";
if (true) return _grade.getText();
 };
RDebugUtils.currentLine=47382534;
 //BA.debugLineNum = 47382534;BA.debugLine="End Sub";
return "";
}
public static String  _clear_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clear_click", null));}
RDebugUtils.currentLine=50855936;
 //BA.debugLineNum = 50855936;BA.debugLine="Private Sub clear_Click";
RDebugUtils.currentLine=50855937;
 //BA.debugLineNum = 50855937;BA.debugLine="unit1.Text=\"\"";
mostCurrent._unit1.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="unit2.Text=\"\"";
mostCurrent._unit2.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855939;
 //BA.debugLineNum = 50855939;BA.debugLine="unit3.Text=\"\"";
mostCurrent._unit3.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855940;
 //BA.debugLineNum = 50855940;BA.debugLine="unit4.Text=\"\"";
mostCurrent._unit4.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855941;
 //BA.debugLineNum = 50855941;BA.debugLine="unit5.Text=\"\"";
mostCurrent._unit5.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855942;
 //BA.debugLineNum = 50855942;BA.debugLine="unit6.Text=\"\"";
mostCurrent._unit6.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855943;
 //BA.debugLineNum = 50855943;BA.debugLine="unit7.Text=\"\"";
mostCurrent._unit7.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855944;
 //BA.debugLineNum = 50855944;BA.debugLine="unit8.Text=\"\"";
mostCurrent._unit8.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855946;
 //BA.debugLineNum = 50855946;BA.debugLine="grade1.Text=\"\"";
mostCurrent._grade1.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855947;
 //BA.debugLineNum = 50855947;BA.debugLine="grade2.Text=\"\"";
mostCurrent._grade2.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855948;
 //BA.debugLineNum = 50855948;BA.debugLine="grade3.Text=\"\"";
mostCurrent._grade3.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855949;
 //BA.debugLineNum = 50855949;BA.debugLine="grade4.Text=\"\"";
mostCurrent._grade4.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855950;
 //BA.debugLineNum = 50855950;BA.debugLine="grade5.Text=\"\"";
mostCurrent._grade5.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855951;
 //BA.debugLineNum = 50855951;BA.debugLine="grade6.Text=\"\"";
mostCurrent._grade6.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855952;
 //BA.debugLineNum = 50855952;BA.debugLine="grade7.Text=\"\"";
mostCurrent._grade7.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855953;
 //BA.debugLineNum = 50855953;BA.debugLine="grade8.Text=\"\"";
mostCurrent._grade8.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=50855954;
 //BA.debugLineNum = 50855954;BA.debugLine="End Sub";
return "";
}
public static String  _grade1_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grade1_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grade1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Private Sub grade1_TextChanged (Old As String, New";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="End Sub";
return "";
}
public static String  _grade2_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grade2_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grade2_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Private Sub grade2_TextChanged (Old As String, New";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="End Sub";
return "";
}
public static String  _grade3_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grade3_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grade3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Private Sub grade3_TextChanged (Old As String, New";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48168962;
 //BA.debugLineNum = 48168962;BA.debugLine="End Sub";
return "";
}
public static String  _grade4_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grade4_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grade4_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Private Sub grade4_TextChanged (Old As String, New";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="End Sub";
return "";
}
public static String  _grade5_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grade5_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grade5_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Private Sub grade5_TextChanged (Old As String, New";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="End Sub";
return "";
}
public static String  _grade6_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grade6_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grade6_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Private Sub grade6_TextChanged (Old As String, New";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="End Sub";
return "";
}
public static String  _grade7_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grade7_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grade7_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Private Sub grade7_TextChanged (Old As String, New";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="End Sub";
return "";
}
public static String  _grade8_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grade8_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grade8_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Private Sub grade8_TextChanged (Old As String, New";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="End Sub";
return "";
}
public static String  _unit1_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unit1_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unit1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Private Sub unit1_TextChanged (Old As String, New";
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="End Sub";
return "";
}
public static String  _unit2_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unit2_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unit2_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Private Sub unit2_TextChanged (Old As String, New";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="End Sub";
return "";
}
public static String  _unit3_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unit3_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unit3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Private Sub unit3_TextChanged (Old As String, New";
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="End Sub";
return "";
}
public static String  _unit4_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unit4_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unit4_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Private Sub unit4_TextChanged (Old As String, New";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="End Sub";
return "";
}
public static String  _unit5_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unit5_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unit5_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Private Sub unit5_TextChanged (Old As String, New";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="End Sub";
return "";
}
public static String  _unit6_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unit6_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unit6_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Private Sub unit6_TextChanged (Old As String, New";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="End Sub";
return "";
}
public static String  _unit7_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unit7_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unit7_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Private Sub unit7_TextChanged (Old As String, New";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="End Sub";
return "";
}
public static String  _unit8_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unit8_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unit8_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="Private Sub unit8_TextChanged (Old As String, New";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="CalculateSubtotals";
_calculatesubtotals();
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="End Sub";
return "";
}
}