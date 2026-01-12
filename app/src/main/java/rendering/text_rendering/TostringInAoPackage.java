package aO;

import G.GComponentCd;

class TostringInAoPackage {
  private GComponentCd b = null;

  TostringInAoPackage(a parama, GComponentCd paramcd) {
    this.b = paramcd;
  }

  public String toString() {
    return (a() == null) ? "[none]" : ((a().g() == null) ? "Unknown" : a().g());
  }

  public GComponentCd a() {
    return this.b;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
