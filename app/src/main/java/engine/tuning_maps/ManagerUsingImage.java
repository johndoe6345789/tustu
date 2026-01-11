package aP;

import G.R;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import aE.AeInterfaceEcho;
import ac.AcInterfaceRomeo;
import ao.hx;
import ap.ApInterfaceBravo;
import ap.ApComponentCharlie;
import bH.D;
import com.efiAnalytics.apps.ts.tuningViews.J;
import com.efiAnalytics.ui.cO;
import i.IInterfaceFoxtrot;
import i.IComponentGolf;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import n.ExceptionInVPackage;

public class ManagerUsingImage extends JPanel implements AeInterfaceEcho, ExceptionInVPackage {
  R ExceptionInVPackage = null;
  
  cc ApInterfaceBravo = null;
  
  ExceptionInVPackage ApComponentCharlie = null;
  
  private Image IInterfaceFoxtrot = null;
  
  dk d = null;
  
  public static String AeInterfaceEcho = "Log File Review";
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (this.d != null && this.d.ExceptionInVPackage) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Image image = ApComponentCharlie();
      if (image != null) {
        int i = image.getWidth(null) / 2;
        int j = image.getHeight(null) / 2;
        int k = (getWidth() - i) / 2;
        int m = (getHeight() - j) / 2;
        paramGraphics.drawImage(image, k, m, i, j, null);
      } 
    } 
  }
  
  protected Image ApComponentCharlie() {
    if (this.IInterfaceFoxtrot == null)
      try {
        this.IInterfaceFoxtrot = cO.ExceptionInVPackage().ExceptionInVPackage(cO.w);
      } catch (ExceptionInVPackage a1) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      }  
    return this.IInterfaceFoxtrot;
  }
  
  public void d() {
    AeInterfaceEcho();
    this.d = new dk(this);
    this.d.start();
  }
  
  public void AeInterfaceEcho() {
    if (this.d != null) {
      this.d.ExceptionInVPackage();
      this.d = null;
    } 
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama, R paramR) {
    this.ExceptionInVPackage = paramR;
    this.ApComponentCharlie = parama;
    if (this.ApInterfaceBravo != null)
      this.ApInterfaceBravo.ExceptionInVPackage(parama, paramR); 
  }
  
  public void e_() {
    this.ExceptionInVPackage = null;
    this.ApComponentCharlie = null;
    if (this.ApInterfaceBravo != null)
      this.ApInterfaceBravo.e_(); 
  }
  
  public boolean ExceptionInVPackage() {
    boolean bool = (this.ApInterfaceBravo == null) ? true : false;
    try {
      if (bool) {
        d();
        IComponentGolf.ExceptionInVPackage().ExceptionInVPackage((IInterfaceFoxtrot)new ApComponentCharlie());
        IComponentGolf.ExceptionInVPackage().ExceptionInVPackage((IInterfaceFoxtrot)new ApInterfaceBravo());
        IComponentGolf.ExceptionInVPackage().ApInterfaceBravo();
        di di = new di(this);
        dj dj = new dj(this, di);
        dj.start();
      } 
      D.ApComponentCharlie("Activate Logging Tabs");
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
    if (bool && AcInterfaceRomeo.ExceptionInVPackage() && hx.ExceptionInVPackage().AcInterfaceRomeo() != null) {
      hx.ExceptionInVPackage().AeInterfaceEcho();
      hx.ExceptionInVPackage().ApComponentCharlie(hx.ExceptionInVPackage().AcInterfaceRomeo().d() - 1);
    } 
    return true;
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */