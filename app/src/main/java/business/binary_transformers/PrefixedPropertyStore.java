package business.binary_transformers;

import com.efiAnalytics.ui.et;
import r.IOPropertiesUsingFile;

public class PrefixedPropertyStore implements et {
  String IOPropertiesUsingFile = "";
  
  public PrefixedPropertyStore(String paramString) {
    this.IOPropertiesUsingFile = paramString;
  }
  
  public void IOPropertiesUsingFile(String paramString1, String paramString2) {
    IOPropertiesUsingFile IOPropertiesUsingFile = IOPropertiesUsingFile.IOPropertiesUsingFile();
    IOPropertiesUsingFile.b(this.IOPropertiesUsingFile + "_" + paramString1, paramString2);
  }
  
  public String IOPropertiesUsingFile(String paramString) {
    return b(paramString, "");
  }
  
  public String b(String paramString1, String paramString2) {
    IOPropertiesUsingFile IOPropertiesUsingFile = IOPropertiesUsingFile.IOPropertiesUsingFile();
    return IOPropertiesUsingFile.c(this.IOPropertiesUsingFile + "_" + paramString1, paramString2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */