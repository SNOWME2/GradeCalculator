package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(4);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
Debug.ShouldStop(16);
main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_addtab" /*RemoteObject*/ ,(Object)(main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_fonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe88a)))))),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 25)),(Object)(main._xui.getField(true,"Color_White")))),(Object)(RemoteObject.createImmutable("Home")));
 BA.debugLineNum = 38;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
Debug.ShouldStop(32);
main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_addtab" /*RemoteObject*/ ,(Object)(main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_fonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe5c3)))))),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 25)),(Object)(main._xui.getField(true,"Color_White")))),(Object)(RemoteObject.createImmutable("Calcu")));
 BA.debugLineNum = 39;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
Debug.ShouldStop(64);
main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_addtab" /*RemoteObject*/ ,(Object)(main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_fonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe88e)))))),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 25)),(Object)(main._xui.getField(true,"Color_White")))),(Object)(RemoteObject.createImmutable("About")));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asflowtabmenu1_tabclick(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ASFlowTabMenu1_TabClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("asflowtabmenu1_tabclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","asflowtabmenu1_tabclick", _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 64;BA.debugLine="Private Sub ASFlowTabMenu1_TabClick(index As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Select Case index";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(_index,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 67;BA.debugLine="HomePanel.SetLayoutAnimated(375, 0, HomePanel.t";
Debug.ShouldStop(4);
main.mostCurrent._homepanel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._homepanel.runMethod(true,"getTop")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getWidth")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 68;BA.debugLine="Panel1.SetLayoutAnimated(375, 100%x, HomePanel.";
Debug.ShouldStop(8);
main.mostCurrent._panel1.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent._homepanel.runMethod(true,"getTop")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getWidth")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 70;BA.debugLine="Panel2.SetLayoutAnimated(375, 200%x, HomePanel.";
Debug.ShouldStop(32);
main.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 200)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent._homepanel.runMethod(true,"getTop")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getWidth")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getHeight")));
 break; }
case 1: {
 BA.debugLineNum = 77;BA.debugLine="HomePanel.SetLayoutAnimated(375, -100%x, Panel1";
Debug.ShouldStop(4096);
main.mostCurrent._homepanel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(main.mostCurrent._panel1.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel1.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel1.runMethod(true,"getHeight")));
 BA.debugLineNum = 79;BA.debugLine="Panel1.SetLayoutAnimated(375, 0, Panel1.top, Pa";
Debug.ShouldStop(16384);
main.mostCurrent._panel1.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._panel1.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel1.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel1.runMethod(true,"getHeight")));
 BA.debugLineNum = 81;BA.debugLine="Panel2.SetLayoutAnimated(375, 100%x, Panel1.top";
Debug.ShouldStop(65536);
main.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent._panel1.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel1.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel1.runMethod(true,"getHeight")));
 break; }
case 2: {
 BA.debugLineNum = 85;BA.debugLine="Panel2.SetLayoutAnimated(375, 0, Panel2.top, Pa";
Debug.ShouldStop(1048576);
main.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel2.runMethod(true,"getHeight")));
 BA.debugLineNum = 86;BA.debugLine="HomePanel.SetLayoutAnimated(375, -200%x, Panel2";
Debug.ShouldStop(2097152);
main.mostCurrent._homepanel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 200)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(main.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel2.runMethod(true,"getHeight")));
 BA.debugLineNum = 88;BA.debugLine="Panel1.SetLayoutAnimated(375, -100%x, Panel2.to";
Debug.ShouldStop(8388608);
main.mostCurrent._panel1.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(main.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel2.runMethod(true,"getHeight")));
 break; }
}
;
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 55;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private HomePanel As Panel";
main.mostCurrent._homepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ASFlowTabMenu1 As ASFlowTabMenu";
main.mostCurrent._asflowtabmenu1 = RemoteObject.createNew ("b4a.example.asflowtabmenu");
 //BA.debugLineNum = 29;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Panel2 As Panel";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ScrollView1 As ScrollView";
main.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
asflowtabmenu.myClass = BA.getDeviceClass ("b4a.example.asflowtabmenu");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}