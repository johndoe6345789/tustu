package aV;

import A.AInterfaceIndia;
import A.ClassType;
import B.AInterfaceIndia;
import B.l;
import aB.IOInAbPackage;
import aC.IOInAcPackage;
import aD.IOInAcPackage;
import java.util.ArrayList;
import java.util.List;
import r.AInterfaceIndia;
import s.SComponentGolf;

public class AvInterfaceFoxtrot implements AInterfaceIndia {
  private static f IOInAbPackage = null;

  private List c = new ArrayList();

  ClassType IOInAcPackage = null;

  private AvInterfaceFoxtrot() {
    ClassType q1 = new ClassType();
    q1.IOInAcPackage(IOInAcPackage.d);
    q1.IOInAbPackage(
        SComponentGolf.IOInAbPackage(
            "RS232 Serial Communication or virtual communication using serial com port that are"
                + " already setup on this computer."));
    q1.IOInAcPackage(IOInAcPackage.class);
    this.c.add(q1);
    this.IOInAcPackage = q1;
    if (AInterfaceIndia.IOInAcPackage().IOInAcPackage("GD;';LFDS-0DSL;")) {
      q1 = new ClassType();
      q1.IOInAcPackage(IOInAcPackage.e);
      q1.IOInAbPackage(SComponentGolf.IOInAbPackage("Direct Bluetooth connection."));
      q1.IOInAcPackage(IOInAcPackage.class);
      this.c.add(q1);
    }
    if (AInterfaceIndia.IOInAcPackage().IOInAcPackage(";'[PGS0P;'G0[F;")) {
      q1 = new ClassType();
      q1.IOInAcPackage(IOInAbPackage.c);
      q1.IOInAbPackage(SComponentGolf.IOInAbPackage("FTDI D2XX Direct USB."));
      q1.IOInAcPackage(IOInAbPackage.class);
      this.c.add(q1);
    }
    if (AInterfaceIndia.IOInAcPackage().IOInAcPackage("LKFDS;LK;lkfs;lk")) {
      q1 = new ClassType();
      q1.IOInAcPackage(l.IOInAbPackage);
      q1.IOInAbPackage(SComponentGolf.IOInAbPackage("TCP/IP - WiFi / Ethernet"));
      q1.IOInAcPackage(l.class);
      this.c.add(q1);
    }
  }

  public static f c() {
    if (IOInAbPackage == null) IOInAbPackage = new f();
    return IOInAbPackage;
  }

  public List IOInAcPackage() {
    return this.c;
  }

  public A.f IOInAcPackage(String paramString1, String paramString2) {
    for (ClassType q1 : this.c) {
      if (q1.IOInAcPackage().equals(paramString1)) return q1.c(paramString2);
    }
    return null;
  }

  public A.f IOInAcPackage(String paramString1, AInterfaceIndia parami, String paramString2) {
    return IOInAcPackage(paramString1, paramString2);
  }

  public ClassType IOInAbPackage() {
    return this.IOInAcPackage;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
