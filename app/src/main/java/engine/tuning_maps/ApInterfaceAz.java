package aP;

import G.AeInterfaceMikeTostring;
import java.util.List;

class ApInterfaceAz extends Thread {
  String a;

  String b;

  List c;

  AeInterfaceMikeTostring d;

  ApInterfaceAz(
      au paramau,
      String paramString1,
      String paramString2,
      List paramList,
      AeInterfaceMikeTostring parambT) {
    super("AsyncDeviceFound");
    setDaemon(true);
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramList;
    this.d = parambT;
  }

  public void run() {
    this.e.b(this.a, this.b, this.c, this.d);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
