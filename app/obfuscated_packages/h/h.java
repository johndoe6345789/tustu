package h;

import bH.X;
import java.io.File;
import javax.swing.filechooser.FileSystemView;

public class h {
  public static File a() {
    File file = new File(System.getProperty("user.home"), ".efiAnalytics");
    if (!file.exists()) {
      File file1 = new File(file, "test");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File b() {
    String str = X.b(i.c, b.b, "");
    str = X.b(i.c, b.d, "");
    File file = new File(a(), i.b + str);
    if (!file.exists())
      file.mkdir(); 
    return file;
  }
  
  public static File c() {
    File file = new File(b(), "inc");
    if (!file.exists()) {
      File file1 = new File(file, "test");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static String d() {
    String str = i.e(i.C, "");
    if (str.equals("") || !(new File(str)).exists()) {
      str = FileSystemView.getFileSystemView().getDefaultDirectory().toString();
      if (i.c.equals(b.i)) {
        str = str + File.separator + "TTS" + File.separator;
        File file = new File(str);
        if (!file.exists()) {
          str = FileSystemView.getFileSystemView().getDefaultDirectory().toString();
          str = str + File.separator + "Power Vision" + File.separator;
          file = new File(str);
        } 
        if (!file.exists()) {
          str = FileSystemView.getFileSystemView().getDefaultDirectory().toString();
          file = new File(str);
        } 
      } else {
        str = str + File.separator + X.b("TunerStudio", " ", "") + "Projects/";
        File file = new File(str);
        if (!file.exists()) {
          str = FileSystemView.getFileSystemView().getDefaultDirectory().toString();
          str = str + File.separator + X.b("TuneMonster", " ", "") + "Projects/";
          file = new File(str);
        } 
        if (!file.exists()) {
          str = FileSystemView.getFileSystemView().getDefaultDirectory().toString();
          file = new File(str);
        } 
      } 
      i.c(i.C, str);
    } 
    if (!str.endsWith(File.separator))
      str = str + File.separator; 
    return str;
  }
  
  public static boolean a(String paramString) {
    File file = new File(paramString + File.separator + "test123555.4");
    try {
      if (file.exists()) {
        if (!file.delete())
          return false; 
      } else {
        file.createNewFile();
        if (!file.delete())
          return false; 
      } 
    } catch (Exception exception) {
      return false;
    } 
    return true;
  }
  
  public static File e() {
    File file = new File(b(), "settingProfiles");
    if (!file.exists()) {
      File file1 = new File(file, "test");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/h/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */