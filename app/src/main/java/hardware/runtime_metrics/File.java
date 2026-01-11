package I;

import G.R;
import W.ManagerUsingFile;
import bH.D;
import bH.I;
import bH.X;
import java.io.File;

public class File {
  private static p a = null;
  
  private File b = new File(".", "inc");
  
  private final String c = File.separator + "ms1ExtraSupplement.ecu";
  
  private final String d = File.separator + "speeduinoSupplement.ecu";
  
  private final String e = File.separator + "inc" + File.separator + "ms1BaseSupplement.ecu";
  
  private final String f = File.separator + "ms2Supplement.ecu";
  
  private final String g = File.separator + "ms3Supplement.ecu";
  
  private final String h = File.separator + "ms3Supplement_1.3.ecu";
  
  private final String i = File.separator + "bs3Supplement.ecu";
  
  private final String j = File.separator + "bsGen4Supplement.ecu";
  
  private String k = File.separator + "MCXpressSupplement.ecu";
  
  private boolean l = false;
  
  public static p a() {
    if (a == null)
      a = new p(); 
    return a;
  }
  
  public void a(R paramR) {
    if (this.l) {
      String str1 = paramR.i();
      if (str1 == null) {
        D.b("Signature null, can not load supplemental channels!");
        return;
      } 
      String str2 = null;
      if (str1.startsWith("MS/Extra") || str1.startsWith("MSnS-extra") || str1.startsWith("MS1/Extra")) {
        str2 = this.c;
      } else if (!str1.startsWith("20")) {
        if (str1.startsWith("MS2Extra") || str1.startsWith("MSII Rev") || (str1.startsWith("Monsterfirmware") && !str1.contains("pw"))) {
          str2 = this.f;
        } else if (str1.startsWith("MS3")) {
          if (a(str1) > 434) {
            str2 = this.h;
          } else {
            str2 = this.g;
          } 
        } else if (str1.startsWith("Ditron/MCXpress")) {
          str2 = this.k;
        } else if (str1.startsWith("speeduino") && b(str1) >= 201905) {
          str2 = this.d;
        } else if (str1.startsWith("BigStuff Gen4")) {
          str2 = this.j;
        } else if (paramR.u().size() > 0 && (paramR.i().equals("76") || paramR.i().equals("77") || paramR.i().equals("88") || paramR.i().equals("97") || paramR.i().equals("98"))) {
          str2 = this.i;
        } 
      } 
      boolean bool = false;
      if (str2 != null) {
        ManagerUsingFile ManagerUsingFile = new ManagerUsingFile();
        ManagerUsingFile.a(false);
        ManagerUsingFile.a(paramR, this.b.getAbsolutePath() + str2, false, bool);
      } 
    } 
  }
  
  private int a(String paramString) {
    try {
      String str = X.b(paramString, "MS3 Format", "");
      str = str.trim();
      str = str.substring(0, str.indexOf("."));
      return Integer.parseInt(str);
    } catch (Exception exception) {
      return 100;
    } 
  }
  
  private int b(String paramString) {
    String str = X.b(paramString, "speeduino", "").trim();
    if (str.contains("-dev"))
      str = X.b(str, "-dev", ""); 
    if (str.length() == 6 && I.a(str))
      return Integer.parseInt(str); 
    D.b("unexpected speeduino signature format! " + paramString);
    return 0;
  }
  
  public void a(boolean paramBoolean) {
    this.l = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */