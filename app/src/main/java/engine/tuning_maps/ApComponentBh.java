package aP;

import A.AInterfaceXray;
import A.IO;
import A.Threaded;
import aC.AcInterfaceBravo;
import aC.IOInAcPackage;
import aV.AvInterfaceWhiskey;
import bH.D;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.RemoteDevice;
import s.SComponentGolf;

class ApComponentBh extends Thread {
  List IOInAcPackage;

  ApComponentBh(aY paramaY, List paramList) {
    this.IOInAcPackage = paramList;
  }

  public void run() {
    try {
      Threaded.IOInAcPackage().c();
      Threaded.IOInAcPackage().c("Scanning for unpaired EFI Analytics Bluetooth Adapters");
      D.d("Searching for unpaired devices.");
      List list = AcInterfaceBravo.c();
      if (!list.isEmpty()) {
        D.d("Found " + list.size() + " unpaired devices.");
        try {
          AInterfaceXray AInterfaceXray = new AInterfaceXray();
          IOInAcPackage IOInAcPackage =
              (IOInAcPackage)
                  AvInterfaceWhiskey.c().IOInAcPackage(IOInAcPackage.e, "DEFAULT_INSTANCE");
          AInterfaceXray.IOInAcPackage((IO) IOInAcPackage);
          for (RemoteDevice remoteDevice : list) {
            this.AcInterfaceBravo.e.setText(
                SComponentGolf.AcInterfaceBravo("Attempting to Pair with")
                    + " "
                    + AcInterfaceBravo.IOInAcPackage(remoteDevice));
            boolean bool = AcInterfaceBravo.IOInAcPackage(remoteDevice, "1234");
            if (bool) {
              D.d(
                  "Successfully paired with "
                      + AcInterfaceBravo.IOInAcPackage(remoteDevice)
                      + ", adding to search list");
              AInterfaceXray.IOInAcPackage("Bluetooth Device", remoteDevice.getBluetoothAddress());
              this.AcInterfaceBravo.e.setText(
                  SComponentGolf.AcInterfaceBravo("Successfully Paired with ")
                      + AcInterfaceBravo.IOInAcPackage(remoteDevice));
              continue;
            }
            D.d("Failed to pair with " + AcInterfaceBravo.IOInAcPackage(remoteDevice));
            this.AcInterfaceBravo.e.setText(
                SComponentGolf.AcInterfaceBravo("Failed to Pair with")
                    + " "
                    + AcInterfaceBravo.IOInAcPackage(remoteDevice));
          }
          IOInAcPackage.t();
          this.IOInAcPackage.add(AInterfaceXray);
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(aY.class.getName())
              .log(Level.SEVERE, (String) null, instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(aY.class.getName())
              .log(Level.SEVERE, (String) null, illegalAccessException);
        }
      } else {
        D.d("Found no unpaired devices.");
      }
    } finally {
      aY.IOInAcPackage(this.AcInterfaceBravo, (bh) null);
      Threaded.IOInAcPackage().d();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
