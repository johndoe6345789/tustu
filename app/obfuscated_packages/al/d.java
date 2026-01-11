package al;

import W.j;
import W.n;
import am.c;
import am.e;
import am.h;
import am.k;
import bH.D;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class d {
  public static byte a(ByteBuffer paramByteBuffer) {
    return paramByteBuffer.get();
  }
  
  public static int b(ByteBuffer paramByteBuffer) {
    return paramByteBuffer.getShort() & 0xFFFF;
  }
  
  public static short c(ByteBuffer paramByteBuffer) {
    return paramByteBuffer.getShort();
  }
  
  public static long d(ByteBuffer paramByteBuffer) {
    return paramByteBuffer.getInt() & 0xFFFFFFFFL;
  }
  
  public static long e(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[8];
    paramByteBuffer.get(arrayOfByte);
    long l1 = (arrayOfByte[0] & 0xFFL) << 0L | (arrayOfByte[1] & 0xFFL) << 8L | (arrayOfByte[2] & 0xFFL) << 16L | (arrayOfByte[3] & 0xFFL) << 24L;
    long l2 = (arrayOfByte[4] & 0xFFL) << 0L | (arrayOfByte[5] & 0xFFL) << 8L | (arrayOfByte[6] & 0xFFL) << 16L | (arrayOfByte[7] & 0xFFL) << 24L;
    return l1 << 0L | l2 << 32L;
  }
  
  public static double f(ByteBuffer paramByteBuffer) {
    return paramByteBuffer.getDouble();
  }
  
  public static long g(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[8];
    paramByteBuffer.get(arrayOfByte);
    long l1 = (arrayOfByte[0] & 0xFFL) << 0L | (arrayOfByte[1] & 0xFFL) << 8L | (arrayOfByte[2] & 0xFFL) << 16L | (arrayOfByte[3] & 0xFFL) << 24L;
    long l2 = (arrayOfByte[4] & 0xFFL) << 0L | (arrayOfByte[5] & 0xFFL) << 8L | (arrayOfByte[6] & 0xFFL) << 16L | (arrayOfByte[7] & 0xFFL) << 24L;
    return l1 << 0L | l2 << 32L;
  }
  
  public static String a(ByteBuffer paramByteBuffer, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    paramByteBuffer.get(arrayOfByte);
    byte b1 = 0;
    for (byte b2 = 0; b2 < arrayOfByte.length && arrayOfByte[b2] != 0; b2++)
      b1++; 
    return new String(arrayOfByte, 0, b1, "ISO-8859-1");
  }
  
  public static String b(ByteBuffer paramByteBuffer, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    paramByteBuffer.get(arrayOfByte);
    byte b1 = 0;
    for (byte b2 = 0; b2 < arrayOfByte.length && arrayOfByte[b2] != 0; b2++)
      b1++; 
    return new String(arrayOfByte, 0, b1, "UTF-8");
  }
  
  public static List a(c paramc) {
    ArrayList<am.d> arrayList = new ArrayList();
    am.d d1 = paramc.g();
    if (d1 != null) {
      arrayList.add(d1);
      while ((d1 = d1.n()) != null)
        arrayList.add(d1); 
    } 
    return arrayList;
  }
  
  public static List a(h paramh) {
    ArrayList<e> arrayList = new ArrayList();
    byte b = 0;
    e e = paramh.g();
    if (e != null) {
      e.a(++b);
      arrayList.add(e);
      while ((e = e.e()) != null) {
        e.a(++b);
        arrayList.add(e);
      } 
    } 
    return arrayList;
  }
  
  public static n a(List paramList) {
    n n = new n();
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    for (am.d d1 : paramList) {
      String str = d1.o().e();
      j j = new j(str);
      if (d1.q() instanceof k) {
        k k = (k)d1.q();
        String str1 = k.e();
        if (str1 != null && !str1.isEmpty())
          j.e(str1); 
      } 
      n.add(j);
      b++;
    } 
    D.c("      " + b + " Channel Names: " + stringBuilder.toString());
    return n;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/al/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */