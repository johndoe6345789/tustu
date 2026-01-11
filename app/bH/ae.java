package bH;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ae {
  public static String a = "Successful";
  
  public static ArrayList a(File paramFile1, File paramFile2, String paramString) {
    return a(paramFile1, paramFile2, paramString, (M)null);
  }
  
  public static ArrayList a(File paramFile1, File paramFile2, String paramString, M paramM) {
    try {
      if (paramM != null)
        paramM.a(); 
      ZipFile zipFile = new ZipFile(paramFile1);
      ArrayList<File> arrayList = new ArrayList();
      byte b1 = 0;
      Enumeration<? extends ZipEntry> enumeration1 = zipFile.entries();
      while (enumeration1.hasMoreElements()) {
        enumeration1.nextElement();
        b1++;
      } 
      if (paramM != null)
        paramM.a(0.0D); 
      List list = a(paramString);
      byte b2 = 0;
      Enumeration<? extends ZipEntry> enumeration2 = zipFile.entries();
      while (enumeration2.hasMoreElements()) {
        String str2;
        ZipEntry zipEntry = enumeration2.nextElement();
        String str1 = zipEntry.getName();
        if (zipEntry.getName().contains(".")) {
          str2 = zipEntry.getName().substring(zipEntry.getName().lastIndexOf(".") + 1).toLowerCase();
        } else {
          str2 = "";
        } 
        if (str1.length() > 4)
          str1 = str1.substring(str1.length() - 4, str1.length()).toLowerCase(); 
        if (paramString == null || zipEntry.isDirectory() || str1.equals(".jpg") || str1.equals("jpeg") || str1.equals(".gif") || list.contains(str2)) {
          File file = a(zipFile, zipEntry, paramFile2);
          arrayList.add(file);
        } 
        b2++;
        if (paramM != null)
          paramM.a((b2 / b1)); 
      } 
      zipFile.close();
      return arrayList;
    } finally {
      if (paramM != null)
        paramM.b(); 
    } 
  }
  
  private static List a(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    if (paramString != null && !paramString.isEmpty())
      for (String str : paramString.split(";"))
        arrayList.add(str.toLowerCase());  
    return arrayList;
  }
  
  public static File a(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile) {
    InputStream inputStream = paramZipFile.getInputStream(paramZipEntry);
    try {
      File file1 = new File(paramFile, "/" + paramZipEntry.getName());
      String str = file1.getAbsolutePath();
      File file2 = new File(str.substring(0, str.lastIndexOf(File.separator)));
      file2.mkdirs();
      file1.setLastModified(paramZipEntry.getTime());
      if (paramZipEntry.isDirectory()) {
        file1.mkdir();
      } else {
        if (file1.exists())
          file1.delete(); 
        file1.createNewFile();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1));
        int i;
        while ((i = inputStream.read()) != -1)
          bufferedOutputStream.write(i); 
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
      } 
      return file1;
    } finally {
      try {
        inputStream.close();
      } catch (Exception exception) {}
    } 
  }
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    ZipFile zipFile = new ZipFile(paramString1);
    D.d("Expanding Zip File: " + paramString1 + ", to dir: " + paramString2);
    Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
    while (enumeration.hasMoreElements()) {
      ZipEntry zipEntry = enumeration.nextElement();
      String str = zipEntry.getName();
      if (str.length() > 4)
        str = str.substring(str.length() - 4, str.length()).toLowerCase(); 
      if (paramString3 == null || zipEntry.isDirectory() || str.equals(".jpg") || str.equals("jpeg") || str.equals(".gif")) {
        String str1 = a(zipFile, zipEntry, paramString2);
        if (!str1.equals(a))
          return str1; 
      } 
    } 
    zipFile.close();
    return a;
  }
  
  public static String a(ZipFile paramZipFile, ZipEntry paramZipEntry, String paramString) {
    InputStream inputStream = paramZipFile.getInputStream(paramZipEntry);
    File file1 = new File(paramString + "/" + paramZipEntry.getName());
    String str = file1.getAbsolutePath();
    File file2 = new File(str.substring(0, str.lastIndexOf(File.separator)));
    file2.mkdirs();
    file1.setLastModified(paramZipEntry.getTime());
    if (paramZipEntry.isDirectory()) {
      file1.mkdir();
    } else {
      if (file1.exists())
        file1.delete(); 
      file1.createNewFile();
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1));
      int i;
      while ((i = inputStream.read()) != -1)
        bufferedOutputStream.write(i); 
      bufferedOutputStream.flush();
      bufferedOutputStream.close();
    } 
    inputStream.close();
    return a;
  }
  
  public static File a(File paramFile1, File paramFile2, FileFilter paramFileFilter) {
    return (new m()).a(paramFile1, paramFile2, paramFileFilter);
  }
  
  public static File a(File paramFile1, File paramFile2, FileFilter paramFileFilter, M paramM) {
    return (new m()).a(paramFile1, paramFile2, paramFileFilter, paramM);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */