package aO;

import C.c;
import C.d;
import G.GComponentCd;
import G.GComponentCe;
import G.GComponentCf;
import V.ExceptionInVPackage;
import W.j;
import W.n;
import W.o;
import bH.D;
import com.efiAnalytics.ui.aS;
import com.efiAnalytics.ui.aU;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cm;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.eK;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.q;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ManagerInAoPackage extends JPanel {
  ExceptionInVPackage ExceptionInVPackage = null;

  JTextArea b = new JTextArea();

  o c = new o(this);

  JTable d = new JTable(this.c);

  n e = new n(this);

  q f = new q();

  JSplitPane g = new JSplitPane();

  aU h = new aU();

  JPanel i = new JPanel();

  JPanel j = new JPanel();

  o k = null;

  boolean l = false;

  q m = new q(this);

  aS n = null;

  n o = null;

  double p = 1.0D;

  int q = 0;

  int r = 0;

  private et G = null;

  eK s = new eK();

  boolean t = true;

  d u = (d) new c();

  private j H = null;

  private String I = this.u.ExceptionInVPackage("Raw Log Page");

  private String J = this.u.ExceptionInVPackage("Data View");

  static String v = "IgnitionLoggerCluster";

  static String w = "splitPanePosition";

  static String x = "selectedGaugeTab";

  static String y = "zoom";

  static String z = "pollingDelay";

  public static boolean A = false;

  static String B = "renderAllData";

  private boolean K = false;

  private boolean L = A;

  static int C = 100;

  private int M = C;

  boolean D = false;

  JScrollPane E;

  boolean F = true;

  public ManagerInAoPackage(boolean paramBoolean1, boolean paramBoolean2) {
    this.D = paramBoolean2;
    this.K = paramBoolean1;
    this.ExceptionInVPackage = new ExceptionInVPackage(this);
    this.h.ExceptionInVPackage(Color.yellow);
    this.h.d(3.0D);
    this.h.c(-1.0D);
    this.h.f(4);
    this.h.ExceptionInVPackage(new p(this));
    this.h.addMouseWheelListener(new m(this));
    this.f.addMouseWheelListener(new m(this));
    setLayout(new BorderLayout());
    this.b.setBorder(BorderFactory.createLoweredBevelBorder());
    this.b.setColumns(35);
    this.b.setTabSize(5);
    this.b.setFont(UIManager.getFont("TextField.font"));
    this.b.setEditable(false);
    this.E = new JScrollPane(this.d);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    if (this.F) {
      this.s.addTab(this.J, this.E);
      int i = getFont().getSize() + eJ.ExceptionInVPackage(4);
      this.d.setRowHeight(i);
    }
    this.s.addTab(this.I, jScrollPane);
    this.s.setTabPlacement(3);
    add("North", this.ExceptionInVPackage);
    add("Center", this.g);
    this.i.setLayout(new BorderLayout());
    this.j.setLayout(new BorderLayout());
    this.g.setRightComponent(this.i);
    if (paramBoolean1) {
      add("South", this.m);
      this.g.setLeftComponent((Component) this.s);
    } else {
      this.g.setLeftComponent(this.E);
    }
    this.g.addPropertyChangeListener("dividerLocation", new l(this));
    this.g.setOneTouchExpandable(true);
  }

  public void b() {
    if (this.G == null) return;
    int i = Integer.parseInt(ExceptionInVPackage(w, "" + (this.s.getPreferredSize()).width));
    this.g.setDividerLocation(i);
    double d1 = Double.parseDouble(ExceptionInVPackage(y, "1.0"));
    ExceptionInVPackage(d1, 0.0D);
    String str = ExceptionInVPackage(x, this.J);
    this.s.g(str);
  }

  private String ExceptionInVPackage(String paramString1, String paramString2) {
    String str = null;
    if (this.G != null) str = this.G.ExceptionInVPackage(paramString1);
    return (str != null && !str.equals("")) ? str : paramString2;
  }

  private void b(String paramString1, String paramString2) {
    if (this.G != null) this.G.ExceptionInVPackage(paramString1, paramString2);
  }

  protected void ExceptionInVPackage(ArrayList paramArrayList) {
    this.ExceptionInVPackage.ExceptionInVPackage(paramArrayList);
  }

  protected void ExceptionInVPackage(cm paramcm) {
    this.ExceptionInVPackage.ExceptionInVPackage(paramcm);
  }

  protected void ExceptionInVPackage(GComponentCd paramcd) {
    this.e.clear();
    this.b.setText("");
    if (paramcd.d().equals(GComponentCd.ExceptionInVPackage)) {
      ExceptionInVPackage((aS) this.h);
      this.h.b(paramcd.g());
      this.h.c(paramcd.ExceptionInVPackage());
      this.h.ExceptionInVPackage();
      this.h.repaint();
      GComponentCe GComponentCe = paramcd.b().ExceptionInVPackage("ToothTime");
      String str = (GComponentCe != null) ? GComponentCe.d() : "";
      this.h.d(str);
    } else {
      ExceptionInVPackage((aS) this.f);
      this.f.b(paramcd.g());
      this.f.c(paramcd.ExceptionInVPackage());
      this.f.ExceptionInVPackage();
      this.f.d(0.0D);
      GComponentCe GComponentCe = paramcd.b().ExceptionInVPackage("ToothTime");
      if (GComponentCe == null) GComponentCe = paramcd.b().ExceptionInVPackage("TriggerTime");
      String str = (GComponentCe != null) ? GComponentCe.d() : "";
      this.f.e(str);
      this.f.repaint();
    }
  }

  void c() {
    try {
      this.k.ExceptionInVPackage();
    } catch (Exception exception) {
    }
    this.k = null;
  }

  private void ExceptionInVPackage(aS paramaS) {
    if (this.n != null) this.i.remove((Component) this.n);
    this.n = paramaS;
    this.i.add("Center", (Component) paramaS);
    this.i.doLayout();
  }

  private GComponentCd e(n paramn) {
    ArrayList arrayList = this.H.ExceptionInVPackage(paramn.f());
    for (GComponentCd GComponentCd : arrayList) {
      GComponentCf GComponentCf = GComponentCd.b();
      if (ExceptionInVPackage(paramn, GComponentCf)) return GComponentCd;
    }
    return null;
  }

  private boolean ExceptionInVPackage(n paramn, GComponentCf paramcf) {
    List list = paramcf.j();
    for (String str : list) {
      if (paramn.ExceptionInVPackage(str) == null) return false;
    }
    return true;
  }

  public void b(ArrayList<n> paramArrayList) {
    this.t = false;
    if (paramArrayList.size() == 0) {
      bV.d("Data set empty, can't load it.", this);
      return;
    }
    GComponentCd GComponentCd = e(paramArrayList.get(0));
    if (GComponentCd == null) {
      bV.d("Unable to identify log file type.", this);
      return;
    }
    this.ExceptionInVPackage.b(GComponentCd.g());
    this.e.clear();
    int i = 0;
    int m = this.e.d();
    Iterator<n> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      if (i == m) {
        bV.d(
            "Data set size exceeds current maximum of "
                + m
                + ".\nOnly the first "
                + m
                + " will be loaded.",
            this);
        break;
      }
      ExceptionInVPackage(iterator.next());
      i++;
    }
    ExceptionInVPackage(0);
  }

  public void ExceptionInVPackage(int paramInt) {
    try {
      n n1 = this.e.ExceptionInVPackage(paramInt);
      f(n1);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage("Unable to display page " + paramInt, (Exception) a1, this);
    }
  }

  public void ExceptionInVPackage(n paramn) {
    if (this.t) {
      this.t = false;
      return;
    }
    this.e.ExceptionInVPackage(paramn);
  }

  protected void d() {
    this.m.ExceptionInVPackage(this.e.size());
    this.m.b(this.e.c() + 1);
  }

  private void f(n paramn) {
    if (paramn == null) return;
    this.o = paramn;
    if (paramn.d() != this.r) {
      this.r = paramn.d();
      this.m.b();
    }
    d();
    try {
      i(paramn);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage("There was an error reading this log file.", (Exception) a1, this);
    }
    b(paramn);
  }

  protected void b(n paramn) {
    if (j()) {
      d(paramn);
    } else {
      c(paramn);
    }
  }

  protected void c(n paramn) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Lcom/efiAnalytics/ui/aS;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield n : Lcom/efiAnalytics/ui/aS;
    //   12: aload_0
    //   13: getfield f : Lcom/efiAnalytics/ui/q;
    //   16: invokevirtual equals : (Ljava/lang/Object;)Z
    //   19: ifeq -> 134
    //   22: aload_1
    //   23: invokevirtual d : ()I
    //   26: i2d
    //   27: aload_0
    //   28: getfield p : D
    //   31: dmul
    //   32: d2i
    //   33: istore_2
    //   34: aload_1
    //   35: iconst_0
    //   36: invokevirtual get : (I)Ljava/lang/Object;
    //   39: checkcast W/j
    //   42: astore_3
    //   43: aload_0
    //   44: getfield f : Lcom/efiAnalytics/ui/q;
    //   47: invokevirtual ExceptionInVPackage : ()V
    //   50: aload_3
    //   51: invokevirtual f : ()F
    //   54: f2d
    //   55: aload_0
    //   56: getfield f : Lcom/efiAnalytics/ui/q;
    //   59: invokevirtual i : ()D
    //   62: ldc2_w 2.0
    //   65: ddiv
    //   66: dcmpg
    //   67: ifge -> 78
    //   70: aload_0
    //   71: getfield f : Lcom/efiAnalytics/ui/q;
    //   74: dconst_0
    //   75: invokevirtual d : (D)V
    //   78: aload_0
    //   79: getfield q : I
    //   82: istore #4
    //   84: iload #4
    //   86: iload_2
    //   87: aload_0
    //   88: getfield q : I
    //   91: iadd
    //   92: if_icmpge -> 124
    //   95: iload #4
    //   97: aload_1
    //   98: invokevirtual d : ()I
    //   101: if_icmpge -> 124
    //   104: aload_0
    //   105: getfield f : Lcom/efiAnalytics/ui/q;
    //   108: aload_3
    //   109: iload #4
    //   111: invokevirtual c : (I)F
    //   114: f2d
    //   115: invokevirtual ExceptionInVPackage : (D)V
    //   118: iinc #4, 1
    //   121: goto -> 84
    //   124: aload_0
    //   125: getfield f : Lcom/efiAnalytics/ui/q;
    //   128: invokevirtual repaint : ()V
    //   131: goto -> 2463
    //   134: aload_0
    //   135: getfield n : Lcom/efiAnalytics/ui/aS;
    //   138: aload_0
    //   139: getfield h : Lcom/efiAnalytics/ui/aU;
    //   142: invokevirtual equals : (Ljava/lang/Object;)Z
    //   145: ifeq -> 2463
    //   148: aload_1
    //   149: invokevirtual d : ()I
    //   152: i2d
    //   153: aload_0
    //   154: getfield p : D
    //   157: dmul
    //   158: d2i
    //   159: istore_2
    //   160: aload_1
    //   161: ldc 'Time'
    //   163: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   166: astore_3
    //   167: aload_1
    //   168: ldc 'ToothTime'
    //   170: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   173: astore #4
    //   175: aload_1
    //   176: ldc 'PriLevel'
    //   178: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   181: astore #5
    //   183: aload_1
    //   184: ldc 'SecLevel'
    //   186: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   189: astore #6
    //   191: aload_1
    //   192: ldc 'Sync'
    //   194: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   197: astore #7
    //   199: aload_1
    //   200: ldc 'Trigger'
    //   202: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   205: astore #8
    //   207: aload_0
    //   208: getfield h : Lcom/efiAnalytics/ui/aU;
    //   211: invokevirtual ExceptionInVPackage : ()V
    //   214: aload_3
    //   215: aload_0
    //   216: getfield q : I
    //   219: invokevirtual c : (I)F
    //   222: fconst_0
    //   223: fcmpl
    //   224: ifle -> 239
    //   227: aload_3
    //   228: aload_0
    //   229: getfield q : I
    //   232: invokevirtual c : (I)F
    //   235: f2d
    //   236: goto -> 244
    //   239: aload_0
    //   240: aload_1
    //   241: invokespecial g : (LW/n;)D
    //   244: dstore #9
    //   246: aload_3
    //   247: iload_2
    //   248: aload_0
    //   249: getfield q : I
    //   252: iadd
    //   253: iconst_1
    //   254: isub
    //   255: invokevirtual c : (I)F
    //   258: fconst_0
    //   259: fcmpl
    //   260: ifle -> 279
    //   263: aload_3
    //   264: iload_2
    //   265: aload_0
    //   266: getfield q : I
    //   269: iadd
    //   270: iconst_1
    //   271: isub
    //   272: invokevirtual c : (I)F
    //   275: f2d
    //   276: goto -> 284
    //   279: aload_0
    //   280: aload_1
    //   281: invokespecial h : (LW/n;)D
    //   284: dstore #11
    //   286: aload_0
    //   287: getfield h : Lcom/efiAnalytics/ui/aU;
    //   290: dload #9
    //   292: invokevirtual b : (D)V
    //   295: aload_0
    //   296: getfield h : Lcom/efiAnalytics/ui/aU;
    //   299: dload #11
    //   301: invokevirtual e : (D)V
    //   304: aload #8
    //   306: invokevirtual f : ()F
    //   309: fconst_0
    //   310: fcmpl
    //   311: ifne -> 327
    //   314: aload_0
    //   315: getfield h : Lcom/efiAnalytics/ui/aU;
    //   318: ldc2_w 2.0
    //   321: invokevirtual d : (D)V
    //   324: goto -> 337
    //   327: aload_0
    //   328: getfield h : Lcom/efiAnalytics/ui/aU;
    //   331: ldc2_w 3.0
    //   334: invokevirtual d : (D)V
    //   337: iconst_0
    //   338: istore #13
    //   340: iconst_0
    //   341: istore #14
    //   343: invokestatic currentTimeMillis : ()J
    //   346: lstore #15
    //   348: ldc2_w -1.0
    //   351: dstore #17
    //   353: ldc2_w -1.0
    //   356: dstore #19
    //   358: iconst_0
    //   359: istore #21
    //   361: iconst_0
    //   362: istore #22
    //   364: iconst_0
    //   365: istore #23
    //   367: iconst_0
    //   368: istore #24
    //   370: iconst_0
    //   371: istore #25
    //   373: ldc -1.0
    //   375: fstore #26
    //   377: iconst_0
    //   378: istore #27
    //   380: iconst_0
    //   381: istore #28
    //   383: iconst_2
    //   384: istore #29
    //   386: iload #29
    //   388: aload_1
    //   389: invokevirtual d : ()I
    //   392: if_icmpge -> 701
    //   395: aload #4
    //   397: iload #29
    //   399: invokevirtual c : (I)F
    //   402: f2d
    //   403: dconst_0
    //   404: dcmpl
    //   405: ifne -> 422
    //   408: iinc #25, 1
    //   411: iload #27
    //   413: ifne -> 428
    //   416: iinc #28, 1
    //   419: goto -> 428
    //   422: iconst_0
    //   423: istore #25
    //   425: iconst_1
    //   426: istore #27
    //   428: iload #25
    //   430: iconst_2
    //   431: if_icmple -> 437
    //   434: goto -> 695
    //   437: iload #13
    //   439: ifne -> 517
    //   442: aload #5
    //   444: invokevirtual f : ()F
    //   447: aload #5
    //   449: invokevirtual e : ()F
    //   452: fcmpl
    //   453: ifeq -> 517
    //   456: aload #8
    //   458: iload #29
    //   460: invokevirtual c : (I)F
    //   463: fconst_0
    //   464: fcmpl
    //   465: ifne -> 517
    //   468: aload #4
    //   470: iload #29
    //   472: invokevirtual c : (I)F
    //   475: f2d
    //   476: dconst_0
    //   477: dcmpl
    //   478: ifle -> 517
    //   481: dload #17
    //   483: ldc2_w -1.0
    //   486: dcmpl
    //   487: ifeq -> 507
    //   490: dload #17
    //   492: aload #5
    //   494: iload #29
    //   496: invokevirtual c : (I)F
    //   499: f2d
    //   500: dcmpl
    //   501: ifeq -> 507
    //   504: iconst_1
    //   505: istore #13
    //   507: aload #5
    //   509: iload #29
    //   511: invokevirtual c : (I)F
    //   514: f2d
    //   515: dstore #17
    //   517: iload #14
    //   519: ifne -> 603
    //   522: aload #6
    //   524: invokevirtual f : ()F
    //   527: aload #6
    //   529: invokevirtual e : ()F
    //   532: fcmpl
    //   533: ifeq -> 603
    //   536: aload #8
    //   538: iload #29
    //   540: invokevirtual c : (I)F
    //   543: fconst_1
    //   544: fcmpl
    //   545: ifne -> 603
    //   548: aload #4
    //   550: iload #29
    //   552: invokevirtual c : (I)F
    //   555: f2d
    //   556: dconst_0
    //   557: dcmpl
    //   558: ifle -> 603
    //   561: dload #19
    //   563: ldc2_w -1.0
    //   566: dcmpl
    //   567: ifeq -> 594
    //   570: fload #26
    //   572: ldc -1.0
    //   574: fcmpl
    //   575: ifeq -> 594
    //   578: fload #26
    //   580: aload #6
    //   582: iload #29
    //   584: invokevirtual c : (I)F
    //   587: fcmpl
    //   588: ifeq -> 594
    //   591: iconst_1
    //   592: istore #14
    //   594: aload #6
    //   596: iload #29
    //   598: invokevirtual c : (I)F
    //   601: fstore #26
    //   603: aload #6
    //   605: iload #29
    //   607: invokevirtual c : (I)F
    //   610: f2d
    //   611: dstore #19
    //   613: aload #8
    //   615: iload #29
    //   617: invokevirtual c : (I)F
    //   620: fconst_1
    //   621: fcmpl
    //   622: ifne -> 674
    //   625: aload #4
    //   627: iload #29
    //   629: invokevirtual c : (I)F
    //   632: fconst_0
    //   633: fcmpl
    //   634: ifle -> 674
    //   637: aload #6
    //   639: iload #29
    //   641: invokevirtual c : (I)F
    //   644: fconst_1
    //   645: fcmpl
    //   646: ifne -> 655
    //   649: iinc #21, 1
    //   652: goto -> 658
    //   655: iinc #22, 1
    //   658: iload #21
    //   660: ifle -> 695
    //   663: iload #22
    //   665: ifle -> 695
    //   668: iconst_1
    //   669: istore #14
    //   671: goto -> 695
    //   674: aload #5
    //   676: iload #29
    //   678: invokevirtual c : (I)F
    //   681: fconst_1
    //   682: fcmpl
    //   683: ifne -> 692
    //   686: iinc #23, 1
    //   689: goto -> 695
    //   692: iinc #24, 1
    //   695: iinc #29, 1
    //   698: goto -> 386
    //   701: iload #21
    //   703: iload #22
    //   705: if_icmplt -> 736
    //   708: iload #21
    //   710: iload #22
    //   712: if_icmpne -> 719
    //   715: iconst_1
    //   716: goto -> 720
    //   719: iconst_0
    //   720: dload #19
    //   722: dconst_1
    //   723: dcmpl
    //   724: ifne -> 731
    //   727: iconst_1
    //   728: goto -> 732
    //   731: iconst_0
    //   732: iand
    //   733: ifeq -> 740
    //   736: iconst_1
    //   737: goto -> 741
    //   740: iconst_0
    //   741: istore #29
    //   743: iload #23
    //   745: iload #24
    //   747: if_icmple -> 754
    //   750: iconst_1
    //   751: goto -> 755
    //   754: iconst_0
    //   755: istore #30
    //   757: ldc2_w -1.0
    //   760: dstore #17
    //   762: ldc2_w -1.0
    //   765: dstore #19
    //   767: ldc2_w -1.0
    //   770: dstore #31
    //   772: ldc2_w 1.5
    //   775: dstore #33
    //   777: aload_0
    //   778: getfield q : I
    //   781: istore #35
    //   783: iload #35
    //   785: iload_2
    //   786: aload_0
    //   787: getfield q : I
    //   790: iadd
    //   791: if_icmpge -> 2003
    //   794: iload #35
    //   796: aload_1
    //   797: invokevirtual d : ()I
    //   800: if_icmpge -> 2003
    //   803: aload #8
    //   805: iload #35
    //   807: invokevirtual c : (I)F
    //   810: fconst_0
    //   811: fcmpl
    //   812: ifne -> 1221
    //   815: aload #5
    //   817: iload #35
    //   819: invokevirtual c : (I)F
    //   822: f2d
    //   823: dstore #36
    //   825: dload #17
    //   827: ldc2_w -1.0
    //   830: dcmpl
    //   831: ifne -> 949
    //   834: iload #13
    //   836: ifne -> 884
    //   839: iload #30
    //   841: iconst_1
    //   842: if_icmpne -> 849
    //   845: iconst_0
    //   846: goto -> 850
    //   849: iconst_1
    //   850: istore #38
    //   852: new com/efiAnalytics/ui/aZ
    //   855: dup
    //   856: aload_3
    //   857: iload #35
    //   859: invokevirtual c : (I)F
    //   862: f2d
    //   863: iload #38
    //   865: i2d
    //   866: invokespecial <init> : (DD)V
    //   869: astore #39
    //   871: aload_0
    //   872: getfield h : Lcom/efiAnalytics/ui/aU;
    //   875: iconst_0
    //   876: aload #39
    //   878: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   881: goto -> 1214
    //   884: new com/efiAnalytics/ui/aZ
    //   887: dup
    //   888: aload_0
    //   889: getfield h : Lcom/efiAnalytics/ui/aU;
    //   892: invokevirtual b : ()D
    //   895: dload #36
    //   897: invokespecial <init> : (DD)V
    //   900: astore #38
    //   902: aload #38
    //   904: iconst_1
    //   905: invokevirtual ExceptionInVPackage : (Z)V
    //   908: aload_0
    //   909: getfield h : Lcom/efiAnalytics/ui/aU;
    //   912: iconst_0
    //   913: aload #38
    //   915: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   918: new com/efiAnalytics/ui/aZ
    //   921: dup
    //   922: aload_3
    //   923: iload #35
    //   925: invokevirtual c : (I)F
    //   928: f2d
    //   929: dload #36
    //   931: invokespecial <init> : (DD)V
    //   934: astore #38
    //   936: aload_0
    //   937: getfield h : Lcom/efiAnalytics/ui/aU;
    //   940: iconst_0
    //   941: aload #38
    //   943: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   946: goto -> 1214
    //   949: iload #13
    //   951: ifeq -> 1019
    //   954: new com/efiAnalytics/ui/aZ
    //   957: dup
    //   958: aload_3
    //   959: iload #35
    //   961: invokevirtual c : (I)F
    //   964: f2d
    //   965: dload #17
    //   967: invokespecial <init> : (DD)V
    //   970: astore #38
    //   972: aload #38
    //   974: iconst_1
    //   975: invokevirtual ExceptionInVPackage : (Z)V
    //   978: aload_0
    //   979: getfield h : Lcom/efiAnalytics/ui/aU;
    //   982: iconst_0
    //   983: aload #38
    //   985: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   988: new com/efiAnalytics/ui/aZ
    //   991: dup
    //   992: aload_3
    //   993: iload #35
    //   995: invokevirtual c : (I)F
    //   998: f2d
    //   999: dload #36
    //   1001: invokespecial <init> : (DD)V
    //   1004: astore #38
    //   1006: aload_0
    //   1007: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1010: iconst_0
    //   1011: aload #38
    //   1013: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1016: goto -> 1214
    //   1019: iload #35
    //   1021: iload_2
    //   1022: aload_0
    //   1023: getfield q : I
    //   1026: iadd
    //   1027: iconst_1
    //   1028: isub
    //   1029: if_icmpeq -> 1043
    //   1032: iload #35
    //   1034: aload_1
    //   1035: invokevirtual d : ()I
    //   1038: iconst_1
    //   1039: isub
    //   1040: if_icmpne -> 1093
    //   1043: iload #13
    //   1045: ifne -> 1214
    //   1048: iload #30
    //   1050: iconst_1
    //   1051: if_icmpne -> 1058
    //   1054: iconst_0
    //   1055: goto -> 1059
    //   1058: iconst_1
    //   1059: istore #38
    //   1061: new com/efiAnalytics/ui/aZ
    //   1064: dup
    //   1065: aload_3
    //   1066: iload #35
    //   1068: invokevirtual c : (I)F
    //   1071: f2d
    //   1072: iload #38
    //   1074: i2d
    //   1075: invokespecial <init> : (DD)V
    //   1078: astore #39
    //   1080: aload_0
    //   1081: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1084: iconst_0
    //   1085: aload #39
    //   1087: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1090: goto -> 1214
    //   1093: dload #36
    //   1095: iload #30
    //   1097: i2d
    //   1098: dcmpl
    //   1099: ifne -> 1214
    //   1102: iload #30
    //   1104: iconst_1
    //   1105: if_icmpne -> 1112
    //   1108: iconst_0
    //   1109: goto -> 1113
    //   1112: iconst_1
    //   1113: istore #38
    //   1115: new com/efiAnalytics/ui/aZ
    //   1118: dup
    //   1119: aload_3
    //   1120: iload #35
    //   1122: invokevirtual c : (I)F
    //   1125: f2d
    //   1126: iload #38
    //   1128: i2d
    //   1129: invokespecial <init> : (DD)V
    //   1132: astore #39
    //   1134: aload #39
    //   1136: iconst_1
    //   1137: invokevirtual ExceptionInVPackage : (Z)V
    //   1140: aload_0
    //   1141: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1144: iconst_0
    //   1145: aload #39
    //   1147: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1150: new com/efiAnalytics/ui/aZ
    //   1153: dup
    //   1154: aload_3
    //   1155: iload #35
    //   1157: invokevirtual c : (I)F
    //   1160: f2d
    //   1161: iload #30
    //   1163: i2d
    //   1164: invokespecial <init> : (DD)V
    //   1167: astore #39
    //   1169: aload_0
    //   1170: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1173: iconst_0
    //   1174: aload #39
    //   1176: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1179: new com/efiAnalytics/ui/aZ
    //   1182: dup
    //   1183: aload_3
    //   1184: iload #35
    //   1186: invokevirtual c : (I)F
    //   1189: f2d
    //   1190: iload #38
    //   1192: i2d
    //   1193: invokespecial <init> : (DD)V
    //   1196: astore #39
    //   1198: aload #39
    //   1200: iconst_1
    //   1201: invokevirtual ExceptionInVPackage : (Z)V
    //   1204: aload_0
    //   1205: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1208: iconst_0
    //   1209: aload #39
    //   1211: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1214: dload #36
    //   1216: dstore #17
    //   1218: goto -> 1808
    //   1221: aload #6
    //   1223: iload #35
    //   1225: invokevirtual c : (I)F
    //   1228: f2d
    //   1229: dstore #36
    //   1231: dload #36
    //   1233: dload #33
    //   1235: dadd
    //   1236: dstore #38
    //   1238: dload #19
    //   1240: ldc2_w -1.0
    //   1243: dcmpl
    //   1244: ifne -> 1512
    //   1247: iload #14
    //   1249: ifne -> 1404
    //   1252: dload #38
    //   1254: dload #33
    //   1256: dcmpl
    //   1257: ifne -> 1267
    //   1260: dconst_1
    //   1261: dload #33
    //   1263: dadd
    //   1264: goto -> 1269
    //   1267: dload #33
    //   1269: dstore #40
    //   1271: new com/efiAnalytics/ui/aZ
    //   1274: dup
    //   1275: aload_0
    //   1276: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1279: invokevirtual b : ()D
    //   1282: dload #40
    //   1284: invokespecial <init> : (DD)V
    //   1287: astore #42
    //   1289: aload #42
    //   1291: iconst_1
    //   1292: invokevirtual ExceptionInVPackage : (Z)V
    //   1295: aload_0
    //   1296: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1299: iconst_1
    //   1300: aload #42
    //   1302: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1305: new com/efiAnalytics/ui/aZ
    //   1308: dup
    //   1309: aload_3
    //   1310: iload #35
    //   1312: invokevirtual c : (I)F
    //   1315: f2d
    //   1316: dload #40
    //   1318: invokespecial <init> : (DD)V
    //   1321: astore #42
    //   1323: aload #42
    //   1325: iconst_1
    //   1326: invokevirtual ExceptionInVPackage : (Z)V
    //   1329: aload_0
    //   1330: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1333: iconst_1
    //   1334: aload #42
    //   1336: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1339: new com/efiAnalytics/ui/aZ
    //   1342: dup
    //   1343: aload_3
    //   1344: iload #35
    //   1346: invokevirtual c : (I)F
    //   1349: f2d
    //   1350: dload #38
    //   1352: invokespecial <init> : (DD)V
    //   1355: astore #42
    //   1357: aload_0
    //   1358: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1361: iconst_1
    //   1362: aload #42
    //   1364: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1367: new com/efiAnalytics/ui/aZ
    //   1370: dup
    //   1371: aload_3
    //   1372: iload #35
    //   1374: invokevirtual c : (I)F
    //   1377: f2d
    //   1378: dload #40
    //   1380: invokespecial <init> : (DD)V
    //   1383: astore #42
    //   1385: aload #42
    //   1387: iconst_1
    //   1388: invokevirtual ExceptionInVPackage : (Z)V
    //   1391: aload_0
    //   1392: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1395: iconst_1
    //   1396: aload #42
    //   1398: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1401: goto -> 1800
    //   1404: aload #6
    //   1406: aload_0
    //   1407: getfield q : I
    //   1410: invokevirtual c : (I)F
    //   1413: f2d
    //   1414: dload #33
    //   1416: dadd
    //   1417: dstore #31
    //   1419: new com/efiAnalytics/ui/aZ
    //   1422: dup
    //   1423: aload_0
    //   1424: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1427: invokevirtual b : ()D
    //   1430: dload #31
    //   1432: invokespecial <init> : (DD)V
    //   1435: astore #40
    //   1437: aload_0
    //   1438: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1441: iconst_1
    //   1442: aload #40
    //   1444: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1447: new com/efiAnalytics/ui/aZ
    //   1450: dup
    //   1451: aload_3
    //   1452: iload #35
    //   1454: invokevirtual c : (I)F
    //   1457: f2d
    //   1458: dload #31
    //   1460: invokespecial <init> : (DD)V
    //   1463: astore #40
    //   1465: aload #40
    //   1467: iconst_1
    //   1468: invokevirtual ExceptionInVPackage : (Z)V
    //   1471: aload_0
    //   1472: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1475: iconst_1
    //   1476: aload #40
    //   1478: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1481: new com/efiAnalytics/ui/aZ
    //   1484: dup
    //   1485: aload_3
    //   1486: iload #35
    //   1488: invokevirtual c : (I)F
    //   1491: f2d
    //   1492: dload #38
    //   1494: invokespecial <init> : (DD)V
    //   1497: astore #40
    //   1499: aload_0
    //   1500: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1503: iconst_1
    //   1504: aload #40
    //   1506: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1509: goto -> 1800
    //   1512: iload #14
    //   1514: ifeq -> 1582
    //   1517: new com/efiAnalytics/ui/aZ
    //   1520: dup
    //   1521: aload_3
    //   1522: iload #35
    //   1524: invokevirtual c : (I)F
    //   1527: f2d
    //   1528: dload #31
    //   1530: invokespecial <init> : (DD)V
    //   1533: astore #40
    //   1535: aload #40
    //   1537: iconst_1
    //   1538: invokevirtual ExceptionInVPackage : (Z)V
    //   1541: aload_0
    //   1542: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1545: iconst_1
    //   1546: aload #40
    //   1548: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1551: new com/efiAnalytics/ui/aZ
    //   1554: dup
    //   1555: aload_3
    //   1556: iload #35
    //   1558: invokevirtual c : (I)F
    //   1561: f2d
    //   1562: dload #38
    //   1564: invokespecial <init> : (DD)V
    //   1567: astore #40
    //   1569: aload_0
    //   1570: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1573: iconst_1
    //   1574: aload #40
    //   1576: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1579: goto -> 1800
    //   1582: iload #35
    //   1584: iload_2
    //   1585: aload_0
    //   1586: getfield q : I
    //   1589: iadd
    //   1590: iconst_1
    //   1591: isub
    //   1592: if_icmpeq -> 1606
    //   1595: iload #35
    //   1597: aload_1
    //   1598: invokevirtual d : ()I
    //   1601: iconst_1
    //   1602: isub
    //   1603: if_icmpne -> 1656
    //   1606: iload #14
    //   1608: ifne -> 1800
    //   1611: iload #29
    //   1613: i2d
    //   1614: dload #33
    //   1616: dadd
    //   1617: dstore #40
    //   1619: new com/efiAnalytics/ui/aZ
    //   1622: dup
    //   1623: aload_3
    //   1624: iload #35
    //   1626: invokevirtual c : (I)F
    //   1629: f2d
    //   1630: dload #40
    //   1632: invokespecial <init> : (DD)V
    //   1635: astore #42
    //   1637: aload #42
    //   1639: iconst_1
    //   1640: invokevirtual ExceptionInVPackage : (Z)V
    //   1643: aload_0
    //   1644: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1647: iconst_1
    //   1648: aload #42
    //   1650: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1653: goto -> 1800
    //   1656: aload #8
    //   1658: iload #35
    //   1660: invokevirtual c : (I)F
    //   1663: fconst_1
    //   1664: fcmpl
    //   1665: ifeq -> 1685
    //   1668: iload #29
    //   1670: i2d
    //   1671: dload #36
    //   1673: dcmpl
    //   1674: ifeq -> 1800
    //   1677: dload #38
    //   1679: dload #31
    //   1681: dcmpl
    //   1682: ifeq -> 1800
    //   1685: dload #38
    //   1687: dload #33
    //   1689: dcmpl
    //   1690: ifne -> 1700
    //   1693: dconst_1
    //   1694: dload #33
    //   1696: dadd
    //   1697: goto -> 1702
    //   1700: dload #33
    //   1702: dstore #40
    //   1704: new com/efiAnalytics/ui/aZ
    //   1707: dup
    //   1708: aload_3
    //   1709: iload #35
    //   1711: invokevirtual c : (I)F
    //   1714: f2d
    //   1715: dload #40
    //   1717: invokespecial <init> : (DD)V
    //   1720: astore #42
    //   1722: aload #42
    //   1724: iconst_1
    //   1725: invokevirtual ExceptionInVPackage : (Z)V
    //   1728: aload_0
    //   1729: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1732: iconst_1
    //   1733: aload #42
    //   1735: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1738: new com/efiAnalytics/ui/aZ
    //   1741: dup
    //   1742: aload_3
    //   1743: iload #35
    //   1745: invokevirtual c : (I)F
    //   1748: f2d
    //   1749: dload #38
    //   1751: invokespecial <init> : (DD)V
    //   1754: astore #42
    //   1756: aload_0
    //   1757: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1760: iconst_1
    //   1761: aload #42
    //   1763: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1766: new com/efiAnalytics/ui/aZ
    //   1769: dup
    //   1770: aload_3
    //   1771: iload #35
    //   1773: invokevirtual c : (I)F
    //   1776: f2d
    //   1777: dload #40
    //   1779: invokespecial <init> : (DD)V
    //   1782: astore #42
    //   1784: aload #42
    //   1786: iconst_1
    //   1787: invokevirtual ExceptionInVPackage : (Z)V
    //   1790: aload_0
    //   1791: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1794: iconst_1
    //   1795: aload #42
    //   1797: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1800: dload #38
    //   1802: dstore #31
    //   1804: dload #36
    //   1806: dstore #19
    //   1808: aload #7
    //   1810: iload #35
    //   1812: invokevirtual c : (I)F
    //   1815: fconst_0
    //   1816: fcmpl
    //   1817: ifne -> 1940
    //   1820: aload #4
    //   1822: iload #35
    //   1824: invokevirtual c : (I)F
    //   1827: fconst_0
    //   1828: fcmpl
    //   1829: ifle -> 1940
    //   1832: new com/efiAnalytics/ui/aZ
    //   1835: dup
    //   1836: aload_3
    //   1837: iload #35
    //   1839: invokevirtual c : (I)F
    //   1842: f2d
    //   1843: ldc2_w -0.75
    //   1846: invokespecial <init> : (DD)V
    //   1849: astore #36
    //   1851: aload #36
    //   1853: iconst_1
    //   1854: invokevirtual ExceptionInVPackage : (Z)V
    //   1857: aload_0
    //   1858: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1861: iconst_2
    //   1862: aload #36
    //   1864: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1867: new com/efiAnalytics/ui/aZ
    //   1870: dup
    //   1871: aload_3
    //   1872: iload #35
    //   1874: invokevirtual c : (I)F
    //   1877: f2d
    //   1878: ldc2_w -0.5
    //   1881: invokespecial <init> : (DD)V
    //   1884: astore #36
    //   1886: aload #36
    //   1888: iconst_1
    //   1889: invokevirtual ExceptionInVPackage : (Z)V
    //   1892: aload_0
    //   1893: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1896: iconst_2
    //   1897: aload #36
    //   1899: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1902: new com/efiAnalytics/ui/aZ
    //   1905: dup
    //   1906: aload_3
    //   1907: iload #35
    //   1909: invokevirtual c : (I)F
    //   1912: f2d
    //   1913: ldc2_w -0.75
    //   1916: invokespecial <init> : (DD)V
    //   1919: astore #36
    //   1921: aload #36
    //   1923: iconst_1
    //   1924: invokevirtual ExceptionInVPackage : (Z)V
    //   1927: aload_0
    //   1928: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1931: iconst_2
    //   1932: aload #36
    //   1934: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1937: goto -> 1997
    //   1940: iload #35
    //   1942: aload_0
    //   1943: getfield q : I
    //   1946: if_icmpeq -> 1962
    //   1949: iload #35
    //   1951: iload_2
    //   1952: aload_0
    //   1953: getfield q : I
    //   1956: iadd
    //   1957: iconst_1
    //   1958: isub
    //   1959: if_icmpne -> 1997
    //   1962: new com/efiAnalytics/ui/aZ
    //   1965: dup
    //   1966: aload_3
    //   1967: iload #35
    //   1969: invokevirtual c : (I)F
    //   1972: f2d
    //   1973: ldc2_w -0.75
    //   1976: invokespecial <init> : (DD)V
    //   1979: astore #36
    //   1981: aload #36
    //   1983: iconst_1
    //   1984: invokevirtual ExceptionInVPackage : (Z)V
    //   1987: aload_0
    //   1988: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1991: iconst_2
    //   1992: aload #36
    //   1994: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1997: iinc #35, 1
    //   2000: goto -> 783
    //   2003: aload #8
    //   2005: invokevirtual f : ()F
    //   2008: fconst_1
    //   2009: fcmpl
    //   2010: ifne -> 2298
    //   2013: iload #14
    //   2015: ifeq -> 2221
    //   2018: dload #31
    //   2020: dconst_0
    //   2021: dcmpl
    //   2022: ifle -> 2062
    //   2025: new com/efiAnalytics/ui/aZ
    //   2028: dup
    //   2029: aload_0
    //   2030: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2033: invokevirtual t : ()D
    //   2036: dload #31
    //   2038: invokespecial <init> : (DD)V
    //   2041: astore #35
    //   2043: aload #35
    //   2045: iconst_1
    //   2046: invokevirtual ExceptionInVPackage : (Z)V
    //   2049: aload_0
    //   2050: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2053: iconst_1
    //   2054: aload #35
    //   2056: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2059: goto -> 2298
    //   2062: aload_0
    //   2063: aload_1
    //   2064: aload_0
    //   2065: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2068: invokevirtual t : ()D
    //   2071: invokespecial ExceptionInVPackage : (LW/n;D)D
    //   2074: dstore #35
    //   2076: dload #35
    //   2078: dconst_0
    //   2079: dcmpl
    //   2080: iflt -> 2104
    //   2083: dload #35
    //   2085: dconst_0
    //   2086: dcmpl
    //   2087: ifne -> 2097
    //   2090: dconst_1
    //   2091: dload #33
    //   2093: dadd
    //   2094: goto -> 2099
    //   2097: dload #33
    //   2099: dstore #31
    //   2101: goto -> 2143
    //   2104: aload_0
    //   2105: aload_1
    //   2106: aload_0
    //   2107: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2110: invokevirtual t : ()D
    //   2113: invokespecial b : (LW/n;D)D
    //   2116: dstore #37
    //   2118: dload #37
    //   2120: dconst_0
    //   2121: dcmpl
    //   2122: iflt -> 2143
    //   2125: dload #37
    //   2127: dconst_0
    //   2128: dcmpl
    //   2129: ifne -> 2137
    //   2132: dload #33
    //   2134: goto -> 2141
    //   2137: dconst_1
    //   2138: dload #33
    //   2140: dadd
    //   2141: dstore #31
    //   2143: dload #31
    //   2145: dconst_0
    //   2146: dcmpl
    //   2147: ifle -> 2218
    //   2150: new com/efiAnalytics/ui/aZ
    //   2153: dup
    //   2154: aload_0
    //   2155: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2158: invokevirtual b : ()D
    //   2161: dload #31
    //   2163: invokespecial <init> : (DD)V
    //   2166: astore #37
    //   2168: aload #37
    //   2170: iconst_1
    //   2171: invokevirtual ExceptionInVPackage : (Z)V
    //   2174: aload_0
    //   2175: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2178: iconst_1
    //   2179: aload #37
    //   2181: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2184: new com/efiAnalytics/ui/aZ
    //   2187: dup
    //   2188: aload_0
    //   2189: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2192: invokevirtual t : ()D
    //   2195: dload #31
    //   2197: invokespecial <init> : (DD)V
    //   2200: astore #37
    //   2202: aload #37
    //   2204: iconst_1
    //   2205: invokevirtual ExceptionInVPackage : (Z)V
    //   2208: aload_0
    //   2209: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2212: iconst_1
    //   2213: aload #37
    //   2215: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2218: goto -> 2298
    //   2221: iload #29
    //   2223: i2d
    //   2224: dload #33
    //   2226: dadd
    //   2227: dstore #35
    //   2229: new com/efiAnalytics/ui/aZ
    //   2232: dup
    //   2233: aload_0
    //   2234: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2237: invokevirtual b : ()D
    //   2240: dload #35
    //   2242: invokespecial <init> : (DD)V
    //   2245: astore #37
    //   2247: aload #37
    //   2249: iconst_1
    //   2250: invokevirtual ExceptionInVPackage : (Z)V
    //   2253: aload_0
    //   2254: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2257: iconst_0
    //   2258: iconst_1
    //   2259: aload #37
    //   2261: invokevirtual ExceptionInVPackage : (IILcom/efiAnalytics/ui/aZ;)V
    //   2264: new com/efiAnalytics/ui/aZ
    //   2267: dup
    //   2268: aload_0
    //   2269: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2272: invokevirtual t : ()D
    //   2275: dload #35
    //   2277: invokespecial <init> : (DD)V
    //   2280: astore #37
    //   2282: aload #37
    //   2284: iconst_1
    //   2285: invokevirtual ExceptionInVPackage : (Z)V
    //   2288: aload_0
    //   2289: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2292: iconst_1
    //   2293: aload #37
    //   2295: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2298: aload_1
    //   2299: invokevirtual d : ()I
    //   2302: istore #35
    //   2304: iload #35
    //   2306: iload #25
    //   2308: isub
    //   2309: aload_0
    //   2310: getfield q : I
    //   2313: isub
    //   2314: istore #36
    //   2316: iload #25
    //   2318: ifle -> 2456
    //   2321: aload_0
    //   2322: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2325: invokevirtual t : ()D
    //   2328: aload_0
    //   2329: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2332: invokevirtual b : ()D
    //   2335: dsub
    //   2336: iload #36
    //   2338: i2d
    //   2339: ddiv
    //   2340: dstore #37
    //   2342: iload #25
    //   2344: iload #28
    //   2346: isub
    //   2347: istore #39
    //   2349: iload_2
    //   2350: aload_0
    //   2351: getfield q : I
    //   2354: iadd
    //   2355: iload #35
    //   2357: iload #39
    //   2359: isub
    //   2360: isub
    //   2361: istore #39
    //   2363: iload #28
    //   2365: aload_0
    //   2366: getfield q : I
    //   2369: isub
    //   2370: istore #28
    //   2372: iload #28
    //   2374: i2d
    //   2375: dload #37
    //   2377: dmul
    //   2378: dstore #40
    //   2380: iload #39
    //   2382: i2d
    //   2383: dload #37
    //   2385: dmul
    //   2386: dstore #42
    //   2388: dload #40
    //   2390: dconst_0
    //   2391: dcmpl
    //   2392: ifle -> 2432
    //   2395: aload_0
    //   2396: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2399: aload_0
    //   2400: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2403: invokevirtual b : ()D
    //   2406: dload #40
    //   2408: dsub
    //   2409: invokevirtual b : (D)V
    //   2412: aload_0
    //   2413: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2416: aload_0
    //   2417: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2420: invokevirtual b : ()D
    //   2423: iload_2
    //   2424: i2d
    //   2425: dload #37
    //   2427: dmul
    //   2428: dadd
    //   2429: invokevirtual e : (D)V
    //   2432: dload #42
    //   2434: dconst_0
    //   2435: dcmpl
    //   2436: ifle -> 2456
    //   2439: aload_0
    //   2440: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2443: aload_0
    //   2444: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2447: invokevirtual t : ()D
    //   2450: dload #42
    //   2452: dadd
    //   2453: invokevirtual e : (D)V
    //   2456: aload_0
    //   2457: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2460: invokevirtual repaint : ()V
    //   2463: return
  }

  protected void d(n paramn) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Lcom/efiAnalytics/ui/aS;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield n : Lcom/efiAnalytics/ui/aS;
    //   12: aload_0
    //   13: getfield f : Lcom/efiAnalytics/ui/q;
    //   16: invokevirtual equals : (Ljava/lang/Object;)Z
    //   19: ifeq -> 134
    //   22: aload_1
    //   23: invokevirtual d : ()I
    //   26: i2d
    //   27: aload_0
    //   28: getfield p : D
    //   31: dmul
    //   32: d2i
    //   33: istore_2
    //   34: aload_1
    //   35: iconst_0
    //   36: invokevirtual get : (I)Ljava/lang/Object;
    //   39: checkcast W/j
    //   42: astore_3
    //   43: aload_0
    //   44: getfield f : Lcom/efiAnalytics/ui/q;
    //   47: invokevirtual ExceptionInVPackage : ()V
    //   50: aload_3
    //   51: invokevirtual f : ()F
    //   54: f2d
    //   55: aload_0
    //   56: getfield f : Lcom/efiAnalytics/ui/q;
    //   59: invokevirtual i : ()D
    //   62: ldc2_w 2.0
    //   65: ddiv
    //   66: dcmpg
    //   67: ifge -> 78
    //   70: aload_0
    //   71: getfield f : Lcom/efiAnalytics/ui/q;
    //   74: dconst_0
    //   75: invokevirtual d : (D)V
    //   78: aload_0
    //   79: getfield q : I
    //   82: istore #4
    //   84: iload #4
    //   86: iload_2
    //   87: aload_0
    //   88: getfield q : I
    //   91: iadd
    //   92: if_icmpge -> 124
    //   95: iload #4
    //   97: aload_1
    //   98: invokevirtual d : ()I
    //   101: if_icmpge -> 124
    //   104: aload_0
    //   105: getfield f : Lcom/efiAnalytics/ui/q;
    //   108: aload_3
    //   109: iload #4
    //   111: invokevirtual c : (I)F
    //   114: f2d
    //   115: invokevirtual ExceptionInVPackage : (D)V
    //   118: iinc #4, 1
    //   121: goto -> 84
    //   124: aload_0
    //   125: getfield f : Lcom/efiAnalytics/ui/q;
    //   128: invokevirtual repaint : ()V
    //   131: goto -> 2476
    //   134: aload_0
    //   135: getfield n : Lcom/efiAnalytics/ui/aS;
    //   138: aload_0
    //   139: getfield h : Lcom/efiAnalytics/ui/aU;
    //   142: invokevirtual equals : (Ljava/lang/Object;)Z
    //   145: ifeq -> 2476
    //   148: aload_1
    //   149: invokevirtual d : ()I
    //   152: i2d
    //   153: aload_0
    //   154: getfield p : D
    //   157: dmul
    //   158: d2i
    //   159: istore_2
    //   160: aload_1
    //   161: ldc 'Time'
    //   163: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   166: astore_3
    //   167: aload_1
    //   168: ldc 'ToothTime'
    //   170: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   173: astore #4
    //   175: aload_1
    //   176: ldc 'PriLevel'
    //   178: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   181: astore #5
    //   183: aload_1
    //   184: ldc 'SecLevel'
    //   186: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   189: astore #6
    //   191: aload_1
    //   192: ldc 'Sync'
    //   194: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   197: astore #7
    //   199: aload_1
    //   200: ldc 'Trigger'
    //   202: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)LW/j;
    //   205: astore #8
    //   207: aload_0
    //   208: getfield h : Lcom/efiAnalytics/ui/aU;
    //   211: invokevirtual ExceptionInVPackage : ()V
    //   214: aload_3
    //   215: aload_0
    //   216: getfield q : I
    //   219: invokevirtual c : (I)F
    //   222: fconst_0
    //   223: fcmpl
    //   224: ifle -> 239
    //   227: aload_3
    //   228: aload_0
    //   229: getfield q : I
    //   232: invokevirtual c : (I)F
    //   235: f2d
    //   236: goto -> 244
    //   239: aload_0
    //   240: aload_1
    //   241: invokespecial g : (LW/n;)D
    //   244: dstore #9
    //   246: aload_3
    //   247: iload_2
    //   248: aload_0
    //   249: getfield q : I
    //   252: iadd
    //   253: iconst_1
    //   254: isub
    //   255: invokevirtual c : (I)F
    //   258: fconst_0
    //   259: fcmpl
    //   260: ifle -> 279
    //   263: aload_3
    //   264: iload_2
    //   265: aload_0
    //   266: getfield q : I
    //   269: iadd
    //   270: iconst_1
    //   271: isub
    //   272: invokevirtual c : (I)F
    //   275: f2d
    //   276: goto -> 284
    //   279: aload_0
    //   280: aload_1
    //   281: invokespecial h : (LW/n;)D
    //   284: dstore #11
    //   286: aload_0
    //   287: getfield h : Lcom/efiAnalytics/ui/aU;
    //   290: dload #9
    //   292: invokevirtual b : (D)V
    //   295: aload_0
    //   296: getfield h : Lcom/efiAnalytics/ui/aU;
    //   299: dload #11
    //   301: invokevirtual e : (D)V
    //   304: aload #8
    //   306: invokevirtual f : ()F
    //   309: fconst_0
    //   310: fcmpl
    //   311: ifne -> 341
    //   314: aload #6
    //   316: invokevirtual e : ()F
    //   319: aload #6
    //   321: invokevirtual f : ()F
    //   324: fcmpl
    //   325: ifne -> 341
    //   328: aload_0
    //   329: getfield h : Lcom/efiAnalytics/ui/aU;
    //   332: ldc2_w 2.0
    //   335: invokevirtual d : (D)V
    //   338: goto -> 351
    //   341: aload_0
    //   342: getfield h : Lcom/efiAnalytics/ui/aU;
    //   345: ldc2_w 3.0
    //   348: invokevirtual d : (D)V
    //   351: iconst_0
    //   352: istore #13
    //   354: iconst_0
    //   355: istore #14
    //   357: invokestatic currentTimeMillis : ()J
    //   360: lstore #15
    //   362: ldc2_w -1.0
    //   365: dstore #17
    //   367: ldc2_w -1.0
    //   370: dstore #19
    //   372: iconst_0
    //   373: istore #21
    //   375: iconst_0
    //   376: istore #22
    //   378: iconst_0
    //   379: istore #23
    //   381: iconst_0
    //   382: istore #24
    //   384: iconst_0
    //   385: istore #25
    //   387: ldc -1.0
    //   389: fstore #26
    //   391: iconst_0
    //   392: istore #27
    //   394: iconst_0
    //   395: istore #28
    //   397: iconst_2
    //   398: istore #29
    //   400: iload #29
    //   402: aload_1
    //   403: invokevirtual d : ()I
    //   406: if_icmpge -> 691
    //   409: aload #4
    //   411: iload #29
    //   413: invokevirtual c : (I)F
    //   416: f2d
    //   417: dconst_0
    //   418: dcmpl
    //   419: ifne -> 436
    //   422: iinc #25, 1
    //   425: iload #27
    //   427: ifne -> 442
    //   430: iinc #28, 1
    //   433: goto -> 442
    //   436: iconst_0
    //   437: istore #25
    //   439: iconst_1
    //   440: istore #27
    //   442: iload #25
    //   444: iconst_2
    //   445: if_icmple -> 451
    //   448: goto -> 685
    //   451: iload #13
    //   453: ifne -> 519
    //   456: aload #5
    //   458: invokevirtual f : ()F
    //   461: aload #5
    //   463: invokevirtual e : ()F
    //   466: fcmpl
    //   467: ifeq -> 519
    //   470: aload #4
    //   472: iload #29
    //   474: invokevirtual c : (I)F
    //   477: f2d
    //   478: dconst_0
    //   479: dcmpl
    //   480: ifle -> 519
    //   483: dload #17
    //   485: ldc2_w -1.0
    //   488: dcmpl
    //   489: ifeq -> 509
    //   492: dload #17
    //   494: aload #5
    //   496: iload #29
    //   498: invokevirtual c : (I)F
    //   501: f2d
    //   502: dcmpl
    //   503: ifeq -> 509
    //   506: iconst_1
    //   507: istore #13
    //   509: aload #5
    //   511: iload #29
    //   513: invokevirtual c : (I)F
    //   516: f2d
    //   517: dstore #17
    //   519: iload #14
    //   521: ifne -> 593
    //   524: aload #6
    //   526: invokevirtual f : ()F
    //   529: aload #6
    //   531: invokevirtual e : ()F
    //   534: fcmpl
    //   535: ifeq -> 593
    //   538: aload #4
    //   540: iload #29
    //   542: invokevirtual c : (I)F
    //   545: f2d
    //   546: dconst_0
    //   547: dcmpl
    //   548: ifle -> 593
    //   551: dload #19
    //   553: ldc2_w -1.0
    //   556: dcmpl
    //   557: ifeq -> 584
    //   560: fload #26
    //   562: ldc -1.0
    //   564: fcmpl
    //   565: ifeq -> 584
    //   568: fload #26
    //   570: aload #6
    //   572: iload #29
    //   574: invokevirtual c : (I)F
    //   577: fcmpl
    //   578: ifeq -> 584
    //   581: iconst_1
    //   582: istore #14
    //   584: aload #6
    //   586: iload #29
    //   588: invokevirtual c : (I)F
    //   591: fstore #26
    //   593: aload #6
    //   595: iload #29
    //   597: invokevirtual c : (I)F
    //   600: f2d
    //   601: dstore #19
    //   603: aload #8
    //   605: iload #29
    //   607: invokevirtual c : (I)F
    //   610: fconst_1
    //   611: fcmpl
    //   612: ifne -> 664
    //   615: aload #4
    //   617: iload #29
    //   619: invokevirtual c : (I)F
    //   622: fconst_0
    //   623: fcmpl
    //   624: ifle -> 664
    //   627: aload #6
    //   629: iload #29
    //   631: invokevirtual c : (I)F
    //   634: fconst_1
    //   635: fcmpl
    //   636: ifne -> 645
    //   639: iinc #21, 1
    //   642: goto -> 648
    //   645: iinc #22, 1
    //   648: iload #21
    //   650: ifle -> 685
    //   653: iload #22
    //   655: ifle -> 685
    //   658: iconst_1
    //   659: istore #14
    //   661: goto -> 685
    //   664: aload #5
    //   666: iload #29
    //   668: invokevirtual c : (I)F
    //   671: fconst_1
    //   672: fcmpl
    //   673: ifne -> 682
    //   676: iinc #23, 1
    //   679: goto -> 685
    //   682: iinc #24, 1
    //   685: iinc #29, 1
    //   688: goto -> 400
    //   691: iload #21
    //   693: iload #22
    //   695: if_icmplt -> 726
    //   698: iload #21
    //   700: iload #22
    //   702: if_icmpne -> 709
    //   705: iconst_1
    //   706: goto -> 710
    //   709: iconst_0
    //   710: dload #19
    //   712: dconst_1
    //   713: dcmpl
    //   714: ifne -> 721
    //   717: iconst_1
    //   718: goto -> 722
    //   721: iconst_0
    //   722: iand
    //   723: ifeq -> 730
    //   726: iconst_1
    //   727: goto -> 731
    //   730: iconst_0
    //   731: istore #29
    //   733: iload #23
    //   735: iload #24
    //   737: if_icmple -> 744
    //   740: iconst_1
    //   741: goto -> 745
    //   744: iconst_0
    //   745: istore #30
    //   747: ldc2_w -1.0
    //   750: dstore #17
    //   752: ldc2_w -1.0
    //   755: dstore #19
    //   757: ldc2_w -1.0
    //   760: dstore #31
    //   762: ldc2_w 1.5
    //   765: dstore #33
    //   767: aload_0
    //   768: getfield q : I
    //   771: istore #35
    //   773: iload #35
    //   775: iload_2
    //   776: aload_0
    //   777: getfield q : I
    //   780: iadd
    //   781: if_icmpge -> 2016
    //   784: iload #35
    //   786: aload_1
    //   787: invokevirtual d : ()I
    //   790: if_icmpge -> 2016
    //   793: iload #13
    //   795: ifne -> 810
    //   798: aload #8
    //   800: iload #35
    //   802: invokevirtual c : (I)F
    //   805: fconst_0
    //   806: fcmpl
    //   807: ifne -> 1213
    //   810: aload #5
    //   812: iload #35
    //   814: invokevirtual c : (I)F
    //   817: f2d
    //   818: dstore #36
    //   820: dload #17
    //   822: ldc2_w -1.0
    //   825: dcmpl
    //   826: ifne -> 944
    //   829: iload #13
    //   831: ifne -> 879
    //   834: iload #30
    //   836: iconst_1
    //   837: if_icmpne -> 844
    //   840: iconst_0
    //   841: goto -> 845
    //   844: iconst_1
    //   845: istore #38
    //   847: new com/efiAnalytics/ui/aZ
    //   850: dup
    //   851: aload_3
    //   852: iload #35
    //   854: invokevirtual c : (I)F
    //   857: f2d
    //   858: iload #38
    //   860: i2d
    //   861: invokespecial <init> : (DD)V
    //   864: astore #39
    //   866: aload_0
    //   867: getfield h : Lcom/efiAnalytics/ui/aU;
    //   870: iconst_0
    //   871: aload #39
    //   873: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   876: goto -> 1209
    //   879: new com/efiAnalytics/ui/aZ
    //   882: dup
    //   883: aload_0
    //   884: getfield h : Lcom/efiAnalytics/ui/aU;
    //   887: invokevirtual b : ()D
    //   890: dload #36
    //   892: invokespecial <init> : (DD)V
    //   895: astore #38
    //   897: aload #38
    //   899: iconst_1
    //   900: invokevirtual ExceptionInVPackage : (Z)V
    //   903: aload_0
    //   904: getfield h : Lcom/efiAnalytics/ui/aU;
    //   907: iconst_0
    //   908: aload #38
    //   910: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   913: new com/efiAnalytics/ui/aZ
    //   916: dup
    //   917: aload_3
    //   918: iload #35
    //   920: invokevirtual c : (I)F
    //   923: f2d
    //   924: dload #36
    //   926: invokespecial <init> : (DD)V
    //   929: astore #38
    //   931: aload_0
    //   932: getfield h : Lcom/efiAnalytics/ui/aU;
    //   935: iconst_0
    //   936: aload #38
    //   938: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   941: goto -> 1209
    //   944: iload #13
    //   946: ifeq -> 1014
    //   949: new com/efiAnalytics/ui/aZ
    //   952: dup
    //   953: aload_3
    //   954: iload #35
    //   956: invokevirtual c : (I)F
    //   959: f2d
    //   960: dload #17
    //   962: invokespecial <init> : (DD)V
    //   965: astore #38
    //   967: aload #38
    //   969: iconst_1
    //   970: invokevirtual ExceptionInVPackage : (Z)V
    //   973: aload_0
    //   974: getfield h : Lcom/efiAnalytics/ui/aU;
    //   977: iconst_0
    //   978: aload #38
    //   980: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   983: new com/efiAnalytics/ui/aZ
    //   986: dup
    //   987: aload_3
    //   988: iload #35
    //   990: invokevirtual c : (I)F
    //   993: f2d
    //   994: dload #36
    //   996: invokespecial <init> : (DD)V
    //   999: astore #38
    //   1001: aload_0
    //   1002: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1005: iconst_0
    //   1006: aload #38
    //   1008: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1011: goto -> 1209
    //   1014: iload #35
    //   1016: iload_2
    //   1017: aload_0
    //   1018: getfield q : I
    //   1021: iadd
    //   1022: iconst_1
    //   1023: isub
    //   1024: if_icmpeq -> 1038
    //   1027: iload #35
    //   1029: aload_1
    //   1030: invokevirtual d : ()I
    //   1033: iconst_1
    //   1034: isub
    //   1035: if_icmpne -> 1088
    //   1038: iload #13
    //   1040: ifne -> 1209
    //   1043: iload #30
    //   1045: iconst_1
    //   1046: if_icmpne -> 1053
    //   1049: iconst_0
    //   1050: goto -> 1054
    //   1053: iconst_1
    //   1054: istore #38
    //   1056: new com/efiAnalytics/ui/aZ
    //   1059: dup
    //   1060: aload_3
    //   1061: iload #35
    //   1063: invokevirtual c : (I)F
    //   1066: f2d
    //   1067: iload #38
    //   1069: i2d
    //   1070: invokespecial <init> : (DD)V
    //   1073: astore #39
    //   1075: aload_0
    //   1076: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1079: iconst_0
    //   1080: aload #39
    //   1082: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1085: goto -> 1209
    //   1088: dload #36
    //   1090: iload #30
    //   1092: i2d
    //   1093: dcmpl
    //   1094: ifne -> 1209
    //   1097: iload #30
    //   1099: iconst_1
    //   1100: if_icmpne -> 1107
    //   1103: iconst_0
    //   1104: goto -> 1108
    //   1107: iconst_1
    //   1108: istore #38
    //   1110: new com/efiAnalytics/ui/aZ
    //   1113: dup
    //   1114: aload_3
    //   1115: iload #35
    //   1117: invokevirtual c : (I)F
    //   1120: f2d
    //   1121: iload #38
    //   1123: i2d
    //   1124: invokespecial <init> : (DD)V
    //   1127: astore #39
    //   1129: aload #39
    //   1131: iconst_1
    //   1132: invokevirtual ExceptionInVPackage : (Z)V
    //   1135: aload_0
    //   1136: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1139: iconst_0
    //   1140: aload #39
    //   1142: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1145: new com/efiAnalytics/ui/aZ
    //   1148: dup
    //   1149: aload_3
    //   1150: iload #35
    //   1152: invokevirtual c : (I)F
    //   1155: f2d
    //   1156: iload #30
    //   1158: i2d
    //   1159: invokespecial <init> : (DD)V
    //   1162: astore #39
    //   1164: aload_0
    //   1165: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1168: iconst_0
    //   1169: aload #39
    //   1171: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1174: new com/efiAnalytics/ui/aZ
    //   1177: dup
    //   1178: aload_3
    //   1179: iload #35
    //   1181: invokevirtual c : (I)F
    //   1184: f2d
    //   1185: iload #38
    //   1187: i2d
    //   1188: invokespecial <init> : (DD)V
    //   1191: astore #39
    //   1193: aload #39
    //   1195: iconst_1
    //   1196: invokevirtual ExceptionInVPackage : (Z)V
    //   1199: aload_0
    //   1200: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1203: iconst_0
    //   1204: aload #39
    //   1206: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1209: dload #36
    //   1211: dstore #17
    //   1213: iload #14
    //   1215: ifne -> 1230
    //   1218: aload #8
    //   1220: iload #35
    //   1222: invokevirtual c : (I)F
    //   1225: fconst_1
    //   1226: fcmpl
    //   1227: ifne -> 1821
    //   1230: aload #6
    //   1232: iload #35
    //   1234: invokevirtual c : (I)F
    //   1237: f2d
    //   1238: dstore #36
    //   1240: dload #36
    //   1242: dload #33
    //   1244: dadd
    //   1245: dstore #38
    //   1247: dload #19
    //   1249: ldc2_w -1.0
    //   1252: dcmpl
    //   1253: ifne -> 1525
    //   1256: iload #14
    //   1258: ifne -> 1413
    //   1261: dload #38
    //   1263: dload #33
    //   1265: dcmpl
    //   1266: ifne -> 1276
    //   1269: dconst_1
    //   1270: dload #33
    //   1272: dadd
    //   1273: goto -> 1278
    //   1276: dload #33
    //   1278: dstore #40
    //   1280: new com/efiAnalytics/ui/aZ
    //   1283: dup
    //   1284: aload_0
    //   1285: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1288: invokevirtual b : ()D
    //   1291: dload #40
    //   1293: invokespecial <init> : (DD)V
    //   1296: astore #42
    //   1298: aload #42
    //   1300: iconst_1
    //   1301: invokevirtual ExceptionInVPackage : (Z)V
    //   1304: aload_0
    //   1305: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1308: iconst_1
    //   1309: aload #42
    //   1311: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1314: new com/efiAnalytics/ui/aZ
    //   1317: dup
    //   1318: aload_3
    //   1319: iload #35
    //   1321: invokevirtual c : (I)F
    //   1324: f2d
    //   1325: dload #40
    //   1327: invokespecial <init> : (DD)V
    //   1330: astore #42
    //   1332: aload #42
    //   1334: iconst_1
    //   1335: invokevirtual ExceptionInVPackage : (Z)V
    //   1338: aload_0
    //   1339: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1342: iconst_1
    //   1343: aload #42
    //   1345: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1348: new com/efiAnalytics/ui/aZ
    //   1351: dup
    //   1352: aload_3
    //   1353: iload #35
    //   1355: invokevirtual c : (I)F
    //   1358: f2d
    //   1359: dload #38
    //   1361: invokespecial <init> : (DD)V
    //   1364: astore #42
    //   1366: aload_0
    //   1367: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1370: iconst_1
    //   1371: aload #42
    //   1373: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1376: new com/efiAnalytics/ui/aZ
    //   1379: dup
    //   1380: aload_3
    //   1381: iload #35
    //   1383: invokevirtual c : (I)F
    //   1386: f2d
    //   1387: dload #40
    //   1389: invokespecial <init> : (DD)V
    //   1392: astore #42
    //   1394: aload #42
    //   1396: iconst_1
    //   1397: invokevirtual ExceptionInVPackage : (Z)V
    //   1400: aload_0
    //   1401: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1404: iconst_1
    //   1405: aload #42
    //   1407: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1410: goto -> 1813
    //   1413: dload #38
    //   1415: dload #33
    //   1417: dcmpl
    //   1418: ifne -> 1426
    //   1421: dload #33
    //   1423: goto -> 1430
    //   1426: dconst_1
    //   1427: dload #33
    //   1429: dadd
    //   1430: dstore #31
    //   1432: new com/efiAnalytics/ui/aZ
    //   1435: dup
    //   1436: aload_0
    //   1437: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1440: invokevirtual b : ()D
    //   1443: dload #31
    //   1445: invokespecial <init> : (DD)V
    //   1448: astore #40
    //   1450: aload_0
    //   1451: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1454: iconst_1
    //   1455: aload #40
    //   1457: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1460: new com/efiAnalytics/ui/aZ
    //   1463: dup
    //   1464: aload_3
    //   1465: iload #35
    //   1467: invokevirtual c : (I)F
    //   1470: f2d
    //   1471: dload #31
    //   1473: invokespecial <init> : (DD)V
    //   1476: astore #40
    //   1478: aload #40
    //   1480: iconst_1
    //   1481: invokevirtual ExceptionInVPackage : (Z)V
    //   1484: aload_0
    //   1485: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1488: iconst_1
    //   1489: aload #40
    //   1491: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1494: new com/efiAnalytics/ui/aZ
    //   1497: dup
    //   1498: aload_3
    //   1499: iload #35
    //   1501: invokevirtual c : (I)F
    //   1504: f2d
    //   1505: dload #38
    //   1507: invokespecial <init> : (DD)V
    //   1510: astore #40
    //   1512: aload_0
    //   1513: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1516: iconst_1
    //   1517: aload #40
    //   1519: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1522: goto -> 1813
    //   1525: iload #14
    //   1527: ifeq -> 1595
    //   1530: new com/efiAnalytics/ui/aZ
    //   1533: dup
    //   1534: aload_3
    //   1535: iload #35
    //   1537: invokevirtual c : (I)F
    //   1540: f2d
    //   1541: dload #31
    //   1543: invokespecial <init> : (DD)V
    //   1546: astore #40
    //   1548: aload #40
    //   1550: iconst_1
    //   1551: invokevirtual ExceptionInVPackage : (Z)V
    //   1554: aload_0
    //   1555: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1558: iconst_1
    //   1559: aload #40
    //   1561: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1564: new com/efiAnalytics/ui/aZ
    //   1567: dup
    //   1568: aload_3
    //   1569: iload #35
    //   1571: invokevirtual c : (I)F
    //   1574: f2d
    //   1575: dload #38
    //   1577: invokespecial <init> : (DD)V
    //   1580: astore #40
    //   1582: aload_0
    //   1583: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1586: iconst_1
    //   1587: aload #40
    //   1589: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1592: goto -> 1813
    //   1595: iload #35
    //   1597: iload_2
    //   1598: aload_0
    //   1599: getfield q : I
    //   1602: iadd
    //   1603: iconst_1
    //   1604: isub
    //   1605: if_icmpeq -> 1619
    //   1608: iload #35
    //   1610: aload_1
    //   1611: invokevirtual d : ()I
    //   1614: iconst_1
    //   1615: isub
    //   1616: if_icmpne -> 1669
    //   1619: iload #14
    //   1621: ifne -> 1813
    //   1624: iload #29
    //   1626: i2d
    //   1627: dload #33
    //   1629: dadd
    //   1630: dstore #40
    //   1632: new com/efiAnalytics/ui/aZ
    //   1635: dup
    //   1636: aload_3
    //   1637: iload #35
    //   1639: invokevirtual c : (I)F
    //   1642: f2d
    //   1643: dload #40
    //   1645: invokespecial <init> : (DD)V
    //   1648: astore #42
    //   1650: aload #42
    //   1652: iconst_1
    //   1653: invokevirtual ExceptionInVPackage : (Z)V
    //   1656: aload_0
    //   1657: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1660: iconst_1
    //   1661: aload #42
    //   1663: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1666: goto -> 1813
    //   1669: aload #8
    //   1671: iload #35
    //   1673: invokevirtual c : (I)F
    //   1676: fconst_1
    //   1677: fcmpl
    //   1678: ifeq -> 1698
    //   1681: iload #29
    //   1683: i2d
    //   1684: dload #36
    //   1686: dcmpl
    //   1687: ifeq -> 1813
    //   1690: dload #38
    //   1692: dload #31
    //   1694: dcmpl
    //   1695: ifeq -> 1813
    //   1698: dload #38
    //   1700: dload #33
    //   1702: dcmpl
    //   1703: ifne -> 1713
    //   1706: dconst_1
    //   1707: dload #33
    //   1709: dadd
    //   1710: goto -> 1715
    //   1713: dload #33
    //   1715: dstore #40
    //   1717: new com/efiAnalytics/ui/aZ
    //   1720: dup
    //   1721: aload_3
    //   1722: iload #35
    //   1724: invokevirtual c : (I)F
    //   1727: f2d
    //   1728: dload #40
    //   1730: invokespecial <init> : (DD)V
    //   1733: astore #42
    //   1735: aload #42
    //   1737: iconst_1
    //   1738: invokevirtual ExceptionInVPackage : (Z)V
    //   1741: aload_0
    //   1742: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1745: iconst_1
    //   1746: aload #42
    //   1748: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1751: new com/efiAnalytics/ui/aZ
    //   1754: dup
    //   1755: aload_3
    //   1756: iload #35
    //   1758: invokevirtual c : (I)F
    //   1761: f2d
    //   1762: dload #38
    //   1764: invokespecial <init> : (DD)V
    //   1767: astore #42
    //   1769: aload_0
    //   1770: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1773: iconst_1
    //   1774: aload #42
    //   1776: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1779: new com/efiAnalytics/ui/aZ
    //   1782: dup
    //   1783: aload_3
    //   1784: iload #35
    //   1786: invokevirtual c : (I)F
    //   1789: f2d
    //   1790: dload #40
    //   1792: invokespecial <init> : (DD)V
    //   1795: astore #42
    //   1797: aload #42
    //   1799: iconst_1
    //   1800: invokevirtual ExceptionInVPackage : (Z)V
    //   1803: aload_0
    //   1804: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1807: iconst_1
    //   1808: aload #42
    //   1810: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1813: dload #38
    //   1815: dstore #31
    //   1817: dload #36
    //   1819: dstore #19
    //   1821: aload #7
    //   1823: iload #35
    //   1825: invokevirtual c : (I)F
    //   1828: fconst_0
    //   1829: fcmpl
    //   1830: ifne -> 1953
    //   1833: aload #4
    //   1835: iload #35
    //   1837: invokevirtual c : (I)F
    //   1840: fconst_0
    //   1841: fcmpl
    //   1842: ifle -> 1953
    //   1845: new com/efiAnalytics/ui/aZ
    //   1848: dup
    //   1849: aload_3
    //   1850: iload #35
    //   1852: invokevirtual c : (I)F
    //   1855: f2d
    //   1856: ldc2_w -0.75
    //   1859: invokespecial <init> : (DD)V
    //   1862: astore #36
    //   1864: aload #36
    //   1866: iconst_1
    //   1867: invokevirtual ExceptionInVPackage : (Z)V
    //   1870: aload_0
    //   1871: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1874: iconst_2
    //   1875: aload #36
    //   1877: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1880: new com/efiAnalytics/ui/aZ
    //   1883: dup
    //   1884: aload_3
    //   1885: iload #35
    //   1887: invokevirtual c : (I)F
    //   1890: f2d
    //   1891: ldc2_w -0.5
    //   1894: invokespecial <init> : (DD)V
    //   1897: astore #36
    //   1899: aload #36
    //   1901: iconst_1
    //   1902: invokevirtual ExceptionInVPackage : (Z)V
    //   1905: aload_0
    //   1906: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1909: iconst_2
    //   1910: aload #36
    //   1912: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1915: new com/efiAnalytics/ui/aZ
    //   1918: dup
    //   1919: aload_3
    //   1920: iload #35
    //   1922: invokevirtual c : (I)F
    //   1925: f2d
    //   1926: ldc2_w -0.75
    //   1929: invokespecial <init> : (DD)V
    //   1932: astore #36
    //   1934: aload #36
    //   1936: iconst_1
    //   1937: invokevirtual ExceptionInVPackage : (Z)V
    //   1940: aload_0
    //   1941: getfield h : Lcom/efiAnalytics/ui/aU;
    //   1944: iconst_2
    //   1945: aload #36
    //   1947: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   1950: goto -> 2010
    //   1953: iload #35
    //   1955: aload_0
    //   1956: getfield q : I
    //   1959: if_icmpeq -> 1975
    //   1962: iload #35
    //   1964: iload_2
    //   1965: aload_0
    //   1966: getfield q : I
    //   1969: iadd
    //   1970: iconst_1
    //   1971: isub
    //   1972: if_icmpne -> 2010
    //   1975: new com/efiAnalytics/ui/aZ
    //   1978: dup
    //   1979: aload_3
    //   1980: iload #35
    //   1982: invokevirtual c : (I)F
    //   1985: f2d
    //   1986: ldc2_w -0.75
    //   1989: invokespecial <init> : (DD)V
    //   1992: astore #36
    //   1994: aload #36
    //   1996: iconst_1
    //   1997: invokevirtual ExceptionInVPackage : (Z)V
    //   2000: aload_0
    //   2001: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2004: iconst_2
    //   2005: aload #36
    //   2007: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2010: iinc #35, 1
    //   2013: goto -> 773
    //   2016: aload #8
    //   2018: invokevirtual f : ()F
    //   2021: fconst_1
    //   2022: fcmpl
    //   2023: ifne -> 2311
    //   2026: iload #14
    //   2028: ifeq -> 2234
    //   2031: dload #31
    //   2033: dconst_0
    //   2034: dcmpl
    //   2035: ifle -> 2075
    //   2038: new com/efiAnalytics/ui/aZ
    //   2041: dup
    //   2042: aload_0
    //   2043: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2046: invokevirtual t : ()D
    //   2049: dload #31
    //   2051: invokespecial <init> : (DD)V
    //   2054: astore #35
    //   2056: aload #35
    //   2058: iconst_1
    //   2059: invokevirtual ExceptionInVPackage : (Z)V
    //   2062: aload_0
    //   2063: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2066: iconst_1
    //   2067: aload #35
    //   2069: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2072: goto -> 2311
    //   2075: aload_0
    //   2076: aload_1
    //   2077: aload_0
    //   2078: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2081: invokevirtual t : ()D
    //   2084: invokespecial ExceptionInVPackage : (LW/n;D)D
    //   2087: dstore #35
    //   2089: dload #35
    //   2091: dconst_0
    //   2092: dcmpl
    //   2093: iflt -> 2117
    //   2096: dload #35
    //   2098: dconst_0
    //   2099: dcmpl
    //   2100: ifne -> 2110
    //   2103: dconst_1
    //   2104: dload #33
    //   2106: dadd
    //   2107: goto -> 2112
    //   2110: dload #33
    //   2112: dstore #31
    //   2114: goto -> 2156
    //   2117: aload_0
    //   2118: aload_1
    //   2119: aload_0
    //   2120: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2123: invokevirtual t : ()D
    //   2126: invokespecial b : (LW/n;D)D
    //   2129: dstore #37
    //   2131: dload #37
    //   2133: dconst_0
    //   2134: dcmpl
    //   2135: iflt -> 2156
    //   2138: dload #37
    //   2140: dconst_0
    //   2141: dcmpl
    //   2142: ifne -> 2150
    //   2145: dload #33
    //   2147: goto -> 2154
    //   2150: dconst_1
    //   2151: dload #33
    //   2153: dadd
    //   2154: dstore #31
    //   2156: dload #31
    //   2158: dconst_0
    //   2159: dcmpl
    //   2160: ifle -> 2231
    //   2163: new com/efiAnalytics/ui/aZ
    //   2166: dup
    //   2167: aload_0
    //   2168: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2171: invokevirtual b : ()D
    //   2174: dload #31
    //   2176: invokespecial <init> : (DD)V
    //   2179: astore #37
    //   2181: aload #37
    //   2183: iconst_1
    //   2184: invokevirtual ExceptionInVPackage : (Z)V
    //   2187: aload_0
    //   2188: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2191: iconst_1
    //   2192: aload #37
    //   2194: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2197: new com/efiAnalytics/ui/aZ
    //   2200: dup
    //   2201: aload_0
    //   2202: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2205: invokevirtual t : ()D
    //   2208: dload #31
    //   2210: invokespecial <init> : (DD)V
    //   2213: astore #37
    //   2215: aload #37
    //   2217: iconst_1
    //   2218: invokevirtual ExceptionInVPackage : (Z)V
    //   2221: aload_0
    //   2222: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2225: iconst_1
    //   2226: aload #37
    //   2228: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2231: goto -> 2311
    //   2234: iload #29
    //   2236: i2d
    //   2237: dload #33
    //   2239: dadd
    //   2240: dstore #35
    //   2242: new com/efiAnalytics/ui/aZ
    //   2245: dup
    //   2246: aload_0
    //   2247: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2250: invokevirtual b : ()D
    //   2253: dload #35
    //   2255: invokespecial <init> : (DD)V
    //   2258: astore #37
    //   2260: aload #37
    //   2262: iconst_1
    //   2263: invokevirtual ExceptionInVPackage : (Z)V
    //   2266: aload_0
    //   2267: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2270: iconst_0
    //   2271: iconst_1
    //   2272: aload #37
    //   2274: invokevirtual ExceptionInVPackage : (IILcom/efiAnalytics/ui/aZ;)V
    //   2277: new com/efiAnalytics/ui/aZ
    //   2280: dup
    //   2281: aload_0
    //   2282: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2285: invokevirtual t : ()D
    //   2288: dload #35
    //   2290: invokespecial <init> : (DD)V
    //   2293: astore #37
    //   2295: aload #37
    //   2297: iconst_1
    //   2298: invokevirtual ExceptionInVPackage : (Z)V
    //   2301: aload_0
    //   2302: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2305: iconst_1
    //   2306: aload #37
    //   2308: invokevirtual ExceptionInVPackage : (ILcom/efiAnalytics/ui/aZ;)V
    //   2311: aload_1
    //   2312: invokevirtual d : ()I
    //   2315: istore #35
    //   2317: iload #35
    //   2319: iload #25
    //   2321: isub
    //   2322: aload_0
    //   2323: getfield q : I
    //   2326: isub
    //   2327: istore #36
    //   2329: iload #25
    //   2331: ifle -> 2469
    //   2334: aload_0
    //   2335: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2338: invokevirtual t : ()D
    //   2341: aload_0
    //   2342: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2345: invokevirtual b : ()D
    //   2348: dsub
    //   2349: iload #36
    //   2351: i2d
    //   2352: ddiv
    //   2353: dstore #37
    //   2355: iload #25
    //   2357: iload #28
    //   2359: isub
    //   2360: istore #39
    //   2362: iload_2
    //   2363: aload_0
    //   2364: getfield q : I
    //   2367: iadd
    //   2368: iload #35
    //   2370: iload #39
    //   2372: isub
    //   2373: isub
    //   2374: istore #39
    //   2376: iload #28
    //   2378: aload_0
    //   2379: getfield q : I
    //   2382: isub
    //   2383: istore #28
    //   2385: iload #28
    //   2387: i2d
    //   2388: dload #37
    //   2390: dmul
    //   2391: dstore #40
    //   2393: iload #39
    //   2395: i2d
    //   2396: dload #37
    //   2398: dmul
    //   2399: dstore #42
    //   2401: dload #40
    //   2403: dconst_0
    //   2404: dcmpl
    //   2405: ifle -> 2445
    //   2408: aload_0
    //   2409: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2412: aload_0
    //   2413: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2416: invokevirtual b : ()D
    //   2419: dload #40
    //   2421: dsub
    //   2422: invokevirtual b : (D)V
    //   2425: aload_0
    //   2426: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2429: aload_0
    //   2430: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2433: invokevirtual b : ()D
    //   2436: iload_2
    //   2437: i2d
    //   2438: dload #37
    //   2440: dmul
    //   2441: dadd
    //   2442: invokevirtual e : (D)V
    //   2445: dload #42
    //   2447: dconst_0
    //   2448: dcmpl
    //   2449: ifle -> 2469
    //   2452: aload_0
    //   2453: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2456: aload_0
    //   2457: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2460: invokevirtual t : ()D
    //   2463: dload #42
    //   2465: dadd
    //   2466: invokevirtual e : (D)V
    //   2469: aload_0
    //   2470: getfield h : Lcom/efiAnalytics/ui/aU;
    //   2473: invokevirtual repaint : ()V
    //   2476: return
  }

  private double g(n paramn) {
    j j1 = paramn.ExceptionInVPackage("Time");
    for (byte b = 0; b < paramn.d(); b++) {
      if (j1.c(b) != 0.0F) return j1.c(b);
    }
    return 0.0D;
  }

  private double h(n paramn) {
    j j1 = paramn.ExceptionInVPackage("Time");
    for (int i = paramn.d() - 1; i >= 0; i--) {
      if (j1.c(i) != 0.0F) return j1.c(i);
    }
    return 0.0D;
  }

  private double ExceptionInVPackage(n paramn, double paramDouble) {
    j j1 = paramn.ExceptionInVPackage("Time");
    j j2 = paramn.ExceptionInVPackage("SecLevel");
    j j3 = paramn.ExceptionInVPackage("Trigger");
    for (byte b = 0; b < paramn.d(); b++) {
      if (j1.c(b) > paramDouble && j3.c(b) == 1.0F) return j2.c(b);
    }
    return -1.0D;
  }

  private double b(n paramn, double paramDouble) {
    j j1 = paramn.ExceptionInVPackage("Time");
    j j2 = paramn.ExceptionInVPackage("SecLevel");
    j j3 = paramn.ExceptionInVPackage("Trigger");
    for (int i = paramn.d() - 1; i >= 0; i--) {
      if (j1.c(i) < paramDouble && j3.c(i) == 1.0F) return j2.c(i);
    }
    return -1.0D;
  }

  protected void e() {
    this.q = this.m.d();
    if (this.o != null) b(this.o);
  }

  private void i(n paramn) {
    if (!this.b.isDisplayable() && !this.d.isDisplayable()) return;
    if (paramn.d() == 0) {
      this.b.setText("Empty read, No Data Received from Controller");
      this.c.getDataVector().clear();
      this.c.fireTableDataChanged();
    } else {
      this.b.setText("");
      Vector<String> vector = new Vector();
      Vector<Vector> vector1 = new Vector();
      StringBuffer stringBuffer = new StringBuffer();
      stringBuffer.append(paramn.g() + "\n");
      byte b;
      for (b = 0; b < paramn.size(); b++) {
        j j1 = (j) paramn.get(b);
        stringBuffer.append(j1.ExceptionInVPackage());
        vector.add(j1.ExceptionInVPackage());
        if (b < paramn.size() - 1) stringBuffer.append("\t");
      }
      stringBuffer.append("\n");
      try {
        for (b = 0; b < paramn.size(); b++) {
          j j1 = (j) paramn.get(b);
          stringBuffer.append(j1.n());
          if (b < paramn.size() - 1) stringBuffer.append("\t");
        }
      } catch (Exception exception) {
        throw new ExceptionInVPackage("Invalid units row in log file.");
      }
      stringBuffer.append("\n");
      if (this.F) {
        for (b = 0; b < paramn.d(); b++) {
          Vector<Float> vector2 = new Vector();
          vector1.add(vector2);
          for (byte b1 = 0; b1 < paramn.size(); b1++) {
            j j1 = (j) paramn.get(b1);
            vector2.add(Float.valueOf(j1.d(b)));
          }
        }
        synchronized (this.c) {
          this.c.setDataVector(vector1, vector);
        }
      }
      if (paramn.d() > 0) {
        for (b = 0; b < paramn.d(); b++) {
          try {
            for (byte b1 = 0; b1 < paramn.size(); b1++) {
              j j1 = (j) paramn.get(b1);
              stringBuffer.append(j1.c(b) + "");
              if (b1 < paramn.size() - 1) stringBuffer.append("\t");
            }
          } catch (Exception exception) {
            throw new ExceptionInVPackage(
                "Invalid data found at record: " + b + "\nThis file does not appear valid.");
          }
          stringBuffer.append("\n");
        }
      } else {
        stringBuffer.append("This read contained no data.");
        ArrayList<Integer> arrayList = new ArrayList();
        byte b1;
        for (b1 = 0; b1 < this.e.size(); b1++) {
          if (((n) this.e.get(b1)).d() > 0) arrayList.add(new Integer(b1 + 1));
        }
        if (arrayList.size() > 0) {
          stringBuffer.append("Data Was receive for pages:\n");
          for (b1 = 0; b1 < arrayList.size(); b1++)
            stringBuffer.append(arrayList.get(b1)).append("\n");
        } else {
          stringBuffer.append("No viewable Data in entire file");
        }
      }
      this.b.setText(stringBuffer.toString());
    }
    this.b.setCaretPosition(0);
  }

  protected void ExceptionInVPackage(double paramDouble) {
    if (this.p / 2.0D > 0.0625D) {
      ExceptionInVPackage(this.p / 2.0D, paramDouble);
    } else {
      ExceptionInVPackage(0.0625D, paramDouble);
    }
  }

  private int ExceptionInVPackage() {
    return (int) Math.round(this.r * this.p);
  }

  public void ExceptionInVPackage(double paramDouble1, double paramDouble2) {
    double d1 = this.m.c();
    double d2 = 0.0D;
    if (paramDouble1 == this.p) return;
    if (paramDouble1 > this.p) {
      this.p = paramDouble1;
      d2 = -(ExceptionInVPackage() * paramDouble2 / this.r) / 2.0D;
    } else {
      d2 = ExceptionInVPackage() * paramDouble2 / this.r / 2.0D;
      this.p = paramDouble1;
    }
    b(y, paramDouble1 + "");
    this.m.b();
    this.m.ExceptionInVPackage(d1 + d2);
    e();
  }

  protected void b(double paramDouble) {
    if (this.p * 2.0D < 1.0D) {
      ExceptionInVPackage(this.p * 2.0D, paramDouble);
    } else {
      ExceptionInVPackage(1.0D, paramDouble);
    }
  }

  public void ExceptionInVPackage(et paramet) {
    this.G = paramet;
  }

  public boolean f() {
    return this.K;
  }

  public void g() {
    this.e.clear();
    this.b.setText("");
    this.n.c();
    this.n.repaint();
    d();
  }

  public boolean h() {
    return (this.e.size() > 0);
  }

  public void ExceptionInVPackage(j paramj) {
    this.H = paramj;
  }

  public int i() {
    return this.M;
  }

  public void b(int paramInt) {
    this.M = paramInt;
  }

  public void ExceptionInVPackage(String paramString) {
    this.ExceptionInVPackage.ExceptionInVPackage(paramString);
  }

  public boolean j() {
    return this.L;
  }

  public void ExceptionInVPackage(boolean paramBoolean) {
    this.L = paramBoolean;
  }

  protected Component k() {
    return (Component) this.n;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
