package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Layout/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="HomePanel.SetLeftAndRight(0,100%x)"[Layout/General script]
views.get("homepanel").vw.setLeft((int)(0d));
views.get("homepanel").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 5;BA.debugLine="HomePanel.SetTopAndBottom(0,89.5%y)"[Layout/General script]
views.get("homepanel").vw.setTop((int)(0d));
views.get("homepanel").vw.setHeight((int)((89.5d / 100 * height) - (0d)));
//BA.debugLineNum = 7;BA.debugLine="Panel1.SetLeftAndRight(100%x,200%x)"[Layout/General script]
views.get("panel1").vw.setLeft((int)((100d / 100 * width)));
views.get("panel1").vw.setWidth((int)((200d / 100 * width) - ((100d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="Panel1.SetTopAndBottom(0,89.5%y)"[Layout/General script]
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((89.5d / 100 * height) - (0d)));
//BA.debugLineNum = 9;BA.debugLine="Panel2.SetLeftAndRight(200%x,300%x)"[Layout/General script]
views.get("panel2").vw.setLeft((int)((200d / 100 * width)));
views.get("panel2").vw.setWidth((int)((300d / 100 * width) - ((200d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="Panel2.SetTopAndBottom(0,89.5%y)"[Layout/General script]
views.get("panel2").vw.setTop((int)(0d));
views.get("panel2").vw.setHeight((int)((89.5d / 100 * height) - (0d)));
//BA.debugLineNum = 12;BA.debugLine="Logo.SetTopAndBottom(25%y,65%y)"[Layout/General script]
views.get("logo").vw.setTop((int)((25d / 100 * height)));
views.get("logo").vw.setHeight((int)((65d / 100 * height) - ((25d / 100 * height))));
//BA.debugLineNum = 13;BA.debugLine="Logo.SetLeftAndRight(10%x,90%x)"[Layout/General script]
views.get("logo").vw.setLeft((int)((10d / 100 * width)));
views.get("logo").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="copyright.SetTopAndBottom(80%y,20%y)"[Layout/General script]
views.get("copyright").vw.setTop((int)((80d / 100 * height)));
views.get("copyright").vw.setHeight((int)((20d / 100 * height) - ((80d / 100 * height))));
//BA.debugLineNum = 17;BA.debugLine="copyright.SetLeftAndRight(30%x,65%x)"[Layout/General script]
views.get("copyright").vw.setLeft((int)((30d / 100 * width)));
views.get("copyright").vw.setWidth((int)((65d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 19;BA.debugLine="ASFlowTabMenu1.SetTopAndBottom(89.5%y,100%y)"[Layout/General script]
views.get("asflowtabmenu1").vw.setTop((int)((89.5d / 100 * height)));
views.get("asflowtabmenu1").vw.setHeight((int)((100d / 100 * height) - ((89.5d / 100 * height))));
//BA.debugLineNum = 20;BA.debugLine="ASFlowTabMenu1.SetLeftAndRight(0,100%x)"[Layout/General script]
views.get("asflowtabmenu1").vw.setLeft((int)(0d));
views.get("asflowtabmenu1").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 23;BA.debugLine="units.SetTopAndBottom(6.5%y,0)"[Layout/General script]
views.get("units").vw.setTop((int)((6.5d / 100 * height)));
views.get("units").vw.setHeight((int)(0d - ((6.5d / 100 * height))));
//BA.debugLineNum = 24;BA.debugLine="units.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("units").vw.setLeft((int)((40d / 100 * width)));
views.get("units").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 28;BA.debugLine="unit1.SetTopAndBottom(15%y,20%y)"[Layout/General script]
views.get("unit1").vw.setTop((int)((15d / 100 * height)));
views.get("unit1").vw.setHeight((int)((20d / 100 * height) - ((15d / 100 * height))));
//BA.debugLineNum = 29;BA.debugLine="unit2.SetTopAndBottom(23%y,28%y)"[Layout/General script]
views.get("unit2").vw.setTop((int)((23d / 100 * height)));
views.get("unit2").vw.setHeight((int)((28d / 100 * height) - ((23d / 100 * height))));
//BA.debugLineNum = 30;BA.debugLine="unit3.SetTopAndBottom(31%y,36%y)"[Layout/General script]
views.get("unit3").vw.setTop((int)((31d / 100 * height)));
views.get("unit3").vw.setHeight((int)((36d / 100 * height) - ((31d / 100 * height))));
//BA.debugLineNum = 31;BA.debugLine="unit4.SetTopAndBottom(39%y,44%y)"[Layout/General script]
views.get("unit4").vw.setTop((int)((39d / 100 * height)));
views.get("unit4").vw.setHeight((int)((44d / 100 * height) - ((39d / 100 * height))));
//BA.debugLineNum = 32;BA.debugLine="unit5.SetTopAndBottom(47%y,52%y)"[Layout/General script]
views.get("unit5").vw.setTop((int)((47d / 100 * height)));
views.get("unit5").vw.setHeight((int)((52d / 100 * height) - ((47d / 100 * height))));
//BA.debugLineNum = 33;BA.debugLine="unit6.SetTopAndBottom(55%y,60%y)"[Layout/General script]
views.get("unit6").vw.setTop((int)((55d / 100 * height)));
views.get("unit6").vw.setHeight((int)((60d / 100 * height) - ((55d / 100 * height))));
//BA.debugLineNum = 34;BA.debugLine="unit7.SetTopAndBottom(63%y,68%y)"[Layout/General script]
views.get("unit7").vw.setTop((int)((63d / 100 * height)));
views.get("unit7").vw.setHeight((int)((68d / 100 * height) - ((63d / 100 * height))));
//BA.debugLineNum = 35;BA.debugLine="unit8.SetTopAndBottom(71%y,76%y)"[Layout/General script]
views.get("unit8").vw.setTop((int)((71d / 100 * height)));
views.get("unit8").vw.setHeight((int)((76d / 100 * height) - ((71d / 100 * height))));
//BA.debugLineNum = 39;BA.debugLine="unit1.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit1").vw.setLeft((int)((40d / 100 * width)));
views.get("unit1").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="unit2.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit2").vw.setLeft((int)((40d / 100 * width)));
views.get("unit2").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 41;BA.debugLine="unit3.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit3").vw.setLeft((int)((40d / 100 * width)));
views.get("unit3").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 42;BA.debugLine="unit4.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit4").vw.setLeft((int)((40d / 100 * width)));
views.get("unit4").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 43;BA.debugLine="unit4.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit4").vw.setLeft((int)((40d / 100 * width)));
views.get("unit4").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 44;BA.debugLine="unit5.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit5").vw.setLeft((int)((40d / 100 * width)));
views.get("unit5").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 45;BA.debugLine="unit6.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit6").vw.setLeft((int)((40d / 100 * width)));
views.get("unit6").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 46;BA.debugLine="unit7.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit7").vw.setLeft((int)((40d / 100 * width)));
views.get("unit7").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 47;BA.debugLine="unit8.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit8").vw.setLeft((int)((40d / 100 * width)));
views.get("unit8").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));

}
}