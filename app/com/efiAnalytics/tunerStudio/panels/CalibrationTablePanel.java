package com.efiAnalytics.tunerStudio.panels;

import G.R;
import G.T;
import G.aX;
import G.aY;
import G.aj;
import G.bF;
import G.bG;
import G.ba;
import G.bu;
import G.dc;
import G.m;
import G.o;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.VInterfaceHotel;
import aP.NetworkHashMap;
import bH.D;
import bH.F;
import bH.G;
import bH.X;
import bH.aa;
import bH.c;
import bH.d;
import bt.d;
import com.efiAnalytics.tuningwidgets.panels.G;
import com.efiAnalytics.tuningwidgets.panels.M;
import com.efiAnalytics.tuningwidgets.panels.aL;
import com.efiAnalytics.tuningwidgets.panels.aM;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dM;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import r.ExceptionInVPackage;
import s.ExceptionPrintstacktrace;

public class CalibrationTablePanel extends d implements bc {
  R ExceptionInVPackage = null;
  
  aX b = null;
  
  JComboBox c = new JComboBox();
  
  JComboBox d = new JComboBox();
  
  JButton e = null;
  
  HashMap NetworkHashMap = new HashMap<>();
  
  JLabel ExceptionPrintstacktrace = new JLabel("<html>" + ExceptionPrintstacktrace.b("Select settings, click") + " <br>\"" + ExceptionPrintstacktrace.b("Write to Controller") + "\"<br> &nbsp; </html>", 0);
  
  FileWriter VInterfaceHotel = null;
  
  dM i = new dM();
  
  JPanel j = new JPanel();
  
  d k = new d();
  
  boolean l = false;
  
  boolean m = true;
  
  boolean n = true;
  
  public J(R paramR, aX paramaX) {
    this.ExceptionInVPackage = paramR;
    this.b = paramaX;
    ExceptionInVPackage(this);
    setLayout(new BorderLayout());
    if (paramaX.O().size() > 0) {
      aj aj = paramR.e().b(paramaX.O().get(0));
      if (aj != null && aj.d() != null) {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu(ExceptionPrintstacktrace.b("Help"));
        jMenuBar.add(jMenu);
        JMenuItem jMenuItem = new JMenuItem(aj.d());
        jMenuItem.addActionListener(new K(this));
        jMenu.add(jMenuItem);
        add("North", jMenuBar);
      } else {
        D.c(ExceptionPrintstacktrace.b("unable to load help topic ") + (String)paramaX.O().get(0));
      } 
    } 
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b(paramaX.M())));
    jPanel1.setLayout(new BoxLayout(jPanel1, 1));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(2, 2));
    if (paramaX.ExceptionInVPackage() > 1)
      jPanel1.add(jPanel2); 
    if (paramaX.ExceptionInVPackage() == 0) {
      bV.d(ExceptionPrintstacktrace.b("Table identifier isn't defined in the ecu configuration file") + "\n" + ExceptionPrintstacktrace.b("for reference table") + ": " + paramaX.aL(), (Component)this);
      return;
    } 
    if (paramaX.ExceptionInVPackage() > 0) {
      jPanel2.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Sensor Table")));
      this.c.setEditable(false);
      jPanel2.add("Center", this.c);
      Iterator<aY> iterator1 = paramaX.b();
      while (iterator1.hasNext()) {
        aY aY = iterator1.next();
        this.c.addItem(new S(this, aY));
      } 
      this.c.addItemListener(new L(this));
    } 
    if (paramaX.j() > 0) {
      JPanel jPanel = new JPanel();
      jPanel.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Table Input Solution")));
      jPanel.setLayout(new BorderLayout(2, 2));
      jPanel.add("West", new JLabel(ExceptionPrintstacktrace.b(paramaX.i())));
      jPanel.add("Center", this.d);
      if (paramaX.j() > 1)
        jPanel1.add(jPanel); 
      Iterator<ba> iterator1 = paramaX.NetworkHashMap();
      while (iterator1.hasNext()) {
        ba ba = iterator1.next();
        this.d.addItem(new R(this, ba));
      } 
      this.d.addItemListener(new M(this));
    } 
    this.j.setLayout(new CardLayout());
    jPanel1.add(this.j);
    Iterator<bF> iterator = paramaX.ExceptionPrintstacktrace();
    while (iterator.hasNext()) {
      bF bF = iterator.next();
      try {
        aL aL = ExceptionInVPackage(bF);
        this.j.add((Component)aL, bF.ExceptionPrintstacktrace());
        this.NetworkHashMap.put(bF.ExceptionPrintstacktrace(), aL);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage(ExceptionInVPackage.getMessage(), (Exception)ExceptionInVPackage, this);
      } 
    } 
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(0, 1));
    jPanel3.add(this.ExceptionPrintstacktrace);
    this.ExceptionPrintstacktrace.setMinimumSize(new Dimension(320, 60));
    this.ExceptionPrintstacktrace.setPreferredSize(new Dimension(320, 60));
    jPanel1.add(jPanel3);
    jPanel1.add((Component)this.i);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new FlowLayout(2));
    this.e = new JButton(ExceptionPrintstacktrace.b("Write to Controller"));
    this.e.addActionListener(new N(this));
    jPanel4.add(this.e);
    jPanel1.add(jPanel4);
    add("Center", jPanel1);
    d();
    this.m = (paramR.O().P() == -1 && paramR.O().x() == paramR.O().P());
    VInterfaceHotel();
    if (this.n) {
      ExceptionInVPackage();
    } else {
      D.b("Reference table Panel cannot set selection as not connected to ECU directly.");
    } 
  }
  
  public final void ExceptionInVPackage() {
    if (this.n) {
      byte[] arrayOfByte = ExceptionInVPackage(e());
      if (arrayOfByte != null) {
        aa aa = new aa();
        aa.ExceptionInVPackage();
        ba ba = ExceptionInVPackage(arrayOfByte);
        aa.b();
        D.c("Found solution:" + ((ba == null) ? "No Match" : ba.ExceptionInVPackage()));
        D.c(" Time to find solution:" + aa.c());
        ExceptionInVPackage(ba);
      } 
    } 
  }
  
  private byte[] ExceptionInVPackage(String paramString) {
    dc dc = new dc();
    int i = c.d(paramString);
    int j = this.b.c() * this.b.d();
    try {
      m m = m.ExceptionInVPackage(this.ExceptionInVPackage.O(), i, j);
      if (m != null) {
        m.c(this.m);
        o o = dc.ExceptionInVPackage(this.ExceptionInVPackage, m, 600);
        if (o.ExceptionInVPackage() == 1)
          return c.ExceptionInVPackage(o.e()); 
        this.n = false;
        return null;
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      bV.d(ExceptionPrintstacktrace.getLocalizedMessage(), (Component)this);
      Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    return null;
  }
  
  private ba ExceptionInVPackage(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < this.d.getItemCount(); b++) {
      R r = this.d.getItemAt(b);
      ba ba = r.ExceptionInVPackage();
      byte[] arrayOfByte = b(ba);
      if (arrayOfByte != null && c.b(paramArrayOfbyte, arrayOfByte)) {
        D.c("Found solution. Solution Checksum: " + c.d(arrayOfByte) + ", controller checksum: " + c.d(paramArrayOfbyte));
        return ba;
      } 
      if (arrayOfByte != null) {
        D.c("Solution " + ba.ExceptionInVPackage() + " doesn't match. Solution Checksum: " + c.d(arrayOfByte) + ", controller checksum: " + c.d(paramArrayOfbyte));
      } else {
        D.c("Can not calculate solution for: " + ba.ExceptionInVPackage());
      } 
    } 
    return null;
  }
  
  private byte[] b(ba paramba) {
    try {
      int[] arrayOfInt = c(paramba);
      this.k.reset();
      byte[] arrayOfByte = c.ExceptionInVPackage(arrayOfInt);
      this.k.update(arrayOfByte);
      null = new byte[4];
      return c.ExceptionInVPackage((int)this.k.getValue(), null, true);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public void ExceptionInVPackage(ba paramba) {
    if (paramba != null)
      for (byte b = 0; b < this.d.getItemCount(); b++) {
        R r = this.d.getItemAt(b);
        ba ba1 = r.ExceptionInVPackage();
        if (ba1.equals(paramba))
          this.d.setSelectedIndex(b); 
      }  
  }
  
  private void d() {
    R r = (R)this.d.getSelectedItem();
    if (r == null)
      return; 
    ba ba = r.ExceptionInVPackage();
    if (ba == null)
      return; 
    if (this.NetworkHashMap.get(ba.b()) != null) {
      CardLayout cardLayout = (CardLayout)this.j.getLayout();
      cardLayout.show(this.j, ba.b());
    } 
    for (aL aL : this.NetworkHashMap.values())
      aL.setEnabled((ba.b() != null && this.NetworkHashMap.get(ba.b()) != null && aL.equals(this.NetworkHashMap.get(ba.b())))); 
  }
  
  private String e() {
    aY aY = ((S)this.c.getSelectedItem()).ExceptionInVPackage();
    return aY.ExceptionInVPackage();
  }
  
  public void b() {
    if (!this.ExceptionInVPackage.C().q()) {
      bV.d(ExceptionPrintstacktrace.b("Not currently Online!") + "\n" + ExceptionPrintstacktrace.b("You must be connected to the controller to write this calibration table."), (Component)this);
      return;
    } 
    this.l = true;
    k();
    try {
      int[] arrayOfInt = NetworkHashMap();
      boolean bool = (this.ExceptionInVPackage.O().ax().length() > 1) ? true : false;
      int i = this.ExceptionInVPackage.O().ay();
      if (!this.ExceptionInVPackage.equals(T.ExceptionInVPackage().c())) {
        int j = T.ExceptionInVPackage().c().O().G(0);
        i = (j < i) ? j : i;
      } 
      if (bool) {
        ArrayList<m> arrayList = new ArrayList();
        int j = this.b.VInterfaceHotel();
        int k = 0;
        byte[] arrayOfByte = this.ExceptionInVPackage.O().e(this.ExceptionInVPackage.O().ax()).d();
        int[] arrayOfInt1 = new int[2];
        while (k < arrayOfInt.length) {
          int n = (arrayOfInt.length - k < i) ? (arrayOfInt.length - k) : i;
          int[] arrayOfInt2 = new int[n + 7];
          arrayOfInt2[0] = arrayOfByte[0];
          arrayOfInt2[1] = arrayOfByte[1];
          arrayOfInt2[2] = c.d(e());
          if (arrayOfByte.length > 3)
            j = c.ExceptionInVPackage(arrayOfByte, 3, 2, true, false); 
          arrayOfInt1 = c.ExceptionInVPackage(k + j, arrayOfInt1, true);
          arrayOfInt2[3] = arrayOfInt1[0];
          arrayOfInt2[4] = arrayOfInt1[1];
          arrayOfInt1 = c.ExceptionInVPackage(n, arrayOfInt1, true);
          arrayOfInt2[5] = arrayOfInt1[0];
          arrayOfInt2[6] = arrayOfInt1[1];
          System.arraycopy(arrayOfInt, k, arrayOfInt2, 7, n);
          m m1 = m.ExceptionInVPackage(this.ExceptionInVPackage.O(), arrayOfInt2);
          m1.ExceptionInVPackage(this.ExceptionInVPackage.O().K());
          arrayList.add(m1);
          m1.ExceptionInVPackage(600);
          k += n;
        } 
        m m = m.ExceptionInVPackage(this.ExceptionInVPackage.O(), arrayList);
        O o = new O(this);
        if (arrayList.size() == 1)
          ((m)arrayList.get(0)).b(o); 
        m.b(o);
        G.J j1 = this.ExceptionInVPackage.C();
        j1.b(m);
      } else {
        m m = m.ExceptionInVPackage(this.ExceptionInVPackage.O(), e(), arrayOfInt);
        m.ExceptionInVPackage(this.ExceptionInVPackage.O().K());
        P p = new P(this);
        m.VInterfaceHotel(this.b.d());
        m.b(p);
        G.J j = this.ExceptionInVPackage.C();
        j.b(m);
      } 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getMessage(), (Component)this);
      c("Correct Errors.");
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      bV.d("Configuration Error trying to write reference table:\n" + ExceptionPrintstacktrace.getMessage(), (Component)this);
      c("Correct Errors.");
    } catch (Exception exception) {
      bV.d("Application Error trying to write reference table.\nSee App Debug Log for more info", (Component)this);
      c("Contact Support.");
      exception.printStackTrace();
    } 
    this.l = false;
  }
  
  private int[] NetworkHashMap() {
    R r = (R)this.d.getSelectedItem();
    ba ba = r.ExceptionInVPackage();
    return c(ba);
  }
  
  private int[] c(ba paramba) {
    String str = paramba.b();
    if (paramba.b().trim().length() == 0)
      throw new ExceptionInVPackage("You must select ExceptionInVPackage valid input solution to generate table."); 
    double[] arrayOfDouble = null;
    if (this.NetworkHashMap.get(str) != null) {
      aL aL = (aL)this.NetworkHashMap.get(str);
      b("//-- generated using refTable Generator:" + str + "\n");
      b("//-- Table Identifier:" + e());
      b(aL.ExceptionInVPackage() + "\n");
      b("//----------------------------------------------------------//\n");
      arrayOfDouble = aL.ExceptionInVPackage(this.b.c());
    } else {
      arrayOfDouble = new double[this.b.c()];
      b("//-- generated using formula:" + str + "\n");
      b("//-- Table Identifier:" + e());
      b("\n\n");
      for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
        String str1 = str;
        if (str1.indexOf("table(") != -1)
          str1 = ExceptionInVPackage(str1, b1); 
        str1 = X.b(str1, "adcValue", "" + b1);
        try {
          arrayOfDouble[b1] = G.ExceptionPrintstacktrace(str1);
        } catch (VInterfaceHotel VInterfaceHotel) {
          throw new ExceptionInVPackage("Unable to evaluate " + str1 + "\nfor solution: " + str);
        } 
      } 
    } 
    b("ADC \tValue \tMSVal \tvolts\n");
    double d1 = this.b.c(e());
    double d2 = this.b.d(e());
    double d3 = this.b.e(e());
    int[] arrayOfInt = new int[arrayOfDouble.length * this.b.d()];
    byte b = 0;
    while (b < arrayOfInt.length) {
      if (arrayOfDouble[b / this.b.d()] > d2 || arrayOfDouble[b / this.b.d()] < d1)
        arrayOfDouble[b / this.b.d()] = d3; 
      int i = (int)Math.round(arrayOfDouble[b / this.b.d()] * this.b.k());
      if (this.b.d() > 1) {
        if (i > Math.pow(2.0D, (8 * this.b.d())) - 1.0D)
          i = (int)(Math.pow(2.0D, (8 * this.b.d())) - 1.0D); 
      } else if (i > Math.pow(2.0D, (8 * this.b.d()))) {
        i = (int)(Math.pow(2.0D, (8 * this.b.d())) - 1.0D);
      } 
      b((b / this.b.d()) + "\t" + X.b(arrayOfDouble[b / this.b.d()], 2) + "\t" + i + " \t" + X.b(b * 5.0D / arrayOfInt.length, 3) + "\n");
      byte[] arrayOfByte = new byte[this.b.d()];
      arrayOfByte = c.ExceptionInVPackage(i, arrayOfByte, this.ExceptionInVPackage.O().e());
      for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
        arrayOfInt[b++] = arrayOfByte[b1]; 
    } 
    return arrayOfInt;
  }
  
  private void ExceptionPrintstacktrace() {
    Q q = new Q(this);
    for (aL aL : this.NetworkHashMap.values()) {
      if (aL.isShowing())
        aL.ExceptionInVPackage(q); 
    } 
  }
  
  private void VInterfaceHotel() {
    Q q = new Q(this);
    for (aL aL : this.NetworkHashMap.values())
      aL.b(q); 
  }
  
  private void b(String paramString) {
    if (this.l) {
      FileWriter fileWriter = i();
      if (fileWriter != null)
        try {
          fileWriter.write(paramString);
        } catch (IOException iOException) {
          D.c(paramString);
        }  
    } 
  }
  
  private FileWriter i() {
    if (this.VInterfaceHotel == null) {
      String str = this.ExceptionInVPackage.F() + File.separator + this.b.aL() + ".log";
      File file = new File(str);
      if (file.exists())
        file.delete(); 
      try {
        this.VInterfaceHotel = new FileWriter(str);
      } catch (IOException iOException) {
        D.ExceptionInVPackage("Unable to open ReferenceTable log file:\n" + str);
        D.ExceptionInVPackage("Will writer to this log instead");
        iOException.printStackTrace();
      } 
    } 
    return this.VInterfaceHotel;
  }
  
  private void j() {
    if (this.VInterfaceHotel != null)
      try {
        this.VInterfaceHotel.close();
        this.VInterfaceHotel = null;
      } catch (IOException iOException) {
        D.c("Failed to close Reference Table log file");
      }  
  }
  
  private String ExceptionInVPackage(String paramString, int paramInt) {
    double d1;
    String str1 = paramString.substring(0, paramString.indexOf("table("));
    int i = paramString.indexOf("(", paramString.indexOf("table")) + 1;
    int j = paramString.indexOf(",", i);
    String str2 = paramString.substring(i, j).trim();
    str2 = X.b(str2, "adcValue", "" + paramInt);
    try {
      d1 = G.ExceptionPrintstacktrace(str2);
    } catch (VInterfaceHotel VInterfaceHotel) {
      throw new ExceptionInVPackage("Unable to evaluate expression: " + str2 + "\nin solution formula: " + paramString);
    } 
    int k = paramString.indexOf(")", j);
    String str3 = paramString.substring(j + 1, k).trim();
    String str4 = T.ExceptionInVPackage().c().F();
    str3 = X.b(str3, "\"", "");
    String str5 = paramString.substring(k + 1);
    try {
      F NetworkHashMap = F.b(str4, str3);
      double d2 = NetworkHashMap.ExceptionInVPackage(d1);
      str1 = str1 + "" + d2;
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Error loading inc Mapping File:" + str3, iOException);
    } catch (Exception exception) {
      throw new ExceptionInVPackage("Error parsing inc Mapping File:" + str3 + "\n\t" + exception.getMessage());
    } 
    return str1 + str5;
  }
  
  private void k() {
    this.e.setEnabled(false);
    this.ExceptionPrintstacktrace.setText("Writing to controller, Please wait...");
    Calendar calendar = Calendar.getInstance();
    b("//------------------------------------------------------------------------------\n");
    b("//--  Generated by " + ExceptionInVPackage.b + " \n");
    b("//--  Date: " + (calendar.get(2) + 1) + "-" + calendar.get(5) + "-" + calendar.get(1) + "\n");
    b("//--  Time: " + calendar.get(11) + ":" + calendar.get(12) + "\n");
    b("//--  This file merely records what was sent to your Controller,        \n");
    b("//--  and may be deleted at any time.                                                    \n");
    b("//--  Selected type: " + this.c.getSelectedItem() + " \n");
    b("//------------------------------------------------------------------------------\n");
    b("\n");
  }
  
  private void c(String paramString) {
    this.e.setEnabled(true);
    paramString = X.b(paramString, "\n", "<br>");
    this.ExceptionPrintstacktrace.setText("<html>" + paramString + "</html>");
    j();
  }
  
  public void c() {
    NetworkHashMap.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, this.b.O().get(0), bV.ExceptionInVPackage((Component)this));
  }
  
  private aL ExceptionInVPackage(bF parambF) {
    try {
      if (parambF.ExceptionPrintstacktrace().equals("linearGenerator"))
        return (aL)new M((bu)parambF); 
      if (parambF.ExceptionPrintstacktrace().equals("thermGenerator"))
        return (aL)new aM((bG)parambF); 
      if (parambF.ExceptionPrintstacktrace().equals("fileBrowseGenerator"))
        return (aL)new G(parambF.VInterfaceHotel()); 
    } catch (Exception exception) {}
    throw new ExceptionInVPackage("Table Generator type '" + parambF.ExceptionPrintstacktrace() + "'\n not understood for table generator '" + parambF.VInterfaceHotel() + "' and will not be displayed.");
  }
  
  public void close() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */