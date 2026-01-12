package p;

import d.DComponentCharlie;
import java.util.Comparator;

class ComparatorImplInPPackage implements Comparator {
  ComparatorImplInPPackage(D paramD) {}

  public int a(DComponentCharlie paramc1, DComponentCharlie paramc2) {
    return paramc1.b().toLowerCase().compareTo(paramc2.b().toLowerCase());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
