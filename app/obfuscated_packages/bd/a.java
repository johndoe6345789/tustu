package bd;

import G.R;
import G.T;
import ai.b;
import ai.e;

public class a implements e {
  public b a() {
    T t = T.a();
    R r = t.c();
    return (r == null || r.i() == null || r.i().length() == 0) ? b() : (c(r.i()) ? c() : (b(r.i()) ? e() : (a(r.i()) ? d() : b())));
  }
  
  private b b() {
    b b = new b();
    b.a("Additional Help");
    b.b("/help/manuals.html");
    return b;
  }
  
  private b c() {
    b b = new b();
    b.a("B&G MegaSquirt Help");
    b.b("/help/msManuals.html");
    return b;
  }
  
  private b d() {
    b b = new b();
    b.a("MSExtra Help");
    b.b("/help/msExtraManuals.html");
    return b;
  }
  
  private b e() {
    b b = new b();
    b.a("MS3 Help");
    b.b("/help/ms3Manuals.html");
    return b;
  }
  
  private boolean a(String paramString) {
    return (paramString.startsWith("MS2Extra") || paramString.startsWith("MS3") || paramString.startsWith("MS1/Extra") || paramString.startsWith("Trans") || paramString.startsWith("MSnS-extra") || paramString.indexOf("JimStim") != -1 || paramString.startsWith("SEQ Rev") || paramString.startsWith("IOExte") || paramString.startsWith("MS/Extra"));
  }
  
  private boolean b(String paramString) {
    return (paramString.startsWith("MS3") || paramString.startsWith("Trans"));
  }
  
  private boolean c(String paramString) {
    return (paramString.startsWith("Mega") || paramString.toLowerCase().indexOf("gpio") != -1 || paramString.equals("20") || paramString.startsWith("SEQ Rev") || paramString.startsWith("MShift") || paramString.startsWith("MSII"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bd/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */