package engine.vehicle_control;

public class ExceptionExtensionGetmessage extends Exception {
  private int a = 0;

  private double b = 0.0D;

  private double c = 0.0D;

  private int d = -1;

  private int e = -1;

  public ExceptionExtensionGetmessage(
      String paramString,
      int paramInt1,
      double paramDouble1,
      double paramDouble2,
      int paramInt2,
      int paramInt3) {
    super(paramString);
    this.a = paramInt1;
    this.c = paramDouble2;
    this.b = paramDouble1;
    this.d = paramInt2;
    this.e = paramInt3;
  }

  public ExceptionExtensionGetmessage(
      String paramString, int paramInt, double paramDouble1, double paramDouble2) {
    super(paramString);
    this.a = paramInt;
    this.c = paramDouble2;
    this.b = paramDouble1;
  }

  public ExceptionExtensionGetmessage() {}

  public int a() {
    return this.a;
  }

  public double b() {
    return this.b;
  }

  public double c() {
    return this.c;
  }

  public String getMessage() {
    String str = "Value out of bounds. " + this.b;
    if (this.a == 1) {
      str = str + " exceeds maximum allowed value " + this.c;
    } else {
      str = str + " is below minimum allowed value " + this.c;
    }
    return str;
  }

  public int d() {
    return this.d;
  }

  public int e() {
    return this.e;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/V/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
