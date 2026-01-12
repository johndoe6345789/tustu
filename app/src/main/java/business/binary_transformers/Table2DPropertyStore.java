package business.binary_transformers;

import com.efiAnalytics.ui.et;
import r.IOPropertiesUsingFile;

class Table2DPropertyStore implements et {
  Table2DPropertyStore(W paramW) {}

  public void IOPropertiesUsingFile(String paramString1, String paramString2) {
    IOPropertiesUsingFile IOPropertiesUsingFile = IOPropertiesUsingFile.IOPropertiesUsingFile();
    IOPropertiesUsingFile.b(this.IOPropertiesUsingFile.i + "_" + paramString1, paramString2);
  }

  public String IOPropertiesUsingFile(String paramString) {
    return b(paramString, "");
  }

  public String b(String paramString1, String paramString2) {
    IOPropertiesUsingFile IOPropertiesUsingFile = IOPropertiesUsingFile.IOPropertiesUsingFile();
    return IOPropertiesUsingFile.c(this.IOPropertiesUsingFile.i + "_" + paramString1, paramString2);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
