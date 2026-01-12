package ao;

import com.efiAnalytics.ui.eJ;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class br extends JDialog {
  JTextArea a = new JTextArea();

  public br(Window paramWindow) {
    super(paramWindow);
    JScrollPane jScrollPane = new JScrollPane(this.a);
    add(jScrollPane, "Center");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new bs(this));
    jPanel.add(jButton);
    add(jPanel, "South");
    this.a.setFont(new Font("Monospaced", 0, eJ.a(12)));
  }

  public void a(String paramString) {
    this.a.setText(paramString);
    this.a.setCaretPosition(0);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/br.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
