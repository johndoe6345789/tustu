package aC;

import bH.D;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.ServiceRecord;

public abstract class DiscoveryListener implements DiscoveryListener {
  public void serviceSearchCompleted(int paramInt1, int paramInt2) {}

  public void servicesDiscovered(int paramInt, ServiceRecord[] paramArrayOfServiceRecord) {}

  public void inquiryCompleted(int paramInt) {
    D.c("Device Inquiry completed!");
    synchronized (b.a) {
      b.a.notifyAll();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aC/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
