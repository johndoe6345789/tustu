package bt;

import com.efiAnalytics.ui.bt;
import com.efiAnalytics.ui.eM;
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

public class KeyEventDispatcherImplDispatchkeyevent implements KeyEventDispatcher {
  Component a = null;
  
  eM b = null;
  
  bt c = null;
  
  public KeyEventDispatcherImplDispatchkeyevent(Component paramComponent, bt parambt) {
    this.a = paramComponent;
    this.c = parambt;
    this.b = this.c.h();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (!a(paramKeyEvent))
      return false; 
    if (paramKeyEvent.getID() == 401) {
      if (((paramKeyEvent.getModifiersEx() & 0x40) == 64 && paramKeyEvent.getKeyCode() == 38) || ((paramKeyEvent.getModifiersEx() & 0x40) == 64 && paramKeyEvent.getKeyCode() == 39) || paramKeyEvent.getKeyCode() == 521 || paramKeyEvent.getKeyCode() == 81 || paramKeyEvent.getKeyCode() == 160 || paramKeyEvent.getKeyCode() == 46) {
        double d = this.c.l();
        if ((paramKeyEvent.getModifiersEx() & 0x80) == 128) {
          if (this.c.k()) {
            this.b.a(d, this.c.i());
          } else {
            this.b.a(this.c.i());
          } 
        } else if (this.c.k()) {
          this.b.a(d, this.c.j());
        } else {
          this.b.a(this.c.j());
        } 
        this.b.repaint();
        paramKeyEvent.consume();
        return true;
      } 
      if (((paramKeyEvent.getModifiersEx() & 0x40) == 64 && paramKeyEvent.getKeyCode() == 40) || ((paramKeyEvent.getModifiersEx() & 0x40) == 64 && paramKeyEvent.getKeyCode() == 37) || paramKeyEvent.getKeyCode() == 45 || paramKeyEvent.getKeyCode() == 153 || paramKeyEvent.getKeyCode() == 87 || paramKeyEvent.getKeyCode() == 44) {
        double d = this.c.l();
        if ((paramKeyEvent.getModifiersEx() & 0x80) == 128) {
          if (this.c.k()) {
            this.b.a(d, -this.c.i());
          } else {
            this.b.b(this.c.i());
          } 
        } else if (this.c.k()) {
          this.b.a(d, -this.c.j());
        } else {
          this.b.b(this.c.j());
        } 
        this.b.repaint();
        paramKeyEvent.consume();
        return true;
      } 
      switch (paramKeyEvent.getKeyCode()) {
        case 39:
          this.b.b();
          paramKeyEvent.consume();
          return true;
        case 37:
          this.b.c();
          paramKeyEvent.consume();
          return true;
        case 38:
          this.b.d();
          paramKeyEvent.consume();
          return true;
        case 40:
          this.b.e();
          paramKeyEvent.consume();
          return true;
        case 70:
          this.c.g();
          paramKeyEvent.consume();
          return true;
        case 71:
          this.c.f();
          paramKeyEvent.consume();
          return true;
        case 77:
          this.c.a(this.b.l() + 10);
          paramKeyEvent.consume();
          return true;
        case 75:
          this.c.a(this.b.l() - 10);
          paramKeyEvent.consume();
          return true;
        case 78:
          this.c.b(this.b.m() + 10);
          paramKeyEvent.consume();
          return true;
        case 74:
          this.c.b(this.b.m() - 10);
          paramKeyEvent.consume();
          return true;
        case 90:
          this.c.a();
          paramKeyEvent.consume();
          return true;
      } 
    } 
    return false;
  }
  
  private boolean a(KeyEvent paramKeyEvent) {
    for (Component component = paramKeyEvent.getComponent(); component != null; component = component.getParent()) {
      if (component.equals(this.a))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */