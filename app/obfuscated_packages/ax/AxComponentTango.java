package ax;

class AxComponentTango extends ac {
  private ab a = null;
  
  private ab b = null;
  
  public AxComponentTango(ab paramab1, ab paramab2) {
    this.a = paramab1;
    this.b = paramab2;
  }
  
  public double a(S paramS) {
    if (this.b.b(paramS) == 0.0D)
      throw new u(); 
    return this.a.b(paramS) / this.b.b(paramS);
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    return this.a.toString() + " / " + this.b.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */