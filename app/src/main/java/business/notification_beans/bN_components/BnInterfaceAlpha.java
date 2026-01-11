package business.notification_beans.bN_components;

import bH.D;

public class BnInterfaceAlpha {
  private byte a = 64;
  
  public boolean a() {
    return ((this.a | 0x40) == this.a);
  }
  
  public int b() {
    if ((this.a | 0x4) == this.a && (this.a | 0x2) == this.a) {
      D.a("Invalid Reserved Address Granularity!");
      return -1;
    } 
    return ((this.a | 0x2) == this.a) ? 4 : (((this.a | 0x4) == this.a) ? 2 : 1);
  }
  
  public boolean c() {
    return ((this.a | 0x1) == this.a);
  }
  
  public byte d() {
    return this.a;
  }
  
  public void a(byte paramByte) {
    this.a = paramByte;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */