package ai;

import G.GComponentAj;
import V.ExceptionInVPackage;
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

public class JPanelExtensionInAiPackage extends JPanel {
  JTextPane ExceptionInVPackage = new JTextPane();

  JTextPane b = null;

  JPanel c = null;

  String d = "body { font-size: 100% }";

  private et e = null;

  private bc f = null;

  public JPanelExtensionInAiPackage() {
    setLayout(new BorderLayout());
    this.ExceptionInVPackage.setBorder(BorderFactory.createLoweredBevelBorder());
    this.ExceptionInVPackage.setEditable(false);
    this.ExceptionInVPackage.setContentType("text/html; charset=UTF-8");
    this.ExceptionInVPackage.putClientProperty(
        "JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
    this.ExceptionInVPackage.setText("<html><body></body></html>");
    ((HTMLDocument) this.ExceptionInVPackage.getDocument()).getStyleSheet().addRule(this.d);
    this.ExceptionInVPackage.addHyperlinkListener(new g(this));
    JScrollPane jScrollPane = new JScrollPane(this.ExceptionInVPackage);
    add("Center", jScrollPane);
    this.c = new JPanel();
    this.c.setLayout(new FlowLayout(2));
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new h(this));
    this.c.add(jButton);
    add("South", this.c);
  }

  public JPanelExtensionInAiPackage(GComponentAj paramaj) {
    this();
    ExceptionInVPackage(paramaj);
  }

  public void ExceptionInVPackage(GComponentAj paramaj) {
    if (paramaj.b() != null && !paramaj.b().equals("")) {
      this.ExceptionInVPackage.setText(
          "<html>"
              + paramaj.c()
              + "<br><br>Web Help: <ExceptionInVPackage href=\""
              + paramaj.b()
              + "\">"
              + paramaj.b()
              + "</ExceptionInVPackage></html>");
    } else {
      this.ExceptionInVPackage.setText("<html>" + paramaj.c() + "</html>");
    }
    this.ExceptionInVPackage.setCaretPosition(0);
  }

  public void ExceptionInVPackage(String paramString) {
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

  public void ExceptionInVPackage() {
    this.ExceptionInVPackage.setText("");
    if (this.f != null) this.f.close();
    System.gc();
  }

  public void ExceptionInVPackage(boolean paramBoolean) {
    this.c.setVisible(paramBoolean);
  }

  public void ExceptionInVPackage(b paramb) {
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
      if (!str.startsWith("http") && !str.startsWith("file")) str = d.ExceptionInVPackage(str);
      this.ExceptionInVPackage.setPage(str);
    } catch (FileNotFoundException fileNotFoundException) {
      bV.d("File Not Found:\n" + fileNotFoundException.getMessage(), this);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Unable to read file:\n" + paramString);
    }
  }

  public void ExceptionInVPackage(bc parambc) {
    this.f = parambc;
  }

  public void ExceptionInVPackage(Window paramWindow, String paramString) {
    dF dF = new dF(paramWindow, paramString);
    dF.ExceptionInVPackage(this.e);
    dF.add(this);
    ExceptionInVPackage((bc) dF);
    dF.pack();
    bV.ExceptionInVPackage(paramWindow, (Component) dF);
    dF.setVisible(true);
  }

  public void ExceptionInVPackage(et paramet) {
    this.e = paramet;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ai/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
