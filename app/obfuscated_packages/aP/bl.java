package aP;

import G.R;
import G.aA;
import G.aM;
import G.aj;
import G.bI;
import G.bM;
import G.bq;
import G.bv;
import ai.b;
import bA.e;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import r.a;
import r.i;
import s.g;
import x.a;

public class bl extends JMenuBar {
  ArrayList a = null;
  
  bv b = null;
  
  R c = null;
  
  public bl() {}
  
  public bl(R paramR, bv parambv, ArrayList paramArrayList) {
    this.c = paramR;
    a(paramR, parambv, paramArrayList);
  }
  
  public void a(R paramR, bv parambv, ArrayList paramArrayList) {
    this.a = paramArrayList;
    this.b = parambv;
    List list1 = parambv.e();
    List list2 = parambv.U();
    if (list1.size() > 0 && i.a().a("hlk;rd;tporg;'gd")) {
      a a = c(g.b("File"));
      a.setMnemonic('F');
      a(a);
    } 
    if (list1.size() > 0) {
      a a = c(g.b("View"));
      a.setMnemonic('V');
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(g.b("Show Lower Help Pane"));
      boolean bool = a.a().c(a.ci, a.cj);
      jCheckBoxMenuItem.setSelected(bool);
      a.add(jCheckBoxMenuItem);
      jCheckBoxMenuItem.addActionListener(new bm(this));
    } 
    if (!list2.isEmpty() || (parambv.aa() != null && !parambv.aa().isEmpty())) {
      a a = c(g.b("Tools"));
      a.setMnemonic('T');
      boolean bool = false;
      for (bI bI : list2) {
        a(a, bI);
        bool = true;
      } 
      String str = parambv.aa();
      if (str != null && !str.isEmpty() && i.a().a("fv-7rkf74nfd67whn5iuchqj")) {
        String str1;
        if (bool)
          a.addSeparator(); 
        aM aM = paramR.c(parambv.aa());
        boolean bool1 = false;
        try {
          bool1 = (aM.j(paramR.h()) != 0.0D) ? true : false;
        } catch (Exception exception) {
          D.c("Faied to get Password value.");
        } 
        if (bool1) {
          str1 = "Change Dialog Password";
        } else {
          str1 = "Password Protect Dialog";
        } 
        e e = new e(g.b(str1), true);
        e.addActionListener(new bo(this, a, paramR, parambv));
        a.add((JMenuItem)e);
        if (bool1) {
          e e1 = new e(g.b("Clear Dialog Password."), true);
          e1.addActionListener(new bp(this, paramR, parambv, a, e1));
          e1.a(new bq(this, parambv));
          a.add((JMenuItem)e1);
        } 
      } 
    } 
    ArrayList arrayList = parambv.O();
    if (parambv.J() > 0 || arrayList.size() > 0 || paramArrayList.size() > 0) {
      if (parambv.J() > 0) {
        Iterator<aA> iterator = parambv.I();
        while (iterator.hasNext()) {
          aA aA = iterator.next();
          String str = g.b(aA.e());
          a a = c(str);
          a(a, aA);
        } 
      } 
      if (arrayList.size() > 0 || paramArrayList.size() > 0) {
        a a = new a(g.b("Help"));
        a.setMnemonic('H');
        add((JMenu)a);
        for (b b : paramArrayList) {
          JMenuItem jMenuItem = new JMenuItem(b.a());
          jMenuItem.setActionCommand(b.b());
          jMenuItem.addActionListener(new br(this));
          a.add(jMenuItem);
        } 
        if (a.getItemCount() > 0)
          a.addSeparator(); 
        for (String str : arrayList) {
          aj aj = paramR.e().b(str);
          if (aj != null) {
            JMenuItem jMenuItem = new JMenuItem(g.b(aj.d()));
            jMenuItem.setActionCommand(aj.a());
            jMenuItem.addActionListener(new bs(this));
            a.add(jMenuItem);
            continue;
          } 
          D.b("helpTopic " + str + " is set for dialog, but not found in ini.");
        } 
      } 
    } 
  }
  
  private void a(a parama) {
    String str = g.b("Save dialog settings");
    e e = new e(str, true);
    e.setMnemonic('S');
    e.setActionCommand("savePartial");
    e.setName("savePartial");
    e.addActionListener(new bt(this));
    parama.add((JMenuItem)e);
    str = g.b("Load dialog settings");
    e = new e(str, true);
    e.setMnemonic('L');
    e.setActionCommand("loadPartial");
    e.setName("loadPartial");
    e.addActionListener(new bu(this));
    parama.add((JMenuItem)e);
  }
  
  public void a(a parama, aA paramaA) {
    Iterator<aA> iterator = paramaA.a();
    while (iterator.hasNext()) {
      aA aA1 = iterator.next();
      if (aA1.b()) {
        a a1 = new a(g.b(aA1.e()));
        a1.b(a1.d());
        a(a1, aA1);
        parama.add((JMenuItem)a1);
        continue;
      } 
      if (aA1.c()) {
        parama.addSeparator();
        continue;
      } 
      String str = g.b(aA1.e());
      e e = new e(str, true);
      e.setActionCommand(aA1.d());
      e.setName(aA1.f() + "");
      e.addActionListener(new bv(this));
      parama.add((JMenuItem)e);
    } 
  }
  
  public void a(a parama, bI parambI) {
    e e;
    String str = g.b(parambI.b());
    if (i.a().a(".ewqlfdds/e;ewropglk")) {
      e = new e(str, true);
      e.setActionCommand(parambI.a());
      e.setName(parambI.aL());
      e.addActionListener(new bx(this, this.c, parambI));
      if (parambI.aJ() != null)
        e.a(new bw(this, parambI.aJ(), this.c)); 
    } else {
      e = new e("Enable " + str, true);
      e.addActionListener(new bn(this));
    } 
    if (!i.a().a("-0o4togd;'fdshlew"))
      parama.add((JMenuItem)e); 
  }
  
  private a c(String paramString) {
    for (byte b = 0; b < getMenuCount(); b++) {
      a a1 = (a)getMenu(b);
      if (a1 != null && a1.getText().equals(paramString))
        return a1; 
    } 
    a a = new a(paramString);
    add((JMenu)a);
    return a;
  }
  
  public void a(String paramString) {
    f.a().a(this.c, paramString, bV.a(this));
  }
  
  public void b(String paramString) {
    if (this.a == null) {
      D.c("helpRefs is null, can not show app help");
      return;
    } 
    b b = null;
    for (b b1 : this.a) {
      if (b1.b().equals(paramString)) {
        b = b1;
        break;
      } 
    } 
    if (b == null)
      b = new b("Application Help", paramString); 
    f.a().a(b, bV.a(this));
  }
  
  private void a() {
    List list = bM.c(this.c, this.b);
    String str = (this.b.aL() != null) ? this.b.aL() : "";
    f.a().a(this.c, str, list);
  }
  
  private void b() {
    List list1 = this.b.e();
    List list2 = bM.c(this.c, this.b);
    if (list2.size() > list1.size()) {
      String str = "The settings within this dialog have dependencies on additional settings not in thie dialog.\nTo insure the settings in this dialog are loaded correctly\nthe following additional settings should be loaded also:\n";
      for (String str1 : list2) {
        if (!list1.contains(str1)) {
          bq bq = bM.d(this.c, str1);
          String str2 = (bq == null) ? str1 : bq.l();
          str = str + str2 + "\n";
        } 
      } 
      String[] arrayOfString = { "Include Additional Dependencies", "Load Only Dialog Settings" };
      boolean bool = bV.a(str, "Load Dialog Settings", bV.b(this), arrayOfString);
      if (bool)
        list1 = list2; 
    } 
    f.a().a(dd.a().c(), this.c, list1);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */