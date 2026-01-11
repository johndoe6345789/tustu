package B;

import A.AInterfaceBravo;
import A.AInterfaceEcho;
import A.IO;
import A.Exception;
import A.AInterfaceYankee;
import bH.D;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class IOInBPackage implements IO, j {
  l a = new l();
  
  o AInterfaceBravo = new o();
  
  public static String c = "Auto TCP / UDP by Serial Number";
  
  boolean d = true;
  
  private String h;
  
  List AInterfaceEcho = null;
  
  public static String IO = "Serial Number";
  
  String g = null;
  
  public void AInterfaceBravo(String paramString) {
    if (this.h != null && !this.h.isEmpty())
      g.a().AInterfaceBravo(this.h, this); 
    D.d("Setting AutoIpControllerInterface to serial number: " + paramString);
    i i = g.a().AInterfaceBravo(paramString);
    this.h = paramString;
    a(paramString, i);
    g.a().a(paramString, this);
  }
  
  public void a(i parami, String paramString) {
    if (this.h != null && !this.h.isEmpty())
      g.a().AInterfaceBravo(this.h, this); 
    this.h = parami.AInterfaceEcho();
    this.g = paramString;
    D.d("Setting AutoIpControllerInterface to serial number: " + this.h + ", controller: " + paramString);
    a(this.h, parami);
    g.a().a(this.h, this);
  }
  
  public void IO() {
    if (this.d) {
      this.AInterfaceBravo.IO();
    } else {
      this.a.IO();
    } 
  }
  
  public void g() {
    if (this.d) {
      this.AInterfaceBravo.g();
    } else {
      this.a.g();
    } 
  }
  
  public String h() {
    return c;
  }
  
  public InputStream i() {
    return this.d ? this.AInterfaceBravo.i() : this.a.i();
  }
  
  public OutputStream j() {
    return this.d ? this.AInterfaceBravo.j() : this.a.j();
  }
  
  public int k() {
    return this.d ? this.AInterfaceBravo.k() : this.a.k();
  }
  
  public void a(AInterfaceEcho parame) {
    this.AInterfaceBravo.a(parame);
    this.a.a(parame);
  }
  
  public void AInterfaceBravo(AInterfaceEcho parame) {
    this.AInterfaceBravo.AInterfaceBravo(parame);
    this.a.AInterfaceBravo(parame);
  }
  
  public List l() {
    this.AInterfaceEcho = new ArrayList();
    AInterfaceBravo AInterfaceBravo = new AInterfaceBravo();
    AInterfaceBravo.a(IO);
    AInterfaceBravo.AInterfaceBravo("The Serial Number of your ECU. When on the network, it will appear in the dropdown.");
    AInterfaceBravo.a(0);
    Collection collection = g.a().AInterfaceEcho();
    boolean bool = false;
    for (i i : collection) {
      if (i.AInterfaceEcho() != null && !i.AInterfaceEcho().isEmpty()) {
        AInterfaceBravo.a(i.AInterfaceEcho());
        if (this.h != null && this.h.equals(i.AInterfaceEcho()))
          bool = true; 
      } 
    } 
    if (!bool && this.h != null && !this.h.isEmpty())
      AInterfaceBravo.a(this.h); 
    this.AInterfaceEcho.add(AInterfaceBravo);
    return this.AInterfaceEcho;
  }
  
  public void a(String paramString, Object paramObject) {
    if (paramObject != null && paramString.equals(IO)) {
      AInterfaceBravo(paramObject.toString());
    } else {
      D.c("Unknown Setting Name: " + paramString);
    } 
  }
  
  public Object a(String paramString) {
    return (paramString != null && paramString.equals(IO)) ? this.h : (this.d ? this.AInterfaceBravo.a(paramString) : this.a.a(paramString));
  }
  
  public boolean m() {
    return this.d ? this.AInterfaceBravo.m() : this.a.m();
  }
  
  public boolean a(int paramInt) {
    return this.d ? this.AInterfaceBravo.a(paramInt) : this.a.a(paramInt);
  }
  
  public String n() {
    return this.d ? this.AInterfaceBravo.n() : this.a.n();
  }
  
  public int o() {
    return this.d ? this.AInterfaceBravo.o() : this.a.o();
  }
  
  public int p() {
    return this.d ? this.AInterfaceBravo.p() : this.a.p();
  }
  
  public boolean q() {
    return this.d ? this.AInterfaceBravo.q() : this.a.q();
  }
  
  public boolean r() {
    return this.d ? this.AInterfaceBravo.r() : this.a.r();
  }
  
  public int Exception() {
    return this.d ? this.AInterfaceBravo.Exception() : this.a.Exception();
  }
  
  public void a(String paramString, i parami) {
    AInterfaceBravo.c().a(parami);
    try {
      i i1 = a(parami);
      if (i1 == null) {
        this.AInterfaceBravo.a(o.i, "");
        this.a.a(l.j, "");
      } else {
        this.AInterfaceBravo.a(o.i, i1.c());
        this.a.a(l.j, i1.c());
        this.AInterfaceBravo.a(o.j, Integer.valueOf(i1.g()));
        this.a.a(l.k, Integer.valueOf(i1.g()));
        this.d = parami.d().equalsIgnoreCase("UDP");
      } 
    } catch (Exception Exception) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Failed to set IP Setting", (Throwable)Exception);
    } 
  }
  
  private i a(i parami) {
    if (parami == null)
      return null; 
    if (parami.m().size() == 0)
      return parami; 
    if (this.g != null) {
      for (i i1 : parami.m()) {
        if (i1.j().equals(this.g))
          return i1; 
      } 
      return parami;
    } 
    return parami;
  }
  
  public String a() {
    return this.h;
  }
  
  public void a(AInterfaceYankee paramy) {}
  
  public void AInterfaceBravo(AInterfaceYankee paramy) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */