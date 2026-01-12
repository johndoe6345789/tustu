package business.binary_transformers;

import aH.AhInterfaceAlpha;
import s.SComponentGolf;

class ManagerUsingAhInterfaceAlpha {
  private AhInterfaceAlpha b = null;

  private int c;

  public void ae(ac paramac, int paramInt) {
    this.c = paramInt;
  }

  public boolean equals(Object paramObject) {
    return (paramObject instanceof ae)
        ? ((((ae) paramObject).AhInterfaceAlpha() == this.c))
        : ((paramObject instanceof Integer)
            ? ((((Integer) paramObject).intValue() == this.c))
            : super.equals(paramObject));
  }

  public String toString() {
    if (this.b == null)
      return this.AhInterfaceAlpha.c.R()
          ? ("<html>" + SComponentGolf.b("Scanning for Devices") + "<br>CAN ID: " + this.c)
          : ("<html>" + SComponentGolf.b("Connect for device list") + "<br>CAN ID: " + this.c);
    if (!this.b.c())
      return "<html><font color=gray>"
          + SComponentGolf.b("No Device Found")
          + "<br>CAN ID: "
          + this.c;
    String str = this.b.AhInterfaceAlpha();
    if (str == null || str.isEmpty()) str = this.b.d();
    if (str == null || str.isEmpty()) str = "Unknown";
    if (str.length() > 22) str = str.substring(0, 22);
    return "<html><font color=blue>" + str + "<br>CAN ID: " + this.c + " Online";
  }

  public int AhInterfaceAlpha() {
    return this.c;
  }

  public void AhInterfaceAlpha(AhInterfaceAlpha parama) {
    this.b = parama;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
