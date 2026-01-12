package G;

import V.ExceptionGetmessage;
import V.VInterfaceBravo;
import bH.c;

class ControllerDataValidatorAlt implements v {
  ControllerDataValidatorAlt(J paramJ) {}

  public int[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      byte[] arrayOfByte = this.a.a(paramArrayOfbyte, paramInt1, 200L, paramInt2, (m) null);
      return c.VInterfaceBravo(arrayOfByte);
    } catch (ExceptionGetmessage ExceptionGetmessage) {
      throw new VInterfaceBravo(ExceptionGetmessage.getMessage());
    }
  }

  public byte a() {
    return (byte) this.a.e().x();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
