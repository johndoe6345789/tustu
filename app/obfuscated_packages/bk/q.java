package bk;

import com.efiAnalytics.ui.bc;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import s.g;

public class q extends JLabel implements bc {
  private String d = "SD Logging Active";
  
  private String e = "SD Logging Idle";
  
  r a = null;
  
  boolean b = true;
  
  boolean c = false;
  
  public q() {
    setText(g.b(this.e));
    setHorizontalAlignment(0);
    setBackground(Color.GREEN);
    setBorder(BorderFactory.createEtchedBorder(1, Color.lightGray, Color.WHITE));
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean != this.c) {
      if (paramBoolean) {
        setText(g.b(this.d));
        a();
      } else {
        setText(g.b(this.e));
        b();
      } 
      this.c = paramBoolean;
    } 
  }
  
  public void close() {
    if (this.a != null && this.a.a)
      this.a.a = false; 
  }
  
  private void a() {
    b();
    if (this.b) {
      this.a = new r(this);
      this.a.start();
    } else {
      setOpaque(true);
    } 
  }
  
  private void b() {
    if (this.a != null && this.a.a)
      this.a.a = false; 
    if (!this.b)
      setOpaque(false); 
  }
  
  public void a(String paramString) {
    this.d = paramString;
  }
  
  public void setText(String paramString) {
    super.setText(g.b(paramString));
  }
  
  public void b(String paramString) {
    this.e = paramString;
  }
  
  public void b(boolean paramBoolean) {
    this.b = paramBoolean;
    if (this.a != null)
      this.a.a = false; 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */