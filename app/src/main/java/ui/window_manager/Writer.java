package aK;

import A.AInterfaceGolf;
import A.IO;
import G.J;
import G.ManagerUsingArrayList;
import G.l;
import I.IInterfaceHotel;
import ak.AkInterfaceAe;
import bH.D;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ThreadedFile;

public class Writer implements AInterfaceGolf {
  private static a AInterfaceGolf = null;

  public static int a = 0;

  public static int b = 1;

  public static int c = 2;

  IO d;

  private String IInterfaceHotel = null;

  private long i;

  private int ThreadedFile = 0;

  private String k = "EFIAnalytics GPS";

  private float l = 10.0F;

  private int m = a;

  private boolean n = false;

  private boolean o = false;

  private int p = 0;

  private volatile b q;

  private static volatile b r;

  private List s = new ArrayList();

  private IO t = null;

  private c u = new c(this);

  private Writer v = null;

  final Object e = new Object();

  SimpleDateFormat IO = null;

  public static a b() {
    if (AInterfaceGolf == null) AInterfaceGolf = new a();
    return AInterfaceGolf;
  }

  private IO a(String paramString) {
    AkInterfaceAe AkInterfaceAe = new AkInterfaceAe(paramString, ",");
    String str = AkInterfaceAe.b();
    if (str.equals("$GPGGA") || str.equals("$GNGGA")) {
      String str1 = AkInterfaceAe.b();
      String str2 = AkInterfaceAe.b();
      String str3 = AkInterfaceAe.b();
      String str4 = AkInterfaceAe.b();
      String str5 = AkInterfaceAe.b();
      String str6 = AkInterfaceAe.b();
      String str7 = AkInterfaceAe.b();
      String str8 = AkInterfaceAe.b();
      String str9 = AkInterfaceAe.b();
      if (str6 != null && !str6.equals("") && !str6.equals("0")) {
        try {
          this.p = Integer.parseInt(str6);
        } catch (NumberFormatException numberFormatException) {
          this.p = 1;
        }
        long l = b(str1);
        if (this.m != b) a(b, null, l);
        if (!str1.equals(this.IInterfaceHotel)) {
          this.IInterfaceHotel = str1;
          this.i = b(str1);
          this.d.a(this.i);
        }
        if (str2 != null && !str2.equals("")) this.d.a(a(str2, str3));
        if (str4 != null && !str4.equals("")) this.d.b(b(str4, str5));
        if (str8 != null && !str8.equals("")) this.d.c(Float.parseFloat(str8) * this.l);
        if (str9 != null && !str9.equals("")) this.d.c(Double.parseDouble(str9));
        if (str7 != null && !str7.equals("")) {
          HashMap<Object, Object> hashMap = new HashMap<>();
          int i = Integer.parseInt(str7);
          hashMap.put("satellites", Integer.valueOf(i));
          this.d.a(hashMap);
          if (this.ThreadedFile != i) {
            this.ThreadedFile = i;
            a(this.m, hashMap, l);
          }
        }
        this.n = true;
        if (this.n && this.o) a(this.d);
      } else if (str6 != null && str6.equals("0")) {
        this.p = 0;
        if (this.m != c) {
          long l = b(str1);
          a(c, null, l);
        }
      }
    } else if (str.equals("$GPRMC") || str.equals("$GNRMC")) {
      String str1 = AkInterfaceAe.b();
      String str2 = AkInterfaceAe.b();
      String str3 = AkInterfaceAe.b();
      String str4 = AkInterfaceAe.b();
      String str5 = AkInterfaceAe.b();
      String str6 = AkInterfaceAe.b();
      String str7 = AkInterfaceAe.b();
      String str8 = AkInterfaceAe.b();
      if (str2 != null && !str2.equals("") && str2.equals("A")) {
        if (this.m != b) {
          long l = b(str1);
          a(b, null, l);
        }
        if (!str1.equals(this.IInterfaceHotel)) {
          this.IInterfaceHotel = str1;
          this.i = b(str1);
          this.d.a(this.i);
        }
        if (str3 != null && !str3.equals("")) this.d.a(a(str3, str4));
        if (str5 != null && !str5.equals("")) this.d.b(b(str5, str6));
        if (str7 != null && !str7.equals("")) this.d.a(c(str7, "N"));
        if (str8 != null && !str8.equals("")) this.d.b(Float.parseFloat(str8));
        this.o = true;
        if (this.n && this.o) a(this.d);
      } else if (str2.equals("V") && str2 != null && this.m != c) {
        long l = b(str1);
        a(c, null, l);
      }
    }
    return this.d;
  }

  private double a(String paramString1, String paramString2) {
    double d = 0.0D;
    if (paramString1 != null
        && paramString2 != null
        && !paramString1.equals("")
        && !paramString2.equals("")) {
      double d1 = Double.parseDouble(paramString1);
      double d2 = Math.floor(d1 / 100.0D);
      double d3 = (d1 / 100.0D - d2) / 0.6D;
      if (paramString2.equals("S")) {
        d = -(d2 + d3);
      } else if (paramString2.equals("N")) {
        d = d2 + d3;
      }
    }
    return d;
  }

  private double b(String paramString1, String paramString2) {
    double d = 0.0D;
    if (paramString1 != null
        && paramString2 != null
        && !paramString1.equals("")
        && !paramString2.equals("")) {
      double d1 = Double.parseDouble(paramString1);
      double d2 = Math.floor(d1 / 100.0D);
      double d3 = (d1 / 100.0D - d2) / 0.6D;
      if (paramString2.equals("W")) {
        d = -(d2 + d3);
      } else if (paramString2.equals("E")) {
        d = d2 + d3;
      }
    }
    return d;
  }

  private float c(String paramString1, String paramString2) {
    float f1 = 0.0F;
    if (paramString1 != null
        && paramString2 != null
        && !paramString1.equals("")
        && !paramString2.equals("")) {
      float f2 = Float.parseFloat(paramString1) / 3.6F;
      if (paramString2.equals("K")) {
        f1 = f2;
      } else if (paramString2.equals("N")) {
        f1 = f2 * 1.852F;
      }
    }
    return f1;
  }

  private SimpleDateFormat i() {
    if (this.IO == null) {
      this.IO = new SimpleDateFormat("HHmmss.SSS");
      this.IO.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
    return this.IO;
  }

  private long b(String paramString) {
    long l = 0L;
    SimpleDateFormat simpleDateFormat = i();
    try {
      if (paramString != null && paramString != null) {
        long l1 = System.currentTimeMillis();
        long l2 = l1 - l1 % 86400000L;
        long l3 =
            simpleDateFormat
                .parse(
                    String.format(
                        (Locale) null,
                        "%010.3f",
                        new Object[] {Double.valueOf(Double.parseDouble(paramString))}))
                .getTime();
        long l4 = l2 + l3;
        if (l4 - l1 > 43200000L) {
          l = l4 - 86400000L;
        } else if (l1 - l4 > 43200000L) {
          l = l4 + 86400000L;
        } else {
          l = l4;
        }
      }
    } catch (ParseException parseException) {
      D.a("Error while parsing NMEA time: " + parseException);
    }
    return l;
  }

  private void a(int paramInt, HashMap paramHashMap, long paramLong) {
    this.IInterfaceHotel = null;
    this.n = false;
    this.o = false;
    synchronized (this.s) {
      for (AInterfaceGolf g1 : this.s) g1.a(this.k, paramInt, paramHashMap);
    }
    if (this.m != paramInt) {
      this.d = new IO(this.k);
      this.m = paramInt;
    }
  }

  private void a(IO paramf) {
    this.IInterfaceHotel = null;
    this.n = false;
    this.o = false;
    if (this.d != null) {
      synchronized (this.s) {
        for (AInterfaceGolf g1 : this.s) g1.a(paramf);
      }
      this.d = new IO(this.k);
    }
  }

  public void a(AInterfaceGolf paramg) {
    synchronized (this.s) {
      if (!this.s.contains(paramg)) this.s.add(paramg);
    }
  }

  public void b(AInterfaceGolf paramg) {
    synchronized (this.s) {
      this.s.remove(paramg);
    }
  }

  public void c() {
    HashMap hashMap = null;
    long l = this.i;
    if (this.d != null) {
      l = this.d.a();
      hashMap = this.d.IInterfaceHotel();
    }
    a(this.m, hashMap, l);
  }

  public synchronized void d() {
    if (this.t == null) throw new l("Attempt to start External GPS with not Interface set.");
    ManagerUsingArrayList.a().a(IInterfaceHotel.n, 0.0D);
    ManagerUsingArrayList.a().a(IInterfaceHotel.m, 0.0D);
    if (this.q == null) {
      this.q = new b(this);
      this.q.setDaemon(true);
      this.m = a;
      this.IInterfaceHotel = null;
      this.n = false;
      this.o = false;
      this.ThreadedFile = 0;
      this.d = null;
      c();
      this.q.start();
    }
    D.c("GPS started");
  }

  public boolean e() {
    return (this.q != null && this.q.b);
  }

  public synchronized void IO() {
    if (this.q != null) {
      this.q.b();
      this.q = null;
      this.m = a;
    }
    c();
    ManagerUsingArrayList.a().a(IInterfaceHotel.n, 0.0D);
    ManagerUsingArrayList.a().a(IInterfaceHotel.m, 0.0D);
    if (this.v != null)
      try {
        this.v.close();
      } catch (Exception exception) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, exception);
      }
    D.c("GPSManager.stop() " + this.k);
  }

  public void a(IO paramf) {
    this.t = paramf;
    paramf.a(this.u);
  }

  public IO a() {
    return this.t;
  }

  private void c(String paramString) {
    if (J.I()) {
      if (this.v == null) {
        File file = new File(ThreadedFile.A(), "NEMA_Log.txt");
        if (file.exists()) file.delete();
        try {
          file.createNewFile();
          FileWriter fileWriter = new FileWriter(file);
          this.v = new BufferedWriter(fileWriter);
        } catch (IOException iOException) {
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, iOException);
        }
      }
      if (this.v != null)
        try {
          this.v.append(paramString).append('\n');
          this.v.flush();
        } catch (IOException iOException) {
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, iOException);
          this.v = null;
        }
    }
  }

  public boolean AInterfaceGolf() {
    return (this.t != null && this.t.k() == 3);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aK/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
