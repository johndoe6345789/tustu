package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.bf;
import W.z;
import aE.a;
import bH.D;
import bH.X;
import bH.t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import r.a;
import r.j;
import r.o;
import r.p;

public class TuningViewFileLoader {
  public static List a(List<R> paramList) {
    ArrayList arrayList = new ArrayList();
    for (R r : paramList)
      arrayList.addAll(a(r)); 
    arrayList.addAll(b(paramList));
    arrayList.addAll(a());
    String[] arrayOfString = new String[paramList.size()];
    for (byte b = 0; b < paramList.size(); b++) {
      R r = paramList.get(b);
      arrayOfString[b] = r.i();
    } 
    return a(arrayList, arrayOfString);
  }
  
  public static List a(R paramR) {
    ArrayList<k> arrayList = new ArrayList();
    List list = paramR.af();
    for (bf bf : list) {
      try {
        k k = new k(bf.e().b(bf.aL(), bf.a()));
        k.a("Current ECU Definition");
        arrayList.add(k);
      } catch (Exception exception) {
        D.a("Failed to load Default TuneView from ecuConfig! name: " + bf.aL() + ", md5: " + bf.a() + "\nError: " + exception.getLocalizedMessage());
      } 
    } 
    File[] arrayOfFile = j.l().listFiles(new H());
    o o = p.a().b();
    if (arrayOfFile != null) {
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (arrayOfFile[b].getName().toLowerCase().endsWith(a.cp.toLowerCase())) {
          String str = z.a(arrayOfFile[b]);
          if (o == null || o.a(paramR.i(), str)) {
            k k = new k(arrayOfFile[b]);
            k.a("Application");
            arrayList.add(k);
          } 
        } 
      } 
    } else {
      D.b("No TuneView files found in :\n\t" + j.l());
    } 
    return arrayList;
  }
  
  public static List a() {
    ArrayList<k> arrayList = new ArrayList();
    File[] arrayOfFile = j.k().listFiles();
    if (arrayOfFile != null) {
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (arrayOfFile[b].getName().toLowerCase().endsWith(a.cp.toLowerCase()))
          arrayList.add(new k(arrayOfFile[b])); 
      } 
    } else {
      D.b("No TuneView files found in :\n\t" + j.l());
    } 
    return arrayList;
  }
  
  public static List b(List paramList) {
    ArrayList<k> arrayList = new ArrayList();
    File[] arrayOfFile = b();
    if (arrayOfFile != null) {
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (arrayOfFile[b].getName().toLowerCase().endsWith(a.cp.toLowerCase())) {
          k k = new k(arrayOfFile[b]);
          k.a("Current Project");
          arrayList.add(k);
        } 
      } 
    } else {
      D.b("No TuneView files found in :\n\t" + j.l());
    } 
    if (arrayList.isEmpty()) {
      ArrayList arrayList1 = new ArrayList();
      for (R r : paramList) {
        List list = a(r);
        arrayList1.addAll(list);
      } 
      byte b = 0;
      for (k k : arrayList1) {
        File file1 = k.a();
        File file2 = new File(j.a(a.A()), a(b++));
        t.a(file1, file2);
      } 
      if (b > 0)
        return b(paramList); 
    } 
    return arrayList;
  }
  
  public static File[] b() {
    return j.a(a.A()).listFiles(new I());
  }
  
  public static void c() {
    File[] arrayOfFile = b();
    for (int i = arrayOfFile.length - 1; i >= 0; i--) {
      String str = a(i);
      if (!str.equals(arrayOfFile[i].getName())) {
        File file = new File(arrayOfFile[i].getParentFile(), str);
        if (file.exists()) {
          for (int j = i; j >= 0; j--) {
            File file1 = new File(arrayOfFile[j].getParentFile(), arrayOfFile[j].getName() + "~");
            if (file1.exists() && !file1.delete()) {
              D.b("Can not delete file to correct TuneView file names for project. \n" + file1.getAbsolutePath());
            } else {
              arrayOfFile[j].renameTo(file1);
              arrayOfFile[j] = file1;
            } 
          } 
        } else if (!arrayOfFile[i].renameTo(file)) {
          D.b("Failed to rename TuningView File " + arrayOfFile[i].getName() + " to " + file.getName());
        } else {
          arrayOfFile[i] = file;
        } 
      } 
    } 
  }
  
  public static String a(int paramInt) {
    return k.a + X.a(paramInt + ".", '0', 4) + a.cp;
  }
  
  public static File b(int paramInt) {
    return new File(j.a(a.A()), a(paramInt));
  }
  
  public static List a(List<k> paramList, String[] paramArrayOfString) {
    o o = p.a().b();
    for (byte b = 0; b < paramList.size(); b++) {
      k k = paramList.get(b);
      String str = z.a(k.a());
      if (!a(o, paramArrayOfString, str)) {
        paramList.remove(b);
        b--;
      } 
    } 
    return paramList;
  }
  
  private static boolean a(o paramo, String[] paramArrayOfString, String paramString) {
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (paramo.a(paramArrayOfString[b], paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */