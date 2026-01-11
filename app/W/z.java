package W;

import V.g;
import bH.D;
import bH.X;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class z {
  public static String a(String paramString) {
    return a(new File(paramString));
  }
  
  public static String a(File paramFile) {
    String[] arrayOfString = b(paramFile);
    return (arrayOfString == null || arrayOfString.length == 0) ? null : arrayOfString[0];
  }
  
  public static String[] b(File paramFile) {
    if (paramFile == null)
      return null; 
    if (!paramFile.exists()) {
      D.c("File Not Found for signature: " + paramFile.getAbsolutePath());
      return null;
    } 
    String str = null;
    ArrayList<String> arrayList = new ArrayList();
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = s.b(paramFile);
      byte b = -1;
      String str1;
      while ((str1 = bufferedReader.readLine()) != null) {
        if (!str1.startsWith("<versionInfo") && str1.contains(";"))
          str1 = str1.substring(0, str1.indexOf(";")); 
        if (str1.contains("signature") || str1.contains("firmwareSignature")) {
          int i;
          if (str1.contains("signature=")) {
            i = str1.indexOf("\"", str1.indexOf("signature=")) + 1;
          } else {
            i = str1.indexOf("\"", str1.indexOf("ignature")) + 1;
          } 
          int j = str1.indexOf("\"", i + 1);
          if (i == 0) {
            str = str1.substring(str1.indexOf("=") + 1, str1.length()).trim();
            if (str.contains(";"))
              str = str.substring(0, str.indexOf(";")); 
          } else {
            try {
              str = str1.substring(i, j);
            } catch (Exception exception) {}
          } 
          if (str != null) {
            if (str.length() == 1 && str.getBytes()[0] == 20)
              str = "20"; 
            arrayList.add(str);
            b = 0;
          } 
        } 
        if (b > 4)
          break; 
        if (b != -1)
          b++; 
      } 
      return arrayList.<String>toArray(new String[arrayList.size()]);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (Exception exception) {
          Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String)null, exception);
        }  
    } 
  }
  
  public static double c(File paramFile) {
    if (paramFile == null)
      return -1.0D; 
    if (!paramFile.exists()) {
      D.c("File Not Found for iniVersion: " + paramFile.getAbsolutePath());
      return -1.0D;
    } 
    String str = null;
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = s.b(paramFile);
      String str1 = "";
      byte b = -1;
      while ((str1 = bufferedReader.readLine()) != null && b++ < 100) {
        if (str1.indexOf(";") != -1)
          str1 = str1.substring(0, str1.indexOf(";")); 
        if (str1.indexOf("iniVersion") != -1) {
          str = str1.substring(str1.indexOf("=") + 1, str1.length()).trim();
          break;
        } 
      } 
      return (str == null) ? 0.0D : Double.parseDouble(str);
    } catch (Exception exception) {
      exception.printStackTrace();
      return -1.0D;
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (Exception exception) {
          Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String)null, exception);
        }  
    } 
  }
  
  public static String d(File paramFile) {
    if (paramFile == null)
      return "No File"; 
    if (!paramFile.exists()) {
      D.c("File Not Found for iniVersion: " + paramFile.getAbsolutePath());
      return "File Not Found";
    } 
    String str = null;
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = s.b(paramFile);
      String str1 = "";
      byte b = -1;
      while ((str1 = bufferedReader.readLine()) != null && b++ < 100) {
        str1 = X.b(str1);
        if (str1.indexOf(";") != -1)
          str1 = str1.substring(0, str1.indexOf(";")); 
        if (str1.indexOf("viewName=") != -1) {
          int i = str1.indexOf("\"", str1.indexOf("viewName=")) + 1;
          int j = str1.indexOf("\"", i + 1);
          str = str1.substring(i, j).trim();
          break;
        } 
      } 
      return str;
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (Exception exception) {
          Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String)null, exception);
        }  
    } 
  }
  
  public static String a(File paramFile, String paramString) {
    if (paramFile == null)
      return "No File"; 
    if (!paramFile.exists()) {
      D.c("File Not Found for iniVersion: " + paramFile.getAbsolutePath());
      return "File Not Found";
    } 
    String str = null;
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = s.b(paramFile);
      String str1 = " ";
      byte b = -1;
      String str2 = paramString + "=";
      while ((str1 = bufferedReader.readLine()) != null && b++ < 100) {
        str1 = X.b(str1);
        if (str1.indexOf(";") != -1)
          str1 = str1.substring(0, str1.indexOf(";")); 
        if (str1.indexOf(str2) != -1) {
          int i = str1.indexOf("\"", str1.indexOf(str2)) + 1;
          int j = str1.indexOf("\"", i);
          str = str1.substring(i, j).trim();
          break;
        } 
      } 
      return str;
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (Exception exception) {
          Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String)null, exception);
        }  
    } 
  }
  
  public static ArrayList a(File paramFile, String paramString, FileFilter paramFileFilter) {
    ArrayList<ag> arrayList = new ArrayList();
    File[] arrayOfFile = (paramFileFilter == null) ? paramFile.listFiles() : paramFile.listFiles(paramFileFilter);
    if (arrayOfFile != null) {
      paramString = paramString.toLowerCase();
      aa aa = new aa();
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (arrayOfFile[b].isFile() && arrayOfFile[b].getName().toLowerCase().endsWith(paramString))
          try {
            ag ag = aa.b(arrayOfFile[b]);
            arrayList.add(ag);
          } catch (g g) {
            D.d("Failed to get MsqSummary for " + arrayOfFile[b] + "\nReported Error:" + g.getMessage());
          }  
      } 
    } 
    return arrayList;
  }
  
  public static String b(String paramString) {
    String str = X.e(paramString);
    str = X.b(str, " ", "").trim();
    str = X.b(str, "*", "").trim();
    str = X.b(str, "\\", "");
    str = X.b(str, "/", "").trim();
    return paramString.startsWith("Monster") ? (str + ".ecu") : (str + ".ini");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */