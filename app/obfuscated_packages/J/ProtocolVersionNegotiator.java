package J;

import G.F;
import G.GInterfaceBy;
import G.GInterfaceCo;
import G.v;
import bH.D;
import bH.c;
import java.io.Serializable;

public class ProtocolVersionNegotiator implements GInterfaceCo, Serializable {
  GInterfaceBy a = null;

  int b = -1;

  BlockingFactorHolder c = null;

  public ProtocolVersionNegotiator() {
    this.a = new GInterfaceBy();
    this.a.a("F");
    this.a.e("I");
    this.a.d("f%cId");
  }
  
  public void a() {
    this.b = -1;
    this.c = null;
  }
  
  public int a(v paramv) {
    int[] arrayOfInt = paramv.a(this.a.a().a(null), 250, 3);
    if (arrayOfInt != null) {
      byte[] arrayOfByte = c.a(arrayOfInt);
      String str = new String(arrayOfByte);
      try {
        int i = Integer.parseInt(str);
        if (i > 3)
          D.b("Unsupported Protocol Version Detected " + i + ", using Highest known 003."); 
        return i;
      } catch (NumberFormatException numberFormatException) {
        return 0;
      } 
    } 
    return 0;
  }
  
  public boolean a(v paramv, F paramF, int paramInt) {
    BlockingFactorHolder e1;
    if (this.b < 0)
      this.b = paramv.a(this.a.e().b(), 10, 1)[0];
    if (this.c == null) {
      this.a.d().a((byte)this.b);
      int[] arrayOfInt = paramv.a(this.a.d().a(null), 10, 5);
      this.c = new BlockingFactorHolder(this);
      this.c.a(arrayOfInt);
    }
    D.d("Local on CAN ID:" + this.b + ", " + this.c.toString());
    paramF.w(this.b);
    if (this.b != paramInt) {
      this.a.d().a(paramInt);
      if (paramF.D() instanceof CrcEnvelopeDecoder)
        ((CrcEnvelopeDecoder)paramF.D()).b(false);
      try {
        int[] arrayOfInt = paramv.a(this.a.d().a(null), 10, 5);
        e1 = new BlockingFactorHolder(this);
        e1.a(arrayOfInt);
        D.d("Target on CAN ID:" + paramInt + ", " + e1.toString());
      } catch (Exception exception) {
        try {
          e1 = new BlockingFactorHolder(this);
          e1.b = paramF.ay();
          e1.a = paramF.G(0);
          D.d("Failed to get Target BlockingFactors, using ini values on CAN ID:" + paramInt + ", " + e1.toString());
        } catch (Exception exception1) {
          e1 = new BlockingFactorHolder(this);
          e1.b = 0;
          e1.a = 64;
          D.d("Failed to get Target BlockingFactors, using default values on CAN ID:" + paramInt + ", " + e1.toString());
        }
      } finally {
        if (paramF.D() instanceof CrcEnvelopeDecoder)
          ((CrcEnvelopeDecoder)paramF.D()).b(true);
      }
    } else {
      e1 = this.c;
      D.d("Target device is local, using localBlockingFactors");
    }
    paramF.I(Math.min(e1.a, this.c.a));
    paramF.H(Math.min(e1.b, this.c.b));
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */