package ao;

import W.j;
import W.n;
import ar.c;
import ar.d;
import ax.U;
import bH.D;
import bH.I;
import bH.J;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.eJ;
import g.k;
import h.b;
import h.g;
import h.i;
import i.a;
import i.b;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import k.a;

public class aw extends JComponent implements bl, fE, fJ, k, l, a, b {
  Image a = null;
  
  Image b = null;
  
  Image c = null;
  
  Image d = null;
  
  Image e = null;
  
  Image f = null;
  
  Image g = null;
  
  Image h = null;
  
  Color i = Color.white;
  
  Color j = null;
  
  HashMap k = new HashMap<>();
  
  n l = null;
  
  HashMap m = new HashMap<>();
  
  HashMap n = null;
  
  private j W = null;
  
  hx o = null;
  
  int p = 0;
  
  int q = 0;
  
  int r = 100;
  
  double s = 2.0D;
  
  private int X = 0;
  
  int t = -1;
  
  int u = eJ.a(80);
  
  private static final int Y = eJ.a(100);
  
  private static final int Z = eJ.a(160);
  
  boolean v = true;
  
  boolean w = false;
  
  boolean x = true;
  
  boolean y = true;
  
  ArrayList z = new ArrayList();
  
  int A = 0;
  
  static final int B = eJ.a(20);
  
  private F aa = null;
  
  private int ab = 2;
  
  ArrayList C = new ArrayList();
  
  String D = null;
  
  String E = null;
  
  String F = null;
  
  String G = null;
  
  private String ac = null;
  
  private static boolean ad = false;
  
  List H = new ArrayList();
  
  Stroke I = new BasicStroke(1.0F);
  
  int J = 16000;
  
  boolean K = false;
  
  boolean L = true;
  
  boolean M = false;
  
  private int ae = Integer.MIN_VALUE;
  
  private int af = Integer.MAX_VALUE;
  
  Color N = new Color(128, 128, 128, 128);
  
  private boolean ag = true;
  
  private boolean ah = true;
  
  private j ai = null;
  
  int O = 10;
  
  L P = null;
  
  L Q = null;
  
  a R = null;
  
  private boolean aj = true;
  
  boolean S = false;
  
  private static final String ak = i.d();
  
  String T = null;
  
  private boolean al = false;
  
  boolean U = false;
  
  int V = -1;
  
  public aw(hx paramhx) {
    this.o = paramhx;
    this.a = Toolkit.getDefaultToolkit().getImage(i.A);
    setFocusable(true);
    this.ab = i.a("numberOfOverlays", i.u);
    this.ag = i.a("holdGraphCentered", i.x);
    Font font = UIManager.getFont("Label.font");
    int i = eJ.a(11);
    if (font != null)
      i = Math.round(font.getSize2D() * i / eJ.a()); 
    setFont(new Font("SansSerif", 0, i));
    String str = i.c("startUpBackgroundColor");
    if (str != null && !str.isEmpty())
      this.j = i.a("startUpBackgroundColor", Color.lightGray); 
  }
  
  public void a(String paramString) {
    this.ac = paramString;
  }
  
  public void a(j paramj) {
    this.W = paramj;
    if (paramj != null && paramj.m() < 0)
      paramj.e(3); 
  }
  
  public void a(int paramInt1, int paramInt2) {
    if (b.a().a("searchLogFiles")) {
      br br = new br();
      a((bq)br);
      add((Component)br);
      br.show(this, paramInt1, paramInt2);
    } 
  }
  
  public bq a(bq parambq) {
    JMenu jMenu1 = new JMenu("Marks");
    if (this.m != null && !this.m.isEmpty()) {
      Object[] arrayOfObject = this.m.keySet().toArray();
      if (arrayOfObject.length < 300) {
        arrayOfObject = k.a(arrayOfObject);
        for (byte b1 = 0; b1 < arrayOfObject.length; b1++) {
          int i = ((Integer)arrayOfObject[b1]).intValue();
          JMenuItem jMenuItem = new JMenuItem(this.o.r().b(i));
          jMenuItem.setActionCommand("jumpTo:" + i);
          jMenuItem.addActionListener(new ax(this));
          jMenu1.add(jMenuItem);
        } 
      } else {
        jMenu1.add("Too many Marks in this log: " + arrayOfObject.length);
      } 
    } else {
      JMenuItem jMenuItem = new JMenuItem("No Marks in Current Data Log");
      jMenuItem.setEnabled(false);
      jMenu1.add(jMenuItem);
    } 
    jMenu1.addSeparator();
    JMenuItem jMenuItem1 = new JMenuItem("Add mark at cursor position");
    jMenuItem1.addActionListener(new aI(this));
    jMenu1.add(jMenuItem1);
    if (this.m.get(this.q + "") != null) {
      String str = (String)this.m.get(this.q + "");
      jMenuItem1 = new JMenuItem("Delete Mark: " + str);
      jMenuItem1.addActionListener(new aN(this));
      jMenu1.add(jMenuItem1);
    } 
    parambq.add(jMenu1);
    if (this.n != null && !this.n.isEmpty()) {
      String str = (this.P == null) ? "Time Gaps" : "Timeslip lines";
      JMenu jMenu = new JMenu(str);
      str = (this.P == null) ? "Show Time Gap Lines" : "Show Timeslip lines";
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, this.y);
      jCheckBoxMenuItem.addItemListener(new aO(this));
      jMenu.add(jCheckBoxMenuItem);
      jMenu.addSeparator();
      Object[] arrayOfObject = this.n.keySet().toArray();
      arrayOfObject = k.a(arrayOfObject);
      for (byte b1 = 0; b1 < arrayOfObject.length; b1++) {
        int i = ((Integer)arrayOfObject[b1]).intValue();
        JMenuItem jMenuItem = new JMenuItem(this.o.r().d(i));
        jMenuItem.setActionCommand("jumpTo:" + i);
        jMenuItem.addActionListener(new aP(this));
        jMenu.add(jMenuItem);
      } 
      parambq.add(jMenu);
    } 
    JMenu jMenu2 = new JMenu("Log Editing");
    boolean bool = b.a().a("fileEditing");
    if (y() != null) {
      JMenuItem jMenuItem = new JMenuItem("Save Selected to File");
      jMenuItem.setActionCommand("exportSelectedLog:" + y().b() + "," + y().a());
      jMenuItem.addActionListener(new aQ(this));
      jMenu2.add(jMenuItem);
      jMenuItem.setEnabled(bool);
    } 
    if (y() != null) {
      JMenuItem jMenuItem = new JMenuItem("Crop to Selected");
      jMenuItem.setActionCommand("cropToSelectedLog:" + y().b() + "," + y().a());
      jMenuItem.addActionListener(new aR(this));
      jMenu2.add(jMenuItem);
      jMenuItem.setEnabled(bool);
    } 
    if (y() != null) {
      JMenuItem jMenuItem = new JMenuItem("Delete Selected (Delete)");
      jMenuItem.setActionCommand("deleteSelectedFromLog:" + y().b() + "," + y().a());
      jMenuItem.addActionListener(new aS(this));
      jMenu2.add(jMenuItem);
      jMenuItem.setEnabled(bool);
    } 
    JMenuItem jMenuItem2 = new JMenuItem("Delete Before Cursor Position");
    jMenuItem2.setActionCommand("deleteBefore");
    jMenuItem2.addActionListener(new aT(this));
    jMenu2.add(jMenuItem2);
    jMenuItem2.setEnabled(bool);
    jMenuItem2 = new JMenuItem("Delete After Cursor Position");
    jMenuItem2.setActionCommand("deleteAfter");
    jMenuItem2.addActionListener(new ay(this));
    jMenu2.add(jMenuItem2);
    jMenuItem2.setEnabled(bool);
    parambq.add(jMenu2);
    if (this.q > 0) {
      JMenuItem jMenuItem = new JMenuItem("Set Current Time to 0 (CTRL+0)");
      jMenuItem.setActionCommand("setTimeOffsetToCurrent:");
      jMenuItem.addActionListener(new az(this));
      parambq.add(jMenuItem);
    } 
    parambq.addSeparator();
    if (this.D != null) {
      JMenuItem jMenuItem = new JMenuItem("Repeat Search (F3)");
      jMenuItem.addActionListener(new aA(this));
      parambq.add(jMenuItem);
      parambq.addSeparator();
    } 
    if (this.k != null) {
      JMenuItem jMenuItem = new JMenuItem("Expression Search");
      jMenuItem.setActionCommand("searchExpression:");
      jMenuItem.setName(this.G);
      jMenuItem.addActionListener(new aB(this));
      parambq.add(jMenuItem);
      Object[] arrayOfObject = this.k.keySet().toArray();
      arrayOfObject = k.b(arrayOfObject);
      for (byte b1 = 0; b1 < arrayOfObject.length; b1++) {
        List list = (List)this.k.get(arrayOfObject[b1]);
        for (j j1 : list) {
          if (j1.a() != null && !j1.a().trim().equals("")) {
            JMenu jMenu3 = new JMenu(j1.a());
            jMenuItem = new JMenuItem("Jump to Max : " + a(j1.g(), j1.m()));
            jMenuItem.setActionCommand("searchFor:" + j1.g());
            jMenuItem.setName(j1.a());
            jMenuItem.addActionListener(new aC(this));
            jMenu3.add(jMenuItem);
            jMenuItem = new JMenuItem("Jump to Min : " + a(j1.h(), j1.m()));
            jMenuItem.setActionCommand("searchFor:" + j1.h());
            jMenuItem.setName(j1.a());
            jMenuItem.addActionListener(new aD(this));
            jMenu3.add(jMenuItem);
            jMenuItem = new JMenuItem("Search for specific " + j1.a());
            jMenuItem.setActionCommand("userValue:" + j1.a());
            jMenuItem.setName(j1.a());
            jMenuItem.addActionListener(new aE(this));
            jMenu3.add(jMenuItem);
            jMenuItem = new JMenuItem("Search for " + j1.a() + " Greater than");
            jMenuItem.setActionCommand("searchGreaterThan:" + j1.a());
            jMenuItem.setName(j1.a());
            jMenuItem.addActionListener(new aF(this));
            jMenu3.add(jMenuItem);
            jMenuItem = new JMenuItem("Search for " + j1.a() + " Less than");
            jMenuItem.setActionCommand("searchLessThan:" + j1.a());
            jMenuItem.setName(j1.a());
            jMenuItem.addActionListener(new aG(this));
            jMenu3.add(jMenuItem);
            JMenu jMenu4 = new JMenu("Value offsets");
            jMenuItem = new JMenuItem("Shift logged value of by specific amount.");
            jMenuItem.setActionCommand("shiftValueBy" + j1.a());
            jMenuItem.setName(j1.a());
            jMenuItem.addActionListener(new aH(this));
            jMenu4.add(jMenuItem);
            jMenuItem = new JMenuItem("Shift shift current value to zero.");
            jMenuItem.setActionCommand("setCurrentvalueToZero" + j1.a());
            jMenuItem.setName(j1.a());
            jMenuItem.addActionListener(new aJ(this));
            jMenu4.add(jMenuItem);
            jMenu3.add(jMenu4);
            JMenu jMenu5 = new JMenu("Index offsets");
            H h = new H();
            h.b(j1.A());
            j j2 = j1;
            h.a(new aK(this, j2));
            jMenu5.add(h);
            jMenuItem = jMenu5.add("Reset Index Offset");
            jMenuItem.addActionListener(new aL(this, j2));
            jMenu3.add(jMenu5);
            parambq.add(jMenu3);
          } 
        } 
      } 
    } 
    return parambq;
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2.equals("searchExpression:")) {
      g();
      l();
    } else if (paramString2.startsWith("searchFor:")) {
      String str = k.a(paramString2, "searchFor:", "");
      b(paramString1, str);
      l();
    } else if (paramString2.startsWith("searchGreaterThan:")) {
      String str1 = k.a(paramString2, "searchGreaterThan:", "");
      String str2 = k.a("{Search " + str1 + " Greater Than}", true, "Search for log record greater than value.", true, this);
      if (str2 != null && !str2.equals("") && !c(str1, str2))
        k.a(str1 + " = " + str2 + " not found in current log file", this); 
      l();
    } else if (paramString2.startsWith("searchLessThan:")) {
      String str1 = k.a(paramString2, "searchLessThan:", "");
      String str2 = k.a("{Search " + str1 + " Less Than}", true, "Search for log record less than value.", true, this);
      if (str2 != null && !str2.equals("") && !d(str1, str2))
        k.a(str1 + " = " + str2 + " not found in current log file", this); 
      l();
    } else if (paramString2.startsWith("jumpTo:")) {
      int i = Integer.parseInt(k.a(paramString2, "jumpTo:", ""));
      this.o.c(i);
      l();
    } else if (paramString2.startsWith("userValue:")) {
      String str1 = k.a(paramString2, "userValue:", "");
      String str2 = k.a("{Search " + str1 + "}", true, "Search for log record.", true, this);
      if (str2 != null && !str2.equals("") && !b(str1, str2))
        k.a(str1 + " = " + str2 + " not found in current log file", this); 
    } else if (paramString2.startsWith("shiftValueBy")) {
      String str1 = k.a(paramString2, "shiftValueBy", "");
      String str2 = k.a("{Amount to shift Logged Value of " + str1 + "}", true, "Shift " + str1 + " value by amount", true, this);
      if (str2 != null && !str2.equals("")) {
        j j1 = this.o.r().a(str1);
        if (!I.a(str2)) {
          bV.d("Value must be numeric", this);
        } else if (j1 == null) {
          bV.d("Field \"" + str1 + "\"not found!", this);
        } else {
          j1.j(Float.parseFloat(str2));
          repaint();
        } 
      } 
    } else if (paramString2.startsWith("setCurrentvalueToZero")) {
      String str = k.a(paramString2, "setCurrentvalueToZero", "");
      j j1 = this.o.r().a(str);
      if (j1 == null) {
        bV.d("Field \"" + str + "\"not found!", this);
      } else {
        float f = -j1.d(this.o.p());
        j1.j(f);
        repaint();
      } 
    } else if (paramString2.startsWith("setTimeOffsetToCurrent:")) {
      t();
    } else if (paramString2.startsWith("exportSelectedLog:")) {
      e();
    } else if (paramString2.startsWith("cropToSelectedLog:")) {
      d();
    } else if (paramString2.startsWith("deleteSelectedFromLog:")) {
      c();
    } else if (paramString2.startsWith("deleteBefore")) {
      E();
    } else if (paramString2.startsWith("deleteAfter")) {
      D();
    } 
  }
  
  private void f(int paramInt1, int paramInt2) {
    this.o.r().a(paramInt1, paramInt2);
    i();
    repaint();
    this.o.b(this.o.r());
  }
  
  private void D() {
    if (b.a().a("fileEditing")) {
      int i = this.o.p() + 1;
      int m = this.o.r().d();
      f(i, m);
    } 
  }
  
  private void E() {
    if (b.a().a("fileEditing")) {
      boolean bool = false;
      int i = this.o.p();
      f(bool, i);
    } 
  }
  
  public void c() {
    if (b.a().a("fileEditing") && y() != null) {
      int i = y().b();
      int m = y().a();
      f(i, m);
    } 
  }
  
  public void d() {
    if (b.a().a("fileEditing") && y() != null) {
      int i = y().b();
      int m = y().a();
      f(m, this.o.r().d());
      f(0, i);
      a((j)null);
      this.o.c(m - i / 2);
      i();
      repaint();
    } 
  }
  
  public void e() {
    if (b.a().a("fileEditing") && y() != null) {
      int i = y().b();
      int m = y().a();
      n n1 = hx.a().r();
      if (n1 != null) {
        n n2 = new n();
        for (j j1 : n1) {
          j j2 = new j();
          j2.a(j1.a());
          j2.e(j1.n());
          j2.f(j1.p());
          j2.e(j1.m());
          j2.b(false);
          for (int i1 = i; i1 <= m; i1++)
            j2.a(j1.c(i1)); 
          n2.add(j2);
        } 
        if (n1.h())
          for (String str : n1.i())
            n2.a(str, n1.f(str));  
        b.a().a(n2, bq.a().b().w(), bq.a().b());
      } 
    } 
  }
  
  public void f() {
    if (this.D != null && this.D.equals("searchGreaterThan:")) {
      c(this.E, this.F);
    } else if (this.D != null && this.D.equals("searchLessThan:")) {
      d(this.E, this.F);
    } else if (this.D != null && this.D.equals("searchExpression:")) {
      if (this.R == null) {
        g();
      } else {
        a(this.R);
      } 
    } else if (this.D == null || this.E == null) {
      a(200, 100);
    } else {
      b(this.E, this.F);
    } 
  }
  
  public boolean g() {
    String str = (this.R == null) ? "" : this.R.c();
    n n1 = this.o.r();
    while (true) {
      str = bV.a(this, false, "Search Expression", str);
      if (str == null || str.length() == 0)
        return false; 
      try {
        this.R = new a(str);
        double d = this.R.a(n1, 0);
      } catch (U u) {
        bV.d("Invalid Expression:\n" + str + "\n\n" + u.getLocalizedMessage(), this);
        this.R = null;
      } 
      if (this.R != null)
        return a(this.R); 
    } 
  }
  
  public boolean a(a parama) {
    this.D = "searchExpression:";
    int i = this.q + 1;
    n n1 = this.o.r();
    try {
      boolean bool = (parama.a(n1, this.q) != 0.0D) ? true : false;
      while (i < n1.d()) {
        double d = parama.a(n1, i);
        if (d != 0.0D && !bool) {
          this.o.c(i);
          i();
          repaint();
          return true;
        } 
        if (d == 0.0D)
          bool = false; 
        if (++i == this.q) {
          bV.d("No Results found.", this);
          return false;
        } 
        if (i == n1.d())
          i = 0; 
      } 
    } catch (U u) {
      bV.d("Search Failed", this);
      u.printStackTrace();
    } 
    return true;
  }
  
  public boolean b(String paramString1, String paramString2) {
    j j1 = c(paramString1);
    if (j1 != null) {
      this.E = paramString1;
      this.F = paramString2;
      this.D = "userValue:";
      int i = this.q + 1;
      float f = Float.parseFloat(paramString2);
      while (i < j1.v()) {
        double d = -1000000.0D;
        try {
          d = j1.c(i);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        if (f == d) {
          this.o.c(i);
          l();
          return true;
        } 
        if (i == this.q)
          break; 
        if (i == j1.v() - 1) {
          i = 0;
          continue;
        } 
        i++;
      } 
    } 
    return false;
  }
  
  public boolean c(String paramString1, String paramString2) {
    j j1 = c(paramString1);
    if (j1 != null) {
      this.E = paramString1;
      this.F = paramString2;
      this.D = "searchGreaterThan:";
      int i = this.q + 1;
      float f = Float.parseFloat(paramString2);
      boolean bool = (f < j1.c(this.q)) ? true : false;
      while (i < j1.v()) {
        double d = -1000000.0D;
        try {
          d = j1.c(i);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        if (!bool && d > f) {
          this.o.c(i);
          l();
          return true;
        } 
        if (bool && d <= f)
          bool = false; 
        if (i == this.q - 1)
          break; 
        if (i == j1.v() - 1) {
          i = 0;
          continue;
        } 
        i++;
      } 
    } 
    return false;
  }
  
  public boolean d(String paramString1, String paramString2) {
    j j1 = c(paramString1);
    if (j1 != null) {
      this.E = paramString1;
      this.F = paramString2;
      this.D = "searchLessThan:";
      int i = this.q + 1;
      float f = Float.parseFloat(paramString2);
      boolean bool = (f > j1.c(this.q)) ? true : false;
      while (i < j1.v()) {
        double d = -1000000.0D;
        try {
          d = j1.c(i);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        if (!bool && d < f) {
          this.o.c(i);
          l();
          return true;
        } 
        if (bool && d >= f)
          bool = false; 
        if (i == this.q - 1)
          break; 
        if (i == j1.v() - 1) {
          i = 0;
          continue;
        } 
        i++;
      } 
    } 
    return false;
  }
  
  private j c(String paramString) {
    if (this.k != null) {
      Object[] arrayOfObject = this.k.keySet().toArray();
      arrayOfObject = k.b(arrayOfObject);
      for (byte b1 = 0; b1 < arrayOfObject.length; b1++) {
        List list = (List)this.k.get(arrayOfObject[b1]);
        for (j j1 : list) {
          if (j1 != null && j1.a() != null && j1.a().equals(paramString))
            return j1; 
        } 
      } 
    } 
    return null;
  }
  
  public void a(Image paramImage) {
    this.a = paramImage;
  }
  
  public void c(int paramInt) {
    this.H.clear();
    this.H.add(new BasicStroke(paramInt));
    float f1 = (paramInt * 2);
    float f2 = (paramInt * 3);
    float f3 = (paramInt * 4);
    float f4 = (paramInt * 5);
    float f5 = (paramInt * 7);
    float[] arrayOfFloat1 = { f2, f4, f2 };
    this.H.add(new BasicStroke(paramInt, 2, 0, 10.0F, arrayOfFloat1, 0.0F));
    float[] arrayOfFloat2 = { f5, f1, paramInt, f1 };
    this.H.add(new BasicStroke(paramInt, 2, 0, 10.0F, arrayOfFloat2, 0.0F));
    float[] arrayOfFloat3 = { f5, f1, paramInt, f1, paramInt, f1 };
    this.H.add(new BasicStroke(paramInt, 2, 0, 10.0F, arrayOfFloat3, 0.0F));
    float[] arrayOfFloat4 = { f5, f1, paramInt, f1, paramInt, f1, paramInt, f1 };
    this.H.add(new BasicStroke(paramInt, 2, 0, 10.0F, arrayOfFloat4, 0.0F));
    float[] arrayOfFloat5 = { f5, f1, paramInt, f1, paramInt, f1, paramInt, f1, paramInt, f1 };
    this.H.add(new BasicStroke(paramInt, 2, 0, 10.0F, arrayOfFloat4, 0.0F));
    this.K = true;
  }
  
  private Stroke k(int paramInt) {
    int i = (int)(getWidth() / this.s) + 1;
    if (i > this.J || this.H.isEmpty())
      return this.I; 
    if (ad)
      return this.H.get(paramInt % this.H.size()); 
    if (!this.K) {
      c(1);
      return this.H.get(0);
    } 
    return this.H.get(0);
  }
  
  public void b(boolean paramBoolean) {
    this.M = paramBoolean;
  }
  
  public void update(Graphics paramGraphics) {
    if (this.w)
      return; 
    if (this.k.isEmpty()) {
      g(paramGraphics);
    } else {
      Image image = H();
      if (this.c == null || this.c.getHeight(null) != getHeight())
        this.c = createImage(this.u + 2, getHeight()); 
      Graphics graphics = this.c.getGraphics();
      if (this.t == -1)
        this.t = (int)((this.q - A()) * this.s); 
      if (getWidth() - this.t < this.u) {
        graphics.drawImage(image, 0 - this.t + this.u, 0, null);
        paramGraphics.drawImage(this.c, this.t - this.u, 0, null);
      } else {
        graphics.drawImage(image, 0 - this.t, 0, null);
        paramGraphics.drawImage(this.c, this.t, 0, null);
      } 
      c(paramGraphics);
    } 
  }
  
  public void a(Graphics paramGraphics) {
    if (this.k.size() > 0) {
      int i = getHeight() - (getHeight() - B) / this.k.size() * this.k.size() - B;
      if (i > 0) {
        paramGraphics.setColor(getBackground());
        paramGraphics.fillRect(0, getHeight() - B - i, getWidth(), i);
      } 
    } 
  }
  
  public void paintAll(Graphics paramGraphics) {
    System.out.println("paintAll");
  }
  
  public void paintComponent(Graphics paramGraphics) {
    System.out.println("paintComponent");
  }
  
  public void paintComponents(Graphics paramGraphics) {
    System.out.println("paintComponents");
  }
  
  public void paintImmediately(Rectangle paramRectangle) {
    System.out.println("paintImmediately");
  }
  
  private Image F() {
    if (this.g == null || this.g.getWidth(null) != getWidth() || this.g.getHeight(null) != getHeight())
      this.g = createImage(getWidth(), getHeight()); 
    return this.g;
  }
  
  public void paint(Graphics paramGraphics) {
    if (this.U) {
      Image image = F();
      b(image.getGraphics());
      paramGraphics.drawImage(image, 0, 0, null);
    } else {
      try {
        b(paramGraphics);
      } catch (Exception exception) {
        D.c("Graph paint error");
        exception.printStackTrace();
      } 
    } 
  }
  
  public void b(Graphics paramGraphics) {
    if (getWidth() < 0 || getHeight() < 0)
      return; 
    if (this.k.isEmpty()) {
      g(paramGraphics);
    } else {
      if (this.w)
        return; 
      Image image = H();
      if (image != null) {
        paramGraphics.drawImage(image, 0, 0, null);
        if (this.b == null || this.v);
      } 
      c(paramGraphics);
      h(paramGraphics);
      if (this.ai != null)
        a(paramGraphics, this.ai.b(), this.ai.a()); 
    } 
  }
  
  private void c(Graphics paramGraphics) {
    long l1 = System.nanoTime();
    if (this.L) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } 
    long l2 = System.nanoTime() - l1;
    int i = (int)((this.q - A()) * this.s);
    if (i > getWidth() || i < 0) {
      n();
      i();
      repaint();
    } 
    this.t = i;
    long l3 = System.nanoTime() - l1;
    Object[] arrayOfObject = k.b(this.k.keySet().toArray());
    int m = arrayOfObject.length;
    int i1 = getFont().getSize();
    long l4 = System.nanoTime() - l1;
    paramGraphics.setColor(getForeground());
    paramGraphics.drawLine(i, 0, i, getHeight());
    Font font = new Font(getFont().getName(), 1, getFont().getSize());
    paramGraphics.setFont(font);
    int i2 = 0;
    if (v()) {
      this.u = Z;
    } else {
      this.u = Y;
    } 
    if (getWidth() - i < this.u) {
      i2 = i - this.u;
    } else {
      i2 = i + 3;
    } 
    long l5 = System.nanoTime() - l1;
    for (byte b1 = 0; b1 < arrayOfObject.length; b1++) {
      List list = (List)this.k.get(arrayOfObject[b1]);
      byte b2 = 0;
      byte b3 = 0;
      for (j j1 : list) {
        try {
          if (j1.a() != null) {
            int i3 = (getHeight() - B) / m;
            int i4 = i3 + b1 * i3 - eJ.a(5);
            String str1 = j1.a(this.q);
            str1 = b(str1, 12);
            if (v() && this.l.a(j1.a()) != null && this.q - this.r > 0 && this.q - this.r < this.l.d()) {
              j j2 = this.l.a(j1.a());
              str1 = str1 + " : " + j2.a(this.q - this.r);
            } 
            paramGraphics.setColor(getBackground());
            int i5 = (i2 > i) ? i2 : (i - getFontMetrics(getFont()).stringWidth(str1) - eJ.a(3));
            String str2 = G();
            int i6 = e(arrayOfObject[b1].toString());
            i6 = (i6 == -1) ? b1 : i6;
            String str3 = j1.a();
            if (j1.r())
              str3 = str3 + "(s" + j1.s() + ")"; 
            if (str2.equals("top")) {
              i4 = i3 + (b1 - 1) * i3;
              paramGraphics.fillRect(i5, i4 + (b2 - b3) * i1 + 2, getFontMetrics(getFont()).stringWidth(str1), i1);
              paramGraphics.setColor(b(i6, b2));
              paramGraphics.drawString(str1, i5, i4 + (1 + b2 - b3) * i1);
            } else if (str2.equals("withLabels")) {
              i4 = i3 + (b1 - 1) * i3;
              if ((b2 - b3) * i1 < i3) {
                i5 = d(str3) - getFontMetrics(getFont()).stringWidth(str1) - eJ.a(8);
                paramGraphics.fillRect(i5, i4 + (b2 - b3) * i1 + 2, getFontMetrics(getFont()).stringWidth(str1), i1);
                paramGraphics.setColor(b(i6, b2));
                paramGraphics.drawString(str1, i5, i4 + (1 + b2 - b3) * i1);
              } 
            } else {
              paramGraphics.fillRect(i5, i4 - (b2 - b3) * i1 - i1 + 2, getFontMetrics(getFont()).stringWidth(str1), i1);
              paramGraphics.setColor(b(i6, b2));
              paramGraphics.drawString(str1, i5, i4 - (b2 - b3) * i1);
            } 
          } else {
            b3++;
          } 
        } catch (Exception exception) {
          Logger.getLogger(aw.class.getName()).log(Level.SEVERE, (String)null, exception);
          exception.printStackTrace();
        } 
        b2++;
      } 
    } 
    long l6 = System.nanoTime() - l1;
    if (h() != null) {
      float f;
      String str;
      if (this.q >= 0) {
        f = h().c(this.q);
      } else {
        f = -h().c(-this.q);
      } 
      if (h().n() != null && h().n().length() > 0) {
        str = X.c(f, 3) + h().n();
      } else {
        str = X.c(f, 3);
      } 
      if (v() && this.l.a(h().a()) != null && this.q - this.r > 0 && this.q - this.r < this.l.d()) {
        j j1 = this.l.a(h().a());
        str = str + " : " + j1.a(this.q - this.r);
      } 
      paramGraphics.setColor(getBackground());
      int i3 = (i2 > i) ? i2 : (i - getFontMetrics(getFont()).stringWidth(str) - eJ.a(3));
      paramGraphics.fillRect(i3, getHeight() - i1 - 7, getFontMetrics(getFont()).stringWidth(str), i1);
      paramGraphics.setColor(getForeground());
      paramGraphics.drawString(str, i3, getHeight() - eJ.a(8));
    } 
  }
  
  public j h() {
    return (this.T != null && this.o.r() != null && this.o.r().a(this.T) != null) ? this.o.r().a(this.T) : this.W;
  }
  
  public void b(String paramString) {
    this.T = paramString;
  }
  
  private String G() {
    return i.e(i.S, i.T);
  }
  
  private Image H() {
    if (!this.v && this.b != null)
      return this.b; 
    if (this.b == null || this.b.getWidth(null) != getWidth() || this.b.getHeight(null) != getHeight())
      this.b = createImage(getWidth(), getHeight()); 
    Graphics graphics = this.b.getGraphics();
    d(graphics);
    return this.b;
  }
  
  private int I() {
    if (A() <= 0) {
      if (this.V < 0)
        this.V = J(); 
      return this.V;
    } 
    return 0;
  }
  
  private int J() {
    int i = 0;
    if (i.a(i.K, true)) {
      for (List list : this.k.values()) {
        if (list != null)
          for (j j1 : list) {
            Font font = new Font(getFont().getName(), 1, getFont().getSize());
            FontMetrics fontMetrics = getFontMetrics(font);
            String str1 = "Max = " + j1.d();
            String str2 = "Min = " + j1.b();
            String str3 = j1.n();
            if (str3 != null && !str3.isEmpty()) {
              str1 = str1 + " (" + str3 + ")";
              str2 = str2 + " (" + str3 + ")";
            } 
            int m = fontMetrics.stringWidth(str1);
            if (m > i)
              i = m; 
            m = fontMetrics.stringWidth(str2);
            if (m > i)
              i = m; 
          }  
      } 
      i += 10;
      if (this.s > 1.0D) {
        int m = (int)Math.round(this.s);
        int i1 = 0;
        while (true) {
          i1 += m;
          if (i1 >= i) {
            i = i1;
            break;
          } 
        } 
      } 
    } 
    return i;
  }
  
  private void d(Graphics paramGraphics) {
    if (h() != null)
      this.p = h().i(); 
    Object[] arrayOfObject = k.b(this.k.keySet().toArray());
    this.C.clear();
    for (byte b1 = 0; b1 < arrayOfObject.length; b1++) {
      int i = getWidth();
      int m = (getHeight() - B) / arrayOfObject.length;
      byte b2 = 0;
      if (this.d == null || this.d.getWidth(null) != i || this.d.getHeight(null) != m) {
        if (i <= 0 || m <= 0)
          return; 
        this.d = createImage(i, m);
      } 
      int i1 = e(arrayOfObject[b1].toString());
      i1 = (i1 == -1) ? b1 : i1;
      List list = (List)this.k.get(arrayOfObject[b1]);
      for (j j1 : list) {
        j j2 = null;
        if (this.x && this.l != null && this.l.a(j1.a()) != null)
          j2 = this.l.a(j1.a()); 
        this.d = a(j1, this.d, b2, b(i1, b2), j2);
        b2++;
      } 
      b2 = 0;
      byte b3 = 0;
      for (j j1 : list) {
        j j2 = null;
        if (this.x && this.l != null && this.l.a(j1.a()) != null)
          j2 = this.l.a(j1.a()); 
        if (j1 != null && j1.a() != null && !j1.a().isEmpty()) {
          this.d = a(j1, this.d, b1, b2 - b3, b(i1, b2), j2);
        } else {
          b3++;
        } 
        b2++;
      } 
      int i2 = b1 * m;
      paramGraphics.drawImage(this.d, 0, i2, null);
    } 
    a(paramGraphics);
    Image image = b(h());
    paramGraphics.drawImage(image, 0, getHeight() - B, null);
    if (this.m != null)
      e(paramGraphics); 
    if (this.n != null)
      f(paramGraphics); 
    if (hx.a().r() != null && hx.a().s() != null) {
      Font font = new Font(getFont().getName(), 1, (int)(getFont().getSize2D() * 1.6D));
      paramGraphics.setFont(font);
      n n1 = hx.a().r();
      n n2 = hx.a().s();
      String str = "1: " + n1.k().getName() + " - 2: " + n2.k().getName();
      paramGraphics.setColor(new Color(220, 220, 220, 128));
      paramGraphics.drawString(str, (getWidth() - paramGraphics.getFontMetrics(font).stringWidth(str)) / 2, font.getSize());
    } 
    d((int)(getWidth() / this.s));
    this.v = false;
  }
  
  private Graphics e(Graphics paramGraphics) {
    if (this.m != null) {
      byte b1 = 0;
      Iterator<Integer> iterator = this.m.keySet().iterator();
      while (iterator.hasNext()) {
        int i = ((Integer)iterator.next()).intValue();
        if (i > A() && i < A() + getWidth() / this.s)
          b1++; 
      } 
      if (b1 < getWidth() / eJ.a(10)) {
        iterator = this.m.keySet().iterator();
        while (iterator.hasNext()) {
          int i = ((Integer)iterator.next()).intValue();
          if (i > A() && i < A() + getWidth() / this.s) {
            paramGraphics.setColor(Color.red);
            int m = (int)((i - A()) * this.s);
            paramGraphics.drawLine(m, 0, m, getHeight());
          } 
        } 
      } 
    } 
    return paramGraphics;
  }
  
  public void c(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  private Graphics f(Graphics paramGraphics) {
    HashMap hashMap = (this.l == null) ? null : this.l.c();
    if (hashMap != null && this.y) {
      Iterator<Integer> iterator = hashMap.keySet().iterator();
      while (iterator.hasNext()) {
        int i = ((Integer)iterator.next()).intValue();
        i += this.r;
        if (i > A() && i < A() + getWidth() / this.s) {
          paramGraphics.setColor(Color.yellow.darker());
          int m = (int)((i - A()) * this.s);
          paramGraphics.drawLine(m, 0, m, getHeight());
        } 
      } 
    } 
    if (this.n != null && this.y) {
      Iterator<Integer> iterator = this.n.keySet().iterator();
      while (iterator.hasNext()) {
        int i = ((Integer)iterator.next()).intValue();
        if (i > A() && i < A() + getWidth() / this.s) {
          paramGraphics.setColor(Color.yellow);
          int m = (int)((i - A()) * this.s);
          paramGraphics.drawLine(m, 0, m, getHeight());
        } 
      } 
    } 
    return paramGraphics;
  }
  
  private Image b(j paramj) {
    float f;
    if (this.e == null || this.e.getWidth(null) != getWidth())
      this.e = createImage(getWidth(), B); 
    if (paramj == null)
      return this.e; 
    Graphics graphics = this.e.getGraphics();
    graphics.setColor(getBackground());
    graphics.setFont(getFont());
    graphics.fillRect(0, 0, this.e.getWidth(null), this.e.getHeight(null));
    if (this.L) {
      Graphics2D graphics2D = (Graphics2D)graphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } 
    graphics.setColor(getForeground());
    int i = B - 1;
    int m = i - B / 2;
    int i1 = i - B / 4;
    graphics.drawLine(0, i, getWidth() - 3, i);
    int i2 = getWidth() - 2;
    byte b1;
    for (b1 = 0; b1 <= 4; b1++) {
      int i4 = b1 * i2 / 4;
      graphics.drawLine(i4, m, i4, i);
      graphics.drawLine(i4 + 1, m, i4 + 1, i);
    } 
    for (b1 = 0; b1 <= 12; b1++) {
      int i4 = b1 * i2 / 12;
      graphics.drawLine(i4, i1, i4, i);
    } 
    if (A() >= 0) {
      f = paramj.c(A());
    } else {
      f = -paramj.c(-A());
    } 
    String str = X.b(f, 3);
    if (paramj.n() != null && !paramj.n().isEmpty())
      str = str + paramj.n(); 
    graphics.drawString(str, eJ.a(3), getFont().getSize());
    int i3 = (int)(A() + getWidth() / this.s);
    if (i3 > paramj.i()) {
      f = (paramj.d(paramj.i() - 1) - paramj.c(A())) * i3 / paramj.i();
    } else {
      if (i3 == paramj.i())
        i3 = paramj.i() - 1; 
      f = paramj.c(i3);
      String str1 = X.b(f, 3);
      if (paramj.n() != null && !paramj.n().isEmpty())
        str1 = str1 + paramj.n(); 
      int i4 = i2 - getFontMetrics(getFont()).stringWidth(str1) - 3;
      graphics.drawString(str1, i4, getFont().getSize());
    } 
    if (b.a().a("4e345hggsdhd4812hfd43-0gdk")) {
      String str1 = paramj.a();
      int i4 = graphics.getFontMetrics().stringWidth(str1);
      int i5 = getWidth() / 2 - i4 - eJ.a(15);
      graphics.drawString(str1, i5, graphics.getFont().getSize() + 2);
      Rectangle rectangle = new Rectangle(i5, getHeight() - B, i4, B);
      aW aW = new aW();
      aW.a(rectangle);
      aW.a(paramj);
      aW.a(aW.b);
      this.C.add(aW);
    } 
    return this.e;
  }
  
  private Image a(j paramj1, Image paramImage, int paramInt, Color paramColor, j paramj2) {
    // Byte code:
    //   0: invokestatic nanoTime : ()J
    //   3: lstore #6
    //   5: aload_2
    //   6: invokevirtual getGraphics : ()Ljava/awt/Graphics;
    //   9: astore #8
    //   11: aload_2
    //   12: aconst_null
    //   13: invokevirtual getWidth : (Ljava/awt/image/ImageObserver;)I
    //   16: istore #9
    //   18: aload_2
    //   19: aconst_null
    //   20: invokevirtual getHeight : (Ljava/awt/image/ImageObserver;)I
    //   23: istore #10
    //   25: aload_0
    //   26: invokevirtual A : ()I
    //   29: iflt -> 50
    //   32: aload_0
    //   33: invokevirtual getWidth : ()I
    //   36: i2d
    //   37: aload_0
    //   38: getfield s : D
    //   41: ddiv
    //   42: d2i
    //   43: iconst_1
    //   44: iadd
    //   45: istore #11
    //   47: goto -> 70
    //   50: aload_0
    //   51: invokevirtual getWidth : ()I
    //   54: i2d
    //   55: aload_0
    //   56: getfield s : D
    //   59: ddiv
    //   60: d2i
    //   61: iconst_1
    //   62: iadd
    //   63: aload_0
    //   64: invokevirtual A : ()I
    //   67: iadd
    //   68: istore #11
    //   70: aload #8
    //   72: checkcast java/awt/Graphics2D
    //   75: astore #12
    //   77: aload_0
    //   78: getfield L : Z
    //   81: ifeq -> 84
    //   84: aload_0
    //   85: getfield M : Z
    //   88: ifeq -> 111
    //   91: iload #11
    //   93: aload_0
    //   94: getfield J : I
    //   97: if_icmpge -> 111
    //   100: aload #12
    //   102: getstatic java/awt/RenderingHints.KEY_ANTIALIASING : Ljava/awt/RenderingHints$Key;
    //   105: getstatic java/awt/RenderingHints.VALUE_ANTIALIAS_ON : Ljava/lang/Object;
    //   108: invokevirtual setRenderingHint : (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
    //   111: aload #12
    //   113: aload_0
    //   114: iload_3
    //   115: invokespecial k : (I)Ljava/awt/Stroke;
    //   118: invokevirtual setStroke : (Ljava/awt/Stroke;)V
    //   121: iload_3
    //   122: ifne -> 276
    //   125: aload #8
    //   127: aload_0
    //   128: invokevirtual getBackground : ()Ljava/awt/Color;
    //   131: invokevirtual setColor : (Ljava/awt/Color;)V
    //   134: aload #8
    //   136: iconst_0
    //   137: iconst_0
    //   138: iload #9
    //   140: iconst_1
    //   141: isub
    //   142: iload #10
    //   144: iconst_1
    //   145: isub
    //   146: invokevirtual fillRect : (IIII)V
    //   149: aload #8
    //   151: getstatic java/awt/Color.lightGray : Ljava/awt/Color;
    //   154: invokevirtual setColor : (Ljava/awt/Color;)V
    //   157: ldc 'showGraphHalfMark'
    //   159: iconst_0
    //   160: invokestatic a : (Ljava/lang/String;Z)Z
    //   163: ifeq -> 261
    //   166: iconst_0
    //   167: istore #13
    //   169: iload #13
    //   171: iload #9
    //   173: if_icmpge -> 211
    //   176: aload #8
    //   178: iload #13
    //   180: iload #10
    //   182: iconst_2
    //   183: idiv
    //   184: iload #13
    //   186: iconst_3
    //   187: iadd
    //   188: iload #10
    //   190: iconst_2
    //   191: idiv
    //   192: invokevirtual drawLine : (IIII)V
    //   195: iload #13
    //   197: iconst_3
    //   198: iadd
    //   199: istore #13
    //   201: iload #13
    //   203: bipush #10
    //   205: iadd
    //   206: istore #13
    //   208: goto -> 169
    //   211: new java/awt/Font
    //   214: dup
    //   215: aload_0
    //   216: invokevirtual getFont : ()Ljava/awt/Font;
    //   219: invokevirtual getName : ()Ljava/lang/String;
    //   222: iconst_0
    //   223: aload_0
    //   224: invokevirtual getFont : ()Ljava/awt/Font;
    //   227: invokevirtual getSize : ()I
    //   230: iconst_2
    //   231: invokestatic a : (I)I
    //   234: isub
    //   235: invokespecial <init> : (Ljava/lang/String;II)V
    //   238: astore #13
    //   240: aload #8
    //   242: aload #13
    //   244: invokevirtual setFont : (Ljava/awt/Font;)V
    //   247: aload #8
    //   249: ldc '50%'
    //   251: iconst_3
    //   252: iload #10
    //   254: iconst_2
    //   255: idiv
    //   256: iconst_1
    //   257: isub
    //   258: invokevirtual drawString : (Ljava/lang/String;II)V
    //   261: aload #8
    //   263: iconst_0
    //   264: iconst_0
    //   265: iload #9
    //   267: iconst_1
    //   268: isub
    //   269: iload #10
    //   271: iconst_1
    //   272: isub
    //   273: invokevirtual drawRect : (IIII)V
    //   276: aload #8
    //   278: aload #4
    //   280: invokevirtual setColor : (Ljava/awt/Color;)V
    //   283: aload_1
    //   284: invokevirtual i : ()I
    //   287: aload_0
    //   288: invokevirtual A : ()I
    //   291: isub
    //   292: iload #11
    //   294: if_icmpge -> 318
    //   297: aload_0
    //   298: invokevirtual A : ()I
    //   301: iflt -> 318
    //   304: aload_1
    //   305: invokevirtual i : ()I
    //   308: aload_0
    //   309: invokevirtual A : ()I
    //   312: isub
    //   313: istore #11
    //   315: goto -> 338
    //   318: aload_1
    //   319: invokevirtual i : ()I
    //   322: aload_0
    //   323: invokevirtual A : ()I
    //   326: isub
    //   327: iload #11
    //   329: if_icmpge -> 338
    //   332: aload_1
    //   333: invokevirtual i : ()I
    //   336: istore #11
    //   338: aload_1
    //   339: invokevirtual a : ()Ljava/lang/String;
    //   342: ifnull -> 362
    //   345: aload_1
    //   346: invokevirtual a : ()Ljava/lang/String;
    //   349: ldc ''
    //   351: invokevirtual equals : (Ljava/lang/Object;)Z
    //   354: ifne -> 362
    //   357: iload #11
    //   359: ifge -> 364
    //   362: aload_2
    //   363: areturn
    //   364: iconst_1
    //   365: istore #13
    //   367: iload #11
    //   369: newarray int
    //   371: astore #14
    //   373: iload #11
    //   375: newarray int
    //   377: astore #15
    //   379: dconst_0
    //   380: dstore #16
    //   382: aload_1
    //   383: invokevirtual e : ()F
    //   386: f2d
    //   387: dstore #18
    //   389: aload_1
    //   390: invokevirtual f : ()F
    //   393: f2d
    //   394: dstore #20
    //   396: aload_0
    //   397: invokevirtual A : ()I
    //   400: ifge -> 407
    //   403: iconst_1
    //   404: goto -> 408
    //   407: iconst_0
    //   408: istore #22
    //   410: iconst_0
    //   411: istore #23
    //   413: iload #23
    //   415: iload #11
    //   417: if_icmpge -> 565
    //   420: aload #14
    //   422: iload #23
    //   424: iload #13
    //   426: idiv
    //   427: iload #22
    //   429: ifne -> 447
    //   432: iload #23
    //   434: i2d
    //   435: aload_0
    //   436: getfield s : D
    //   439: dmul
    //   440: d2i
    //   441: iload #13
    //   443: imul
    //   444: goto -> 464
    //   447: iload #23
    //   449: i2d
    //   450: aload_0
    //   451: getfield s : D
    //   454: dmul
    //   455: d2i
    //   456: iload #13
    //   458: imul
    //   459: aload_0
    //   460: invokespecial I : ()I
    //   463: iadd
    //   464: iastore
    //   465: iload #22
    //   467: ifne -> 477
    //   470: aload_0
    //   471: invokevirtual A : ()I
    //   474: goto -> 478
    //   477: iconst_0
    //   478: istore #24
    //   480: aload_1
    //   481: iload #23
    //   483: iload #24
    //   485: iadd
    //   486: invokevirtual c : (I)F
    //   489: f2d
    //   490: dstore #16
    //   492: goto -> 507
    //   495: astore #25
    //   497: ldc2_w NaN
    //   500: dstore #16
    //   502: aload #25
    //   504: invokevirtual printStackTrace : ()V
    //   507: dload #20
    //   509: dload #18
    //   511: dcmpl
    //   512: ifne -> 521
    //   515: ldc2_w 0.5
    //   518: goto -> 534
    //   521: dconst_1
    //   522: dload #16
    //   524: dload #18
    //   526: dsub
    //   527: dload #20
    //   529: dload #18
    //   531: dsub
    //   532: ddiv
    //   533: dsub
    //   534: dstore #16
    //   536: dload #16
    //   538: iload #10
    //   540: i2d
    //   541: dmul
    //   542: dstore #16
    //   544: aload #15
    //   546: iload #23
    //   548: iload #13
    //   550: idiv
    //   551: dload #16
    //   553: d2i
    //   554: iastore
    //   555: iload #23
    //   557: iload #13
    //   559: iadd
    //   560: istore #23
    //   562: goto -> 413
    //   565: aload #12
    //   567: aload_0
    //   568: iconst_0
    //   569: invokespecial k : (I)Ljava/awt/Stroke;
    //   572: invokevirtual setStroke : (Ljava/awt/Stroke;)V
    //   575: aload #8
    //   577: aload #14
    //   579: aload #15
    //   581: iload #11
    //   583: invokevirtual drawPolyline : ([I[II)V
    //   586: aload #5
    //   588: ifnull -> 747
    //   591: aload_0
    //   592: invokevirtual v : ()Z
    //   595: ifeq -> 747
    //   598: aload_0
    //   599: invokevirtual A : ()I
    //   602: aload_0
    //   603: getfield r : I
    //   606: isub
    //   607: istore #23
    //   609: iconst_0
    //   610: istore #24
    //   612: iload #24
    //   614: iload #11
    //   616: if_icmpge -> 710
    //   619: aload #14
    //   621: iload #24
    //   623: iload #24
    //   625: i2d
    //   626: aload_0
    //   627: getfield s : D
    //   630: dmul
    //   631: d2i
    //   632: iastore
    //   633: iload #24
    //   635: iload #23
    //   637: iadd
    //   638: iflt -> 670
    //   641: iload #24
    //   643: iload #23
    //   645: iadd
    //   646: aload #5
    //   648: invokevirtual v : ()I
    //   651: if_icmpge -> 670
    //   654: aload #5
    //   656: iload #24
    //   658: iload #23
    //   660: iadd
    //   661: invokevirtual c : (I)F
    //   664: f2d
    //   665: dstore #16
    //   667: goto -> 673
    //   670: dconst_0
    //   671: dstore #16
    //   673: dconst_1
    //   674: dload #16
    //   676: dload #18
    //   678: dsub
    //   679: dload #20
    //   681: dload #18
    //   683: dsub
    //   684: ddiv
    //   685: dsub
    //   686: dstore #16
    //   688: dload #16
    //   690: iload #10
    //   692: i2d
    //   693: dmul
    //   694: dstore #16
    //   696: aload #15
    //   698: iload #24
    //   700: dload #16
    //   702: d2i
    //   703: iastore
    //   704: iinc #24, 1
    //   707: goto -> 612
    //   710: aload #8
    //   712: aload #8
    //   714: invokevirtual getColor : ()Ljava/awt/Color;
    //   717: invokevirtual darker : ()Ljava/awt/Color;
    //   720: invokevirtual darker : ()Ljava/awt/Color;
    //   723: invokevirtual setColor : (Ljava/awt/Color;)V
    //   726: aload #12
    //   728: aload_0
    //   729: iconst_1
    //   730: invokespecial k : (I)Ljava/awt/Stroke;
    //   733: invokevirtual setStroke : (Ljava/awt/Stroke;)V
    //   736: aload #8
    //   738: aload #14
    //   740: aload #15
    //   742: iload #11
    //   744: invokevirtual drawPolyline : ([I[II)V
    //   747: invokestatic nanoTime : ()J
    //   750: lload #6
    //   752: lsub
    //   753: l2d
    //   754: ldc2_w 1000000.0
    //   757: ddiv
    //   758: ldc2_w 100.0
    //   761: dcmpl
    //   762: ifle -> 809
    //   765: iload #11
    //   767: aload_0
    //   768: getfield J : I
    //   771: if_icmpge -> 809
    //   774: aload_0
    //   775: aload_0
    //   776: getfield J : I
    //   779: iconst_2
    //   780: idiv
    //   781: putfield J : I
    //   784: new java/lang/StringBuilder
    //   787: dup
    //   788: invokespecial <init> : ()V
    //   791: ldc 'Downgraded maxRecordForFancyLines to '
    //   793: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   796: aload_0
    //   797: getfield J : I
    //   800: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   803: invokevirtual toString : ()Ljava/lang/String;
    //   806: invokestatic d : (Ljava/lang/String;)V
    //   809: aload_2
    //   810: areturn
    // Exception table:
    //   from	to	target	type
    //   480	492	495	java/lang/Exception
  }
  
  private Image a(j paramj1, Image paramImage, int paramInt1, int paramInt2, Color paramColor, j paramj2) {
    Graphics graphics = paramImage.getGraphics();
    if (this.L) {
      Graphics2D graphics2D = (Graphics2D)graphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      graphics2D.setStroke(k(paramInt2));
    } 
    Font font = new Font(getFont().getName(), 1, getFont().getSize());
    graphics.setFont(font);
    this.O = getFont().getSize();
    int i = paramImage.getWidth(null);
    int m = paramImage.getHeight(null);
    String str1 = "Max = " + paramj1.d();
    String str2 = "Min = " + paramj1.b();
    String str3 = paramj1.n();
    if (str3 != null && !str3.isEmpty()) {
      str1 = str1 + " (" + str3 + ")";
      str2 = str2 + " (" + str3 + ")";
    } 
    if (paramj1.a() != null) {
      if (i.a(i.K, true)) {
        graphics.setColor(getBackground());
        String str = paramj1.a();
        if (paramj1.l())
          str = str + ak; 
        if (paramj1.r())
          str = str + "(s" + paramj1.s() + ")"; 
        if (paramj1.A() != 0)
          str = str + "(o" + paramj1.A() + ")"; 
        if (i.a(i.L, i.M)) {
          graphics.fillRect(5, paramInt2 * this.O + 1, getFontMetrics(getFont()).stringWidth(str1), this.O);
          graphics.fillRect(5, m - this.O - 5 - paramInt2 * this.O, getFontMetrics(getFont()).stringWidth(str2), this.O);
          graphics.setColor(paramColor);
          graphics.drawString(str1, 5, this.O + paramInt2 * this.O);
          graphics.drawString(str2, 5, m - 5 - paramInt2 * this.O);
        } 
        int i1 = d(str);
        Rectangle rectangle = new Rectangle(i1, paramInt1 * paramImage.getHeight(null) + paramInt2 * this.O + 1, getFontMetrics(getFont()).stringWidth(str), this.O);
        aW aW = new aW();
        aW.a(rectangle);
        aW.a(paramj1);
        this.C.add(aW);
        graphics.setColor(getBackground());
        graphics.fillRect(rectangle.x, paramInt2 * this.O + 1, rectangle.width, rectangle.height);
        graphics.setColor(paramColor);
        graphics.drawString(str, i1, this.O + paramInt2 * this.O);
      } 
      if (i.a("showGraphHalfMark", false)) {
        Font font1 = new Font(getFont().getName(), 0, getFont().getSize() - eJ.a(2));
        graphics.setFont(font1);
        float f = (paramj1.f() + paramj1.e()) / 2.0F;
        String str = a(f, paramj1.m());
        graphics.drawString(str, 28 + paramInt2 * 35, m / 2 - 1);
      } 
    } 
    return paramImage;
  }
  
  private int d(String paramString) {
    int i = getFontMetrics(getFont()).stringWidth(paramString) + eJ.a(10);
    return (i > eJ.a(100)) ? (getWidth() - i - eJ.a(10)) : (getWidth() - eJ.a(100));
  }
  
  private String a(float paramFloat, int paramInt) {
    return a(paramFloat + "", paramInt);
  }
  
  private String a(String paramString, int paramInt) {
    return (paramInt >= 0) ? X.a(paramString, paramInt) : ((paramString.length() > paramString.indexOf(".") + 4) ? paramString.substring(0, paramString.indexOf(".") + 4) : paramString);
  }
  
  private String b(String paramString, int paramInt) {
    if (paramString.length() > paramInt)
      paramString = paramString.substring(0, paramInt - 1); 
    return paramString;
  }
  
  private void g(Graphics paramGraphics) {
    int i = getWidth();
    int m = getHeight();
    if (this.j != null) {
      paramGraphics.setColor(this.j);
      paramGraphics.fillRect(0, 0, i, m);
    } 
    if (this.aj) {
      int i1 = eJ.a(this.a.getWidth(null));
      int i2 = eJ.a(this.a.getHeight(null));
      double d1 = i * 0.9D / i1;
      double d2 = m * 0.8D / i2;
      if (d2 < d1)
        d1 = d2; 
      if (d1 > 1.0D)
        d1 = 1.0D; 
      i1 = (int)(i1 * d1);
      i2 = (int)(i2 * d1);
      int i3 = (i - i1) / 2;
      int i4 = (m - i2) / 2;
      paramGraphics.drawImage(this.a, i3, i4, i1, i2, this);
      paramGraphics.setColor(UIManager.getColor("Label.foreground"));
      if (this.ac != null) {
        paramGraphics.setFont(getFont());
        paramGraphics.drawString(this.ac, 30, getHeight() - 10);
      } 
    } 
  }
  
  public void i() {
    this.v = true;
  }
  
  public boolean j() {
    return this.S;
  }
  
  public void k() {
    this.S = false;
  }
  
  public boolean imageUpdate(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 == 32)
      repaint(500L); 
    return true;
  }
  
  public void a(String paramString, j paramj, int paramInt) {
    if (paramj == null) {
      a(paramString, "", paramInt);
      return;
    } 
    List<j> list = (List)this.k.get(paramString);
    if (list == null)
      list = new CopyOnWriteArrayList(); 
    if (list.size() > paramInt && list.get(paramInt) != null) {
      list.set(paramInt, paramj);
    } else {
      a(list, paramInt);
      list.add(paramInt, paramj);
    } 
    this.k.put(paramString, list);
    this.S = true;
    i();
    l();
  }
  
  public void l() {
    if (this.aa == null || this.aa.b()) {
      this.aa = new F(this, 150L);
    } else {
      this.aa.a();
    } 
  }
  
  public boolean m() {
    return this.ag;
  }
  
  public void e(boolean paramBoolean) {
    this.ag = paramBoolean;
  }
  
  private List a(List<j> paramList, int paramInt) {
    for (byte b1 = 0; b1 < paramInt; b1++) {
      if (paramList.size() < b1 + 1 || paramList.get(b1) == null)
        paramList.add(new j()); 
    } 
    return paramList;
  }
  
  protected void n() {
    this.V = -1;
    if (this.ag && this.q - getWidth() / 2.0D * this.s > 0.0D) {
      this.X = (int)(this.q - getWidth() / 2.0D * this.s);
    } else if (this.q - getWidth() / this.s > 0.0D) {
      this.X = (int)(this.q - getWidth() / 2.0D * this.s);
    } else if (this.ah && i.a(i.L, true)) {
      this.X = (int)Math.round(-I() / this.s);
    } else {
      this.X = 0;
    } 
    this.t = (int)((this.q - A()) * this.s);
    a((j)null);
  }
  
  public int o() {
    int i = (int)(getWidth() / 2.0D * this.s);
    return (this.o.r() != null) ? ((i <= this.o.r().d()) ? i : this.o.r().d()) : 0;
  }
  
  public boolean a(List paramList) {
    if (paramList == null || paramList.isEmpty())
      return true; 
    for (j j1 : paramList) {
      if (j1.a() != null && !j1.a().equals(""))
        return false; 
    } 
    return true;
  }
  
  public void a(String paramString1, String paramString2, int paramInt) {
    List<j> list = (List)this.k.get(paramString1);
    if (list != null && paramInt < list.size())
      list.set(paramInt, new j()); 
    if (a(list))
      this.k.remove(paramString1); 
    this.S = true;
    i();
    l();
  }
  
  public void p() {
    this.k.clear();
    this.X = 0;
    i();
    repaint(500L);
  }
  
  public void a(int paramInt) {
    this.q = paramInt;
    a((j)null);
    if (this.ag) {
      q();
    } else {
      repaint();
    } 
  }
  
  public void b(double paramDouble) {
    if (this.s != paramDouble) {
      this.s = paramDouble;
      n();
    } 
    i();
    repaint();
  }
  
  public void q() {
    n();
    i();
    repaint();
  }
  
  public void validate() {
    i();
    super.validate();
  }
  
  protected void d(int paramInt) {
    for (ft ft : this.z) {
      if (ft != null)
        ft.a(paramInt); 
    } 
  }
  
  public void a(ft paramft) {
    this.z.add(paramft);
  }
  
  public void b(Color paramColor) {
    i();
    repaint();
    super.setForeground(getForeground());
  }
  
  public void a(Color paramColor) {
    i();
    super.setBackground(paramColor);
    repaint();
  }
  
  public void a(Color paramColor, int paramInt) {
    i();
    repaint();
  }
  
  public Color b(int paramInt1, int paramInt2) {
    return aV.a().a(paramInt1, paramInt2);
  }
  
  private int e(String paramString) {
    try {
      return Integer.parseInt(paramString.substring(5));
    } catch (Exception exception) {
      return -1;
    } 
  }
  
  public void setBackground(Color paramColor) {
    this.i = paramColor;
    super.setBackground(paramColor);
  }
  
  public void setForeground(Color paramColor) {
    super.setForeground(paramColor);
  }
  
  public int e(int paramInt) {
    int i;
    if (h() == null) {
      i = (int)(A() + paramInt / this.s);
    } else {
      i = (int)((A() + paramInt / this.s < h().i()) ? (A() + paramInt / this.s) : (h().i() - 1));
    } 
    if (i < 0)
      i = 0; 
    return i;
  }
  
  private int l(int paramInt) {
    return (int)Math.round((paramInt - A()) * this.s);
  }
  
  public void a(HashMap paramHashMap) {
    this.m = paramHashMap;
  }
  
  public void b(HashMap paramHashMap) {
    this.n = paramHashMap;
  }
  
  public void a(double paramDouble) {
    if (i.a(i.aB, i.aC) && (e(getWidth()) > this.p || paramDouble == 1.0D)) {
      if (b.a().a("timeslipData") && paramDouble == 1.0D && !this.al) {
        n n1 = hx.a().r();
        n n2 = hx.a().s();
        if (n2 != null && !n2.m()) {
          this.Q = new L(n2);
          this.Q.a();
          int i = this.Q.a(n2);
          if (this.W != null)
            for (byte b1 = 0; b1 < n1.d(); b1++) {
              if (this.W.d(b1) >= 0.0F) {
                bq.a().g().c(b1 - i);
                break;
              } 
            }  
        } else if (n1 != null && !n1.m()) {
          this.P = new L(n1);
          this.P.a();
          int i = this.P.a(n1);
          if (i.a(i.ax, i.ay))
            hx.a().c(i); 
        } 
      } 
      i();
      repaint(200L);
    } 
  }
  
  public void b(n paramn) {
    this.P = null;
    this.l = paramn;
    repaint();
  }
  
  public void a() {}
  
  public void a(n paramn) {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield P : Lao/L;
    //   5: aload_1
    //   6: ifnull -> 34
    //   9: new java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: ldc 'DataSet Set!! size: '
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: aload_1
    //   22: invokevirtual size : ()I
    //   25: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   28: invokevirtual toString : ()Ljava/lang/String;
    //   31: invokestatic c : (Ljava/lang/String;)V
    //   34: aload_1
    //   35: ifnull -> 65
    //   38: aload_0
    //   39: invokevirtual C : ()LW/j;
    //   42: ifnonnull -> 65
    //   45: invokestatic a : ()Lh/g;
    //   48: astore_2
    //   49: aload_2
    //   50: ldc 'Time'
    //   52: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   55: astore_3
    //   56: aload_0
    //   57: aload_1
    //   58: aload_3
    //   59: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   62: putfield W : LW/j;
    //   65: aload_0
    //   66: invokevirtual C : ()LW/j;
    //   69: ifnull -> 72
    //   72: aload_1
    //   73: ifnull -> 83
    //   76: aload_1
    //   77: invokevirtual isEmpty : ()Z
    //   80: ifeq -> 109
    //   83: aload_0
    //   84: getfield k : Ljava/util/HashMap;
    //   87: invokevirtual clear : ()V
    //   90: aload_0
    //   91: aconst_null
    //   92: putfield W : LW/j;
    //   95: aload_0
    //   96: invokevirtual i : ()V
    //   99: aload_0
    //   100: ldc2_w 500
    //   103: invokevirtual repaint : (J)V
    //   106: goto -> 137
    //   109: ldc 'graphBackColor'
    //   111: getstatic java/awt/Color.black : Ljava/awt/Color;
    //   114: invokestatic a : (Ljava/lang/String;Ljava/awt/Color;)Ljava/awt/Color;
    //   117: astore_2
    //   118: aload_0
    //   119: aload_2
    //   120: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   123: ldc 'graphForeColor'
    //   125: getstatic java/awt/Color.CYAN : Ljava/awt/Color;
    //   128: invokestatic a : (Ljava/lang/String;Ljava/awt/Color;)Ljava/awt/Color;
    //   131: astore_3
    //   132: aload_0
    //   133: aload_3
    //   134: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   137: return
  }
  
  public void r() {
    String str = bV.a(this, false, "MARK Label ", "");
    if (str != null && str.length() > 0) {
      this.m.put(Integer.valueOf(this.q), "MARK: " + str);
      repaint();
    } 
  }
  
  public void s() {
    this.m.remove(Integer.valueOf(this.q));
  }
  
  public void t() {
    if (C() != null && (h() == null || C().equals(h()))) {
      f(this.q);
    } else if (h() != null) {
      j j1 = h();
      j1.j(0.0F);
      j1.j(-j1.c(this.o.p()));
    } 
  }
  
  public void f(int paramInt) {
    if (C() != null) {
      C().j(0.0F);
      C().j(-this.W.c(paramInt));
      if (b.a().a("timeslipData") && this.P != null)
        this.P.a(paramInt); 
      if (this.l != null && this.l.a(g.a().a("Time")) != null) {
        j j1 = this.l.a(g.a().a("Time"));
        int i = paramInt - this.r;
        if (i >= 0 && i < j1.i()) {
          j1.j(0.0F);
          j1.j(-j1.c(i));
        } 
      } 
      if (b.a().a("timeslipData") && this.Q != null)
        this.Q.a(paramInt - this.r); 
      i();
      repaint();
    } 
  }
  
  public void invalidate() {
    super.invalidate();
    i();
  }
  
  public void d(boolean paramBoolean) {
    this.w = paramBoolean;
    if (!this.w)
      repaint(); 
  }
  
  public boolean u() {
    return (this.k == null || this.k.isEmpty());
  }
  
  public void a(boolean paramBoolean) {
    this.x = paramBoolean;
    i();
    repaint();
  }
  
  public void g(int paramInt) {
    this.r = paramInt;
  }
  
  public void b(int paramInt) {
    g(paramInt);
    i();
    repaint();
  }
  
  public boolean v() {
    return (this.x && this.l != null);
  }
  
  public void b() {}
  
  public void c(int paramInt1, int paramInt2) {
    int i = e(paramInt1);
    int m = e(paramInt2);
    d(i, m);
  }
  
  public void d(int paramInt1, int paramInt2) {
    a(getGraphics(), paramInt1, paramInt2);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    Image image = K();
    Graphics graphics = image.getGraphics();
    graphics.drawImage(this.b, 0, 0, null);
    c(graphics);
    int i = l(paramInt1);
    int m = l(paramInt2);
    int i1 = paramInt1;
    int i2 = paramInt2;
    b(graphics, i1, i2);
    graphics.setColor(Color.white);
    int i3 = getHeight() - B + eJ.a(3);
    graphics.fillRect(i, i3, m - i, B - eJ.a(8));
    graphics.setColor(Color.gray);
    graphics.drawLine(i, 0, i, getHeight());
    graphics.drawLine(m, 0, m, getHeight());
    if (C() != null) {
      String str = X.c(Math.abs(C().c(i2) - C().c(i1)), 3) + "s.";
      graphics.setFont(getFont());
      int i4 = graphics.getFontMetrics().stringWidth(str);
      int i5 = (m - i > i4 + eJ.a(10)) ? (m - i) : (i4 + eJ.a(10));
      graphics.setColor(Color.white);
      graphics.fillRect(i, i3, i5, B - eJ.a(8));
      graphics.setColor(Color.gray);
      graphics.drawString(str, i + eJ.a(5), i3 + eJ.a(10));
    } 
    paramGraphics.drawImage(image, 0, 0, null);
    a(new j(paramInt1, paramInt2));
  }
  
  private Image K() {
    if (this.h == null || this.h.getWidth(null) != getWidth() || this.h.getHeight(null) != getHeight())
      this.h = createImage(getWidth(), getHeight()); 
    return this.h;
  }
  
  public void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
    ArrayList<String> arrayList = new ArrayList();
    Object[] arrayOfObject = this.k.keySet().toArray();
    arrayOfObject = k.b(arrayOfObject);
    int i = 0;
    int m;
    for (m = 0; m < arrayOfObject.length; m++) {
      List list = (List)this.k.get(arrayOfObject[m]);
      for (j j1 : list) {
        if (j1.a() != null && j1.a().length() > i - 6)
          i = j1.a().length() + 6; 
      } 
    } 
    m = i;
    int i1;
    for (i1 = 0; i1 < arrayOfObject.length; i1++) {
      List list = (List)this.k.get(arrayOfObject[i1]);
      for (j j1 : list) {
        if (j1.a() != null && !j1.a().trim().equals("")) {
          int i5 = m - j1.a().length();
          arrayList.add(j1.a() + ": " + X.a(X.b(j1.b(paramInt1, paramInt2), -1), ' ', i5) + X.a(X.b(j1.c(paramInt1, paramInt2), j1.m()), ' ', 8) + X.a(X.b(j1.d(paramInt1, paramInt2), j1.m()), ' ', 8) + X.a(X.b((j1.c(paramInt2) - j1.c(paramInt1)), j1.m()), ' ', 8));
        } 
      } 
    } 
    i1 = 0;
    Font font = new Font("Monospaced", 0, getFont().getSize());
    FontMetrics fontMetrics = getFontMetrics(font);
    int i2;
    for (i2 = 0; i2 < arrayList.size(); i2++) {
      int i5 = fontMetrics.stringWidth(arrayList.get(i2));
      if (i5 > i1)
        i1 = i5; 
    } 
    i1 += 5;
    i2 = getWidth() - i1;
    int i3 = fontMetrics.getHeight() * (arrayList.size() + 1) + eJ.a(5);
    int i4 = getHeight() - i3 - B;
    Image image = g(i1, i3);
    Graphics graphics = image.getGraphics();
    if (J.b() && this.L) {
      Graphics2D graphics2D = (Graphics2D)graphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    } 
    graphics.setColor(Color.white);
    graphics.setFont(font);
    graphics.drawString(X.a("Averages", ' ', m + 1) + X.a("Min", ' ', 8) + X.a("Max", ' ', 8) + X.a("Delta", ' ', 8), 6, fontMetrics.getHeight());
    for (byte b1 = 0; b1 < arrayList.size(); b1++)
      graphics.drawString(arrayList.get(b1), 0, (2 + b1) * fontMetrics.getHeight()); 
    paramGraphics.drawImage(image, i2 - 2, i4 - 2, null);
  }
  
  private Image g(int paramInt1, int paramInt2) {
    if (this.f == null || this.f.getWidth(null) != paramInt1 || this.f.getHeight(null) != paramInt2) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.f = graphicsConfiguration.createCompatibleImage(paramInt1, paramInt2, 3);
    } 
    Graphics2D graphics2D = (Graphics2D)this.f.getGraphics();
    graphics2D.setBackground(new Color(255, 255, 255, 0));
    graphics2D.clearRect(0, 0, this.f.getWidth(null), this.f.getHeight(null));
    graphics2D.setColor(new Color(64, 64, 64, 182));
    graphics2D.fillRect(0, 0, paramInt1, paramInt2);
    return this.f;
  }
  
  public int w() {
    return this.ae;
  }
  
  public aW e(int paramInt1, int paramInt2) {
    if (b.a().a("fieldSmoothing"))
      for (aW aW : this.C) {
        if (aW.a(paramInt1, paramInt2))
          return aW; 
      }  
    return null;
  }
  
  public void a(aW paramaW) {
    b(paramaW);
  }
  
  private void b(aW paramaW) {
    if (b.a().a("searchLogFiles") && paramaW.c().equals(aW.a)) {
      br br = new br();
      S.a((bq)br, paramaW.b(), this);
      add((Component)br);
      br.show(this, (paramaW.a()).x, (paramaW.a()).y + (paramaW.a()).height);
    } else if (b.a().a("4e345hggsdhd4812hfd43-0gdk") && paramaW.c().equals(aW.b)) {
      br br = new br();
      S.b((bq)br, paramaW.b(), this);
      add((Component)br);
      br.show(this, (paramaW.a()).x, (paramaW.a()).y + (paramaW.a()).height);
    } 
  }
  
  public void h(int paramInt) {
    this.ae = paramInt;
  }
  
  public int x() {
    return this.af;
  }
  
  public void i(int paramInt) {
    this.af = paramInt;
  }
  
  private void h(Graphics paramGraphics) {
    if (C() == null)
      return; 
    if (w() > 0) {
      paramGraphics.setColor(this.N);
      int i = (int)(w() * this.s);
      paramGraphics.fillRect(0, 0, i, getHeight());
      String str = "Low Record: " + w();
      int m = paramGraphics.getFontMetrics().stringWidth(str) + eJ.a(50);
      int i1 = (i > m) ? (i - m + eJ.a(45)) : eJ.a(45);
      paramGraphics.setColor(Color.white);
      paramGraphics.drawString(str, i1, getHeight() - eJ.a(5));
    } 
    if (x() < C().i()) {
      paramGraphics.setColor(this.N);
      int i = (int)((C().i() - x()) * this.s);
      paramGraphics.fillRect(getWidth() - i, 0, i, getHeight());
      String str = "High Record: " + x();
      int m = paramGraphics.getFontMetrics().stringWidth(str) + eJ.a(50);
      int i1 = (i > m) ? (getWidth() - i + eJ.a(5)) : (getWidth() - m + eJ.a(5));
      paramGraphics.setColor(Color.white);
      paramGraphics.drawString(str, i1, getHeight() - eJ.a(5));
    } 
  }
  
  public void a(j paramj) {
    this.ai = paramj;
  }
  
  public j y() {
    return this.ai;
  }
  
  public void j(int paramInt) {
    double d = (getWidth() / paramInt);
    this.o.b(d, false);
  }
  
  public int z() {
    return (int)(getWidth() / this.s);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = z();
    boolean bool = (bq.a().c() != null && bq.a().c().equals(this) && i.a(i.U, i.V) && this.o.r() != null && Math.abs(this.o.r().d() - i) < 3) ? true : false;
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    if (bool) {
      aM aM = new aM(this);
      SwingUtilities.invokeLater(aM);
    } 
  }
  
  public int A() {
    return this.X;
  }
  
  public void f(boolean paramBoolean) {
    this.aj = paramBoolean;
  }
  
  public c B() {
    c c = new c("Current View");
    Set set = this.k.keySet();
    String[] arrayOfString = (String[])set.toArray((Object[])new String[set.size()]);
    arrayOfString = k.b(arrayOfString);
    for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
      List<j> list = (List)this.k.get(arrayOfString[b1]);
      for (byte b2 = 0; b2 < list.size(); b2++) {
        d d;
        j j1 = list.get(b2);
        String str = arrayOfString[b1] + "." + b2;
        if (j1.a() != null && !j1.a().trim().equals("")) {
          d = new d(str, g.a().d(j1.a()));
        } else {
          d = new d(str, " ");
        } 
        c.a(d);
      } 
    } 
    return c;
  }
  
  public static void g(boolean paramBoolean) {
    ad = paramBoolean;
  }
  
  public void h(boolean paramBoolean) {
    this.ah = paramBoolean;
  }
  
  public j C() {
    return this.W;
  }
  
  public void i(boolean paramBoolean) {
    this.al = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */