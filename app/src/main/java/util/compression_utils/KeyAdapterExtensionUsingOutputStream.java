package z;

import G.R;
import G.T;
import G.m;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.OutputStream;

class KeyAdapterExtensionUsingOutputStream extends KeyAdapter {
  private OutputStream b;

  public KeyAdapterExtensionUsingOutputStream(k paramk, OutputStream paramOutputStream) {
    a(paramOutputStream);
  }

  public void keyTyped(KeyEvent paramKeyEvent) {
    char c = paramKeyEvent.getKeyChar();
    R r = T.a().c();
    boolean bool = (r != null && r.C().q()) ? true : false;
    if (!bool) {
      try {
        if (c == '\n') c = '\r';
        a().write(c);
      } catch (IOException iOException) {
        System.err.println("Could not write byte, OutputStream not open");
      }
    } else {
      int[] arrayOfInt = {c};
      m m = m.a(arrayOfInt);
      m.b(k.a(this.a));
      r.C().b(m);
    }
  }

  public OutputStream a() {
    return this.b;
  }

  public void a(OutputStream paramOutputStream) {
    this.b = paramOutputStream;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
