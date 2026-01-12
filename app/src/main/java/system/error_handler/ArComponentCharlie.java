package ar;

import Z.ZInterfaceBravo;
import h.PropertiesExtensionInHPackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArComponentCharlie {
  private String ZInterfaceBravo;

  private List c = new ArrayList();

  private Map d = new HashMap<>();

  private int e = -1;

  private boolean f = false;

  public static String a = " ";

  public ArComponentCharlie(String paramString) {
    this.ZInterfaceBravo = paramString;
  }

  public String a() {
    String str1 = "<html>";
    String str2 = "";
    byte b1 = 1;
    for (byte b2 = 0; b2 < c().size(); b2++) {
      String str3 = ((d) c().get(b2)).a();
      if (str3 != null && str3.contains(".")) str3 = str3.substring(0, str3.lastIndexOf("."));
      if (!str3.equals(str2)) {
        str1 = str1 = str1 + "Graph " + b1++ + " --------<BR>";
        str2 = str3;
      }
      String str4 = ((d) c().get(b2)).ZInterfaceBravo();
      if (str4.indexOf("Field.") != -1) str4 = PropertiesExtensionInHPackage.a().a(str4);
      if (!str4.trim().isEmpty()) {
        str4 = ZInterfaceBravo.a().ZInterfaceBravo(str4);
        str1 = str1 + "&nbsp;&nbsp;&nbsp;&nbsp;" + str4 + "<br>";
      }
    }
    if (str1.trim().endsWith("<br>")) str1 = str1.trim().substring(0, str1.lastIndexOf("<br>"));
    return str1;
  }

  public String ZInterfaceBravo() {
    return this.ZInterfaceBravo;
  }

  public void a(String paramString) {
    this.ZInterfaceBravo = paramString;
  }

  public List c() {
    return this.c;
  }

  public void a(d paramd) {
    d d1 = this.d.put(paramd.a(), paramd);
    if (d1 != null) this.c.remove(d1);
    this.c.add(paramd);
  }

  public d ZInterfaceBravo(String paramString) {
    d d = (d) this.d.remove(paramString);
    if (d != null) this.c.remove(d);
    return d;
  }

  public void d() {
    this.c.clear();
    this.d.clear();
  }

  public boolean a(c paramc) {
    return paramc.a().equals(a());
  }

  public String c(String paramString) {
    d d = (d) this.d.get(paramString);
    return (d == null) ? a : d.ZInterfaceBravo();
  }

  public int e() {
    return this.e;
  }

  public void a(int paramInt) {
    this.e = paramInt;
  }

  public boolean f() {
    return this.f;
  }

  public void a(boolean paramBoolean) {
    this.f = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ar/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
