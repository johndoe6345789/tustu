package com.efiAnalytics.tuningwidgets.panels;

import G.aN;

class TableParameterChangeListener implements aN {
  TableParameterChangeListener(TableDataLogListener paramQ) {}
  
  public void a(String paramString1, String paramString2) {
    if (this.a.f >= 0) {
      ParameterChangeDelayThread t = new ParameterChangeDelayThread(this);
      t.start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */