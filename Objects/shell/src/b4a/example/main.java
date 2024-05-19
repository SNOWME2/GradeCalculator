
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _homepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _asflowtabmenu1 = RemoteObject.declareNull("b4a.example.asflowtabmenu");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _grade1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _grade2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _grade3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _grade4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _grade5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _grade6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _grade7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _grade8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _unit1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _unit2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _unit3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _unit4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _unit6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _unit7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _unit8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _unit5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _gwa = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _u1 = RemoteObject.createImmutable(0f);
public static RemoteObject _u2 = RemoteObject.createImmutable(0f);
public static RemoteObject _u3 = RemoteObject.createImmutable(0f);
public static RemoteObject _u4 = RemoteObject.createImmutable(0f);
public static RemoteObject _u5 = RemoteObject.createImmutable(0f);
public static RemoteObject _u6 = RemoteObject.createImmutable(0f);
public static RemoteObject _u7 = RemoteObject.createImmutable(0f);
public static RemoteObject _u8 = RemoteObject.createImmutable(0f);
public static RemoteObject _g1 = RemoteObject.createImmutable(0f);
public static RemoteObject _g2 = RemoteObject.createImmutable(0f);
public static RemoteObject _g3 = RemoteObject.createImmutable(0f);
public static RemoteObject _g4 = RemoteObject.createImmutable(0f);
public static RemoteObject _g5 = RemoteObject.createImmutable(0f);
public static RemoteObject _g6 = RemoteObject.createImmutable(0f);
public static RemoteObject _g7 = RemoteObject.createImmutable(0f);
public static RemoteObject _g8 = RemoteObject.createImmutable(0f);
public static RemoteObject _subtotal1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _subtotal2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _subtotal3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _subtotal4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _subtotal5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _subtotal6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _subtotal7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _subtotal8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _totalsubtotal = RemoteObject.createImmutable(0);
public static RemoteObject _voice = RemoteObject.declareNull("anywheresoftware.b4a.obejcts.TTS");
public static RemoteObject _clear = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"ASFlowTabMenu1",main.mostCurrent._asflowtabmenu1,"clear",main.mostCurrent._clear,"g1",main._g1,"g2",main._g2,"g3",main._g3,"g4",main._g4,"g5",main._g5,"g6",main._g6,"g7",main._g7,"g8",main._g8,"grade1",main.mostCurrent._grade1,"grade2",main.mostCurrent._grade2,"grade3",main.mostCurrent._grade3,"grade4",main.mostCurrent._grade4,"grade5",main.mostCurrent._grade5,"grade6",main.mostCurrent._grade6,"grade7",main.mostCurrent._grade7,"grade8",main.mostCurrent._grade8,"GWA",main.mostCurrent._gwa,"HomePanel",main.mostCurrent._homepanel,"Panel1",main.mostCurrent._panel1,"Panel2",main.mostCurrent._panel2,"Starter",Debug.moduleToString(b4a.example.starter.class),"subtotal1",main.mostCurrent._subtotal1,"subtotal2",main.mostCurrent._subtotal2,"subtotal3",main.mostCurrent._subtotal3,"subtotal4",main.mostCurrent._subtotal4,"subtotal5",main.mostCurrent._subtotal5,"subtotal6",main.mostCurrent._subtotal6,"subtotal7",main.mostCurrent._subtotal7,"subtotal8",main.mostCurrent._subtotal8,"totalSubtotal",main._totalsubtotal,"u1",main._u1,"u2",main._u2,"u3",main._u3,"u4",main._u4,"u5",main._u5,"u6",main._u6,"u7",main._u7,"u8",main._u8,"unit1",main.mostCurrent._unit1,"unit2",main.mostCurrent._unit2,"unit3",main.mostCurrent._unit3,"unit4",main.mostCurrent._unit4,"unit5",main.mostCurrent._unit5,"unit6",main.mostCurrent._unit6,"unit7",main.mostCurrent._unit7,"unit8",main.mostCurrent._unit8,"voice",main.mostCurrent._voice,"xui",main._xui};
}
}