
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class asflowtabmenu {
    public static RemoteObject myClass;
	public asflowtabmenu() {
	}
    public static PCBA staticBA = new PCBA(null, asflowtabmenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _xpnl_tabbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_tabselector = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _miconheight = RemoteObject.createImmutable(0f);
public static RemoteObject _mcurrentindex = RemoteObject.createImmutable(0);
public static RemoteObject _m_backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_selectorcolor = RemoteObject.createImmutable(0);
public static RemoteObject _gtabprop = RemoteObject.declareNull("b4a.example.asflowtabmenu._asflowtabmenu_tab");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"gTabProp",_ref.getField(false, "_gtabprop"),"m_BackgroundColor",_ref.getField(false, "_m_backgroundcolor"),"m_SelectorColor",_ref.getField(false, "_m_selectorcolor"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mCurrentIndex",_ref.getField(false, "_mcurrentindex"),"mEventName",_ref.getField(false, "_meventname"),"mIconHeight",_ref.getField(false, "_miconheight"),"Tag",_ref.getField(false, "_tag"),"xpnl_TabBackground",_ref.getField(false, "_xpnl_tabbackground"),"xpnl_TabSelector",_ref.getField(false, "_xpnl_tabselector"),"xui",_ref.getField(false, "_xui")};
}
}