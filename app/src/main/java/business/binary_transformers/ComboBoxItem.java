package bt;

import bH.X;

class ComboBoxItem {
  String a = null;
  
  String b = null;
  
  ComboBoxItem(y paramy, String paramString1, String paramString2) {
    this.a = paramString2;
    this.b = paramString1;
  }
  
  ComboBoxItem(y paramy, String paramString) {
    this.b = paramString;
  }
  
  public String a() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof String || paramObject instanceof z) ? paramObject.equals(this.b) : super.equals(paramObject);
  }
  
  public String toString() {
    return (this.a != null) ? X.b(this.a, "\"", "") : X.b(this.b, "\"", "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */