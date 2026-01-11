package bH;

import bI.BiInterfaceEcho;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class f {
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4) {
    if (paramString1 == null || paramString2 == null || paramString3 == null || paramString4 == null || paramString1.length() == 0 || paramString2.length() == 0 || paramString3.length() == 0 || paramString4.length() == 0)
      return null; 
    byte[] arrayOfByte = new byte[paramString1.length() + paramString2.length() + paramString3.length() + paramString2.length() + paramString4.length()];
    System.arraycopy(paramString2.getBytes(), 0, arrayOfByte, 0, paramString2.length());
    System.arraycopy(paramString3.getBytes(), 0, arrayOfByte, paramString2.length(), paramString3.length());
    System.arraycopy(paramString1.getBytes(), 0, arrayOfByte, paramString2.length() + paramString3.length(), paramString1.length());
    System.arraycopy(paramString2.getBytes(), 0, arrayOfByte, paramString2.length() + paramString3.length() + paramString1.length(), paramString2.length());
    System.arraycopy(paramString4.getBytes(), 0, arrayOfByte, paramString2.length() + paramString3.length() + paramString1.length() + paramString2.length(), paramString4.length());
    byte b;
    for (b = 0; b < arrayOfByte.length / 2; b++) {
      byte b1 = arrayOfByte[b];
      byte b2 = arrayOfByte[arrayOfByte.length - 1 - b];
      arrayOfByte[arrayOfByte.length - 1 - b] = b1;
      arrayOfByte[b] = b2;
    } 
    for (b = 0; b < arrayOfByte.length; b++) {
      byte b1 = arrayOfByte[b];
      int i = b1 + (b1 - 32) % 7;
      i -= b % 4;
      if (i > 122)
        i -= 9; 
      arrayOfByte[b] = (byte)i;
    } 
    for (b = 0; b < arrayOfByte.length; b++) {
      if (arrayOfByte[b] == 96 || arrayOfByte[b] == 92 || arrayOfByte[b] == 91 || arrayOfByte[b] == 93 || arrayOfByte[b] == 59 || arrayOfByte[b] == 46)
        arrayOfByte[b] = (byte)(arrayOfByte[b] + 6 + b % 10); 
    } 
    return new String(arrayOfByte);
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    try {
      if (paramString1 == null || paramString2 == null || paramString3 == null || paramString5 == null || paramString4 == null || paramString1.length() == 0 || paramString2.length() == 0 || paramString3.length() == 0 || paramString5.length() == 0)
        return null; 
      byte[] arrayOfByte1 = a(paramString1, paramString2, paramString3, paramString5).getBytes();
      MessageDigest messageDigest = MessageDigest.getInstance("MD5");
      arrayOfByte1 = (new String(arrayOfByte1) + paramString4).getBytes();
      messageDigest.update(arrayOfByte1);
      messageDigest.update(arrayOfByte1);
      byte[] arrayOfByte2 = messageDigest.digest();
      messageDigest.update(arrayOfByte1);
      arrayOfByte2 = messageDigest.digest();
      BiInterfaceEcho BiInterfaceEcho = new BiInterfaceEcho();
      BiInterfaceEcho.a(arrayOfByte2);
      byte[] arrayOfByte3 = new byte[4];
      arrayOfByte3 = c.a(BiInterfaceEcho.a(), arrayOfByte3, true);
      byte[] arrayOfByte4 = new byte[arrayOfByte2.length + 4];
      System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, arrayOfByte3.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte4, 4, arrayOfByte2.length);
      String str = "";
      for (byte b = 0; b < arrayOfByte4.length; b++)
        str = str + "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ".charAt(Math.abs(arrayOfByte4[b]) % "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ".length()); 
      return str;
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      D.a("Unable to perform check with this machine");
      return null;
    } 
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7) {
    try {
      if (paramString1 == null || paramString2 == null || paramString3 == null || paramString5 == null || paramString4 == null || paramString1.length() == 0 || paramString2.length() == 0 || paramString3.length() == 0 || paramString5.length() == 0 || paramString6.length() == 0 || paramString7.length() == 0)
        return null; 
      byte[] arrayOfByte1 = (a(paramString1.toLowerCase(), paramString2.toLowerCase(), paramString3, paramString5.toLowerCase()) + paramString6 + paramString7).getBytes();
      MessageDigest messageDigest = MessageDigest.getInstance("MD5");
      arrayOfByte1 = (new String(arrayOfByte1) + paramString4).getBytes();
      messageDigest.update(arrayOfByte1);
      messageDigest.update(arrayOfByte1);
      arrayOfByte1 = (new String(arrayOfByte1) + paramString6).getBytes();
      messageDigest.update(arrayOfByte1);
      byte[] arrayOfByte2 = messageDigest.digest();
      BiInterfaceEcho BiInterfaceEcho = new BiInterfaceEcho();
      BiInterfaceEcho.a(arrayOfByte2);
      byte[] arrayOfByte3 = new byte[4];
      arrayOfByte3 = c.a(BiInterfaceEcho.a(), arrayOfByte3, true);
      byte[] arrayOfByte4 = new byte[arrayOfByte2.length + 4];
      System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, arrayOfByte3.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte4, 4, arrayOfByte2.length);
      String str = "";
      for (byte b = 0; b < arrayOfByte4.length; b++)
        str = str + "23456789ABCDEFGHJKLMNPQRSTUVWXYZ".charAt(Math.abs(arrayOfByte4[b]) % "23456789ABCDEFGHJKLMNPQRSTUVWXYZ".length()); 
      return str;
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      D.a("Unable to perform check with this machine");
      return null;
    } 
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8) {
    try {
      if (paramString1 == null || paramString2 == null || paramString3 == null || paramString5 == null || paramString4 == null || paramString8 == null || paramString1.length() == 0 || paramString2.length() == 0 || paramString3.length() == 0 || paramString5.length() == 0 || paramString6.length() == 0 || paramString7.length() == 0 || paramString8.length() == 0)
        return null; 
      byte[] arrayOfByte1 = (a(paramString1.toLowerCase(), paramString2.toLowerCase(), paramString3, paramString5.toLowerCase()) + paramString6 + paramString7 + paramString8).getBytes();
      MessageDigest messageDigest = MessageDigest.getInstance("MD5");
      arrayOfByte1 = (new String(arrayOfByte1) + paramString4).getBytes();
      messageDigest.update(arrayOfByte1);
      messageDigest.update(arrayOfByte1);
      arrayOfByte1 = (new String(arrayOfByte1) + paramString6).getBytes();
      messageDigest.update(arrayOfByte1);
      byte[] arrayOfByte2 = messageDigest.digest();
      BiInterfaceEcho BiInterfaceEcho = new BiInterfaceEcho();
      BiInterfaceEcho.a(arrayOfByte2);
      byte[] arrayOfByte3 = new byte[4];
      arrayOfByte3 = c.a(BiInterfaceEcho.a(), arrayOfByte3, true);
      byte[] arrayOfByte4 = new byte[arrayOfByte2.length + 4];
      System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, arrayOfByte3.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte4, 4, arrayOfByte2.length);
      String str = "";
      for (byte b = 0; b < arrayOfByte4.length; b++)
        str = str + "23456789ABCDEFGHJKLMNPQRSTUVWXYZ".charAt(Math.abs(arrayOfByte4[b]) % "23456789ABCDEFGHJKLMNPQRSTUVWXYZ".length()); 
      return str;
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      D.a("Unable to perform check with this machine");
      return null;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */