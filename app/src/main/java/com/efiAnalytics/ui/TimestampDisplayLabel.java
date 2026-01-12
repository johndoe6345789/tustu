package com.efiAnalytics.ui;

import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;
import javax.swing.JLabel;

public class TimestampDisplayLabel extends JLabel {
  Timer a = new Timer();

  fk b = null;

  long c = 0L;

  private boolean d = true;

  public TimestampDisplayLabel() {
    setHorizontalAlignment(0);
  }

  public void a(Date paramDate) {
    if (this.d && this.b == null) {
      this.b = new fk(this);
      this.a.scheduleAtFixedRate(this.b, 0L, 1000L);
    }
    this.c = paramDate.getTime() - System.currentTimeMillis();
    b();
  }

  public void a() {
    if (this.b != null) {
      this.b.cancel();
      this.b = null;
    }
    setText("");
  }

  public void b() {
    long l = System.currentTimeMillis() + this.c;
    DateFormat dateFormat1 = DateFormat.getDateInstance(2);
    DateFormat dateFormat2 = DateFormat.getTimeInstance(2);
    Date date = new Date(l);
    String str = dateFormat1.format(date) + " - " + dateFormat2.format(date);
    setText(str);
  }

  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
    if (!paramBoolean && this.b != null) {
      this.b.cancel();
      this.b = null;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
