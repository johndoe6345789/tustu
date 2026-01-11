package X;

import W.ExceptionExtension;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class IOInXPackage implements b {
  private static char[] c = new char[] { 
      'E', 'F', 'I', 'A', 'K', 'e', 'y', '!', '3', '8', 
      '5', '4', '1', '5', '6', '6' };
  
  String a = new String(c);
  
  boolean b = false;
  
  public String a() {
    return "JavaSerialization";
  }
  
  public void a(Object paramObject, File paramFile) {
    if (this.b) {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
      objectOutputStream.writeObject(paramObject);
      objectOutputStream.flush();
      objectOutputStream.close();
      try {
        byte[] arrayOfByte = a(byteArrayOutputStream.toByteArray());
        W.d.a(paramFile, arrayOfByte);
      } catch (Exception exception) {
        throw new IOException("Error encrypting Cache File: " + exception.getLocalizedMessage());
      } 
    } else {
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(paramFile));
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
      objectOutputStream.writeObject(paramObject);
      objectOutputStream.flush();
      objectOutputStream.close();
    } 
  }
  
  public Object a(File paramFile) {
    if (this.b) {
      byte[] arrayOfByte2;
      byte[] arrayOfByte1 = W.d.a(paramFile);
      try {
        arrayOfByte2 = b(arrayOfByte1);
      } catch (Exception exception) {
        throw new IOException("Error decrypting Cache File: " + exception.getLocalizedMessage());
      } 
      BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new ByteArrayInputStream(arrayOfByte2));
      ObjectInputStream objectInputStream1 = new ObjectInputStream(bufferedInputStream1);
      return objectInputStream1.readObject();
    } 
    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
    ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
    return objectInputStream.readObject();
  }
  
  private byte[] a(byte[] paramArrayOfbyte) {
    String str = this.a;
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
    cipher.init(1, secretKeySpec, new IvParameterSpec("WWWWWWWWWXXXXXXX".getBytes("UTF-8")));
    return cipher.doFinal(paramArrayOfbyte);
  }
  
  private byte[] b(byte[] paramArrayOfbyte) {
    String str = this.a;
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
    cipher.init(2, secretKeySpec, new IvParameterSpec("WWWWWWWWWXXXXXXX".getBytes("UTF-8")));
    try {
      return cipher.doFinal(paramArrayOfbyte);
    } catch (IllegalBlockSizeException illegalBlockSizeException) {
      throw new ExceptionExtension("Invalid Password");
    } catch (BadPaddingException badPaddingException) {
      throw new ExceptionExtension("Invalid Password");
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/X/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */