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
//BA.debugLineNum = 7;BA.debugLine="Panel1.SetLeftAndRight(100%x,200%x)"[Layout/General script]
views.get("panel1").vw.setLeft((int)((100d / 100 * width)));
views.get("panel1").vw.setWidth((int)((200d / 100 * width) - ((100d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="Panel2.SetLeftAndRight(200%x,300%x)"[Layout/General script]
views.get("panel2").vw.setLeft((int)((200d / 100 * width)));
views.get("panel2").vw.setWidth((int)((300d / 100 * width) - ((200d / 100 * width))));

}
}