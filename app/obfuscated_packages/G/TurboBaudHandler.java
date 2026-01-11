package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TurboBaudHandler {
  public static void a(R paramR) {
    J j = paramR.C();
    F f = paramR.O();
    if (f.Q() != null && j.p() && !f.W()) {
      dc dc = new dc();
      m m = m.d(f);
      m.a(30);
      m.v("Turbo Active 1");
      m.a(true);
      o o = dc.a(paramR, m, 650);
      if (o.a() == 1) {
        int i = (int)f.S().a();
        j.ExceptionPrintstacktrace(true);
        a(50);
        try {
          if (j.a(i)) {
            f.i(true);
            D.d("TurboBaud Activated");
            a(550);
            m.v("Turbo Active 2");
            m.i(10);
            m.a(true);
            o = dc.a(paramR, m, 650);
            a(10);
            m.v("Turbo Active 3");
            o = dc.a(paramR, m, 650);
            a(10);
            if (o.a() != 1) {
              int k = f.r();
              if (j.a(k)) {
                f.i(false);
                D.d("Turbo Baud Change Failed, reverted to standard baud: " + k);
              } else {
                D.d("Turbo Baud Change Failed, Failed to revert to standard baud");
              } 
            } 
          } else {
            throw new ExceptionPrintstacktrace("Controller Turbo Activated, failed to change application Baud!\nYou will need to power cycle the controller to reconnect");
          } 
        } finally {
          j.ExceptionPrintstacktrace(false);
        } 
      } else {
        throw new ExceptionPrintstacktrace("Controller Turbo failed to Activate!\nYou may need to power cycle the controller to reconnect. \n" + o.c());
      } 
    } else if (f.Q() == null) {
      D.d("No turboBaudOnCommand, Turbo Baud disabled. ");
    } 
  }
  
  private static void a(int paramInt) {
    try {
      Thread.sleep(paramInt);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(dh.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
  
  public static void b(R paramR) {
    J j = paramR.C();
    F f = paramR.O();
    if (f.R() != null && j.p() && f.W()) {
      dc dc = new dc();
      m m = m.e(f);
      m.a(true);
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
            throw new ExceptionPrintstacktrace("Controller Turbo Dectivated, failed to change application Baud!\nYou will need to reload project to reconnect.");
          } 
        } finally {
          j.ExceptionPrintstacktrace(false);
        } 
      } else {
        throw new ExceptionPrintstacktrace("Controller Turbo failed to Deactivate!");
      } 
    } else {
      if (f.W() && f.Q() == null)
        throw new ExceptionPrintstacktrace("No turboBaudOffCommand defined! Cannot disable Turbo"); 
      if (f.Q() == null)
        D.d("No turboBaudOffCommand, Turbo Baud disabled. "); 
    } 
  }
  
  public static void c(R paramR) {
    J j = paramR.C();
    F f = paramR.O();
    if (f.Q() != null && j.p() && f.W()) {
      dc dc = new dc();
      m m = m.d(f);
      m.v("Turbo Baud Ping");
      m.a(true);
      m.b(1);
      m.i(5);
      o o = dc.a(paramR, m, 50);
      if (o.a() != 1)
        D.b("Turbo ping not successful: " + o.c()); 
    } else if (f.Q() == null) {
      D.d("No turboBaudOnCommand, Turbo Baud disabled. ");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */