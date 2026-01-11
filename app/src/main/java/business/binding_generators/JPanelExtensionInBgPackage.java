package business.binding_generators;

import G.R;
import G.T;
import G.IOInGPackage;
import G.GInterfaceBf;
import W.d;
import aP.NetworkHashMap;
import aa.AaInterfaceCharlie;
import aa.NetworkHashMap;
import bH.D;
import bH.t;
import com.efiAnalytics.apps.ts.tuningViews.F;
import com.efiAnalytics.apps.ts.tuningViews.G;
import com.efiAnalytics.apps.ts.tuningViews.b;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.ct;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import r.ThreadedFile;
import s.SComponentGolf;
import v.SComponentGolf;

public class JPanelExtensionInBgPackage extends JPanel implements t {
  R a;
  
  o b;
  
  n AaInterfaceCharlie;
  
  k d = new k(this);
  
  Map e = new HashMap<>();
  
  JDialog NetworkHashMap = null;
  
  JButton SComponentGolf;
  
  JButton h;
  
  JButton i;
  
  JButton ThreadedFile;
  
  JButton k;
  
  JButton l;
  
  public JPanelExtensionInBgPackage(R paramR) {
    this.a = paramR;
    b();
    setCursor(Cursor.getPredefinedCursor(3));
    b b = new b(this);
    SwingUtilities.invokeLater(b);
  }
  
  private void b() {
    setLayout(new BorderLayout());
    this.b = new o();
    this.b.a(this);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    jScrollPane.setPreferredSize(eJ.a(320, 200));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("Center", jScrollPane);
    this.AaInterfaceCharlie = new n();
    jPanel.add("North", AaInterfaceCharlie());
    try {
      JPanel jPanel1 = new JPanel();
      Dimension dimension = eJ.a(28, 28);
      jPanel1.setLayout(new BoxLayout(jPanel1, 1));
      Image image = cO.a().a(cO.ah, this, 24);
      ImageIcon imageIcon = new ImageIcon(image);
      this.k = new JButton(imageIcon);
      this.k.setPreferredSize(dimension);
      jPanel1.add(this.k);
      this.k.addActionListener(new AaInterfaceCharlie(this));
      image = cO.a().a(cO.ai, this, 24);
      imageIcon = new ImageIcon(image);
      this.l = new JButton(imageIcon);
      this.l.setPreferredSize(dimension);
      jPanel1.add(this.l);
      this.l.addActionListener(new d(this));
      jPanel.add("East", jPanel1);
    } catch (Exception exception) {
      D.a("Failed to create up/down buttons.");
      D.a(exception);
    } 
    add("Center", jPanel);
    this.d.setMinimumSize(eJ.a(640, 320));
    this.d.setPreferredSize(eJ.a(640, 320));
    this.d.setBorder(BorderFactory.createLoweredBevelBorder());
    add("South", this.d);
  }
  
  private JPanel AaInterfaceCharlie() {
    int i = eJ.a(30);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(1, 0, eJ.a(2), eJ.a(2)));
    try {
      Image image = cO.a().a(cO.I, this);
      ImageIcon imageIcon = new ImageIcon(image);
      this.SComponentGolf = new JButton(imageIcon);
      this.SComponentGolf.setToolTipText(SComponentGolf.b("Create New Component"));
      this.SComponentGolf.setPreferredSize(new Dimension(i, i));
      this.SComponentGolf.addActionListener(new e(this));
      jPanel1.add(this.SComponentGolf);
      image = cO.a().a(cO.s, this);
      imageIcon = new ImageIcon(image);
      this.h = new JButton(imageIcon);
      this.h.setToolTipText(SComponentGolf.b("Edit Selected Component"));
      this.h.setPreferredSize(new Dimension(i, i));
      this.h.addActionListener(new NetworkHashMap(this));
      jPanel1.add(this.h);
      image = cO.a().a(cO.e, this);
      imageIcon = new ImageIcon(image);
      this.i = new JButton(imageIcon);
      this.i.setToolTipText(SComponentGolf.b("Delete Selected Component"));
      this.i.setPreferredSize(new Dimension(i, i));
      this.i.addActionListener(new SComponentGolf(this));
      jPanel1.add(this.i);
      jPanel1.add(new JLabel());
      image = cO.a().a(cO.P, this);
      imageIcon = new ImageIcon(image);
      this.ThreadedFile = new JButton(imageIcon);
      this.ThreadedFile.setToolTipText(SComponentGolf.b("Save Configuration"));
      this.ThreadedFile.setPreferredSize(new Dimension(i, i));
      this.ThreadedFile.addActionListener(new h(this));
      jPanel1.add(this.ThreadedFile);
    } catch (V.a a1) {
      bV.d(a1.getLocalizedMessage(), this);
    } 
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add(jPanel1, "West");
    return jPanel2;
  }
  
  private void d() {
    for (GInterfaceBf GInterfaceBf : this.a.af()) {
      try {
        SComponentGolf SComponentGolf = new SComponentGolf();
        byte[] arrayOfByte = GInterfaceBf.d().a();
        InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(arrayOfByte));
        F NetworkHashMap = SComponentGolf.a(inputStreamReader);
        this.e.put(GInterfaceBf.aL(), NetworkHashMap);
        this.b.a(GInterfaceBf);
      } catch (IOException iOException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Failed to load Tuning View", iOException);
        bV.d("Failed to Load Tuning View:\n" + iOException.getLocalizedMessage(), this);
      } catch (V.a a1) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Failed to load Tuning View", (Throwable)a1);
        bV.d("Failed to Load Tuning View:\n" + a1.getLocalizedMessage(), this);
      } 
    } 
  }
  
  public void a(F paramF) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_3
    //   2: iload_3
    //   3: iinc #3, 1
    //   6: ifge -> 42
    //   9: new java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: ldc 'tv'
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: aload_1
    //   22: invokevirtual b : ()Ljava/lang/String;
    //   25: ldc ' '
    //   27: ldc ''
    //   29: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual toString : ()Ljava/lang/String;
    //   38: astore_2
    //   39: goto -> 81
    //   42: new java/lang/StringBuilder
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: ldc 'tv'
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_1
    //   55: invokevirtual b : ()Ljava/lang/String;
    //   58: ldc ' '
    //   60: ldc ''
    //   62: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc '_'
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: iload_3
    //   74: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   77: invokevirtual toString : ()Ljava/lang/String;
    //   80: astore_2
    //   81: aload_0
    //   82: aload_2
    //   83: invokespecial a : (Ljava/lang/String;)Z
    //   86: ifeq -> 2
    //   89: new G/GInterfaceBf
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: astore #4
    //   98: aload #4
    //   100: aload_2
    //   101: invokevirtual v : (Ljava/lang/String;)V
    //   104: aload #4
    //   106: aload_1
    //   107: invokevirtual e : ()Ljava/lang/String;
    //   110: invokevirtual u : (Ljava/lang/String;)V
    //   113: aload #4
    //   115: aload_0
    //   116: getfield e : Ljava/util/Map;
    //   119: invokeinterface size : ()I
    //   124: invokevirtual a : (I)V
    //   127: aload_1
    //   128: invokestatic a : (Lcom/efiAnalytics/apps/ts/tuningViews/F;)Ljava/lang/String;
    //   131: astore #5
    //   133: aload #4
    //   135: aload_1
    //   136: invokevirtual b : ()Ljava/lang/String;
    //   139: invokevirtual AaInterfaceCharlie : (Ljava/lang/String;)V
    //   142: aload #4
    //   144: aload #5
    //   146: invokevirtual a : (Ljava/lang/String;)V
    //   149: aload #4
    //   151: invokevirtual b : ()Ljava/lang/String;
    //   154: pop
    //   155: aload_0
    //   156: getfield e : Ljava/util/Map;
    //   159: aload #4
    //   161: invokevirtual aL : ()Ljava/lang/String;
    //   164: aload_1
    //   165: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   170: pop
    //   171: aload_0
    //   172: getfield b : Lbg/o;
    //   175: aload #4
    //   177: invokevirtual a : (LG/GInterfaceBf;)V
    //   180: goto -> 235
    //   183: astore #5
    //   185: ldc 'Error turning Tune View to String.'
    //   187: astore #6
    //   189: aload #6
    //   191: aload #5
    //   193: aload_0
    //   194: invokestatic a : (Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Object;)V
    //   197: goto -> 235
    //   200: astore #5
    //   202: new java/lang/StringBuilder
    //   205: dup
    //   206: invokespecial <init> : ()V
    //   209: ldc 'Error turning Tune View to String.\\n'
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: aload #5
    //   216: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: invokevirtual toString : ()Ljava/lang/String;
    //   225: astore #6
    //   227: aload #6
    //   229: aload #5
    //   231: aload_0
    //   232: invokestatic a : (Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Object;)V
    //   235: return
    // Exception table:
    //   from	to	target	type
    //   127	180	183	java/io/IOException
    //   127	180	200	V/a
  }
  
  private boolean a(String paramString) {
    for (String str : this.e.keySet()) {
      if (str.equals(paramString))
        return false; 
    } 
    return true;
  }
  
  private void e() {
    a();
  }
  
  private void NetworkHashMap() {}
  
  private void SComponentGolf() {
    this.b.b();
  }
  
  private void h() {
    this.b.AaInterfaceCharlie();
  }
  
  private void i() {
    GInterfaceBf GInterfaceBf = this.b.a();
    if (GInterfaceBf != null) {
      this.b.b(GInterfaceBf);
      this.e.remove(GInterfaceBf.aL());
    } 
  }
  
  private void ThreadedFile() {
    this.a.af().clear();
    try {
      for (GInterfaceBf GInterfaceBf : this.b.b) {
        IOInGPackage IOInGPackage = GInterfaceBf.d();
        IOInGPackage.v(GInterfaceBf.aL());
        F NetworkHashMap = (F)this.e.get(IOInGPackage.aL());
        if (NetworkHashMap != null) {
          NetworkHashMap.b(GInterfaceBf.AaInterfaceCharlie());
        } else {
          D.a("Cannot update TuningView attributes, no instance loaded!");
        } 
        try {
          GInterfaceBf.a(SComponentGolf.a(NetworkHashMap));
        } catch (V.a a1) {
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Failed to update TuningView in EcuTuningView", (Throwable)a1);
        } 
        this.a.a(IOInGPackage);
        this.a.a(GInterfaceBf);
      } 
      ArrayList<NetworkHashMap> arrayList = new ArrayList();
      arrayList.add(new NetworkHashMap());
      arrayList.add(new AaInterfaceCharlie());
      NetworkHashMap.a().a(this.a, arrayList);
    } catch (IOException iOException) {
      bV.d("Failed to get Encoded Data for Tuning View.\n" + iOException.getLocalizedMessage(), this);
    } 
  }
  
  public void a(GInterfaceBf parambf) {
    if (parambf != null) {
      F NetworkHashMap = (F)this.e.get(parambf.aL());
      if (NetworkHashMap == null)
        try {
          NetworkHashMap = b(parambf);
        } catch (IOException iOException) {
          String str = "Failed to load TuneView frm EcuTuningView, see log for more detail.";
          bV.d(str, this);
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Failed to load TuneView frm EcuTuningView", iOException);
          return;
        } catch (V.a a1) {
          String str = "Failed to load TuneView frm EcuTuningView, see log for more detail.";
          bV.d(str, this);
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Failed to load TuneView frm EcuTuningView", (Throwable)a1);
          return;
        }  
      try {
        this.d.a(NetworkHashMap.d());
      } catch (IOException iOException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Failed to get Preview Image File.", iOException);
      } 
    } else {
      k.a(this.d);
    } 
    k();
  }
  
  private void k() {
    int i = this.b.d();
    this.k.setEnabled((i > 0 && i < this.e.size()));
    this.l.setEnabled((i >= 0 && i < this.e.size() - 1));
  }
  
  private void l() {}
  
  private boolean m() {
    return true;
  }
  
  private F b(GInterfaceBf parambf) {
    byte[] arrayOfByte = parambf.d().a();
    String str = t.a(arrayOfByte);
    File file = new File(ThreadedFile.H(), str);
    file.delete();
    d.a(file, arrayOfByte);
    SComponentGolf SComponentGolf = new SComponentGolf();
    return SComponentGolf.a(file);
  }
  
  public void a(Component paramComponent) {
    this.NetworkHashMap = new JDialog(bV.a(paramComponent), SComponentGolf.b("Ini Based Tuning View Editor"));
    this.NetworkHashMap.add("Center", this);
    JButton jButton1 = new JButton(SComponentGolf.b("Cancel"));
    jButton1.addActionListener(new i(this));
    JButton jButton2 = new JButton(SComponentGolf.b("Accept"));
    jButton2.addActionListener(new ThreadedFile(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    } else {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } 
    this.NetworkHashMap.add("South", jPanel);
    this.NetworkHashMap.pack();
    bV.a(bV.a(paramComponent), this.NetworkHashMap);
    this.NetworkHashMap.setVisible(true);
    validate();
    this.NetworkHashMap.pack();
    this.NetworkHashMap.setResizable(false);
  }
  
  public void a() {
    b b = new b();
    String[] arrayOfString1 = T.a().d();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    ArrayList<R> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      R r = T.a().AaInterfaceCharlie(arrayOfString1[b1]);
      arrayList.add(r);
      arrayOfString2[b1] = r.i();
    } 
    l l = new l(this, b, arrayOfString2);
    try {
      List list = G.a(arrayList);
      b.a(list);
    } catch (V.a a1) {
      bV.d("Failed to load Tuning Views:\n" + a1.getLocalizedMessage(), this);
    } 
    Window window1 = bV.b(this);
    Window window2 = window1;
    if (!(window2 instanceof java.awt.Dialog) && !(window2 instanceof java.awt.Frame))
      window2 = null; 
    ct ct = new ct(window2, (JComponent)b, "Select Tuning View", l, 7);
    if (l != null)
      ct.a(l); 
    ct.setSize(640, 480);
    bV.a(window1, (Component)ct);
    ct.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bg/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */