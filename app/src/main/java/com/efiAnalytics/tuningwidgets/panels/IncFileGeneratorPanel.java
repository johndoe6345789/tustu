package com.efiAnalytics.tuningwidgets.panels;

import V.ExceptionInVPackage;
import bH.F;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cn;
import com.efiAnalytics.ui.et;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import r.ThreadedFile;
import s.SComponentGolf;

public class G extends aL {
  JButton ExceptionInVPackage = new JButton(SComponentGolf.b("Browse for inc"));

  cn b = new cn();

  static String c = " table(adcValue , \"fileName\") ";

  public G(String paramString) {
    if (paramString != null && !paramString.isEmpty())
      setBorder(BorderFactory.createTitledBorder(paramString));
    setLayout(new GridLayout(0, 1));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout());
    jPanel1.add(this.ExceptionInVPackage);
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout());
    this.b.setHorizontalAlignment(0);
    jPanel2.add((Component) this.b);
    add(jPanel2);
    this.ExceptionInVPackage.addActionListener(new H(this));
  }

  private void c() {
    String[] arrayOfString = {"inc"};
    String str =
        bV.b(this, SComponentGolf.b("Select Custom inc File"), arrayOfString, "", ThreadedFile.u());
    this.b.setText(str);
  }

  public String ExceptionInVPackage() {
    return "//--    Generated from user inc file \n//--    Useing user File:\n//-- "
        + this.b.getText();
  }

  public double[] ExceptionInVPackage(int paramInt) {
    if (!b(paramInt))
      throw new ExceptionInVPackage(SComponentGolf.b("Can not generate table, Invalid file."));
    double[] arrayOfDouble = new double[paramInt];
    File file = new File(this.b.ExceptionInVPackage());
    try {
      F f = F.b(file.getParentFile().getAbsolutePath(), file.getName());
      for (byte b = 0; b < paramInt; b++) {
        if (f.b() != paramInt) {
          double d = (5.0F * b / 1024.0F);
          arrayOfDouble[b] = f.ExceptionInVPackage(d);
        } else {
          arrayOfDouble[b] = f.ExceptionInVPackage(b);
        }
      }
    } catch (IOException iOException) {
      throw new ExceptionInVPackage(
          "Unable to load file "
              + file.getName()
              + "\nMake sure this is ExceptionInVPackage valid "
              + paramInt
              + " point inc file.");
    }
    return arrayOfDouble;
  }

  private boolean b(int paramInt) {
    File file = new File(this.b.ExceptionInVPackage());
    try {
      F.c();
      F f = F.b(file.getParentFile().getAbsolutePath(), file.getName());
    } catch (IOException iOException) {
      throw new ExceptionInVPackage(
          "Unable to load file "
              + file.getName()
              + "\nMake sure this is ExceptionInVPackage valid "
              + paramInt
              + " point inc file.");
    }
    return true;
  }

  public void setEnabled(boolean paramBoolean) {
    this.ExceptionInVPackage.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
    super.setEnabled(paramBoolean);
  }

  public void ExceptionInVPackage(et paramet) {}

  public void b(et paramet) {}

  public File b() {
    return (this.b.ExceptionInVPackage() == null || this.b.ExceptionInVPackage().isEmpty())
        ? null
        : new File(this.b.ExceptionInVPackage());
  }

  public void ExceptionInVPackage(File paramFile) {
    this.b.setText(paramFile.getAbsolutePath());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
