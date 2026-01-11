package aP;

import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dF;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JPanelExtensionInApPackage extends JPanel {
  JTextArea a = new JTextArea();
  
  private bc b = null;
  
  public JPanelExtensionInApPackage(ActionListener paramActionListener) {
    setLayout(new BorderLayout());
    this.a.setBorder(BorderFactory.createLoweredBevelBorder());
    this.a.setEditable(false);
    JScrollPane jScrollPane = new JScrollPane(this.a);
    add("Center", jScrollPane);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (paramActionListener != null) {
      JButton jButton1 = new JButton("What do Warnings Mean?");
      jButton1.addActionListener(paramActionListener);
      jPanel.add(jButton1);
    } 
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new L(this));
    jPanel.add(jButton);
    add("South", jPanel);
  }
  
  public JPanelExtensionInApPackage(String paramString) {
    this((ActionListener)null);
    a(paramString);
  }
  
  public void a(String paramString) {
    this.a.setText(paramString);
  }
  
  public void a() {
    if (this.b != null)
      this.b.close(); 
  }
  
  public void a(bc parambc) {
    this.b = parambc;
  }
  
  public void a(Window paramWindow) {
    a(paramWindow, "Review Audit");
  }
  
  public JDialog a(Window paramWindow, String paramString) {
    dF dF = new dF(paramWindow, paramString);
    dF.add(this);
    dF.setSize(eJ.a(680), eJ.a(400));
    a((bc)dF);
    bV.a(paramWindow, (Component)dF);
    dF.setVisible(true);
    return (JDialog)dF;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */