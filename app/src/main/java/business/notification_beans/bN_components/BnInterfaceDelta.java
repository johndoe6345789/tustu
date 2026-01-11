package business.notification_beans.bN_components;

import bH.c;

public class BnInterfaceDelta {
  private byte[] a;
  
  private boolean b = false;
  
  public BnInterfaceDelta(int paramInt) {
    this.a = new byte[paramInt];
  }
  
  public void a(int paramInt) {
    this.a = c.a(paramInt, this.a, c());
  }
  
  public int a() {
    return c.a(this.a, 0, this.a.length, this.b, false);
  }
  
  public int b() {
    return this.a.length;
  }
  
  public boolean c() {
    return this.b;
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public byte[] d() {
    return this.a;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */