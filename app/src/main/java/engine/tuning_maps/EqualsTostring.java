package aP;

import aH.AhInterfaceAlpha;
import java.awt.Color;
import s.SComponentGolf;

public class EqualsTostring {
  private AhInterfaceAlpha b = null;

  private int c;

  EqualsTostring(T paramT, int paramInt) {
    this.c = paramInt;
  }

  public boolean equals(Object paramObject) {
    return (paramObject instanceof V)
        ? ((((V) paramObject).AhInterfaceAlpha() == this.c))
        : ((paramObject instanceof Integer)
            ? ((((Integer) paramObject).intValue() == this.c))
            : super.equals(paramObject));
  }

  public String toString() {
    String str1;
    Color color = this.AhInterfaceAlpha.getBackground();
    boolean bool = (color.getRed() + color.getGreen() + color.getBlue() < 192) ? true : false;
    if (!bool) {
      str1 = "<font color=\"#505050\">";
    } else {
      str1 = "<font color=\"silver\">";
    }
    if (this.b == null || this.AhInterfaceAlpha.SComponentGolf)
      return this.AhInterfaceAlpha.b.R()
          ? ("<html>" + SComponentGolf.b("Scanning for Devices") + "<br>CAN ID: " + this.c)
          : ("<html>" + SComponentGolf.b("Connect for device list") + "<br>CAN ID: " + this.c);
    if (!this.b.c())
      return "<html>" + str1 + SComponentGolf.b("No Device Found") + "<br>CAN ID: " + this.c;
    String str2 = this.b.AhInterfaceAlpha();
    String str3 = this.b.d();
    if (str2 == null || str2.isEmpty()) str2 = this.b.d();
    if (str2 == null || str2.isEmpty()) str2 = "Unknown";
    if (str2.length() > 32) str2 = str2.substring(0, 32);
    return bool
        ? ("<html><font color=\"yellow\">"
            + str2
            + "<br>Signature: "
            + str3
            + "<br>CAN ID: "
            + this.c
            + " Online")
        : ("<html><font color=blue>" + str2 + "<br>CAN ID: " + this.c + " Online");
  }

  public int AhInterfaceAlpha() {
    return this.c;
  }

  public AhInterfaceAlpha b() {
    return this.b;
  }

  public void AhInterfaceAlpha(AhInterfaceAlpha parama) {
    this.b = parama;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
