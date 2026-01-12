package G;

import V.ExceptionPrintstacktrace;
import bH.D;

public class GInterfaceDh {
  public static void a(R paramR) {
    J j = paramR.C();
    F f = paramR.O();
    if (f.Q() != null && j.p() && !f.W()) {
      dc dc = new dc();
      m m = m.d(f);
      o o = dc.a(paramR, m, 2000);
      if (o.a() == 1) {
        int i = (int) f.S().a();
        j.ExceptionPrintstacktrace(true);
        try {
          if (j.a(i)) {
            f.i(true);
            D.d("TurboBaud Activated");
          } else {
            throw new ExceptionPrintstacktrace(
                "Controller Turbo Activated, failed to change application Baud!\n"
                    + "You will need to power cycle the controller to reconnect");
          }
        } finally {
          j.ExceptionPrintstacktrace(false);
        }
      } else {
        D.b("Error reported when activating turbo baud: " + o.c());
      }
    } else if (f.Q() == null) {
      D.d("No turboBaudOnCommand, Turbo Baud disabled. ");
    }
    if (f.Q() != null && paramR.ai()) {
      dc dc = new dc();
      m m = m.b(f);
      o o = dc.a(paramR, m, 2000);
      if (o.a() == 1) D.d("Server Turbo Baud Activate sent.");
    }
  }

  public static void b(R paramR) {
    J j = paramR.C();
    F f = paramR.O();
    if (f.R() != null && j.p() && f.W()) {
      dc dc = new dc();
      m m = m.e(f);
      o o = dc.a(paramR, m, 2000);
      if (o.a() == 1) {
        int i = f.r();
        j.ExceptionPrintstacktrace(true);
        try {
          if (j.a(i)) {
            f.i(false);
            j.ExceptionPrintstacktrace(false);
            D.d("TurboBaud Deactivated");
          } else {
            j.ExceptionPrintstacktrace(false);
            throw new ExceptionPrintstacktrace(
                "Controller Turbo Dectivated, failed to change application Baud!\n"
                    + "You will need to reload project to reconnect.");
          }
        } finally {
          j.ExceptionPrintstacktrace(false);
        }
      } else {
        D.b("Error deactivating Turbo Baud: " + o.c());
      }
    } else {
      if (f.W() && f.Q() == null)
        throw new ExceptionPrintstacktrace("No turboBaudOffCommand defined! Cannot disable Turbo");
      if (f.Q() == null) D.d("No turboBaudOffCommand, Turbo Baud disabled. ");
    }
    if (f.Q() != null && paramR.ai()) {
      dc dc = new dc();
      m m = m.c(f);
      o o = dc.a(paramR, m, 2000);
      if (o.a() == 1) D.d("Server Turbo Baud Deactivate sent.");
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
