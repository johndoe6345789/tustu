package bS;

class f {
  private int b = 0;
  
  private int c = -1;
  
  private int d = 0;
  
  f(e parame) {}
  
  public int a() {
    return this.b;
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
  
  public int b() {
    return this.c;
  }
  
  public int c() {
    return this.d;
  }
  
  private void a(int paramInt1, int paramInt2) {
    if (this.c == -1) {
      this.c = paramInt1;
      this.d = paramInt2;
    } else {
      int i = this.c + this.d;
      int j = paramInt1 + paramInt2;
      this.c = Math.min(paramInt1, this.c);
      this.d = Math.max(j, i) - this.c;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */