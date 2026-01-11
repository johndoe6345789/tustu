package ak;

import bH.X;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class AkInterfaceAg extends ak {
  protected String a;
  
  protected int b;
  
  protected int c;
  
  protected double[] d;
  
  protected String[] e;
  
  public AkInterfaceAg(af paramaf, int paramInt) {
    super(paramaf.s.m.f.o, paramInt);
    if (this.c > 0) {
      byte b;
      switch (this.b) {
        case 0:
          this.d = new double[this.c];
          for (b = 0; b < this.c; b++) {
            this.d[b] = ByteBuffer.wrap(paramaf.s.m.f.o.e, this.u, 8).order(paramaf.s.m.f.o.k ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN).getDouble();
            this.u += 8;
          } 
        case 11:
          this.d = new double[this.c];
          this.e = new String[this.c];
          for (b = 0; b < this.c; b++) {
            this.d[b] = ByteBuffer.wrap(paramaf.s.m.f.o.e, this.u, 8).order(paramaf.s.m.f.o.k ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN).getDouble();
            this.u += 8;
            this.e[b] = X.k(aa.a(paramaf.s.m.f.o, this.u, 32));
            this.u += 32;
          } 
        case 9:
        case 132:
        case 133:
        case 65535:
          return;
      } 
      throw new IllegalArgumentException("Channel conversion type " + paramaf.l.b + " is not supported");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */