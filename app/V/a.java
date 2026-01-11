package V;

public class a extends Exception {
  private Exception a = null;
  
  public a() {}
  
  public a(String paramString) {
    this(paramString, null);
  }
  
  public a(String paramString, Exception paramException) {
    super(paramString);
    a(paramException);
  }
  
  public void a(Exception paramException) {
    this.a = paramException;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/V/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */