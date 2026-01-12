package com.efiAnalytics.tuningwidgets.portEditor;

import G.GComponentBq;
import G.GInterfaceDk;
import G.Manager;
import G.R;
import G.SerializableImpl;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.X;
import bt.ExceptionUsingComponent;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThresholdSyncValueEditor extends ExceptionUsingComponent {
  public ThresholdSyncValueEditor(z paramz, R paramR, GComponentBq parambq) {
    super(paramR, parambq);
  }

  public void b(String paramString) {
    o();
    super.b(paramString);
  }

  protected void o() {
    SerializableImpl SerializableImpl = this.a.b.c().ExceptionPrintstacktrace(this.a.c.a());
    if (SerializableImpl != null) {
      z.a(this.a).c(SerializableImpl.i());
      z.a(this.a).b(SerializableImpl.h());
      int i = (int) Math.round(Math.log10(1.0D / SerializableImpl.h()));
      if (i != z.a(this.a).v())
        try {
          z.a(this.a).e(GInterfaceDk.a(i));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(z.class.getName())
              .log(
                  Level.WARNING,
                  "Failed to update digits provider threshold",
                  (Throwable) ExceptionPrintstacktrace);
        }
      a(i);
      z.b(this.a).b(SerializableImpl.h());
      if (i != z.b(this.a).v())
        try {
          z.b(this.a).e(GInterfaceDk.a(i));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(z.class.getName())
              .log(
                  Level.WARNING,
                  "Failed to update digits provider hysteresis",
                  (Throwable) ExceptionPrintstacktrace);
        }
    } else {
      D.c("Can not find OutputChannel " + this.a.c.a() + " in Config: " + this.a.b.c());
    }
  }

  public void f() {
    if (this.f.b() != null) {
      o();
      Manager Manager = this.ExceptionPrintstacktrace.c(this.f.b());
      if (this.i != null) {
        try {
          this.i.a(Manager.f(this.ExceptionPrintstacktrace.p()));
        } catch (Exception exception) {
          D.b(exception.getMessage());
        }
      } else if (this.j != null) {
        try {
          double d = Manager.i(n().p())[this.f.f()][this.f.h()];
          this.j.setText(X.a(d));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          D.a(ExceptionPrintstacktrace.getMessage(), (Exception) ExceptionPrintstacktrace, this);
        }
      }
    }
  }

  public void setEnabled(boolean paramBoolean) {
    b(paramBoolean);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
