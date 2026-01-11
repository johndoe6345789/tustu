package av;

import V.ExceptionPrintstacktrace;
import W.aa;
import W.aj;
import W.av;
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
      if (!aa.a(paramString)) {
        av av = new av();
        av.a(paramg.h(), paramString, null);
      } else {
        aa aa = new aa();
        aa.a(paramg.h(), paramString, null);
        try {
          String str = z.a(new File(paramString));
          paramg.h().e(str);
        } catch (Exception exception) {
          D.c("Failed to get signature from bigTune file: " + paramString);
        } 
      } 
      return paramg;
    } catch (ExceptionPrintstacktrace g1) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
      throw new V.a("Failed to set the data from:\n" + paramString);
    } catch (aj aj) {
      aj.printStackTrace();
      throw new V.a("Password Protected Tune File:\n" + paramString);
    } 
  }
  
  protected void b(String paramString, ExceptionPrintstacktrace paramg) {
    if (paramString.endsWith(IOProperties.w)) {
      av av = new av();
      try {
        av.a(paramString, paramg.h());
      } catch (IOException iOException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
        bV.d("Error Saving Tune.\n" + iOException.getMessage(), (Component)bq.a().b());
        return;
      } 
    } else {
      aa aa = new aa();
      try {
        aa.a(paramg.h(), paramString, new b(this), null);
      } catch (ExceptionPrintstacktrace g1) {
        bV.d(g1.getMessage(), (Component)bq.a().b());
      } catch (Exception exception) {
        String str = "Unhandled error occured saving tune.\nSee log for more detail";
        D.a(str, exception, bq.a().b());
      } 
    } 
    paramg.h().p().ExceptionPrintstacktrace();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */