package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asflowtabmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.asflowtabmenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.asflowtabmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvv6 = "";
public Object _vvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv1 = null;
public Object _vvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tabbackground = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tabselector = null;
public float _vvvvv3 = 0f;
public int _vvvvv4 = 0;
public int _m_backgroundcolor = 0;
public int _m_selectorcolor = 0;
public b4a.example.asflowtabmenu._asflowtabmenu_tab _vvvvv5 = null;
public b4a.example.main _vvvvv6 = null;
public b4a.example.starter _vvvvv7 = null;
public static class _asflowtabmenu_tab{
public boolean IsInitialized;
public int Index;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper Icon;
public String Text;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public void Initialize() {
IsInitialized = true;
Index = 0;
Icon = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Text = "";
TextColor = 0;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _v5(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,String _text) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
 //BA.debugLineNum = 153;BA.debugLine="Public Sub AddTab(Icon As B4XBitmap,Text As String";
 //BA.debugLineNum = 155;BA.debugLine="Dim xpnl_Tab As B4XView = xui.CreatePanel(\"xpnl_T";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = _vvvvv1.CreatePanel(ba,"xpnl_Tab");
 //BA.debugLineNum = 156;BA.debugLine="xpnl_Tab.SetLayoutAnimated(0,0,0,0,0)";
_xpnl_tab.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 158;BA.debugLine="Dim xlbl_Text As B4XView = CreateLabel(\"\")";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _v7("");
 //BA.debugLineNum = 159;BA.debugLine="Dim xiv_Icon As B4XView = CreateImageView(\"\")";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = _v6("");
 //BA.debugLineNum = 161;BA.debugLine="xpnl_Tab.AddView(xlbl_Text,0,0,0,0)";
_xpnl_tab.AddView((android.view.View)(_xlbl_text.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 162;BA.debugLine="xpnl_Tab.AddView(xiv_Icon,0,0,0,0)";
_xpnl_tab.AddView((android.view.View)(_xiv_icon.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 164;BA.debugLine="xlbl_Text.TextColor = gTabProp.TextColor";
_xlbl_text.setTextColor(_vvvvv5.TextColor /*int*/ );
 //BA.debugLineNum = 165;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"LEFT\")";
_xlbl_text.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 167;BA.debugLine="xlbl_Text.Text = Text";
_xlbl_text.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 168;BA.debugLine="xlbl_Text.Font = gTabProp.xFont";
_xlbl_text.setFont(_vvvvv5.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 170;BA.debugLine="xpnl_Tab.Tag = CreateASFlowTabMenu_Tab(xpnl_TabBa";
_xpnl_tab.setTag((Object)(_createasflowtabmenu_tab(_xpnl_tabbackground.getNumberOfViews(),_icon,_text,_vvvvv5.TextColor /*int*/ ,_vvvvv5.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 172;BA.debugLine="xpnl_TabBackground.AddView(xpnl_Tab,0,0,0,0)";
_xpnl_tabbackground.AddView((android.view.View)(_xpnl_tab.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 174;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_vvvv0.getWidth(),_vvvv0.getHeight());
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 80;BA.debugLine="xpnl_TabBackground.SetLayoutAnimated(0,0,0,Width,";
_xpnl_tabbackground.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 82;BA.debugLine="UpdateTabs(False)";
_vvv0(__c.False);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private mEventName As String 'ignore";
_vvvv6 = "";
 //BA.debugLineNum = 24;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvv7 = new Object();
 //BA.debugLineNum = 25;BA.debugLine="Public mBase As B4XView";
_vvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 27;BA.debugLine="Public Tag As Object";
_vvvvv2 = new Object();
 //BA.debugLineNum = 28;BA.debugLine="Private xpnl_TabBackground As B4XView";
_xpnl_tabbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private xpnl_TabSelector As B4XView";
_xpnl_tabselector = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private mIconHeight As Float = 35dip";
_vvvvv3 = (float) (__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 32;BA.debugLine="Private mCurrentIndex As Int = 0";
_vvvvv4 = (int) (0);
 //BA.debugLineNum = 34;BA.debugLine="Private m_BackgroundColor As Int";
_m_backgroundcolor = 0;
 //BA.debugLineNum = 35;BA.debugLine="Private m_SelectorColor As Int";
_m_selectorcolor = 0;
 //BA.debugLineNum = 37;BA.debugLine="Type ASFlowTabMenu_Tab (Index As Int,Icon As B4XB";
;
 //BA.debugLineNum = 39;BA.debugLine="Private gTabProp As ASFlowTabMenu_Tab";
_vvvvv5 = new b4a.example.asflowtabmenu._asflowtabmenu_tab();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public b4a.example.asflowtabmenu._asflowtabmenu_tab  _createasflowtabmenu_tab(int _index,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,String _text,int _textcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont) throws Exception{
b4a.example.asflowtabmenu._asflowtabmenu_tab _t1 = null;
 //BA.debugLineNum = 343;BA.debugLine="Public Sub CreateASFlowTabMenu_Tab (Index As Int,";
 //BA.debugLineNum = 344;BA.debugLine="Dim t1 As ASFlowTabMenu_Tab";
_t1 = new b4a.example.asflowtabmenu._asflowtabmenu_tab();
 //BA.debugLineNum = 345;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 346;BA.debugLine="t1.Index = Index";
_t1.Index /*int*/  = _index;
 //BA.debugLineNum = 347;BA.debugLine="t1.Icon = Icon";
_t1.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _icon;
 //BA.debugLineNum = 348;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
 //BA.debugLineNum = 349;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 350;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 351;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _v6(String _eventname) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _tmp_iv = null;
 //BA.debugLineNum = 298;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
 //BA.debugLineNum = 300;BA.debugLine="Dim tmp_iv As ImageView";
_tmp_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 301;BA.debugLine="tmp_iv.Initialize(EventName)";
_tmp_iv.Initialize(ba,_eventname);
 //BA.debugLineNum = 302;BA.debugLine="Return tmp_iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_iv.getObject()));
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _v7(String _eventname) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _tmp_lbl = null;
 //BA.debugLineNum = 286;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
 //BA.debugLineNum = 287;BA.debugLine="Dim tmp_lbl As Label";
_tmp_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 288;BA.debugLine="tmp_lbl.Initialize(EventName)";
_tmp_lbl.Initialize(ba,_eventname);
 //BA.debugLineNum = 290;BA.debugLine="tmp_lbl.SingleLine = False";
_tmp_lbl.setSingleLine(__c.False);
 //BA.debugLineNum = 291;BA.debugLine="tmp_lbl.Ellipsize = \"END\"";
_tmp_lbl.setEllipsize("END");
 //BA.debugLineNum = 295;BA.debugLine="Return tmp_lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_lbl.getObject()));
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 50;BA.debugLine="mBase = Base";
_vvvv0 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 51;BA.debugLine="Tag = mBase.Tag";
_vvvvv2 = _vvvv0.getTag();
 //BA.debugLineNum = 52;BA.debugLine="mBase.Tag = Me";
_vvvv0.setTag(this);
 //BA.debugLineNum = 54;BA.debugLine="xpnl_TabBackground = xui.CreatePanel(\"\")";
_xpnl_tabbackground = _vvvvv1.CreatePanel(ba,"");
 //BA.debugLineNum = 55;BA.debugLine="xpnl_TabSelector = xui.CreatePanel(\"\")";
_xpnl_tabselector = _vvvvv1.CreatePanel(ba,"");
 //BA.debugLineNum = 56;BA.debugLine="mBase.AddView(xpnl_TabSelector,0,0,0,0)";
_vvvv0.AddView((android.view.View)(_xpnl_tabselector.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 57;BA.debugLine="mBase.AddView(xpnl_TabBackground,0,0,0,0)";
_vvvv0.AddView((android.view.View)(_xpnl_tabbackground.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 59;BA.debugLine="IniProps(Props)";
_vv6(_props);
 //BA.debugLineNum = 61;BA.debugLine="gTabProp = CreateASFlowTabMenu_Tab(-1,Null,\"\",xui";
_vvvvv5 = _createasflowtabmenu_tab((int) (-1),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.Null)),"",_vvvvv1.Color_White,_vvvvv1.CreateDefaultFont((float) (15)));
 //BA.debugLineNum = 64;BA.debugLine="Base_Resize(mBase.width,mBase.height)";
_base_resize(_vvvv0.getWidth(),_vvvv0.getHeight());
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _v0(String _text,boolean _ismaterialicons,float _fontsize,int _color) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
 //BA.debugLineNum = 307;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
 //BA.debugLineNum = 308;BA.debugLine="Dim xui As XUI";
_vvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 309;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvv1.CreatePanel(ba,"");
 //BA.debugLineNum = 310;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 311;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 312;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(_p);
 //BA.debugLineNum = 313;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 314;BA.debugLine="If IsMaterialIcons Then fnt = xui.CreateMaterialI";
if (_ismaterialicons) { 
_fnt = _vvvvv1.CreateMaterialIcons(_fontsize);}
else {
_fnt = _vvvvv1.CreateFontAwesome(_fontsize);};
 //BA.debugLineNum = 315;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
 //BA.debugLineNum = 316;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 317;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText(ba,_text,_cvs1.getTargetRect().getCenterX(),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 318;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
 //BA.debugLineNum = 319;BA.debugLine="cvs1.Release";
_cvs1.Release();
 //BA.debugLineNum = 320;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public int  _getvvvv1() throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub getCurrentIndex As Int";
 //BA.debugLineNum = 200;BA.debugLine="Return mCurrentIndex";
if (true) return _vvvvv4;
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return 0;
}
public b4a.example.asflowtabmenu._asflowtabmenu_tab  _getvvvv2() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Public Sub getGlobalTabProperties As ASFlowTabMenu";
 //BA.debugLineNum = 251;BA.debugLine="Return gTabProp";
if (true) return _vvvvv5;
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public float  _getvvvv3() throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Public Sub getIconHeight As Float";
 //BA.debugLineNum = 239;BA.debugLine="Return mIconHeight";
if (true) return _vvvvv3;
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return 0f;
}
public int  _getvvvv4() throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 247;BA.debugLine="Return xpnl_TabBackground.NumberOfViews";
if (true) return _xpnl_tabbackground.getNumberOfViews();
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return 0;
}
public b4a.example.asflowtabmenu._asflowtabmenu_tab  _vv5(int _index) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Public Sub GetTabPropertiesAt(Index As Int) As ASF";
 //BA.debugLineNum = 212;BA.debugLine="Return xpnl_TabBackground.GetView(Index).Tag.As(A";
if (true) return ((b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tabbackground.GetView(_index).getTag()));
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public String  _vv6(anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Private Sub IniProps(Props As Map)";
 //BA.debugLineNum = 70;BA.debugLine="m_SelectorColor = xui.PaintOrColorToColor(Props.G";
_m_selectorcolor = _vvvvv1.PaintOrColorToColor(_props.Get((Object)("SelectorColor")));
 //BA.debugLineNum = 71;BA.debugLine="m_BackgroundColor = xui.PaintOrColorToColor(Props";
_m_backgroundcolor = _vvvvv1.PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
 //BA.debugLineNum = 73;BA.debugLine="xpnl_TabSelector.SetColorAndBorder(m_SelectorColo";
_xpnl_tabselector.SetColorAndBorder(_m_selectorcolor,(int) (0),(int) (0),__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 74;BA.debugLine="xpnl_TabBackground.Color = xui.Color_Transparent";
_xpnl_tabbackground.setColor(_vvvvv1.Color_Transparent);
 //BA.debugLineNum = 75;BA.debugLine="mBase.Color = m_BackgroundColor";
_vvvv0.setColor(_m_backgroundcolor);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 42;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 43;BA.debugLine="mEventName = EventName";
_vvvv6 = _eventname;
 //BA.debugLineNum = 44;BA.debugLine="mCallBack = Callback";
_vvvv7 = _callback;
 //BA.debugLineNum = 45;BA.debugLine="gTabProp.Initialize";
_vvvvv5.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public int  _vv7(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
 //BA.debugLineNum = 323;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
 //BA.debugLineNum = 325;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 326;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 327;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 328;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 329;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNativ";
if (true) return (int) (_cvs.MeasureStringWidth(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return 0;
}
public String  _vv0() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
b4a.example.asflowtabmenu._asflowtabmenu_tab _tabprop = null;
 //BA.debugLineNum = 219;BA.debugLine="Public Sub RefreshTabProperties";
 //BA.debugLineNum = 220;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step1 = 1;
final int limit1 = (int) (_xpnl_tabbackground.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 221;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = _xpnl_tabbackground.GetView(_i);
 //BA.debugLineNum = 222;BA.debugLine="Dim xlbl_Text As B4XView = xpnl_Tab.GetView(0)";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_tab.GetView((int) (0));
 //BA.debugLineNum = 223;BA.debugLine="Dim xiv_Icon As B4XView = xpnl_Tab.GetView(1)";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = _xpnl_tab.GetView((int) (1));
 //BA.debugLineNum = 225;BA.debugLine="Dim TabProp As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
_tabprop = (b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag());
 //BA.debugLineNum = 227;BA.debugLine="xlbl_Text.TextColor = xui.Color_White";
_xlbl_text.setTextColor(_vvvvv1.Color_White);
 //BA.debugLineNum = 228;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"LEFT\")";
_xlbl_text.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 229;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_text.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 230;BA.debugLine="xlbl_Text.Text = TabProp.Text";
_xlbl_text.setText(BA.ObjectToCharSequence(_tabprop.Text /*String*/ ));
 //BA.debugLineNum = 231;BA.debugLine="xlbl_Text.Font = xui.CreateDefaultFont(15)";
_xlbl_text.setFont(_vvvvv1.CreateDefaultFont((float) (15)));
 //BA.debugLineNum = 233;BA.debugLine="xiv_Icon.SetBitmap(TabProp.Icon.Resize(mIconHeig";
_xiv_icon.SetBitmap((android.graphics.Bitmap)(_tabprop.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_vvvvv3),(int) (_vvvvv3),__c.True).getObject()));
 }
};
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public String  _vvv1(int _index) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
b4a.example.asflowtabmenu._asflowtabmenu_tab _tab1 = null;
 //BA.debugLineNum = 177;BA.debugLine="Public Sub RemoveTab(Index As Int)";
 //BA.debugLineNum = 178;BA.debugLine="xpnl_TabBackground.GetView(Index).RemoveViewFromP";
_xpnl_tabbackground.GetView(_index).RemoveViewFromParent();
 //BA.debugLineNum = 180;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step2 = 1;
final int limit2 = (int) (_xpnl_tabbackground.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 181;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = _xpnl_tabbackground.GetView(_i);
 //BA.debugLineNum = 182;BA.debugLine="Dim Tab1 As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
_tab1 = (b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag());
 //BA.debugLineNum = 183;BA.debugLine="Tab1.Index = i";
_tab1.Index /*int*/  = _i;
 //BA.debugLineNum = 184;BA.debugLine="xpnl_Tab.Tag = Tab1";
_xpnl_tab.setTag((Object)(_tab1));
 }
};
 //BA.debugLineNum = 187;BA.debugLine="If mCurrentIndex <> Index Then";
if (_vvvvv4!=_index) { 
 //BA.debugLineNum = 188;BA.debugLine="mCurrentIndex = 0";
_vvvvv4 = (int) (0);
 //BA.debugLineNum = 189;BA.debugLine="TabClickEvent";
_vvv7();
 }else {
 //BA.debugLineNum = 191;BA.debugLine="mCurrentIndex = 0";
_vvvvv4 = (int) (0);
 };
 //BA.debugLineNum = 194;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_vvvv0.getWidth(),_vvvv0.getHeight());
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _setvvvv1(int _index) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Public Sub setCurrentIndex(Index As Int)";
 //BA.debugLineNum = 204;BA.debugLine="mCurrentIndex = Index : UpdateTabs(False)";
_vvvvv4 = _index;
 //BA.debugLineNum = 204;BA.debugLine="mCurrentIndex = Index : UpdateTabs(False)";
_vvv0(__c.False);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _setvvvv5(int _index) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Public Sub setCurrentIndexAnimated(Index As Int)";
 //BA.debugLineNum = 208;BA.debugLine="mCurrentIndex = Index : UpdateTabs(True)";
_vvvvv4 = _index;
 //BA.debugLineNum = 208;BA.debugLine="mCurrentIndex = Index : UpdateTabs(True)";
_vvv0(__c.True);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public String  _setvvvv3(float _height) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Public Sub setIconHeight(Height As Float)";
 //BA.debugLineNum = 243;BA.debugLine="mIconHeight = Height";
_vvvvv3 = _height;
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public String  _vvv5(int _index,b4a.example.asflowtabmenu._asflowtabmenu_tab _tabproperties) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Public Sub SetTabProperties(Index As Int,TabProper";
 //BA.debugLineNum = 216;BA.debugLine="xpnl_TabBackground.GetView(Index).Tag = TabProper";
_xpnl_tabbackground.GetView(_index).setTag((Object)(_tabproperties));
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public String  _vvv6(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Private Sub TabClick(xpnl_Tab As B4XView)";
 //BA.debugLineNum = 269;BA.debugLine="If mCurrentIndex <> xpnl_Tab.Tag.As(ASFlowTabMenu";
if (_vvvvv4!=((b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag())).Index /*int*/ ) { 
 //BA.debugLineNum = 270;BA.debugLine="mCurrentIndex = xpnl_Tab.Tag.As(ASFlowTabMenu_Ta";
_vvvvv4 = ((b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag())).Index /*int*/ ;
 //BA.debugLineNum = 271;BA.debugLine="TabClickEvent";
_vvv7();
 //BA.debugLineNum = 272;BA.debugLine="UpdateTabs(True)";
_vvv0(__c.True);
 };
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public String  _vvv7() throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Private Sub TabClickEvent";
 //BA.debugLineNum = 281;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TabCli";
if (_vvvvv1.SubExists(ba,_vvvv7,_vvvv6+"_TabClick",(int) (1))) { 
 //BA.debugLineNum = 282;BA.debugLine="CallSub2(mCallBack, mEventName & \"_TabClick\",mCu";
__c.CallSubNew2(ba,_vvvv7,_vvvv6+"_TabClick",(Object)(_vvvvv4));
 };
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public String  _vvv0(boolean _animated) throws Exception{
int _duration = 0;
float _maxwidth = 0f;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
b4a.example.asflowtabmenu._asflowtabmenu_tab _tab1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
int _textwidth = 0;
float _labelwidth = 0f;
float _normalpanelwidth = 0f;
 //BA.debugLineNum = 86;BA.debugLine="Private Sub UpdateTabs(Animated As Boolean)";
 //BA.debugLineNum = 87;BA.debugLine="Dim duration As Int = 0";
_duration = (int) (0);
 //BA.debugLineNum = 88;BA.debugLine="If Animated = True Then duration = 250";
if (_animated==__c.True) { 
_duration = (int) (250);};
 //BA.debugLineNum = 90;BA.debugLine="Dim MaxWidth As Float = xpnl_TabBackground.Width/";
_maxwidth = (float) (_xpnl_tabbackground.getWidth()/(double)_xpnl_tabbackground.getNumberOfViews());
 //BA.debugLineNum = 92;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step4 = 1;
final int limit4 = (int) (_xpnl_tabbackground.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 93;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = _xpnl_tabbackground.GetView(((b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tabbackground.GetView(_i).getTag())).Index /*int*/ );
 //BA.debugLineNum = 94;BA.debugLine="Dim Tab1 As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
_tab1 = (b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag());
 //BA.debugLineNum = 96;BA.debugLine="Dim xlbl_Text As B4XView = xpnl_Tab.GetView(0)";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_tab.GetView((int) (0));
 //BA.debugLineNum = 97;BA.debugLine="Dim xiv_Icon As B4XView = xpnl_Tab.GetView(1)";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = _xpnl_tab.GetView((int) (1));
 //BA.debugLineNum = 99;BA.debugLine="Dim TextWidth As Int = MeasureTextWidth(xlbl_Tex";
_textwidth = _vv7(_xlbl_text.getText(),_xlbl_text.getFont());
 //BA.debugLineNum = 100;BA.debugLine="Dim LabelWidth As Float = TextWidth + mIconHeigh";
_labelwidth = (float) (_textwidth+_vvvvv3+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 102;BA.debugLine="xpnl_Tab.SetLayoutAnimated(0,(mBase.Width/xpnl_T";
_xpnl_tab.SetLayoutAnimated((int) (0),(int) ((_vvvv0.getWidth()/(double)_xpnl_tabbackground.getNumberOfViews())*_i),(int) (0),(int) (_vvvv0.getWidth()/(double)_xpnl_tabbackground.getNumberOfViews()),_vvvv0.getHeight());
 //BA.debugLineNum = 104;BA.debugLine="If mCurrentIndex <> i Then";
if (_vvvvv4!=_i) { 
 //BA.debugLineNum = 105;BA.debugLine="Dim NormalPanelWidth As Float = mBase.Width/xpn";
_normalpanelwidth = (float) (_vvvv0.getWidth()/(double)_xpnl_tabbackground.getNumberOfViews());
 //BA.debugLineNum = 106;BA.debugLine="xlbl_Text.SetLayoutAnimated(duration,NormalPane";
_xlbl_text.SetLayoutAnimated(_duration,(int) (_normalpanelwidth/(double)2-_labelwidth/(double)2+_vvvvv3),(int) (0),(int) (_labelwidth-_vvvvv3),_xpnl_tab.getHeight());
 //BA.debugLineNum = 107;BA.debugLine="xlbl_Text.SetVisibleAnimated(duration/2,False)";
_xlbl_text.SetVisibleAnimated((int) (_duration/(double)2),__c.False);
 //BA.debugLineNum = 108;BA.debugLine="xiv_Icon.SetLayoutAnimated(duration,NormalPanel";
_xiv_icon.SetLayoutAnimated(_duration,(int) (_normalpanelwidth/(double)2-_vvvvv3/(double)2),(int) (_vvvv0.getHeight()/(double)2-_vvvvv3/(double)2),(int) (_vvvvv3),(int) (_vvvvv3));
 }else {
 //BA.debugLineNum = 117;BA.debugLine="If LabelWidth > MaxWidth Then LabelWidth = MaxW";
if (_labelwidth>_maxwidth) { 
_labelwidth = _maxwidth;};
 //BA.debugLineNum = 140;BA.debugLine="xiv_Icon.SetLayoutAnimated(duration,xpnl_Tab.Wi";
_xiv_icon.SetLayoutAnimated(_duration,(int) (_xpnl_tab.getWidth()/(double)2-_labelwidth/(double)2),(int) (_vvvv0.getHeight()/(double)2-_vvvvv3/(double)2),(int) (_vvvvv3),(int) (_vvvvv3));
 //BA.debugLineNum = 141;BA.debugLine="xlbl_Text.SetLayoutAnimated(duration,xpnl_Tab.W";
_xlbl_text.SetLayoutAnimated(_duration,(int) (_xpnl_tab.getWidth()/(double)2-_labelwidth/(double)2+_vvvvv3),(int) (0),(int) (_labelwidth-_vvvvv3-__c.DipToCurrent((int) (5))/(double)2),_xpnl_tab.getHeight());
 //BA.debugLineNum = 143;BA.debugLine="xlbl_Text.SetVisibleAnimated(duration,True)";
_xlbl_text.SetVisibleAnimated(_duration,__c.True);
 //BA.debugLineNum = 145;BA.debugLine="xpnl_TabSelector.SetLayoutAnimated(duration,xpn";
_xpnl_tabselector.SetLayoutAnimated(_duration,(int) (_xpnl_tab.getLeft()+_xpnl_tab.getWidth()/(double)2-_labelwidth/(double)2),(int) (_xpnl_tab.getHeight()/(double)2-_vvvvv3/(double)2),(int) (_labelwidth),(int) (_vvvvv3));
 };
 //BA.debugLineNum = 148;BA.debugLine="xiv_Icon.SetBitmap(Tab1.Icon.Resize(mIconHeight,";
_xiv_icon.SetBitmap((android.graphics.Bitmap)(_tab1.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_vvvvv3),(int) (_vvvvv3),__c.True).getObject()));
 }
};
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_tab_click() throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Private Sub xpnl_Tab_Click";
 //BA.debugLineNum = 261;BA.debugLine="TabClick(Sender)";
_vvv6((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
