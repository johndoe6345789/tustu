package I;

import G.ah;
import G.ak;
import G.c;
import G.cu;
import G.db;
import G.k;
import bH.q;
import java.util.ArrayList;

public class h {
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
    cu.a().d(a);
    cu.a().d(b);
    cu.a().d(c);
    cu.a().d(d);
    cu.a().d(e);
    cu.a().d(f);
    cu.a().d(g);
    cu.a().d(h);
    cu.a().d(i);
    cu.a().d(j);
    cu.a().d(k);
    cu.a().d(l);
    cu.a().d(m);
    cu.a().d(n);
    cu.a().d(r);
    if (q.b())
      cu.a().d(o); 
  }
  
  public static void a(ArrayList<ah> paramArrayList) {
    ah ah = new ah();
    ah.v(a + "Gauge");
    ah.a(a);
    ah.a(0.0D);
    ah.b(160.0D);
    ah.d(75.0D);
    ah.e(140.0D);
    ah.c(-1.0D);
    ah.h(-2.0D);
    ah.c("Speed");
    ah.b("MPH");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(b + "Gauge");
    ah.a(b);
    ah.a(0.0D);
    ah.b(240.0D);
    ah.d(140.0D);
    ah.e(220.0D);
    ah.c(-1.0D);
    ah.h(-2.0D);
    ah.c("Speed");
    ah.b("KPH");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(d + "Gauge");
    ah.a(d);
    ah.a(0.0D);
    ah.b(2000.0D);
    ah.d(5000.0D);
    ah.e(20000.0D);
    ah.c(-100.0D);
    ah.h(-200.0D);
    ah.c("Altitude");
    ah.b("m");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(e + "Gauge");
    ah.a(e);
    ah.a(0.0D);
    ah.b(2000.0D);
    ah.d(5000.0D);
    ah.e(20000.0D);
    ah.c(-100.0D);
    ah.h(-200.0D);
    ah.c("Altitude");
    ah.b("ft");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(g + "Gauge");
    ah.a(g);
    ah.a(-180.0D);
    ah.b(180.0D);
    ah.d(5000.0D);
    ah.e(20000.0D);
    ah.c(-200.0D);
    ah.h(-200.0D);
    ah.c("Longitude");
    ah.b("°");
    ah.g(0.0D);
    ah.f(7.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(f + "Gauge");
    ah.a(f);
    ah.a(-90.0D);
    ah.b(90.0D);
    ah.d(5000.0D);
    ah.e(20000.0D);
    ah.c(-200.0D);
    ah.h(-200.0D);
    ah.c("Latitude");
    ah.b("°");
    ah.g(0.0D);
    ah.f(7.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(h + "Gauge");
    ah.a(h);
    ah.a(0.0D);
    ah.b(360.0D);
    ah.d(5000.0D);
    ah.e(20000.0D);
    ah.c(-200.0D);
    ah.h(-200.0D);
    ah.c("GPS Bearing");
    ah.b("°");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(i + "Gauge");
    ah.a(i);
    ah.a(0.0D);
    ah.b(360.0D);
    ah.d(40.0D);
    ah.e(100.0D);
    ah.c(-200.0D);
    ah.h(-200.0D);
    ah.c("GPS Accuracy");
    ah.b("m");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(j + "Gauge");
    ah.a(j);
    ah.a(-10000.0D);
    ah.b(10000.0D);
    ah.d(Double.MAX_VALUE);
    ah.e(Double.MAX_VALUE);
    ah.c(Double.MIN_VALUE);
    ah.h(Double.MIN_VALUE);
    ah.c("GPS Position X");
    ah.b("m");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(k + "Gauge");
    ah.a(k);
    ah.a(-10000.0D);
    ah.b(10000.0D);
    ah.d(Double.MAX_VALUE);
    ah.e(Double.MAX_VALUE);
    ah.c(Double.MIN_VALUE);
    ah.h(Double.MIN_VALUE);
    ah.c("GPS Position Y");
    ah.b("m");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(l + "Gauge");
    ah.a(l);
    ah.a(1.3E12D);
    ah.b(1.4E12D);
    ah.d(Double.MAX_VALUE);
    ah.e(Double.MAX_VALUE);
    ah.c(Double.MIN_VALUE);
    ah.h(Double.MIN_VALUE);
    ah.c("GPS Time");
    ah.b("ms");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(p + "Gauge");
    ah.a(p);
    ah.a(0.0D);
    ah.b(20.0D);
    ah.d(Double.MAX_VALUE);
    ah.e(Double.MAX_VALUE);
    ah.c(Double.MIN_VALUE);
    ah.h(Double.MIN_VALUE);
    ah.c("GPS Update Rate");
    ah.b("/s");
    ah.g(0.0D);
    ah.f(1.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
    ah = new ah();
    ah.v(q + "Gauge");
    ah.a(q);
    ah.a(0.0D);
    ah.b(20.0D);
    ah.d(Double.MAX_VALUE);
    ah.e(Double.MAX_VALUE);
    ah.c(Double.MIN_VALUE);
    ah.h(Double.MIN_VALUE);
    ah.c("GPS Satellites");
    ah.b("#");
    ah.g(0.0D);
    ah.f(0.0D);
    ah.d("GPS");
    paramArrayList.add(ah);
  }
  
  public static void b(ArrayList<ak> paramArrayList) {
    ak ak = new ak();
    ak.v("gpsUpdate");
    ak.a((db)new c("GPS Update"));
    ak.b((db)new c(""));
    ak.a(k.s);
    ak.b(k.A);
    ak.c(k.i);
    ak.d(k.c);
    ak.a(m);
    paramArrayList.add(ak);
    ak = new ak();
    ak.v("gpsActive");
    ak.a((db)new c("GPS Active"));
    ak.b((db)new c("GPS Not Active"));
    ak.a(k.s);
    ak.b(k.a);
    ak.c(k.i);
    ak.d(k.c);
    ak.a(n);
    paramArrayList.add(ak);
    ak = new ak();
    ak.v("gpsHasFix");
    ak.a((db)new c("GPS Fix"));
    ak.b((db)new c("GPS Fix"));
    ak.a(k.s);
    ak.b(k.a);
    ak.c(k.i);
    ak.d(k.c);
    ak.a(r);
    paramArrayList.add(ak);
    if (q.b()) {
      ak = new ak();
      ak.v("gpsuseingExternal");
      ak.a((db)new c("External GPS"));
      ak.b((db)new c("Internal GPS"));
      ak.a(k.s);
      ak.b(k.a);
      ak.c(k.i);
      ak.d(k.c);
      ak.a(o);
      paramArrayList.add(ak);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */