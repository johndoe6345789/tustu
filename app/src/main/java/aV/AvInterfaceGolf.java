package aV;

import ac.AcInterfaceDelta;
import ac.AbstractInAcPackage;
import java.util.ArrayList;
import java.util.List;

public class AvInterfaceGolf {
  private static List a = new ArrayList();
  
  public static List a() {
    float f = 3.0F;
    ArrayList<AcInterfaceDelta> arrayList = new ArrayList();
    AcInterfaceDelta d = new AcInterfaceDelta();
    d.a(new h());
    d.a("KPH");
    d.b("kph");
    d.b((byte)1);
    d.a(0.1F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new o());
    d.a("MPH");
    d.b("mph");
    d.b((byte)1);
    d.a(0.1F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new p());
    d.a("Speed");
    d.b("m/AbstractInAcPackage");
    d.b((byte)1);
    d.a(0.1F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new q());
    d.a("Altitude");
    d.b("m");
    d.b((byte)1);
    d.a(0.1F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new r());
    d.a("Latitude");
    d.b("");
    d.b((byte)8);
    d.a(1.0E-7F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new AbstractInAcPackage());
    d.a("Longitude");
    d.b("");
    d.b((byte)8);
    d.a(1.0E-7F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new t());
    d.a("Heading");
    d.b("°");
    d.b((byte)1);
    d.a(0.1F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new u());
    d.a("Accuracy");
    d.b("m");
    d.b((byte)2);
    d.a(0.01F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new v());
    d.a("GPS.PositionX");
    d.b("m");
    d.b((byte)1);
    d.a(0.1F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new i());
    d.a("GPS.PositionY");
    d.b("m");
    d.b((byte)1);
    d.a(0.1F);
    d.b(0.0F);
    arrayList.add(d);
    if (f >= 2.1D) {
      d = new AcInterfaceDelta();
      d.a(new j());
      d.a("GPS_Time");
      d.a(AbstractInAcPackage.g);
      d.b("ms");
      d.b((byte)0);
      d.a(1.0F);
      d.b(0.0F);
      arrayList.add(d);
    } 
    d = new AcInterfaceDelta();
    d.a(new k());
    d.a("GPS_Update");
    d.b("");
    d.b((byte)0);
    d.a(1.0F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new l());
    d.a("GPS_HasFix");
    d.b("");
    d.b((byte)0);
    d.a(1.0F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new m());
    d.a("GPS.UpdateRate");
    d.b("/AbstractInAcPackage");
    d.b((byte)1);
    d.a(1.0F);
    d.b(0.0F);
    arrayList.add(d);
    d = new AcInterfaceDelta();
    d.a(new n());
    d.a("GPS.SatelliteCount");
    d.b("");
    d.b((byte)0);
    d.a(1.0F);
    d.b(0.0F);
    arrayList.add(d);
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */