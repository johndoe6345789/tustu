package ax;

public class H extends U {
  private String a;
  
  public H(String paramString) {
    super("An attempt was made to modify an Identifier that was previously declared a Constant: " + paramString);
    this.a = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */