package ax;

public class AxInterfaceAf extends ac {
  private ab a = null;
  
  public AxInterfaceAf(ab paramab) {
    this.a = paramab;
  }
  
  public double a(S paramS) {
    return 1.0D / this.a.b(paramS);
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return "recip( " + this.a.toString() + " )";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */