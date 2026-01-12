package aV;

import A.AInterfaceIndia;
import A.ClassType;
import A.IO;
import B.AInterfaceIndia;
import B.BInterfaceBravo;
import B.BsInterfaceOscar;
import B.IOInBPackage;
import B.l;
import aB.BInterfaceBravo;
import aC.IOInBPackage;
import aD.IOInBPackage;
import bH.J;
import bS.BsInterfaceOscar;
import java.util.ArrayList;
import java.util.List;
import r.AInterfaceIndia;
import s.SComponentGolf;

public class AvInterfaceWhiskey implements AInterfaceIndia {
  private static AInterfaceIndia IOInBPackage = null;

  private List BInterfaceBravo = new ArrayList();

  private ClassType c = null;

  private AvInterfaceWhiskey() {
    if (AInterfaceIndia.IOInBPackage().IOInBPackage("fdsp[pp[ds';'")) {
      ClassType q1 = new ClassType();
      q1.IOInBPackage(IOInBPackage.d);
      q1.BInterfaceBravo(SComponentGolf.BInterfaceBravo("JSSC RS232"));
      q1.IOInBPackage(IOInBPackage.class);
      this.BInterfaceBravo.add(q1);
      this.c = q1;
    }
    if (AInterfaceIndia.IOInBPackage().IOInBPackage("LKFDS;LK;lkfs;lk")
        && (J.d() || J.BInterfaceBravo())) IOInBPackage.v = true;
    if (AInterfaceIndia.IOInBPackage().IOInBPackage("GD;';LFDS-0DSL;")) {
      ClassType q1 = new ClassType();
      q1.IOInBPackage(IOInBPackage.e);
      q1.BInterfaceBravo(
          SComponentGolf.BInterfaceBravo("Direct Bluetooth Connection via Bluecove"));
      q1.IOInBPackage(IOInBPackage.class);
      this.BInterfaceBravo.add(q1);
    }
    if (AInterfaceIndia.IOInBPackage().IOInBPackage(";'[PGS0P;'G0[F;") && !J.e()) {
      ClassType q1 = new ClassType();
      q1.IOInBPackage(BInterfaceBravo.c);
      q1.BInterfaceBravo(SComponentGolf.BInterfaceBravo("FTDI USB D2XX"));
      q1.IOInBPackage(BInterfaceBravo.class);
      this.BInterfaceBravo.add(q1);
      if (!J.d())
        ;
    }
    if (AInterfaceIndia.IOInBPackage().IOInBPackage("98fg54lklk")
        || AInterfaceIndia.IOInBPackage().IOInBPackage("HF-05[P54;'FD")
        || AInterfaceIndia.IOInBPackage().IOInBPackage("HF-0[PEPHF0H;LJGPO0")) {
      ClassType q1 = new ClassType();
      q1.IOInBPackage(BsInterfaceOscar.BInterfaceBravo);
      q1.BInterfaceBravo(SComponentGolf.BInterfaceBravo("UDP WiFi / Ethernet"));
      q1.IOInBPackage(BsInterfaceOscar.class);
      this.BInterfaceBravo.add(q1);
      q1 = new ClassType();
      q1.IOInBPackage(l.BInterfaceBravo);
      q1.BInterfaceBravo(SComponentGolf.BInterfaceBravo("TCP/IP - WiFi / Ethernet"));
      q1.IOInBPackage(l.class);
      this.BInterfaceBravo.add(q1);
      if (AInterfaceIndia.IOInBPackage().IOInBPackage("H;';'0FD;RE")) {
        q1 = new ClassType();
        q1.IOInBPackage(IOInBPackage.c);
        q1.BInterfaceBravo(SComponentGolf.BInterfaceBravo(IOInBPackage.c));
        q1.IOInBPackage(IOInBPackage.class);
        q1.IOInBPackage((AInterfaceIndia) BInterfaceBravo.c());
        this.BInterfaceBravo.add(q1);
      }
    } else if (AInterfaceIndia.IOInBPackage().IOInBPackage("LKFDS;LK;lkfs;lk")) {
      ClassType q1 = new ClassType();
      q1.IOInBPackage(l.BInterfaceBravo);
      q1.BInterfaceBravo(SComponentGolf.BInterfaceBravo("TCP/IP - WiFi / Ethernet"));
      q1.IOInBPackage(l.class);
      this.BInterfaceBravo.add(q1);
    }
    if (this.c == null && !this.BInterfaceBravo.isEmpty()) this.c = this.BInterfaceBravo.get(0);
  }

  public static AInterfaceIndia c() {
    if (IOInBPackage == null) IOInBPackage = new w();
    return IOInBPackage;
  }

  public static void IOInBPackage(AInterfaceIndia parami) {
    IOInBPackage = parami;
  }

  public List IOInBPackage() {
    return this.BInterfaceBravo;
  }

  public IO IOInBPackage(String paramString1, String paramString2) {
    for (ClassType q1 : this.BInterfaceBravo) {
      if (q1.IOInBPackage().equals(paramString1)) return q1.c(paramString2);
    }
    return null;
  }

  public IO IOInBPackage(String paramString1, AInterfaceIndia parami, String paramString2) {
    if (IOInBPackage(paramString1, parami))
      return IOInBPackage(IOInBPackage.c, parami, paramString2);
    for (ClassType q1 : this.BInterfaceBravo) {
      if (q1.IOInBPackage().equals(paramString1)) {
        IO IO = q1.c(paramString2);
        if (IO instanceof IOInBPackage) {
          IOInBPackage IOInBPackage = (IOInBPackage) IO;
          IOInBPackage.IOInBPackage(parami, paramString2);
        }
        return IO;
      }
    }
    return null;
  }

  public boolean IOInBPackage(String paramString, AInterfaceIndia parami) {
    return (parami != null
        && parami.AInterfaceIndia() != null
        && parami.AInterfaceIndia().equals(BsInterfaceOscar.IOInBPackage)
        && (paramString.equals(l.BInterfaceBravo)
            || paramString.equals(BsInterfaceOscar.BInterfaceBravo))
        && d());
  }

  public boolean d() {
    for (ClassType q1 : this.BInterfaceBravo) {
      if (q1.IOInBPackage().equals(IOInBPackage.c)) return true;
    }
    return false;
  }

  public ClassType BInterfaceBravo() {
    return this.c;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
