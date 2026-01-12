package ak;

import java.util.ArrayList;
import java.util.List;

class TostringInAkPackage extends ak {
  protected int a;

  protected int b;

  protected int c;

  protected int d;

  protected List e;

  public TostringInAkPackage(ac paramac, int paramInt) {
    super(paramac.o, paramInt);
    if (this.b != 0 && this.d > 0) {
      this.e = new ArrayList(this.d);
      int i = this.b;
      for (byte b = 0; b < this.d; b++) {
        ae ae = new ae(this, i);
        this.e.add(ae);
        i = ae.a;
      }
    }
  }

  public String toString() {
    return "DataGroupBlock{" + "\n\t nChannelGroups=" + this.d + "\n\t cgBlocks=" + this.e + "\n}";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
