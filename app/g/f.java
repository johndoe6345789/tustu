package g;

import java.io.File;
import java.util.ArrayList;
import javax.swing.filechooser.FileFilter;

public class f extends FileFilter {
  String a = "";
  
  ArrayList b = new ArrayList();
  
  public f(String paramString) {
    a(paramString);
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public void b(String paramString) {
    this.b.add(paramString.toLowerCase());
  }
  
  public boolean accept(File paramFile) {
    if (paramFile.isDirectory())
      return true; 
    String str = paramFile.getName();
    if (str.lastIndexOf('.') > -1) {
      str = str.substring(str.lastIndexOf('.') + 1).toLowerCase();
    } else {
      return false;
    } 
    return this.b.contains(str);
  }
  
  public String getDescription() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */