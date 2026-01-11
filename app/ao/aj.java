package ao;

import V.a;
import W.j;
import W.n;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import i.b;
import i.c;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;

public class aj extends JPanel implements b {
  private Map k = new HashMap<>();
  
  private Map l = new HashMap<>();
  
  List a = new ArrayList();
  
  List b = new ArrayList();
  
  Icon c = null;
  
  Icon d = null;
  
  Icon e = null;
  
  Icon f = null;
  
  private String m = null;
  
  private String n = null;
  
  al g = new al(this);
  
  ao h = new ao(this);
  
  JPanel i = new JPanel();
  
  JButton j;
  
  private boolean o = false;
  
  public aj() {
    setLayout(new BorderLayout());
    add("Center", this.i);
    BoxLayout boxLayout = new BoxLayout(this.i, 0);
    this.i.setLayout(boxLayout);
  }
  
  public void c() {
    c.a().a(this);
    c.a().a(new an(this));
    try {
      Image image = cO.a().a(cO.E, this, eJ.a(16));
      this.c = new ImageIcon(image);
      image = cO.a().a(cO.F, this, eJ.a(16));
      this.d = new ImageIcon(image);
      image = cO.a().a(cO.G, this, eJ.a(16));
      this.e = new ImageIcon(image);
      image = cO.a().a(cO.au, this, eJ.a(16));
      this.f = new ImageIcon(image);
    } catch (a a) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    this.j = new JButton(this.f);
    add("East", this.j);
    this.j.setVisible(false);
    this.j.addActionListener(new ak(this));
  }
  
  private void e() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    for (JToggleButton jToggleButton : this.b)
      jPopupMenu.add(jToggleButton); 
    this.j.add(jPopupMenu);
    jPopupMenu.show(this.j, -30, this.j.getHeight());
  }
  
  private boolean f() {
    if (this.i.getComponentCount() > 0) {
      int i = (this.i.getPreferredSize()).width;
      int j = this.i.getWidth() - i;
      return (j > i / this.i.getComponentCount());
    } 
    return true;
  }
  
  private void c(n paramn) {
    if (paramn != null) {
      if (!this.k.containsKey(paramn.k().getAbsolutePath())) {
        while (!f())
          g(); 
        JToggleButton jToggleButton = new JToggleButton(paramn.k().getName(), this.c);
        jToggleButton.setSelectedIcon(this.d);
        jToggleButton.setActionCommand(paramn.k().getAbsolutePath());
        jToggleButton.addActionListener(this.g);
        jToggleButton.addMouseListener(this.h);
        jToggleButton.setToolTipText("Right click to close log file.");
        this.i.add(jToggleButton, 0);
        jToggleButton.setSelected(true);
        for (JToggleButton jToggleButton1 : this.l.values())
          jToggleButton1.setSelected(false); 
        this.l.put(paramn.k().getAbsolutePath(), jToggleButton);
        this.a.add(0, jToggleButton);
        i();
      } 
      this.m = paramn.k().getAbsolutePath();
      this.k.put(this.m, paramn);
    } else {
      this.m = null;
    } 
    h();
  }
  
  private void g() {
    am am = new am(this);
    ArrayList<File> arrayList1 = new ArrayList();
    if (this.m != null)
      arrayList1.add(((n)this.k.get(this.m)).k()); 
    if (this.n != null)
      arrayList1.add(((n)this.k.get(this.n)).k()); 
    ArrayList<File> arrayList2 = new ArrayList();
    for (JToggleButton jToggleButton : this.a) {
      if (this.k.containsKey(jToggleButton.getActionCommand()))
        arrayList2.add(((n)this.k.get(jToggleButton.getActionCommand())).k()); 
    } 
    bE bE = new bE(bV.b(this), arrayList2, arrayList1);
    bE.a(am);
    bE.pack();
    bV.a(bV.a(this), bE);
    bE.setVisible(true);
    D.c("past it");
  }
  
  private void h() {
    for (JToggleButton jToggleButton : this.l.values()) {
      if (this.m != null && jToggleButton.getActionCommand().equals(this.m)) {
        if (!jToggleButton.isSelected())
          jToggleButton.setSelected(true); 
        jToggleButton.setSelectedIcon(this.d);
        continue;
      } 
      if (this.n != null && jToggleButton.getActionCommand().equals(this.n)) {
        if (!jToggleButton.isSelected())
          jToggleButton.setSelected(true); 
        jToggleButton.setSelectedIcon(this.e);
        continue;
      } 
      jToggleButton.setSelected(false);
    } 
    validate();
  }
  
  private void d(n paramn) {
    if (paramn != null && this.m != null && paramn.k().getAbsolutePath().equals(this.m)) {
      c(paramn);
      return;
    } 
    if (paramn != null && !this.k.containsKey(paramn.k().getAbsolutePath())) {
      JToggleButton jToggleButton = new JToggleButton(paramn.k().getName(), this.c);
      jToggleButton.setSelectedIcon(this.e);
      jToggleButton.setActionCommand(paramn.k().getAbsolutePath());
      jToggleButton.addActionListener(this.g);
      jToggleButton.addMouseListener(this.h);
      jToggleButton.setToolTipText("Right click to close log file.");
      this.i.add(jToggleButton, 0);
      jToggleButton.setSelected(true);
      for (JToggleButton jToggleButton1 : this.l.values()) {
        if ((jToggleButton1.isSelected() && this.n == null) || jToggleButton1.getActionCommand().equals(this.n))
          jToggleButton1.setSelected(false); 
      } 
      this.l.put(paramn.k().getAbsolutePath(), jToggleButton);
      this.a.add(0, jToggleButton);
      i();
      doLayout();
    } 
    if (paramn != null) {
      String str = paramn.k().getAbsolutePath();
      this.n = str;
      this.k.put(str, paramn);
    } else {
      this.n = null;
    } 
    h();
  }
  
  private void i() {
    while (f() && !this.b.isEmpty())
      this.i.add(this.b.remove(0)); 
    while (this.i.getWidth() < (this.i.getPreferredSize()).width) {
      for (int i = this.a.size() - 1; i > 0; i--) {
        JToggleButton jToggleButton = this.a.get(i);
        if (!this.b.contains(jToggleButton)) {
          this.b.add(0, jToggleButton);
          this.i.remove(jToggleButton);
        } 
      } 
    } 
    this.j.setVisible(!this.b.isEmpty());
    this.i.doLayout();
  }
  
  private void a(String paramString, boolean paramBoolean) {
    for (JToggleButton jToggleButton : this.l.values()) {
      if (jToggleButton.getActionCommand().equals(paramString)) {
        jToggleButton.setSelected(paramBoolean);
        return;
      } 
    } 
  }
  
  public void a(j paramj, int paramInt) {
    for (n n : this.k.values()) {
      j j1 = n.a(paramj.a());
      if (j1 != null) {
        j1.g(paramInt);
        j1.b(true);
      } 
    } 
  }
  
  private boolean a(String paramString) {
    if (paramString != null && this.m != null && paramString.equals(this.m))
      return false; 
    n n = (n)this.k.get(paramString);
    this.n = paramString;
    JToggleButton jToggleButton = (JToggleButton)this.l.get(paramString);
    if (jToggleButton != null)
      jToggleButton.setSelectedIcon(this.e); 
    D.c("Set Compare Data: " + paramString);
    if (!this.o) {
      this.o = true;
      try {
        c.a().b(n);
      } finally {
        this.o = false;
      } 
    } 
    hx.a().c(hx.a().p());
    return true;
  }
  
  private boolean b(String paramString) {
    boolean bool = (this.m == null || !this.m.equals(paramString)) ? true : false;
    n n = (n)this.k.get(paramString);
    this.m = paramString;
    JToggleButton jToggleButton = (JToggleButton)this.l.get(paramString);
    if (jToggleButton != null) {
      jToggleButton.setSelectedIcon(this.d);
      jToggleButton.setSelected(true);
    } 
    D.c("Set Main Data: " + paramString);
    c.a().a(n);
    if (bool && n != null && n.a("Time") != null && !n.a("Time").x() && n.a("Time").d(0) < 0.0F) {
      j j = n.a("Time");
      for (byte b1 = 0; b1 < j.v(); b1++) {
        if (j.d(b1) >= 0.0F) {
          hx.a().c(b1);
          break;
        } 
      } 
    } 
    return true;
  }
  
  public Dimension getMinimumSize() {
    return (getComponentCount() == 0) ? new Dimension(0, 0) : super.getMinimumSize();
  }
  
  public Dimension getPreferredSize() {
    return (getComponentCount() == 0) ? new Dimension(0, 0) : super.getPreferredSize();
  }
  
  public void a() {}
  
  public void a(double paramDouble) {}
  
  public void a(n paramn) {
    c(paramn);
    if (this.n != null) {
      JToggleButton jToggleButton = (JToggleButton)this.l.get(this.n);
      if (jToggleButton != null)
        jToggleButton.setSelected(false); 
      this.n = null;
    } 
  }
  
  public void b(n paramn) {
    if (paramn != null) {
      d(paramn);
    } else {
      a((String)null);
    } 
  }
  
  public void setSize(int paramInt1, int paramInt2) {
    super.setSize(paramInt1, paramInt2);
    i();
  }
  
  private void c(String paramString) {
    JToggleButton jToggleButton = (JToggleButton)this.l.remove(paramString);
    if (jToggleButton != null) {
      this.i.remove(jToggleButton);
      this.k.remove(paramString);
      this.a.remove(jToggleButton);
      this.b.remove(jToggleButton);
      i();
    } 
    if (this.m != null && this.m.equals(paramString))
      if (this.n != null && this.k.containsKey(this.n)) {
        b(this.n);
        a((String)null);
      } else {
        b((String)null);
      }  
    if (this.n != null && this.n.equals(paramString) && this.k.containsKey(this.n)) {
      a((String)null);
      hx.a().c((n)null);
    } 
    doLayout();
  }
  
  public void d() {
    String[] arrayOfString = (String[])this.k.keySet().toArray((Object[])new String[this.k.keySet().size()]);
    for (String str : arrayOfString) {
      JToggleButton jToggleButton = (JToggleButton)this.l.remove(str);
      if (jToggleButton != null) {
        this.i.remove(jToggleButton);
        this.k.remove(str);
      } 
    } 
    a((String)null);
    b((String)null);
  }
  
  public void b() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */