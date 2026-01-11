package aP;

import G.R;
import bH.D;
import bH.X;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import s.SComponentGolf;

public class jL extends JPanel implements jK {
  R a = null;
  
  JTextPane b = new JTextPane();
  
  public jL() {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Tuners Log")));
    String str = "<html>" + SComponentGolf.b("Notes and Comments for the current tune") + "</html>";
    JLabel jLabel = new JLabel(str);
    add("North", jLabel);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    add("Center", jScrollPane);
    this.b.addFocusListener(new jM(this));
  }
  
  public void e(R paramR) {
    this.a = paramR;
    if (paramR != null) {
      this.b.setEnabled(true);
      if (this.a.Q() != null && this.a.Q().length() > 32768) {
        String str1 = X.b(this.a.Q(), "<br><br><br><br><br><br><br><br><br><br><br><br><br><br>", "");
        str1 = X.b(str1, "<br><br> <br><br> <br><br> <br><br> <br><br> <br><br> ", "");
        str1 = X.b(str1, "    <br>\n    <br>\n    <br>\n    <br>\n    <br>\n    <br>\n    <br>\n    <br>\n", "");
        this.a.v(str1);
        if (this.a.Q() != null && this.a.Q().length() > 65536) {
          str1 = this.a.Q().substring(0, 65536);
          this.a.v(str1);
        } 
      } 
      String str = this.a.Q();
      if (str.contains("<br>")) {
        str = a(this.a.Q());
        this.a.v(str);
      } 
      this.b.setText(str);
      this.b.setCaretPosition(0);
    } else {
      this.b.setEnabled(false);
      this.b.setText("");
    } 
  }
  
  private String a(String paramString) {
    null = X.b(paramString, "<br>", "\n");
    null = null.replaceAll("(?<=<p)(.*)(?=>)", "");
    null = X.b(null, "\r", "");
    null = null.replaceAll("<p>", "\n");
    return null.replaceAll("</p>", "");
  }
  
  public R a() {
    return this.a;
  }
  
  public void b() {
    if (this.a != null) {
      String str = this.b.getText();
      this.a.v(str);
      D.c("TuneLog Editor set text");
    } 
  }
  
  public void c() {
    if (this.a != null && !this.b.getText().equals(this.a.Q())) {
      this.b.setText(this.a.Q());
      this.b.setCaretPosition(0);
      D.c("TuneLog Editor loaded text");
    } 
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    if (this.a != null && this.a.equals(paramR))
      c(); 
  }
  
  public void c(R paramR) {
    if (this.a != null && this.a.equals(paramR))
      b(); 
  }
  
  public void d(R paramR) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */