package business.bit_array_utils;

import C.f;
import W.IOInWPackage;
import W.d;
import W.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e {
  public boolean a(String paramString1, String paramString2, String paramString3) {
    File file1 = new File(paramString2);
    if (IOInWPackage.b(file1)) {
      D.a("Already Encrypted: " + paramString2);
      return false;
    } 
    File file2 = new File(paramString3);
    byte[] arrayOfByte = null;
    try {
      arrayOfByte = d.a(file1);
    } catch (FileNotFoundException fileNotFoundException) {
      D.a("InputFile Not Found: " + file1);
      D.a(f.k);
      return false;
    } catch (IOException iOException) {
      D.a("Error reading InputFile: " + file1);
      iOException.printStackTrace();
      D.a(f.k);
      return false;
    } 
    if (file2.exists())
      file2.delete(); 
    try {
      file2.createNewFile();
    } catch (IOException iOException) {
      D.a("Failed to create file:\n" + file2.getAbsolutePath());
      iOException.printStackTrace();
      D.a(f.k);
      return false;
    } 
    String str = z.a(file1);
    double d = z.c(file1);
    IOInWPackage IOInWPackage = new IOInWPackage();
    try {
      IOInWPackage.a(arrayOfByte, file2, paramString1, str, d);
      D.d("file written to:\n" + file2.getAbsolutePath());
      return true;
    } catch (IOException iOException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, iOException);
      D.a("Unable to Write Output File.");
      iOException.printStackTrace();
      return false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */