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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
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

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv1 = null;
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
public static float _vvvvvv5 = 0f;
public static float _vvvvvv7 = 0f;
public static float _vvvvvvv1 = 0f;
public static float _vvvvvvv3 = 0f;
public static float _vvvvvvv5 = 0f;
public static float _vvvvvvv7 = 0f;
public static float _vvvvvvvv1 = 0f;
public static float _vvvvvvvv3 = 0f;
public static float _vvvvvv4 = 0f;
public static float _vvvvvv6 = 0f;
public static float _vvvvvv0 = 0f;
public static float _vvvvvvv2 = 0f;
public static float _vvvvvvv4 = 0f;
public static float _vvvvvvv6 = 0f;
public static float _vvvvvvv0 = 0f;
public static float _vvvvvvvv2 = 0f;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _subtotal8 = null;
public static double _vvvvvv2 = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _clear = null;
public b4a.example.starter _vvvvv7 = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 71;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
 //BA.debugLineNum = 73;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
mostCurrent._asflowtabmenu1._v5 /*String*/ (mostCurrent._asflowtabmenu1._v0 /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe88a))),anywheresoftware.b4a.keywords.Common.True,(float) (25),_vvvvv1.Color_White),"Home");
 //BA.debugLineNum = 74;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
mostCurrent._asflowtabmenu1._v5 /*String*/ (mostCurrent._asflowtabmenu1._v0 /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe5c3))),anywheresoftware.b4a.keywords.Common.True,(float) (25),_vvvvv1.Color_White),"Calcu");
 //BA.debugLineNum = 75;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
mostCurrent._asflowtabmenu1._v5 /*String*/ (mostCurrent._asflowtabmenu1._v0 /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe88e))),anywheresoftware.b4a.keywords.Common.True,(float) (25),_vvvvv1.Color_White),"About");
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 81;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public static String  _asflowtabmenu1_tabclick(int _index) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Private Sub ASFlowTabMenu1_TabClick(index As Int)";
 //BA.debugLineNum = 91;BA.debugLine="Select Case index";
switch (_index) {
case 0: {
 //BA.debugLineNum = 93;BA.debugLine="HomePanel.SetLayoutAnimated(375, 0, HomePanel.t";
mostCurrent._homepanel.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._homepanel.getTop(),mostCurrent._homepanel.getWidth(),mostCurrent._homepanel.getHeight());
 //BA.debugLineNum = 94;BA.debugLine="Panel1.SetLayoutAnimated(375, 100%x, HomePanel.";
mostCurrent._panel1.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._homepanel.getTop(),mostCurrent._homepanel.getWidth(),mostCurrent._homepanel.getHeight());
 //BA.debugLineNum = 96;BA.debugLine="Panel2.SetLayoutAnimated(375, 200%x, HomePanel.";
mostCurrent._panel2.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (200),mostCurrent.activityBA),mostCurrent._homepanel.getTop(),mostCurrent._homepanel.getWidth(),mostCurrent._homepanel.getHeight());
 break; }
case 1: {
 //BA.debugLineNum = 99;BA.debugLine="HomePanel.SetLayoutAnimated(375, -100%x, Panel1";
mostCurrent._homepanel.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)),mostCurrent._panel1.getTop(),mostCurrent._panel1.getWidth(),mostCurrent._panel1.getHeight());
 //BA.debugLineNum = 101;BA.debugLine="Panel1.SetLayoutAnimated(375, 0, Panel1.top, Pa";
mostCurrent._panel1.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._panel1.getTop(),mostCurrent._panel1.getWidth(),mostCurrent._panel1.getHeight());
 //BA.debugLineNum = 103;BA.debugLine="Panel2.SetLayoutAnimated(375, 100%x, Panel1.top";
mostCurrent._panel2.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._panel1.getTop(),mostCurrent._panel1.getWidth(),mostCurrent._panel1.getHeight());
 //BA.debugLineNum = 104;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 break; }
case 2: {
 //BA.debugLineNum = 108;BA.debugLine="Panel2.SetLayoutAnimated(375, 0, Panel2.top, Pa";
mostCurrent._panel2.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._panel2.getHeight());
 //BA.debugLineNum = 109;BA.debugLine="HomePanel.SetLayoutAnimated(375, -200%x, Panel2";
mostCurrent._homepanel.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (200),mostCurrent.activityBA)),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._panel2.getHeight());
 //BA.debugLineNum = 111;BA.debugLine="Panel1.SetLayoutAnimated(375, -100%x, Panel2.to";
mostCurrent._panel1.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._panel2.getHeight());
 break; }
}
;
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv1(double _totalsub,double _totalunits) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub CalculateGWA(totalSub As Double, totalUnits As";
 //BA.debugLineNum = 240;BA.debugLine="If totalUnits > 0 Then";
if (_totalunits>0) { 
 //BA.debugLineNum = 242;BA.debugLine="GWA.Text = (totalSub / totalUnits)";
mostCurrent._gwa.setText(BA.ObjectToCharSequence((_totalsub/(double)_totalunits)));
 }else {
 //BA.debugLineNum = 245;BA.debugLine="GWA.Text = \"0\"";
mostCurrent._gwa.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv0() throws Exception{
double _totalunits = 0;
 //BA.debugLineNum = 117;BA.debugLine="Sub CalculateSubtotals";
 //BA.debugLineNum = 118;BA.debugLine="totalSubtotal = 0";
_vvvvvv2 = 0;
 //BA.debugLineNum = 119;BA.debugLine="Dim totalUnits As Double = 0";
_totalunits = 0;
 //BA.debugLineNum = 121;BA.debugLine="If grade1.Text <> \"\" And unit1.Text <> \"\" Then";
if ((mostCurrent._grade1.getText()).equals("") == false && (mostCurrent._unit1.getText()).equals("") == false) { 
 //BA.debugLineNum = 123;BA.debugLine="If grade1.Text=\".\" Or grade1.Text=\"-\" Or unit1.T";
if ((mostCurrent._grade1.getText()).equals(".") || (mostCurrent._grade1.getText()).equals("-") || (mostCurrent._unit1.getText()).equals(".") || (mostCurrent._unit1.getText()).equals("-")) { 
 //BA.debugLineNum = 124;BA.debugLine="subtotal1.Text = GetMissingValue(grade1,unit1)";
mostCurrent._subtotal1.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade1,mostCurrent._unit1)));
 }else {
 //BA.debugLineNum = 126;BA.debugLine="g1 = grade1.Text";
_vvvvvv4 = (float)(Double.parseDouble(mostCurrent._grade1.getText()));
 //BA.debugLineNum = 127;BA.debugLine="u1 = unit1.Text";
_vvvvvv5 = (float)(Double.parseDouble(mostCurrent._unit1.getText()));
 //BA.debugLineNum = 128;BA.debugLine="subtotal1.Text = g1 * u1";
mostCurrent._subtotal1.setText(BA.ObjectToCharSequence(_vvvvvv4*_vvvvvv5));
 //BA.debugLineNum = 129;BA.debugLine="totalSubtotal = totalSubtotal + g1 * u1";
_vvvvvv2 = _vvvvvv2+_vvvvvv4*_vvvvvv5;
 //BA.debugLineNum = 130;BA.debugLine="totalUnits = totalUnits + u1";
_totalunits = _totalunits+_vvvvvv5;
 };
 }else {
 //BA.debugLineNum = 133;BA.debugLine="subtotal1.Text =  GetMissingValue(grade1, unit1)";
mostCurrent._subtotal1.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade1,mostCurrent._unit1)));
 };
 //BA.debugLineNum = 136;BA.debugLine="If grade2.Text <> \"\" And unit2.Text <> \"\" Then";
if ((mostCurrent._grade2.getText()).equals("") == false && (mostCurrent._unit2.getText()).equals("") == false) { 
 //BA.debugLineNum = 138;BA.debugLine="If grade2.Text=\".\" Or grade2.Text=\"-\" Or unit2.T";
if ((mostCurrent._grade2.getText()).equals(".") || (mostCurrent._grade2.getText()).equals("-") || (mostCurrent._unit2.getText()).equals(".") || (mostCurrent._unit2.getText()).equals("-")) { 
 //BA.debugLineNum = 139;BA.debugLine="subtotal2.Text = GetMissingValue(grade2,unit2)";
mostCurrent._subtotal2.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade2,mostCurrent._unit2)));
 }else {
 //BA.debugLineNum = 141;BA.debugLine="g2 = grade2.Text";
_vvvvvv6 = (float)(Double.parseDouble(mostCurrent._grade2.getText()));
 //BA.debugLineNum = 142;BA.debugLine="u2 = unit2.Text";
_vvvvvv7 = (float)(Double.parseDouble(mostCurrent._unit2.getText()));
 //BA.debugLineNum = 143;BA.debugLine="subtotal2.Text = g2 * u2";
mostCurrent._subtotal2.setText(BA.ObjectToCharSequence(_vvvvvv6*_vvvvvv7));
 //BA.debugLineNum = 144;BA.debugLine="totalSubtotal = totalSubtotal + g2 * u2";
_vvvvvv2 = _vvvvvv2+_vvvvvv6*_vvvvvv7;
 //BA.debugLineNum = 145;BA.debugLine="totalUnits = totalUnits + u2";
_totalunits = _totalunits+_vvvvvv7;
 };
 }else {
 //BA.debugLineNum = 148;BA.debugLine="subtotal2.Text =  GetMissingValue(grade2, unit2)";
mostCurrent._subtotal2.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade2,mostCurrent._unit2)));
 };
 //BA.debugLineNum = 151;BA.debugLine="If grade3.Text <> \"\" And unit3.Text <> \"\" Then";
if ((mostCurrent._grade3.getText()).equals("") == false && (mostCurrent._unit3.getText()).equals("") == false) { 
 //BA.debugLineNum = 152;BA.debugLine="If grade3.Text=\".\" Or grade3.Text=\"-\" Or unit3.T";
if ((mostCurrent._grade3.getText()).equals(".") || (mostCurrent._grade3.getText()).equals("-") || (mostCurrent._unit3.getText()).equals(".") || (mostCurrent._unit3.getText()).equals("-")) { 
 //BA.debugLineNum = 153;BA.debugLine="subtotal3.Text = GetMissingValue(grade3,unit3)";
mostCurrent._subtotal3.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade3,mostCurrent._unit3)));
 }else {
 //BA.debugLineNum = 155;BA.debugLine="g3 = grade3.Text";
_vvvvvv0 = (float)(Double.parseDouble(mostCurrent._grade3.getText()));
 //BA.debugLineNum = 156;BA.debugLine="u3 = unit3.Text";
_vvvvvvv1 = (float)(Double.parseDouble(mostCurrent._unit3.getText()));
 //BA.debugLineNum = 157;BA.debugLine="subtotal3.Text = g3 * u3";
mostCurrent._subtotal3.setText(BA.ObjectToCharSequence(_vvvvvv0*_vvvvvvv1));
 //BA.debugLineNum = 158;BA.debugLine="totalSubtotal = totalSubtotal + g3 * u3";
_vvvvvv2 = _vvvvvv2+_vvvvvv0*_vvvvvvv1;
 //BA.debugLineNum = 159;BA.debugLine="totalUnits = totalUnits + u3";
_totalunits = _totalunits+_vvvvvvv1;
 };
 }else {
 //BA.debugLineNum = 162;BA.debugLine="subtotal3.Text =  GetMissingValue(grade3, unit3)";
mostCurrent._subtotal3.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade3,mostCurrent._unit3)));
 };
 //BA.debugLineNum = 165;BA.debugLine="If grade4.Text <> \"\" And unit4.Text <> \"\" Then";
if ((mostCurrent._grade4.getText()).equals("") == false && (mostCurrent._unit4.getText()).equals("") == false) { 
 //BA.debugLineNum = 166;BA.debugLine="If grade4.Text=\".\" Or grade4.Text=\"-\" Or unit4.T";
if ((mostCurrent._grade4.getText()).equals(".") || (mostCurrent._grade4.getText()).equals("-") || (mostCurrent._unit4.getText()).equals(".") || (mostCurrent._unit4.getText()).equals("-")) { 
 //BA.debugLineNum = 167;BA.debugLine="subtotal4.Text = GetMissingValue(grade4,unit4)";
mostCurrent._subtotal4.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade4,mostCurrent._unit4)));
 }else {
 //BA.debugLineNum = 169;BA.debugLine="g4 = grade4.Text";
_vvvvvvv2 = (float)(Double.parseDouble(mostCurrent._grade4.getText()));
 //BA.debugLineNum = 170;BA.debugLine="u4 = unit4.Text";
_vvvvvvv3 = (float)(Double.parseDouble(mostCurrent._unit4.getText()));
 //BA.debugLineNum = 171;BA.debugLine="subtotal4.Text = g4 * u4";
mostCurrent._subtotal4.setText(BA.ObjectToCharSequence(_vvvvvvv2*_vvvvvvv3));
 //BA.debugLineNum = 172;BA.debugLine="totalSubtotal = totalSubtotal + g4 * u4";
_vvvvvv2 = _vvvvvv2+_vvvvvvv2*_vvvvvvv3;
 //BA.debugLineNum = 173;BA.debugLine="totalUnits = totalUnits + u4";
_totalunits = _totalunits+_vvvvvvv3;
 };
 }else {
 //BA.debugLineNum = 176;BA.debugLine="subtotal4.Text = GetMissingValue(grade4, unit4)";
mostCurrent._subtotal4.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade4,mostCurrent._unit4)));
 };
 //BA.debugLineNum = 179;BA.debugLine="If grade5.Text <> \"\" And unit5.Text <> \"\" Then";
if ((mostCurrent._grade5.getText()).equals("") == false && (mostCurrent._unit5.getText()).equals("") == false) { 
 //BA.debugLineNum = 180;BA.debugLine="If grade5.Text=\".\" Or grade5.Text=\"-\" Or unit5.T";
if ((mostCurrent._grade5.getText()).equals(".") || (mostCurrent._grade5.getText()).equals("-") || (mostCurrent._unit5.getText()).equals(".") || (mostCurrent._unit5.getText()).equals("-")) { 
 //BA.debugLineNum = 181;BA.debugLine="subtotal5.Text = GetMissingValue(grade5,unit5)";
mostCurrent._subtotal5.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade5,mostCurrent._unit5)));
 }else {
 //BA.debugLineNum = 183;BA.debugLine="g5 = grade5.Text";
_vvvvvvv4 = (float)(Double.parseDouble(mostCurrent._grade5.getText()));
 //BA.debugLineNum = 184;BA.debugLine="u5 = unit5.Text";
_vvvvvvv5 = (float)(Double.parseDouble(mostCurrent._unit5.getText()));
 //BA.debugLineNum = 185;BA.debugLine="subtotal5.Text = g5 * u5";
mostCurrent._subtotal5.setText(BA.ObjectToCharSequence(_vvvvvvv4*_vvvvvvv5));
 //BA.debugLineNum = 186;BA.debugLine="totalSubtotal = totalSubtotal + g5 * u5";
_vvvvvv2 = _vvvvvv2+_vvvvvvv4*_vvvvvvv5;
 //BA.debugLineNum = 187;BA.debugLine="totalUnits = totalUnits + u5";
_totalunits = _totalunits+_vvvvvvv5;
 };
 }else {
 //BA.debugLineNum = 190;BA.debugLine="subtotal5.Text = GetMissingValue(grade5, unit5)";
mostCurrent._subtotal5.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade5,mostCurrent._unit5)));
 };
 //BA.debugLineNum = 193;BA.debugLine="If grade6.Text <> \"\" And unit6.Text <> \"\" Then";
if ((mostCurrent._grade6.getText()).equals("") == false && (mostCurrent._unit6.getText()).equals("") == false) { 
 //BA.debugLineNum = 194;BA.debugLine="If grade6.Text=\".\" Or grade6.Text=\"-\" Or unit6.T";
if ((mostCurrent._grade6.getText()).equals(".") || (mostCurrent._grade6.getText()).equals("-") || (mostCurrent._unit6.getText()).equals(".") || (mostCurrent._unit6.getText()).equals("-")) { 
 //BA.debugLineNum = 195;BA.debugLine="subtotal6.Text = GetMissingValue(grade6,unit6)";
mostCurrent._subtotal6.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade6,mostCurrent._unit6)));
 }else {
 //BA.debugLineNum = 197;BA.debugLine="g6 = grade6.Text";
_vvvvvvv6 = (float)(Double.parseDouble(mostCurrent._grade6.getText()));
 //BA.debugLineNum = 198;BA.debugLine="u6 = unit6.Text";
_vvvvvvv7 = (float)(Double.parseDouble(mostCurrent._unit6.getText()));
 //BA.debugLineNum = 199;BA.debugLine="subtotal6.Text = g6 * u6";
mostCurrent._subtotal6.setText(BA.ObjectToCharSequence(_vvvvvvv6*_vvvvvvv7));
 //BA.debugLineNum = 200;BA.debugLine="totalSubtotal = totalSubtotal + g6 * u6";
_vvvvvv2 = _vvvvvv2+_vvvvvvv6*_vvvvvvv7;
 //BA.debugLineNum = 201;BA.debugLine="totalUnits = totalUnits + u6";
_totalunits = _totalunits+_vvvvvvv7;
 };
 }else {
 //BA.debugLineNum = 204;BA.debugLine="subtotal6.Text = GetMissingValue(grade6, unit6)";
mostCurrent._subtotal6.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade6,mostCurrent._unit6)));
 };
 //BA.debugLineNum = 207;BA.debugLine="If grade7.Text <> \"\" And unit7.Text <> \"\" Then";
if ((mostCurrent._grade7.getText()).equals("") == false && (mostCurrent._unit7.getText()).equals("") == false) { 
 //BA.debugLineNum = 208;BA.debugLine="If grade7.Text=\".\" Or grade7.Text=\"-\" Or unit7.T";
if ((mostCurrent._grade7.getText()).equals(".") || (mostCurrent._grade7.getText()).equals("-") || (mostCurrent._unit7.getText()).equals(".") || (mostCurrent._unit7.getText()).equals("-")) { 
 //BA.debugLineNum = 209;BA.debugLine="subtotal7.Text = GetMissingValue(grade7,unit7)";
mostCurrent._subtotal7.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade7,mostCurrent._unit7)));
 }else {
 //BA.debugLineNum = 211;BA.debugLine="g7 = grade7.Text";
_vvvvvvv0 = (float)(Double.parseDouble(mostCurrent._grade7.getText()));
 //BA.debugLineNum = 212;BA.debugLine="u7 = unit7.Text";
_vvvvvvvv1 = (float)(Double.parseDouble(mostCurrent._unit7.getText()));
 //BA.debugLineNum = 213;BA.debugLine="subtotal7.Text = g7 * u7";
mostCurrent._subtotal7.setText(BA.ObjectToCharSequence(_vvvvvvv0*_vvvvvvvv1));
 //BA.debugLineNum = 214;BA.debugLine="totalSubtotal = totalSubtotal + g7 * u7";
_vvvvvv2 = _vvvvvv2+_vvvvvvv0*_vvvvvvvv1;
 //BA.debugLineNum = 215;BA.debugLine="totalUnits = totalUnits + u7";
_totalunits = _totalunits+_vvvvvvvv1;
 };
 }else {
 //BA.debugLineNum = 218;BA.debugLine="subtotal7.Text = GetMissingValue(grade7, unit7)";
mostCurrent._subtotal7.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade7,mostCurrent._unit7)));
 };
 //BA.debugLineNum = 221;BA.debugLine="If grade8.Text <> \"\" And unit8.Text <> \"\" Then";
if ((mostCurrent._grade8.getText()).equals("") == false && (mostCurrent._unit8.getText()).equals("") == false) { 
 //BA.debugLineNum = 222;BA.debugLine="If grade8.Text=\".\" Or grade8.Text=\"-\" Or unit8.T";
if ((mostCurrent._grade8.getText()).equals(".") || (mostCurrent._grade8.getText()).equals("-") || (mostCurrent._unit8.getText()).equals(".") || (mostCurrent._unit8.getText()).equals("-")) { 
 //BA.debugLineNum = 223;BA.debugLine="subtotal8.Text = GetMissingValue(grade8,unit8)";
mostCurrent._subtotal8.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade8,mostCurrent._unit8)));
 }else {
 //BA.debugLineNum = 225;BA.debugLine="g8 = grade8.Text";
_vvvvvvvv2 = (float)(Double.parseDouble(mostCurrent._grade8.getText()));
 //BA.debugLineNum = 226;BA.debugLine="u8 = unit8.Text";
_vvvvvvvv3 = (float)(Double.parseDouble(mostCurrent._unit8.getText()));
 //BA.debugLineNum = 227;BA.debugLine="subtotal8.Text = g8 * u8";
mostCurrent._subtotal8.setText(BA.ObjectToCharSequence(_vvvvvvvv2*_vvvvvvvv3));
 //BA.debugLineNum = 228;BA.debugLine="totalSubtotal = totalSubtotal + g8 * u8";
_vvvvvv2 = _vvvvvv2+_vvvvvvvv2*_vvvvvvvv3;
 //BA.debugLineNum = 229;BA.debugLine="totalUnits = totalUnits + u8";
_totalunits = _totalunits+_vvvvvvvv3;
 };
 }else {
 //BA.debugLineNum = 232;BA.debugLine="subtotal8.Text = GetMissingValue(grade8, unit8)";
mostCurrent._subtotal8.setText(BA.ObjectToCharSequence(_vvvvvv3(mostCurrent._grade8,mostCurrent._unit8)));
 };
 //BA.debugLineNum = 235;BA.debugLine="CalculateGWA(totalSubtotal, totalUnits)";
_vvvvvv1(_vvvvvv2,_totalunits);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public static String  _clear_click() throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Private Sub clear_Click";
 //BA.debugLineNum = 324;BA.debugLine="unit1.Text=\"\"";
mostCurrent._unit1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 325;BA.debugLine="unit2.Text=\"\"";
mostCurrent._unit2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 326;BA.debugLine="unit3.Text=\"\"";
mostCurrent._unit3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 327;BA.debugLine="unit4.Text=\"\"";
mostCurrent._unit4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 328;BA.debugLine="unit5.Text=\"\"";
mostCurrent._unit5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 329;BA.debugLine="unit6.Text=\"\"";
mostCurrent._unit6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 330;BA.debugLine="unit7.Text=\"\"";
mostCurrent._unit7.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 331;BA.debugLine="unit8.Text=\"\"";
mostCurrent._unit8.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 333;BA.debugLine="grade1.Text=\"\"";
mostCurrent._grade1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 334;BA.debugLine="grade2.Text=\"\"";
mostCurrent._grade2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 335;BA.debugLine="grade3.Text=\"\"";
mostCurrent._grade3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 336;BA.debugLine="grade4.Text=\"\"";
mostCurrent._grade4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 337;BA.debugLine="grade5.Text=\"\"";
mostCurrent._grade5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 338;BA.debugLine="grade6.Text=\"\"";
mostCurrent._grade6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 339;BA.debugLine="grade7.Text=\"\"";
mostCurrent._grade7.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 340;BA.debugLine="grade8.Text=\"\"";
mostCurrent._grade8.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 342;BA.debugLine="ToastMessageShow(\"Textfields are Cleared\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Textfields are Cleared"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv3(anywheresoftware.b4a.objects.EditTextWrapper _grade,anywheresoftware.b4a.objects.EditTextWrapper _unit) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Private Sub GetMissingValue(grade As EditText, uni";
 //BA.debugLineNum = 251;BA.debugLine="If grade.Text = \"\" Then";
if ((_grade.getText()).equals("")) { 
 //BA.debugLineNum = 252;BA.debugLine="Return unit.text";
if (true) return _unit.getText();
 }else {
 //BA.debugLineNum = 254;BA.debugLine="Return grade.text";
if (true) return _grade.getText();
 };
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private HomePanel As Panel";
mostCurrent._homepanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private ASFlowTabMenu1 As ASFlowTabMenu";
mostCurrent._asflowtabmenu1 = new b4a.example.asflowtabmenu();
 //BA.debugLineNum = 30;BA.debugLine="Private Panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Panel2 As Panel";
mostCurrent._panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private grade1 As EditText";
mostCurrent._grade1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private grade2 As EditText";
mostCurrent._grade2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private grade3 As EditText";
mostCurrent._grade3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private grade4 As EditText";
mostCurrent._grade4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private grade5 As EditText";
mostCurrent._grade5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private grade6 As EditText";
mostCurrent._grade6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private grade7 As EditText";
mostCurrent._grade7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private grade8 As EditText";
mostCurrent._grade8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private unit1 As EditText";
mostCurrent._unit1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private unit2 As EditText";
mostCurrent._unit2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private unit3 As EditText";
mostCurrent._unit3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private unit4 As EditText";
mostCurrent._unit4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private unit6 As EditText";
mostCurrent._unit6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private unit7 As EditText";
mostCurrent._unit7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private unit8 As EditText";
mostCurrent._unit8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private unit5 As EditText";
mostCurrent._unit5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private GWA As Label";
mostCurrent._gwa = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private u1,u2,u3,u4,u5,u6,u7,u8 As Float";
_vvvvvv5 = 0f;
_vvvvvv7 = 0f;
_vvvvvvv1 = 0f;
_vvvvvvv3 = 0f;
_vvvvvvv5 = 0f;
_vvvvvvv7 = 0f;
_vvvvvvvv1 = 0f;
_vvvvvvvv3 = 0f;
 //BA.debugLineNum = 54;BA.debugLine="Private g1,g2,g3,g4,g5,g6,g7,g8 As Float";
_vvvvvv4 = 0f;
_vvvvvv6 = 0f;
_vvvvvv0 = 0f;
_vvvvvvv2 = 0f;
_vvvvvvv4 = 0f;
_vvvvvvv6 = 0f;
_vvvvvvv0 = 0f;
_vvvvvvvv2 = 0f;
 //BA.debugLineNum = 56;BA.debugLine="Private subtotal1 As Label";
mostCurrent._subtotal1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private subtotal2 As Label";
mostCurrent._subtotal2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private subtotal3 As Label";
mostCurrent._subtotal3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private subtotal4 As Label";
mostCurrent._subtotal4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private subtotal5 As Label";
mostCurrent._subtotal5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private subtotal6 As Label";
mostCurrent._subtotal6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private subtotal7 As Label";
mostCurrent._subtotal7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private subtotal8 As Label";
mostCurrent._subtotal8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Private totalSubtotal As Double = 0";
_vvvvvv2 = 0;
 //BA.debugLineNum = 67;BA.debugLine="Private clear As Button";
mostCurrent._clear = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _grade1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Private Sub grade1_TextChanged (Old As String, New";
 //BA.debugLineNum = 263;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return "";
}
public static String  _grade2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Private Sub grade2_TextChanged (Old As String, New";
 //BA.debugLineNum = 271;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public static String  _grade3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Private Sub grade3_TextChanged (Old As String, New";
 //BA.debugLineNum = 279;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public static String  _grade4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Private Sub grade4_TextChanged (Old As String, New";
 //BA.debugLineNum = 287;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return "";
}
public static String  _grade5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Private Sub grade5_TextChanged (Old As String, New";
 //BA.debugLineNum = 295;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public static String  _grade6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Private Sub grade6_TextChanged (Old As String, New";
 //BA.debugLineNum = 303;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public static String  _grade7_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Private Sub grade7_TextChanged (Old As String, New";
 //BA.debugLineNum = 311;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public static String  _grade8_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Private Sub grade8_TextChanged (Old As String, New";
 //BA.debugLineNum = 319;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
starter._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}

private static byte[][] bb;

public static String vvv13(final byte[] _b, final int i) throws Exception {
Runnable r = new Runnable() {
{

int value = i / 8 + 588973;
if (bb == null) {
		
                bb = new byte[4][];
				bb[0] = BA.packageName.getBytes("UTF8");
                bb[1] = BA.applicationContext.getPackageManager().getPackageInfo(BA.packageName, 0).versionName.getBytes("UTF8");
                if (bb[1].length == 0)
                    bb[1] = "jsdkfh".getBytes("UTF8");
                bb[2] = new byte[] { (byte)BA.applicationContext.getPackageManager().getPackageInfo(BA.packageName, 0).versionCode };			
        }
        bb[3] = new byte[] {
                    (byte) (value >>> 24),
						(byte) (value >>> 16),
						(byte) (value >>> 8),
						(byte) value};
				try {
					for (int __b = 0;__b < (3 + 1);__b ++) {
						for (int b = 0;b<_b.length;b++) {
							_b[b] ^= bb[__b][b % bb[__b].length];
						}
					}

				} catch (Exception e) {
					throw new RuntimeException(e);
				}
                

            
}
public void run() {
}
};
return new String(_b, "UTF8");
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
_vvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _unit1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Private Sub unit1_TextChanged (Old As String, New";
 //BA.debugLineNum = 259;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public static String  _unit2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Private Sub unit2_TextChanged (Old As String, New";
 //BA.debugLineNum = 267;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return "";
}
public static String  _unit3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Private Sub unit3_TextChanged (Old As String, New";
 //BA.debugLineNum = 275;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return "";
}
public static String  _unit4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Private Sub unit4_TextChanged (Old As String, New";
 //BA.debugLineNum = 283;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public static String  _unit5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Private Sub unit5_TextChanged (Old As String, New";
 //BA.debugLineNum = 291;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return "";
}
public static String  _unit6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Private Sub unit6_TextChanged (Old As String, New";
 //BA.debugLineNum = 299;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return "";
}
public static String  _unit7_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Private Sub unit7_TextChanged (Old As String, New";
 //BA.debugLineNum = 307;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public static String  _unit8_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Private Sub unit8_TextChanged (Old As String, New";
 //BA.debugLineNum = 315;BA.debugLine="CalculateSubtotals";
_vvvvv0();
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return "";
}
}
