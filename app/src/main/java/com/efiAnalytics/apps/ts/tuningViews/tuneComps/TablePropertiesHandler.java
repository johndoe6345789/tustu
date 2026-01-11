package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import com.efiAnalytics.ui.et;
import java.util.Properties;

class TablePropertiesHandler implements et {
  private Properties b = new Properties();
  
  TablePropertiesHandler(SelectableTable paramSelectableTable) {}
  
  public void a(String paramString1, String paramString2) {
    a().setProperty(paramString1, paramString2);
  }
  
  public String a(String paramString) {
    return a().getProperty(paramString);
  }
  
  public String b(String paramString1, String paramString2) {
    return a().getProperty(paramString1, paramString2);
  }
  
  public Properties a() {
    return this.b;
  }
  
  public void a(Properties paramProperties) {
    this.b = paramProperties;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */