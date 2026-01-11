package business.bit_array_utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class c {
  private static final int[] a = new int[] { 
      1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 
      1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 
      1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 
      1073741824, Integer.MIN_VALUE };
  
  private static final long[] b = new long[] { 
      1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 
      1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 
      1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 
      1073741824L, -2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 
      1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 
      1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 
      1152921504606846976L, 2305843009213693952L, 4611686018427387904L, Long.MIN_VALUE };
  
  public static boolean a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      for (byte b = 0; b < paramArrayOfbyte.length; b++) {
        byte b1 = paramArrayOfbyte[b];
        if (!a(b1))
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  public static boolean a(ArrayList paramArrayList) {
    for (Byte byte_ : paramArrayList) {
      if (byte_.intValue() < 9 || byte_.byteValue() > 126)
        return false; 
    } 
    return true;
  }
  
  public static boolean a(int paramInt) {
    return ((paramInt >= 32 && paramInt <= 126) || paramInt == 9 || paramInt == 10);
  }
  
  public static byte[] a(int[] paramArrayOfint) {
    byte[] arrayOfByte = new byte[paramArrayOfint.length];
    for (byte b = 0; b < paramArrayOfint.length; b++)
      arrayOfByte[b] = (byte)paramArrayOfint[b]; 
    return arrayOfByte;
  }
  
  public static int[] b(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = new int[paramArrayOfbyte.length];
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = a(paramArrayOfbyte[b]); 
    return arrayOfInt;
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3) {
    int i = a(paramInt2, paramInt3);
    int j = paramInt1 & i;
    return j >>> paramInt2;
  }
  
  public static long a(long paramLong, int paramInt1, int paramInt2) {
    long l1 = a(paramInt1, paramInt2);
    long l2 = paramLong & l1;
    return l2 >>> paramInt1;
  }
  
  public static byte[] c(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      if (paramArrayOfbyte[b] == 0) {
        byte[] arrayOfByte = new byte[b];
        System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, arrayOfByte.length);
        paramArrayOfbyte = arrayOfByte;
        break;
      } 
    } 
    return paramArrayOfbyte;
  }
  
  public static String a(String paramString) {
    boolean bool = false;
    for (byte b = 0; b < paramString.length(); b++) {
      if ((paramString.charAt(b) < ' ' || paramString.charAt(b) > '~') && paramString.charAt(b) != '\t') {
        bool = true;
        break;
      } 
    } 
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder();
      for (byte b1 = 0; b1 < paramString.length(); b1++) {
        if (paramString.charAt(b1) < ' ' || paramString.charAt(b1) > '~') {
          stringBuilder.append('.');
        } else {
          stringBuilder.append(paramString.charAt(b1));
        } 
      } 
      return stringBuilder.toString();
    } 
    return paramString;
  }
  
  public static int[] b(String paramString) {
    if (paramString.contains(",")) {
      arrayOfString = paramString.split(",");
    } else {
      arrayOfString = paramString.split(" ");
    } 
    ArrayList<String> arrayList = new ArrayList();
    for (String str : arrayOfString) {
      if (!str.contains(".") && str.length() > 1 && str.length() < 5)
        arrayList.add(str); 
    } 
    String[] arrayOfString = arrayList.<String>toArray(new String[arrayList.size()]);
    return a(arrayOfString);
  }
  
  public static int[] a(String[] paramArrayOfString) {
    int[] arrayOfInt = new int[paramArrayOfString.length];
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (paramArrayOfString[b].startsWith("0x") || paramArrayOfString[b].startsWith("x")) {
        paramArrayOfString[b] = X.b(paramArrayOfString[b], "0x", "");
        paramArrayOfString[b] = X.b(paramArrayOfString[b], "x", "");
        arrayOfInt[b] = Integer.parseInt(paramArrayOfString[b], 16);
      } else {
        arrayOfInt[b] = Integer.parseInt(paramArrayOfString[b]);
      } 
    } 
    return arrayOfInt;
  }
  
  public static byte[] a(Byte[] paramArrayOfByte) {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = paramArrayOfByte[b].byteValue(); 
    return arrayOfByte;
  }
  
  public static byte[] c(String paramString) {
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, ",");
    byte[] arrayOfByte = new byte[stringTokenizer.countTokens()];
    for (byte b = 0; stringTokenizer.hasMoreTokens(); b++)
      arrayOfByte[b] = Byte.parseByte(stringTokenizer.nextToken()); 
    return arrayOfByte;
  }
  
  public static BigInteger a(int[] paramArrayOfint, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    if (!paramBoolean1) {
      int[] arrayOfInt = new int[paramInt2];
      for (byte b1 = 0; b1 < paramInt2; b1++)
        arrayOfInt[arrayOfInt.length - 1 - b1] = paramArrayOfint[paramInt1 + b1]; 
      paramArrayOfint = arrayOfInt;
      paramInt1 = 0;
    } 
    byte[] arrayOfByte = new byte[paramInt2];
    for (byte b = 0; b < paramInt2; b++)
      arrayOfByte[b] = (byte)paramArrayOfint[paramInt1 + b]; 
    return new BigInteger(arrayOfByte);
  }
  
  public static byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1.length == 0)
      return paramArrayOfbyte2; 
    if (paramArrayOfbyte2.length == 0)
      return paramArrayOfbyte1; 
    byte[] arrayOfByte = new byte[paramArrayOfbyte1.length + paramArrayOfbyte2.length];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length, paramArrayOfbyte2.length);
    return arrayOfByte;
  }
  
  public static byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    byte[] arrayOfByte = new byte[paramInt3];
    arrayOfByte = a(paramInt1, arrayOfByte, paramBoolean);
    for (int i = paramInt2; i < paramArrayOfbyte.length && i < paramInt2 + paramInt3; i++)
      paramArrayOfbyte[i] = arrayOfByte[i - paramInt2]; 
    return paramArrayOfbyte;
  }
  
  public static byte[] a(byte[] paramArrayOfbyte, byte paramByte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      paramArrayOfbyte[b] = paramByte; 
    return paramArrayOfbyte;
  }
  
  public static int b(int[] paramArrayOfint, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    return a(paramArrayOfint, paramInt1, paramInt2, 0, paramBoolean1, paramBoolean2);
  }
  
  public static int a(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2) {
    int i = 0;
    if (!paramBoolean1) {
      int[] arrayOfInt = new int[paramInt2];
      for (byte b = 0; b < paramInt2; b++)
        arrayOfInt[arrayOfInt.length - 1 - b] = paramArrayOfint[paramInt1 + b]; 
      paramArrayOfint = arrayOfInt;
      paramInt1 = 0;
    } 
    int j;
    for (j = 0; j < paramInt2; j++) {
      int k = paramArrayOfint[paramInt1 + j] << (paramInt2 - j - 1) * 8;
      i += k;
    } 
    if (paramBoolean2 && (paramArrayOfint[paramInt1] | 0x80) == paramArrayOfint[paramInt1]) {
      i += paramInt3;
      for (j = paramInt2; j < 4; j++)
        i += 255 << j * 8; 
      i -= paramInt3;
    } 
    return i;
  }
  
  public static long c(int[] paramArrayOfint, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    long l = 0L;
    if (!paramBoolean1) {
      int[] arrayOfInt = new int[paramInt2];
      for (byte b = 0; b < paramInt2; b++)
        arrayOfInt[arrayOfInt.length - 1 - b] = paramArrayOfint[paramInt1 + b]; 
      paramArrayOfint = arrayOfInt;
      paramInt1 = 0;
    } 
    int i;
    for (i = 0; i < paramInt2; i++) {
      long l1 = paramArrayOfint[paramInt1 + i];
      l1 <<= (paramInt2 - i - 1) * 8;
      l += l1;
    } 
    if (paramBoolean2 && (paramArrayOfint[paramInt1] | 0x80) == paramArrayOfint[paramInt1])
      for (i = paramInt2; i < 4; i++)
        l += (255 << i * 8);  
    return l;
  }
  
  public static int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    int i = 0;
    if (paramInt2 == 0)
      return 0; 
    if (!paramBoolean1) {
      byte[] arrayOfByte = new byte[paramInt2];
      for (byte b = 0; b < paramInt2; b++)
        arrayOfByte[arrayOfByte.length - 1 - b] = paramArrayOfbyte[paramInt1 + b]; 
      paramArrayOfbyte = arrayOfByte;
      paramInt1 = 0;
    } 
    int j;
    for (j = 0; j < paramInt2; j++) {
      int k = a(paramArrayOfbyte[paramInt1 + j]);
      k <<= (paramInt2 - j - 1) * 8;
      i += k;
    } 
    if (paramBoolean2 && (paramArrayOfbyte[paramInt1] | 0x80) == paramArrayOfbyte[paramInt1])
      for (j = paramInt2; j < 4; j++)
        i += 255 << j * 8;  
    return i;
  }
  
  public static long b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    long l = 0L;
    if (paramInt2 == 0)
      return 0L; 
    if (!paramBoolean1) {
      byte[] arrayOfByte = new byte[paramInt2];
      for (byte b = 0; b < paramInt2; b++)
        arrayOfByte[arrayOfByte.length - 1 - b] = paramArrayOfbyte[paramInt1 + b]; 
      paramArrayOfbyte = arrayOfByte;
      paramInt1 = 0;
    } 
    int i;
    for (i = 0; i < paramInt2; i++) {
      long l1 = a(paramArrayOfbyte[paramInt1 + i]);
      l1 <<= (paramInt2 - i - 1) * 8;
      l += l1;
    } 
    if (paramBoolean2 && (paramArrayOfbyte[paramInt1] | 0x80) == paramArrayOfbyte[paramInt1])
      for (i = paramInt2; i < 4; i++)
        l += (255 << i * 8);  
    return l;
  }
  
  public static byte[] a(int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean) {
    int i = 2147483392;
    boolean bool = false;
    if (paramInt < 0) {
      paramInt = (paramInt ^ 0xFFFFFFFF) + 0;
      bool = true;
    } 
    byte b;
    for (b = 0; b < paramArrayOfbyte.length; b++) {
      paramArrayOfbyte[paramArrayOfbyte.length - b - 1] = (byte)(paramInt & (i ^ 0xFFFFFFFF));
      if (bool)
        paramArrayOfbyte[paramArrayOfbyte.length - b - 1] = (byte)(255 - paramArrayOfbyte[paramArrayOfbyte.length - b - 1]); 
      paramInt >>= 8;
    } 
    if (!paramBoolean)
      for (byte b1 = 0; b1 < paramArrayOfbyte.length / 2; b1++) {
        b = paramArrayOfbyte[b1];
        byte b2 = paramArrayOfbyte[paramArrayOfbyte.length - 1 - b1];
        paramArrayOfbyte[b1] = b2;
        paramArrayOfbyte[paramArrayOfbyte.length - 1 - b1] = b;
      }  
    return paramArrayOfbyte;
  }
  
  public static byte[] a(long paramLong, byte[] paramArrayOfbyte, boolean paramBoolean) {
    long l = 9223372036854775552L;
    boolean bool = false;
    if (paramLong < 0L) {
      paramLong = (paramLong ^ 0xFFFFFFFFFFFFFFFFL) + 0L;
      bool = true;
    } 
    byte b;
    for (b = 0; b < paramArrayOfbyte.length; b++) {
      paramArrayOfbyte[paramArrayOfbyte.length - b - 1] = (byte)(int)(paramLong & (l ^ 0xFFFFFFFFFFFFFFFFL));
      if (bool)
        paramArrayOfbyte[paramArrayOfbyte.length - b - 1] = (byte)(255 - paramArrayOfbyte[paramArrayOfbyte.length - b - 1]); 
      paramLong >>= 8L;
    } 
    if (!paramBoolean)
      for (byte b1 = 0; b1 < paramArrayOfbyte.length / 2; b1++) {
        b = paramArrayOfbyte[b1];
        byte b2 = paramArrayOfbyte[paramArrayOfbyte.length - 1 - b1];
        paramArrayOfbyte[b1] = b2;
        paramArrayOfbyte[paramArrayOfbyte.length - 1 - b1] = b;
      }  
    return paramArrayOfbyte;
  }
  
  public static int[] a(int paramInt, int[] paramArrayOfint, boolean paramBoolean) {
    char c1 = 'ÿ';
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramBoolean) {
        paramArrayOfint[paramArrayOfint.length - b - 1] = paramInt & c1;
      } else {
        paramArrayOfint[b] = paramInt & c1;
        paramArrayOfint[b] = paramArrayOfint[b];
      } 
      paramInt >>>= 8;
    } 
    return paramArrayOfint;
  }
  
  public static int[] a(long paramLong, int[] paramArrayOfint, boolean paramBoolean) {
    long l = 255L;
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramBoolean) {
        paramArrayOfint[paramArrayOfint.length - b - 1] = (int)(paramLong & l);
      } else {
        paramArrayOfint[b] = (int)(paramLong & l);
        paramArrayOfint[b] = paramArrayOfint[b];
      } 
      paramLong >>>= 8L;
    } 
    return paramArrayOfint;
  }
  
  public static String b(int[] paramArrayOfint) {
    return a(paramArrayOfint, 16);
  }
  
  public static String a(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint == null)
      return "null"; 
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramInt > 0 && b > 0 && b % paramInt == 0) {
        stringBuilder1.append("      ").append(stringBuilder2.toString()).append("\n");
        stringBuilder2.delete(0, stringBuilder2.length());
      } 
      int i = paramArrayOfint[b] & 0xFF;
      String str = X.a(Integer.toHexString(i).toUpperCase(), '0', 2);
      stringBuilder1.append(X.a("x" + str + " ", ' ', 4));
      if (i > 32 && i < 127) {
        stringBuilder2.append((char)i);
      } else {
        stringBuilder2.append(".");
      } 
    } 
    if (stringBuilder2.length() > 0)
      stringBuilder1.append(X.a(stringBuilder2.toString(), ' ', stringBuilder2.length() + 4 * paramInt + 6 - 4 * stringBuilder2.length())); 
    return stringBuilder1.toString();
  }
  
  public static String d(byte[] paramArrayOfbyte) {
    return a(paramArrayOfbyte, 16);
  }
  
  public static String a(byte[] paramArrayOfbyte, int paramInt) {
    return a(paramArrayOfbyte, paramInt, 0, paramArrayOfbyte.length);
  }
  
  public static String a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    for (int i = paramInt2; i < paramArrayOfbyte.length && i < paramInt2 + paramInt3; i++) {
      int j = a(paramArrayOfbyte[i]);
      if (paramInt1 > 0 && i > 0 && i % paramInt1 == 0) {
        stringBuilder1.append("      ").append(stringBuilder2).append("\n");
        stringBuilder2.delete(0, stringBuilder2.length());
      } 
      String str = X.a(Integer.toHexString(j).toUpperCase(), '0', 2);
      stringBuilder1.append(X.a("x" + str + " ", ' ', 4));
      if (j > 32 && j < 127) {
        stringBuilder2.append((char)j);
      } else {
        stringBuilder2.append(".");
      } 
    } 
    if (stringBuilder2.length() > 0)
      stringBuilder1.append(X.a(stringBuilder2.toString(), ' ', stringBuilder2.length() + 4 * paramInt1 + 6 - 4 * stringBuilder2.length())); 
    return stringBuilder1.toString();
  }
  
  public static int a(byte paramByte) {
    int i = paramByte;
    if (i < 0)
      i += 256; 
    return i;
  }
  
  public static String b(byte paramByte) {
    return "0x" + X.a(Integer.toHexString(a(paramByte)).toUpperCase(), '0', 2);
  }
  
  public static String a(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return a(0, paramArrayOfint1, paramArrayOfint2);
  }
  
  public static String a(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    String str1 = "";
    String str2 = "";
    String str3 = "";
    byte b1 = 8;
    int i = (paramArrayOfint1.length > paramArrayOfint2.length) ? paramArrayOfint1.length : paramArrayOfint2.length;
    byte b2 = 0;
    String str4 = "";
    String str5 = "";
    int j = 0;
    for (byte b3 = 0; b3 < i; b3++) {
      boolean bool = false;
      if (paramArrayOfint1.length <= b3 || paramArrayOfint2.length <= b3 || paramArrayOfint1[b3] != paramArrayOfint2[b3]) {
        bool = true;
        str2 = str2 + "x" + Integer.toHexString(b3 + paramInt).toUpperCase() + ", ";
        str3 = str3 + b3 + ", ";
        b2++;
      } 
      if (paramArrayOfint1.length > b3) {
        int k = paramArrayOfint1[b3] & 0xFF;
        String str = X.a(Integer.toHexString(k).toUpperCase(), '0', 2);
        if (!bool) {
          str4 = str4 + X.a(" x" + str + " ", ' ', 6);
        } else {
          str4 = str4 + X.a(" \"x" + str + "\"", ' ', 6);
        } 
      } else {
        str4 = str4 + X.a(" ", ' ', 6);
      } 
      if (paramArrayOfint2.length > b3) {
        int k = paramArrayOfint2[b3] & 0xFF;
        String str = X.a(Integer.toHexString(k).toUpperCase(), '0', 2);
        if (!bool) {
          str5 = str5 + X.a(" x" + str + " ", ' ', 6);
        } else {
          str5 = str5 + X.a(" \"x" + str + "\"", ' ', 6);
        } 
      } else {
        str5 = str5 + X.a(" ", ' ', 6);
      } 
      if (b3 == i - 1 || (b1 > 0 && b3 > 0 && (b3 + 1) % b1 == 0)) {
        String str = "x" + X.a(Integer.toHexString(j).toUpperCase(), '0', 4);
        if ((b3 + 1) % b1 != 0)
          for (byte b = 0; (b3 + 1 + b) % b1 != 0; b++)
            str4 = str4 + "      ";  
        str1 = str1 + str + "\t" + str4 + "\t   " + str5 + "\n";
        str4 = "";
        str5 = "";
        j += b1;
      } 
    } 
    if (b2 > 0) {
      str1 = "Differences Detected at the following addresses:\n" + str2 + "\nor in Decimal:\n" + str3 + "\nNon Matching bytes in quotes:\n                          Set 1                                                        Set 2\n" + str1;
    } else {
      str1 = "No difference detected in the following data sets:\n                          Set 1                                                        Set 2\n" + str1;
    } 
    return str1;
  }
  
  public static boolean b(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (paramArrayOfint1 == null && paramArrayOfint2 == null)
      return true; 
    if (paramArrayOfint1 == null || paramArrayOfint2 == null)
      return false; 
    if (paramArrayOfint1.length != paramArrayOfint2.length)
      return false; 
    for (byte b = 0; b < paramArrayOfint1.length; b++) {
      if (paramArrayOfint1[b] >= 0 && paramArrayOfint2[b] >= 0 && paramArrayOfint1[b] != paramArrayOfint2[b])
        return false; 
    } 
    return true;
  }
  
  public static boolean a(double[][] paramArrayOfdouble1, double[][] paramArrayOfdouble2, int paramInt, double paramDouble) {
    if (paramArrayOfdouble1 == null || paramArrayOfdouble2 == null || paramArrayOfdouble1.length != paramArrayOfdouble2.length)
      return false; 
    if (paramArrayOfdouble1.length == 0 || (paramArrayOfdouble1[0]).length == 0)
      return true; 
    for (byte b = 0; b < paramArrayOfdouble1.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfdouble1[0]).length; b1++) {
        if (paramArrayOfdouble1[b][b1] != paramArrayOfdouble2[b][b1]) {
          double d1 = Math.pow(10.0D, paramInt);
          double d2 = paramArrayOfdouble1[b][b1];
          double d3 = paramArrayOfdouble2[b][b1];
          double d4 = Math.round(Math.abs(d2 - d3) * d1) / d1;
          if (d4 >= paramDouble)
            return false; 
        } 
      } 
    } 
    return true;
  }
  
  public static boolean b(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1 == null && paramArrayOfbyte2 == null)
      return true; 
    if (paramArrayOfbyte1 == null || paramArrayOfbyte2 == null)
      return false; 
    if (paramArrayOfbyte1.length != paramArrayOfbyte2.length)
      return false; 
    for (byte b = 0; b < paramArrayOfbyte1.length; b++) {
      if (paramArrayOfbyte1[b] != paramArrayOfbyte2[b])
        return false; 
    } 
    return true;
  }
  
  public static boolean c(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1 == null || paramArrayOfbyte2 == null || paramArrayOfbyte1.length != paramArrayOfbyte2.length)
      return false; 
    for (byte b = 0; b < paramArrayOfbyte1.length; b++) {
      if (paramArrayOfbyte1[b] != paramArrayOfbyte2[b])
        return false; 
    } 
    return true;
  }
  
  public static boolean c(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (paramArrayOfint1 == null || paramArrayOfint2 == null || paramArrayOfint1.length != paramArrayOfint2.length)
      return false; 
    for (byte b = 0; b < paramArrayOfint1.length; b++) {
      if (paramArrayOfint1[b] != paramArrayOfint2[b])
        return false; 
    } 
    return true;
  }
  
  private static int a(int paramInt1, int paramInt2) {
    int i = 0;
    for (int j = paramInt1; j <= paramInt2; j++)
      i |= a[j]; 
    return i;
  }
  
  public static byte[] b(int paramInt) {
    return new byte[] { (byte)(paramInt >>> 24), (byte)(paramInt >>> 16), (byte)(paramInt >>> 8), (byte)paramInt };
  }
  
  public static boolean e(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      if (paramArrayOfbyte[b] != 0)
        return false; 
    } 
    return true;
  }
  
  public static boolean c(int[] paramArrayOfint) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramArrayOfint[b] != 0)
        return false; 
    } 
    return true;
  }
  
  public static int d(String paramString) {
    byte b = 10;
    if (paramString.startsWith("x")) {
      paramString = paramString.substring(1);
      b = 16;
    } else {
      b = 8;
    } 
    return Integer.parseInt(paramString, b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */