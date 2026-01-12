package com.efiAnalytics.tunerStudio.search;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class SearchBoxFocusListener implements FocusListener {
  SearchBoxFocusListener(m paramm) {}

  public void focusGained(FocusEvent paramFocusEvent) {
    m.a(this.a);
  }

  public void focusLost(FocusEvent paramFocusEvent) {
    m.b(this.a);
    m.c(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
