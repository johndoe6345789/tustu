package ao;

import bH.D;
import h.IOProperties;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class aV implements k {
  int a = IOProperties.a("numberOfGraphs", IOProperties.t);

  int b = IOProperties.a("numberOfOverlays", IOProperties.u);

  boolean c = IOProperties.a("fieldSelectionStyle", "standardSelection").equals("selectFromDash");

  private static aV f = null;

  private ArrayList g = new ArrayList();

  private List h = new ArrayList();

  String[] d =
      new String[] {
        "white",
        "black",
        "dark_blue",
        "blue",
        "yellow",
        "dark_green",
        "green",
        "red",
        "dark_red",
        "dark_gray",
        "gray",
        "lightGray",
        "cyan",
        "magenta",
        "pink",
        "orange"
      };

  Color[] e =
      new Color[] {
        Color.white,
        Color.black,
        Color.blue.darker(),
        Color.blue,
        Color.yellow,
        Color.green.darker(),
        Color.green,
        Color.red,
        Color.red.darker(),
        Color.darkGray,
        Color.gray,
        Color.lightGray,
        Color.cyan,
        Color.magenta,
        Color.pink,
        Color.orange
      };

  private aV() {
    for (byte b = 0; b < 8; b++) {
      this.g.add(Color.cyan);
      this.g.add(Color.yellow);
      this.g.add(Color.white);
      this.g.add(Color.magenta);
      this.g.add(Color.green);
      this.g.add(Color.red);
      this.g.add(Color.orange);
      this.g.add(Color.pink);
      this.g.add(Color.blue);
      this.g.add(Color.green.darker());
      this.g.add(Color.red.darker());
      this.g.add(Color.cyan.darker().darker());
      this.g.add(Color.pink.darker());
      this.g.add(Color.orange.darker());
      this.g.add(Color.blue.darker());
      this.g.add(Color.lightGray);
    }
  }

  public void a(aU paramaU) {
    this.h.add(paramaU);
  }

  public boolean b(aU paramaU) {
    return this.h.remove(paramaU);
  }

  private void d() {
    for (aU aU : this.h) aU.a();
  }

  public static aV a() {
    if (f == null) f = new aV();
    return f;
  }

  public String[] b() {
    return this.d;
  }

  public void a(Color paramColor, int paramInt) {
    if (paramInt == this.g.size()) {
      this.g.add(paramColor);
    } else {
      this.g.ensureCapacity(paramInt + 1);
      this.g.set(paramInt, paramColor);
    }
    IOProperties.c("graphForeColor" + paramInt, b(paramColor));
    d();
  }

  private String b(Color paramColor) {
    String str = null;
    for (byte b = 0; b < this.e.length; b++) {
      if (this.e[b].equals(paramColor)) {
        str = this.d[b];
        break;
      }
    }
    if (str == null) {
      D.b("No Color Match Found for: " + paramColor.getRGB());
      str = "cyan";
    }
    return str;
  }

  public Color a(int paramInt) {
    return (paramInt < this.g.size()) ? this.g.get(paramInt) : this.g.get(paramInt % this.g.size());
  }

  public void a(Color paramColor, int paramInt1, int paramInt2) {
    int IOProperties = paramInt1 * this.b + paramInt2;
    a(paramColor, IOProperties);
    d();
  }

  public Color a(int paramInt1, int paramInt2) {
    int IOProperties = paramInt2;
    boolean bool = IOProperties.a(IOProperties.aa, IOProperties.ab);
    if (!bool) IOProperties += paramInt1 * this.b;
    return a(IOProperties);
  }

  public void a(Color paramColor) {}

  public ArrayList c() {
    return this.g;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
