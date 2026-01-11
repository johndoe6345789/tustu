package aP;

import A.f;
import A.j;
import A.x;
import aC.a;
import aC.b;
import aV.w;
import bH.D;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.RemoteDevice;
import s.g;

class bh extends Thread {
  List a;
  
  bh(aY paramaY, List paramList) {
    this.a = paramList;
  }
  
  public void run() {
    try {
      j.a().c();
      j.a().c("Scanning for unpaired EFI Analytics Bluetooth Adapters");
      D.d("Searching for unpaired devices.");
      List list = b.c();
      if (!list.isEmpty()) {
        D.d("Found " + list.size() + " unpaired devices.");
        try {
          x x = new x();
          a a = (a)w.c().a(a.e, "DEFAULT_INSTANCE");
          x.a((f)a);
          for (RemoteDevice remoteDevice : list) {
            this.b.e.setText(g.b("Attempting to Pair with") + " " + b.a(remoteDevice));
            boolean bool = b.a(remoteDevice, "1234");
            if (bool) {
              D.d("Successfully paired with " + b.a(remoteDevice) + ", adding to search list");
              x.a("Bluetooth Device", remoteDevice.getBluetoothAddress());
              this.b.e.setText(g.b("Successfully Paired with ") + b.a(remoteDevice));
              continue;
            } 
            D.d("Failed to pair with " + b.a(remoteDevice));
            this.b.e.setText(g.b("Failed to Pair with") + " " + b.a(remoteDevice));
          } 
          a.t();
          this.a.add(x);
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(aY.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(aY.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
        } 
      } else {
        D.d("Found no unpaired devices.");
      } 
    } finally {
      aY.a(this.b, (bh)null);
      j.a().d();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */