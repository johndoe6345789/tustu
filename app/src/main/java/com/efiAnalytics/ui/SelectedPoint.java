package com.efiAnalytics.ui;

public class SelectedPoint implements ef {
  private int b;
  
  int a;
  
  public SelectedPoint(int paramInt1, int paramInt2) {
    this.b = paramInt1;
    this.a = paramInt2;
  }
  
  public int a() {
    return this.b;
  }
  
  public int b() {
    return this.a;
  }
  
  public String toString() {
    return "SelectedPoint mIndex:" + this.b + ", index:" + this.a;
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */