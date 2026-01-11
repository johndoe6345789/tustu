package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.cu;
import bH.X;
import com.efiAnalytics.ui.e;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class EventsComboBox extends e {
  public EventsComboBox() {}
  
  public EventsComboBox(R paramR) {
    setEditable(false);
    a(paramR);
  }
  
  public void a(R paramR) {
    if (paramR.c().equals(cu.a)) {
      a();
    } else {
      b(paramR);
    } 
  }
  
  private void a() {
    String[] arrayOfString = cu.a().b();
    arrayOfString = X.a(arrayOfString);
    a(arrayOfString);
  }
  
  private void b(R paramR) {
    ArrayList<String> arrayList = new ArrayList();
    String[] arrayOfString1 = cu.a().b();
    arrayOfString1 = X.a(arrayOfString1);
    for (String str : arrayOfString1)
      arrayList.add("AppEvent." + str); 
    String[] arrayOfString2 = paramR.s();
    arrayOfString2 = X.a(arrayOfString2);
    arrayList.addAll(Arrays.asList(arrayOfString2));
    arrayOfString2 = arrayList.<String>toArray(new String[0]);
    a(arrayOfString2);
  }
  
  private void a(String[] paramArrayOfString) {
    ActionListener[] arrayOfActionListener = getActionListeners();
    byte b;
    for (b = 0; b < arrayOfActionListener.length; b++)
      removeActionListener(arrayOfActionListener[b]); 
    removeAllItems();
    a("");
    for (b = 0; b < paramArrayOfString.length; b++)
      a(paramArrayOfString[b]); 
    setSelectedItem("");
    for (b = 0; b < arrayOfActionListener.length; b++)
      addActionListener(arrayOfActionListener[b]); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */