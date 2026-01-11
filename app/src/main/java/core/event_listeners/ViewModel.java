package ao;

import W.j;
import W.n;
import W.o;
import aM.AmInterfaceAlpha;
import aM.AmInterfaceFoxtrot;
import aq.AmInterfaceAlpha;
import bB.JPanelExtensionInBbPackage;
import bC.JPanelExtensionUsingRunnable;
import bH.D;
import bH.J;
import bu.AmInterfaceAlpha;
import bx.JPanelExtensionInBxPackage;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.dO;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import g.JPanelExtensionUsingRunnable;
import HInterfaceHotel.HInterfaceHotel;
import HInterfaceHotel.i;
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
  private static b AmInterfaceAlpha = null;
  
  private HashMap b = new HashMap<>();
  
  public static b AmInterfaceAlpha() {
    if (AmInterfaceAlpha == null)
      AmInterfaceAlpha = new b(); 
    return AmInterfaceAlpha;
  }
  
  public void AmInterfaceAlpha(Window paramWindow) {
    if (i.aI) {
      AmInterfaceAlpha AmInterfaceAlpha = new AmInterfaceAlpha(paramWindow, null);
      AmInterfaceAlpha.AmInterfaceAlpha(HInterfaceHotel.AmInterfaceAlpha());
    } else {
      AmInterfaceFoxtrot AmInterfaceFoxtrot = new AmInterfaceFoxtrot(paramWindow, null);
      AmInterfaceFoxtrot.AmInterfaceAlpha(HInterfaceHotel.AmInterfaceAlpha());
    } 
  }
  
  public void b(Window paramWindow) {
    JPanelExtensionInBxPackage JPanelExtensionInBxPackage = new JPanelExtensionInBxPackage((bx.b)M.AmInterfaceAlpha(), null);
    JPanelExtensionInBxPackage c1 = new JPanelExtensionInBxPackage(this);
    JPanelExtensionInBxPackage.AmInterfaceAlpha(c1);
    hQ.AmInterfaceAlpha(JPanelExtensionInBxPackage.d(), "control SPACE");
    JPanelExtensionInBxPackage.AmInterfaceAlpha(paramWindow);
  }
  
  public void JPanelExtensionInBxPackage(Window paramWindow) {
    JPanelExtensionInBbPackage JPanelExtensionInBbPackage = new JPanelExtensionInBbPackage(null, new eo());
    JPanelExtensionInBbPackage.AmInterfaceAlpha(paramWindow);
  }
  
  public void AmInterfaceAlpha(Frame paramFrame) {
    dQ dQ = new dQ(i.AmInterfaceFoxtrot(), "");
    AmInterfaceAlpha AmInterfaceAlpha = new AmInterfaceAlpha((et)dQ);
    AmInterfaceAlpha.AmInterfaceAlpha(paramFrame);
  }
  
  public void AmInterfaceAlpha(n paramn, File paramFile, Window paramWindow) {
    String str1;
    n n1 = new n();
    n1.d(paramn.g());
    n1.AmInterfaceAlpha(paramn.AmInterfaceAlpha());
    n1.b(paramn.b());
    for (j j : paramn)
      n1.add(j); 
    if (paramn.HInterfaceHotel())
      for (String null : paramn.i())
        n1.AmInterfaceAlpha(str1, paramn.AmInterfaceFoxtrot(str1));  
    File file = paramFile.getParentFile();
    String str2 = "msl";
    String str3 = (paramn.JPanelExtensionInBbPackage() == null || paramn.JPanelExtensionInBbPackage().isEmpty()) ? i.v : paramn.JPanelExtensionInBbPackage();
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
    String[] arrayOfString = JPanelExtensionUsingRunnable.AmInterfaceAlpha(str4, ";");
    String str5 = bV.AmInterfaceAlpha(bq.AmInterfaceAlpha().b(), "Export Log Data", arrayOfString, str1, file.getAbsolutePath());
    if (str5 != null && !str5.equals("")) {
      o o = null;
      try {
        o = o.AmInterfaceAlpha(n1, str5, str3);
      } catch (IOException iOException) {
        bV.d("Error Saving Log File:\n" + iOException.getMessage(), bq.AmInterfaceAlpha().b());
        iOException.printStackTrace();
      } 
      d d = new d(this, paramWindow);
      o.AmInterfaceAlpha(d);
      g g = new g(this, o, n1);
      g.start();
    } 
  }
  
  public void AmInterfaceAlpha(String paramString) {
    JRootPane jRootPane = bq.AmInterfaceAlpha().b().getRootPane();
    if (!(jRootPane.getGlassPane() instanceof dO)) {
      dO dO1 = new dO();
      dO1.b(true);
      jRootPane.setGlassPane((Component)dO1);
    } 
    dO dO = (dO)jRootPane.getGlassPane();
    if (paramString != null) {
      paramString = paramString;
      dO.AmInterfaceAlpha(paramString);
    } 
    dO.b();
    dO.setVisible(true);
  }
  
  public void AmInterfaceAlpha(double paramDouble) {
    JRootPane jRootPane = bq.AmInterfaceAlpha().b().getRootPane();
    if (jRootPane.getGlassPane() instanceof dO) {
      dO dO = (dO)jRootPane.getGlassPane();
      dO.AmInterfaceAlpha(paramDouble);
    } else {
      D.d("updateModalPercent called, but Root Pane is not AmInterfaceAlpha ProgressPane.");
    } 
  }
  
  public void b(String paramString) {
    JRootPane jRootPane = bq.AmInterfaceAlpha().b().getRootPane();
    if (jRootPane.getGlassPane() instanceof dO) {
      dO dO = (dO)jRootPane.getGlassPane();
      dO.AmInterfaceAlpha(paramString);
    } else {
      D.d("updateModalPercent called, but Root Pane is not AmInterfaceAlpha ProgressPane.");
    } 
  }
  
  public void b(Frame paramFrame) {
    String str1 = i.JPanelExtensionInBbPackage;
    String str2 = null;
    String str3 = null;
    i.g();
    try {
      if (J.AmInterfaceAlpha()) {
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
      bq.AmInterfaceAlpha().b().JPanelExtensionInBbPackage();
    } catch (IOException iOException) {
      D.AmInterfaceAlpha("Failed to restart Application!", iOException, paramFrame);
    } 
  }
  
  public void b() {
    boolean bool = (J.AmInterfaceAlpha() && UIManager.getLookAndFeel().isNativeLookAndFeel()) ? true : false;
    try {
      UIManager.setLookAndFeel(UIManager.getLookAndFeel());
    } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, unsupportedLookAndFeelException);
    } 
    Font font1 = UIManager.getFont("Label.font");
    if (font1 != null && font1.getSize() < 14)
      eJ.JPanelExtensionInBxPackage(font1.getSize()); 
    int i = eJ.AmInterfaceAlpha();
    String str = i.e("prefFontSize", eJ.AmInterfaceAlpha() + "");
    int j = Integer.parseInt(str);
    float AmInterfaceFoxtrot = j / i;
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
          Font font3 = new Font(font.getFamily(), font.getStyle(), Math.round(eJ.AmInterfaceAlpha(float_.floatValue() * AmInterfaceFoxtrot)));
          UIManager.put(object, font3);
        } else if (font == null) {
          D.JPanelExtensionInBxPackage("no update:" + object);
        } 
      } else if (object != null && object.toString().equals("ScrollBar.width")) {
        System.out.println(object);
        if (UIManager.getInt(object) < 20)
          UIManager.put(object, Integer.valueOf(eJ.AmInterfaceAlpha(UIManager.getInt(object)))); 
      } 
    } 
    if (font2 != null) {
      Font font = new Font(font2.getFamily(), font2.getStyle(), eJ.AmInterfaceAlpha(12));
      UIManager.getLookAndFeel().getDefaults().put("defaultFont", font);
    } 
    if (bq.AmInterfaceAlpha().b() != null) {
      SwingUtilities.updateComponentTreeUI(bq.AmInterfaceAlpha().b());
      bV.e();
    } 
  }
  
  public JPanelExtensionUsingRunnable d(Window paramWindow) {
    return AmInterfaceAlpha(paramWindow, null);
  }
  
  public JPanelExtensionUsingRunnable AmInterfaceAlpha(Window paramWindow, String paramString) {
    JPanelExtensionUsingRunnable JPanelExtensionUsingRunnable = new JPanelExtensionUsingRunnable(null);
    JPanelExtensionUsingRunnable.AmInterfaceAlpha(Z.b.AmInterfaceAlpha().JPanelExtensionInBxPackage());
    JPanelExtensionUsingRunnable.AmInterfaceAlpha(new e(this));
    if (paramString != null)
      JPanelExtensionUsingRunnable.AmInterfaceAlpha(paramString); 
    JPanelExtensionUsingRunnable.AmInterfaceAlpha(paramWindow);
    return JPanelExtensionUsingRunnable;
  }
  
  public void AmInterfaceAlpha(cd paramcd) {
    String str = hx.AmInterfaceAlpha().r().AmInterfaceFoxtrot();
    br br = new br(paramcd);
    br.AmInterfaceAlpha(str);
    br.setSize(eJ.AmInterfaceAlpha(800), eJ.AmInterfaceAlpha(600));
    bV.AmInterfaceAlpha(paramcd, br);
    br.setVisible(true);
  }
  
  public void e(Window paramWindow) {
    com.efiAnalytics.dialogs.b b1 = new com.efiAnalytics.dialogs.b(paramWindow, "Timeslip Editor", null);
    n n = hx.AmInterfaceAlpha().r();
    AmInterfaceAlpha AmInterfaceAlpha = AmInterfaceAlpha.AmInterfaceAlpha(n);
    b1.AmInterfaceAlpha(AmInterfaceAlpha);
    b1.AmInterfaceAlpha(new AmInterfaceFoxtrot(this, b1, n));
    b1.pack();
    bV.AmInterfaceAlpha(paramWindow, (Component)b1);
    b1.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */