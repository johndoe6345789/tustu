package ax;

public class AxInterfaceFoxtrot extends U {
  private String a;

  public AxInterfaceFoxtrot(String paramString) {
    super(
        "An attempt was made to set an identifier (Variable/Constant) that does not exist: "
            + paramString);
    this.a = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
