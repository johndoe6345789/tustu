package bO;

import bH.c;

public class m {
  private int a = 0;
  
  public int a() {
    return 0x7 & this.a;
  }
  
  public boolean b() {
    return ((this.a & 0x8) != 0);
  }
  
  public int c() {
    return (this.a & 0xF0) >> 4;
  }
  
  public int d() {
    return this.a;
  }
  
  public void a(byte paramByte) {
    this.a = c.a(paramByte);
  }
  
  public String toString() {
    return "timestampModeByte=" + Integer.toBinaryString(this.a) + ", timestampSize=" + a() + ", timestampUnits=" + c() + ", fixedTimestamp=" + b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bO/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */