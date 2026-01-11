package business.byte_serializers.bS_components;

import G.F;
import G.R;
import bH.D;
import bN.BnInterfaceRomeo;
import bO.BoInterfaceAlpha;
import bO.TostringInBoPackage;
import bO.ExceptionInBoPackage;
import bO.ArrayListExtensionInBoPackage;
import bO.BoInterfaceLima;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BsInterfaceDelta {
  private final BoInterfaceAlpha e = new BoInterfaceAlpha();
  
  private int f = -1;
  
  private int g = -1;
  
  private int h = -1;
  
  List BoInterfaceAlpha = new ArrayList();
  
  private BnInterfaceRomeo i;
  
  List b = new ArrayList();
  
  F TostringInBoPackage;
  
  R d;
  
  public BsInterfaceDelta(R paramR, BnInterfaceRomeo paramr) {
    this.d = paramR;
    this.TostringInBoPackage = paramR.O();
    this.i = paramr;
  }
  
  public BoInterfaceAlpha BoInterfaceAlpha() {
    return this.e;
  }
  
  public void BoInterfaceAlpha(TostringInBoPackage paramc, int paramInt) {
    while (this.BoInterfaceAlpha.size() <= paramInt) {
      b b = new b(this.TostringInBoPackage, this.i, this.e);
      b.BoInterfaceAlpha(new TostringInBoPackage());
      this.d.C().BoInterfaceAlpha(b);
      this.BoInterfaceAlpha.add(b);
    } 
    paramc.i(paramInt);
    ((b)this.BoInterfaceAlpha.get(paramInt)).BoInterfaceAlpha(paramc);
  }
  
  public void BoInterfaceAlpha(int paramInt) {
    TostringInBoPackage TostringInBoPackage = b(paramInt);
    if (this.e.BoInterfaceAlpha().TostringInBoPackage()) {
      TostringInBoPackage.BoInterfaceLima();
    } else {
      TostringInBoPackage.BoInterfaceLima();
    } 
  }
  
  public int b() {
    return this.BoInterfaceAlpha.size();
  }
  
  public TostringInBoPackage b(int paramInt) {
    if (paramInt < 0) {
      D.TostringInBoPackage("Invalid DAQ List number: " + paramInt);
      return null;
    } 
    if (paramInt >= this.e.b().b())
      return null; 
    if (paramInt >= this.BoInterfaceAlpha.size()) {
      D.BoInterfaceAlpha("request for DAQ List: " + paramInt + " but that list is no initialized.");
      return null;
    } 
    b b = this.BoInterfaceAlpha.get(paramInt);
    return (b != null) ? b.BoInterfaceAlpha() : null;
  }
  
  public b TostringInBoPackage(int paramInt) {
    try {
      return this.BoInterfaceAlpha.get(paramInt);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      return null;
    } 
  }
  
  public int TostringInBoPackage() {
    return this.f;
  }
  
  public void d(int paramInt) {
    this.f = paramInt;
  }
  
  public int d() {
    return this.g;
  }
  
  public void e(int paramInt) {
    this.g = paramInt;
  }
  
  public int e() {
    return this.h;
  }
  
  public void f(int paramInt) {
    this.h = paramInt;
  }
  
  public BoInterfaceLima BoInterfaceAlpha(int paramInt1, int paramInt2, int paramInt3) {
    TostringInBoPackage TostringInBoPackage = b(paramInt1);
    ArrayListExtensionInBoPackage ArrayListExtensionInBoPackage = TostringInBoPackage.TostringInBoPackage(paramInt2);
    if (paramInt3 < 0 || paramInt3 >= TostringInBoPackage.TostringInBoPackage())
      throw new ExceptionInBoPackage("Invalid ODT Entry Number: " + paramInt3 + " ,max ODT Entries: " + TostringInBoPackage.TostringInBoPackage()); 
    while (paramInt3 >= ArrayListExtensionInBoPackage.size())
      ArrayListExtensionInBoPackage.add(new BoInterfaceLima()); 
    return (BoInterfaceLima)ArrayListExtensionInBoPackage.get(paramInt3);
  }
  
  public byte g(int paramInt) {
    int i = 0;
    for (byte b = 0; b < paramInt; b++) {
      TostringInBoPackage TostringInBoPackage = b(b);
      TostringInBoPackage.h(i);
      i += TostringInBoPackage.f();
    } 
    return (byte)i;
  }
  
  public void h(int paramInt) {
    ((b)this.BoInterfaceAlpha.get(paramInt)).TostringInBoPackage();
  }
  
  public void i(int paramInt) {
    ((b)this.BoInterfaceAlpha.get(paramInt)).b();
  }
  
  public void ExceptionInBoPackage(int paramInt) {
    if (!this.b.contains(Integer.valueOf(paramInt)))
      this.b.add(Integer.valueOf(paramInt)); 
  }
  
  public void f() {
    this.b.clear();
  }
  
  public void g() {
    Iterator<Integer> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      h(i);
    } 
  }
  
  public void h() {
    Iterator<Integer> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      i(i);
    } 
  }
  
  public void i() {
    for (b b : this.BoInterfaceAlpha)
      b.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */