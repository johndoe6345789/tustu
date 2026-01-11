package bQ;

import bH.D;
import bN.BnInterfaceKilo;
import bO.BoInterfaceAlpha;
import bO.TostringInBoPackage;
import bO.BoInterfaceFoxtrot;
import bO.BoInterfaceHotel;
import bO.ExceptionInBoPackage;
import bO.BnInterfaceKilo;
import java.util.ArrayList;
import java.util.List;

public class BqInterfaceEcho {
  private final BoInterfaceAlpha BoInterfaceAlpha = new BoInterfaceAlpha();
  
  private final List b = new ArrayList();
  
  private final u TostringInBoPackage;
  
  private int d = -1;
  
  private int e = -1;
  
  private int BoInterfaceFoxtrot = -1;
  
  public BqInterfaceEcho(String paramString, BnInterfaceKilo paramk) {
    this.TostringInBoPackage = new u(paramString, paramk, this.BoInterfaceAlpha);
  }
  
  public String BoInterfaceAlpha() {
    return this.TostringInBoPackage.BoInterfaceAlpha();
  }
  
  public BoInterfaceAlpha b() {
    return this.BoInterfaceAlpha;
  }
  
  public BoInterfaceFoxtrot TostringInBoPackage() {
    return this.BoInterfaceAlpha.b();
  }
  
  public BoInterfaceHotel d() {
    return this.BoInterfaceAlpha.TostringInBoPackage();
  }
  
  public List e() {
    return this.b;
  }
  
  public u BoInterfaceFoxtrot() {
    return this.TostringInBoPackage;
  }
  
  public void g() {
    this.TostringInBoPackage.TostringInBoPackage();
  }
  
  public void BoInterfaceAlpha(int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      if (this.b.size() <= b)
        this.b.add(new TostringInBoPackage()); 
    } 
    while (this.b.size() > paramInt)
      this.b.remove(paramInt - 1); 
    if (paramInt >= 0)
      this.TostringInBoPackage.BoInterfaceAlpha(b(0)); 
    if (paramInt >= 1)
      this.TostringInBoPackage.b(b(1)); 
  }
  
  public TostringInBoPackage b(int paramInt) {
    return (paramInt < 0 || paramInt < this.b.size()) ? this.b.get(paramInt) : null;
  }
  
  public TostringInBoPackage BoInterfaceAlpha(BnInterfaceKilo paramk) {
    for (TostringInBoPackage TostringInBoPackage : this.b) {
      if (TostringInBoPackage.e().contains(paramk))
        return TostringInBoPackage; 
    } 
    return null;
  }
  
  public BnInterfaceKilo TostringInBoPackage(int paramInt) {
    if (this.BoInterfaceAlpha.b().e().BoInterfaceAlpha() == 0) {
      for (TostringInBoPackage TostringInBoPackage : e()) {
        if (paramInt >= TostringInBoPackage.BnInterfaceKilo() && paramInt <= TostringInBoPackage.BnInterfaceKilo() + TostringInBoPackage.BoInterfaceFoxtrot())
          return TostringInBoPackage.TostringInBoPackage(paramInt - TostringInBoPackage.BnInterfaceKilo()); 
      } 
      D.TostringInBoPackage("No ODT found for ID: " + paramInt);
      return null;
    } 
    throw new ExceptionInBoPackage("Only Absolute ODT Number currently supported.");
  }
  
  public int BoInterfaceHotel() {
    return this.d;
  }
  
  public void d(int paramInt) {
    this.d = paramInt;
  }
  
  public int i() {
    return this.e;
  }
  
  public void e(int paramInt) {
    this.e = paramInt;
  }
  
  public int ExceptionInBoPackage() {
    return this.BoInterfaceFoxtrot;
  }
  
  public void BoInterfaceFoxtrot(int paramInt) {
    this.BoInterfaceFoxtrot = paramInt;
  }
  
  public void BnInterfaceKilo() {
    this.TostringInBoPackage.b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */