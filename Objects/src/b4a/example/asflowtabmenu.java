package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asflowtabmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.asflowtabmenu");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tabbackground = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tabselector = null;
public float _miconheight = 0f;
public int _mcurrentindex = 0;
public int _m_backgroundcolor = 0;
public int _m_selectorcolor = 0;
public b4a.example.asflowtabmenu._asflowtabmenu_tab _gtabprop = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _addtab(b4a.example.asflowtabmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "addtab", true))
	 {return ((String) Debug.delegate(ba, "addtab", new Object[] {_icon,_text}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub AddTab(Icon As B4XBitmap,Text As String";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim xpnl_Tab As B4XView = xui.CreatePanel(\"xpnl_T";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_Tab");
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="xpnl_Tab.SetLayoutAnimated(0,0,0,0,0)";
_xpnl_tab.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Dim xlbl_Text As B4XView = CreateLabel(\"\")";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Dim xiv_Icon As B4XView = CreateImageView(\"\")";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="xpnl_Tab.AddView(xlbl_Text,0,0,0,0)";
_xpnl_tab.AddView((android.view.View)(_xlbl_text.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="xpnl_Tab.AddView(xiv_Icon,0,0,0,0)";
_xpnl_tab.AddView((android.view.View)(_xiv_icon.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="xlbl_Text.TextColor = gTabProp.TextColor";
_xlbl_text.setTextColor(__ref._gtabprop /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/ .TextColor /*int*/ );
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"LEFT\")";
_xlbl_text.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="xlbl_Text.Text = Text";
_xlbl_text.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="xlbl_Text.Font = gTabProp.xFont";
_xlbl_text.setFont(__ref._gtabprop /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="xpnl_Tab.Tag = CreateASFlowTabMenu_Tab(xpnl_TabBa";
_xpnl_tab.setTag((Object)(__ref._createasflowtabmenu_tab /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/ (null,__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews(),_icon,_text,__ref._gtabprop /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/ .TextColor /*int*/ ,__ref._gtabprop /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="xpnl_TabBackground.AddView(xpnl_Tab,0,0,0,0)";
__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xpnl_tab.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2162710;
 //BA.debugLineNum = 2162710;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _fonttobitmap(b4a.example.asflowtabmenu __ref,String _text,boolean _ismaterialicons,float _fontsize,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "fonttobitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "fonttobitmap", new Object[] {_text,_ismaterialicons,_fontsize,_color}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(_p);
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="If IsMaterialIcons Then fnt = xui.CreateMaterialI";
if (_ismaterialicons) { 
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(_fontsize);}
else {
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome(_fontsize);};
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText(ba,_text,_cvs1.getTargetRect().getCenterX(),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="cvs1.Release";
_cvs1.Release();
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.asflowtabmenu __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _tmp_lbl = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim tmp_lbl As Label";
_tmp_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="tmp_lbl.Initialize(EventName)";
_tmp_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="tmp_lbl.SingleLine = False";
_tmp_lbl.setSingleLine(__c.False);
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="tmp_lbl.Ellipsize = \"END\"";
_tmp_lbl.setEllipsize("END");
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="Return tmp_lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_lbl.getObject()));
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4a.example.asflowtabmenu __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "createimageview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _tmp_iv = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim tmp_iv As ImageView";
_tmp_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="tmp_iv.Initialize(EventName)";
_tmp_iv.Initialize(ba,_eventname);
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="Return tmp_iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_iv.getObject()));
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="End Sub";
return null;
}
public b4a.example.asflowtabmenu._asflowtabmenu_tab  _createasflowtabmenu_tab(b4a.example.asflowtabmenu __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,String _text,int _textcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "createasflowtabmenu_tab", true))
	 {return ((b4a.example.asflowtabmenu._asflowtabmenu_tab) Debug.delegate(ba, "createasflowtabmenu_tab", new Object[] {_index,_icon,_text,_textcolor,_xfont}));}
b4a.example.asflowtabmenu._asflowtabmenu_tab _t1 = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub CreateASFlowTabMenu_Tab (Index As Int,";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim t1 As ASFlowTabMenu_Tab";
_t1 = new b4a.example.asflowtabmenu._asflowtabmenu_tab();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="t1.Index = Index";
_t1.Index /*int*/  = _index;
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="t1.Icon = Icon";
_t1.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _icon;
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="End Sub";
return null;
}
public String  _base_resize(b4a.example.asflowtabmenu __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="xpnl_TabBackground.SetLayoutAnimated(0,0,0,Width,";
__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="UpdateTabs(False)";
__ref._updatetabs /*String*/ (null,__c.False);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="End Sub";
return "";
}
public String  _updatetabs(b4a.example.asflowtabmenu __ref,boolean _animated) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "updatetabs", true))
	 {return ((String) Debug.delegate(ba, "updatetabs", new Object[] {_animated}));}
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
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub UpdateTabs(Animated As Boolean)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim duration As Int = 0";
_duration = (int) (0);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If Animated = True Then duration = 250";
if (_animated==__c.True) { 
_duration = (int) (250);};
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim MaxWidth As Float = xpnl_TabBackground.Width/";
_maxwidth = (float) (__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews());
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = __ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(((b4a.example.asflowtabmenu._asflowtabmenu_tab)(__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).getTag())).Index /*int*/ );
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Dim Tab1 As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
_tab1 = (b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag());
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Dim xlbl_Text As B4XView = xpnl_Tab.GetView(0)";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_tab.GetView((int) (0));
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Dim xiv_Icon As B4XView = xpnl_Tab.GetView(1)";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = _xpnl_tab.GetView((int) (1));
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="Dim TextWidth As Int = MeasureTextWidth(xlbl_Tex";
_textwidth = __ref._measuretextwidth /*int*/ (null,_xlbl_text.getText(),_xlbl_text.getFont());
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="Dim LabelWidth As Float = TextWidth + mIconHeigh";
_labelwidth = (float) (_textwidth+__ref._miconheight /*float*/ +__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="xpnl_Tab.SetLayoutAnimated(0,(mBase.Width/xpnl_T";
_xpnl_tab.SetLayoutAnimated((int) (0),(int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews())*_i),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="If mCurrentIndex <> i Then";
if (__ref._mcurrentindex /*int*/ !=_i) { 
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="Dim NormalPanelWidth As Float = mBase.Width/xpn";
_normalpanelwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews());
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="xlbl_Text.SetLayoutAnimated(duration,NormalPane";
_xlbl_text.SetLayoutAnimated(_duration,(int) (_normalpanelwidth/(double)2-_labelwidth/(double)2+__ref._miconheight /*float*/ ),(int) (0),(int) (_labelwidth-__ref._miconheight /*float*/ ),_xpnl_tab.getHeight());
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="xlbl_Text.SetVisibleAnimated(duration/2,False)";
_xlbl_text.SetVisibleAnimated((int) (_duration/(double)2),__c.False);
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="xiv_Icon.SetLayoutAnimated(duration,NormalPanel";
_xiv_icon.SetLayoutAnimated(_duration,(int) (_normalpanelwidth/(double)2-__ref._miconheight /*float*/ /(double)2),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._miconheight /*float*/ /(double)2),(int) (__ref._miconheight /*float*/ ),(int) (__ref._miconheight /*float*/ ));
 }else {
RDebugUtils.currentLine=2097183;
 //BA.debugLineNum = 2097183;BA.debugLine="If LabelWidth > MaxWidth Then LabelWidth = MaxW";
if (_labelwidth>_maxwidth) { 
_labelwidth = _maxwidth;};
RDebugUtils.currentLine=2097206;
 //BA.debugLineNum = 2097206;BA.debugLine="xiv_Icon.SetLayoutAnimated(duration,xpnl_Tab.Wi";
_xiv_icon.SetLayoutAnimated(_duration,(int) (_xpnl_tab.getWidth()/(double)2-_labelwidth/(double)2),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._miconheight /*float*/ /(double)2),(int) (__ref._miconheight /*float*/ ),(int) (__ref._miconheight /*float*/ ));
RDebugUtils.currentLine=2097207;
 //BA.debugLineNum = 2097207;BA.debugLine="xlbl_Text.SetLayoutAnimated(duration,xpnl_Tab.W";
_xlbl_text.SetLayoutAnimated(_duration,(int) (_xpnl_tab.getWidth()/(double)2-_labelwidth/(double)2+__ref._miconheight /*float*/ ),(int) (0),(int) (_labelwidth-__ref._miconheight /*float*/ -__c.DipToCurrent((int) (5))/(double)2),_xpnl_tab.getHeight());
RDebugUtils.currentLine=2097209;
 //BA.debugLineNum = 2097209;BA.debugLine="xlbl_Text.SetVisibleAnimated(duration,True)";
_xlbl_text.SetVisibleAnimated(_duration,__c.True);
RDebugUtils.currentLine=2097211;
 //BA.debugLineNum = 2097211;BA.debugLine="xpnl_TabSelector.SetLayoutAnimated(duration,xpn";
__ref._xpnl_tabselector /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_duration,(int) (_xpnl_tab.getLeft()+_xpnl_tab.getWidth()/(double)2-_labelwidth/(double)2),(int) (_xpnl_tab.getHeight()/(double)2-__ref._miconheight /*float*/ /(double)2),(int) (_labelwidth),(int) (__ref._miconheight /*float*/ ));
 };
RDebugUtils.currentLine=2097214;
 //BA.debugLineNum = 2097214;BA.debugLine="xiv_Icon.SetBitmap(Tab1.Icon.Resize(mIconHeight,";
_xiv_icon.SetBitmap((android.graphics.Bitmap)(_tab1.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (__ref._miconheight /*float*/ ),(int) (__ref._miconheight /*float*/ ),__c.True).getObject()));
 }
};
RDebugUtils.currentLine=2097217;
 //BA.debugLineNum = 2097217;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.asflowtabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Private xpnl_TabBackground As B4XView";
_xpnl_tabbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="Private xpnl_TabSelector As B4XView";
_xpnl_tabselector = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="Private mIconHeight As Float = 35dip";
_miconheight = (float) (__c.DipToCurrent((int) (35)));
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Private mCurrentIndex As Int = 0";
_mcurrentindex = (int) (0);
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Private m_BackgroundColor As Int";
_m_backgroundcolor = 0;
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Private m_SelectorColor As Int";
_m_selectorcolor = 0;
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="Type ASFlowTabMenu_Tab (Index As Int,Icon As B4XB";
;
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="Private gTabProp As ASFlowTabMenu_Tab";
_gtabprop = new b4a.example.asflowtabmenu._asflowtabmenu_tab();
RDebugUtils.currentLine=1769490;
 //BA.debugLineNum = 1769490;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.asflowtabmenu __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="xpnl_TabBackground = xui.CreatePanel(\"\")";
__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="xpnl_TabSelector = xui.CreatePanel(\"\")";
__ref._xpnl_tabselector /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="mBase.AddView(xpnl_TabSelector,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_tabselector /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="mBase.AddView(xpnl_TabBackground,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="IniProps(Props)";
__ref._iniprops /*String*/ (null,_props);
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="gTabProp = CreateASFlowTabMenu_Tab(-1,Null,\"\",xui";
__ref._gtabprop /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/  = __ref._createasflowtabmenu_tab /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/ (null,(int) (-1),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.Null)),"",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15)));
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="Base_Resize(mBase.width,mBase.height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="End Sub";
return "";
}
public String  _iniprops(b4a.example.asflowtabmenu __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "iniprops", true))
	 {return ((String) Debug.delegate(ba, "iniprops", new Object[] {_props}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub IniProps(Props As Map)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="m_SelectorColor = xui.PaintOrColorToColor(Props.G";
__ref._m_selectorcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectorColor")));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="m_BackgroundColor = xui.PaintOrColorToColor(Props";
__ref._m_backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="xpnl_TabSelector.SetColorAndBorder(m_SelectorColo";
__ref._xpnl_tabselector /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._m_selectorcolor /*int*/ ,(int) (0),(int) (0),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="xpnl_TabBackground.Color = xui.Color_Transparent";
__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="mBase.Color = m_BackgroundColor";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_backgroundcolor /*int*/ );
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="End Sub";
return "";
}
public int  _getcurrentindex(b4a.example.asflowtabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "getcurrentindex", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentindex", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub getCurrentIndex As Int";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return mCurrentIndex";
if (true) return __ref._mcurrentindex /*int*/ ;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return 0;
}
public b4a.example.asflowtabmenu._asflowtabmenu_tab  _getglobaltabproperties(b4a.example.asflowtabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "getglobaltabproperties", true))
	 {return ((b4a.example.asflowtabmenu._asflowtabmenu_tab) Debug.delegate(ba, "getglobaltabproperties", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub getGlobalTabProperties As ASFlowTabMenu";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Return gTabProp";
if (true) return __ref._gtabprop /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/ ;
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return null;
}
public float  _geticonheight(b4a.example.asflowtabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "geticonheight", true))
	 {return ((Float) Debug.delegate(ba, "geticonheight", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub getIconHeight As Float";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Return mIconHeight";
if (true) return __ref._miconheight /*float*/ ;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return 0f;
}
public int  _getsize(b4a.example.asflowtabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Return xpnl_TabBackground.NumberOfViews";
if (true) return __ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return 0;
}
public b4a.example.asflowtabmenu._asflowtabmenu_tab  _gettabpropertiesat(b4a.example.asflowtabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "gettabpropertiesat", true))
	 {return ((b4a.example.asflowtabmenu._asflowtabmenu_tab) Debug.delegate(ba, "gettabpropertiesat", new Object[] {_index}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub GetTabPropertiesAt(Index As Int) As ASF";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return xpnl_TabBackground.GetView(Index).Tag.As(A";
if (true) return ((b4a.example.asflowtabmenu._asflowtabmenu_tab)(__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag()));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.asflowtabmenu __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="gTabProp.Initialize";
__ref._gtabprop /*b4a.example.asflowtabmenu._asflowtabmenu_tab*/ .Initialize();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
public int  _measuretextwidth(b4a.example.asflowtabmenu __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "measuretextwidth", true))
	 {return ((Integer) Debug.delegate(ba, "measuretextwidth", new Object[] {_text,_font1}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNativ";
if (true) return (int) (_cvs.MeasureStringWidth(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
RDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="End Sub";
return 0;
}
public String  _refreshtabproperties(b4a.example.asflowtabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "refreshtabproperties", true))
	 {return ((String) Debug.delegate(ba, "refreshtabproperties", null));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
b4a.example.asflowtabmenu._asflowtabmenu_tab _tabprop = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub RefreshTabProperties";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = __ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i);
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim xlbl_Text As B4XView = xpnl_Tab.GetView(0)";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_tab.GetView((int) (0));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Dim xiv_Icon As B4XView = xpnl_Tab.GetView(1)";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = _xpnl_tab.GetView((int) (1));
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Dim TabProp As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
_tabprop = (b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag());
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="xlbl_Text.TextColor = xui.Color_White";
_xlbl_text.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"LEFT\")";
_xlbl_text.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="xlbl_Text.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_text.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="xlbl_Text.Text = TabProp.Text";
_xlbl_text.setText(BA.ObjectToCharSequence(_tabprop.Text /*String*/ ));
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="xlbl_Text.Font = xui.CreateDefaultFont(15)";
_xlbl_text.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15)));
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="xiv_Icon.SetBitmap(TabProp.Icon.Resize(mIconHeig";
_xiv_icon.SetBitmap((android.graphics.Bitmap)(_tabprop.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (__ref._miconheight /*float*/ ),(int) (__ref._miconheight /*float*/ ),__c.True).getObject()));
 }
};
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="End Sub";
return "";
}
public String  _removetab(b4a.example.asflowtabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "removetab", true))
	 {return ((String) Debug.delegate(ba, "removetab", new Object[] {_index}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
b4a.example.asflowtabmenu._asflowtabmenu_tab _tab1 = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub RemoveTab(Index As Int)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="xpnl_TabBackground.GetView(Index).RemoveViewFromP";
__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).RemoveViewFromParent();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = __ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Dim Tab1 As ASFlowTabMenu_Tab = xpnl_Tab.Tag";
_tab1 = (b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag());
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Tab1.Index = i";
_tab1.Index /*int*/  = _i;
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="xpnl_Tab.Tag = Tab1";
_xpnl_tab.setTag((Object)(_tab1));
 }
};
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="If mCurrentIndex <> Index Then";
if (__ref._mcurrentindex /*int*/ !=_index) { 
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="mCurrentIndex = 0";
__ref._mcurrentindex /*int*/  = (int) (0);
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="TabClickEvent";
__ref._tabclickevent /*String*/ (null);
 }else {
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="mCurrentIndex = 0";
__ref._mcurrentindex /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="End Sub";
return "";
}
public String  _tabclickevent(b4a.example.asflowtabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "tabclickevent", true))
	 {return ((String) Debug.delegate(ba, "tabclickevent", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub TabClickEvent";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TabCli";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TabClick",(int) (1))) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="CallSub2(mCallBack, mEventName & \"_TabClick\",mCu";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TabClick",(Object)(__ref._mcurrentindex /*int*/ ));
 };
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentindex(b4a.example.asflowtabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "setcurrentindex", true))
	 {return ((String) Debug.delegate(ba, "setcurrentindex", new Object[] {_index}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub setCurrentIndex(Index As Int)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="mCurrentIndex = Index : UpdateTabs(False)";
__ref._mcurrentindex /*int*/  = _index;
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="mCurrentIndex = Index : UpdateTabs(False)";
__ref._updatetabs /*String*/ (null,__c.False);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentindexanimated(b4a.example.asflowtabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "setcurrentindexanimated", true))
	 {return ((String) Debug.delegate(ba, "setcurrentindexanimated", new Object[] {_index}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub setCurrentIndexAnimated(Index As Int)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="mCurrentIndex = Index : UpdateTabs(True)";
__ref._mcurrentindex /*int*/  = _index;
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="mCurrentIndex = Index : UpdateTabs(True)";
__ref._updatetabs /*String*/ (null,__c.True);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public String  _seticonheight(b4a.example.asflowtabmenu __ref,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "seticonheight", true))
	 {return ((String) Debug.delegate(ba, "seticonheight", new Object[] {_height}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub setIconHeight(Height As Float)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="mIconHeight = Height";
__ref._miconheight /*float*/  = _height;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public String  _settabproperties(b4a.example.asflowtabmenu __ref,int _index,b4a.example.asflowtabmenu._asflowtabmenu_tab _tabproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "settabproperties", true))
	 {return ((String) Debug.delegate(ba, "settabproperties", new Object[] {_index,_tabproperties}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub SetTabProperties(Index As Int,TabProper";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="xpnl_TabBackground.GetView(Index).Tag = TabProper";
__ref._xpnl_tabbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).setTag((Object)(_tabproperties));
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public String  _tabclick(b4a.example.asflowtabmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "tabclick", true))
	 {return ((String) Debug.delegate(ba, "tabclick", new Object[] {_xpnl_tab}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub TabClick(xpnl_Tab As B4XView)";
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="If mCurrentIndex <> xpnl_Tab.Tag.As(ASFlowTabMenu";
if (__ref._mcurrentindex /*int*/ !=((b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag())).Index /*int*/ ) { 
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="mCurrentIndex = xpnl_Tab.Tag.As(ASFlowTabMenu_Ta";
__ref._mcurrentindex /*int*/  = ((b4a.example.asflowtabmenu._asflowtabmenu_tab)(_xpnl_tab.getTag())).Index /*int*/ ;
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="TabClickEvent";
__ref._tabclickevent /*String*/ (null);
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="UpdateTabs(True)";
__ref._updatetabs /*String*/ (null,__c.True);
 };
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_tab_click(b4a.example.asflowtabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asflowtabmenu";
if (Debug.shouldDelegate(ba, "xpnl_tab_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_tab_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub xpnl_Tab_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="TabClick(Sender)";
__ref._tabclick /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
}