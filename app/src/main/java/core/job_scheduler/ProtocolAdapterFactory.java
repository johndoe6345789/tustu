package J;

import G.F;

public class ProtocolAdapterFactory {
  private static ProtocolAdapterFactory a = null;

  public static ProtocolAdapterFactory a() {
    if (a == null) a = new ProtocolAdapterFactory();
    return a;
  }

  public void a(F paramF, int paramInt) {
    if (paramInt > 0 && !(paramF.D() instanceof CrcEnvelopeDecoder))
      paramF.a(new CrcEnvelopeDecoder());
    if (paramInt > 0 && !(paramF.C() instanceof CrcEnvelopeEncoder))
      paramF.a(new CrcEnvelopeEncoder());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
