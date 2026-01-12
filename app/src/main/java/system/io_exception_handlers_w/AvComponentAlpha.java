package IOExceptioninvpackageInWPackage;

import V.ExceptionPrintstacktrace;
import W.ExceptionExtension;
import W.IOExceptioninvpackageInWPackage;
import W.NetworkExceptionprintstacktrace;
import W.z;
import ao.bq;
import bH.D;
import com.efiAnalytics.ui.bV;
import h.IOProperties;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AvComponentAlpha {
  public ExceptionPrintstacktrace a(String paramString, ExceptionPrintstacktrace paramg) {
    try {
      if (!NetworkExceptionprintstacktrace.a(paramString)) {
        IOExceptioninvpackageInWPackage IOExceptioninvpackageInWPackage =
            new IOExceptioninvpackageInWPackage();
        IOExceptioninvpackageInWPackage.a(paramg.h(), paramString, null);
      } else {
        NetworkExceptionprintstacktrace NetworkExceptionprintstacktrace =
            new NetworkExceptionprintstacktrace();
        NetworkExceptionprintstacktrace.a(paramg.h(), paramString, null);
        try {
          String str = z.a(new File(paramString));
          paramg.h().e(str);
        } catch (Exception exception) {
          D.c("Failed to get signature from bigTune file: " + paramString);
        }
      }
      return paramg;
    } catch (ExceptionPrintstacktrace g1) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) g1);
      throw new V.a("Failed to set the data from:\n" + paramString);
    } catch (ExceptionExtension ExceptionExtension) {
      ExceptionExtension.printStackTrace();
      throw new V.a("Password Protected Tune File:\n" + paramString);
    }
  }

  protected void b(String paramString, ExceptionPrintstacktrace paramg) {
    if (paramString.endsWith(IOProperties.w)) {
      IOExceptioninvpackageInWPackage IOExceptioninvpackageInWPackage =
          new IOExceptioninvpackageInWPackage();
      try {
        IOExceptioninvpackageInWPackage.a(paramString, paramg.h());
      } catch (IOException iOException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, iOException);
        bV.d("Error Saving Tune.\n" + iOException.getMessage(), (Component) bq.a().b());
        return;
      }
    } else {
      NetworkExceptionprintstacktrace NetworkExceptionprintstacktrace =
          new NetworkExceptionprintstacktrace();
      try {
        NetworkExceptionprintstacktrace.a(paramg.h(), paramString, new b(this), null);
      } catch (ExceptionPrintstacktrace g1) {
        bV.d(g1.getMessage(), (Component) bq.a().b());
      } catch (Exception exception) {
        String str = "Unhandled error occured saving tune.\nSee log for more detail";
        D.a(str, exception, bq.a().b());
      }
    }
    paramg.h().p().ExceptionPrintstacktrace();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/IOExceptioninvpackageInWPackage/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
