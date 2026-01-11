package aE;

import V.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class g extends Properties {
  private String a = "";
  
  public g(String paramString) {
    this.a = paramString;
  }
  
  public void a(File paramFile) {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
      store(fileOutputStream, "Vehicles Attributes.\n#" + this.a + " by Philip Tobin");
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error Saving Vehicle. \n" + exception.getMessage() + "\nSee log file for more detail.");
    } 
  }
  
  public g b(File paramFile) {
    try {
      FileInputStream fileInputStream = new FileInputStream(paramFile);
      load(fileInputStream);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error occured trying to open vehicle in directory\n" + ((paramFile != null) ? paramFile.getName() : "null") + "\nError Message: " + exception.getMessage() + "\nCheck Log for details.");
    } 
    return this;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aE/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */