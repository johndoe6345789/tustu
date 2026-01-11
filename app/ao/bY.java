package ao;

import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Frame;
import java.awt.KeyEventDispatcher;
import java.awt.Window;
import java.awt.event.KeyEvent;

public class bY implements KeyEventDispatcher {
  hx a = null;
  
  int b = -1;
  
  int c = 0;
  
  private static bY d = null;
  
  private bY(hx paramhx) {
    this.a = paramhx;
  }
  
  public static bY a() {
    if (d == null)
      d = new bY(hx.a()); 
    return d;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.isConsumed() || paramKeyEvent.getSource() instanceof javax.swing.JComboBox)
      return false; 
    if (paramKeyEvent.getID() == 401) {
      int i = paramKeyEvent.getKeyCode();
      if (paramKeyEvent.getSource() instanceof Component) {
        Window window = bV.b((Component)paramKeyEvent.getSource());
        Frame frame = bV.a((Component)paramKeyEvent.getSource());
        if (frame != null && window != null && !frame.equals(window))
          return false; 
      } 
      if (paramKeyEvent.getSource() != null && (paramKeyEvent.getSource() instanceof javax.swing.JTextArea || paramKeyEvent.getSource() instanceof javax.swing.JTextField || paramKeyEvent.getSource() instanceof javax.swing.JMenu || paramKeyEvent.getSource() instanceof javax.swing.JMenuItem || paramKeyEvent.getSource() instanceof javax.swing.JRootPane || paramKeyEvent.getSource() instanceof java.awt.TextComponent))
        return false; 
      if (paramKeyEvent.isControlDown() && (i == 48 || i == 96)) {
        bq.a().c().t();
        return true;
      } 
      if (paramKeyEvent.isControlDown() && i == 117) {
        b.a().a(bq.a().b());
        return true;
      } 
      if (paramKeyEvent.isControlDown() && i == 127) {
        bn bn = bq.a().i();
        if (bn != null)
          bn.b(); 
        return true;
      } 
      if (paramKeyEvent.isControlDown()) {
        aw aw;
        switch (i) {
          case 78:
            if (this.b == -1) {
              this.a.l();
              break;
            } 
            aw = bq.a().c();
            aw.d(this.b, this.b + ++this.c);
            break;
          case 66:
            if (this.b == -1) {
              this.a.m();
              break;
            } 
            if (this.c <= 0) {
              this.a.m();
              this.b--;
              break;
            } 
            aw = bq.a().c();
            aw.d(this.b, this.b + --this.c);
            break;
          case 80:
            this.a.e();
            break;
          case 83:
            this.a.j();
            break;
          case 32:
            this.a.k();
            break;
          case 85:
            this.a.g();
            break;
          case 68:
            this.a.h();
            break;
        } 
      } else if (paramKeyEvent.getSource() != null && !(paramKeyEvent.getSource() instanceof com.efiAnalytics.ui.de)) {
        switch (i) {
          case 36:
            this.a.n();
            break;
          case 35:
            this.a.o();
            break;
          case 33:
            this.a.z();
            break;
          case 34:
            this.a.w();
            break;
          case 114:
            this.a.b();
            break;
          case 127:
            bq.a().c().c();
            break;
          case 16:
            this.b = this.a.p();
            break;
          case 113:
            this.a.C();
            break;
        } 
      } 
      if (paramKeyEvent.getSource() != null && !(paramKeyEvent.getSource() instanceof com.efiAnalytics.ui.BinTableView) && !(paramKeyEvent.getSource() instanceof com.efiAnalytics.ui.eM) && !(paramKeyEvent.getSource() instanceof com.efiAnalytics.ui.de)) {
        aw aw;
        switch (i) {
          case 38:
            this.a.u();
            break;
          case 40:
            this.a.v();
            break;
          case 37:
            if (this.b == -1) {
              this.a.m();
              break;
            } 
            if (this.c <= 0) {
              this.a.m();
              this.b--;
              break;
            } 
            aw = bq.a().c();
            aw.d(this.b, this.b + --this.c);
            break;
          case 39:
            if (this.b == -1) {
              this.a.l();
              break;
            } 
            aw = bq.a().c();
            aw.d(this.b, this.b + ++this.c);
            break;
        } 
      } 
    } else if (paramKeyEvent.getID() == 402) {
      int i = paramKeyEvent.getKeyCode();
      switch (i) {
        case 16:
          this.b = -1;
          this.c = 0;
          break;
      } 
      if (paramKeyEvent.getSource() != null && (paramKeyEvent.getSource() instanceof javax.swing.JTextArea || paramKeyEvent.getSource() instanceof javax.swing.JTextField || paramKeyEvent.getSource() instanceof java.awt.TextComponent))
        return false; 
    } 
    return false;
  }
  
  public void b() {
    this.b = -1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */