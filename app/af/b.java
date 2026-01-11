package af;

import ae.a;
import ae.d;
import ae.k;
import ae.n;
import ae.p;
import ae.s;
import ae.u;
import ae.v;
import bH.D;
import bH.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b implements s, a {
  List d = new ArrayList();
  
  List e = new ArrayList();
  
  byte[] f = null;
  
  boolean g = true;
  
  public b() {
    a a1 = new a();
    a1.a("Preserve Sensor Calibrations");
    a1.b(a());
    a1.a(4);
    a1.b(Boolean.valueOf(this.g));
    this.d.add(a1);
  }
  
  public String a() {
    return "Will preserve sensor calibration tables during firmware update";
  }
  
  public List a(k paramk) {
    return this.d;
  }
  
  public List b(k paramk) {
    return this.e;
  }
  
  public void a(String paramString, Object paramObject) {
    if (paramString.equals("Preserve Sensor Calibrations")) {
      if (paramObject instanceof Boolean) {
        this.g = ((Boolean)paramObject).booleanValue();
      } else {
        throw new n("Invalid Data Type for Preserve Sensor Calibrations, must be Boolean");
      } 
    } else {
      throw new n("Unknown Option " + paramString);
    } 
  }
  
  public d a(k paramk, p paramp, u paramu) {
    if (this.g)
      return b(paramp, paramu); 
    d d = new d();
    d.a(d.a);
    d.a("Not saving Sensor Calibrations");
    paramu.a("Not saving Sensor Calibrations");
    D.d("Not saving Sensor Calibrations");
    return d;
  }
  
  private d b(p paramp, u paramu) {
    d d = j.a(paramp, 3974144, false);
    if (d.a() != d.a) {
      D.a("Error changing page to preserve MS2 Calibration Data.");
      return d;
    } 
    byte[] arrayOfByte1 = new byte[4];
    char c = 'Ā';
    byte[] arrayOfByte2 = new byte[3];
    this.f = new byte[28 * c];
    byte b1;
    for (b1 = 0; b1 < 28; b1++) {
      try {
        arrayOfByte1[0] = -89;
        arrayOfByte1[1] = (byte)(b1 + 164);
        arrayOfByte1[2] = 0;
        arrayOfByte1[3] = -1;
        byte[] arrayOfByte = paramp.a(arrayOfByte1, c + 3, 300);
        if (arrayOfByte == null || arrayOfByte.length != c + 3) {
          this.f = null;
          D.a("Read Error during read calibrations. block " + b1);
          d.a(d.c);
          d.a("Failed to retrieve calibration data.");
          paramu.a("Failed to retrieve calibration data.");
          return d;
        } 
        System.arraycopy(arrayOfByte, 256, arrayOfByte2, 0, arrayOfByte2.length);
        if (j.a(arrayOfByte2) == 0) {
          System.arraycopy(arrayOfByte, 0, this.f, b1 * c, c);
        } else {
          d.a(d.c);
          d.a("Unable to retrieve sensor calibration data. Skipping Preserve Sensor Calibration");
          this.f = null;
          return d;
        } 
        paramu.a((b1 / 27.0F));
      } catch (IOException iOException) {
        this.f = null;
        throw iOException;
      } catch (v v) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
        throw new IOException("Protocol Error while reading calibration data, this should not happen.");
      } finally {
        paramu.a(1.0D);
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
      d.a("Calibration not found, data Erased.");
      paramu.a("Calibration data has already been erased, not saving.");
      D.d("Calibration data has already been erased, not saving.");
      this.f = null;
    } 
    return d;
  }
  
  public d a(p paramp, u paramu) {
    d d;
    if (this.f != null) {
      try {
        d = j.a(paramp, 3974144, false);
        if (d.a() != d.a) {
          D.a("Error changing page to preserve MS2 Calibration Data.");
          return d;
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
                j.a(250);
              } else if (b2 > 0) {
                D.b("Send Calibration Record Failed, 3 tries, giving up.");
                d.a(d.b);
                d.a("Failed to send sensor calibration data after multiple retries.");
                return d;
              } 
              j = j.a(paramp, c.b(i), arrayOfByte);
            } 
          } catch (v v) {
            Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
          } 
        } 
      } catch (IOException iOException) {
        d = new d();
        d.a("Unable to restore Sensor Calibrations");
        d.a(d.c);
        D.a("IOException while restoring sensor calibrations: " + iOException.getLocalizedMessage());
        return d;
      } 
    } else {
      d = new d();
      d.a("Nothing to do.");
      D.d("Not loading calibration tables.");
      d.a(d.a);
    } 
    return d;
  }
  
  public boolean b() {
    return (this.f != null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */