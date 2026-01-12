package ax;

class AxInterfaceAe extends ac {
  private ab a;

  private ab b;

  public AxInterfaceAe(ab paramab1, ab paramab2) {
    this.a = paramab1;
    this.b = paramab2;
  }

  public double a(S paramS) {
    return Math.pow(this.a.b(paramS), this.b.b(paramS));
  }

  public double b(S paramS) {
    return a(paramS);
  }

  public String toString() {
    return "pow( " + this.a.toString() + ", " + this.b.toString() + " )";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
