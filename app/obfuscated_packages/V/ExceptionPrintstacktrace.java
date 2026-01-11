package V;

import java.io.PrintStream;

public class ExceptionPrintstacktrace extends Exception {
  private Exception a = null;
  
  private int b = 0;
  
  public ExceptionPrintstacktrace(String paramString) {
    super(paramString);
  }
  
  public ExceptionPrintstacktrace(String paramString, int paramInt) {
    super(paramString);
    this.b = paramInt;
  }
  
  public ExceptionPrintstacktrace(String paramString, Exception paramException) {
    super(paramString);
    a(paramException);
  }
  
  public void a(Exception paramException) {
    this.a = paramException;
  }
  
  public int a() {
    return this.b;
  }
  
  public String getMessage() {
    return (this.a == null || this.a.getMessage() == null) ? super.getMessage() : (super.getMessage() + "\nRoot Problem:" + this.a.getMessage());
  }
  
  public void printStackTrace() {
    printStackTrace(System.out);
  }
  
  public void printStackTrace(PrintStream paramPrintStream) {
    super.printStackTrace(paramPrintStream);
    if (this.a != null) {
      paramPrintStream.println("Nested Exception - Root cause:");
      this.a.printStackTrace(paramPrintStream);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/V/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */