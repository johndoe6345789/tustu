package bH;

import java.util.List;

public class S {
  public static Object[] a(Object[] paramArrayOfObject) {
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      for (int i = b + 1; i < paramArrayOfObject.length; i++) {
        Object object1 = paramArrayOfObject[b];
        Object object2 = paramArrayOfObject[i];
        if (object1.toString().compareTo(object2.toString()) > 0) {
          paramArrayOfObject[b] = object2;
          paramArrayOfObject[i] = object1;
        } 
      } 
    } 
    return paramArrayOfObject;
  }
  
  public static Integer[] a(Integer[] paramArrayOfInteger) {
    for (byte b = 0; b < paramArrayOfInteger.length; b++) {
      for (int i = b + 1; i < paramArrayOfInteger.length; i++) {
        Integer integer1 = paramArrayOfInteger[b];
        Integer integer2 = paramArrayOfInteger[i];
        if (integer1.intValue() > integer2.intValue()) {
          paramArrayOfInteger[b] = integer2;
          paramArrayOfInteger[i] = integer1;
        } 
      } 
    } 
    return paramArrayOfInteger;
  }
  
  public static Object[] a(R[] paramArrayOfR) {
    for (byte b = 0; b < paramArrayOfR.length; b++) {
      for (int i = b + 1; i < paramArrayOfR.length; i++) {
        R r1 = paramArrayOfR[b];
        R r2 = paramArrayOfR[i];
        if (r1.c().compareTo(r2.c()) > 0) {
          paramArrayOfR[b] = r2;
          paramArrayOfR[i] = r1;
        } 
      } 
    } 
    return (Object[])paramArrayOfR;
  }
  
  public static String[] a(String[] paramArrayOfString) {
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      for (int i = b + 1; i < paramArrayOfString.length; i++) {
        String str1 = paramArrayOfString[b];
        String str2 = paramArrayOfString[i];
        if (str1.compareToIgnoreCase(str2) > 0) {
          paramArrayOfString[b] = str2;
          paramArrayOfString[i] = str1;
        } 
      } 
    } 
    return paramArrayOfString;
  }
  
  public static List a(List<R> paramList) {
    for (byte b = 0; b < paramList.size(); b++) {
      for (int i = b + 1; i < paramList.size(); i++) {
        R r1 = paramList.get(b);
        R r2 = paramList.get(i);
        if (r1.c().compareTo(r2.c()) > 0) {
          paramList.set(b, r2);
          paramList.set(i, r1);
        } 
      } 
    } 
    return paramList;
  }
  
  public static List b(List<String> paramList) {
    for (byte b = 0; b < paramList.size(); b++) {
      for (int i = b + 1; i < paramList.size(); i++) {
        String str1 = paramList.get(b);
        String str2 = paramList.get(i);
        if (str1.toLowerCase().compareTo(str2.toLowerCase()) > 0) {
          paramList.set(b, str2);
          paramList.set(i, str1);
        } 
      } 
    } 
    return paramList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */