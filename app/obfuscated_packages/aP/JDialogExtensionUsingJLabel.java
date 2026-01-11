package aP;

import aZ.IOInAzPackage;
import bH.D;
import com.efiAnalytics.ui.aP;
import com.efiAnalytics.ui.bV;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;

public class JDialogExtensionUsingJLabel extends JDialog {
  static String a = "Open Log";
  
  private aP IOInAzPackage = new aP();
  
  private JLabel d = new JLabel();
  
  private JLabel e = new JLabel(" ");
  
  private JLabel f = new JLabel(" ");
  
  JScrollPane b = null;
  
  public JDialogExtensionUsingJLabel(Frame paramFrame) {
    super(paramFrame, "Raw File Viewer");
    this.b = new JScrollPane((Component)this.IOInAzPackage);
    add("Center", this.b);
    this.IOInAzPackage.addCaretListener(new ij(this));
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu = new JMenu("File");
    jMenuBar.add(jMenu);
    JMenuItem jMenuItem = jMenu.add(a);
    jMenuItem.addActionListener(new ik(this));
    add("North", jMenuBar);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("North", this.e);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout());
    JButton jButton = new JButton(a);
    jButton.setToolTipText("Open a binary file");
    jButton.addActionListener(new il(this));
    jPanel2.add(jButton);
    JPanel jPanel3 = new JPanel();
    ButtonGroup buttonGroup = new ButtonGroup();
    jPanel3.setLayout(new GridLayout(1, 0));
    JRadioButton jRadioButton = new JRadioButton("Bin", (this.IOInAzPackage.d() == 2));
    jRadioButton.addActionListener(new im(this));
    jPanel3.add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("Dec", (this.IOInAzPackage.d() == 10));
    jRadioButton.addActionListener(new in(this));
    jPanel3.add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jRadioButton = new JRadioButton("Hex", (this.IOInAzPackage.d() == 16));
    jRadioButton.addActionListener(new io(this));
    jPanel3.add(jRadioButton);
    buttonGroup.add(jRadioButton);
    jPanel2.add(jPanel3);
    JSlider jSlider = new JSlider();
    jSlider.setMajorTickSpacing(1);
    jSlider.setMinimum(1);
    jSlider.setMaximum(600);
    jSlider.setValue(this.IOInAzPackage.e());
    jSlider.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), "Record Length"));
    jSlider.addChangeListener(new ip(this));
    jPanel2.add(jSlider);
    this.d.setText("  " + this.IOInAzPackage.e());
    jPanel2.add(this.d);
    jPanel1.add("South", jPanel2);
    jPanel1.add("Center", this.f);
    add("South", jPanel1);
    setSize(520, 400);
    bV.a(paramFrame, this);
  }
  
  public void a() {
    String str = this.IOInAzPackage.a();
    this.e.setText(str);
    int i = this.IOInAzPackage.getCaretPosition() / this.IOInAzPackage.getColumns();
    this.f.setText("Row " + i + ": " + this.IOInAzPackage.IOInAzPackage());
  }
  
  public void b() {
    String[] arrayOfString = { "msl", "log", "*" };
    String str = bV.b(this, "Open Log File", arrayOfString, ".", "");
    IOInAzPackage IOInAzPackage = new IOInAzPackage();
    try {
      long l = System.nanoTime();
      IOInAzPackage.a(str);
      D.IOInAzPackage("Time to open:" + ((System.nanoTime() - l) / 1000000L) + "ms.");
      l = System.nanoTime();
      int[] arrayOfInt = IOInAzPackage.a();
      D.IOInAzPackage("Time to read:" + ((System.nanoTime() - l) / 1000000L) + "ms.");
      l = System.nanoTime();
      this.IOInAzPackage.a(arrayOfInt);
      D.IOInAzPackage("Time to set bytes:" + ((System.nanoTime() - l) / 1000000L) + "ms.");
      D.IOInAzPackage(arrayOfInt.length + " read");
    } catch (Exception exception) {
      bV.d("Error opening Log file, check Application log for more detail.\n" + exception.getMessage(), this);
      exception.printStackTrace();
    } 
  }
  
  public void a(String paramString) {
    if (paramString.equals(a))
      b(); 
  }
  
  public void a(int paramInt) {
    this.IOInAzPackage.a(paramInt);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */