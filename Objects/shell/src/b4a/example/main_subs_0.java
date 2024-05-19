package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(64);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
Debug.ShouldStop(256);
main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_addtab" /*RemoteObject*/ ,(Object)(main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_fonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe88a)))))),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 25)),(Object)(main._xui.getField(true,"Color_White")))),(Object)(RemoteObject.createImmutable("Home")));
 BA.debugLineNum = 74;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
Debug.ShouldStop(512);
main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_addtab" /*RemoteObject*/ ,(Object)(main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_fonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe5c3)))))),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 25)),(Object)(main._xui.getField(true,"Color_White")))),(Object)(RemoteObject.createImmutable("Calcu")));
 BA.debugLineNum = 75;BA.debugLine="ASFlowTabMenu1.AddTab(ASFlowTabMenu1.FontToBitmap";
Debug.ShouldStop(1024);
main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_addtab" /*RemoteObject*/ ,(Object)(main.mostCurrent._asflowtabmenu1.runClassMethod (b4a.example.asflowtabmenu.class, "_fonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe88e)))))),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 25)),(Object)(main._xui.getField(true,"Color_White")))),(Object)(RemoteObject.createImmutable("About")));
 BA.debugLineNum = 76;BA.debugLine="voice.Initialize(\"TTS\")";
Debug.ShouldStop(2048);
main.mostCurrent._voice.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("TTS")));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,84);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 84;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,80);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(65536);
_calculatesubtotals();
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ASFlowTabMenu1_TabClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,90);
if (RapidSub.canDelegate("asflowtabmenu1_tabclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","asflowtabmenu1_tabclick", _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 90;BA.debugLine="Private Sub ASFlowTabMenu1_TabClick(index As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Select Case index";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(_index,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 93;BA.debugLine="HomePanel.SetLayoutAnimated(375, 0, HomePanel.t";
Debug.ShouldStop(268435456);
main.mostCurrent._homepanel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._homepanel.runMethod(true,"getTop")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getWidth")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 94;BA.debugLine="Panel1.SetLayoutAnimated(375, 100%x, HomePanel.";
Debug.ShouldStop(536870912);
main.mostCurrent._panel1.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent._homepanel.runMethod(true,"getTop")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getWidth")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 96;BA.debugLine="Panel2.SetLayoutAnimated(375, 200%x, HomePanel.";
Debug.ShouldStop(-2147483648);
main.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 200)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent._homepanel.runMethod(true,"getTop")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getWidth")),(Object)(main.mostCurrent._homepanel.runMethod(true,"getHeight")));
 break; }
case 1: {
 BA.debugLineNum = 99;BA.debugLine="HomePanel.SetLayoutAnimated(375, -100%x, Panel1";
Debug.ShouldStop(4);
main.mostCurrent._homepanel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(main.mostCurrent._panel1.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel1.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel1.runMethod(true,"getHeight")));
 BA.debugLineNum = 101;BA.debugLine="Panel1.SetLayoutAnimated(375, 0, Panel1.top, Pa";
Debug.ShouldStop(16);
main.mostCurrent._panel1.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._panel1.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel1.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel1.runMethod(true,"getHeight")));
 BA.debugLineNum = 103;BA.debugLine="Panel2.SetLayoutAnimated(375, 100%x, Panel1.top";
Debug.ShouldStop(64);
main.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent._panel1.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel1.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel1.runMethod(true,"getHeight")));
 BA.debugLineNum = 104;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(128);
_calculatesubtotals();
 break; }
case 2: {
 BA.debugLineNum = 108;BA.debugLine="Panel2.SetLayoutAnimated(375, 0, Panel2.top, Pa";
Debug.ShouldStop(2048);
main.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel2.runMethod(true,"getHeight")));
 BA.debugLineNum = 109;BA.debugLine="HomePanel.SetLayoutAnimated(375, -200%x, Panel2";
Debug.ShouldStop(4096);
main.mostCurrent._homepanel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 200)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(main.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel2.runMethod(true,"getHeight")));
 BA.debugLineNum = 111;BA.debugLine="Panel1.SetLayoutAnimated(375, -100%x, Panel2.to";
Debug.ShouldStop(16384);
main.mostCurrent._panel1.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(main.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(main.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panel2.runMethod(true,"getHeight")));
 break; }
}
;
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calculategwa(RemoteObject _totalsub,RemoteObject _totalunits) throws Exception{
try {
		Debug.PushSubsStack("CalculateGWA (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,204);
if (RapidSub.canDelegate("calculategwa")) { return b4a.example.main.remoteMe.runUserSub(false, "main","calculategwa", _totalsub, _totalunits);}
Debug.locals.put("totalSub", _totalsub);
Debug.locals.put("totalUnits", _totalunits);
 BA.debugLineNum = 204;BA.debugLine="Sub CalculateGWA(totalSub As Double, totalUnits As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="If totalUnits > 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_totalunits,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 207;BA.debugLine="GWA.Text = (totalSub / totalUnits)";
Debug.ShouldStop(16384);
main.mostCurrent._gwa.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.solve(new RemoteObject[] {_totalsub,_totalunits}, "/",0, 0))));
 }else {
 BA.debugLineNum = 210;BA.debugLine="GWA.Text = \"0\"";
Debug.ShouldStop(131072);
main.mostCurrent._gwa.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calculatesubtotals() throws Exception{
try {
		Debug.PushSubsStack("CalculateSubtotals (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,117);
if (RapidSub.canDelegate("calculatesubtotals")) { return b4a.example.main.remoteMe.runUserSub(false, "main","calculatesubtotals");}
RemoteObject _totalunits = RemoteObject.createImmutable(0);
 BA.debugLineNum = 117;BA.debugLine="Sub CalculateSubtotals";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="totalSubtotal = 0";
Debug.ShouldStop(2097152);
main._totalsubtotal = BA.numberCast(double.class, 0);
 BA.debugLineNum = 119;BA.debugLine="Dim totalUnits As Double = 0";
Debug.ShouldStop(4194304);
_totalunits = BA.numberCast(double.class, 0);Debug.locals.put("totalUnits", _totalunits);Debug.locals.put("totalUnits", _totalunits);
 BA.debugLineNum = 121;BA.debugLine="If grade1.Text <> \"\" And unit1.Text <> \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",main.mostCurrent._grade1.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._unit1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 122;BA.debugLine="g1 = grade1.Text";
Debug.ShouldStop(33554432);
main._g1 = BA.numberCast(float.class, main.mostCurrent._grade1.runMethod(true,"getText"));
 BA.debugLineNum = 123;BA.debugLine="u1 = unit1.Text";
Debug.ShouldStop(67108864);
main._u1 = BA.numberCast(float.class, main.mostCurrent._unit1.runMethod(true,"getText"));
 BA.debugLineNum = 124;BA.debugLine="subtotal1.Text = g1 * u1";
Debug.ShouldStop(134217728);
main.mostCurrent._subtotal1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._g1,main._u1}, "*",0, 0)));
 BA.debugLineNum = 125;BA.debugLine="totalSubtotal = totalSubtotal + g1 * u1";
Debug.ShouldStop(268435456);
main._totalsubtotal = RemoteObject.solve(new RemoteObject[] {main._totalsubtotal,main._g1,main._u1}, "+*",1, 0);
 BA.debugLineNum = 126;BA.debugLine="totalUnits = totalUnits + u1";
Debug.ShouldStop(536870912);
_totalunits = RemoteObject.solve(new RemoteObject[] {_totalunits,main._u1}, "+",1, 0);Debug.locals.put("totalUnits", _totalunits);
 }else {
 BA.debugLineNum = 128;BA.debugLine="subtotal1.Text =  GetMissingValue(grade1, unit1)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._subtotal1.runMethod(true,"setText",BA.ObjectToCharSequence(_getmissingvalue(main.mostCurrent._grade1,main.mostCurrent._unit1)));
 };
 BA.debugLineNum = 131;BA.debugLine="If grade2.Text <> \"\" And unit2.Text <> \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",main.mostCurrent._grade2.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._unit2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 132;BA.debugLine="g2 = grade2.Text";
Debug.ShouldStop(8);
main._g2 = BA.numberCast(float.class, main.mostCurrent._grade2.runMethod(true,"getText"));
 BA.debugLineNum = 133;BA.debugLine="u2 = unit2.Text";
Debug.ShouldStop(16);
main._u2 = BA.numberCast(float.class, main.mostCurrent._unit2.runMethod(true,"getText"));
 BA.debugLineNum = 134;BA.debugLine="subtotal2.Text = g2 * u2";
Debug.ShouldStop(32);
main.mostCurrent._subtotal2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._g2,main._u2}, "*",0, 0)));
 BA.debugLineNum = 135;BA.debugLine="totalSubtotal = totalSubtotal + g2 * u2";
Debug.ShouldStop(64);
main._totalsubtotal = RemoteObject.solve(new RemoteObject[] {main._totalsubtotal,main._g2,main._u2}, "+*",1, 0);
 BA.debugLineNum = 136;BA.debugLine="totalUnits = totalUnits + u2";
Debug.ShouldStop(128);
_totalunits = RemoteObject.solve(new RemoteObject[] {_totalunits,main._u2}, "+",1, 0);Debug.locals.put("totalUnits", _totalunits);
 }else {
 BA.debugLineNum = 138;BA.debugLine="subtotal2.Text =  GetMissingValue(grade2, unit2)";
Debug.ShouldStop(512);
main.mostCurrent._subtotal2.runMethod(true,"setText",BA.ObjectToCharSequence(_getmissingvalue(main.mostCurrent._grade2,main.mostCurrent._unit2)));
 };
 BA.debugLineNum = 141;BA.debugLine="If grade3.Text <> \"\" And unit3.Text <> \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",main.mostCurrent._grade3.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._unit3.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 142;BA.debugLine="g3 = grade3.Text";
Debug.ShouldStop(8192);
main._g3 = BA.numberCast(float.class, main.mostCurrent._grade3.runMethod(true,"getText"));
 BA.debugLineNum = 143;BA.debugLine="u3 = unit3.Text";
Debug.ShouldStop(16384);
main._u3 = BA.numberCast(float.class, main.mostCurrent._unit3.runMethod(true,"getText"));
 BA.debugLineNum = 144;BA.debugLine="subtotal3.Text = g3 * u3";
Debug.ShouldStop(32768);
main.mostCurrent._subtotal3.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._g3,main._u3}, "*",0, 0)));
 BA.debugLineNum = 145;BA.debugLine="totalSubtotal = totalSubtotal + g3 * u3";
Debug.ShouldStop(65536);
main._totalsubtotal = RemoteObject.solve(new RemoteObject[] {main._totalsubtotal,main._g3,main._u3}, "+*",1, 0);
 BA.debugLineNum = 146;BA.debugLine="totalUnits = totalUnits + u3";
Debug.ShouldStop(131072);
_totalunits = RemoteObject.solve(new RemoteObject[] {_totalunits,main._u3}, "+",1, 0);Debug.locals.put("totalUnits", _totalunits);
 }else {
 BA.debugLineNum = 148;BA.debugLine="subtotal3.Text =  GetMissingValue(grade3, unit3)";
Debug.ShouldStop(524288);
main.mostCurrent._subtotal3.runMethod(true,"setText",BA.ObjectToCharSequence(_getmissingvalue(main.mostCurrent._grade3,main.mostCurrent._unit3)));
 };
 BA.debugLineNum = 151;BA.debugLine="If grade4.Text <> \"\" And unit4.Text <> \"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",main.mostCurrent._grade4.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._unit4.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 152;BA.debugLine="g4 = grade4.Text";
Debug.ShouldStop(8388608);
main._g4 = BA.numberCast(float.class, main.mostCurrent._grade4.runMethod(true,"getText"));
 BA.debugLineNum = 153;BA.debugLine="u4 = unit4.Text";
Debug.ShouldStop(16777216);
main._u4 = BA.numberCast(float.class, main.mostCurrent._unit4.runMethod(true,"getText"));
 BA.debugLineNum = 154;BA.debugLine="subtotal4.Text = g4 * u4";
Debug.ShouldStop(33554432);
main.mostCurrent._subtotal4.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._g4,main._u4}, "*",0, 0)));
 BA.debugLineNum = 155;BA.debugLine="totalSubtotal = totalSubtotal + g4 * u4";
Debug.ShouldStop(67108864);
main._totalsubtotal = RemoteObject.solve(new RemoteObject[] {main._totalsubtotal,main._g4,main._u4}, "+*",1, 0);
 BA.debugLineNum = 156;BA.debugLine="totalUnits = totalUnits + u4";
Debug.ShouldStop(134217728);
_totalunits = RemoteObject.solve(new RemoteObject[] {_totalunits,main._u4}, "+",1, 0);Debug.locals.put("totalUnits", _totalunits);
 }else {
 BA.debugLineNum = 158;BA.debugLine="subtotal4.Text = GetMissingValue(grade4, unit4)";
Debug.ShouldStop(536870912);
main.mostCurrent._subtotal4.runMethod(true,"setText",BA.ObjectToCharSequence(_getmissingvalue(main.mostCurrent._grade4,main.mostCurrent._unit4)));
 };
 BA.debugLineNum = 161;BA.debugLine="If grade5.Text <> \"\" And unit5.Text <> \"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",main.mostCurrent._grade5.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._unit5.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 162;BA.debugLine="g5 = grade5.Text";
Debug.ShouldStop(2);
main._g5 = BA.numberCast(float.class, main.mostCurrent._grade5.runMethod(true,"getText"));
 BA.debugLineNum = 163;BA.debugLine="u5 = unit5.Text";
Debug.ShouldStop(4);
main._u5 = BA.numberCast(float.class, main.mostCurrent._unit5.runMethod(true,"getText"));
 BA.debugLineNum = 164;BA.debugLine="subtotal5.Text = g5 * u5";
Debug.ShouldStop(8);
main.mostCurrent._subtotal5.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._g5,main._u5}, "*",0, 0)));
 BA.debugLineNum = 165;BA.debugLine="totalSubtotal = totalSubtotal + g5 * u5";
Debug.ShouldStop(16);
main._totalsubtotal = RemoteObject.solve(new RemoteObject[] {main._totalsubtotal,main._g5,main._u5}, "+*",1, 0);
 BA.debugLineNum = 166;BA.debugLine="totalUnits = totalUnits + u5";
Debug.ShouldStop(32);
_totalunits = RemoteObject.solve(new RemoteObject[] {_totalunits,main._u5}, "+",1, 0);Debug.locals.put("totalUnits", _totalunits);
 }else {
 BA.debugLineNum = 168;BA.debugLine="subtotal5.Text =  GetMissingValue(grade5, unit5)";
Debug.ShouldStop(128);
main.mostCurrent._subtotal5.runMethod(true,"setText",BA.ObjectToCharSequence(_getmissingvalue(main.mostCurrent._grade5,main.mostCurrent._unit5)));
 };
 BA.debugLineNum = 171;BA.debugLine="If grade6.Text <> \"\" And unit6.Text <> \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",main.mostCurrent._grade6.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._unit6.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 172;BA.debugLine="g6 = grade6.Text";
Debug.ShouldStop(2048);
main._g6 = BA.numberCast(float.class, main.mostCurrent._grade6.runMethod(true,"getText"));
 BA.debugLineNum = 173;BA.debugLine="u6 = unit6.Text";
Debug.ShouldStop(4096);
main._u6 = BA.numberCast(float.class, main.mostCurrent._unit6.runMethod(true,"getText"));
 BA.debugLineNum = 174;BA.debugLine="subtotal6.Text = g6 * u6";
Debug.ShouldStop(8192);
main.mostCurrent._subtotal6.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._g6,main._u6}, "*",0, 0)));
 BA.debugLineNum = 175;BA.debugLine="totalSubtotal = totalSubtotal + g6 * u6";
Debug.ShouldStop(16384);
main._totalsubtotal = RemoteObject.solve(new RemoteObject[] {main._totalsubtotal,main._g6,main._u6}, "+*",1, 0);
 BA.debugLineNum = 176;BA.debugLine="totalUnits = totalUnits + u6";
Debug.ShouldStop(32768);
_totalunits = RemoteObject.solve(new RemoteObject[] {_totalunits,main._u6}, "+",1, 0);Debug.locals.put("totalUnits", _totalunits);
 }else {
 BA.debugLineNum = 178;BA.debugLine="subtotal6.Text =  GetMissingValue(grade6, unit6)";
Debug.ShouldStop(131072);
main.mostCurrent._subtotal6.runMethod(true,"setText",BA.ObjectToCharSequence(_getmissingvalue(main.mostCurrent._grade6,main.mostCurrent._unit6)));
 };
 BA.debugLineNum = 181;BA.debugLine="If grade7.Text <> \"\" And unit7.Text <> \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",main.mostCurrent._grade7.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._unit7.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 182;BA.debugLine="g7 = grade7.Text";
Debug.ShouldStop(2097152);
main._g7 = BA.numberCast(float.class, main.mostCurrent._grade7.runMethod(true,"getText"));
 BA.debugLineNum = 183;BA.debugLine="u7 = unit7.Text";
Debug.ShouldStop(4194304);
main._u7 = BA.numberCast(float.class, main.mostCurrent._unit7.runMethod(true,"getText"));
 BA.debugLineNum = 184;BA.debugLine="subtotal7.Text = g7 * u7";
Debug.ShouldStop(8388608);
main.mostCurrent._subtotal7.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._g7,main._u7}, "*",0, 0)));
 BA.debugLineNum = 185;BA.debugLine="totalSubtotal = totalSubtotal + g7 * u7";
Debug.ShouldStop(16777216);
main._totalsubtotal = RemoteObject.solve(new RemoteObject[] {main._totalsubtotal,main._g7,main._u7}, "+*",1, 0);
 BA.debugLineNum = 186;BA.debugLine="totalUnits = totalUnits + u7";
Debug.ShouldStop(33554432);
_totalunits = RemoteObject.solve(new RemoteObject[] {_totalunits,main._u7}, "+",1, 0);Debug.locals.put("totalUnits", _totalunits);
 }else {
 BA.debugLineNum = 188;BA.debugLine="subtotal7.Text =  GetMissingValue(grade7, unit7)";
Debug.ShouldStop(134217728);
main.mostCurrent._subtotal7.runMethod(true,"setText",BA.ObjectToCharSequence(_getmissingvalue(main.mostCurrent._grade7,main.mostCurrent._unit7)));
 };
 BA.debugLineNum = 191;BA.debugLine="If grade8.Text <> \"\" And unit8.Text <> \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",main.mostCurrent._grade8.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._unit8.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 192;BA.debugLine="g8 = grade8.Text";
Debug.ShouldStop(-2147483648);
main._g8 = BA.numberCast(float.class, main.mostCurrent._grade8.runMethod(true,"getText"));
 BA.debugLineNum = 193;BA.debugLine="u8 = unit8.Text";
Debug.ShouldStop(1);
main._u8 = BA.numberCast(float.class, main.mostCurrent._unit8.runMethod(true,"getText"));
 BA.debugLineNum = 194;BA.debugLine="subtotal8.Text = g8 * u8";
Debug.ShouldStop(2);
main.mostCurrent._subtotal8.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {main._g8,main._u8}, "*",0, 0)));
 BA.debugLineNum = 195;BA.debugLine="totalSubtotal = totalSubtotal + g8 * u8";
Debug.ShouldStop(4);
main._totalsubtotal = RemoteObject.solve(new RemoteObject[] {main._totalsubtotal,main._g8,main._u8}, "+*",1, 0);
 BA.debugLineNum = 196;BA.debugLine="totalUnits = totalUnits + u8";
Debug.ShouldStop(8);
_totalunits = RemoteObject.solve(new RemoteObject[] {_totalunits,main._u8}, "+",1, 0);Debug.locals.put("totalUnits", _totalunits);
 }else {
 BA.debugLineNum = 198;BA.debugLine="subtotal8.Text = GetMissingValue(grade8, unit8)";
Debug.ShouldStop(32);
main.mostCurrent._subtotal8.runMethod(true,"setText",BA.ObjectToCharSequence(_getmissingvalue(main.mostCurrent._grade8,main.mostCurrent._unit8)));
 };
 BA.debugLineNum = 201;BA.debugLine="CalculateGWA(totalSubtotal, totalUnits)";
Debug.ShouldStop(256);
_calculategwa(main._totalsubtotal,_totalunits);
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clear_click() throws Exception{
try {
		Debug.PushSubsStack("clear_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,288);
if (RapidSub.canDelegate("clear_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","clear_click");}
 BA.debugLineNum = 288;BA.debugLine="Private Sub clear_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="unit1.Text=\"\"";
Debug.ShouldStop(1);
main.mostCurrent._unit1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 290;BA.debugLine="unit2.Text=\"\"";
Debug.ShouldStop(2);
main.mostCurrent._unit2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 291;BA.debugLine="unit3.Text=\"\"";
Debug.ShouldStop(4);
main.mostCurrent._unit3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 292;BA.debugLine="unit4.Text=\"\"";
Debug.ShouldStop(8);
main.mostCurrent._unit4.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 293;BA.debugLine="unit5.Text=\"\"";
Debug.ShouldStop(16);
main.mostCurrent._unit5.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 294;BA.debugLine="unit6.Text=\"\"";
Debug.ShouldStop(32);
main.mostCurrent._unit6.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 295;BA.debugLine="unit7.Text=\"\"";
Debug.ShouldStop(64);
main.mostCurrent._unit7.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 296;BA.debugLine="unit8.Text=\"\"";
Debug.ShouldStop(128);
main.mostCurrent._unit8.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 298;BA.debugLine="grade1.Text=\"\"";
Debug.ShouldStop(512);
main.mostCurrent._grade1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 299;BA.debugLine="grade2.Text=\"\"";
Debug.ShouldStop(1024);
main.mostCurrent._grade2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 300;BA.debugLine="grade3.Text=\"\"";
Debug.ShouldStop(2048);
main.mostCurrent._grade3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 301;BA.debugLine="grade4.Text=\"\"";
Debug.ShouldStop(4096);
main.mostCurrent._grade4.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 302;BA.debugLine="grade5.Text=\"\"";
Debug.ShouldStop(8192);
main.mostCurrent._grade5.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 303;BA.debugLine="grade6.Text=\"\"";
Debug.ShouldStop(16384);
main.mostCurrent._grade6.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 304;BA.debugLine="grade7.Text=\"\"";
Debug.ShouldStop(32768);
main.mostCurrent._grade7.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 305;BA.debugLine="grade8.Text=\"\"";
Debug.ShouldStop(65536);
main.mostCurrent._grade8.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmissingvalue(RemoteObject _grade,RemoteObject _unit) throws Exception{
try {
		Debug.PushSubsStack("GetMissingValue (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,215);
if (RapidSub.canDelegate("getmissingvalue")) { return b4a.example.main.remoteMe.runUserSub(false, "main","getmissingvalue", _grade, _unit);}
Debug.locals.put("grade", _grade);
Debug.locals.put("unit", _unit);
 BA.debugLineNum = 215;BA.debugLine="Private Sub GetMissingValue(grade As EditText, uni";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="If grade.Text = \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_grade.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 217;BA.debugLine="Return unit.text";
Debug.ShouldStop(16777216);
if (true) return _unit.runMethod(true,"getText");
 }else {
 BA.debugLineNum = 219;BA.debugLine="Return grade.text";
Debug.ShouldStop(67108864);
if (true) return _grade.runMethod(true,"getText");
 };
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private HomePanel As Panel";
main.mostCurrent._homepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ASFlowTabMenu1 As ASFlowTabMenu";
main.mostCurrent._asflowtabmenu1 = RemoteObject.createNew ("b4a.example.asflowtabmenu");
 //BA.debugLineNum = 30;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Panel2 As Panel";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private grade1 As EditText";
main.mostCurrent._grade1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private grade2 As EditText";
main.mostCurrent._grade2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private grade3 As EditText";
main.mostCurrent._grade3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private grade4 As EditText";
main.mostCurrent._grade4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private grade5 As EditText";
main.mostCurrent._grade5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private grade6 As EditText";
main.mostCurrent._grade6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private grade7 As EditText";
main.mostCurrent._grade7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private grade8 As EditText";
main.mostCurrent._grade8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private unit1 As EditText";
main.mostCurrent._unit1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private unit2 As EditText";
main.mostCurrent._unit2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private unit3 As EditText";
main.mostCurrent._unit3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private unit4 As EditText";
main.mostCurrent._unit4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private unit6 As EditText";
main.mostCurrent._unit6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private unit7 As EditText";
main.mostCurrent._unit7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private unit8 As EditText";
main.mostCurrent._unit8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private unit5 As EditText";
main.mostCurrent._unit5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private GWA As Label";
main.mostCurrent._gwa = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private u1,u2,u3,u4,u5,u6,u7,u8 As Float";
main._u1 = RemoteObject.createImmutable(0f);
main._u2 = RemoteObject.createImmutable(0f);
main._u3 = RemoteObject.createImmutable(0f);
main._u4 = RemoteObject.createImmutable(0f);
main._u5 = RemoteObject.createImmutable(0f);
main._u6 = RemoteObject.createImmutable(0f);
main._u7 = RemoteObject.createImmutable(0f);
main._u8 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 54;BA.debugLine="Private g1,g2,g3,g4,g5,g6,g7,g8 As Float";
main._g1 = RemoteObject.createImmutable(0f);
main._g2 = RemoteObject.createImmutable(0f);
main._g3 = RemoteObject.createImmutable(0f);
main._g4 = RemoteObject.createImmutable(0f);
main._g5 = RemoteObject.createImmutable(0f);
main._g6 = RemoteObject.createImmutable(0f);
main._g7 = RemoteObject.createImmutable(0f);
main._g8 = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 56;BA.debugLine="Private subtotal1 As Label";
main.mostCurrent._subtotal1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private subtotal2 As Label";
main.mostCurrent._subtotal2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private subtotal3 As Label";
main.mostCurrent._subtotal3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private subtotal4 As Label";
main.mostCurrent._subtotal4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private subtotal5 As Label";
main.mostCurrent._subtotal5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private subtotal6 As Label";
main.mostCurrent._subtotal6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private subtotal7 As Label";
main.mostCurrent._subtotal7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private subtotal8 As Label";
main.mostCurrent._subtotal8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private totalSubtotal As Double = 0";
main._totalsubtotal = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 66;BA.debugLine="Private voice As TTS";
main.mostCurrent._voice = RemoteObject.createNew ("anywheresoftware.b4a.obejcts.TTS");
 //BA.debugLineNum = 67;BA.debugLine="Private clear As Button";
main.mostCurrent._clear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _grade1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("grade1_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,227);
if (RapidSub.canDelegate("grade1_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","grade1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 227;BA.debugLine="Private Sub grade1_TextChanged (Old As String, New";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(8);
_calculatesubtotals();
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grade2_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("grade2_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,235);
if (RapidSub.canDelegate("grade2_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","grade2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 235;BA.debugLine="Private Sub grade2_TextChanged (Old As String, New";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(2048);
_calculatesubtotals();
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grade3_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("grade3_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,243);
if (RapidSub.canDelegate("grade3_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","grade3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 243;BA.debugLine="Private Sub grade3_TextChanged (Old As String, New";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(524288);
_calculatesubtotals();
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grade4_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("grade4_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,251);
if (RapidSub.canDelegate("grade4_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","grade4_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 251;BA.debugLine="Private Sub grade4_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 252;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(134217728);
_calculatesubtotals();
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grade5_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("grade5_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,259);
if (RapidSub.canDelegate("grade5_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","grade5_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 259;BA.debugLine="Private Sub grade5_TextChanged (Old As String, New";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(8);
_calculatesubtotals();
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grade6_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("grade6_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,267);
if (RapidSub.canDelegate("grade6_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","grade6_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 267;BA.debugLine="Private Sub grade6_TextChanged (Old As String, New";
Debug.ShouldStop(1024);
 BA.debugLineNum = 268;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(2048);
_calculatesubtotals();
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grade7_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("grade7_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,275);
if (RapidSub.canDelegate("grade7_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","grade7_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 275;BA.debugLine="Private Sub grade7_TextChanged (Old As String, New";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(524288);
_calculatesubtotals();
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grade8_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("grade8_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,283);
if (RapidSub.canDelegate("grade8_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","grade8_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 283;BA.debugLine="Private Sub grade8_TextChanged (Old As String, New";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(134217728);
_calculatesubtotals();
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

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
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _unit1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("unit1_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,223);
if (RapidSub.canDelegate("unit1_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","unit1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 223;BA.debugLine="Private Sub unit1_TextChanged (Old As String, New";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(-2147483648);
_calculatesubtotals();
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unit2_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("unit2_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,231);
if (RapidSub.canDelegate("unit2_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","unit2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 231;BA.debugLine="Private Sub unit2_TextChanged (Old As String, New";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(128);
_calculatesubtotals();
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unit3_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("unit3_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,239);
if (RapidSub.canDelegate("unit3_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","unit3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 239;BA.debugLine="Private Sub unit3_TextChanged (Old As String, New";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(32768);
_calculatesubtotals();
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unit4_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("unit4_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,247);
if (RapidSub.canDelegate("unit4_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","unit4_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 247;BA.debugLine="Private Sub unit4_TextChanged (Old As String, New";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(8388608);
_calculatesubtotals();
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unit5_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("unit5_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,255);
if (RapidSub.canDelegate("unit5_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","unit5_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 255;BA.debugLine="Private Sub unit5_TextChanged (Old As String, New";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(-2147483648);
_calculatesubtotals();
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unit6_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("unit6_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,263);
if (RapidSub.canDelegate("unit6_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","unit6_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 263;BA.debugLine="Private Sub unit6_TextChanged (Old As String, New";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(128);
_calculatesubtotals();
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unit7_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("unit7_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,271);
if (RapidSub.canDelegate("unit7_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","unit7_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 271;BA.debugLine="Private Sub unit7_TextChanged (Old As String, New";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(32768);
_calculatesubtotals();
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unit8_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("unit8_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,279);
if (RapidSub.canDelegate("unit8_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","unit8_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 279;BA.debugLine="Private Sub unit8_TextChanged (Old As String, New";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="CalculateSubtotals";
Debug.ShouldStop(8388608);
_calculatesubtotals();
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}