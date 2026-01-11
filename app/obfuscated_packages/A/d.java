package A;

public class d {
  private static d a = null;
  
  private boolean b = false;
  
  public static d a() {
    if (a == null)
      a = new d(); 
    return a;
  }
  
  public boolean b() {
    return this.b;
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */