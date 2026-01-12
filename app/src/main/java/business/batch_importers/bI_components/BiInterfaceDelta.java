package business.batch_importers.bI_components;

import bH.D;
import bH.q;
import java.io.File;
import java.lang.reflect.Method;

public class BiInterfaceDelta {
  public static String a(byte[] paramArrayOfbyte) {
    float f = q.c();
    if (!Float.isNaN(f) && f >= 1.8F)
      try {
        Class<?> clazz1 = Class.forName("java.util.Base64");
        Class[] arrayOfClass1 = new Class[0];
        Method method1 = clazz1.getMethod("getEncoder", arrayOfClass1);
        Object object = method1.invoke(clazz1, new Object[0]);
        Class<?> clazz2 = Class.forName("java.util.Base64$Encoder");
        Class[] arrayOfClass2 = {byte[].class};
        Method method2 = clazz2.getMethod("encodeToString", arrayOfClass2);
        return (String) method2.invoke(object, new Object[] {paramArrayOfbyte});
      } catch (Exception exception) {
        D.d("Could not Base64 encode using 1.8 method, using legacy.");
      }
    return a.a(paramArrayOfbyte);
  }

  public static String a(File paramFile) {
    float f = q.c();
    if (!Float.isNaN(f) && f >= 1.8F) {
      byte[] arrayOfByte = W.d.a(paramFile);
      try {
        Class<?> clazz1 = Class.forName("java.util.Base64");
        Class[] arrayOfClass1 = new Class[0];
        Method method1 = clazz1.getMethod("getEncoder", arrayOfClass1);
        Object object = method1.invoke(clazz1, new Object[0]);
        Class<?> clazz2 = Class.forName("java.util.Base64$Encoder");
        Class[] arrayOfClass2 = {byte[].class};
        Method method2 = clazz2.getMethod("encodeToString", arrayOfClass2);
        return (String) method2.invoke(object, new Object[] {arrayOfByte});
      } catch (Exception exception) {
        D.d("Could not Base64 encode using 1.8 method, using legacy.");
      }
    }
    return a.b(paramFile.getAbsolutePath());
  }

  public static byte[] a(String paramString) {
    float f = q.c();
    if (!Float.isNaN(f) && f >= 1.8F)
      try {
        Class<?> clazz1 = Class.forName("java.util.Base64");
        Class[] arrayOfClass1 = new Class[0];
        Method method1 = clazz1.getMethod("getDecoder", arrayOfClass1);
        Object object = method1.invoke(clazz1, new Object[0]);
        Class<?> clazz2 = null;
        clazz2 = Class.forName("java.util.Base64$Decoder");
        Class[] arrayOfClass2 = {String.class};
        Method method2 = clazz2.getMethod("decode", arrayOfClass2);
        return (byte[]) method2.invoke(object, new Object[] {paramString});
      } catch (Exception exception) {
        D.d("Could not Base64 decode using 1.8 method, using legacy.");
      }
    return a.a(paramString);
  }

  public static void a(String paramString, File paramFile) {
    float f = q.c();
    if (!Float.isNaN(f) && f >= 1.8F)
      try {
        Class<?> clazz1 = Class.forName("java.util.Base64");
        Class[] arrayOfClass1 = new Class[0];
        Method method1 = clazz1.getMethod("getDecoder", arrayOfClass1);
        Object object = method1.invoke(clazz1, new Object[0]);
        Class<?> clazz2 = null;
        clazz2 = Class.forName("java.util.Base64$Decoder");
        Class[] arrayOfClass2 = {String.class};
        Method method2 = clazz2.getMethod("decode", arrayOfClass2);
        byte[] arrayOfByte = (byte[]) method2.invoke(object, new Object[] {paramString});
        W.d.a(paramFile, arrayOfByte);
        return;
      } catch (Exception exception) {
        D.d("Could not Base64 decode using 1.8 method, using legacy.");
      }
    a.a(paramString, paramFile.getAbsolutePath());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bI/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
