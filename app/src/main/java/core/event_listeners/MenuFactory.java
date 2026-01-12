package ao;

import h.IOProperties;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class bZ extends MouseAdapter implements MouseMotionListener, MouseWheelListener {
  long a = System.currentTimeMillis();
  
  int b = 300;
  
  hx c = null;
  
  boolean d = false;
  
  int e = -1;
  
  int f = 2;
  
  boolean g = false;
  
  public bZ(hx paramhx) {
    this.c = paramhx;
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof aw) {
      aw aw = (aw)paramMouseEvent.getSource();
      aw.requestFocus();
      if (paramMouseEvent.getButton() == 3 && hx.a().r() != null)
        aw.a(paramMouseEvent.getX(), paramMouseEvent.getY()); 
    } 
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof aw && hx.a().r() != null) {
      aw aw = (aw)paramMouseEvent.getSource();
      aw.requestFocus();
      if (paramMouseEvent.getButton() == 1 && (aw.m() || paramMouseEvent.isShiftDown())) {
        this.e = paramMouseEvent.getX();
      } else if (paramMouseEvent.getButton() == 1 && paramMouseEvent.getY() > aw.getHeight() - aw.B && !aw.m()) {
        this.e = paramMouseEvent.getX();
        if (paramMouseEvent.getClickCount() == 1 || aw.m()) {
          a(paramMouseEvent.getX(), aw);
        } else if (paramMouseEvent.getClickCount() == 2) {
          aw.q();
        } 
        this.d = true;
        aw.c(this.e, paramMouseEvent.getX());
      } else if (paramMouseEvent.getButton() != 1 && paramMouseEvent.getButton() == 3) {
        aw.a(paramMouseEvent.getX(), paramMouseEvent.getY());
      } 
    } 
    if (paramMouseEvent.getButton() == 2)
      this.g = true; 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    aw aw = bq.a().c();
    if (this.d && paramMouseEvent.getSource() instanceof aw) {
      this.e = -1;
    } else if (paramMouseEvent.getSource() instanceof aw && paramMouseEvent.getButton() == 1) {
      aw aw1 = (aw)paramMouseEvent.getSource();
      if (paramMouseEvent.getClickCount() == 1 || aw1.m() || paramMouseEvent.isShiftDown()) {
        aW aW = aw.e(paramMouseEvent.getX(), paramMouseEvent.getY());
        if (aW != null) {
          aw.a(aW);
        } else {
          a(paramMouseEvent.getX(), aw1);
        } 
      } else if (paramMouseEvent.getClickCount() == 2) {
        aw1.q();
      } 
    } 
    this.d = false;
    if (paramMouseEvent.getButton() == 2)
      this.g = false; 
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof aw) {
      aw aw = (aw)paramMouseEvent.getSource();
      if (this.d) {
        if (paramMouseEvent.getX() > this.e + this.f)
          aw.c(this.e, paramMouseEvent.getX()); 
      } else if (paramMouseEvent.getX() < aw.getWidth() && paramMouseEvent.getX() >= 0) {
        if (!aw.m()) {
          a(paramMouseEvent.getX(), aw);
        } else if (this.e > 0 && Math.abs(this.e - paramMouseEvent.getX()) > this.f) {
          this.d = true;
        } 
      } else if (System.currentTimeMillis() - this.a > this.b) {
        if (paramMouseEvent.getX() > aw.getWidth())
          this.c.w(); 
        if (paramMouseEvent.getX() < 0)
          this.c.z(); 
        this.a = System.currentTimeMillis();
      } 
    } 
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getSource() instanceof aw) {
      aw aw = (aw)paramMouseEvent.getSource();
    }
  }
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    double d = paramMouseWheelEvent.getPreciseWheelRotation();
    String str = IOProperties.a(IOProperties.G, IOProperties.J);
    if ((str.equals(IOProperties.I) ^ (((paramMouseWheelEvent.getModifiers() == 2) ? 1 : 0) | this.g)) != 0) {
      if (d < 0.0D) {
        this.c.y();
      } else {
        this.c.x();
      } 
    } else if (d < 0.0D) {
      this.c.u();
    } else {
      this.c.v();
    } 
  }
  
  protected void a(int paramInt, aw paramaw) {
    if (!paramaw.u()) {
      this.c.c(paramaw.e(paramInt));
      this.c.f();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */