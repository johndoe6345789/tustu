package G;

import V.ExceptionPrintstacktrace;

public class GInterfaceDn implements db {
  R a;

  private String b = "";

  private String c = "";

  public GInterfaceDn(R paramR) {
    this.a = paramR;
  }

  public String a() {
    try {
      String str = this.a.F();
      return this.b + str + this.c;
    } catch (Exception exception) {
      if (this.a == null)
        throw new ExceptionPrintstacktrace(
            "Failed to get Working dir for, No EcuConfiguration set.");
      throw new ExceptionPrintstacktrace(
          "Failed to get Working dir for: " + this.a.c() + "\nError: " + exception.getMessage());
    }
  }

  public void a(String paramString) {
    this.b = paramString;
  }

  public void b(String paramString) {
    this.c = paramString;
  }

  public String[] b() {
    return new String[0];
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/dn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
