package business.batch_importers.bI_components;

import bH.D;
import bH.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class BiInterfaceIndia {
  static PublicKey a = null;

  public static PublicKey a(InputStream paramInputStream) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    try {
      String str1 = bufferedReader.readLine();
      BigInteger bigInteger1 = new BigInteger(c.c(str1));
      String str2 = bufferedReader.readLine();
      BigInteger bigInteger2 = new BigInteger(c.c(str2));
      RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(bigInteger1, bigInteger2);
      KeyFactory keyFactory = KeyFactory.getInstance("RSA");
      PublicKey publicKey = keyFactory.generatePublic(rSAPublicKeySpec);
      return publicKey;
    } catch (Exception exception) {
      throw new IOException("Error reading key, " + exception.getMessage());
    } finally {
      try {
        bufferedReader.close();
      } catch (Exception exception) {
      }
    }
  }

  private static PublicKey a() {
    if (a == null) a = a(h.a().b());
    return a;
  }

  public static byte[] a(byte[] paramArrayOfbyte) {
    PublicKey publicKey = a();
    return a(paramArrayOfbyte, publicKey);
  }

  public static byte[] a(byte[] paramArrayOfbyte, Key paramKey) {
    String str;
    try {
      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      cipher.init(1, paramKey);
      return cipher.doFinal(paramArrayOfbyte);
    } catch (IllegalBlockSizeException illegalBlockSizeException) {
      Logger.getLogger(i.class.getName())
          .log(Level.SEVERE, (String) null, illegalBlockSizeException);
      str = illegalBlockSizeException.getMessage();
      if (paramArrayOfbyte != null) D.c(c.d(paramArrayOfbyte));
    } catch (BadPaddingException badPaddingException) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String) null, badPaddingException);
      str = badPaddingException.getMessage();
    } catch (InvalidKeyException invalidKeyException) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String) null, invalidKeyException);
      str = invalidKeyException.getMessage();
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      Logger.getLogger(i.class.getName())
          .log(Level.SEVERE, (String) null, noSuchAlgorithmException);
      str = noSuchAlgorithmException.getMessage();
    } catch (NoSuchPaddingException noSuchPaddingException) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String) null, noSuchPaddingException);
      str = noSuchPaddingException.getMessage();
    }
    throw new IOException("Failed to encrypt data: " + str);
  }

  public static byte[] b(byte[] paramArrayOfbyte) {
    PublicKey publicKey = a();
    return b(paramArrayOfbyte, publicKey);
  }

  public static byte[] b(byte[] paramArrayOfbyte, Key paramKey) {
    String str;
    try {
      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      cipher.init(2, paramKey);
      return cipher.doFinal(paramArrayOfbyte);
    } catch (IllegalBlockSizeException illegalBlockSizeException) {
      str = illegalBlockSizeException.getMessage();
    } catch (BadPaddingException badPaddingException) {
      str = badPaddingException.getMessage();
    } catch (InvalidKeyException invalidKeyException) {
      str = invalidKeyException.getMessage();
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      str = noSuchAlgorithmException.getMessage();
    } catch (NoSuchPaddingException noSuchPaddingException) {
      str = noSuchPaddingException.getMessage();
    }
    throw new IOException("Failed to encrypt data: " + str);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bI/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
