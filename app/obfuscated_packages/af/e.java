package af;

import W.z;
import ad.a;
import ad.c;
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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e implements s, a {
  List d = new ArrayList();
  
  List e = new ArrayList();
  
  byte[][] f = null;
  
  int g = 31;
  
  int h = 1024;
  
  byte[] i = null;
  
  boolean j = true;
  
  boolean k = true;
  
  boolean l = false;
  
  h m;
  
  private String p = null;
  
  a n = new a();
  
  a o = new a();
  
  private boolean q = false;
  
  public e() {
    this.n.a("Preserve Port States");
    this.n.b(a());
    this.n.a(4);
    this.n.b(Boolean.valueOf(this.j));
    this.o.a("Preserve Sensor Calibrations");
    this.o.b(a());
    this.o.a(4);
    this.o.b(Boolean.valueOf(this.k));
  }
  
  public String a() {
    return "Will preserve sensor calibration tables during firmware update";
  }
  
  public List a(k paramk) {
    this.d.clear();
    if (this.p != null && this.p.length() > 10) {
      this.d.add(this.o);
      List<File> list = paramk.c();
      String str = null;
      if (!list.isEmpty())
        str = z.a(list.get(0)); 
      if (str != null && str.contains(".") && this.p.startsWith(str.substring(0, str.indexOf(".")))) {
        this.o.a("Preserve Sensor Calibrations and Tune Data");
        this.l = true;
      } else {
        this.o.a("Preserve Sensor Calibrations");
      } 
      this.k = true;
      this.o.b(Boolean.valueOf(this.k));
      this.j = true;
      this.n.b(Boolean.valueOf(this.j));
      this.d.add(this.n);
    } else {
      this.k = false;
      this.o.b(Boolean.valueOf(this.k));
      this.j = false;
      this.n.b(Boolean.valueOf(this.j));
    } 
    return this.d;
  }
  
  public List b(k paramk) {
    return this.e;
  }
  
  public void a(String paramString, Object paramObject) {
    if (paramString.equals("Preserve Sensor Calibrations") || paramString.equals("Preserve Sensor Calibrations and Tune Data")) {
      if (paramObject instanceof Boolean) {
        this.k = ((Boolean)paramObject).booleanValue();
      } else {
        throw new n("Invalid Data Type for " + paramString + ", must be Boolean");
      } 
    } else if (paramString.equals("Preserve Port States")) {
      if (paramObject instanceof Boolean) {
        this.j = ((Boolean)paramObject).booleanValue();
      } else {
        throw new n("Invalid Data Type for Preserve Sensor Calibrations, must be Boolean");
      } 
    } else {
      throw new n("Unknown Option " + paramString);
    } 
  }
  
  public d a(k paramk, p paramp, u paramu) {
    d d = new d();
    if (this.j) {
      D.d("saving Port states");
      d = d(paramp, paramu);
    } 
    if (this.k)
      try {
        File file = paramk.g();
        if (file == null) {
          d.a(d.b);
          d.a("No Firmware File Selected!");
          return d;
        } 
        D.d("Preserving settings based on S19: " + file.getAbsolutePath());
        a a1 = paramk.c(file);
        this.m = h.a(a1.c(), this.p);
        d = c(paramp, paramu);
      } catch (c c) {
        d.a(d.b);
        d.a("Unable to parse S19 file.");
        D.a(c.getLocalizedMessage());
      }  
    this.q = false;
    return d;
  }
  
  private d c(p paramp, u paramu) {
    d d = new d();
    byte[] arrayOfByte1 = new byte[5];
    int i = 0;
    byte b1 = 16;
    if (this.m.b()) {
      paramu.a("Preserving Sensor Calibration and Tune data");
      D.c("Preserving Sensor Calibration and Tune data");
    } else {
      paramu.a("Preserving Sensor Calibrations");
      D.c("Preserving Sensor Calibrations");
    } 
    byte[] arrayOfByte2 = new byte[3];
    int j = this.m.a();
    this.f = new byte[this.g][this.h];
    try {
      for (byte b = 0; b < this.g; b++) {
        if (this.m.a(b)) {
          i = 1048576 + b * 1024;
          for (byte b3 = 0; b3 < 64; b3++) {
            arrayOfByte1[0] = -64;
            arrayOfByte1[1] = (byte)(0xFF & i >> 16);
            arrayOfByte1[2] = (byte)(0xFF & i >> 8);
            arrayOfByte1[3] = (byte)(0xFF & i);
            arrayOfByte1[4] = 15;
            byte[] arrayOfByte = paramp.a(arrayOfByte1, b1 + 3, 300);
            if (arrayOfByte == null || arrayOfByte.length != b1 + 3) {
              this.f = null;
              D.a("Read Error during read calibrations. block " + b);
              d.a(d.c);
              d.a("Failed to retrieve calibration data.");
              paramu.a("Failed to retrieve calibration data.");
              return d;
            } 
            System.arraycopy(arrayOfByte, b1, arrayOfByte2, 0, arrayOfByte2.length);
            if (j.a(arrayOfByte2) == 0) {
              System.arraycopy(arrayOfByte, 0, this.f[b], b3 * b1, b1);
            } else {
              d.a(d.c);
              d.a("Unable to retrieve calibration data. Skipping Preserve Calibration/Sensor");
              this.f = null;
              return d;
            } 
            paramu.a((b / j));
            i += b1;
          } 
        } 
      } 
    } catch (IOException iOException) {
      this.f = null;
      throw iOException;
    } catch (v v) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
      throw new IOException("Protocol Error while reading calibration data, this should not happen.");
    } finally {
      paramu.a(1.0D);
    } 
    d.a(d.a);
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
      d.a("Calibration not found, data Erased.");
      paramu.a("Calibration data has already been erased, not saving.");
      D.d("Calibration data has already been erased, not saving.");
      this.f = null;
    } 
    return d;
  }
  
  private d d(p paramp, u paramu) {
    d d = new d();
    byte[] arrayOfByte1 = new byte[5];
    int i = 1080320;
    byte b1 = 16;
    paramu.a("Saving Port States");
    byte[] arrayOfByte2 = new byte[3];
    this.i = new byte[256];
    for (byte b2 = 0; b2 < 16; b2++) {
      try {
        arrayOfByte1[0] = -64;
        arrayOfByte1[1] = (byte)(0xFF & i >> 16);
        arrayOfByte1[2] = (byte)(0xFF & i >> 8);
        arrayOfByte1[3] = (byte)(0xFF & i);
        arrayOfByte1[4] = 15;
        byte[] arrayOfByte = paramp.a(arrayOfByte1, b1 + 3, 300);
        if (arrayOfByte == null || arrayOfByte.length != b1 + 3) {
          this.i = null;
          D.a("Read Error during read calibrations. block " + b2);
          d.a(d.b);
          d.a("Unable to retrieve port states data. Skipping save port states! Disconnect Coils before power cycling.");
          paramu.a("Failed to retrieve calibration data.");
          return d;
        } 
        System.arraycopy(arrayOfByte, b1, arrayOfByte2, 0, arrayOfByte2.length);
        if (j.a(arrayOfByte2) == 0) {
          System.arraycopy(arrayOfByte, 0, this.i, b2 * b1, b1);
        } else {
          d.a(d.b);
          d.a("Unable to retrieve port states data. Skipping save port states! Disconnect Coils before power cycling.");
          this.i = null;
          return d;
        } 
        paramu.a((b2 / 160.0F));
      } catch (IOException iOException) {
        this.i = null;
        throw iOException;
      } catch (v v) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
        throw new IOException("Protocol Error while reading calibration data, this should not happen.");
      } finally {
        paramu.a(1.0D);
      } 
      i += b1;
    } 
    this.i[34] = -1;
    d.a(d.a);
    return d;
  }
  
  public d a(p paramp, u paramu) {
    d d;
    if (this.i != null) {
      d = b(paramp, paramu);
      if (d.a() != d.a) {
        D.b("Problem restoring port states!");
        paramu.a("Unable to restore port states!");
      } 
    } 
    if (this.f != null) {
      d = e(paramp, paramu);
    } else {
      d = new d();
      d.a("Nothing to do.");
      D.d("Not loading calibration tables.");
      d.a(d.a);
    } 
    return d;
  }
  
  public boolean b() {
    return (this.i != null);
  }
  
  public d b(p paramp, u paramu) {
    d d = new d();
    int i = 1080320;
    D.c("Sending port states");
    if (paramu != null)
      paramu.a("Restoring Port States"); 
    byte b1 = 16;
    int[] arrayOfInt1 = new int[3];
    int[] arrayOfInt2 = new int[b1];
    int[] arrayOfInt3 = c.b(this.i);
    for (byte b2 = 0; b2 < 16; b2++) {
      if (paramu != null)
        paramu.a((b2 / 16.0F)); 
      arrayOfInt1[0] = 0xFF & i >> 16;
      arrayOfInt1[1] = 0xFF & i >> 8;
      arrayOfInt1[2] = 0xFF & i;
      System.arraycopy(arrayOfInt3, b2 * 16, arrayOfInt2, 0, arrayOfInt2.length);
      try {
        j.b(paramp, arrayOfInt1, arrayOfInt2);
      } catch (v v) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
      } 
      i += b1;
    } 
    if (paramu != null) {
      paramu.a(1.0D);
      paramu.a("Port States Restored");
    } 
    d.a(d.a);
    return d;
  }
  
  private d e(p paramp, u paramu) {
    d d = new d();
    int i = 0;
    D.c("Sending preserved calibration");
    paramu.a("Restoring Sensor Calibrations");
    byte b1 = 16;
    int[] arrayOfInt1 = new int[3];
    int[] arrayOfInt2 = new int[b1];
    int j = this.m.a();
    for (byte b2 = 0; b2 < this.g; b2++) {
      if (this.m.a(b2)) {
        paramu.a((b2 / j));
        i = 1048576 + b2 * 1024;
        int[] arrayOfInt = c.b(this.f[b2]);
        for (byte b = 0; b < 64; b++) {
          arrayOfInt1[0] = 0xFF & i >> 16;
          arrayOfInt1[1] = 0xFF & i >> 8;
          arrayOfInt1[2] = 0xFF & i;
          System.arraycopy(arrayOfInt, b * b1, arrayOfInt2, 0, arrayOfInt2.length);
          try {
            j.b(paramp, arrayOfInt1, arrayOfInt2);
          } catch (v v) {
            Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
          } 
          i += b1;
        } 
      } 
    } 
    paramu.a(1.0D);
    paramu.a("");
    d.a(d.a);
    this.q = true;
    return d;
  }
  
  public boolean c() {
    return (this.f != null);
  }
  
  public void a(String paramString) {
    this.p = paramString;
  }
  
  boolean d() {
    return (this.l && this.q);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */