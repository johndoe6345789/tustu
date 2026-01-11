package G;

import ae.m;
import bH.X;

public class bT {
  private byte[] a = null;
  
  private String b = null;
  
  private m c = null;
  
  private int d = -1;
  
  public byte[] a() {
    return this.a;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
  }
  
  public void a(String paramString) {
    this.a = paramString.getBytes();
  }
  
  public String b() {
    return (this.a == null) ? null : ((this.a.length == 1) ? (this.a[0] + "") : X.k(new String(this.a)));
  }
  
  public static bT b(byte[] paramArrayOfbyte) {
    bT bT1 = new bT();
    bT1.a(paramArrayOfbyte);
    return bT1;
  }
  
  public String c() {
    return (this.b == null) ? ((this.a == null) ? "Unknown" : b()) : this.b;
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
  
  public String toString() {
    return "Signature:" + b() + ", firmware:" + this.b;
  }
  
  public boolean d() {
    byte[] arrayOfByte = a();
    return (arrayOfByte != null && arrayOfByte.length >= 3 && (arrayOfByte[0] & 0xE0) == 224 && (arrayOfByte[1] & 0xF0) == 0 && arrayOfByte[2] == 62);
  }
  
  public m e() {
    return this.c;
  }
  
  public void a(m paramm) {
    this.c = paramm;
  }
  
  public boolean f() {
    return (this.a != null && this.a.length == 3 && this.a[0] == -31);
  }
  
  public void a(int paramInt) {
    this.d = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */