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
//BA.debugLineNum = 4;BA.debugLine="ASFlowTabMenu1.SetTopAndBottom(89.5%y,100%y)"[Layout/General script]
views.get("asflowtabmenu1").vw.setTop((int)((89.5d / 100 * height)));
views.get("asflowtabmenu1").vw.setHeight((int)((100d / 100 * height) - ((89.5d / 100 * height))));
//BA.debugLineNum = 5;BA.debugLine="ASFlowTabMenu1.SetLeftAndRight(0,100%x)"[Layout/General script]
views.get("asflowtabmenu1").vw.setLeft((int)(0d));
views.get("asflowtabmenu1").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 7;BA.debugLine="HomePanel.SetLeftAndRight(0,100%x)"[Layout/General script]
views.get("homepanel").vw.setLeft((int)(0d));
views.get("homepanel").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 8;BA.debugLine="HomePanel.SetTopAndBottom(0,89.5%y)"[Layout/General script]
views.get("homepanel").vw.setTop((int)(0d));
views.get("homepanel").vw.setHeight((int)((89.5d / 100 * height) - (0d)));
//BA.debugLineNum = 10;BA.debugLine="Panel1.SetLeftAndRight(100%x,200%x)"[Layout/General script]
views.get("panel1").vw.setLeft((int)((100d / 100 * width)));
views.get("panel1").vw.setWidth((int)((200d / 100 * width) - ((100d / 100 * width))));
//BA.debugLineNum = 11;BA.debugLine="Panel1.SetTopAndBottom(0,89.5%y)"[Layout/General script]
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((89.5d / 100 * height) - (0d)));
//BA.debugLineNum = 12;BA.debugLine="Panel2.SetLeftAndRight(200%x,300%x)"[Layout/General script]
views.get("panel2").vw.setLeft((int)((200d / 100 * width)));
views.get("panel2").vw.setWidth((int)((300d / 100 * width) - ((200d / 100 * width))));
//BA.debugLineNum = 13;BA.debugLine="Panel2.SetTopAndBottom(0,89.5%y)"[Layout/General script]
views.get("panel2").vw.setTop((int)(0d));
views.get("panel2").vw.setHeight((int)((89.5d / 100 * height) - (0d)));
//BA.debugLineNum = 15;BA.debugLine="Logo.SetTopAndBottom(25%y,65%y)"[Layout/General script]
views.get("logo").vw.setTop((int)((25d / 100 * height)));
views.get("logo").vw.setHeight((int)((65d / 100 * height) - ((25d / 100 * height))));
//BA.debugLineNum = 16;BA.debugLine="Logo.SetLeftAndRight(10%x,90%x)"[Layout/General script]
views.get("logo").vw.setLeft((int)((10d / 100 * width)));
views.get("logo").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 20;BA.debugLine="copyright.SetTopAndBottom(80%y,20%y)"[Layout/General script]
views.get("copyright").vw.setTop((int)((80d / 100 * height)));
views.get("copyright").vw.setHeight((int)((20d / 100 * height) - ((80d / 100 * height))));
//BA.debugLineNum = 21;BA.debugLine="copyright.SetLeftAndRight(30%x,65%x)"[Layout/General script]
views.get("copyright").vw.setLeft((int)((30d / 100 * width)));
views.get("copyright").vw.setWidth((int)((65d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 24;BA.debugLine="copyright2.SetTopAndBottom(80%y,20%y)"[Layout/General script]
views.get("copyright2").vw.setTop((int)((80d / 100 * height)));
views.get("copyright2").vw.setHeight((int)((20d / 100 * height) - ((80d / 100 * height))));
//BA.debugLineNum = 25;BA.debugLine="copyright2.SetLeftAndRight(30%x,65%x)"[Layout/General script]
views.get("copyright2").vw.setLeft((int)((30d / 100 * width)));
views.get("copyright2").vw.setWidth((int)((65d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 27;BA.debugLine="title.SetTopAndBottom(3%y,0)"[Layout/General script]
views.get("title").vw.setTop((int)((3d / 100 * height)));
views.get("title").vw.setHeight((int)(0d - ((3d / 100 * height))));
//BA.debugLineNum = 28;BA.debugLine="title.SetLeftAndRight(25%x,75%x)"[Layout/General script]
views.get("title").vw.setLeft((int)((25d / 100 * width)));
views.get("title").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
//BA.debugLineNum = 30;BA.debugLine="aboutus.SetLeftAndRight(25%x,75%x)"[Layout/General script]
views.get("aboutus").vw.setLeft((int)((25d / 100 * width)));
views.get("aboutus").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="aboutus.SetTopAndBottom(10%y,0)"[Layout/General script]
views.get("aboutus").vw.setTop((int)((10d / 100 * height)));
views.get("aboutus").vw.setHeight((int)(0d - ((10d / 100 * height))));
//BA.debugLineNum = 35;BA.debugLine="units.SetTopAndBottom(10%y,0)"[Layout/General script]
views.get("units").vw.setTop((int)((10d / 100 * height)));
views.get("units").vw.setHeight((int)(0d - ((10d / 100 * height))));
//BA.debugLineNum = 36;BA.debugLine="units.SetLeftAndRight(38%x,60%x)"[Layout/General script]
views.get("units").vw.setLeft((int)((38d / 100 * width)));
views.get("units").vw.setWidth((int)((60d / 100 * width) - ((38d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="unit1.SetTopAndBottom(15%y,20%y)"[Layout/General script]
views.get("unit1").vw.setTop((int)((15d / 100 * height)));
views.get("unit1").vw.setHeight((int)((20d / 100 * height) - ((15d / 100 * height))));
//BA.debugLineNum = 41;BA.debugLine="unit2.SetTopAndBottom(23%y,28%y)"[Layout/General script]
views.get("unit2").vw.setTop((int)((23d / 100 * height)));
views.get("unit2").vw.setHeight((int)((28d / 100 * height) - ((23d / 100 * height))));
//BA.debugLineNum = 42;BA.debugLine="unit3.SetTopAndBottom(31%y,36%y)"[Layout/General script]
views.get("unit3").vw.setTop((int)((31d / 100 * height)));
views.get("unit3").vw.setHeight((int)((36d / 100 * height) - ((31d / 100 * height))));
//BA.debugLineNum = 43;BA.debugLine="unit4.SetTopAndBottom(39%y,44%y)"[Layout/General script]
views.get("unit4").vw.setTop((int)((39d / 100 * height)));
views.get("unit4").vw.setHeight((int)((44d / 100 * height) - ((39d / 100 * height))));
//BA.debugLineNum = 44;BA.debugLine="unit5.SetTopAndBottom(47%y,52%y)"[Layout/General script]
views.get("unit5").vw.setTop((int)((47d / 100 * height)));
views.get("unit5").vw.setHeight((int)((52d / 100 * height) - ((47d / 100 * height))));
//BA.debugLineNum = 45;BA.debugLine="unit6.SetTopAndBottom(55%y,60%y)"[Layout/General script]
views.get("unit6").vw.setTop((int)((55d / 100 * height)));
views.get("unit6").vw.setHeight((int)((60d / 100 * height) - ((55d / 100 * height))));
//BA.debugLineNum = 46;BA.debugLine="unit7.SetTopAndBottom(63%y,68%y)"[Layout/General script]
views.get("unit7").vw.setTop((int)((63d / 100 * height)));
views.get("unit7").vw.setHeight((int)((68d / 100 * height) - ((63d / 100 * height))));
//BA.debugLineNum = 47;BA.debugLine="unit8.SetTopAndBottom(71%y,76%y)"[Layout/General script]
views.get("unit8").vw.setTop((int)((71d / 100 * height)));
views.get("unit8").vw.setHeight((int)((76d / 100 * height) - ((71d / 100 * height))));
//BA.debugLineNum = 51;BA.debugLine="unit1.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit1").vw.setLeft((int)((40d / 100 * width)));
views.get("unit1").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 52;BA.debugLine="unit2.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit2").vw.setLeft((int)((40d / 100 * width)));
views.get("unit2").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 53;BA.debugLine="unit3.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit3").vw.setLeft((int)((40d / 100 * width)));
views.get("unit3").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 54;BA.debugLine="unit4.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit4").vw.setLeft((int)((40d / 100 * width)));
views.get("unit4").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 55;BA.debugLine="unit4.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit4").vw.setLeft((int)((40d / 100 * width)));
views.get("unit4").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 56;BA.debugLine="unit5.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit5").vw.setLeft((int)((40d / 100 * width)));
views.get("unit5").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 57;BA.debugLine="unit6.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit6").vw.setLeft((int)((40d / 100 * width)));
views.get("unit6").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 58;BA.debugLine="unit7.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit7").vw.setLeft((int)((40d / 100 * width)));
views.get("unit7").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 59;BA.debugLine="unit8.SetLeftAndRight(40%x,60%x)"[Layout/General script]
views.get("unit8").vw.setLeft((int)((40d / 100 * width)));
views.get("unit8").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 63;BA.debugLine="grades.SetTopAndBottom(10%y,0)"[Layout/General script]
views.get("grades").vw.setTop((int)((10d / 100 * height)));
views.get("grades").vw.setHeight((int)(0d - ((10d / 100 * height))));
//BA.debugLineNum = 64;BA.debugLine="grades.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grades").vw.setLeft((int)((0d / 100 * width)));
views.get("grades").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 68;BA.debugLine="grade1.SetTopAndBottom(15%y,20%y)"[Layout/General script]
views.get("grade1").vw.setTop((int)((15d / 100 * height)));
views.get("grade1").vw.setHeight((int)((20d / 100 * height) - ((15d / 100 * height))));
//BA.debugLineNum = 69;BA.debugLine="grade2.SetTopAndBottom(23%y,28%y)"[Layout/General script]
views.get("grade2").vw.setTop((int)((23d / 100 * height)));
views.get("grade2").vw.setHeight((int)((28d / 100 * height) - ((23d / 100 * height))));
//BA.debugLineNum = 70;BA.debugLine="grade3.SetTopAndBottom(31%y,36%y)"[Layout/General script]
views.get("grade3").vw.setTop((int)((31d / 100 * height)));
views.get("grade3").vw.setHeight((int)((36d / 100 * height) - ((31d / 100 * height))));
//BA.debugLineNum = 71;BA.debugLine="grade4.SetTopAndBottom(39%y,44%y)"[Layout/General script]
views.get("grade4").vw.setTop((int)((39d / 100 * height)));
views.get("grade4").vw.setHeight((int)((44d / 100 * height) - ((39d / 100 * height))));
//BA.debugLineNum = 72;BA.debugLine="grade5.SetTopAndBottom(47%y,52%y)"[Layout/General script]
views.get("grade5").vw.setTop((int)((47d / 100 * height)));
views.get("grade5").vw.setHeight((int)((52d / 100 * height) - ((47d / 100 * height))));
//BA.debugLineNum = 73;BA.debugLine="grade6.SetTopAndBottom(55%y,60%y)"[Layout/General script]
views.get("grade6").vw.setTop((int)((55d / 100 * height)));
views.get("grade6").vw.setHeight((int)((60d / 100 * height) - ((55d / 100 * height))));
//BA.debugLineNum = 74;BA.debugLine="grade7.SetTopAndBottom(63%y,68%y)"[Layout/General script]
views.get("grade7").vw.setTop((int)((63d / 100 * height)));
views.get("grade7").vw.setHeight((int)((68d / 100 * height) - ((63d / 100 * height))));
//BA.debugLineNum = 75;BA.debugLine="grade8.SetTopAndBottom(71%y,76%y)"[Layout/General script]
views.get("grade8").vw.setTop((int)((71d / 100 * height)));
views.get("grade8").vw.setHeight((int)((76d / 100 * height) - ((71d / 100 * height))));
//BA.debugLineNum = 79;BA.debugLine="grade1.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grade1").vw.setLeft((int)((0d / 100 * width)));
views.get("grade1").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 80;BA.debugLine="grade2.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grade2").vw.setLeft((int)((0d / 100 * width)));
views.get("grade2").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 81;BA.debugLine="grade3.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grade3").vw.setLeft((int)((0d / 100 * width)));
views.get("grade3").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 82;BA.debugLine="grade4.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grade4").vw.setLeft((int)((0d / 100 * width)));
views.get("grade4").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 83;BA.debugLine="grade5.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grade5").vw.setLeft((int)((0d / 100 * width)));
views.get("grade5").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 84;BA.debugLine="grade6.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grade6").vw.setLeft((int)((0d / 100 * width)));
views.get("grade6").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 85;BA.debugLine="grade7.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grade7").vw.setLeft((int)((0d / 100 * width)));
views.get("grade7").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 86;BA.debugLine="grade8.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("grade8").vw.setLeft((int)((0d / 100 * width)));
views.get("grade8").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 89;BA.debugLine="subtotal.SetTopAndBottom(10%y,0)"[Layout/General script]
views.get("subtotal").vw.setTop((int)((10d / 100 * height)));
views.get("subtotal").vw.setHeight((int)(0d - ((10d / 100 * height))));
//BA.debugLineNum = 90;BA.debugLine="subtotal.SetLeftAndRight(65%x,100%x)"[Layout/General script]
views.get("subtotal").vw.setLeft((int)((65d / 100 * width)));
views.get("subtotal").vw.setWidth((int)((100d / 100 * width) - ((65d / 100 * width))));
//BA.debugLineNum = 94;BA.debugLine="subtotal1.SetTopAndBottom(15%y,20%y)"[Layout/General script]
views.get("subtotal1").vw.setTop((int)((15d / 100 * height)));
views.get("subtotal1").vw.setHeight((int)((20d / 100 * height) - ((15d / 100 * height))));
//BA.debugLineNum = 95;BA.debugLine="subtotal2.SetTopAndBottom(23%y,28%y)"[Layout/General script]
views.get("subtotal2").vw.setTop((int)((23d / 100 * height)));
views.get("subtotal2").vw.setHeight((int)((28d / 100 * height) - ((23d / 100 * height))));
//BA.debugLineNum = 96;BA.debugLine="subtotal3.SetTopAndBottom(31%y,36%y)"[Layout/General script]
views.get("subtotal3").vw.setTop((int)((31d / 100 * height)));
views.get("subtotal3").vw.setHeight((int)((36d / 100 * height) - ((31d / 100 * height))));
//BA.debugLineNum = 97;BA.debugLine="subtotal4.SetTopAndBottom(39%y,44%y)"[Layout/General script]
views.get("subtotal4").vw.setTop((int)((39d / 100 * height)));
views.get("subtotal4").vw.setHeight((int)((44d / 100 * height) - ((39d / 100 * height))));
//BA.debugLineNum = 98;BA.debugLine="subtotal5.SetTopAndBottom(47%y,52%y)"[Layout/General script]
views.get("subtotal5").vw.setTop((int)((47d / 100 * height)));
views.get("subtotal5").vw.setHeight((int)((52d / 100 * height) - ((47d / 100 * height))));
//BA.debugLineNum = 99;BA.debugLine="subtotal6.SetTopAndBottom(55%y,60%y)"[Layout/General script]
views.get("subtotal6").vw.setTop((int)((55d / 100 * height)));
views.get("subtotal6").vw.setHeight((int)((60d / 100 * height) - ((55d / 100 * height))));
//BA.debugLineNum = 100;BA.debugLine="subtotal7.SetTopAndBottom(63%y,68%y)"[Layout/General script]
views.get("subtotal7").vw.setTop((int)((63d / 100 * height)));
views.get("subtotal7").vw.setHeight((int)((68d / 100 * height) - ((63d / 100 * height))));
//BA.debugLineNum = 101;BA.debugLine="subtotal8.SetTopAndBottom(71%y,76%y)"[Layout/General script]
views.get("subtotal8").vw.setTop((int)((71d / 100 * height)));
views.get("subtotal8").vw.setHeight((int)((76d / 100 * height) - ((71d / 100 * height))));
//BA.debugLineNum = 105;BA.debugLine="subtotal1.SetLeftAndRight(70%x,100%x)"[Layout/General script]
views.get("subtotal1").vw.setLeft((int)((70d / 100 * width)));
views.get("subtotal1").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 106;BA.debugLine="subtotal2.SetLeftAndRight(70%x,100%x)"[Layout/General script]
views.get("subtotal2").vw.setLeft((int)((70d / 100 * width)));
views.get("subtotal2").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 107;BA.debugLine="subtotal3.SetLeftAndRight(70%x,100%x)"[Layout/General script]
views.get("subtotal3").vw.setLeft((int)((70d / 100 * width)));
views.get("subtotal3").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 108;BA.debugLine="subtotal4.SetLeftAndRight(70%x,100%x)"[Layout/General script]
views.get("subtotal4").vw.setLeft((int)((70d / 100 * width)));
views.get("subtotal4").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 109;BA.debugLine="subtotal5.SetLeftAndRight(70%x,100%x)"[Layout/General script]
views.get("subtotal5").vw.setLeft((int)((70d / 100 * width)));
views.get("subtotal5").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 110;BA.debugLine="subtotal6.SetLeftAndRight(70%x,100%x)"[Layout/General script]
views.get("subtotal6").vw.setLeft((int)((70d / 100 * width)));
views.get("subtotal6").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 111;BA.debugLine="subtotal7.SetLeftAndRight(70%x,100%x)"[Layout/General script]
views.get("subtotal7").vw.setLeft((int)((70d / 100 * width)));
views.get("subtotal7").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 112;BA.debugLine="subtotal8.SetLeftAndRight(70%x,100%x)"[Layout/General script]
views.get("subtotal8").vw.setLeft((int)((70d / 100 * width)));
views.get("subtotal8").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 115;BA.debugLine="GWA.SetTopAndBottom(83%y,0)"[Layout/General script]
views.get("gwa").vw.setTop((int)((83d / 100 * height)));
views.get("gwa").vw.setHeight((int)(0d - ((83d / 100 * height))));
//BA.debugLineNum = 116;BA.debugLine="GWA.SetLeftAndRight(31%x,56%x)"[Layout/General script]
views.get("gwa").vw.setLeft((int)((31d / 100 * width)));
views.get("gwa").vw.setWidth((int)((56d / 100 * width) - ((31d / 100 * width))));
//BA.debugLineNum = 119;BA.debugLine="GWALABEL.SetTopAndBottom(83%y,0)"[Layout/General script]
views.get("gwalabel").vw.setTop((int)((83d / 100 * height)));
views.get("gwalabel").vw.setHeight((int)(0d - ((83d / 100 * height))));
//BA.debugLineNum = 120;BA.debugLine="GWALABEL.SetLeftAndRight(0%x,30%x)"[Layout/General script]
views.get("gwalabel").vw.setLeft((int)((0d / 100 * width)));
views.get("gwalabel").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 122;BA.debugLine="clear.SetTopAndBottom(81.5%y,5%y)"[Layout/General script]
views.get("clear").vw.setTop((int)((81.5d / 100 * height)));
views.get("clear").vw.setHeight((int)((5d / 100 * height) - ((81.5d / 100 * height))));
//BA.debugLineNum = 123;BA.debugLine="clear.SetLeftAndRight(60%x,90%x)"[Layout/General script]
views.get("clear").vw.setLeft((int)((60d / 100 * width)));
views.get("clear").vw.setWidth((int)((90d / 100 * width) - ((60d / 100 * width))));
//BA.debugLineNum = 125;BA.debugLine="jandee.SetLeftAndRight(20%x,95%x)"[Layout/General script]
views.get("jandee").vw.setLeft((int)((20d / 100 * width)));
views.get("jandee").vw.setWidth((int)((95d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 126;BA.debugLine="johnmark.SetLeftAndRight(20%x,95%x)"[Layout/General script]
views.get("johnmark").vw.setLeft((int)((20d / 100 * width)));
views.get("johnmark").vw.setWidth((int)((95d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 128;BA.debugLine="jandee.SetTopAndBottom(40%y,0)"[Layout/General script]
views.get("jandee").vw.setTop((int)((40d / 100 * height)));
views.get("jandee").vw.setHeight((int)(0d - ((40d / 100 * height))));
//BA.debugLineNum = 129;BA.debugLine="johnmark.SetTopAndBottom(50%y,0)"[Layout/General script]
views.get("johnmark").vw.setTop((int)((50d / 100 * height)));
views.get("johnmark").vw.setHeight((int)(0d - ((50d / 100 * height))));

}
}