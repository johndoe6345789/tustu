package ak;

public enum Z {
  a(1),
  b(1),
  c(2),
  d(2),
  e(4),
  f(8),
  g(2),
  h(8),
  i(4);
  
  int j;
  
  Z(int paramInt1) {
    this.j = paramInt1;
  }
  
  public int a() {
    return this.j;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */