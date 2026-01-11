package com.efiAnalytics.tunerStudio.panels;

import G.R;
import G.T;
import G.SerializableImplUsingArrayList;
import G.SerializableImplEquals;
import G.GComponentAj;
import G.AbstractInGPackage;
import G.GInterfaceBg;
import G.Tostring;
import G.GComponentBu;
import G.GInterfaceDc;
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
  
  SerializableImplUsingArrayList b = null;
  
  JComboBox c = new JComboBox();
  
  JComboBox d = new JComboBox();
  
  JButton e = null;
  
  HashMap NetworkHashMap = new HashMap<>();
  
  JLabel ExceptionPrintstacktrace = new JLabel("<html>" + ExceptionPrintstacktrace.b("Select settings, click") + " <br>\"" + ExceptionPrintstacktrace.b("Write to Controller") + "\"<br> &nbsp; </html>", 0);
  
  FileWriter VInterfaceHotel = null;
  
  dM i = new CalibrationTablePanel();
  
  JPanel j = new JPanel();
  
  d k = new CalibrationTablePanel();
  
  boolean l = false;
  
  boolean m = true;
  
  boolean n = true;
  
  public CalibrationTablePanel(R paramR, SerializableImplUsingArrayList paramaX) {
    this.ExceptionInVPackage = paramR;
    this.b = paramaX;
    ExceptionInVPackage(this);
    CalibrationTablePanel(new BorderLayout());
    if (paramaX.O().size() > 0) {
      GComponentAj GComponentAj = paramR.e().b(paramaX.O().get(0));
      if (GComponentAj != null && GComponentAj.d() != null) {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu(ExceptionPrintstacktrace.b("Help"));
        jMenuBar.add(jMenu);
        JMenuItem jMenuItem = new JMenuItem(GComponentAj.d());
        jMenuItem.addActionListener(new CalibrationTablePanel(this));
        jMenu.add(jMenuItem);
        CalibrationTablePanel("North", jMenuBar);
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
      Iterator<SerializableImplEquals> iterator1 = paramaX.b();
      while (iterator1.hasNext()) {
        SerializableImplEquals SerializableImplEquals = iterator1.next();
        this.c.addItem(new CalibrationTablePanel(this, SerializableImplEquals));
      } 
      this.c.addItemListener(new CalibrationTablePanel(this));
    } 
    if (paramaX.j() > 0) {
      JPanel jPanel = new JPanel();
      jPanel.setBorder(BorderFactory.createTitledBorder(ExceptionPrintstacktrace.b("Table Input Solution")));
      jPanel.setLayout(new BorderLayout(2, 2));
      jPanel.add("West", new JLabel(ExceptionPrintstacktrace.b(paramaX.i())));
      jPanel.add("Center", this.d);
      if (paramaX.j() > 1)
        jPanel1.add(jPanel); 
      Iterator<Tostring> iterator1 = paramaX.NetworkHashMap();
      while (iterator1.hasNext()) {
        Tostring Tostring = iterator1.next();
        this.d.addItem(new CalibrationTablePanel(this, Tostring));
      } 
      this.d.addItemListener(new CalibrationTablePanel(this));
    } 
    this.j.setLayout(new CardLayout());
    jPanel1.add(this.j);
    Iterator<AbstractInGPackage> iterator = paramaX.ExceptionPrintstacktrace();
    while (iterator.hasNext()) {
      AbstractInGPackage AbstractInGPackage = iterator.next();
      try {
        aL aL = ExceptionInVPackage(AbstractInGPackage);
        this.j.add((Component)aL, AbstractInGPackage.ExceptionPrintstacktrace());
        this.NetworkHashMap.put(AbstractInGPackage.ExceptionPrintstacktrace(), aL);
      } CalibrationTablePanel(ExceptionInVPackage ExceptionInVPackage) {
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
    this.e.addActionListener(new CalibrationTablePanel(this));
    jPanel4.add(this.e);
    jPanel1.add(jPanel4);
    CalibrationTablePanel("Center", jPanel1);
    CalibrationTablePanel();
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
        aa aa = new CalibrationTablePanel();
        aa.ExceptionInVPackage();
        Tostring Tostring = ExceptionInVPackage(arrayOfByte);
        aa.b();
        D.c("Found solution:" + ((Tostring == null) ? "No Match" : Tostring.ExceptionInVPackage()));
        D.c(" Time to find solution:" + aa.c());
        ExceptionInVPackage(Tostring);
      } 
    } 
  }
  
  private byte[] ExceptionInVPackage(String paramString) {
    GInterfaceDc GInterfaceDc = new GInterfaceDc();
    int i = c.d(paramString);
    int j = this.b.c() * this.b.d();
    try {
      m m = m.ExceptionInVPackage(this.ExceptionInVPackage.O(), i, j);
      if (m != null) {
        m.c(this.m);
        o o = GInterfaceDc.ExceptionInVPackage(this.ExceptionInVPackage, m, 600);
        if (o.ExceptionInVPackage() == 1)
          return c.ExceptionInVPackage(o.e()); 
        this.n = false;
        return null;
      } 
    } CalibrationTablePanel(ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      bV.d(ExceptionPrintstacktrace.getLocalizedMessage(), (Component)this);
      Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    return null;
  }
  
  private Tostring ExceptionInVPackage(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < this.d.getItemCount(); b++) {
      R r = this.d.getItemAt(b);
      Tostring Tostring = r.ExceptionInVPackage();
      byte[] arrayOfByte = CalibrationTablePanel(Tostring);
      if (arrayOfByte != null && c.b(paramArrayOfbyte, arrayOfByte)) {
        D.c("Found solution. Solution Checksum: " + c.d(arrayOfByte) + ", controller checksum: " + c.d(paramArrayOfbyte));
        return Tostring;
      } 
      if (arrayOfByte != null) {
        D.c("Solution " + Tostring.ExceptionInVPackage() + " doesn't match. Solution Checksum: " + c.d(arrayOfByte) + ", controller checksum: " + c.d(paramArrayOfbyte));
      } else {
        D.c("Can not calculate solution for: " + Tostring.ExceptionInVPackage());
      } 
    } 
    return null;
  }
  
  private byte[] CalibrationTablePanel(Tostring paramba) {
    try {
      int[] arrayOfInt = CalibrationTablePanel(paramba);
      this.k.reset();
      byte[] arrayOfByte = c.ExceptionInVPackage(arrayOfInt);
      this.k.update(arrayOfByte);
      null = new byte[4];
      return c.ExceptionInVPackage((int)this.k.getValue(), null, true);
    } CalibrationTablePanel(Exception exception) {
      return null;
    } 
  }
  
  public void ExceptionInVPackage(Tostring paramba) {
    if (paramba != null)
      for (byte b = 0; b < this.d.getItemCount(); b++) {
        R r = this.d.getItemAt(b);
        Tostring ba1 = r.ExceptionInVPackage();
        if (ba1.equals(paramba))
          this.d.setSelectedIndex(b); 
      }  
  }
  
  private void CalibrationTablePanel() {
    R r = (R)this.d.getSelectedItem();
    if (r == null)
      return; 
    Tostring Tostring = r.ExceptionInVPackage();
    if (Tostring == null)
      return; 
    if (this.NetworkHashMap.get(Tostring.b()) != null) {
      CardLayout cardLayout = (CardLayout)this.j.getLayout();
      cardLayout.show(this.j, Tostring.b());
    } 
    for (aL aL : this.NetworkHashMap.values())
      aL.setEnabled((Tostring.b() != null && this.NetworkHashMap.get(Tostring.b()) != null && aL.equals(this.NetworkHashMap.get(Tostring.b())))); 
  }
  
  private String CalibrationTablePanel() {
    SerializableImplEquals SerializableImplEquals = ((S)this.c.getSelectedItem()).ExceptionInVPackage();
    return SerializableImplEquals.ExceptionInVPackage();
  }
  
  public void CalibrationTablePanel() {
    if (!this.ExceptionInVPackage.C().q()) {
      bV.d(ExceptionPrintstacktrace.b("Not currently Online!") + "\n" + ExceptionPrintstacktrace.b("You must be connected to the controller to write this calibration table."), (Component)this);
      return;
    } 
    this.l = true;
    CalibrationTablePanel();
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
        O o = new CalibrationTablePanel(this);
        if (arrayList.size() == 1)
          ((m)arrayList.get(0)).b(o); 
        m.b(o);
        G.J j1 = this.ExceptionInVPackage.C();
        j1.b(m);
      } else {
        m m = m.ExceptionInVPackage(this.ExceptionInVPackage.O(), CalibrationTablePanel(), arrayOfInt);
        m.ExceptionInVPackage(this.ExceptionInVPackage.O().K());
        P p = new CalibrationTablePanel(this);
        m.VInterfaceHotel(this.b.d());
        m.b(p);
        G.J j = this.ExceptionInVPackage.C();
        j.b(m);
      } 
    } CalibrationTablePanel(ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getMessage(), (Component)this);
      CalibrationTablePanel("Correct Errors.");
    } CalibrationTablePanel(ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      bV.d("Configuration Error trying to write reference table:\n" + ExceptionPrintstacktrace.getMessage(), (Component)this);
      CalibrationTablePanel("Correct Errors.");
    } CalibrationTablePanel(Exception exception) {
      bV.d("Application Error trying to write reference table.\nSee App Debug Log for more info", (Component)this);
      CalibrationTablePanel("Contact Support.");
      exception.printStackTrace();
    } 
    this.l = false;
  }
  
  private int[] NetworkHashMap() {
    R r = (R)this.d.getSelectedItem();
    Tostring Tostring = r.ExceptionInVPackage();
    return CalibrationTablePanel(Tostring);
  }
  
  private int[] CalibrationTablePanel(Tostring paramba) {
    String str = paramba.b();
    if (paramba.b().trim().length() == 0)
      throw new ExceptionInVPackage("You must select ExceptionInVPackage valid input solution to generate table."); 
    double[] arrayOfDouble = null;
    if (this.NetworkHashMap.get(str) != null) {
      aL aL = (aL)this.NetworkHashMap.get(str);
      CalibrationTablePanel("//-- generated using refTable Generator:" + str + "\n");
      CalibrationTablePanel("//-- Table Identifier:" + CalibrationTablePanel());
      CalibrationTablePanel(aL.ExceptionInVPackage() + "\n");
      CalibrationTablePanel("//----------------------------------------------------------//\n");
      arrayOfDouble = aL.ExceptionInVPackage(this.b.c());
    } else {
      arrayOfDouble = new double[this.b.c()];
      CalibrationTablePanel("//-- generated using formula:" + str + "\n");
      CalibrationTablePanel("//-- Table Identifier:" + CalibrationTablePanel());
      CalibrationTablePanel("\n\n");
      for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
        String str1 = str;
        if (str1.indexOf("table(") != -1)
          str1 = ExceptionInVPackage(str1, b1); 
        str1 = X.b(str1, "adcValue", "" + b1);
        try {
          arrayOfDouble[b1] = G.ExceptionPrintstacktrace(str1);
        } CalibrationTablePanel(VInterfaceHotel VInterfaceHotel) {
          throw new ExceptionInVPackage("Unable to evaluate " + str1 + "\nfor solution: " + str);
        } 
      } 
    } 
    CalibrationTablePanel("ADC \tValue \tMSVal \tvolts\n");
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
      CalibrationTablePanel((b / this.b.d()) + "\t" + X.b(arrayOfDouble[b / this.b.d()], 2) + "\t" + i + " \t" + X.b(b * 5.0D / arrayOfInt.length, 3) + "\n");
      byte[] arrayOfByte = new byte[this.b.d()];
      arrayOfByte = c.ExceptionInVPackage(i, arrayOfByte, this.ExceptionInVPackage.O().e());
      for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
        arrayOfInt[b++] = arrayOfByte[b1]; 
    } 
    return arrayOfInt;
  }
  
  private void ExceptionPrintstacktrace() {
    Q q = new CalibrationTablePanel(this);
    for (aL aL : this.NetworkHashMap.values()) {
      if (aL.isShowing())
        aL.ExceptionInVPackage(q); 
    } 
  }
  
  private void VInterfaceHotel() {
    Q q = new CalibrationTablePanel(this);
    for (aL aL : this.NetworkHashMap.values())
      aL.b(q); 
  }
  
  private void CalibrationTablePanel(String paramString) {
    if (this.l) {
      FileWriter fileWriter = CalibrationTablePanel();
      if (fileWriter != null)
        try {
          fileWriter.write(paramString);
        } CalibrationTablePanel(IOException iOException) {
          D.c(paramString);
        }  
    } 
  }
  
  private FileWriter CalibrationTablePanel() {
    if (this.VInterfaceHotel == null) {
      String str = this.ExceptionInVPackage.F() + File.separator + this.b.aL() + ".log";
      File file = new File(str);
      if (file.exists())
        file.delete(); 
      try {
        this.VInterfaceHotel = new FileWriter(str);
      } CalibrationTablePanel(IOException iOException) {
        D.ExceptionInVPackage("Unable to open ReferenceTable log file:\n" + str);
        D.ExceptionInVPackage("Will writer to this log instead");
        iOException.printStackTrace();
      } 
    } 
    return this.VInterfaceHotel;
  }
  
  private void CalibrationTablePanel() {
    if (this.VInterfaceHotel != null)
      try {
        this.VInterfaceHotel.close();
        this.VInterfaceHotel = null;
      } CalibrationTablePanel(IOException iOException) {
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
    } CalibrationTablePanel(VInterfaceHotel VInterfaceHotel) {
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
    } CalibrationTablePanel(IOException iOException) {
      throw new ExceptionInVPackage("Error loading inc Mapping File:" + str3, iOException);
    } CalibrationTablePanel(Exception exception) {
      throw new ExceptionInVPackage("Error parsing inc Mapping File:" + str3 + "\n\t" + exception.getMessage());
    } 
    return str1 + str5;
  }
  
  private void CalibrationTablePanel() {
    this.e.setEnabled(false);
    this.ExceptionPrintstacktrace.setText("Writing to controller, Please wait...");
    Calendar calendar = Calendar.getInstance();
    CalibrationTablePanel("//------------------------------------------------------------------------------\n");
    CalibrationTablePanel("//--  Generated by " + ExceptionInVPackage.b + " \n");
    CalibrationTablePanel("//--  Date: " + (calendar.get(2) + 1) + "-" + calendar.get(5) + "-" + calendar.get(1) + "\n");
    CalibrationTablePanel("//--  Time: " + calendar.get(11) + ":" + calendar.get(12) + "\n");
    CalibrationTablePanel("//--  This file merely records what was sent to your Controller,        \n");
    CalibrationTablePanel("//--  and may be deleted at any time.                                                    \n");
    CalibrationTablePanel("//--  Selected type: " + this.c.getSelectedItem() + " \n");
    CalibrationTablePanel("//------------------------------------------------------------------------------\n");
    CalibrationTablePanel("\n");
  }
  
  private void CalibrationTablePanel(String paramString) {
    this.e.setEnabled(true);
    paramString = X.b(paramString, "\n", "<br>");
    this.ExceptionPrintstacktrace.setText("<html>" + paramString + "</html>");
    CalibrationTablePanel();
  }
  
  public void CalibrationTablePanel() {
    NetworkHashMap.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, this.b.O().get(0), bV.ExceptionInVPackage((Component)this));
  }
  
  private aL ExceptionInVPackage(AbstractInGPackage parambF) {
    try {
      if (parambF.ExceptionPrintstacktrace().equals("linearGenerator"))
        return (aL)new CalibrationTablePanel((GComponentBu)parambF); 
      if (parambF.ExceptionPrintstacktrace().equals("thermGenerator"))
        return (aL)new CalibrationTablePanel((GInterfaceBg)parambF); 
      if (parambF.ExceptionPrintstacktrace().equals("fileBrowseGenerator"))
        return (aL)new CalibrationTablePanel(parambF.VInterfaceHotel()); 
    } CalibrationTablePanel(Exception exception) {}
    throw new ExceptionInVPackage("Table Generator type '" + parambF.ExceptionPrintstacktrace() + "'\n not understood for table generator '" + parambF.VInterfaceHotel() + "' and will not be displayed.");
  }
  
  public void CalibrationTablePanel() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */