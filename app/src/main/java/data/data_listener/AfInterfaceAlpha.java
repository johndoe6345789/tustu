package aF;

import G.AeInterfaceMikeTostring;
import G.GInterfaceAg;
import G.R;
import G.SerializableExtension;
import G.SerializableImpl;
import G.l;
import V.ExceptionPrintstacktrace;
import bH.D;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import z.SerialPortEventListenerUsingRXTXCommDriver;

public class AfInterfaceAlpha implements SerializableExtension, GInterfaceAg {
  R a = null;

  SerializableImpl b = null;

  int c = -1;

  int d = 0;

  int SerialPortEventListenerUsingRXTXCommDriver = 0;

  int f = 100;

  public AfInterfaceAlpha(R paramR) {
    this.a = paramR;
    this.b = paramR.ExceptionPrintstacktrace("secl");
    if (this.b == null) D.d("No secl OutputChannel, och sync monitor disabled.");
  }

  public boolean a(String paramString, byte[] paramArrayOfbyte) {
    if (!paramString.equals(this.a.c())) return true;
    try {
      if (this.b == null) return true;
      int i = (int) this.b.b(paramArrayOfbyte) % 256;
      if (this.c == -1) {
        this.c = a() - i;
        return true;
      }
      int j = a(this.c);
      int k = Math.abs(i - j);
      if (k > 2 && k < 254) {
        D.c("expected secl =" + j + ", secl = " + i + ", secDelta = " + k);
        this.d++;
        this.SerialPortEventListenerUsingRXTXCommDriver = 0;
        if (this.d > 1) this.c = -1;
        if (i > 1 && this.d == 1) {
          if (this.a.C() instanceof SerialPortEventListenerUsingRXTXCommDriver)
            ((SerialPortEventListenerUsingRXTXCommDriver) this.a.C()).l();
          int n = this.a.O().z() + 1;
          this.a.O().s(n);
          int i1 = this.a.O().t() + 2;
          this.a.O().q(i1);
          D.c(
              "Detected Bad och read on "
                  + paramString
                  + ", increased delay to "
                  + i1
                  + ", increase extra wait between to "
                  + n
                  + ", secl = "
                  + i);
        } else if (this.d > 5) {
          D.b("Och read corrupt with failure count of " + this.d + ", restarting comms.");
          this.a.C().c();
          if (this.a.C() instanceof SerialPortEventListenerUsingRXTXCommDriver)
            ((SerialPortEventListenerUsingRXTXCommDriver) this.a.C()).l();
          try {
            this.a.C().d();
          } catch (l l) {
            D.a("Failed to go online");
          }
        } else {
          D.c("Reset " + paramString + ", secl = " + i + ", expectedSecl=" + j + ", secDelta=" + k);
          this.c = a() - i;
        }
        Toolkit.getDefaultToolkit().beep();
        return false;
      }
      this.d = 0;
      this.SerialPortEventListenerUsingRXTXCommDriver++;
      int m = this.a.O().aw();
      if (this.SerialPortEventListenerUsingRXTXCommDriver % this.f == 0
          && this.a.O().F(m) < this.a.O().t()) {
        int n = (this.a.O().z() > 0) ? (this.a.O().z() - 1) : this.a.O().z();
        this.a.O().s(n);
        int i1 = this.a.O().t() - 2;
        this.a.O().q(i1);
        D.c(
            this.f
                + " good och reads, decreased delay to "
                + i1
                + ", set extra wait between to "
                + n);
      }
      if (i < 255 && j < 255) this.c = a() - i;
      return true;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(a.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      return true;
    }
  }

  private int a() {
    return (int) (System.currentTimeMillis() / 1000L) % 256;
  }

  private int a(int paramInt) {
    return (a() + 255 - paramInt) % 256;
  }

  public boolean a(String paramString, AeInterfaceMikeTostring parambT) {
    if (paramString.equals(this.a.c())) {
      this.c = -1;
      this.a.O().s(0);
    }
    return true;
  }

  public void a(String paramString) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aF/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
