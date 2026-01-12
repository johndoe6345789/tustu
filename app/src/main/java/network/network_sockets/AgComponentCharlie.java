package ag;

import G.AeInterfaceMikeTostring;
import ae.AeInterfaceDelta;
import ae.AeInterfaceMike;
import ae.AeInterfaceOscar;
import ae.AeInterfaceSierra;
import ae.AeInterfaceUniform;
import ae.ExceptionExtensionInAePackage;
import ae.FileUsingHashMap;
import ae.IOInAePackage;
import af.AfComponentAlpha;
import af.IOInAfPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgComponentCharlie implements AeInterfaceSierra, AfComponentAlpha {
  List AeInterfaceDelta = new ArrayList();

  public List AfComponentAlpha(FileUsingHashMap paramk) {
    return this.AeInterfaceDelta;
  }

  public List b(FileUsingHashMap paramk) {
    return this.AeInterfaceDelta;
  }

  public void AfComponentAlpha(String paramString, Object paramObject) {}

  public AeInterfaceDelta AfComponentAlpha(
      FileUsingHashMap paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    null = new AeInterfaceDelta();
    int i = AfComponentAlpha(paramp);
    if (i == 0) {
      null.AfComponentAlpha(AeInterfaceDelta.b);
      null.AfComponentAlpha("No MegaSquirt 2 Found.");
      return null;
    }
    if (!AfComponentAlpha(i)) {
      null.AfComponentAlpha(AeInterfaceDelta.b);
      null.AfComponentAlpha("Warning!! Wrong ECU TYPE found. MS2 expected");
      return null;
    }
    if (!IOInAfPackage.b(paramp))
      do {
        if (!paramu.b("Turn off Megasquirt/Microsquirt.")) {
          null.AfComponentAlpha(AeInterfaceDelta.b);
          null.AfComponentAlpha("Cancelled by user.");
          return null;
        }
        if (!paramu.b(
            "Install boot jumper shunt onto B/LD on the CPU card, or ground the bootload wire.")) {
          null.AfComponentAlpha(AeInterfaceDelta.b);
          null.AfComponentAlpha("Cancelled by user.");
          return null;
        }
        if (!paramu.b("Turn on Megasquirt/Microsquirt.")) {
          null.AfComponentAlpha(AeInterfaceDelta.b);
          null.AfComponentAlpha("Cancelled by user.");
          return null;
        }
      } while (!IOInAfPackage.b(paramp));
    return IOInAfPackage.AfComponentAlpha(paramp);
  }

  public AeInterfaceDelta AfComponentAlpha(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    AeInterfaceDelta.AfComponentAlpha(AeInterfaceDelta.AfComponentAlpha);
    IOInAfPackage.e(paramp);
    if (!paramu.b("Turn off Megasquirt/Microsquirt.")) {
      AeInterfaceDelta.AfComponentAlpha(AeInterfaceDelta.b);
      AeInterfaceDelta.AfComponentAlpha("Cancelled by user.");
      return AeInterfaceDelta;
    }
    if (!paramu.b("Please remove the boot jumper or disconnect the boot wire from ground.")) {
      AeInterfaceDelta.AfComponentAlpha(AeInterfaceDelta.b);
      AeInterfaceDelta.AfComponentAlpha("Cancelled by user.");
      return AeInterfaceDelta;
    }
    if (!paramu.b("Turn on Megasquirt/Microsquirt.")) {
      AeInterfaceDelta.AfComponentAlpha(AeInterfaceDelta.b);
      AeInterfaceDelta.AfComponentAlpha("Cancelled by user.");
      return AeInterfaceDelta;
    }
    return AeInterfaceDelta;
  }

  public int AfComponentAlpha(IOInAePackage paramp) {
    int i = 0;
    int IOInAfPackage = b(paramp);
    AeInterfaceMike m1 = AeInterfaceOscar.AfComponentAlpha(IOInAfPackage);
    i = m1.b();
    if (i > 0) return i;
    AeInterfaceMikeTostring AeInterfaceMikeTostring = IOInAfPackage.f(paramp);
    AeInterfaceMike m2 = AeInterfaceOscar.b(AeInterfaceMikeTostring);
    if (m2 != null) i |= m2.b();
    return i;
  }

  private int b(IOInAePackage paramp) {
    IOInAfPackage.AfComponentAlpha(paramp);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = -73;
    try {
      byte[] arrayOfByte1 = paramp.AfComponentAlpha(arrayOfByte, 6, 200);
      return (arrayOfByte1 == null || arrayOfByte1.length == 0 || arrayOfByte1[0] != -36)
          ? -1
          : bH.c.AfComponentAlpha(arrayOfByte1, 1, 2, true, false);
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      Logger.getLogger(c.class.getName())
          .log(
              Level.SEVERE,
              "Protocol Error probing for monitor",
              (Throwable) ExceptionExtensionInAePackage);
      return -1;
    }
  }

  private boolean AfComponentAlpha(int paramInt) {
    return ((AeInterfaceOscar.w | paramInt) == paramInt);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ag/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
