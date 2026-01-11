package G;

import bH.c;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class cf implements Serializable {
  private int d = 2;
  
  ArrayList a = new ArrayList();
  
  ArrayList b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  private int e = 0;
  
  private int f = 0;
  
  private int g = 0;
  
  public void a(ce paramce) {
    this.a.add(paramce);
  }
  
  public void a(ce paramce, int paramInt) {
    this.a.add(paramInt, paramce);
  }
  
  public void a(cc paramcc) {
    this.a.add(paramcc);
  }
  
  public void b(ce paramce) {
    this.b.add(paramce);
  }
  
  public void c(ce paramce) {
    this.c.add(paramce);
  }
  
  public ce a(int paramInt) {
    return this.a.get(paramInt);
  }
  
  public String[] a() {
    String[] arrayOfString = new String[this.a.size()];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = ((ce)this.a.get(b)).b(); 
    return arrayOfString;
  }
  
  public String[] b() {
    String[] arrayOfString = new String[this.a.size()];
    for (byte b = 0; b < this.a.size(); b++)
      arrayOfString[b] = ((ce)this.a.get(b)).g(); 
    return arrayOfString;
  }
  
  public double a(int paramInt1, int[] paramArrayOfint, int paramInt2) {
    BigInteger bigInteger = a(paramArrayOfint, paramInt2);
    return ((ce)this.a.get(paramInt1)).a(bigInteger);
  }
  
  public double a(int paramInt, int[] paramArrayOfint) {
    ce ce = this.b.get(paramInt);
    int i = ce.e();
    int j = ce.f();
    BigInteger bigInteger = c.a(paramArrayOfint, i, j, true, false);
    return ce.a(bigInteger);
  }
  
  public ce b(int paramInt) {
    return this.b.get(paramInt);
  }
  
  public double b(int paramInt, int[] paramArrayOfint) {
    ce ce = this.c.get(paramInt);
    int i = ce.e();
    int j = e();
    BigInteger bigInteger = c.a(paramArrayOfint, i, j, true, false);
    return ce.a(bigInteger);
  }
  
  public ce c(int paramInt) {
    return this.c.get(paramInt);
  }
  
  public ce a(String paramString) {
    int i = b(paramString);
    return (i == -1) ? null : a(i);
  }
  
  public int b(String paramString) {
    for (byte b = 0; b < this.a.size(); b++) {
      ce ce = this.a.get(b);
      if (ce.b().equals(paramString))
        return b; 
    } 
    return -1;
  }
  
  public BigInteger a(int[] paramArrayOfint, int paramInt) {
    int i = (paramArrayOfint.length - e() - g()) / c();
    paramInt = (paramInt + h() / c()) % i;
    int j = paramInt * c() + e();
    return c.a(paramArrayOfint, j, c(), true, false);
  }
  
  public int c() {
    return this.d;
  }
  
  public void d(int paramInt) {
    this.d = paramInt;
  }
  
  public int d() {
    return this.c.size();
  }
  
  public int e() {
    return this.e;
  }
  
  public void e(int paramInt) {
    this.e = paramInt;
  }
  
  public int f() {
    return this.b.size();
  }
  
  public int g() {
    return this.f;
  }
  
  public void f(int paramInt) {
    this.f = paramInt;
  }
  
  public int h() {
    return this.g;
  }
  
  public void g(int paramInt) {
    this.g = paramInt;
  }
  
  public int i() {
    return this.a.size();
  }
  
  public List j() {
    ArrayList<String> arrayList = new ArrayList();
    for (ce ce : this.a) {
      if (!ce.i())
        arrayList.add(ce.g()); 
    } 
    return arrayList;
  }
  
  public void k() {
    this.a.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */