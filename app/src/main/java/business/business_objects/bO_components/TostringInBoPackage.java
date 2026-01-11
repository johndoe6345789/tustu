package business.business_objects.bO_components;

import G.GComponentCq;
import java.util.ArrayList;
import java.util.List;

public class TostringInBoPackage {
  private final e e = new e();
  
  public static byte a = 32;
  
  public static byte b = 16;
  
  public static byte c = 2;
  
  List d = new ArrayList();
  
  private List f = new ArrayList();
  
  private int g = 251;
  
  private int h = 251;
  
  private int i = 0;
  
  private byte j = b;
  
  private int k = -1;
  
  private int l = 1;
  
  private int m = 0;
  
  private int n = -1;
  
  private int o = -1;
  
  private long p = 0L;
  
  private final d q = new d(this);
  
  public int a() {
    return this.g;
  }
  
  public void a(int paramInt) {
    this.g = paramInt;
  }
  
  public e b() {
    return this.e;
  }
  
  public int c() {
    return this.h;
  }
  
  public void b(int paramInt) {
    this.h = paramInt;
  }
  
  public int d() {
    return this.i;
  }
  
  public k c(int paramInt) {
    if (paramInt < 0)
      throw new j("Invalid odt number:" + paramInt); 
    if (paramInt > a())
      throw new j("ODT number (" + paramInt + ") exceeds MAX_ODT " + a() + ", , Reduce the number of channels!"); 
    if (paramInt >= this.d.size())
      for (byte b = 0; b <= paramInt; b++) {
        if (b >= this.d.size())
          this.d.add(new k()); 
      }  
    return this.d.get(paramInt);
  }
  
  public List e() {
    return this.d;
  }
  
  public int f() {
    return this.d.size();
  }
  
  public void d(int paramInt) {
    this.i = paramInt;
  }
  
  public int g() {
    return this.k;
  }
  
  public void e(int paramInt) {
    this.k = paramInt;
  }
  
  public byte h() {
    return this.j;
  }
  
  public void a(byte paramByte) {
    this.j = paramByte;
  }
  
  public int i() {
    return this.l;
  }
  
  public void f(int paramInt) {
    this.l = paramInt;
  }
  
  public int j() {
    return this.m;
  }
  
  public void g(int paramInt) {
    this.m = paramInt;
  }
  
  public String toString() {
    return "DAQ List: maxOdts = " + this.g + ", maxOdtEntries=" + this.h + ", eventChannelNumber=" + this.k + ", DAQ_LIST_PROPERTIES=" + Integer.toBinaryString(this.e.a()) + ", Current ODT Entries: " + this.d.size();
  }
  
  public int k() {
    return this.n;
  }
  
  public void h(int paramInt) {
    this.n = paramInt;
  }
  
  public void a(List paramList) {
    this.f = this.d;
    this.d = paramList;
  }
  
  public void l() {
    List list = this.f;
    this.f = this.d;
    this.d = list;
    this.d.clear();
  }
  
  public void i(int paramInt) {
    this.o = paramInt;
  }
  
  public boolean m() {
    try {
      return (f() > 0 && c(0).size() > 0 && ((l)c(0).get(0)).b() > 0);
    } catch (j j) {
      return false;
    } 
  }
  
  public GComponentCq n() {
    return this.q;
  }
  
  public void a(long paramLong) {
    this.p = paramLong;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bO/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */