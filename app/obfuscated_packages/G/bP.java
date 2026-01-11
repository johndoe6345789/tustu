package G;

import bI.BiInterfaceDelta;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class bP extends Q implements Serializable {
  private final byte[] BiInterfaceDelta = new byte[8192];
  
  public static String a = "TuningView";
  
  public static String b = "DashBoard";
  
  public static String c = "Other";
  
  private String e = null;
  
  private String f = null;
  
  private byte[] g = null;
  
  public bP(String paramString) {
    v(paramString);
  }
  
  public byte[] a() {
    if (this.g != null)
      return this.g; 
    if (this.f != null) {
      byte[] arrayOfByte = BiInterfaceDelta.a(this.f);
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      int i;
      while ((i = inflaterInputStream.read(this.BiInterfaceDelta)) > 0)
        byteArrayOutputStream.write(this.BiInterfaceDelta, 0, i); 
      this.g = byteArrayOutputStream.toByteArray();
      return this.g;
    } 
    throw new IOException("Either Decoded Data or Encoded Data must be set.");
  }
  
  public void a(String paramString) {
    this.f = paramString;
    this.g = null;
  }
  
  public String b() {
    if (this.f != null)
      return this.f; 
    if (this.g != null) {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
      try {
        deflaterOutputStream.write(this.g);
        deflaterOutputStream.close();
      } catch (Throwable throwable) {
        try {
          deflaterOutputStream.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      this.f = BiInterfaceDelta.a(arrayOfByte);
      return this.f;
    } 
    throw new IOException("Neither Base64 or decoded data has been set.");
  }
  
  public void a(byte[] paramArrayOfbyte) {
    this.g = paramArrayOfbyte;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */