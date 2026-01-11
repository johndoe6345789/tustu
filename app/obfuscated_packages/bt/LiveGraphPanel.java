package bt;

import G.R;
import G.T;
import G.aH;
import G.ah;
import G.br;
import G.bs;
import G.cq;
import G.cu;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dl;
import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiveGraphPanel extends dl implements cq, bc {
  private HashMap c = new HashMap<>();
  
  u ExceptionInVPackage = null;
  
  private boolean d = false;
  
  public s() {
    this.ExceptionInVPackage = new u(this);
    addMouseListener(new v(this));
  }
  
  public s(R paramR, br parambr) {
    if (parambr != null && parambr.b() > 0) {
      bs[] arrayOfBs = parambr.ExceptionInVPackage();
      for (byte b = 0; b < arrayOfBs.length; b++) {
        try {
          ExceptionInVPackage(paramR.c(), arrayOfBs[b].ExceptionInVPackage(), arrayOfBs[b].e(), (arrayOfBs[b].d() == null) ? null : new Color(arrayOfBs[b].d().ExceptionInVPackage()), arrayOfBs[b].b(), arrayOfBs[b].c(), arrayOfBs[b].f(), arrayOfBs[b].ExceptionPrintstacktrace());
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          D.ExceptionInVPackage("Can not add line to Graph.", (Exception)ExceptionInVPackage, this);
        } 
      } 
    } 
    addMouseListener(new v(this));
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2, String paramString3, Color paramColor, double paramDouble1, double paramDouble2, boolean paramBoolean1, boolean paramBoolean2) {
    R r = T.ExceptionInVPackage().c(paramString1);
    if (r == null)
      throw new ExceptionInVPackage("Failed to add OutputChannel " + paramString2 + ",\n" + paramString1 + " not currently loaded."); 
    aH aH = r.ExceptionPrintstacktrace(paramString2);
    if (aH == null)
      throw new ExceptionInVPackage("Failed to add OutputChannel " + paramString2 + ",\n" + aH + " not found in " + paramString1); 
    ah ah = ExceptionInVPackage(paramString2, r);
    t t = new t(this);
    t.ExceptionInVPackage(paramString2);
    t.b(paramString2);
    if (paramColor == null)
      paramColor = ExceptionInVPackage(this.c.size()); 
    t.ExceptionInVPackage(paramColor);
    if (paramString3 == null || paramString3.equals(""))
      paramString3 = aH.e(); 
    if (paramDouble1 != paramDouble2) {
      t.b(paramDouble1);
      t.c(paramDouble2);
      t.d(aH.d());
      t.ExceptionInVPackage(paramBoolean2);
      t.b(paramBoolean1);
      t.c(paramString3);
      if (ah != null)
        t.d(ah.l()); 
    } else if (ah != null) {
      t.b(ah.ExceptionInVPackage());
      t.c(ah.d());
      t.d(ah.l());
      t.ExceptionInVPackage(paramBoolean2);
      t.b(paramBoolean1);
      if (ah.j() != null && !ah.j().equals("")) {
        try {
          t.c(ah.j().ExceptionInVPackage());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
          t.c("");
        } 
      } else {
        t.c(paramString3);
      } 
    } else {
      t.b(aH.n());
      t.c(aH.m());
      t.d(aH.d());
      t.c(paramString3);
      t.ExceptionInVPackage(true);
      t.b(true);
    } 
    this.c.put(paramString2, t);
    ExceptionInVPackage(t);
    cu.ExceptionInVPackage().ExceptionInVPackage(paramString1, paramString2, this);
  }
  
  public void ExceptionInVPackage() {
    cu.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  private Color ExceptionInVPackage(int paramInt) {
    switch (paramInt % 4) {
      case 0:
        return Color.CYAN;
      case 1:
        return Color.RED;
      case 2:
        return Color.YELLOW;
      case 3:
        return Color.GREEN;
    } 
    return Color.MAGENTA;
  }
  
  private ah ExceptionInVPackage(String paramString, R paramR) {
    Iterator<ah> iterator = paramR.B();
    while (iterator.hasNext()) {
      ah ah = iterator.next();
      if (ah.i().equals(paramString))
        return ah; 
    } 
    return null;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    t t = (t)this.c.get(paramString);
    if (t != null) {
      if (!c()) {
        t.ExceptionInVPackage(paramDouble);
        b();
      } 
    } else {
      D.c("LiveGraph::Registered as OuputChannelListener, but I don't have the channel " + paramString);
    } 
  }
  
  public void close() {
    ExceptionInVPackage();
  }
  
  public void b() {
    if (this.ExceptionInVPackage == null)
      this.ExceptionInVPackage = new u(this); 
    this.ExceptionInVPackage.ExceptionInVPackage();
  }
  
  public Dimension getMinimumSize() {
    return new Dimension(0, 0);
  }
  
  public boolean c() {
    return this.d;
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    this.d = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */