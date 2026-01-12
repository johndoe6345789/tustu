package t;

import com.efiAnalytics.apps.ts.dashboard.aK;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.ck;
import com.efiAnalytics.ui.cl;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import r.ThreadedFile;
import s.SComponentGolf;

public class ThreadedInTPackage extends a {
  List a = new ArrayList();

  JPanel b = new JPanel();

  ar c;

  HashMap d = new HashMap<>();

  JPanel e = new JPanel();

  public ThreadedInTPackage(Window paramWindow, String paramString) {
    super(paramWindow, SComponentGolf.b(paramString));
    setLayout(new BorderLayout());
    this.e.setLayout(new BorderLayout());
    this.e.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    add("Center", this.e);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    this.b.setLayout(new GridLayout(0, 3, 5, 5));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Current Images")));
    this.e.add("Center", jPanel1);
    jPanel1.add("Center", jScrollPane);
    jScrollPane.setSize(eJ.a(340), eJ.a(240));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Selected Image Preview")));
    this.c = new ar(this, 185);
    jPanel2.add(this.c);
    jPanel1.add("East", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    JButton jButton1 = new JButton(SComponentGolf.b("Other Images"));
    jButton1.addActionListener(new ak(this));
    jPanel3.add(jButton1);
    JLabel jLabel = new JLabel();
    jLabel.setPreferredSize(eJ.a(50, 20));
    jPanel3.add(jLabel);
    JButton jButton2 = new JButton(SComponentGolf.b("Apply"));
    jButton2.addActionListener(new al(this));
    jPanel3.add(jButton2);
    JButton jButton3 = new JButton(SComponentGolf.b("Clear"));
    jButton3.addActionListener(new am(this));
    jPanel3.add(jButton3);
    JButton jButton4 = new JButton(SComponentGolf.b("Done"));
    jButton4.addActionListener(new an(this));
    jPanel3.add(jButton4);
    this.e.add("South", jPanel3);
    setSize(eJ.a(800), eJ.a(450));
    setResizable(false);
  }

  public ThreadedInTPackage(Window paramWindow, File paramFile, String paramString) {
    this(paramWindow, paramString);
    a(paramFile);
    a(ThreadedFile.i());
  }

  public ThreadedInTPackage(Window paramWindow, List paramList, String paramString) {
    this(paramWindow, paramString);
    for (File file : paramList) a(file);
    a(ThreadedFile.i());
  }

  public void a(File paramFile) {
    File[] arrayOfFile = paramFile.listFiles(new ao(this));
    if (arrayOfFile != null)
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (this.d.get(arrayOfFile[b].getName()) == null) {
          ar ar1 = new ar(this, arrayOfFile[b]);
          ar1.addMouseListener(new ap(this));
          this.b.add(ar1);
          this.d.put(arrayOfFile[b].getName(), ar1);
        }
      }
  }

  public void a() {
    String[] arrayOfString = {"gif", "jpg", "jpeg", "png"};
    String str = bV.a(this, getTitle(), arrayOfString, "", ThreadedFile.w(), true, (ck) new cl());
    if (str != null && !str.equals("")) {
      ar ar1 = new ar(this, new File(str));
      ar1.addMouseListener(new aq(this));
      this.b.add(ar1);
      this.b.validate();
      this.c.a(ar1.a);
    }
  }

  public void a(aK paramaK) {
    this.a.add(paramaK);
  }

  private void b(File paramFile) {
    for (aK aK : this.a) aK.a(paramFile);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
