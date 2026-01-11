package ao;

import g.k;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.html.HTMLDocument;

public class bu extends JPanel {
  JTextPane a = new JTextPane();
  
  JDialog b = null;
  
  String c = "body { font-size: 100% }";
  
  public bu() {
    setLayout(new BorderLayout());
    this.a.setBorder(BorderFactory.createLoweredBevelBorder());
    this.a.setEditable(false);
    this.a.setContentType("text/html; charset=UTF-8");
    this.a.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
    this.a.setText("<html><body></body></html>");
    ((HTMLDocument)this.a.getDocument()).getStyleSheet().addRule(this.c);
    this.a.addHyperlinkListener(new bv(this));
    JScrollPane jScrollPane = new JScrollPane(this.a);
    add("Center", jScrollPane);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new bw(this));
    jPanel.add(jButton);
    add("South", jPanel);
  }
  
  public void a(String paramString) {
    try {
      this.a.setPage(paramString);
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public void a() {
    if (this.b != null)
      this.b.setVisible(false); 
  }
  
  public void a(Component paramComponent, String paramString) {
    if (this.b == null) {
      Frame frame = k.a(paramComponent);
      this.b = new JDialog(frame, paramString);
      this.b.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
      this.b.add(this);
      this.b.setSize(960, 600);
      k.a(frame, this.b);
    } 
    this.b.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */