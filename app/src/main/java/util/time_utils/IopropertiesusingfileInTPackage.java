package t;

import com.efiAnalytics.ui.et;
import r.IOPropertiesUsingFile;

class IopropertiesusingfileInTPackage implements et {
  String IOPropertiesUsingFile = "";

  String b = "dashCompProperty_";

  IopropertiesusingfileInTPackage(w paramw, String paramString) {
    this.IOPropertiesUsingFile = paramString;
  }

  public void IOPropertiesUsingFile(String paramString1, String paramString2) {
    IOPropertiesUsingFile IOPropertiesUsingFile = IOPropertiesUsingFile.IOPropertiesUsingFile();
    IOPropertiesUsingFile.b(this.b + this.IOPropertiesUsingFile + "_" + paramString1, paramString2);
  }

  public String IOPropertiesUsingFile(String paramString) {
    return b(paramString, "");
  }

  public String b(String paramString1, String paramString2) {
    IOPropertiesUsingFile IOPropertiesUsingFile = IOPropertiesUsingFile.IOPropertiesUsingFile();
    return IOPropertiesUsingFile.c(
        this.b + this.IOPropertiesUsingFile + "_" + paramString1, paramString2);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
