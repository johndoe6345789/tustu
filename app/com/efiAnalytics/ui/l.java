package com.efiAnalytics.ui;

import java.util.ArrayList;
import java.util.Collection;

class l implements o {
  l(e parame) {}
  
  public Collection a(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    if (paramString.endsWith("*"))
      paramString = paramString.substring(0, paramString.length() - 1); 
    if (this.a.d.contains(paramString))
      return this.a.d; 
    for (String str : this.a.d) {
      if (paramString.trim().isEmpty() || str.toLowerCase().contains(paramString.toLowerCase()))
        arrayList.add(str); 
    } 
    if (arrayList.isEmpty())
      arrayList.addAll(this.a.d); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */