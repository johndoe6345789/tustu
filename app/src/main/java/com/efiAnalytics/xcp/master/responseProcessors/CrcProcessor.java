package com.efiAnalytics.xcp.master.responseProcessors;

import bH.D;
import bH.ad;
import bH.c;
import bN.BnInterfaceKilo;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import java.util.zip.CRC32;

public class CrcProcessor {
  ad a = new ad();
  
  CRC32 b = new CRC32();
  
  int c = 8;
  
  boolean d = true;
  
  public boolean a() {
    return this.d;
  }
  
  public static void main(String[] paramArrayOfString) {
    ad ad1 = new ad();
    byte[] arrayOfByte = { 59, 54 };
    ad1.b();
    ad1.a(arrayOfByte);
    int i = ad1.a();
    D.c("CRC: 0x" + Integer.toHexString(i).toUpperCase());
  }
  
  public boolean a(BnInterfaceKilo paramk, byte[] paramArrayOfbyte, BnInterfaceTango paramt) {
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte.length != 7) {
      D.c("Invalid CRC Response Packet: \n" + c.d(arrayOfByte));
      throw new BnInterfaceOscar("Invalid Checksum packet length. Expected 8, received: " + (arrayOfByte.length + 1));
    } 
    int i = c.a(arrayOfByte[0]);
    if (i == 8) {
      this.c = 8;
      this.a.b();
      this.a.a(paramArrayOfbyte);
      int j = this.a.a();
      int m = c.a(arrayOfByte, 3, 4, paramk.g(), false);
      D.c("Controller CRC: 0x" + Integer.toHexString(m).toUpperCase() + ", Local CRC: 0x" + Integer.toHexString(j).toUpperCase());
      if (j != m)
        D.c("CRC doesn'BnInterfaceTango match!"); 
      return (j == m);
    } 
    if (i == 9) {
      this.c = 9;
      this.b.reset();
      this.b.update(paramArrayOfbyte);
      int j = (int)this.b.getValue();
      int m = c.a(arrayOfByte, 3, 4, paramk.g(), false);
      return (j == m);
    } 
    this.d = false;
    return false;
  }
  
  public byte[] a(byte[] paramArrayOfbyte) {
    if (this.c == 8) {
      this.a.b();
      this.a.a(paramArrayOfbyte);
      int i = this.a.a();
      return c.a(i, new byte[2], true);
    } 
    if (this.c == 9) {
      this.b.reset();
      this.b.update(paramArrayOfbyte);
      int i = (int)this.b.getValue();
      return c.a(i, new byte[4], true);
    } 
    return new byte[0];
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/CrcProcessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */