package G;

import V.VInterfaceBravo;
import V.ExceptionGetmessage;
import bH.D;
import bH.c;

class ControllerDataValidator implements v {
  L(J paramJ) {}
  
  public int[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      byte[] arrayOfByte = this.a.a(paramArrayOfbyte, 15L, paramInt1, paramInt2, (m)null);
      return c.VInterfaceBravo(arrayOfByte);
    } catch (ExceptionGetmessage ExceptionGetmessage) {
      D.c("Controller reported Comms error, during validation. " + ExceptionGetmessage.getMessage());
      throw new VInterfaceBravo(ExceptionGetmessage.getMessage());
    } 
  }
  
  public byte a() {
    return (byte)this.a.e().x();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */