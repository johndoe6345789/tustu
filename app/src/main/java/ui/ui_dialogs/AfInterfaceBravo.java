package af;

import ae.AeInterfaceAlpha;
import ae.AeInterfaceDelta;
import ae.AeInterfaceSierra;
import ae.AeInterfaceUniform;
import ae.ExceptionExtensionInAePackage;
import ae.ExceptionInAePackage;
import ae.FileUsingHashMap;
import ae.IOInAePackage;
import bH.D;
import bH.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AfInterfaceBravo implements AeInterfaceSierra, AeInterfaceAlpha {
  List AeInterfaceDelta = new ArrayList();

  List e = new ArrayList();

  byte[] f = null;

  boolean g = true;

  public AfInterfaceBravo() {
    AeInterfaceAlpha a1 = new AeInterfaceAlpha();
    a1.AeInterfaceAlpha("Preserve Sensor Calibrations");
    a1.b(AeInterfaceAlpha());
    a1.AeInterfaceAlpha(4);
    a1.b(Boolean.valueOf(this.g));
    this.AeInterfaceDelta.add(a1);
  }

  public String AeInterfaceAlpha() {
    return "Will preserve sensor calibration tables during firmware update";
  }

  public List AeInterfaceAlpha(FileUsingHashMap paramk) {
    return this.AeInterfaceDelta;
  }

  public List b(FileUsingHashMap paramk) {
    return this.e;
  }

  public void AeInterfaceAlpha(String paramString, Object paramObject) {
    if (paramString.equals("Preserve Sensor Calibrations")) {
      if (paramObject instanceof Boolean) {
        this.g = ((Boolean) paramObject).booleanValue();
      } else {
        throw new ExceptionInAePackage(
            "Invalid Data Type for Preserve Sensor Calibrations, must be Boolean");
      }
    } else {
      throw new ExceptionInAePackage("Unknown Option " + paramString);
    }
  }

  public AeInterfaceDelta AeInterfaceAlpha(
      FileUsingHashMap paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    if (this.g) return b(paramp, paramu);
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    AeInterfaceDelta.AeInterfaceAlpha(AeInterfaceDelta.AeInterfaceAlpha);
    AeInterfaceDelta.AeInterfaceAlpha("Not saving Sensor Calibrations");
    paramu.AeInterfaceAlpha("Not saving Sensor Calibrations");
    D.AeInterfaceDelta("Not saving Sensor Calibrations");
    return AeInterfaceDelta;
  }

  private AeInterfaceDelta b(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = j.AeInterfaceAlpha(paramp, 3974144, false);
    if (AeInterfaceDelta.AeInterfaceAlpha() != AeInterfaceDelta.AeInterfaceAlpha) {
      D.AeInterfaceAlpha("Error changing page to preserve MS2 Calibration Data.");
      return AeInterfaceDelta;
    }
    byte[] arrayOfByte1 = new byte[4];
    char c = 'Ā';
    byte[] arrayOfByte2 = new byte[3];
    this.f = new byte[28 * c];
    byte b1;
    for (b1 = 0; b1 < 28; b1++) {
      try {
        arrayOfByte1[0] = -89;
        arrayOfByte1[1] = (byte) (b1 + 164);
        arrayOfByte1[2] = 0;
        arrayOfByte1[3] = -1;
        byte[] arrayOfByte = paramp.AeInterfaceAlpha(arrayOfByte1, c + 3, 300);
        if (arrayOfByte == null || arrayOfByte.length != c + 3) {
          this.f = null;
          D.AeInterfaceAlpha("Read Error during read calibrations. block " + b1);
          AeInterfaceDelta.AeInterfaceAlpha(AeInterfaceDelta.c);
          AeInterfaceDelta.AeInterfaceAlpha("Failed to retrieve calibration data.");
          paramu.AeInterfaceAlpha("Failed to retrieve calibration data.");
          return AeInterfaceDelta;
        }
        System.arraycopy(arrayOfByte, 256, arrayOfByte2, 0, arrayOfByte2.length);
        if (j.AeInterfaceAlpha(arrayOfByte2) == 0) {
          System.arraycopy(arrayOfByte, 0, this.f, b1 * c, c);
        } else {
          AeInterfaceDelta.AeInterfaceAlpha(AeInterfaceDelta.c);
          AeInterfaceDelta.AeInterfaceAlpha(
              "Unable to retrieve sensor calibration data. Skipping Preserve Sensor Calibration");
          this.f = null;
          return AeInterfaceDelta;
        }
        paramu.AeInterfaceAlpha((b1 / 27.0F));
      } catch (IOException iOException) {
        this.f = null;
        throw iOException;
      } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
        Logger.getLogger(b.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionExtensionInAePackage);
        throw new IOException(
            "Protocol Error while reading calibration data, this should not happen.");
      } finally {
        paramu.AeInterfaceAlpha(1.0D);
      }
    }
    b1 = 0;
    for (byte b2 = 0; b2 < this.f.length; b2++) {
      if (this.f[b2] != -1) {
        b1 = 1;
        break;
      }
    }
    if (b1 == 0) {
      AeInterfaceDelta.AeInterfaceAlpha("Calibration not found, data Erased.");
      paramu.AeInterfaceAlpha("Calibration data has already been erased, not saving.");
      D.AeInterfaceDelta("Calibration data has already been erased, not saving.");
      this.f = null;
    }
    return AeInterfaceDelta;
  }

  public AeInterfaceDelta AeInterfaceAlpha(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta;
    if (this.f != null) {
      try {
        AeInterfaceDelta = j.AeInterfaceAlpha(paramp, 3974144, false);
        if (AeInterfaceDelta.AeInterfaceAlpha() != AeInterfaceDelta.AeInterfaceAlpha) {
          D.AeInterfaceAlpha("Error changing page to preserve MS2 Calibration Data.");
          return AeInterfaceDelta;
        }
        byte[] arrayOfByte = new byte[256];
        for (byte b1 = 0; b1 < 28; b1++) {
          System.arraycopy(this.f, 256 * b1, arrayOfByte, 0, arrayOfByte.length);
          int i = 3974144 + b1 * 256;
          try {
            int j = -1;
            for (byte b2 = 0; b2 < 3 && j != 0; b2++) {
              if (b2 > 0 && b2 < 2) {
                D.b("Send Calibration Record Failed, retrying.");
                j.AeInterfaceAlpha(250);
              } else if (b2 > 0) {
                D.b("Send Calibration Record Failed, 3 tries, giving up.");
                AeInterfaceDelta.AeInterfaceAlpha(AeInterfaceDelta.b);
                AeInterfaceDelta.AeInterfaceAlpha(
                    "Failed to send sensor calibration data after multiple retries.");
                return AeInterfaceDelta;
              }
              j = j.AeInterfaceAlpha(paramp, c.b(i), arrayOfByte);
            }
          } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
            Logger.getLogger(b.class.getName())
                .log(Level.SEVERE, (String) null, (Throwable) ExceptionExtensionInAePackage);
          }
        }
      } catch (IOException iOException) {
        AeInterfaceDelta = new AeInterfaceDelta();
        AeInterfaceDelta.AeInterfaceAlpha("Unable to restore Sensor Calibrations");
        AeInterfaceDelta.AeInterfaceAlpha(AeInterfaceDelta.c);
        D.AeInterfaceAlpha(
            "IOException while restoring sensor calibrations: "
                + iOException.getLocalizedMessage());
        return AeInterfaceDelta;
      }
    } else {
      AeInterfaceDelta = new AeInterfaceDelta();
      AeInterfaceDelta.AeInterfaceAlpha("Nothing to do.");
      D.AeInterfaceDelta("Not loading calibration tables.");
      AeInterfaceDelta.AeInterfaceAlpha(AeInterfaceDelta.AeInterfaceAlpha);
    }
    return AeInterfaceDelta;
  }

  public boolean b() {
    return (this.f != null);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
