package bN;

import bH.D;
import bR.d;
import bS.i;
import java.io.IOException;

public class k {
  private static boolean a = false;
  
  private long b = 0L;
  
  private static long c = -1L;
  
  private int d = 1;
  
  private int e = 1;
  
  private int f = 0;
  
  private int g = 1;
  
  private int h = 50;
  
  private int i = (int)Math.pow(2.0D, 16.0D) - 1;
  
  private int j = 10000;
  
  private boolean k = false;
  
  private int l = 10;
  
  private int m = 1;
  
  private int n = 55;
  
  private int o = 255;
  
  private int p = 0;
  
  private boolean q = false;
  
  private boolean r = false;
  
  private int s = 250;
  
  private int t = a ? 2000 : 1000;
  
  private final i u = new i();
  
  private int v = 0;
  
  private final j w = new j();
  
  private final a x = new a();
  
  private int y = 50;
  
  private int z = 25;
  
  private int A = 25;
  
  private int B = 25;
  
  private int C = 25;
  
  private int D = 25;
  
  private int E = 25;
  
  public static void a(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public int a() {
    return this.p;
  }
  
  public void a(int paramInt) {
    this.p = paramInt;
  }
  
  public int b() {
    return this.m;
  }
  
  public void b(int paramInt) {
    this.m = paramInt;
    D.d("Setting Transport");
    if (paramInt == 2) {
      c(2);
      d(2);
      e(0);
    } else if (paramInt == 1) {
      c(1);
      d(1);
      e(1);
    } else {
      throw new IOException("Unsupported XCP Transport: " + paramInt);
    } 
    d.a().b(this);
  }
  
  public int c() {
    return this.d;
  }
  
  public void c(int paramInt) {
    this.d = paramInt;
  }
  
  public int d() {
    return this.e;
  }
  
  public void d(int paramInt) {
    this.e = paramInt;
  }
  
  public int e() {
    return this.f;
  }
  
  public int f() {
    return this.g;
  }
  
  public void e(int paramInt) {
    this.g = paramInt;
  }
  
  public boolean g() {
    return this.x.c();
  }
  
  public int h() {
    return this.j;
  }
  
  public int i() {
    return this.h;
  }
  
  public void f(int paramInt) {
    this.h = paramInt;
  }
  
  public int j() {
    return this.i;
  }
  
  public void g(int paramInt) {
    this.i = paramInt;
  }
  
  public int k() {
    return this.n;
  }
  
  public void h(int paramInt) {
    this.n = paramInt;
  }
  
  public int l() {
    return this.o;
  }
  
  public boolean m() {
    return this.r;
  }
  
  public int n() {
    return this.l;
  }
  
  public i o() {
    return this.u;
  }
  
  public j p() {
    return this.w;
  }
  
  public int q() {
    return this.t;
  }
  
  public int r() {
    return this.y;
  }
  
  public int s() {
    return this.E;
  }
  
  public a t() {
    return this.x;
  }
  
  public int u() {
    return this.x.b();
  }
  
  public static float v() {
    if (c == -1L)
      c = System.currentTimeMillis(); 
    return (float)(System.currentTimeMillis() - c) / 1000.0F;
  }
  
  public long w() {
    if (this.b <= 0L)
      this.b = System.nanoTime(); 
    return System.nanoTime() - this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */