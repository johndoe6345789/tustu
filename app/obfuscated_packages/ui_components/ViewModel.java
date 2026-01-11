package ao;

import W.j;
import W.n;
import W.o;
import aM.a;
import aM.f;
import aq.a;
import bB.l;
import bC.k;
import bH.D;
import bH.J;
import bu.a;
import bx.c;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.dO;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import g.k;
import h.h;
import h.i;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class b {
  private static b a = null;
  
  private HashMap b = new HashMap<>();
  
  public static b a() {
    if (a == null)
      a = new b(); 
    return a;
  }
  
  public void a(Window paramWindow) {
    if (i.aI) {
      a a = new a(paramWindow, null);
      a.a(h.a());
    } else {
      f f = new f(paramWindow, null);
      f.a(h.a());
    } 
  }
  
  public void b(Window paramWindow) {
    c c = new c((bx.b)M.a(), null);
    c c1 = new c(this);
    c.a(c1);
    hQ.a(c.d(), "control SPACE");
    c.a(paramWindow);
  }
  
  public void c(Window paramWindow) {
    l l = new l(null, new eo());
    l.a(paramWindow);
  }
  
  public void a(Frame paramFrame) {
    dQ dQ = new dQ(i.f(), "");
    a a = new a((et)dQ);
    a.a(paramFrame);
  }
  
  public void a(n paramn, File paramFile, Window paramWindow) {
    String str1;
    n n1 = new n();
    n1.d(paramn.g());
    n1.a(paramn.a());
    n1.b(paramn.b());
    for (j j : paramn)
      n1.add(j); 
    if (paramn.h())
      for (String null : paramn.i())
        n1.a(str1, paramn.f(str1));  
    File file = paramFile.getParentFile();
    String str2 = "msl";
    String str3 = (paramn.l() == null || paramn.l().isEmpty()) ? i.v : paramn.l();
    if (str3.equals(","))
      str2 = "csv"; 
    if (paramFile.getName().toLowerCase().endsWith(str2)) {
      try {
        str1 = paramFile.getName().substring(0, paramFile.getName().lastIndexOf(".")) + "_modified." + str2;
      } catch (Exception exception) {
        str1 = "modifiedLog." + str2;
      } 
    } else {
      try {
        str1 = paramFile.getName().substring(0, paramFile.getName().lastIndexOf(".") + 1) + str2;
      } catch (Exception exception) {
        str1 = "ExportLog." + str2;
      } 
    } 
    String str4 = str2;
    String[] arrayOfString = k.a(str4, ";");
    String str5 = bV.a(bq.a().b(), "Export Log Data", arrayOfString, str1, file.getAbsolutePath());
    if (str5 != null && !str5.equals("")) {
      o o = null;
      try {
        o = o.a(n1, str5, str3);
      } catch (IOException iOException) {
        bV.d("Error Saving Log File:\n" + iOException.getMessage(), bq.a().b());
        iOException.printStackTrace();
      } 
      d d = new d(this, paramWindow);
      o.a(d);
      g g = new g(this, o, n1);
      g.start();
    } 
  }
  
  public void a(String paramString) {
    JRootPane jRootPane = bq.a().b().getRootPane();
    if (!(jRootPane.getGlassPane() instanceof dO)) {
      dO dO1 = new dO();
      dO1.b(true);
      jRootPane.setGlassPane((Component)dO1);
    } 
    dO dO = (dO)jRootPane.getGlassPane();
    if (paramString != null) {
      paramString = paramString;
      dO.a(paramString);
    } 
    dO.b();
    dO.setVisible(true);
  }
  
  public void a(double paramDouble) {
    JRootPane jRootPane = bq.a().b().getRootPane();
    if (jRootPane.getGlassPane() instanceof dO) {
      dO dO = (dO)jRootPane.getGlassPane();
      dO.a(paramDouble);
    } else {
      D.d("updateModalPercent called, but Root Pane is not a ProgressPane.");
    } 
  }
  
  public void b(String paramString) {
    JRootPane jRootPane = bq.a().b().getRootPane();
    if (jRootPane.getGlassPane() instanceof dO) {
      dO dO = (dO)jRootPane.getGlassPane();
      dO.a(paramString);
    } else {
      D.d("updateModalPercent called, but Root Pane is not a ProgressPane.");
    } 
  }
  
  public void b(Frame paramFrame) {
    String str1 = i.l;
    String str2 = null;
    String str3 = null;
    i.g();
    try {
      if (J.a()) {
        str3 = "javaw.exe Staging";
        str2 = "javaw.exe -cp .;./plugins/;lib;./lib/*.jar -Djava.library.path=lib -jar " + str1;
        Runtime.getRuntime().exec(str3 + " \"" + str2 + "\"");
      } else if (J.d()) {
        str3 = "/usr/bin/java";
        str2 = "/usr/bin/java -cp .:./plugins/:lib:./lib/*.jar -Djava.library.path=lib -jar " + str1;
        String[] arrayOfString = { str3, "Staging", str2 };
        Runtime.getRuntime().exec(arrayOfString);
      } else if (J.b()) {
        str3 = "./runtime/bin/java";
        str2 = "./runtime/bin/java -cp .:./plugins/:lib:./lib/*.jar -Djava.library.path=lib -jar " + str1;
        String[] arrayOfString = { str3, "Staging", str2 };
        Runtime.getRuntime().exec(arrayOfString);
      } else {
        str3 = "/usr/bin/java";
        str2 = "/usr/bin/java -cp .:./plugins/:lib:./lib/*.jar -Djava.library.path=lib -jar " + str1;
        String[] arrayOfString = { str3, "Staging", str2 };
        Runtime.getRuntime().exec(arrayOfString);
      } 
      bq.a().b().l();
    } catch (IOException iOException) {
      D.a("Failed to restart Application!", iOException, paramFrame);
    } 
  }
  
  public void b() {
    boolean bool = (J.a() && UIManager.getLookAndFeel().isNativeLookAndFeel()) ? true : false;
    try {
      UIManager.setLookAndFeel(UIManager.getLookAndFeel());
    } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, unsupportedLookAndFeelException);
    } 
    Font font1 = UIManager.getFont("Label.font");
    if (font1 != null && font1.getSize() < 14)
      eJ.c(font1.getSize()); 
    int i = eJ.a();
    String str = i.e("prefFontSize", eJ.a() + "");
    int j = Integer.parseInt(str);
    float f = j / i;
    Set set = UIManager.getLookAndFeelDefaults().keySet();
    Object[] arrayOfObject1 = set.toArray(new Object[set.size()]);
    Object[] arrayOfObject2 = new Object[arrayOfObject1.length + 1];
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, arrayOfObject1.length);
    arrayOfObject2[arrayOfObject2.length - 1] = "defaultFont";
    arrayOfObject1 = arrayOfObject2;
    Font font2 = UIManager.getFont("defaultFont");
    for (Object object : arrayOfObject1) {
      if (object != null && object.toString().toLowerCase().contains("font")) {
        Font font = UIManager.getFont(object);
        if (font != null) {
          Float float_ = (Float)this.b.get(object);
          if (float_ == null) {
            this.b.put(object, Float.valueOf(font.getSize2D()));
            float_ = Float.valueOf(font.getSize2D());
          } 
          Font font3 = new Font(font.getFamily(), font.getStyle(), Math.round(eJ.a(float_.floatValue() * f)));
          UIManager.put(object, font3);
        } else if (font == null) {
          D.c("no update:" + object);
        } 
      } else if (object != null && object.toString().equals("ScrollBar.width")) {
        System.out.println(object);
        if (UIManager.getInt(object) < 20)
          UIManager.put(object, Integer.valueOf(eJ.a(UIManager.getInt(object)))); 
      } 
    } 
    if (font2 != null) {
      Font font = new Font(font2.getFamily(), font2.getStyle(), eJ.a(12));
      UIManager.getLookAndFeel().getDefaults().put("defaultFont", font);
    } 
    if (bq.a().b() != null) {
      SwingUtilities.updateComponentTreeUI(bq.a().b());
      bV.e();
    } 
  }
  
  public k d(Window paramWindow) {
    return a(paramWindow, null);
  }
  
  public k a(Window paramWindow, String paramString) {
    k k = new k(null);
    k.a(Z.b.a().c());
    k.a(new e(this));
    if (paramString != null)
      k.a(paramString); 
    k.a(paramWindow);
    return k;
  }
  
  public void a(cd paramcd) {
    String str = hx.a().r().f();
    br br = new br(paramcd);
    br.a(str);
    br.setSize(eJ.a(800), eJ.a(600));
    bV.a(paramcd, br);
    br.setVisible(true);
  }
  
  public void e(Window paramWindow) {
    com.efiAnalytics.dialogs.b b1 = new com.efiAnalytics.dialogs.b(paramWindow, "Timeslip Editor", null);
    n n = hx.a().r();
    a a = a.a(n);
    b1.a(a);
    b1.a(new f(this, b1, n));
    b1.pack();
    bV.a(paramWindow, (Component)b1);
    b1.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */