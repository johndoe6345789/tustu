package G;

import V.g;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class cd implements Serializable {
  public static String a = "composite";
  
  public static String b = "tooth";
  
  public static String c = "trigger";
  
  public static String d = "csv";
  
  public static String e = "stdMS2Composite";
  
  public static String f = "stdMS3Composite";
  
  public static String g = "stdMS2SyncComposite";
  
  public static String h = "stdMS3SyncComposite";
  
  public static String i = "stdMS2Tooth";
  
  public static String j = "stdMS3Tooth";
  
  public static String k = "stdMS2Trigger";
  
  public static String l = "stdMS3Trigger";
  
  private String n = "Standard";
  
  private cf o = null;
  
  private String p = null;
  
  private String q = null;
  
  private String r = null;
  
  private String s = null;
  
  private String t = null;
  
  private String u = null;
  
  private String v = "";
  
  private int w = -1;
  
  private int x = -1;
  
  private boolean y = true;
  
  private boolean z = false;
  
  private cg A = null;
  
  private String B = null;
  
  Map m = new HashMap<>();
  
  private int C = -1;
  
  private int D = -1;
  
  private int E = 1;
  
  public String a() {
    return this.v;
  }
  
  public cf b() {
    return this.o;
  }
  
  public void c() {
    if (this.A != null)
      this.o = this.A.a(this.o); 
  }
  
  public void a(cf paramcf) {
    this.o = paramcf;
  }
  
  public String d() {
    return this.p;
  }
  
  public void a(String paramString) {
    if (paramString.equals(a) || paramString.equals(b) || paramString.equals(c) || paramString.equals(d)) {
      this.p = paramString;
    } else {
      throw new g("Invalid logger type! Valid types:" + a + ", " + b + " and " + c + " and " + d);
    } 
  }
  
  public String e() {
    return this.r;
  }
  
  public void b(String paramString) {
    this.r = paramString;
  }
  
  public int f() {
    return this.x;
  }
  
  public void a(int paramInt) {
    this.x = paramInt;
  }
  
  public String g() {
    return this.q;
  }
  
  public void c(String paramString) {
    this.q = paramString;
  }
  
  public String h() {
    return this.u;
  }
  
  public void d(String paramString) {
    this.u = paramString;
  }
  
  public int i() {
    return this.D;
  }
  
  public void b(int paramInt) {
    this.D = paramInt;
  }
  
  public String j() {
    return this.s;
  }
  
  public void e(String paramString) {
    this.s = paramString;
  }
  
  public String k() {
    return this.t;
  }
  
  public void f(String paramString) {
    this.t = paramString;
  }
  
  public boolean l() {
    return this.y;
  }
  
  public void a(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  public int m() {
    return this.C;
  }
  
  public void c(int paramInt) {
    this.C = paramInt;
  }
  
  public void a(cg paramcg) {
    this.A = paramcg;
  }
  
  public String n() {
    return this.n;
  }
  
  public void g(String paramString) {
    if (paramString.equals("UDP_Stream") || paramString.equals("Standard")) {
      this.n = paramString;
    } else {
      throw new g("Unknown logProcessorType! Supported types: Standard, UDP_Stream");
    } 
  }
  
  public int o() {
    return this.w;
  }
  
  public void d(int paramInt) {
    this.w = paramInt;
  }
  
  public void a(ci paramci) {
    this.m.put(paramci.a(), paramci);
  }
  
  public ci h(String paramString) {
    return (ci)this.m.get(paramString);
  }
  
  public int p() {
    return this.E;
  }
  
  public void e(int paramInt) {
    this.E = paramInt;
  }
  
  public void i(String paramString) {
    this.B = paramString;
  }
  
  public String q() {
    return this.B;
  }
  
  public boolean r() {
    return this.z;
  }
  
  public void b(boolean paramBoolean) {
    this.z = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */