package com.efiAnalytics.ui;

class YAxisSelectorLayoutRunnable implements Runnable {
  YAxisSelectorLayoutRunnable(fl paramfl) {}
  
  public void YAxisSelectorLayoutRunnable() {
    this.a.getParent().invalidate();
    this.a.getParent().validate();
    this.a.doLayout();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */