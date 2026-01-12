package aN;

import G.GInterfaceAl;
import G.Manager;
import G.R;
import bH.X;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.util.ArrayList;
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
      stringBuilder
          .append("page = ")
          .append(b + 1)
          .append(", size = ")
          .append((paramR.p().b(b)).length)
          .append(", Page Offset = 0x")
          .append(Integer.toHexString(j).toUpperCase())
          .append(" (")
          .append(j)
          .append(")")
          .append("\n");
      int k = -1;
      ArrayList<Manager> arrayList = new ArrayList();
      null = paramR.a(b);
      while (null.hasNext()) {
        Manager Manager = null.next();
        arrayList.add(Manager);
      }
      arrayList = GInterfaceAl.b(arrayList);
      for (Manager Manager : arrayList) {
        if (Manager.N()) stringBuilder.append("&");
        stringBuilder.append("\t").append(X.b(Manager.GInterfaceAl(), ' ', 25));
        stringBuilder.append(" \toffset = ");
        stringBuilder.append(Manager.g()).append(", \tbyte length = ").append(Manager.z());
        int m = paramR.O().y(b) + Manager.g();
        boolean bool = (m <= k) ? true : false;
        stringBuilder
            .append(", \tStart Address = ")
            .append("0x")
            .append(Integer.toHexString(m).toUpperCase());
        k = paramR.O().y(b) + Manager.g() + Manager.z() - 1;
        stringBuilder
            .append(", \tEnd Address = ")
            .append("0x")
            .append(Integer.toHexString(k).toUpperCase());
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
