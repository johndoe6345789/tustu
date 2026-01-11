package G;

import V.g;
import bH.D;
import bH.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class m extends Q {
  private int a = 0;
  
  private ArrayList b = new ArrayList();
  
  private List c = null;
  
  private int d = -1;
  
  private int[] e = null;
  
  private int f = -1;
  
  private int g = 1;
  
  private String h = null;
  
  private F i = null;
  
  private String j = null;
  
  private String k = null;
  
  private int l = -1;
  
  private int m = -1;
  
  private boolean n = false;
  
  private boolean o = false;
  
  private int p = -1;
  
  private int q = -1;
  
  private int r = -1;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private boolean u = true;
  
  private int v = 0;
  
  private o w = null;
  
  private Runnable x = null;
  
  private String y = null;
  
  public m(F paramF) {
    this.i = paramF;
  }
  
  public static m a(m paramm) {
    m m1 = new m(paramm.v());
    m1.e(paramm.o());
    m1.b(paramm.p());
    m1.f(paramm.q());
    m1.d(paramm.n());
    m1.e(paramm.n);
    m1.w(paramm.aM());
    m1.b = paramm.b;
    return m1;
  }
  
  public static m a(F paramF, int paramInt) {
    m m1 = new m(paramF);
    m1.d(6);
    m1.v("Burn");
    m1.e(paramInt);
    return m1;
  }
  
  public static m b(F paramF, int paramInt) {
    m m1 = new m(paramF);
    m1.d(256);
    m1.j(paramInt);
    m1.v("Update runtime channels");
    return m1;
  }
  
  public static m a(F paramF, String paramString) {
    m m1 = new m(paramF);
    m1.d(2048);
    m1.a(paramString);
    m1.b(new cH());
    m1.v("Read PC Variable");
    return m1;
  }
  
  public static m a(F paramF) {
    m m1 = new m(paramF);
    m1.d(2048);
    m1.a("ALL_PC_VARS");
    m1.b(new cH());
    m1.v("READ_PC_VARIABLES");
    return m1;
  }
  
  public static m a(F paramF, String paramString1, String paramString2) {
    m m1 = new m(paramF);
    m1.d(4096);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1).append("=").append(paramString2).append("~");
    m1.a(stringBuilder.toString());
    m1.v("WRITE_PC_VARIABLES");
    return m1;
  }
  
  public static m c(F paramF, int paramInt) {
    m m1 = new m(paramF);
    m1.d(512);
    m1.j(paramInt);
    m1.v("Staop DAQ");
    return m1;
  }
  
  public static m a(int[] paramArrayOfint) {
    m m1 = new m(null);
    m1.d(16);
    m1.b(paramArrayOfint);
    m1.v("RawWrite");
    return m1;
  }
  
  public static m a(F paramF, int[] paramArrayOfint) {
    m m1 = new m(paramF);
    m1.d(16);
    m1.b(paramArrayOfint);
    m1.v("Raw Write");
    return m1;
  }
  
  public static m b(F paramF) {
    m m1 = new m(paramF);
    m1.d(8192);
    int[] arrayOfInt = { 0 };
    m1.b(arrayOfInt);
    m1.v("Activate Server Turbo Baud");
    return m1;
  }
  
  public static m c(F paramF) {
    m m1 = new m(paramF);
    m1.d(8192);
    int[] arrayOfInt = { 1 };
    m1.b(arrayOfInt);
    m1.v("Deactivate Server Turbo Baud");
    return m1;
  }
  
  public static m d(F paramF) {
    m m1 = new m(paramF);
    H h = paramF.Q();
    m1.d(16);
    int[] arrayOfInt = c.b(h.d());
    m1.b(arrayOfInt);
    m1.v("Activate Turbo Baud");
    return m1;
  }
  
  public static m e(F paramF) {
    m m1 = new m(paramF);
    H h = paramF.R();
    m1.d(16);
    int[] arrayOfInt = c.b(h.d());
    m1.b(arrayOfInt);
    m1.d(true);
    m1.v("Deactivate Turbo Baud");
    return m1;
  }
  
  public static List b(F paramF, String paramString) {
    G g = paramF.b(paramString);
    ArrayList<m> arrayList = new ArrayList();
    for (H h : g) {
      m m1 = new m(paramF);
      m1.d(16);
      int[] arrayOfInt = c.b(h.d());
      m1.b(arrayOfInt);
      arrayList.add(m1);
      m1.v("CustomCommand");
    } 
    return arrayList;
  }
  
  public static m a(F paramF, List paramList) {
    m m1 = new m(paramF);
    m1.d(64);
    m1.a(paramList);
    m1.v("Chained Instruction");
    return m1;
  }
  
  public static m a(F paramF, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    m m1 = new m(paramF);
    m1.d(5);
    m1.e(paramInt1);
    m1.f(paramInt2);
    m1.b(paramArrayOfint);
    m1.v("Write Chunk");
    return m1;
  }
  
  public static m a(F paramF, String paramString, int[] paramArrayOfint) {
    m m1 = new m(paramF);
    m1.d(8);
    m1.d(paramString);
    m1.b(paramArrayOfint);
    m1.v("Write Reference Table");
    return m1;
  }
  
  public static m a(F paramF, int paramInt1, int paramInt2, int paramInt3) {
    m m1 = new m(paramF);
    m1.d(4);
    m1.e(paramInt1);
    m1.f(paramInt2);
    int[] arrayOfInt = { paramInt3 };
    m1.b(arrayOfInt);
    m1.v("Write byte");
    return m1;
  }
  
  public static m f(F paramF) {
    m m1 = new m(paramF);
    m1.d(128);
    H h = paramF.O();
    int[] arrayOfInt = c.b(h.d());
    m1.b(arrayOfInt);
    m1.v("Retrieve Config Error");
    return m1;
  }
  
  public static m a(F paramF, int paramInt1, int paramInt2) {
    String str = paramF.J();
    if (str != null)
      try {
        byte[] arrayOfByte = paramF.e(str).d();
        int[] arrayOfInt1 = new int[7];
        arrayOfInt1[0] = arrayOfByte[0];
        arrayOfInt1[1] = arrayOfByte[1];
        arrayOfInt1[2] = paramInt1;
        arrayOfInt1[3] = 0;
        arrayOfInt1[4] = 0;
        int[] arrayOfInt2 = new int[2];
        arrayOfInt2 = c.a(paramInt2, arrayOfInt2, true);
        arrayOfInt1[5] = arrayOfInt2[0];
        arrayOfInt1[6] = arrayOfInt2[1];
        m m1 = a(paramF, arrayOfInt1);
        m1.v("Table CRC Call");
        return m1;
      } catch (Exception exception) {
        exception.printStackTrace();
        throw new g("Unable to parse table CRC instruction: " + str);
      }  
    return null;
  }
  
  public static m a(String paramString1, String paramString2) {
    m m1 = new m(null);
    m1.d(7);
    m1.c(paramString2);
    m1.b(paramString1);
    m1.v("Test Connection");
    return m1;
  }
  
  public static m g(F paramF) {
    m m1 = new m(paramF);
    m1.d(3);
    m1.v("Read All Tune Data");
    return m1;
  }
  
  public static m d(F paramF, int paramInt) {
    m m1 = new m(paramF);
    m1.d(2);
    m1.e(paramInt);
    m1.v("Read Page " + (paramInt + 1));
    return m1;
  }
  
  public static m b(F paramF, int paramInt1, int paramInt2, int paramInt3) {
    m m1 = new m(paramF);
    m1.d(1);
    m1.e(paramInt1);
    m1.f(paramInt2);
    m1.b(paramInt3);
    m1.v("Read Chunk " + (paramInt1 + 1));
    return m1;
  }
  
  public void a(n paramn) {
    this.b.remove(paramn);
  }
  
  public void b(n paramn) {
    this.b.add(paramn);
  }
  
  public void b(double paramDouble) {
    Iterator<n> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      try {
        n n = iterator.next();
        n.a(paramDouble);
      } catch (Exception exception) {
        D.b("Exception in notifyProgressListenersUpdate, Continuing");
        exception.printStackTrace();
      } 
    } 
  }
  
  public void b(o paramo) {
    this.w = paramo;
    if (paramo.a() == 3) {
      c(paramo);
    } else {
      c(paramo);
    } 
  }
  
  public void c(o paramo) {
    Iterator<n> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      try {
        n n = iterator.next();
        n.a(paramo);
      } catch (Exception exception) {
        D.b("Exception in notifyProgressListenersComplete, Continuing");
        exception.printStackTrace();
      } 
    } 
  }
  
  public List a() {
    return this.c;
  }
  
  public void a(List paramList) {
    this.c = paramList;
  }
  
  public void a(int paramInt) {
    this.m = paramInt;
  }
  
  public int b() {
    return this.m;
  }
  
  public boolean c() {
    return this.o;
  }
  
  public void a(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public boolean d() {
    return this.s;
  }
  
  public void b(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public int f() {
    return this.q;
  }
  
  public void b(int paramInt) {
    this.q = paramInt;
  }
  
  public boolean g() {
    return this.u;
  }
  
  public void c(boolean paramBoolean) {
    this.u = paramBoolean;
  }
  
  public int h() {
    return this.v;
  }
  
  public void c(int paramInt) {
    this.v = paramInt;
  }
  
  private void j(int paramInt) {
    this.r = paramInt;
  }
  
  public int i() {
    return this.r;
  }
  
  public void d(boolean paramBoolean) {
    this.t = paramBoolean;
  }
  
  public o j() {
    return this.w;
  }
  
  public Runnable k() {
    return this.x;
  }
  
  public String l() {
    return this.y;
  }
  
  public void a(String paramString) {
    this.y = paramString;
  }
  
  public void m() {
    Iterator<n> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      try {
        n n = iterator.next();
        n.e();
      } catch (Exception exception) {
        D.b("Exception in notifyProgressListenersBegin, Continuing");
        exception.printStackTrace();
      } 
    } 
  }
  
  public int n() {
    return this.a;
  }
  
  public void d(int paramInt) {
    this.a = paramInt;
  }
  
  public int o() {
    return this.d;
  }
  
  public void e(int paramInt) {
    this.d = paramInt;
  }
  
  public int[] p() {
    return this.e;
  }
  
  public void b(int[] paramArrayOfint) {
    this.e = paramArrayOfint;
  }
  
  public int q() {
    return this.f;
  }
  
  public void f(int paramInt) {
    this.f = paramInt;
  }
  
  public int r() {
    return (this.e == null) ? 0 : this.e.length;
  }
  
  public String s() {
    return this.j;
  }
  
  public void b(String paramString) {
    this.j = paramString;
  }
  
  public String t() {
    return this.k;
  }
  
  public void c(String paramString) {
    this.k = paramString;
  }
  
  public void g(int paramInt) {
    this.p = paramInt;
  }
  
  public String u() {
    return this.h;
  }
  
  public void d(String paramString) {
    this.h = paramString;
  }
  
  public void h(int paramInt) {
    this.g = paramInt;
  }
  
  public F v() {
    return this.i;
  }
  
  public void h(F paramF) {
    this.i = paramF;
  }
  
  public int w() {
    return this.l;
  }
  
  public void i(int paramInt) {
    this.l = paramInt;
  }
  
  public boolean x() {
    return this.n;
  }
  
  public void e(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public String toString() {
    String str = "commandType=" + this.a + ", page=" + this.d + ", offset=" + this.f;
    if (this.e != null)
      str = str + " payload=" + c.b(this.e); 
    return str;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */