package business.binary_transformers;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import r.RInterfaceIndia;

class KeyAdapterExtensionKeypressed extends KeyAdapter {
  boolean a = false;
  
  KeyAdapterExtensionKeypressed(an paraman) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (!this.b.isEnabled())
      return; 
    if (RInterfaceIndia.a().a("joijt;i609tr0932")) {
      this.a = ((paramKeyEvent.getModifiers() & 0x40) == 64 || (paramKeyEvent.getModifiers() & 0x1) == 1);
      boolean bool = ((paramKeyEvent.getModifiers() & 0x80) == 128 || (paramKeyEvent.getModifiers() & 0x2) == 2) ? true : false;
      this.b.p.g((this.a || bool));
    } 
    if (paramKeyEvent.getModifiers() == 3) {
      switch (paramKeyEvent.getKeyCode()) {
        case 39:
          this.b.p.c();
          this.b.p.c();
          this.b.p.c();
          this.b.p.c();
          this.b.p.c();
          paramKeyEvent.consume();
          break;
        case 37:
          this.b.p.d();
          this.b.p.d();
          this.b.p.d();
          this.b.p.d();
          this.b.p.d();
          paramKeyEvent.consume();
          break;
        case 38:
        case 46:
        case 160:
          this.b.p.e(this.b.p.K());
          paramKeyEvent.consume();
          break;
        case 40:
        case 44:
        case 153:
          this.b.p.f(this.b.p.K());
          paramKeyEvent.consume();
          break;
      } 
    } else if (paramKeyEvent.getModifiers() == 2) {
      switch (paramKeyEvent.getKeyCode()) {
        case 66:
          an.c(this.b);
          paramKeyEvent.consume();
          break;
        case 70:
          an.a(this.b, !this.b.y);
          paramKeyEvent.consume();
          break;
        case 39:
          this.b.p.c();
          paramKeyEvent.consume();
          break;
        case 37:
          this.b.p.d();
          paramKeyEvent.consume();
          break;
        case 38:
        case 46:
        case 160:
          this.b.p.e(1);
          paramKeyEvent.consume();
          break;
        case 40:
        case 44:
        case 153:
          this.b.p.f(1);
          paramKeyEvent.consume();
          break;
      } 
    } else {
      switch (paramKeyEvent.getKeyCode()) {
        case 39:
          this.b.p.b(!this.a);
          this.b.p.repaint();
          paramKeyEvent.consume();
          break;
        case 37:
          this.b.p.c(!this.a);
          this.b.p.repaint();
          paramKeyEvent.consume();
          break;
        case 38:
        case 46:
        case 160:
          this.b.p.e(1);
          paramKeyEvent.consume();
          break;
        case 40:
        case 44:
        case 153:
          this.b.p.f(1);
          paramKeyEvent.consume();
          break;
        case 65:
          this.b.f();
          paramKeyEvent.consume();
          break;
        case 61:
          an.d(this.b);
          paramKeyEvent.consume();
          break;
      } 
    } 
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    this.a = ((paramKeyEvent.getModifiers() & 0x40) == 64 || (paramKeyEvent.getModifiers() & 0x1) == 1);
    boolean bool = ((paramKeyEvent.getModifiers() & 0x80) == 128 || (paramKeyEvent.getModifiers() & 0x2) == 2) ? true : false;
    this.b.p.g((this.a || bool));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */