package au;

import com.efiAnalytics.ui.cm;
import com.efiAnalytics.ui.et;
import h.i;
import java.io.File;

public class a implements cm {
  et a = null;
  
  private static String b = i.D;
  
  private static String c = i.a(b);
  
  public a(et paramet) {
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