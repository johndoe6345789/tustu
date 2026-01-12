package com.efiAnalytics.tunerStudio.panels;

class ProfileNameWrapper {
  private String b;

  ProfileNameWrapper(DataLogProfileEditorPanel paramg, String paramString) {
    this.b = paramString;
  }

  public String toString() {
    return this.b.equals("") ? DataLogProfileEditorPanel.i : this.b;
  }

  public String a() {
    return this.b;
  }

  public boolean equals(Object paramObject) {
    return (paramObject instanceof String || paramObject instanceof n)
        ? paramObject.equals(this.b)
        : super.equals(paramObject);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
