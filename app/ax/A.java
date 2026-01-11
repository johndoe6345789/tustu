package ax;

public class A extends U {
  private String a;
  
  private int b;
  
  private int c;
  
  public A(String paramString, int paramInt1, int paramInt2) {
    super("The wrong number of paramenters were passed to function: " + paramString + ". Parameters Passed: " + paramInt1 + "; Parameters Expected: " + paramInt2);
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */