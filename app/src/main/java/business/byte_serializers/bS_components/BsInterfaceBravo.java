package business.byte_serializers.bS_components;

import G.F;
import G.GInterfaceAf;
import bH.D;
import bH.TostringInBoPackage;
import bN.BnInterfaceKilo;
import bN.BnInterfaceMike;
import bN.BnInterfaceOscar;
import bN.BnInterfaceRomeo;
import bN.BnInterfaceUniform;
import bO.BnInterfaceKilo;
import bO.BoInterfaceAlpha;
import bO.BoInterfaceLima;
import bO.TostringInBoPackage;
import bR.BoInterfaceAlpha;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BsInterfaceBravo implements GInterfaceAf {
  private TostringInBoPackage g;

  F BoInterfaceAlpha;

  private BnInterfaceRomeo h;

  BoInterfaceAlpha b;

  BnInterfaceKilo TostringInBoPackage;

  TostringInBoPackage d = null;

  byte[] e = null;

  long f = 0L;

  public BsInterfaceBravo(F paramF, BnInterfaceRomeo paramr, BoInterfaceAlpha parama) {
    this.BoInterfaceAlpha = paramF;
    this.h = paramr;
    this.b = parama;
    this.TostringInBoPackage = paramr.d();
  }

  public TostringInBoPackage BoInterfaceAlpha() {
    return this.g;
  }

  public void BoInterfaceAlpha(TostringInBoPackage paramc) {
    this.g = paramc;
  }

  public void b() {
    if (this.d != null) this.d.b();
  }

  public void TostringInBoPackage() {
    b();
    this.e = null;
    this.d = new TostringInBoPackage(this);
    this.d.start();
  }

  private void e() {
    ArrayList<BnInterfaceMike> arrayList = new ArrayList();
    boolean bool = false;
    for (BnInterfaceKilo k1 : this.g.e()) {
      BnInterfaceMike BnInterfaceMike =
          BnInterfaceUniform.BoInterfaceAlpha().BoInterfaceAlpha(this.TostringInBoPackage);
      try {
        if (!bool && this.b.TostringInBoPackage().d().BoInterfaceAlpha() > 0) {
          byte[] arrayOfByte1 = d();
          BnInterfaceMike.d(arrayOfByte1);
          bool = true;
        } else {
          BnInterfaceMike.d(new byte[0]);
        }
      } catch (BoInterfaceAlpha a1) {
        D.BoInterfaceAlpha((Exception) a1);
        return;
      }
      int i = 0;
      for (BoInterfaceLima BoInterfaceLima : k1) i += BoInterfaceLima.b();
      byte[] arrayOfByte = new byte[i];
      int j = 0;
      if (this.e != null)
        for (BoInterfaceLima BoInterfaceLima : k1) {
          System.arraycopy(
              this.e,
              (int) BoInterfaceLima.BoInterfaceAlpha(),
              arrayOfByte,
              j,
              BoInterfaceLima.b());
          j += BoInterfaceLima.b();
        }
      BnInterfaceMike.b(arrayOfByte);
      arrayList.add(BnInterfaceMike);
    }
    try {
      this.h.BoInterfaceAlpha(arrayList);
    } catch (BnInterfaceOscar BnInterfaceOscar) {
      Logger.getLogger(b.class.getName())
          .log(Level.SEVERE, "Unable to publish DAQ List", (Throwable) BnInterfaceOscar);
    }
  }

  public void BoInterfaceAlpha(String paramString, byte[] paramArrayOfbyte) {
    if (paramString.equals(this.BoInterfaceAlpha.BnInterfaceUniform())) {
      if (this.e == null || paramArrayOfbyte.length != this.e.length)
        this.e = new byte[paramArrayOfbyte.length];
      System.arraycopy(paramArrayOfbyte, 0, this.e, 0, paramArrayOfbyte.length);
      if (this.d != null) this.d.BoInterfaceAlpha();
    }
  }

  public byte[] d() {
    byte[] arrayOfByte = new byte[this.b.TostringInBoPackage().d().BoInterfaceAlpha()];
    long l1 = this.TostringInBoPackage.w();
    if (this.f <= 0L) this.f = l1;
    long l2 = l1 - this.f;
    this.f = l1;
    long l3 =
        (long) (l2 * Math.pow(10.0D, (this.b.TostringInBoPackage().d().TostringInBoPackage() - 9)));
    return TostringInBoPackage.BoInterfaceAlpha(l3, arrayOfByte, true);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
