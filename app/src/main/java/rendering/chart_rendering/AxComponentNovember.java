package ax;

class AxComponentNovember extends ac {
  private ab a = null;

  private ab b = null;

  public AxComponentNovember(ab paramab1, ab paramab2) {
    this.a = paramab1;
    this.b = paramab2;
  }

  public double a(S paramS) {
    return (a(this.a, paramS) ^ a(this.b, paramS));
  }

  public double b(S paramS) {
    return a(paramS);
  }

  public String toString() {
    return "( " + this.a.toString() + " ^ " + this.b.toString() + " )";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
