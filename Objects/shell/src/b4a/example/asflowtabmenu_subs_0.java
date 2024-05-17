package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class asflowtabmenu_subs_0 {


public static RemoteObject  _addtab(RemoteObject __ref,RemoteObject _icon,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddTab (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("addtab")) { return __ref.runUserSub(false, "asflowtabmenu","addtab", __ref, _icon, _text);}
RemoteObject _xpnl_tab = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xiv_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Icon", _icon);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 153;BA.debugLine="Public Sub AddTab(Icon As B4XBitmap,Text As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 155;BA.debugLine="Dim xpnl_Tab As B4XView = xui.CreatePanel(\"xpnl_T";
Debug.JustUpdateDeviceLine();
_xpnl_tab = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_tab = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_Tab")));Debug.locals.put("xpnl_Tab", _xpnl_tab);Debug.locals.put("xpnl_Tab", _xpnl_tab);
 BA.debugLineNum = 156;BA.debugLine="xpnl_Tab.SetLayoutAnimated(0,0,0,0,0)";
Debug.JustUpdateDeviceLine();
_xpnl_tab.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 158;BA.debugLine="Dim xlbl_Text As B4XView = CreateLabel(\"\")";
Debug.JustUpdateDeviceLine();
_xlbl_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_text = __ref.runClassMethod (b4a.example.asflowtabmenu.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl_Text", _xlbl_text);Debug.locals.put("xlbl_Text", _xlbl_text);
 BA.debugLineNum = 159;BA.debugLine="Dim xiv_Icon As B4XView = CreateImageView(\"\")";
Debug.JustUpdateDeviceLine();
_xiv_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xiv_icon = __ref.runClassMethod (b4a.example.asflowtabmenu.class, "_createimageview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xiv_Icon", _xiv_icon);Debug.locals.put("xiv_Icon", _xiv_icon);
 BA.debugLineNum = 161;BA.debugLine="xpnl_Tab.AddView(xlbl_Text,0,0,0,0)";
Debug.JustUpdateDeviceLine();
_xpnl_tab.runVoidMethod ("AddView",(Object)((_xlbl_text.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 162;BA.debugLine="xpnl_Tab.AddView(xiv_Icon,0,0,0,0)";
Debug.JustUpdateDeviceLine();
_xpnl_tab.runVoidMethod ("AddView",(Object)((_xiv_icon.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 164;BA.debugLine="xlbl_Text.TextColor = gTabProp.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setTextColor",__ref.getField(false,"_gtabprop" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 165;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 167;BA.debugLine="xlbl_Text.Text = Text";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 168;BA.debugLine="xlbl_Text.Font = gTabProp.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(false,"setFont",__ref.getField(false,"_gtabprop" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 170;BA.debugLine="xpnl_Tab.Tag = CreateASFlowTabMenu_Tab(xpnl_TabBa";
Debug.JustUpdateDeviceLine();
_xpnl_tab.runMethod(false,"setTag",(__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_createasflowtabmenu_tab" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")),(Object)(_icon),(Object)(_text),(Object)(__ref.getField(false,"_gtabprop" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_gtabprop" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ )))));
 BA.debugLineNum = 172;BA.debugLine="xpnl_TabBackground.AddView(xpnl_Tab,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xpnl_tab.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 174;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "asflowtabmenu","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 79;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="xpnl_TabBackground.SetLayoutAnimated(0,0,0,Width,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 82;BA.debugLine="UpdateTabs(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_updatetabs" /*RemoteObject*/ ,(Object)(asflowtabmenu.__c.getField(true,"False")));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private mEventName As String 'ignore";
asflowtabmenu._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",asflowtabmenu._meventname);
 //BA.debugLineNum = 24;BA.debugLine="Private mCallBack As Object 'ignore";
asflowtabmenu._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",asflowtabmenu._mcallback);
 //BA.debugLineNum = 25;BA.debugLine="Public mBase As B4XView";
asflowtabmenu._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",asflowtabmenu._mbase);
 //BA.debugLineNum = 26;BA.debugLine="Private xui As XUI 'ignore";
asflowtabmenu._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",asflowtabmenu._xui);
 //BA.debugLineNum = 27;BA.debugLine="Public Tag As Object";
asflowtabmenu._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",asflowtabmenu._tag);
 //BA.debugLineNum = 28;BA.debugLine="Private xpnl_TabBackground As B4XView";
asflowtabmenu._xpnl_tabbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_tabbackground",asflowtabmenu._xpnl_tabbackground);
 //BA.debugLineNum = 29;BA.debugLine="Private xpnl_TabSelector As B4XView";
asflowtabmenu._xpnl_tabselector = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_tabselector",asflowtabmenu._xpnl_tabselector);
 //BA.debugLineNum = 31;BA.debugLine="Private mIconHeight As Float = 35dip";
asflowtabmenu._miconheight = BA.numberCast(float.class, asflowtabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))));__ref.setField("_miconheight",asflowtabmenu._miconheight);
 //BA.debugLineNum = 32;BA.debugLine="Private mCurrentIndex As Int = 0";
asflowtabmenu._mcurrentindex = BA.numberCast(int.class, 0);__ref.setField("_mcurrentindex",asflowtabmenu._mcurrentindex);
 //BA.debugLineNum = 34;BA.debugLine="Private m_BackgroundColor As Int";
asflowtabmenu._m_backgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_m_backgroundcolor",asflowtabmenu._m_backgroundcolor);
 //BA.debugLineNum = 35;BA.debugLine="Private m_SelectorColor As Int";
asflowtabmenu._m_selectorcolor = RemoteObject.createImmutable(0);__ref.setField("_m_selectorcolor",asflowtabmenu._m_selectorcolor);
 //BA.debugLineNum = 37;BA.debugLine="Type ASFlowTabMenu_Tab (Index As Int,Icon As B4XB";
;
 //BA.debugLineNum = 39;BA.debugLine="Private gTabProp As ASFlowTabMenu_Tab";
asflowtabmenu._gtabprop = RemoteObject.createNew ("b4a.example.asflowtabmenu._asflowtabmenu_tab");__ref.setField("_gtabprop",asflowtabmenu._gtabprop);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createasflowtabmenu_tab(RemoteObject __ref,RemoteObject _index,RemoteObject _icon,RemoteObject _text,RemoteObject _textcolor,RemoteObject _xfont) throws Exception{
try {
		Debug.PushSubsStack("CreateASFlowTabMenu_Tab (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("createasflowtabmenu_tab")) { return __ref.runUserSub(false, "asflowtabmenu","createasflowtabmenu_tab", __ref, _index, _icon, _text, _textcolor, _xfont);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.asflowtabmenu._asflowtabmenu_tab");
Debug.locals.put("Index", _index);
Debug.locals.put("Icon", _icon);
Debug.locals.put("Text", _text);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("xFont", _xfont);
 BA.debugLineNum = 343;BA.debugLine="Public Sub CreateASFlowTabMenu_Tab (Index As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 344;BA.debugLine="Dim t1 As ASFlowTabMenu_Tab";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.asflowtabmenu._asflowtabmenu_tab");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 345;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 346;BA.debugLine="t1.Index = Index";
Debug.JustUpdateDeviceLine();
_t1.setField ("Index" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 347;BA.debugLine="t1.Icon = Icon";
Debug.JustUpdateDeviceLine();
_t1.setField ("Icon" /*RemoteObject*/ ,_icon);
 BA.debugLineNum = 348;BA.debugLine="t1.Text = Text";
Debug.JustUpdateDeviceLine();
_t1.setField ("Text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 349;BA.debugLine="t1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("TextColor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 350;BA.debugLine="t1.xFont = xFont";
Debug.JustUpdateDeviceLine();
_t1.setField ("xFont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 351;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimageview(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateImageView (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("createimageview")) { return __ref.runUserSub(false, "asflowtabmenu","createimageview", __ref, _eventname);}
RemoteObject _tmp_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 298;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 300;BA.debugLine="Dim tmp_iv As ImageView";
Debug.JustUpdateDeviceLine();
_tmp_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("tmp_iv", _tmp_iv);
 BA.debugLineNum = 301;BA.debugLine="tmp_iv.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_tmp_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 302;BA.debugLine="Return tmp_iv";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_iv.getObject());
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "asflowtabmenu","createlabel", __ref, _eventname);}
RemoteObject _tmp_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 286;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 287;BA.debugLine="Dim tmp_lbl As Label";
Debug.JustUpdateDeviceLine();
_tmp_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tmp_lbl", _tmp_lbl);
 BA.debugLineNum = 288;BA.debugLine="tmp_lbl.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_tmp_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 290;BA.debugLine="tmp_lbl.SingleLine = False";
Debug.JustUpdateDeviceLine();
_tmp_lbl.runVoidMethod ("setSingleLine",asflowtabmenu.__c.getField(true,"False"));
 BA.debugLineNum = 291;BA.debugLine="tmp_lbl.Ellipsize = \"END\"";
Debug.JustUpdateDeviceLine();
_tmp_lbl.runMethod(true,"setEllipsize",BA.ObjectToString("END"));
 BA.debugLineNum = 295;BA.debugLine="Return tmp_lbl";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_lbl.getObject());
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "asflowtabmenu","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 49;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 51;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 52;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 54;BA.debugLine="xpnl_TabBackground = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_tabbackground" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 55;BA.debugLine="xpnl_TabSelector = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_tabselector" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 56;BA.debugLine="mBase.AddView(xpnl_TabSelector,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_tabselector" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 57;BA.debugLine="mBase.AddView(xpnl_TabBackground,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 59;BA.debugLine="IniProps(Props)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_iniprops" /*RemoteObject*/ ,(Object)(_props));
 BA.debugLineNum = 61;BA.debugLine="gTabProp = CreateASFlowTabMenu_Tab(-1,Null,\"\",xui";
Debug.JustUpdateDeviceLine();
__ref.setField ("_gtabprop" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_createasflowtabmenu_tab" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 1))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), asflowtabmenu.__c.getField(false,"Null")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))))));
 BA.debugLineNum = 64;BA.debugLine="Base_Resize(mBase.width,mBase.height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fonttobitmap(RemoteObject __ref,RemoteObject _text,RemoteObject _ismaterialicons,RemoteObject _fontsize,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("FontToBitmap (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("fonttobitmap")) { return __ref.runUserSub(false, "asflowtabmenu","fonttobitmap", __ref, _text, _ismaterialicons, _fontsize, _color);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cvs1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("text", _text);
Debug.locals.put("IsMaterialIcons", _ismaterialicons);
Debug.locals.put("FontSize", _fontsize);
Debug.locals.put("color", _color);
 BA.debugLineNum = 307;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="Dim xui As XUI";
Debug.JustUpdateDeviceLine();
asflowtabmenu._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",asflowtabmenu._xui);
 BA.debugLineNum = 309;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 310;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(asflowtabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(asflowtabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 311;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.JustUpdateDeviceLine();
_cvs1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 312;BA.debugLine="cvs1.Initialize(p)";
Debug.JustUpdateDeviceLine();
_cvs1.runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 313;BA.debugLine="Dim fnt As B4XFont";
Debug.JustUpdateDeviceLine();
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 314;BA.debugLine="If IsMaterialIcons Then fnt = xui.CreateMaterialI";
Debug.JustUpdateDeviceLine();
if (_ismaterialicons.<Boolean>get().booleanValue()) { 
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(_fontsize));Debug.locals.put("fnt", _fnt);}
else {
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFontAwesome",(Object)(_fontsize));Debug.locals.put("fnt", _fnt);};
 BA.debugLineNum = 315;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
Debug.JustUpdateDeviceLine();
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 316;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 317;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
Debug.JustUpdateDeviceLine();
_cvs1.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(_text),(Object)(_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_color),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 318;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = _cvs1.runMethod(false,"CreateBitmap");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 319;BA.debugLine="cvs1.Release";
Debug.JustUpdateDeviceLine();
_cvs1.runVoidMethod ("Release");
 BA.debugLineNum = 320;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
if (true) return _b;
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentIndex (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("getcurrentindex")) { return __ref.runUserSub(false, "asflowtabmenu","getcurrentindex", __ref);}
 BA.debugLineNum = 199;BA.debugLine="Public Sub getCurrentIndex As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 200;BA.debugLine="Return mCurrentIndex";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mcurrentindex" /*RemoteObject*/ );
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getglobaltabproperties(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getGlobalTabProperties (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("getglobaltabproperties")) { return __ref.runUserSub(false, "asflowtabmenu","getglobaltabproperties", __ref);}
 BA.debugLineNum = 250;BA.debugLine="Public Sub getGlobalTabProperties As ASFlowTabMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 251;BA.debugLine="Return gTabProp";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_gtabprop" /*RemoteObject*/ );
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geticonheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIconHeight (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("geticonheight")) { return __ref.runUserSub(false, "asflowtabmenu","geticonheight", __ref);}
 BA.debugLineNum = 238;BA.debugLine="Public Sub getIconHeight As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 239;BA.debugLine="Return mIconHeight";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_miconheight" /*RemoteObject*/ );
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "asflowtabmenu","getsize", __ref);}
 BA.debugLineNum = 246;BA.debugLine="Public Sub getSize As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="Return xpnl_TabBackground.NumberOfViews";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabpropertiesat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetTabPropertiesAt (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("gettabpropertiesat")) { return __ref.runUserSub(false, "asflowtabmenu","gettabpropertiesat", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 211;BA.debugLine="Public Sub GetTabPropertiesAt(Index As Int) As ASF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 212;BA.debugLine="Return xpnl_TabBackground.GetView(Index).Tag.As(A";
Debug.JustUpdateDeviceLine();
if (true) return ((__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag")));
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iniprops(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("IniProps (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("iniprops")) { return __ref.runUserSub(false, "asflowtabmenu","iniprops", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 69;BA.debugLine="Private Sub IniProps(Props As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="m_SelectorColor = xui.PaintOrColorToColor(Props.G";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selectorcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SelectorColor")))))));
 BA.debugLineNum = 71;BA.debugLine="m_BackgroundColor = xui.PaintOrColorToColor(Props";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_backgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BackgroundColor")))))));
 BA.debugLineNum = 73;BA.debugLine="xpnl_TabSelector.SetColorAndBorder(m_SelectorColo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabselector" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_m_selectorcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(asflowtabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 74;BA.debugLine="xpnl_TabBackground.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 75;BA.debugLine="mBase.Color = m_BackgroundColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_backgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "asflowtabmenu","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 42;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 44;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 45;BA.debugLine="gTabProp.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gtabprop" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuretextwidth(RemoteObject __ref,RemoteObject _text,RemoteObject _font1) throws Exception{
try {
		Debug.PushSubsStack("MeasureTextWidth (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("measuretextwidth")) { return __ref.runUserSub(false, "asflowtabmenu","measuretextwidth", __ref, _text, _font1);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("Font1", _font1);
 BA.debugLineNum = 323;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 325;BA.debugLine="Private bmp As Bitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 326;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
Debug.JustUpdateDeviceLine();
_bmp.runVoidMethod ("InitializeMutable",(Object)(asflowtabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(asflowtabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 327;BA.debugLine="Private cvs As Canvas";
Debug.JustUpdateDeviceLine();
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 328;BA.debugLine="cvs.Initialize2(bmp)";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 329;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNativ";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, _cvs.runMethod(true,"MeasureStringWidth",(Object)(_text),(Object)((_font1.runMethod(false,"ToNativeFont").getObject())),(Object)(_font1.runMethod(true,"getSize"))));
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshtabproperties(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshTabProperties (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("refreshtabproperties")) { return __ref.runUserSub(false, "asflowtabmenu","refreshtabproperties", __ref);}
int _i = 0;
RemoteObject _xpnl_tab = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xiv_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tabprop = RemoteObject.declareNull("b4a.example.asflowtabmenu._asflowtabmenu_tab");
 BA.debugLineNum = 219;BA.debugLine="Public Sub RefreshTabProperties";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 220;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 221;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
Debug.JustUpdateDeviceLine();
_xpnl_tab = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_tab = __ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("xpnl_Tab", _xpnl_tab);Debug.locals.put("xpnl_Tab", _xpnl_tab);
 BA.debugLineNum = 222;BA.debugLine="Dim xlbl_Text As B4XView = xpnl_Tab.GetView(0)";
Debug.JustUpdateDeviceLine();
_xlbl_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_text = _xpnl_tab.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl_Text", _xlbl_text);Debug.locals.put("xlbl_Text", _xlbl_text);
 BA.debugLineNum = 223;BA.debugLine="Dim xiv_Icon As B4XView = xpnl_Tab.GetView(1)";
Debug.JustUpdateDeviceLine();
_xiv_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xiv_icon = _xpnl_tab.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("xiv_Icon", _xiv_icon);Debug.locals.put("xiv_Icon", _xiv_icon);
 BA.debugLineNum = 225;BA.debugLine="Dim TabProp As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
Debug.JustUpdateDeviceLine();
_tabprop = (_xpnl_tab.runMethod(false,"getTag"));Debug.locals.put("TabProp", _tabprop);Debug.locals.put("TabProp", _tabprop);
 BA.debugLineNum = 227;BA.debugLine="xlbl_Text.TextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 228;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 229;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 230;BA.debugLine="xlbl_Text.Text = TabProp.Text";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setText",BA.ObjectToCharSequence(_tabprop.getField(true,"Text" /*RemoteObject*/ )));
 BA.debugLineNum = 231;BA.debugLine="xlbl_Text.Font = xui.CreateDefaultFont(15)";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 233;BA.debugLine="xiv_Icon.SetBitmap(TabProp.Icon.Resize(mIconHeig";
Debug.JustUpdateDeviceLine();
_xiv_icon.runVoidMethod ("SetBitmap",(Object)((_tabprop.getField(false,"Icon" /*RemoteObject*/ ).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))),(Object)(asflowtabmenu.__c.getField(true,"True"))).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removetab(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveTab (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("removetab")) { return __ref.runUserSub(false, "asflowtabmenu","removetab", __ref, _index);}
int _i = 0;
RemoteObject _xpnl_tab = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tab1 = RemoteObject.declareNull("b4a.example.asflowtabmenu._asflowtabmenu_tab");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 177;BA.debugLine="Public Sub RemoveTab(Index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 178;BA.debugLine="xpnl_TabBackground.GetView(Index).RemoveViewFromP";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 180;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 181;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
Debug.JustUpdateDeviceLine();
_xpnl_tab = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_tab = __ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("xpnl_Tab", _xpnl_tab);Debug.locals.put("xpnl_Tab", _xpnl_tab);
 BA.debugLineNum = 182;BA.debugLine="Dim Tab1 As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
Debug.JustUpdateDeviceLine();
_tab1 = (_xpnl_tab.runMethod(false,"getTag"));Debug.locals.put("Tab1", _tab1);Debug.locals.put("Tab1", _tab1);
 BA.debugLineNum = 183;BA.debugLine="Tab1.Index = i";
Debug.JustUpdateDeviceLine();
_tab1.setField ("Index" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 184;BA.debugLine="xpnl_Tab.Tag = Tab1";
Debug.JustUpdateDeviceLine();
_xpnl_tab.runMethod(false,"setTag",(_tab1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 187;BA.debugLine="If mCurrentIndex <> Index Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mcurrentindex" /*RemoteObject*/ ),BA.numberCast(double.class, _index))) { 
 BA.debugLineNum = 188;BA.debugLine="mCurrentIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 189;BA.debugLine="TabClickEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_tabclickevent" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 191;BA.debugLine="mCurrentIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 194;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrentindex(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("setCurrentIndex (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("setcurrentindex")) { return __ref.runUserSub(false, "asflowtabmenu","setcurrentindex", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 203;BA.debugLine="Public Sub setCurrentIndex(Index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 204;BA.debugLine="mCurrentIndex = Index : UpdateTabs(False)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 204;BA.debugLine="mCurrentIndex = Index : UpdateTabs(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_updatetabs" /*RemoteObject*/ ,(Object)(asflowtabmenu.__c.getField(true,"False")));
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrentindexanimated(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("setCurrentIndexAnimated (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("setcurrentindexanimated")) { return __ref.runUserSub(false, "asflowtabmenu","setcurrentindexanimated", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 207;BA.debugLine="Public Sub setCurrentIndexAnimated(Index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 208;BA.debugLine="mCurrentIndex = Index : UpdateTabs(True)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 208;BA.debugLine="mCurrentIndex = Index : UpdateTabs(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_updatetabs" /*RemoteObject*/ ,(Object)(asflowtabmenu.__c.getField(true,"True")));
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticonheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setIconHeight (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("seticonheight")) { return __ref.runUserSub(false, "asflowtabmenu","seticonheight", __ref, _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 242;BA.debugLine="Public Sub setIconHeight(Height As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="mIconHeight = Height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_miconheight" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabproperties(RemoteObject __ref,RemoteObject _index,RemoteObject _tabproperties) throws Exception{
try {
		Debug.PushSubsStack("SetTabProperties (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("settabproperties")) { return __ref.runUserSub(false, "asflowtabmenu","settabproperties", __ref, _index, _tabproperties);}
Debug.locals.put("Index", _index);
Debug.locals.put("TabProperties", _tabproperties);
 BA.debugLineNum = 215;BA.debugLine="Public Sub SetTabProperties(Index As Int,TabProper";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="xpnl_TabBackground.GetView(Index).Tag = TabProper";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"setTag",(_tabproperties));
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabclick(RemoteObject __ref,RemoteObject _xpnl_tab) throws Exception{
try {
		Debug.PushSubsStack("TabClick (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("tabclick")) { return __ref.runUserSub(false, "asflowtabmenu","tabclick", __ref, _xpnl_tab);}
Debug.locals.put("xpnl_Tab", _xpnl_tab);
 BA.debugLineNum = 265;BA.debugLine="Private Sub TabClick(xpnl_Tab As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 269;BA.debugLine="If mCurrentIndex <> xpnl_Tab.Tag.As(ASFlowTabMenu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mcurrentindex" /*RemoteObject*/ ),BA.numberCast(double.class, ((_xpnl_tab.runMethod(false,"getTag"))).getField(true,"Index" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 270;BA.debugLine="mCurrentIndex = xpnl_Tab.Tag.As(ASFlowTabMenu_Ta";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentindex" /*RemoteObject*/ ,((_xpnl_tab.runMethod(false,"getTag"))).getField(true,"Index" /*RemoteObject*/ ));
 BA.debugLineNum = 271;BA.debugLine="TabClickEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_tabclickevent" /*RemoteObject*/ );
 BA.debugLineNum = 272;BA.debugLine="UpdateTabs(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_updatetabs" /*RemoteObject*/ ,(Object)(asflowtabmenu.__c.getField(true,"True")));
 };
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabclickevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TabClickEvent (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("tabclickevent")) { return __ref.runUserSub(false, "asflowtabmenu","tabclickevent", __ref);}
 BA.debugLineNum = 280;BA.debugLine="Private Sub TabClickEvent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 281;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TabCli";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TabClick"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 282;BA.debugLine="CallSub2(mCallBack, mEventName & \"_TabClick\",mCu";
Debug.JustUpdateDeviceLine();
asflowtabmenu.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TabClick"))),(Object)((__ref.getField(true,"_mcurrentindex" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetabs(RemoteObject __ref,RemoteObject _animated) throws Exception{
try {
		Debug.PushSubsStack("UpdateTabs (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("updatetabs")) { return __ref.runUserSub(false, "asflowtabmenu","updatetabs", __ref, _animated);}
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _maxwidth = RemoteObject.createImmutable(0f);
int _i = 0;
RemoteObject _xpnl_tab = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tab1 = RemoteObject.declareNull("b4a.example.asflowtabmenu._asflowtabmenu_tab");
RemoteObject _xlbl_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xiv_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _textwidth = RemoteObject.createImmutable(0);
RemoteObject _labelwidth = RemoteObject.createImmutable(0f);
RemoteObject _normalpanelwidth = RemoteObject.createImmutable(0f);
Debug.locals.put("Animated", _animated);
 BA.debugLineNum = 86;BA.debugLine="Private Sub UpdateTabs(Animated As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Dim duration As Int = 0";
Debug.JustUpdateDeviceLine();
_duration = BA.numberCast(int.class, 0);Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 88;BA.debugLine="If Animated = True Then duration = 250";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_animated,asflowtabmenu.__c.getField(true,"True"))) { 
_duration = BA.numberCast(int.class, 250);Debug.locals.put("duration", _duration);};
 BA.debugLineNum = 90;BA.debugLine="Dim MaxWidth As Float = xpnl_TabBackground.Width/";
Debug.JustUpdateDeviceLine();
_maxwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")}, "/",0, 0));Debug.locals.put("MaxWidth", _maxwidth);Debug.locals.put("MaxWidth", _maxwidth);
 BA.debugLineNum = 92;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 93;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
Debug.JustUpdateDeviceLine();
_xpnl_tab = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_tab = __ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(((__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(false,"getTag"))).getField(true,"Index" /*RemoteObject*/ )));Debug.locals.put("xpnl_Tab", _xpnl_tab);Debug.locals.put("xpnl_Tab", _xpnl_tab);
 BA.debugLineNum = 94;BA.debugLine="Dim Tab1 As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
Debug.JustUpdateDeviceLine();
_tab1 = (_xpnl_tab.runMethod(false,"getTag"));Debug.locals.put("Tab1", _tab1);Debug.locals.put("Tab1", _tab1);
 BA.debugLineNum = 96;BA.debugLine="Dim xlbl_Text As B4XView = xpnl_Tab.GetView(0)";
Debug.JustUpdateDeviceLine();
_xlbl_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_text = _xpnl_tab.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl_Text", _xlbl_text);Debug.locals.put("xlbl_Text", _xlbl_text);
 BA.debugLineNum = 97;BA.debugLine="Dim xiv_Icon As B4XView = xpnl_Tab.GetView(1)";
Debug.JustUpdateDeviceLine();
_xiv_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xiv_icon = _xpnl_tab.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("xiv_Icon", _xiv_icon);Debug.locals.put("xiv_Icon", _xiv_icon);
 BA.debugLineNum = 99;BA.debugLine="Dim TextWidth As Int = MeasureTextWidth(xlbl_Tex";
Debug.JustUpdateDeviceLine();
_textwidth = __ref.runClassMethod (b4a.example.asflowtabmenu.class, "_measuretextwidth" /*RemoteObject*/ ,(Object)(_xlbl_text.runMethod(true,"getText")),(Object)(_xlbl_text.runMethod(false,"getFont")));Debug.locals.put("TextWidth", _textwidth);Debug.locals.put("TextWidth", _textwidth);
 BA.debugLineNum = 100;BA.debugLine="Dim LabelWidth As Float = TextWidth + mIconHeigh";
Debug.JustUpdateDeviceLine();
_labelwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_textwidth,__ref.getField(true,"_miconheight" /*RemoteObject*/ ),asflowtabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0));Debug.locals.put("LabelWidth", _labelwidth);Debug.locals.put("LabelWidth", _labelwidth);
 BA.debugLineNum = 102;BA.debugLine="xpnl_Tab.SetLayoutAnimated(0,(mBase.Width/xpnl_T";
Debug.JustUpdateDeviceLine();
_xpnl_tab.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")}, "/",0, 0)),RemoteObject.createImmutable(_i)}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 104;BA.debugLine="If mCurrentIndex <> i Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mcurrentindex" /*RemoteObject*/ ),BA.numberCast(double.class, _i))) { 
 BA.debugLineNum = 105;BA.debugLine="Dim NormalPanelWidth As Float = mBase.Width/xpn";
Debug.JustUpdateDeviceLine();
_normalpanelwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_tabbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")}, "/",0, 0));Debug.locals.put("NormalPanelWidth", _normalpanelwidth);Debug.locals.put("NormalPanelWidth", _normalpanelwidth);
 BA.debugLineNum = 106;BA.debugLine="xlbl_Text.SetLayoutAnimated(duration,NormalPane";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_normalpanelwidth,RemoteObject.createImmutable(2),_labelwidth,RemoteObject.createImmutable(2),__ref.getField(true,"_miconheight" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_labelwidth,__ref.getField(true,"_miconheight" /*RemoteObject*/ )}, "-",1, 0))),(Object)(_xpnl_tab.runMethod(true,"getHeight")));
 BA.debugLineNum = 107;BA.debugLine="xlbl_Text.SetVisibleAnimated(duration/2,False)";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_duration,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(asflowtabmenu.__c.getField(true,"False")));
 BA.debugLineNum = 108;BA.debugLine="xiv_Icon.SetLayoutAnimated(duration,NormalPanel";
Debug.JustUpdateDeviceLine();
_xiv_icon.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_normalpanelwidth,RemoteObject.createImmutable(2),__ref.getField(true,"_miconheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_miconheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 117;BA.debugLine="If LabelWidth > MaxWidth Then LabelWidth = MaxW";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_labelwidth,BA.numberCast(double.class, _maxwidth))) { 
_labelwidth = _maxwidth;Debug.locals.put("LabelWidth", _labelwidth);};
 BA.debugLineNum = 140;BA.debugLine="xiv_Icon.SetLayoutAnimated(duration,xpnl_Tab.Wi";
Debug.JustUpdateDeviceLine();
_xiv_icon.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_tab.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_labelwidth,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_miconheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 141;BA.debugLine="xlbl_Text.SetLayoutAnimated(duration,xpnl_Tab.W";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_tab.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_labelwidth,RemoteObject.createImmutable(2),__ref.getField(true,"_miconheight" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_labelwidth,__ref.getField(true,"_miconheight" /*RemoteObject*/ ),asflowtabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),RemoteObject.createImmutable(2)}, "--/",2, 0))),(Object)(_xpnl_tab.runMethod(true,"getHeight")));
 BA.debugLineNum = 143;BA.debugLine="xlbl_Text.SetVisibleAnimated(duration,True)";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetVisibleAnimated",(Object)(_duration),(Object)(asflowtabmenu.__c.getField(true,"True")));
 BA.debugLineNum = 145;BA.debugLine="xpnl_TabSelector.SetLayoutAnimated(duration,xpn";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabselector" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_tab.runMethod(true,"getLeft"),_xpnl_tab.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_labelwidth,RemoteObject.createImmutable(2)}, "+/-/",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_tab.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_miconheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, _labelwidth)),(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 148;BA.debugLine="xiv_Icon.SetBitmap(Tab1.Icon.Resize(mIconHeight,";
Debug.JustUpdateDeviceLine();
_xiv_icon.runVoidMethod ("SetBitmap",(Object)((_tab1.getField(false,"Icon" /*RemoteObject*/ ).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_miconheight" /*RemoteObject*/ ))),(Object)(asflowtabmenu.__c.getField(true,"True"))).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_tab_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_Tab_Click (asflowtabmenu) ","asflowtabmenu",2,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("xpnl_tab_click")) { return __ref.runUserSub(false, "asflowtabmenu","xpnl_tab_click", __ref);}
 BA.debugLineNum = 260;BA.debugLine="Private Sub xpnl_Tab_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 261;BA.debugLine="TabClick(Sender)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.asflowtabmenu.class, "_tabclick" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), asflowtabmenu.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}