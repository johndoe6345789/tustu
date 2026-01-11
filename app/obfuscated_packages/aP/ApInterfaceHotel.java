package aP;

import G.R;
import G.T;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.awt.Window;

class ApInterfaceHotel extends Thread {
  String a = null;
  
  Window b = null;
  
  String c = null;
  
  private boolean e = true;
  
  public ApInterfaceHotel(f paramf, Window paramWindow, String paramString) {
    this(paramf, paramWindow, paramString, null);
    setDaemon(true);
  }
  
  public ApInterfaceHotel(f paramf, Window paramWindow, String paramString1, String paramString2) {
    super("ProjectOpenThread");
    this.b = paramWindow;
    this.a = paramString1;
    this.c = paramString2;
  }
  
  public void run() {
    try {
      dd.a().g().b(false);
      f.a(this.d, this.b, this.a, this.e);
      if (this.c != null) {
        R r = T.a().c();
        this.d.a(this.b, r, this.c);
      } 
    } catch (Exception exception) {
      if (exception instanceof W.aj) {
        D.b("Invalid Password for file: " + this.c);
      } else {
        D.a("Unexpected Error occured opening project.", exception, this.b);
      } 
    } catch (Error error) {
      error.printStackTrace();
      bV.d("There was a problem opening the project!\nError: " + error.getLocalizedMessage(), this.b);
    } finally {
      dd.a().g().b(true);
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */