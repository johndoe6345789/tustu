package aN;

import G.R;
import G.aL;
import G.aM;
import bH.X;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class JDialogExtensionInAnPackage extends JDialog {
  JTextPane a = new JTextPane();
  
  public JDialogExtensionInAnPackage(Frame paramFrame) {
    super(paramFrame, "Memory addressing");
    setDefaultCloseOperation(2);
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    this.a.setEditable(false);
    jPanel.setLayout(new BorderLayout());
    jPanel.setBorder(BorderFactory.createTitledBorder("Memory Addressing"));
    JScrollPane jScrollPane = new JScrollPane(this.a);
    jPanel.add("Center", jScrollPane);
    add("Center", jPanel);
    this.a.setFont(new Font("Monospaced", 0, 12));
  }
  
  public void a(R paramR) {
    int i = paramR.p().e();
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < i; b++) {
      int j = paramR.O().y(b);
      stringBuilder.append("page = ").append(b + 1).append(", size = ").append((paramR.p().b(b)).length).append(", Page Offset = 0x").append(Integer.toHexString(j).toUpperCase()).append(" (").append(j).append(")").append("\n");
      int k = -1;
      ArrayList<aM> arrayList = new ArrayList();
      null = paramR.a(b);
      while (null.hasNext()) {
        aM aM = null.next();
        arrayList.add(aM);
      } 
      arrayList = aL.b(arrayList);
      for (aM aM : arrayList) {
        if (aM.N())
          stringBuilder.append("&"); 
        stringBuilder.append("\t").append(X.b(aM.aL(), ' ', 25));
        stringBuilder.append(" \toffset = ");
        stringBuilder.append(aM.g()).append(", \tbyte length = ").append(aM.z());
        int m = paramR.O().y(b) + aM.g();
        boolean bool = (m <= k) ? true : false;
        stringBuilder.append(", \tStart Address = ").append("0x").append(Integer.toHexString(m).toUpperCase());
        k = paramR.O().y(b) + aM.g() + aM.z() - 1;
        stringBuilder.append(", \tEnd Address = ").append("0x").append(Integer.toHexString(k).toUpperCase());
        if (bool) {
          stringBuilder.append(" *\n");
          continue;
        } 
        stringBuilder.append("\n");
      } 
    } 
    stringBuilder.append("\n");
    stringBuilder.append("* Denotes Address Overlap\n");
    stringBuilder.append("& Denotes ControllerPriority\n");
    this.a.setText(stringBuilder.toString());
    this.a.setCaretPosition(0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aN/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */