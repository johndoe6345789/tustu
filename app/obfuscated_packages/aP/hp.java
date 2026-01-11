package aP;

import aY.AyInterfaceOscar;
import ac.AbstractUsingArrayList;
import bH.D;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.et;
import IOInIPackage.IOInIPackage;
import java.awt.Frame;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import r.IOPropertiesUsingFile;
import r.ThreadedFile;

public class hp {
  et IOPropertiesUsingFile = null;
  
  private static String c = "megaLogViewerLocation";
  
  public static String[] b = new String[] { 
      "C:\\Program Files\\EFIAnalytics\\MegaLogViewerHD\\MegaLogViewer.exe", "C:\\Program Files (x86)\\EFIAnalytics\\MegaLogViewerHD\\MegaLogViewer.exe", "C:\\Program Files(x86)\\EFIAnalytics\\MegaLogViewerHD\\MegaLogViewer.exe", "C:\\Program Files\\EFIAnalytics\\MegaLogViewerHD\\MegaLogViewerHD.exe", "C:\\Program Files (x86)\\EFIAnalytics\\MegaLogViewerHD\\MegaLogViewerHD.exe", "C:\\Program Files(x86)\\EFIAnalytics\\MegaLogViewerHD\\MegaLogViewerHD.exe", "c:\\Program Files(x86)\\EFIAnalytics\\MegaLogViewer\\MegaLogViewer(x64).exe", "c:\\Program Files(x86)\\EFIAnalytics\\MegaLogViewer\\MegaLogViewer.exe", "c:\\Program Files (x86)\\EFIAnalytics\\MegaLogViewer\\MegaLogViewer(x64).exe", "c:\\Program Files\\EFIAnalytics\\MegaLogViewer\\MegaLogViewer(x64).exe", 
      "c:\\Program Files (x86)\\EFIAnalytics\\MegaLogViewer\\MegaLogViewer.exe", "C:\\Program Files (x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe", "c:\\Program Files\\EFIAnalytics\\MegaLogViewer\\MegaLogViewer.exe", "c:\\Program Files\\MegaSquirt\\MegaLogViewer\\MegaLogViewer.exe", "/Applications/MegaLogViewerHD.app/Contents/Java/MegaLogViewer.sh", "/Applications/MegaLogViewerMS.app/Contents/Java/MegaLogViewer.sh" };
  
  public hp(et paramet) {
    this.IOPropertiesUsingFile = paramet;
  }
  
  public void IOPropertiesUsingFile(String paramString) {
    boolean bool = false;
    boolean bool1 = IOPropertiesUsingFile.IOPropertiesUsingFile().c(IOPropertiesUsingFile.bT, IOPropertiesUsingFile.bU);
    if (!bool1) {
      bool = !IOInIPackage.IOPropertiesUsingFile().IOPropertiesUsingFile("openLog", paramString) ? true : false;
    } else {
      bool = true;
    } 
    if (bool)
      b(paramString); 
  }
  
  public void b(String paramString) {
    String str1 = b();
    if (str1 == null || str1.equals("") || !(new File(str1)).exists())
      str1 = IOPropertiesUsingFile(); 
    if (str1 == null || str1.equals("")) {
      D.d("No Path to MLV, not starting.");
      return;
    } 
    String str2 = str1.substring(0, str1.lastIndexOf(File.separator));
    File file1 = new File(str2);
    File file2 = new File(ThreadedFile.A(), "mlvLaunch.properties");
    boolean bool = false;
    if (file2.exists() && !file2.delete()) {
      D.IOPropertiesUsingFile("Failed to delete " + file2.getAbsolutePath());
    } else {
      Properties properties = new Properties();
      properties.setProperty("fileName", paramString);
      if (AbstractUsingArrayList.k() != null && AbstractUsingArrayList.k().u() && AbstractUsingArrayList.k().n().equals(paramString)) {
        properties.setProperty("trailFile", Boolean.toString(true));
        properties.setProperty("startPlayback", Boolean.toString(true));
      } 
      try {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
        properties.store(bufferedOutputStream, "Launched by: " + IOPropertiesUsingFile.b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        D.d("launching MegaLogViewer from properties " + file2.getAbsolutePath());
        String[] arrayOfString = { str1, file2.getAbsolutePath() };
        Runtime.getRuntime().exec(arrayOfString, (String[])null, file1);
        bool = true;
      } catch (IOException iOException) {
        Logger.getLogger(hp.class.getName()).log(Level.SEVERE, "Failed to store MLV launch file: " + file2.getAbsolutePath(), iOException);
      } 
    } 
    if (!bool)
      try {
        D.d("launching MegaLogViewer at " + str1);
        String[] arrayOfString = { str1, paramString };
        Runtime.getRuntime().exec(arrayOfString, (String[])null, file1);
      } catch (IOException iOException) {
        D.IOPropertiesUsingFile("Failed to launch MegaLogViewer at " + str1, iOException, null);
      }  
  }
  
  private String IOPropertiesUsingFile() {
    if (bV.d())
      for (byte b = 0; b < b.length; b++) {
        File file = new File(b[b]);
        if (file.exists()) {
          c(file.getAbsolutePath());
          return file.getAbsolutePath();
        } 
      }  
    JFrame jFrame = dd.IOPropertiesUsingFile().c();
    int IOInIPackage = AyInterfaceOscar.IOPropertiesUsingFile(jFrame);
    if (IOInIPackage == 1)
      return IOPropertiesUsingFile(jFrame); 
    if (IOInIPackage == 4)
      aN.IOPropertiesUsingFile(IOPropertiesUsingFile.D); 
    return null;
  }
  
  private String IOPropertiesUsingFile(Frame paramFrame) {
    String[] arrayOfString = { "exe" };
    String str1 = "MegaLogViewer.exe";
    if (!bV.d()) {
      arrayOfString[0] = "sh";
      str1 = "MegaLogViewer.sh";
    } 
    String str2 = bV.b(paramFrame, "Locate MegaLogViewer", arrayOfString, str1, "");
    if (str2 != null && !str2.equals(""))
      c(str2); 
    return str2;
  }
  
  private String b() {
    return (this.IOPropertiesUsingFile == null) ? null : this.IOPropertiesUsingFile.IOPropertiesUsingFile(c);
  }
  
  public void c(String paramString) {
    if (this.IOPropertiesUsingFile != null)
      this.IOPropertiesUsingFile.IOPropertiesUsingFile(c, paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */