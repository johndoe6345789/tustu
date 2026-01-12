package ax;

class AxInterfaceAl implements ab {
  private x a = null;

  private x b = null;

  private x c = null;

  public AxInterfaceAl(x paramx1, x paramx2, x paramx3) {
    this.a = paramx1;
    this.b = paramx2;
    this.c = paramx3;
  }

  public double b(S paramS) {
    double d;
    if (this.a.b(paramS) == ad.b) {
      d = this.c.b(paramS);
    } else {
      d = this.b.b(paramS);
    }
    return d;
  }

  public String toString() {
    return "( "
        + this.a.toString()
        + " ) ? ("
        + this.b.toString()
        + ") : ("
        + this.c.toString()
        + ")";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
