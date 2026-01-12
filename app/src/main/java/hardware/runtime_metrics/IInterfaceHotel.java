package I;

import G.Exceptionprintstacktrace;
import G.GInterfaceAh;
import G.GInterfaceDb;
import G.ManagerUsingArrayList;
import G.c;
import G.k;
import bH.q;
import java.util.ArrayList;

public class IInterfaceHotel {
  public static String a = "gpsSpeedMPH";

  public static String b = "gpsSpeedKPH";

  public static String c = "gpsSpeed";

  public static String d = "gpsAltitude";

  public static String e = "gpsAltitudeFeet";

  public static String f = "latitude";

  public static String g = "longitude";

  public static String h = "gpsHeading";

  public static String i = "gpsAccuracy";

  public static String j = "gpsPositionX";

  public static String k = "gpsPositionY";

  public static String l = "gpsTime";

  public static String m = "GPS_Update";

  public static String n = "gpsActive";

  public static String o = "gpsUsingExternal";

  public static String p = "gpsUpdateRate";

  public static String q = "gpsSatellites";

  public static String r = "gpsHasFix";

  public static void a() {
    ManagerUsingArrayList.a().d(a);
    ManagerUsingArrayList.a().d(b);
    ManagerUsingArrayList.a().d(c);
    ManagerUsingArrayList.a().d(d);
    ManagerUsingArrayList.a().d(e);
    ManagerUsingArrayList.a().d(f);
    ManagerUsingArrayList.a().d(g);
    ManagerUsingArrayList.a().d(h);
    ManagerUsingArrayList.a().d(i);
    ManagerUsingArrayList.a().d(j);
    ManagerUsingArrayList.a().d(k);
    ManagerUsingArrayList.a().d(l);
    ManagerUsingArrayList.a().d(m);
    ManagerUsingArrayList.a().d(n);
    ManagerUsingArrayList.a().d(r);
    if (q.b()) ManagerUsingArrayList.a().d(o);
  }

  public static void a(ArrayList<GInterfaceAh> paramArrayList) {
    GInterfaceAh GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(a + "Gauge");
    GInterfaceAh.a(a);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(160.0D);
    GInterfaceAh.d(75.0D);
    GInterfaceAh.e(140.0D);
    GInterfaceAh.c(-1.0D);
    GInterfaceAh.h(-2.0D);
    GInterfaceAh.c("Speed");
    GInterfaceAh.b("MPH");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(b + "Gauge");
    GInterfaceAh.a(b);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(240.0D);
    GInterfaceAh.d(140.0D);
    GInterfaceAh.e(220.0D);
    GInterfaceAh.c(-1.0D);
    GInterfaceAh.h(-2.0D);
    GInterfaceAh.c("Speed");
    GInterfaceAh.b("KPH");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(d + "Gauge");
    GInterfaceAh.a(d);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(2000.0D);
    GInterfaceAh.d(5000.0D);
    GInterfaceAh.e(20000.0D);
    GInterfaceAh.c(-100.0D);
    GInterfaceAh.h(-200.0D);
    GInterfaceAh.c("Altitude");
    GInterfaceAh.b("m");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(e + "Gauge");
    GInterfaceAh.a(e);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(2000.0D);
    GInterfaceAh.d(5000.0D);
    GInterfaceAh.e(20000.0D);
    GInterfaceAh.c(-100.0D);
    GInterfaceAh.h(-200.0D);
    GInterfaceAh.c("Altitude");
    GInterfaceAh.b("ft");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(g + "Gauge");
    GInterfaceAh.a(g);
    GInterfaceAh.a(-180.0D);
    GInterfaceAh.b(180.0D);
    GInterfaceAh.d(5000.0D);
    GInterfaceAh.e(20000.0D);
    GInterfaceAh.c(-200.0D);
    GInterfaceAh.h(-200.0D);
    GInterfaceAh.c("Longitude");
    GInterfaceAh.b("°");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(7.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(f + "Gauge");
    GInterfaceAh.a(f);
    GInterfaceAh.a(-90.0D);
    GInterfaceAh.b(90.0D);
    GInterfaceAh.d(5000.0D);
    GInterfaceAh.e(20000.0D);
    GInterfaceAh.c(-200.0D);
    GInterfaceAh.h(-200.0D);
    GInterfaceAh.c("Latitude");
    GInterfaceAh.b("°");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(7.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(h + "Gauge");
    GInterfaceAh.a(h);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(360.0D);
    GInterfaceAh.d(5000.0D);
    GInterfaceAh.e(20000.0D);
    GInterfaceAh.c(-200.0D);
    GInterfaceAh.h(-200.0D);
    GInterfaceAh.c("GPS Bearing");
    GInterfaceAh.b("°");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(i + "Gauge");
    GInterfaceAh.a(i);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(360.0D);
    GInterfaceAh.d(40.0D);
    GInterfaceAh.e(100.0D);
    GInterfaceAh.c(-200.0D);
    GInterfaceAh.h(-200.0D);
    GInterfaceAh.c("GPS Accuracy");
    GInterfaceAh.b("m");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(j + "Gauge");
    GInterfaceAh.a(j);
    GInterfaceAh.a(-10000.0D);
    GInterfaceAh.b(10000.0D);
    GInterfaceAh.d(Double.MAX_VALUE);
    GInterfaceAh.e(Double.MAX_VALUE);
    GInterfaceAh.c(Double.MIN_VALUE);
    GInterfaceAh.h(Double.MIN_VALUE);
    GInterfaceAh.c("GPS Position X");
    GInterfaceAh.b("m");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(k + "Gauge");
    GInterfaceAh.a(k);
    GInterfaceAh.a(-10000.0D);
    GInterfaceAh.b(10000.0D);
    GInterfaceAh.d(Double.MAX_VALUE);
    GInterfaceAh.e(Double.MAX_VALUE);
    GInterfaceAh.c(Double.MIN_VALUE);
    GInterfaceAh.h(Double.MIN_VALUE);
    GInterfaceAh.c("GPS Position Y");
    GInterfaceAh.b("m");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(l + "Gauge");
    GInterfaceAh.a(l);
    GInterfaceAh.a(1.3E12D);
    GInterfaceAh.b(1.4E12D);
    GInterfaceAh.d(Double.MAX_VALUE);
    GInterfaceAh.e(Double.MAX_VALUE);
    GInterfaceAh.c(Double.MIN_VALUE);
    GInterfaceAh.h(Double.MIN_VALUE);
    GInterfaceAh.c("GPS Time");
    GInterfaceAh.b("ms");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(p + "Gauge");
    GInterfaceAh.a(p);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(20.0D);
    GInterfaceAh.d(Double.MAX_VALUE);
    GInterfaceAh.e(Double.MAX_VALUE);
    GInterfaceAh.c(Double.MIN_VALUE);
    GInterfaceAh.h(Double.MIN_VALUE);
    GInterfaceAh.c("GPS Update Rate");
    GInterfaceAh.b("/s");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(1.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
    GInterfaceAh = new GInterfaceAh();
    GInterfaceAh.v(q + "Gauge");
    GInterfaceAh.a(q);
    GInterfaceAh.a(0.0D);
    GInterfaceAh.b(20.0D);
    GInterfaceAh.d(Double.MAX_VALUE);
    GInterfaceAh.e(Double.MAX_VALUE);
    GInterfaceAh.c(Double.MIN_VALUE);
    GInterfaceAh.h(Double.MIN_VALUE);
    GInterfaceAh.c("GPS Satellites");
    GInterfaceAh.b("#");
    GInterfaceAh.g(0.0D);
    GInterfaceAh.f(0.0D);
    GInterfaceAh.d("GPS");
    paramArrayList.add(GInterfaceAh);
  }

  public static void b(ArrayList<Exceptionprintstacktrace> paramArrayList) {
    Exceptionprintstacktrace Exceptionprintstacktrace = new Exceptionprintstacktrace();
    Exceptionprintstacktrace.v("gpsUpdate");
    Exceptionprintstacktrace.a((GInterfaceDb) new c("GPS Update"));
    Exceptionprintstacktrace.b((GInterfaceDb) new c(""));
    Exceptionprintstacktrace.a(k.s);
    Exceptionprintstacktrace.b(k.A);
    Exceptionprintstacktrace.c(k.i);
    Exceptionprintstacktrace.d(k.c);
    Exceptionprintstacktrace.a(m);
    paramArrayList.add(Exceptionprintstacktrace);
    Exceptionprintstacktrace = new Exceptionprintstacktrace();
    Exceptionprintstacktrace.v("gpsActive");
    Exceptionprintstacktrace.a((GInterfaceDb) new c("GPS Active"));
    Exceptionprintstacktrace.b((GInterfaceDb) new c("GPS Not Active"));
    Exceptionprintstacktrace.a(k.s);
    Exceptionprintstacktrace.b(k.a);
    Exceptionprintstacktrace.c(k.i);
    Exceptionprintstacktrace.d(k.c);
    Exceptionprintstacktrace.a(n);
    paramArrayList.add(Exceptionprintstacktrace);
    Exceptionprintstacktrace = new Exceptionprintstacktrace();
    Exceptionprintstacktrace.v("gpsHasFix");
    Exceptionprintstacktrace.a((GInterfaceDb) new c("GPS Fix"));
    Exceptionprintstacktrace.b((GInterfaceDb) new c("GPS Fix"));
    Exceptionprintstacktrace.a(k.s);
    Exceptionprintstacktrace.b(k.a);
    Exceptionprintstacktrace.c(k.i);
    Exceptionprintstacktrace.d(k.c);
    Exceptionprintstacktrace.a(r);
    paramArrayList.add(Exceptionprintstacktrace);
    if (q.b()) {
      Exceptionprintstacktrace = new Exceptionprintstacktrace();
      Exceptionprintstacktrace.v("gpsuseingExternal");
      Exceptionprintstacktrace.a((GInterfaceDb) new c("External GPS"));
      Exceptionprintstacktrace.b((GInterfaceDb) new c("Internal GPS"));
      Exceptionprintstacktrace.a(k.s);
      Exceptionprintstacktrace.b(k.a);
      Exceptionprintstacktrace.c(k.i);
      Exceptionprintstacktrace.d(k.c);
      Exceptionprintstacktrace.a(o);
      paramArrayList.add(Exceptionprintstacktrace);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
