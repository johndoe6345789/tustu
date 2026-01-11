package business.binary_decoders.bD_components;

import java.util.Comparator;

class BdInterfaceEcho implements Comparator {
  BdInterfaceEcho(c paramc) {}
  
  public int a(Long paramLong1, Long paramLong2) {
    return (int)(paramLong2.longValue() - paramLong1.longValue());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */