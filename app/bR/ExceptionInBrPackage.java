package bR;

public class ExceptionInBrPackage extends Exception {
  private int a;
  
  private int b;
  
  public ExceptionInBrPackage(int paramInt1, int paramInt2) {
    super("Unexpected Size! Expected: " + paramInt1 + ", Actual Size: " + paramInt2);
    this.b = paramInt2;
    this.a = paramInt1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bR/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */