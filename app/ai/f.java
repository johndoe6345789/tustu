package ai;

import G.aj;
import V.a;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dF;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.html.HTMLDocument;

public class f extends JPanel {
  JTextPane a = new JTextPane();
  
  JTextPane b = null;
  
  JPanel c = null;
  
  String d = "body { font-size: 100% }";
  
  private et e = null;
  
  private bc f = null;
  
  public f() {
    setLayout(new BorderLayout());
    this.a.setBorder(BorderFactory.createLoweredBevelBorder());
    this.a.setEditable(false);
    this.a.setContentType("text/html; charset=UTF-8");
    this.a.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
    this.a.setText("<html><body></body></html>");
    ((HTMLDocument)this.a.getDocument()).getStyleSheet().addRule(this.d);
    this.a.addHyperlinkListener(new g(this));
    JScrollPane jScrollPane = new JScrollPane(this.a);
    add("Center", jScrollPane);
    this.c = new JPanel();
    this.c.setLayout(new FlowLayout(2));
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new h(this));
    this.c.add(jButton);
    add("South", this.c);
  }
  
  public f(aj paramaj) {
    this();
    a(paramaj);
  }
  
  public void a(aj paramaj) {
    if (paramaj.b() != null && !paramaj.b().equals("")) {
      this.a.setText("<html>" + paramaj.c() + "<br><br>Web Help: <a href=\"" + paramaj.b() + "\">" + paramaj.b() + "</a></html>");
    } else {
      this.a.setText("<html>" + paramaj.c() + "</html>");
    } 
    this.a.setCaretPosition(0);
  }
  
  public void a(String paramString) {
    this.b = new JTextPane();
    this.b.setEditable(false);
    this.b.setContentType("text/html");
    this.b.addHyperlinkListener(new i(this));
    try {
      this.b.setPage(paramString);
    } catch (IOException iOException) {
      D.d("Can not find index file:" + paramString + ", not showing left pane.");
    } 
    JScrollPane jScrollPane = new JScrollPane(this.b);
    jScrollPane.setMinimumSize(new Dimension(200, 100));
    jScrollPane.setPreferredSize(new Dimension(200, 100));
    add("West", jScrollPane);
  }
  
  public void a() {
    this.a.setText("");
    if (this.f != null)
      this.f.close(); 
    System.gc();
  }
  
  public void a(boolean paramBoolean) {
    this.c.setVisible(paramBoolean);
  }
  
  public void a(b paramb) {
    try {
      b(paramb.b());
    } catch (Exception exception) {
      System.out.println("Tried to load web help, but something went wrong.");
      exception.printStackTrace();
      bV.d("Error Opening:\n" + paramb, this);
    } 
  }
  
  public void b(String paramString) {
    try {
      String str = paramString;
      if (!str.startsWith("http") && !str.startsWith("file"))
        str = d.a(str); 
      this.a.setPage(str);
    } catch (FileNotFoundException fileNotFoundException) {
      bV.d("File Not Found:\n" + fileNotFoundException.getMessage(), this);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Unable to read file:\n" + paramString);
    } 
  }
  
  public void a(bc parambc) {
    this.f = parambc;
  }
  
  public void a(Window paramWindow, String paramString) {
    dF dF = new dF(paramWindow, paramString);
    dF.a(this.e);
    dF.add(this);
    a((bc)dF);
    dF.pack();
    bV.a(paramWindow, (Component)dF);
    dF.setVisible(true);
  }
  
  public void a(et paramet) {
    this.e = paramet;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ai/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */