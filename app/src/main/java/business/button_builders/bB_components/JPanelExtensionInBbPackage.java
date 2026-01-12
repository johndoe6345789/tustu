package business.button_builders.bB_components;

import V.ExceptionInVPackage;
import bH.D;
import bH.J;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JPanelExtensionInBbPackage extends JPanel implements bc {
  h ExceptionInVPackage;

  d b;

  ab c;

  private q f = null;

  JButton d;

  JButton e;

  private int g;

  public JPanelExtensionInBbPackage(ab paramab, q paramq) {
    this(paramab);
    ExceptionInVPackage(paramq);
  }

  public JPanelExtensionInBbPackage(ab paramab) {
    this.c = paramab;
    setLayout(new BorderLayout(5, eJ.ExceptionInVPackage(8)));
    setBorder(
        BorderFactory.createEmptyBorder(
            eJ.ExceptionInVPackage(10),
            eJ.ExceptionInVPackage(10),
            eJ.ExceptionInVPackage(10),
            eJ.ExceptionInVPackage(10)));
    this.ExceptionInVPackage = new h(paramab);
    JScrollPane jScrollPane = new JScrollPane(this.ExceptionInVPackage);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", jScrollPane);
    add("Center", jPanel1);
    jScrollPane.setPreferredSize(eJ.ExceptionInVPackage(400, 180));
    this.ExceptionInVPackage.getSelectionModel().addListSelectionListener(new p(this, null));
    if (!J.b()) {
      jPanel1.add("South", new JLabel(ExceptionInVPackage("Use CTRL or Shift to multi-select"), 0));
    } else {
      jPanel1.add(
          "South",
          new JLabel(ExceptionInVPackage("Use Command, CTRL or Shift to multi-select"), 0));
    }
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    add("South", jPanel2);
    this.b = new d(paramab);
    this.b.setEnabled(false);
    jPanel2.add("Center", this.b);
    jPanel2.setBorder(
        BorderFactory.createTitledBorder(ExceptionInVPackage("Edit Field Attributes")));
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.P, this);
      ImageIcon imageIcon = new ImageIcon(image);
      this.d = new JButton(ExceptionInVPackage("Save"), imageIcon);
      this.d.addActionListener(new m(this));
      this.d.setEnabled(false);
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout(2));
      jPanel2.add("South", jPanel);
      this.e = new JButton("Reset Default Limits");
      this.e.addActionListener(new n(this));
      this.e.setEnabled(false);
      jPanel.add(this.e);
      jPanel.add(this.d);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage((Exception) ExceptionInVPackage);
    }
  }

  private void b() {
    r r = this.f.b(this.b.e());
    if (r != null && !r.e().trim().isEmpty()) {
      String[] arrayOfString = this.b.ExceptionInVPackage();
      if (arrayOfString.length > 1) {
        for (byte b = 0; b < arrayOfString.length; b++) {
          r r1 = this.ExceptionInVPackage.ExceptionInVPackage(arrayOfString[b]);
          if (r1 != null) {
            r1.b(r.b());
            r1.ExceptionInVPackage(r.ExceptionInVPackage());
            r1.ExceptionInVPackage(r.f());
            this.f.ExceptionInVPackage(r);
            this.f.ExceptionInVPackage(r.e());
          }
        }
        this.ExceptionInVPackage.b();
      } else {
        this.ExceptionInVPackage.ExceptionInVPackage(r);
        this.f.ExceptionInVPackage(r);
        this.f.ExceptionInVPackage(r.e());
        this.ExceptionInVPackage.b();
      }
    } else {
      String[] arrayOfString = this.b.ExceptionInVPackage();
      if (arrayOfString.length > 0) {
        for (byte b = 0; b < arrayOfString.length; b++) {
          r r1 = this.ExceptionInVPackage.ExceptionInVPackage(arrayOfString[b]);
          if (r1 != null) {
            r1.b(Double.NaN);
            r1.ExceptionInVPackage(Double.NaN);
            r1.ExceptionInVPackage(-1);
            this.f.ExceptionInVPackage(r1);
            this.f.ExceptionInVPackage(r1.e());
          }
        }
        this.ExceptionInVPackage.b();
      }
    }
    this.b.f();
    this.b.d();
    this.b.setEnabled(false);
    this.d.setEnabled(false);
    this.e.setEnabled(false);
  }

  private String ExceptionInVPackage(String paramString) {
    return (this.c != null) ? this.c.ExceptionInVPackage(paramString) : paramString;
  }

  public q ExceptionInVPackage() {
    return this.f;
  }

  public void ExceptionInVPackage(q paramq) {
    this.f = paramq;
    if (paramq != null) {
      ArrayList<r> arrayList = new ArrayList();
      arrayList.addAll(paramq.ExceptionInVPackage());
      for (String str : paramq.b()) {
        if (!ExceptionInVPackage(arrayList, str)) {
          r r = paramq.b(str);
          if (r == null) {
            ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage();
            ExceptionInVPackage.ExceptionInVPackage(str);
            ExceptionInVPackage.ExceptionInVPackage(Double.NaN);
            ExceptionInVPackage.b(Double.NaN);
            ExceptionInVPackage.ExceptionInVPackage(-1);
            r = ExceptionInVPackage;
          }
          arrayList.add(r);
        }
      }
      Collections.sort(arrayList, new o(this));
      this.ExceptionInVPackage.ExceptionInVPackage(arrayList);
      this.ExceptionInVPackage.ExceptionInVPackage();
    }
    this.b.ExceptionInVPackage(paramq.b());
    this.b.f();
  }

  public void ExceptionInVPackage(Window paramWindow) {
    JDialog jDialog = bV.b(this, paramWindow, ExceptionInVPackage("Field Min & Max Editor"), this);
    jDialog.pack();
    bV.ExceptionInVPackage(paramWindow, jDialog);
    jDialog.setVisible(true);
  }

  private boolean ExceptionInVPackage(List paramList, String paramString) {
    for (r r : paramList) {
      if (r.e().equals(paramString)) return true;
    }
    return false;
  }

  private boolean c() {
    r r = this.b.e();
    if (r != null && !r.e().trim().isEmpty()) {
      this.b.d();
      String[] arrayOfString = this.b.ExceptionInVPackage();
      if (arrayOfString.length > 1) {
        for (byte b = 0; b < arrayOfString.length; b++) {
          r r1 = this.ExceptionInVPackage.ExceptionInVPackage(arrayOfString[b]);
          if (r1 != null) {
            r1.b(r.b());
            r1.ExceptionInVPackage(r.ExceptionInVPackage());
            r1.ExceptionInVPackage(r.f());
            this.f.ExceptionInVPackage(r1);
          }
        }
        this.ExceptionInVPackage.b();
      } else {
        this.ExceptionInVPackage.ExceptionInVPackage(r);
        this.f.ExceptionInVPackage(r);
      }
      return true;
    }
    return false;
  }

  private void ExceptionInVPackage(int paramInt) {
    if (this.b.c()) {
      String str =
          ExceptionInVPackage("The Field limit currently being edited has not been saved.")
              + "\n"
              + ExceptionInVPackage("Would you like to save it now?");
      if (bV.ExceptionInVPackage(str, this.b, true))
        if (c()) {
          this.b.f();
        } else {
          if (this.g >= 0)
            this.ExceptionInVPackage.getSelectionModel().setSelectionInterval(paramInt, paramInt);
          return;
        }
    }
    if (paramInt >= 0) {
      this.g = paramInt;
      r r1 = this.ExceptionInVPackage.ExceptionInVPackage(paramInt);
      r r2 = null;
      r2 = ExceptionInVPackage().b(r1);
      this.b.ExceptionInVPackage(r1.e(), r1.ExceptionInVPackage(), r1.b(), r1.f());
      this.b.setEnabled(true);
      this.d.setEnabled(true);
      this.e.setEnabled(true);
      if (this.ExceptionInVPackage.getSelectedRowCount() > 1) {
        int[] arrayOfInt = this.ExceptionInVPackage.getSelectedRows();
        String str = "";
        for (byte b = 0; b < arrayOfInt.length; b++) {
          if (b == 0) {
            str = str + this.ExceptionInVPackage.ExceptionInVPackage(arrayOfInt[b]).e();
          } else {
            str = str + ", " + this.ExceptionInVPackage.ExceptionInVPackage(arrayOfInt[b]).e();
          }
        }
        this.b.ExceptionInVPackage(str);
      }
    } else {
      this.b.f();
      this.b.setEnabled(false);
      this.d.setEnabled(false);
    }
  }

  public void close() {
    if (this.b.c()) {
      String str =
          ExceptionInVPackage("The Field limit currently being edited has not been saved.")
              + "\n"
              + ExceptionInVPackage("Would you like to save it now?");
      if (bV.ExceptionInVPackage(str, this.b, true)) c();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
