package bH;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class m {
  private int a = 0;
  
  private int b = 0;
  
  public File a(File paramFile1, File paramFile2, FileFilter paramFileFilter) {
    return a(paramFile1, paramFile2, paramFileFilter, null);
  }
  
  public File a(File paramFile1, File paramFile2, FileFilter paramFileFilter, M paramM) {
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile2);
    ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
    File file = paramFile1;
    this.a = 0;
    this.b = a("", file, paramFileFilter);
    if (paramM != null)
      paramM.a(); 
    a("", zipOutputStream, file, paramFileFilter, paramM);
    zipOutputStream.close();
    if (paramM != null)
      paramM.b(); 
    return paramFile2;
  }
  
  private void a(String paramString, ZipOutputStream paramZipOutputStream, File paramFile, FileFilter paramFileFilter, M paramM) {
    File[] arrayOfFile = paramFile.listFiles();
    System.out.println("Adding directory " + paramFile.getName());
    for (byte b = 0; b < arrayOfFile.length; b++) {
      if (arrayOfFile[b].isDirectory()) {
        String str = paramString + arrayOfFile[b].getName() + "/";
        a(str, paramZipOutputStream, arrayOfFile[b], paramFileFilter, paramM);
      } else if (paramFileFilter == null || paramFileFilter.accept(arrayOfFile[b])) {
        try {
          System.out.println("Adding file " + arrayOfFile[b].getName());
          byte[] arrayOfByte = new byte[1024];
          FileInputStream fileInputStream = new FileInputStream(arrayOfFile[b]);
          paramZipOutputStream.putNextEntry(new ZipEntry(paramString + arrayOfFile[b].getName()));
          int i;
          while ((i = fileInputStream.read(arrayOfByte)) > 0)
            paramZipOutputStream.write(arrayOfByte, 0, i); 
          paramZipOutputStream.closeEntry();
          fileInputStream.close();
        } catch (IOException iOException) {
          System.out.println("IOException :" + iOException);
        } finally {
          this.a++;
          if (paramM != null)
            paramM.a((this.a / this.b)); 
        } 
      } 
    } 
  }
  
  private int a(String paramString, File paramFile, FileFilter paramFileFilter) {
    int i = 0;
    File[] arrayOfFile = paramFile.listFiles();
    for (byte b = 0; b < arrayOfFile.length; b++) {
      if (arrayOfFile[b].isDirectory()) {
        String str = paramString + arrayOfFile[b].getName() + "/";
        i += a(str, arrayOfFile[b], paramFileFilter);
      } else if (paramFileFilter == null || paramFileFilter.accept(arrayOfFile[b])) {
        i++;
      } 
    } 
    return i;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */