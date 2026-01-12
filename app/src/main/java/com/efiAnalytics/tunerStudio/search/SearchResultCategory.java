package com.efiAnalytics.tunerStudio.search;

import java.util.ArrayList;

public class SearchResultCategory extends ArrayList {
  private String a = null;

  public boolean a(String paramString) {
    return (!isEmpty() && ((C) get(0)).a().toLowerCase().startsWith(paramString.toLowerCase()));
  }

  public String a() {
    return this.a;
  }

  public void b(String paramString) {
    this.a = paramString;
  }

  public boolean c(String paramString) {
    for (C c : this) {
      if (c.a().equals(paramString)) return true;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
