package af;

import W.z;
import ad.AdInterfaceAlpha;
import ad.ExceptionInAdPackage;
import ae.AdInterfaceAlpha;
import ae.AeInterfaceDelta;
import ae.FileUsingHashMap;
import ae.ExceptionInAePackage;
import ae.IOInAePackage;
import ae.AeInterfaceSierra;
import ae.AeInterfaceUniform;
import ae.ExceptionExtensionInAePackage;
import bH.D;
import bH.ExceptionInAdPackage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AfInterfaceEcho implements AeInterfaceSierra, AdInterfaceAlpha {
  List AeInterfaceDelta = new ArrayList();
  
  List e = new ArrayList();
  
  byte[][] f = null;
  
  int g = 31;
  
  int h = 1024;
  
  byte[] i = null;
  
  boolean j = true;
  
  boolean FileUsingHashMap = true;
  
  boolean l = false;
  
  h m;
  
  private String IOInAePackage = null;
  
  AdInterfaceAlpha ExceptionInAePackage = new AdInterfaceAlpha();
  
  AdInterfaceAlpha o = new AdInterfaceAlpha();
  
  private boolean q = false;
  
  public AfInterfaceEcho() {
    this.ExceptionInAePackage.AdInterfaceAlpha("Preserve Port States");
    this.ExceptionInAePackage.b(AdInterfaceAlpha());
    this.ExceptionInAePackage.AdInterfaceAlpha(4);
    this.ExceptionInAePackage.b(Boolean.valueOf(this.j));
    this.o.AdInterfaceAlpha("Preserve Sensor Calibrations");
    this.o.b(AdInterfaceAlpha());
    this.o.AdInterfaceAlpha(4);
    this.o.b(Boolean.valueOf(this.FileUsingHashMap));
  }
  
  public String AdInterfaceAlpha() {
    return "Will preserve sensor calibration tables during firmware update";
  }
  
  public List AdInterfaceAlpha(FileUsingHashMap paramk) {
    this.AeInterfaceDelta.clear();
    if (this.IOInAePackage != null && this.IOInAePackage.length() > 10) {
      this.AeInterfaceDelta.add(this.o);
      List<File> list = paramk.ExceptionInAdPackage();
      String str = null;
      if (!list.isEmpty())
        str = z.AdInterfaceAlpha(list.get(0)); 
      if (str != null && str.contains(".") && this.IOInAePackage.startsWith(str.substring(0, str.indexOf(".")))) {
        this.o.AdInterfaceAlpha("Preserve Sensor Calibrations and Tune Data");
        this.l = true;
      } else {
        this.o.AdInterfaceAlpha("Preserve Sensor Calibrations");
      } 
      this.FileUsingHashMap = true;
      this.o.b(Boolean.valueOf(this.FileUsingHashMap));
      this.j = true;
      this.ExceptionInAePackage.b(Boolean.valueOf(this.j));
      this.AeInterfaceDelta.add(this.ExceptionInAePackage);
    } else {
      this.FileUsingHashMap = false;
      this.o.b(Boolean.valueOf(this.FileUsingHashMap));
      this.j = false;
      this.ExceptionInAePackage.b(Boolean.valueOf(this.j));
    } 
    return this.AeInterfaceDelta;
  }
  
  public List b(FileUsingHashMap paramk) {
    return this.e;
  }
  
  public void AdInterfaceAlpha(String paramString, Object paramObject) {
    if (paramString.equals("Preserve Sensor Calibrations") || paramString.equals("Preserve Sensor Calibrations and Tune Data")) {
      if (paramObject instanceof Boolean) {
        this.FileUsingHashMap = ((Boolean)paramObject).booleanValue();
      } else {
        throw new ExceptionInAePackage("Invalid Data Type for " + paramString + ", must be Boolean");
      } 
    } else if (paramString.equals("Preserve Port States")) {
      if (paramObject instanceof Boolean) {
        this.j = ((Boolean)paramObject).booleanValue();
      } else {
        throw new ExceptionInAePackage("Invalid Data Type for Preserve Sensor Calibrations, must be Boolean");
      } 
    } else {
      throw new ExceptionInAePackage("Unknown Option " + paramString);
    } 
  }
  
  public AeInterfaceDelta AdInterfaceAlpha(FileUsingHashMap paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    if (this.j) {
      D.AeInterfaceDelta("saving Port states");
      AeInterfaceDelta = AeInterfaceDelta(paramp, paramu);
    } 
    if (this.FileUsingHashMap)
      try {
        File file = paramk.g();
        if (file == null) {
          AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.b);
          AeInterfaceDelta.AdInterfaceAlpha("No Firmware File Selected!");
          return AeInterfaceDelta;
        } 
        D.AeInterfaceDelta("Preserving settings based on S19: " + file.getAbsolutePath());
        AdInterfaceAlpha a1 = paramk.ExceptionInAdPackage(file);
        this.m = h.AdInterfaceAlpha(a1.ExceptionInAdPackage(), this.IOInAePackage);
        AeInterfaceDelta = ExceptionInAdPackage(paramp, paramu);
      } catch (ExceptionInAdPackage ExceptionInAdPackage) {
        AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.b);
        AeInterfaceDelta.AdInterfaceAlpha("Unable to parse S19 file.");
        D.AdInterfaceAlpha(ExceptionInAdPackage.getLocalizedMessage());
      }  
    this.q = false;
    return AeInterfaceDelta;
  }
  
  private AeInterfaceDelta ExceptionInAdPackage(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    byte[] arrayOfByte1 = new byte[5];
    int i = 0;
    byte b1 = 16;
    if (this.m.b()) {
      paramu.AdInterfaceAlpha("Preserving Sensor Calibration and Tune data");
      D.ExceptionInAdPackage("Preserving Sensor Calibration and Tune data");
    } else {
      paramu.AdInterfaceAlpha("Preserving Sensor Calibrations");
      D.ExceptionInAdPackage("Preserving Sensor Calibrations");
    } 
    byte[] arrayOfByte2 = new byte[3];
    int j = this.m.AdInterfaceAlpha();
    this.f = new byte[this.g][this.h];
    try {
      for (byte b = 0; b < this.g; b++) {
        if (this.m.AdInterfaceAlpha(b)) {
          i = 1048576 + b * 1024;
          for (byte b3 = 0; b3 < 64; b3++) {
            arrayOfByte1[0] = -64;
            arrayOfByte1[1] = (byte)(0xFF & i >> 16);
            arrayOfByte1[2] = (byte)(0xFF & i >> 8);
            arrayOfByte1[3] = (byte)(0xFF & i);
            arrayOfByte1[4] = 15;
            byte[] arrayOfByte = paramp.AdInterfaceAlpha(arrayOfByte1, b1 + 3, 300);
            if (arrayOfByte == null || arrayOfByte.length != b1 + 3) {
              this.f = null;
              D.AdInterfaceAlpha("Read Error during read calibrations. block " + b);
              AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.ExceptionInAdPackage);
              AeInterfaceDelta.AdInterfaceAlpha("Failed to retrieve calibration data.");
              paramu.AdInterfaceAlpha("Failed to retrieve calibration data.");
              return AeInterfaceDelta;
            } 
            System.arraycopy(arrayOfByte, b1, arrayOfByte2, 0, arrayOfByte2.length);
            if (j.AdInterfaceAlpha(arrayOfByte2) == 0) {
              System.arraycopy(arrayOfByte, 0, this.f[b], b3 * b1, b1);
            } else {
              AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.ExceptionInAdPackage);
              AeInterfaceDelta.AdInterfaceAlpha("Unable to retrieve calibration data. Skipping Preserve Calibration/Sensor");
              this.f = null;
              return AeInterfaceDelta;
            } 
            paramu.AdInterfaceAlpha((b / j));
            i += b1;
          } 
        } 
      } 
    } catch (IOException iOException) {
      this.f = null;
      throw iOException;
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionInAePackage);
      throw new IOException("Protocol Error while reading calibration data, this should not happen.");
    } finally {
      paramu.AdInterfaceAlpha(1.0D);
    } 
    AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceAlpha);
    boolean bool = false;
    for (byte b2 = 0; b2 < this.f.length; b2++) {
      for (byte b = 0; b < (this.f[b2]).length; b++) {
        if (this.f[b2][b] != -1) {
          bool = true;
          break;
        } 
      } 
    } 
    if (!bool) {
      AeInterfaceDelta.AdInterfaceAlpha("Calibration not found, data Erased.");
      paramu.AdInterfaceAlpha("Calibration data has already been erased, not saving.");
      D.AeInterfaceDelta("Calibration data has already been erased, not saving.");
      this.f = null;
    } 
    return AeInterfaceDelta;
  }
  
  private AeInterfaceDelta AeInterfaceDelta(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    byte[] arrayOfByte1 = new byte[5];
    int i = 1080320;
    byte b1 = 16;
    paramu.AdInterfaceAlpha("Saving Port States");
    byte[] arrayOfByte2 = new byte[3];
    this.i = new byte[256];
    for (byte b2 = 0; b2 < 16; b2++) {
      try {
        arrayOfByte1[0] = -64;
        arrayOfByte1[1] = (byte)(0xFF & i >> 16);
        arrayOfByte1[2] = (byte)(0xFF & i >> 8);
        arrayOfByte1[3] = (byte)(0xFF & i);
        arrayOfByte1[4] = 15;
        byte[] arrayOfByte = paramp.AdInterfaceAlpha(arrayOfByte1, b1 + 3, 300);
        if (arrayOfByte == null || arrayOfByte.length != b1 + 3) {
          this.i = null;
          D.AdInterfaceAlpha("Read Error during read calibrations. block " + b2);
          AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.b);
          AeInterfaceDelta.AdInterfaceAlpha("Unable to retrieve port states data. Skipping save port states! Disconnect Coils before power cycling.");
          paramu.AdInterfaceAlpha("Failed to retrieve calibration data.");
          return AeInterfaceDelta;
        } 
        System.arraycopy(arrayOfByte, b1, arrayOfByte2, 0, arrayOfByte2.length);
        if (j.AdInterfaceAlpha(arrayOfByte2) == 0) {
          System.arraycopy(arrayOfByte, 0, this.i, b2 * b1, b1);
        } else {
          AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.b);
          AeInterfaceDelta.AdInterfaceAlpha("Unable to retrieve port states data. Skipping save port states! Disconnect Coils before power cycling.");
          this.i = null;
          return AeInterfaceDelta;
        } 
        paramu.AdInterfaceAlpha((b2 / 160.0F));
      } catch (IOException iOException) {
        this.i = null;
        throw iOException;
      } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionInAePackage);
        throw new IOException("Protocol Error while reading calibration data, this should not happen.");
      } finally {
        paramu.AdInterfaceAlpha(1.0D);
      } 
      i += b1;
    } 
    this.i[34] = -1;
    AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceAlpha);
    return AeInterfaceDelta;
  }
  
  public AeInterfaceDelta AdInterfaceAlpha(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta;
    if (this.i != null) {
      AeInterfaceDelta = b(paramp, paramu);
      if (AeInterfaceDelta.AdInterfaceAlpha() != AeInterfaceDelta.AdInterfaceAlpha) {
        D.b("Problem restoring port states!");
        paramu.AdInterfaceAlpha("Unable to restore port states!");
      } 
    } 
    if (this.f != null) {
      AeInterfaceDelta = e(paramp, paramu);
    } else {
      AeInterfaceDelta = new AeInterfaceDelta();
      AeInterfaceDelta.AdInterfaceAlpha("Nothing to do.");
      D.AeInterfaceDelta("Not loading calibration tables.");
      AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceAlpha);
    } 
    return AeInterfaceDelta;
  }
  
  public boolean b() {
    return (this.i != null);
  }
  
  public AeInterfaceDelta b(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    int i = 1080320;
    D.ExceptionInAdPackage("Sending port states");
    if (paramu != null)
      paramu.AdInterfaceAlpha("Restoring Port States"); 
    byte b1 = 16;
    int[] arrayOfInt1 = new int[3];
    int[] arrayOfInt2 = new int[b1];
    int[] arrayOfInt3 = ExceptionInAdPackage.b(this.i);
    for (byte b2 = 0; b2 < 16; b2++) {
      if (paramu != null)
        paramu.AdInterfaceAlpha((b2 / 16.0F)); 
      arrayOfInt1[0] = 0xFF & i >> 16;
      arrayOfInt1[1] = 0xFF & i >> 8;
      arrayOfInt1[2] = 0xFF & i;
      System.arraycopy(arrayOfInt3, b2 * 16, arrayOfInt2, 0, arrayOfInt2.length);
      try {
        j.b(paramp, arrayOfInt1, arrayOfInt2);
      } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionInAePackage);
      } 
      i += b1;
    } 
    if (paramu != null) {
      paramu.AdInterfaceAlpha(1.0D);
      paramu.AdInterfaceAlpha("Port States Restored");
    } 
    AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceAlpha);
    return AeInterfaceDelta;
  }
  
  private AeInterfaceDelta e(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    int i = 0;
    D.ExceptionInAdPackage("Sending preserved calibration");
    paramu.AdInterfaceAlpha("Restoring Sensor Calibrations");
    byte b1 = 16;
    int[] arrayOfInt1 = new int[3];
    int[] arrayOfInt2 = new int[b1];
    int j = this.m.AdInterfaceAlpha();
    for (byte b2 = 0; b2 < this.g; b2++) {
      if (this.m.AdInterfaceAlpha(b2)) {
        paramu.AdInterfaceAlpha((b2 / j));
        i = 1048576 + b2 * 1024;
        int[] arrayOfInt = ExceptionInAdPackage.b(this.f[b2]);
        for (byte b = 0; b < 64; b++) {
          arrayOfInt1[0] = 0xFF & i >> 16;
          arrayOfInt1[1] = 0xFF & i >> 8;
          arrayOfInt1[2] = 0xFF & i;
          System.arraycopy(arrayOfInt, b * b1, arrayOfInt2, 0, arrayOfInt2.length);
          try {
            j.b(paramp, arrayOfInt1, arrayOfInt2);
          } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
            Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionInAePackage);
          } 
          i += b1;
        } 
      } 
    } 
    paramu.AdInterfaceAlpha(1.0D);
    paramu.AdInterfaceAlpha("");
    AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceAlpha);
    this.q = true;
    return AeInterfaceDelta;
  }
  
  public boolean ExceptionInAdPackage() {
    return (this.f != null);
  }
  
  public void AdInterfaceAlpha(String paramString) {
    this.IOInAePackage = paramString;
  }
  
  boolean AeInterfaceDelta() {
    return (this.l && this.q);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */