package com.efiAnalytics.ui;

import javax.swing.JCheckBoxMenuItem;

public class CheckBoxMenuItemPropertyObserver implements dR {
  JCheckBoxMenuItem a = null;
  
  String b = "";
  
  public ba(JCheckBoxMenuItem paramJCheckBoxMenuItem, String paramString) {
    this.a = paramJCheckBoxMenuItem;
    this.b = paramString;
  }
  
  public void a(String paramString1, String paramString2) {
    boolean bool = (paramString2 != null && paramString2.equals("true")) ? true : false;
    this.a.setState(bool);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */