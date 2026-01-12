package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SerializableImplUsingArrayList extends bv implements Serializable {
  private ArrayList f = new ArrayList();

  private int g = -1;

  private String h = null;

  private int i = 1;

  private String j = "";

  private int k = 0;

  private double l = 1.0D;

  HashMap a = new HashMap<>();

  private ArrayList m = new ArrayList();

  private ArrayList n = new ArrayList();

  public int a() {
    return this.f.size();
  }

  public Iterator b() {
    return this.f.iterator();
  }

  public void a(String paramString1, String paramString2) {
    this.f.add(new aY(this, paramString1, paramString2));
  }

  public int c() {
    return this.g;
  }

  public void a(int paramInt) {
    this.g = paramInt;
  }

  public int d() {
    return this.i;
  }

  public void b(int paramInt) {
    this.i = paramInt;
  }

  public Iterator f() {
    return this.m.iterator();
  }

  public void a(ba paramba) {
    this.m.add(paramba);
  }

  public Iterator g() {
    return this.n.iterator();
  }

  public void a(bF parambF) {
    this.n.add(parambF);
  }

  public void a(String paramString) {
    this.h = paramString;
  }

  public int h() {
    return this.k;
  }

  public void c(int paramInt) {
    this.k = paramInt;
  }

  public String i() {
    return this.j;
  }

  public void b(String paramString) {
    this.j = paramString;
  }

  public int j() {
    return this.m.size();
  }

  public double k() {
    return this.l;
  }

  public void a(double paramDouble) {
    this.l = paramDouble;
  }

  public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3) {
    aZ aZ = new aZ(this);
    aZ.a(paramDouble1);
    aZ.b(paramDouble2);
    aZ.c(paramDouble3);
    this.a.put(paramString, aZ);
  }

  public double c(String paramString) {
    aZ aZ = (aZ) this.a.get(paramString);
    return (aZ == null) ? Double.MIN_VALUE : aZ.a();
  }

  public double d(String paramString) {
    aZ aZ = (aZ) this.a.get(paramString);
    return (aZ == null) ? Double.MAX_VALUE : aZ.b();
  }

  public double e(String paramString) {
    aZ aZ = (aZ) this.a.get(paramString);
    return (aZ == null) ? 0.0D : aZ.c();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
