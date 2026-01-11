package com.efiAnalytics.ui;

import java.util.ArrayList;
import java.util.Collections;

class k implements Runnable {
  k(e parame, String paramString) {}
  
  public void run() {
    if (this.a.isEmpty()) {
      Object object = this.b.getSelectedItem();
      this.b.e = true;
      e.b(this.b);
      for (String str : this.b.d)
        this.b.a(str); 
      this.b.setSelectedItem(object);
      this.b.e = false;
    } else {
      ArrayList<Comparable> arrayList = new ArrayList(e.c(this.b).a(this.a));
      Collections.sort(arrayList);
      byte b1 = 0;
      for (byte b2 = 0; b2 < arrayList.size(); b2++) {
        String str = (String)arrayList.get(b2);
        if (str.toLowerCase().startsWith(this.a.toLowerCase())) {
          if (b2 > 0) {
            arrayList.remove(b2);
            arrayList.add(b1, str);
          } 
          b1++;
        } 
      } 
      this.b.setEditable(false);
      e.b(this.b);
      this.b.e = true;
      for (String str : arrayList)
        this.b.a(str); 
      this.b.e = false;
      this.b.setPopupVisible(true);
      this.b.requestFocus();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */