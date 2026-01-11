package ae;

import G.AeInterfaceMikeTostring;
import bH.D;

public class AeInterfaceOscar {
  static boolean a = false;
  
  public static String b = "MegaSquirt 1";
  
  public static String c = "MS2/Microsquirt/GPIO";
  
  public static String d = "MS2 Updated";
  
  public static String e = "Microsquirt(cased)";
  
  public static String f = "Megasquirt 2";
  
  public static String g = "Microsquirt-module";
  
  public static String h = "GPIO";
  
  public static String i = "MSPNP";
  
  public static String j = "MS3";
  
  public static String k = "Megasquirt-3";
  
  public static String l = "MS3-Pro";
  
  public static String m = "MS3-Pro 2nd Gen";
  
  public static String n = "MS3-Pro Ultimate";
  
  public static String o = "MS3-Pro Mini";
  
  public static String p = "MS3-Pro Competition";
  
  public static String q = "MS3-Pro-Plus";
  
  public static String r = "MS3-Gold";
  
  public static String s = "BigStuff Gen4";
  
  public static String t = "XCP Controller";
  
  public static String u = "Unknown";
  
  public static int v = 0;
  
  public static int w = 1;
  
  public static int x = 2;
  
  public static int y = 4;
  
  public static int z = 8;
  
  public static int A = 16;
  
  public static int B = 32;
  
  public static int C = 64;
  
  public static int D = 128;
  
  public static int E = 256;
  
  public static int F = 512;
  
  public static int G = 1024;
  
  public static int H = 2048;
  
  public static int I = 4096;
  
  public static int J = 8192;
  
  public static int K = 16384;
  
  public static int L = 32768;
  
  public static int M = 65536;
  
  public static int N = 131072;
  
  public static int O = 1073741824;
  
  public static long P = 33554432L;
  
  public static long Q = 16777216L;
  
  public static m a(int paramInt) {
    int i = 0;
    String str = "Unknown Monitor Version";
    if (paramInt == 12546 || paramInt == 513) {
      i = w;
      str = c;
    } else if (paramInt == 12547) {
      i = w | D;
      str = d;
    } else if (paramInt >= 528 && paramInt <= 543) {
      i = w | D | F;
      str = e;
    } else if (paramInt >= 544 && paramInt <= 559) {
      i = w | C | F;
      str = f;
    } else if (paramInt >= 560 && paramInt <= 575) {
      i = w | G | F;
      str = g;
    } else if (paramInt >= 576 && paramInt <= 591) {
      i = w | F;
      str = h;
    } else if (paramInt >= 592 && paramInt <= 607) {
      i = w | E | F;
      str = i;
    } else if (paramInt == 0) {
      i = x;
      str = j;
    } else if (paramInt == 928) {
      i = x | J;
      str = m;
    } else if (paramInt == 944) {
      i = x | K;
      str = n;
    } else if (paramInt >= 960 && paramInt <= 975) {
      i = x | M;
      str = q;
    } else if (paramInt >= 976 && paramInt <= 991) {
      i = x | L;
      str = o;
    } else if (paramInt >= 992 && paramInt <= 1007) {
      i = x | N;
      str = p;
    } else if (paramInt >= 768 && paramInt <= 783) {
      i = x | A;
      str = k;
    } else if (paramInt >= 896 && paramInt <= 911) {
      i = x | B;
      str = l;
    } else if (paramInt >= 912 && paramInt <= 927) {
      i = x | A | I;
      str = r;
    } 
    if (a)
      D.d(str + " hardware found.\n"); 
    m m = new m();
    m.b(paramInt);
    m.a(str);
    m.a(i);
    return m;
  }
  
  public static boolean a(AeInterfaceMikeTostring parambT) {
    if (parambT != null) {
      byte[] arrayOfByte = parambT.a();
      if (arrayOfByte != null && (arrayOfByte[0] & 0xE0) == 224 && (arrayOfByte[1] & 0xF0) == 0 && arrayOfByte[2] == 62)
        return false; 
    } 
    return true;
  }
  
  public static m b(AeInterfaceMikeTostring parambT) {
    if (parambT != null && parambT.b() != null) {
      String str1 = parambT.b();
      int i = 0;
      char c = Character.MIN_VALUE;
      String str2 = "Unknown Monitor Version";
      if (str1.startsWith(s)) {
        str2 = s;
      } else if (str1.startsWith("MS3")) {
        if (str1.endsWith("P")) {
          i = x | B;
          str2 = l;
        } else if (str1.endsWith("U")) {
          i = x | K;
          str2 = n;
        } else if (str1.endsWith("E")) {
          i = x | J;
          str2 = m;
        } else if (str1.endsWith("I")) {
          i = x | L;
          str2 = o;
        } else if (str1.endsWith("8")) {
          i = x | N;
          str2 = p;
        } else if (str1.endsWith("M")) {
          i = x | M;
          str2 = q;
        } else {
          i = x | A;
          str2 = k;
        } 
        c = '΀';
      } else if (str1.startsWith("MS2")) {
        if (str1.endsWith("U")) {
          i = w | D | F;
          str2 = e;
          c = 'Ƞ';
        } else if (str1.endsWith("M")) {
          i = w | G | F;
          str2 = g;
          c = 'ɀ';
        } else if (str1.endsWith("P")) {
          i = w | E | F;
          str2 = i;
          c = 'ɐ';
        } else if (str1.endsWith("2")) {
          i = w | C | F;
          str2 = f;
          c = 'Ƞ';
        } else {
          i = w;
          str2 = c;
          c = '㄂';
        } 
      } else if (str1.startsWith("MS1") || str1.startsWith("MS/Extra") || str1.startsWith("MSnS")) {
        i = 0;
        str2 = b;
        c = Character.MIN_VALUE;
      } else if (!str1.startsWith("MS4")) {
        i = w;
        str2 = c;
        c = Character.MIN_VALUE;
      } 
      if (a)
        D.d(str2 + " hardware found.\n"); 
      m m = new m();
      m.b(c);
      m.a(str2);
      m.a(i);
      return m;
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */