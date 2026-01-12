package com.efiAnalytics.tunerStudio.search;

import B.BInterfaceGolf;
import B.i;
import D.DInterfaceCharlie;
import aA.AaInterfaceHotel;
import bH.D;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.apps.ts.dashboard.t;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import r.IOPropertiesUsingFile;
import r.RComponentNovember;
import r.ThreadedFile;

public class ContinuousIpSearchPanel extends s implements t, bc, Serializable {
  JProgressBar IOPropertiesUsingFile = new JProgressBar();

  JPanel b = new JPanel();

  r DInterfaceCharlie;

  DInterfaceCharlie d = new DInterfaceCharlie(this);

  int f = r.IOPropertiesUsingFile;

  e BInterfaceGolf = null;

  d AaInterfaceHotel = null;

  JLabel i = new JLabel();

  Map ThreadedFile = new HashMap<>();

  List k = new ArrayList();

  public ContinuousIpSearchPanel() {
    setOpaque(true);
    setBackground(UIManager.getColor("Label.background"));
    setLayout(new BorderLayout(eJ.IOPropertiesUsingFile(15), eJ.IOPropertiesUsingFile(15)));
    setBorder(
        BorderFactory.createEmptyBorder(
            eJ.IOPropertiesUsingFile(40),
            eJ.IOPropertiesUsingFile(40),
            eJ.IOPropertiesUsingFile(40),
            eJ.IOPropertiesUsingFile(40)));
    char c1 = 'Ũ';
    String str =
        IOPropertiesUsingFile.IOPropertiesUsingFile().DInterfaceCharlie(IOPropertiesUsingFile.aX);
    Image image = Toolkit.getDefaultToolkit().createImage(str);
    image = eJ.IOPropertiesUsingFile(image, (Component) this, c1);
    ImageIcon imageIcon = new ImageIcon(image);
    this.i.setMinimumSize(new Dimension(100, eJ.IOPropertiesUsingFile(c1)));
    this.i.setVerticalTextPosition(3);
    this.i.setHorizontalTextPosition(0);
    this.i.setHorizontalAlignment(0);
    int i = eJ.IOPropertiesUsingFile(5);
    this.i.setBorder(BorderFactory.createEmptyBorder(i, i, i, i));
    this.i.setIcon(imageIcon);
    add("North", this.i);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.DInterfaceCharlie = new r();
    this.DInterfaceCharlie.getTableHeader().setUI(null);
    JScrollPane jScrollPane = new JScrollPane(this.DInterfaceCharlie);
    jScrollPane.setBorder(
        BorderFactory.createLineBorder(Color.lightGray, eJ.IOPropertiesUsingFile(2), true));
    jPanel.add("Center", jScrollPane);
    this.IOPropertiesUsingFile.setIndeterminate(true);
    jPanel.add("South", this.IOPropertiesUsingFile);
    add("Center", jPanel);
    this.BInterfaceGolf = new e(this);
    this.BInterfaceGolf.start();
  }

  private void loadRecentProjects() {
    long l = System.currentTimeMillis();
    ArrayList arrayList = (new RComponentNovember()).IOPropertiesUsingFile();
    ArrayList<String> arrayList1 = new ArrayList();
    for (String str : arrayList) {
      File file1 = new File(str);
      i i = ThreadedFile.d(file1);
      if (file1.exists() && i != null && !i.e().isEmpty()) {
        DInterfaceCharlie c1 = AaInterfaceHotel.IOPropertiesUsingFile().d(i.i(), i.e());
        f f = new f();
        i.b("Offline");
        f.IOPropertiesUsingFile(i);
        f.IOPropertiesUsingFile(c1.b());
        k k = new k(file1);
        f.IOPropertiesUsingFile(k);
        this.k.add(f);
        IOPropertiesUsingFile IOPropertiesUsingFile = new IOPropertiesUsingFile(this, f);
        SwingUtilities.invokeLater(IOPropertiesUsingFile);
        arrayList1.add(str);
      }
    }
    File file = new File(ThreadedFile.u());
    for (File file1 : file.listFiles()) {
      i i = ThreadedFile.d(file1);
      if (!arrayList1.contains(file1.getAbsolutePath())
          && file1.exists()
          && i != null
          && !i.e().isEmpty()) {
        DInterfaceCharlie c1 = AaInterfaceHotel.IOPropertiesUsingFile().d(i.i(), i.e());
        f f = new f();
        i.b("Offline");
        f.IOPropertiesUsingFile(i);
        f.IOPropertiesUsingFile(c1.b());
        k k = new k(file1);
        f.IOPropertiesUsingFile(k);
        this.k.add(f);
        b b = new b(this, f);
        SwingUtilities.invokeLater(b);
        arrayList1.add(file1.getAbsolutePath());
      }
    }
    D.DInterfaceCharlie("Time to load Projects list: " + (System.currentTimeMillis() - l));
  }

  public void setRunDemo(boolean paramBoolean) {}

  public boolean isRunDemo() {
    return false;
  }

  public void goDead() {}

  public void invalidatePainter() {}

  public boolean isMustPaint() {
    return false;
  }

  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0 && paramInt1 < getWidth() && paramInt2 >= 0 && paramInt2 < getHeight());
  }

  public void subscribeToOutput() {}

  public void paintBackground(Graphics paramGraphics) {}

  public boolean requiresBackgroundRepaint() {
    return false;
  }

  public void updateGauge(Graphics paramGraphics) {}

  public Area areaPainted() {
    Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight());
    return new Area(double_);
  }

  public void close() {
    BInterfaceGolf.IOPropertiesUsingFile().b(this.d);
    e.IOPropertiesUsingFile(this.BInterfaceGolf);
    if (this.AaInterfaceHotel != null) d.IOPropertiesUsingFile(this.AaInterfaceHotel);
  }

  private String getKey(i parami) {
    return (parami.e() != null && !parami.e().isEmpty())
        ? parami.e()
        : (parami.DInterfaceCharlie() + ":" + parami.BInterfaceGolf());
  }

  private void removeExpired() {
    String[] arrayOfString =
        (String[])
            this.ThreadedFile.keySet()
                .toArray((Object[]) new String[this.ThreadedFile.keySet().size()]);
    for (byte b = 0; b < arrayOfString.length; b++) {
      f f = (f) this.ThreadedFile.get(arrayOfString[b]);
      if (f != null && f.f() != null && f.e() < System.currentTimeMillis() - this.f) {
        f.f().b("Offline");
        this.DInterfaceCharlie.b(f);
        this.DInterfaceCharlie.IOPropertiesUsingFile();
      }
    }
    for (f f : this.DInterfaceCharlie.b) {
      if (f.AaInterfaceHotel() != null
          && f.AaInterfaceHotel().b() != null
          && !f.AaInterfaceHotel().b().exists()) {
        String str = getKey(f.f());
        this.ThreadedFile.remove(str);
        this.DInterfaceCharlie.DInterfaceCharlie(f);
      }
    }
  }

  private void updateDeviceStatus() {
    for (f f : this.ThreadedFile.values()) {
      if (f.BInterfaceGolf() == null || f.BInterfaceGolf().DInterfaceCharlie().equals("U")) {
        DInterfaceCharlie c1 =
            AaInterfaceHotel.IOPropertiesUsingFile()
                .DInterfaceCharlie(f.b(), f.IOPropertiesUsingFile());
        if (c1.IOPropertiesUsingFile() == 0 || c1.IOPropertiesUsingFile() == 32768) {
          if (c1.b() != null) f.IOPropertiesUsingFile(c1.b());
          this.DInterfaceCharlie.b(f);
          this.DInterfaceCharlie.IOPropertiesUsingFile();
          this.DInterfaceCharlie.b();
        }
      }
    }
    for (f f : this.k) {
      DInterfaceCharlie c1 =
          AaInterfaceHotel.IOPropertiesUsingFile()
              .DInterfaceCharlie(f.b(), f.IOPropertiesUsingFile());
      if (c1.IOPropertiesUsingFile() == 0 || c1.IOPropertiesUsingFile() == 32768) {
        f.IOPropertiesUsingFile(c1.b());
        this.DInterfaceCharlie.b(f);
        this.DInterfaceCharlie.IOPropertiesUsingFile();
        this.DInterfaceCharlie.b();
      }
    }
    this.k.clear();
  }

  private void devicesUpdated() {
    if (this.AaInterfaceHotel == null || !this.AaInterfaceHotel.isAlive()) {
      this.AaInterfaceHotel = new d(this);
      this.AaInterfaceHotel.start();
    }
  }

  public void unsubscribeToOutput() {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/ContinuousIpSearchPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
