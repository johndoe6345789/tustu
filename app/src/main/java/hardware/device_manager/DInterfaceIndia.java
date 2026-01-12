package d;

import c.CInterfaceEcho;
import c.CInterfaceFoxtrot;
import java.util.ArrayList;
import java.util.List;

public class DInterfaceIndia implements CInterfaceFoxtrot {
  private String c;

  private String d;

  private String CInterfaceEcho = null;

  private String CInterfaceFoxtrot = null;

  private CInterfaceEcho g = null;

  private int h = 1;

  List a = new ArrayList();

  i b = null;

  public DInterfaceIndia(String paramString1, String paramString2) {
    this.c = paramString1;
    this.d = paramString2;
  }

  public String c() {
    return this.c;
  }

  public String d() {
    return this.d;
  }

  public String CInterfaceEcho() {
    return (this.CInterfaceEcho == null) ? d() : this.CInterfaceEcho;
  }

  public void a(String paramString) {
    this.CInterfaceEcho = paramString;
  }

  public i a(i parami, String paramString) {
    i i1 = new i(parami.c, paramString);
    i1.CInterfaceEcho = parami.CInterfaceEcho;
    i1.g = parami.g;
    i1.h = parami.h;
    i1.a = parami.a;
    i1.CInterfaceFoxtrot = parami.CInterfaceFoxtrot;
    return i1;
  }

  public void b(String paramString) {
    this.d = paramString;
  }

  public int a() {
    return this.h;
  }

  public List b() {
    return this.a;
  }

  public void a(List paramList) {
    this.a = paramList;
  }

  public void a(int paramInt) {
    this.h = paramInt;
  }

  public String CInterfaceFoxtrot() {
    return this.CInterfaceFoxtrot;
  }

  public void c(String paramString) {
    this.CInterfaceFoxtrot = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/d/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
