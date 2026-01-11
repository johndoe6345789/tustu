package au;

import com.efiAnalytics.ui.cm;
import com.efiAnalytics.ui.et;
import h.IOProperties;
import java.io.File;

public class AuComponentAlpha implements cm {
  et a = null;
  
  private static String b = IOProperties.D;
  
  private static String c = IOProperties.a(b);
  
  public AuComponentAlpha(et paramet) {
    this.a = paramet;
  }
  
  public File a() {
    String str = this.a.a(b);
    if (str == null || str.equals(""))
      str = c; 
    return new File(str);
  }
  
  public void a(File paramFile) {
    if (!paramFile.isDirectory())
      paramFile = paramFile.getParentFile(); 
    this.a.a(b, paramFile.getAbsolutePath());
  }
  
  public String[] b() {
    return new String[] { "trig", "csv" };
  }
  
  public String c() {
    return "trig";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/au/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */