package al;

import am.AmInterfaceCharlie;
import am.AmInterfaceDelta;
import am.AmInterfaceEcho;
import bH.D;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;

public class AlInterfaceBravo implements AmInterfaceCharlie {
  private AmInterfaceEcho f;

  private AmInterfaceCharlie g;

  private String h = "";

  f a;

  List b = new ArrayList();

  a AmInterfaceCharlie = null;

  byte[] AmInterfaceDelta = null;

  boolean AmInterfaceEcho = false;

  private boolean i = false;

  private int j = 0;

  public AlInterfaceBravo(SeekableByteChannel paramSeekableByteChannel, AmInterfaceEcho parame) {
    this.f = parame;
    this.g = parame.f();
    this.a = new f(paramSeekableByteChannel, parame, this.g);
    List list = AmInterfaceDelta.a(this.g);
    for (AmInterfaceDelta AmInterfaceDelta : list) {
      if (b(AmInterfaceDelta.AmInterfaceEcho())) {
        a a1 = new a(AmInterfaceDelta);
        if (a1.AmInterfaceEcho().equalsIgnoreCase("time")) this.AmInterfaceCharlie = a1;
        this.b.add(a1);
      }
    }
    this.AmInterfaceDelta = this.a.a();
  }

  public double a() {
    return (this.AmInterfaceCharlie != null && this.AmInterfaceCharlie.a().m() > 0.0D)
        ? ((this.AmInterfaceCharlie.a().l() < 0.5D && this.AmInterfaceCharlie.a().l() >= 0.0D)
            ? (this.g.AmInterfaceEcho() / this.AmInterfaceCharlie.a().m())
            : (this.g.AmInterfaceEcho()
                / (this.AmInterfaceCharlie.a().m() - this.AmInterfaceCharlie.a().l())))
        : Double.NaN;
  }

  public long b() {
    return this.g.AmInterfaceEcho();
  }

  public float[] a(double paramDouble, int paramInt, float[] paramArrayOffloat) {
    if (this.j == 0 && this.h.equals("Data Group 132")) D.AmInterfaceCharlie(this.h);
    if (!this.i
        && this.AmInterfaceDelta != null
        && (paramDouble == 0.0D
            || this.AmInterfaceCharlie == null
            || this.AmInterfaceCharlie.a(this.AmInterfaceDelta) <= paramDouble
            || !this.AmInterfaceEcho)) {
      for (byte b1 = 0; b1 < this.b.size(); b1++)
        paramArrayOffloat[b1 + paramInt] = (float) ((a) this.b.get(b1)).a(this.AmInterfaceDelta);
      this.j++;
      this.AmInterfaceEcho = true;
      this.AmInterfaceDelta = this.a.a();
    }
    return paramArrayOffloat;
  }

  public boolean AmInterfaceCharlie() {
    return (this.AmInterfaceCharlie != null);
  }

  public double AmInterfaceDelta() {
    return (this.AmInterfaceCharlie != null && this.AmInterfaceDelta != null)
        ? this.AmInterfaceCharlie.a(this.AmInterfaceDelta)
        : Double.NaN;
  }

  public List AmInterfaceEcho() {
    return this.b;
  }

  public int f() {
    return this.b.size();
  }

  public void a(boolean paramBoolean) {
    if (!paramBoolean) {
      for (byte b1 = 0; b1 < this.b.size(); b1++) {
        if (((a) this.b.get(b1)).AmInterfaceEcho().equalsIgnoreCase("time")) {
          this.b.remove(b1);
          break;
        }
      }
    } else if (this.AmInterfaceCharlie != null && !this.b.contains(this.AmInterfaceCharlie)) {
      this.b.add(0, this.AmInterfaceCharlie);
    }
  }

  public AmInterfaceCharlie g() {
    return this.g;
  }

  public void b(boolean paramBoolean) {
    this.i = paramBoolean;
  }

  public String h() {
    return this.h;
  }

  public void a(String paramString) {
    this.h = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/al/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
