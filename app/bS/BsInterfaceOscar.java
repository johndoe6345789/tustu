package bS;

import G.R;
import G.ManagerUsingConcurrentHashMap;
import G.GInterfaceCi;
import G.ManagerUsingArrayList;
import bN.BnInterfaceFoxtrot;
import bN.BnInterfaceGolf;
import bN.BnInterfaceIndia;
import bN.BnInterfaceKilo;
import bN.IOInBnPackage;
import bN.BnInterfaceRomeo;
import bN.BnInterfaceTango;
import bO.TostringInBoPackage;
import bO.BnInterfaceFoxtrot;
import bP.BpInterfaceBravo;
import java.util.ArrayList;
import java.util.List;

public class BsInterfaceOscar {
  public static String a = "Dash Echo Server";
  
  public static int BpInterfaceBravo = -1;
  
  public static int TostringInBoPackage = -2;
  
  private R h;
  
  BnInterfaceRomeo d;
  
  private BnInterfaceKilo BnInterfaceIndia;
  
  j e;
  
  IOInBnPackage BnInterfaceFoxtrot;
  
  private BnInterfaceRomeo j;
  
  IOInBnPackage BnInterfaceGolf = new IOInBnPackage(this);
  
  private int BnInterfaceKilo = -1;
  
  private int l = -1;
  
  private BnInterfaceIndia m = new BnInterfaceIndia(-128);
  
  private int n = BpInterfaceBravo;
  
  private byte[] o = null;
  
  private int IOInBnPackage = -1;
  
  private int q = 255;
  
  private static final BnInterfaceKilo BnInterfaceRomeo = new BnInterfaceKilo();
  
  private final List s = new ArrayList();
  
  private d BnInterfaceTango;
  
  private BpInterfaceBravo u = new BpInterfaceBravo(this);
  
  public BsInterfaceOscar(R paramR, BnInterfaceRomeo paramr) {
    this.h = paramR;
    this.d = paramr;
    o();
    this.BnInterfaceFoxtrot = new IOInBnPackage(paramr.BnInterfaceIndia(), this.BnInterfaceIndia);
    this.j = new BnInterfaceRomeo(paramr.j(), this.BnInterfaceIndia);
    this.e = new j(this);
    n();
    this.BnInterfaceFoxtrot.a(IOInBnPackage.h);
    a(paramR);
  }
  
  private void a(R paramR) {
    this.BnInterfaceTango = new d(paramR, this.j);
    BnInterfaceFoxtrot BnInterfaceFoxtrot = this.BnInterfaceTango.a().BpInterfaceBravo();
    BnInterfaceFoxtrot.BpInterfaceBravo(paramR.BnInterfaceRomeo());
    BnInterfaceFoxtrot.a(1);
    BnInterfaceFoxtrot.TostringInBoPackage(0);
    this.BnInterfaceTango.a().TostringInBoPackage().a(32);
    this.BnInterfaceTango.a().TostringInBoPackage().e(1);
    TostringInBoPackage TostringInBoPackage = new TostringInBoPackage();
    TostringInBoPackage.BpInterfaceBravo().a((byte)4);
    this.BnInterfaceTango.a(TostringInBoPackage, 0);
    TostringInBoPackage = new TostringInBoPackage();
    TostringInBoPackage.BpInterfaceBravo().a((byte)4);
    this.BnInterfaceTango.a(TostringInBoPackage, 1);
  }
  
  public void a() {
    for (BpInterfaceBravo b1 : this.BnInterfaceTango.a)
      ManagerUsingArrayList.a().a(b1.a().n()); 
    this.BnInterfaceFoxtrot.TostringInBoPackage();
    this.j.TostringInBoPackage();
    this.BnInterfaceFoxtrot.BpInterfaceBravo(this.BnInterfaceGolf);
    BpInterfaceBravo(this.e);
    BpInterfaceBravo(this.e);
    for (e e : this.s) {
      e.a.h().BpInterfaceBravo(e);
      e.a();
    } 
    this.s.clear();
    ManagerUsingConcurrentHashMap.a().BpInterfaceBravo((GInterfaceCi)this.u);
  }
  
  private void n() {
    this.BnInterfaceFoxtrot.a(this.BnInterfaceGolf);
    a(this.e);
    a(this.e);
  }
  
  public synchronized int a(List paramList) {
    return this.j.a(paramList);
  }
  
  public synchronized void a(BnInterfaceTango paramt) {
    this.j.a(paramt);
  }
  
  private void o() {
    this.BnInterfaceIndia = new BnInterfaceKilo();
    this.BnInterfaceIndia.BpInterfaceBravo(this.d.s());
    this.BnInterfaceIndia.BnInterfaceFoxtrot(255);
    e e = new e(this, this.h);
    this.s.add(e);
    this.h.h().a(e);
    ManagerUsingConcurrentHashMap.a().a((GInterfaceCi)this.u);
  }
  
  public void BpInterfaceBravo() {
    a(-1);
    this.d.BnInterfaceGolf();
  }
  
  public int TostringInBoPackage() {
    return this.BnInterfaceKilo;
  }
  
  public void a(int paramInt) {
    this.BnInterfaceKilo = paramInt;
  }
  
  public BnInterfaceKilo d() {
    return this.BnInterfaceIndia;
  }
  
  public void a(BnInterfaceFoxtrot paramf) {
    this.BnInterfaceFoxtrot.a(paramf);
  }
  
  public void BpInterfaceBravo(BnInterfaceFoxtrot paramf) {
    this.BnInterfaceFoxtrot.BpInterfaceBravo(paramf);
  }
  
  public void a(BnInterfaceGolf paramg) {
    this.j.a(paramg);
  }
  
  public void BpInterfaceBravo(BnInterfaceGolf paramg) {
    this.j.BpInterfaceBravo(paramg);
  }
  
  protected BnInterfaceRomeo e() {
    return this.j;
  }
  
  public R BnInterfaceFoxtrot() {
    return this.h;
  }
  
  public int BnInterfaceGolf() {
    return this.l;
  }
  
  public void BpInterfaceBravo(int paramInt) {
    this.l = paramInt;
  }
  
  public void TostringInBoPackage(int paramInt) {
    this.q = paramInt;
  }
  
  public void d(int paramInt) {
    this.n = paramInt;
  }
  
  public int h() {
    return this.n;
  }
  
  public BnInterfaceKilo BnInterfaceIndia() {
    return BnInterfaceRomeo;
  }
  
  public BnInterfaceIndia j() {
    return this.m;
  }
  
  public d BnInterfaceKilo() {
    return this.BnInterfaceTango;
  }
  
  public byte[] l() {
    return this.o;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    this.o = paramArrayOfbyte;
  }
  
  public String m() {
    return this.d.n();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */