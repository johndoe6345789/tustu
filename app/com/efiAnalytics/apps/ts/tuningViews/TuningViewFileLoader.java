package com.efiAnalytics.apps.ts.tuningViews;

import G.R;
import G.GInterfaceBf;
import W.z;
import aE.PropertiesExtension;
import bH.D;
import bH.X;
import bH.t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import r.PropertiesExtension;
import r.ThreadedFile;
import r.RInterfaceOscar;
import r.RInterfacePapa;

public class TuningViewFileLoader {
  public static List PropertiesExtension(List<R> paramList) {
    ArrayList arrayList = new ArrayList();
    for (R r : paramList)
      arrayList.addAll(PropertiesExtension(r)); 
    arrayList.addAll(b(paramList));
    arrayList.addAll(PropertiesExtension());
    String[] arrayOfString = new String[paramList.size()];
    for (byte b = 0; b < paramList.size(); b++) {
      R r = paramList.get(b);
      arrayOfString[b] = r.i();
    } 
    return PropertiesExtension(arrayList, arrayOfString);
  }
  
  public static List PropertiesExtension(R paramR) {
    ArrayList<k> arrayList = new ArrayList();
    List list = paramR.af();
    for (GInterfaceBf GInterfaceBf : list) {
      try {
        k k = new k(GInterfaceBf.e().b(GInterfaceBf.aL(), GInterfaceBf.PropertiesExtension()));
        k.PropertiesExtension("Current ECU Definition");
        arrayList.add(k);
      } catch (Exception exception) {
        D.PropertiesExtension("Failed to load Default TuneView from ecuConfig! name: " + GInterfaceBf.aL() + ", md5: " + GInterfaceBf.PropertiesExtension() + "\nError: " + exception.getLocalizedMessage());
      } 
    } 
    File[] arrayOfFile = ThreadedFile.l().listFiles(new H());
    RInterfaceOscar RInterfaceOscar = RInterfacePapa.PropertiesExtension().b();
    if (arrayOfFile != null) {
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (arrayOfFile[b].getName().toLowerCase().endsWith(PropertiesExtension.cp.toLowerCase())) {
          String str = z.PropertiesExtension(arrayOfFile[b]);
          if (RInterfaceOscar == null || RInterfaceOscar.PropertiesExtension(paramR.i(), str)) {
            k k = new k(arrayOfFile[b]);
            k.PropertiesExtension("Application");
            arrayList.add(k);
          } 
        } 
      } 
    } else {
      D.b("No TuneView files found in :\n\t" + ThreadedFile.l());
    } 
    return arrayList;
  }
  
  public static List PropertiesExtension() {
    ArrayList<k> arrayList = new ArrayList();
    File[] arrayOfFile = ThreadedFile.k().listFiles();
    if (arrayOfFile != null) {
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (arrayOfFile[b].getName().toLowerCase().endsWith(PropertiesExtension.cp.toLowerCase()))
          arrayList.add(new k(arrayOfFile[b])); 
      } 
    } else {
      D.b("No TuneView files found in :\n\t" + ThreadedFile.l());
    } 
    return arrayList;
  }
  
  public static List b(List paramList) {
    ArrayList<k> arrayList = new ArrayList();
    File[] arrayOfFile = b();
    if (arrayOfFile != null) {
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (arrayOfFile[b].getName().toLowerCase().endsWith(PropertiesExtension.cp.toLowerCase())) {
          k k = new k(arrayOfFile[b]);
          k.PropertiesExtension("Current Project");
          arrayList.add(k);
        } 
      } 
    } else {
      D.b("No TuneView files found in :\n\t" + ThreadedFile.l());
    } 
    if (arrayList.isEmpty()) {
      ArrayList arrayList1 = new ArrayList();
      for (R r : paramList) {
        List list = PropertiesExtension(r);
        arrayList1.addAll(list);
      } 
      byte b = 0;
      for (k k : arrayList1) {
        File file1 = k.PropertiesExtension();
        File file2 = new File(ThreadedFile.PropertiesExtension(PropertiesExtension.A()), PropertiesExtension(b++));
        t.PropertiesExtension(file1, file2);
      } 
      if (b > 0)
        return b(paramList); 
    } 
    return arrayList;
  }
  
  public static File[] b() {
    return ThreadedFile.PropertiesExtension(PropertiesExtension.A()).listFiles(new I());
  }
  
  public static void c() {
    File[] arrayOfFile = b();
    for (int i = arrayOfFile.length - 1; i >= 0; i--) {
      String str = PropertiesExtension(i);
      if (!str.equals(arrayOfFile[i].getName())) {
        File file = new File(arrayOfFile[i].getParentFile(), str);
        if (file.exists()) {
          for (int ThreadedFile = i; ThreadedFile >= 0; ThreadedFile--) {
            File file1 = new File(arrayOfFile[ThreadedFile].getParentFile(), arrayOfFile[ThreadedFile].getName() + "~");
            if (file1.exists() && !file1.delete()) {
              D.b("Can not delete file to correct TuneView file names for project. \n" + file1.getAbsolutePath());
            } else {
              arrayOfFile[ThreadedFile].renameTo(file1);
              arrayOfFile[ThreadedFile] = file1;
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
  
  public static String PropertiesExtension(int paramInt) {
    return k.PropertiesExtension + X.PropertiesExtension(paramInt + ".", '0', 4) + PropertiesExtension.cp;
  }
  
  public static File b(int paramInt) {
    return new File(ThreadedFile.PropertiesExtension(PropertiesExtension.A()), PropertiesExtension(paramInt));
  }
  
  public static List PropertiesExtension(List<k> paramList, String[] paramArrayOfString) {
    RInterfaceOscar RInterfaceOscar = RInterfacePapa.PropertiesExtension().b();
    for (byte b = 0; b < paramList.size(); b++) {
      k k = paramList.get(b);
      String str = z.PropertiesExtension(k.PropertiesExtension());
      if (!PropertiesExtension(RInterfaceOscar, paramArrayOfString, str)) {
        paramList.remove(b);
        b--;
      } 
    } 
    return paramList;
  }
  
  private static boolean PropertiesExtension(RInterfaceOscar paramo, String[] paramArrayOfString, String paramString) {
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (paramo.PropertiesExtension(paramArrayOfString[b], paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */