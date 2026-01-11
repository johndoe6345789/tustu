package bf;

import G.Q;
import G.R;
import G.aH;
import G.ac;
import G.ah;
import W.r;
import be.r;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import s.g;

public class a extends JPanel implements TreeSelectionListener {
  public static String a = r.a;
  
  public static String b = r.b;
  
  public static String c = r.c;
  
  j d = new j("Controller");
  
  j e = null;
  
  Q f = null;
  
  ArrayList g = new ArrayList();
  
  ArrayList h = new ArrayList();
  
  HashMap i = new HashMap<>();
  
  JTree j;
  
  R k = null;
  
  private r m = new b(this);
  
  List l = new ArrayList();
  
  private m n = new m(this);
  
  public a() {
    setLayout(new BorderLayout());
    this.j = new JTree(this.d);
    this.j.setBorder(BorderFactory.createLoweredSoftBevelBorder());
    JScrollPane jScrollPane = new JScrollPane(this.j);
    jScrollPane.setPreferredSize(new Dimension(eJ.a(240), eJ.a(500)));
    this.j.addTreeSelectionListener(this);
    add(jScrollPane, "Center");
    this.j.addMouseListener(new c(this));
    Font font = (Font)UIManager.get("Tree.font");
    if (font != null)
      this.j.setRowHeight(font.getSize() + eJ.a(4)); 
  }
  
  private void a(MouseEvent paramMouseEvent) {
    if (this.e != null) {
      String str = (this.e.a() == null) ? this.e.getUserObject().toString() : ((j)this.e.getParent()).getUserObject().toString();
      JPopupMenu jPopupMenu = new JPopupMenu();
      jPopupMenu.add(g.b("Add") + " " + str).addActionListener(new d(this, str));
      Q q = this.e.a();
      if (q != null) {
        jPopupMenu.add(g.b("Edit") + " " + str).addActionListener(new e(this, q));
        jPopupMenu.add(g.b("Delete") + " " + str).addActionListener(new f(this, q));
      } 
      jPopupMenu.show(this, paramMouseEvent.getX(), paramMouseEvent.getY());
    } 
  }
  
  public void a(Q paramQ) {
    j j1 = b(paramQ);
    if (j1 == null) {
      bV.d("Unknown Component Type!", this);
      return;
    } 
    j j2 = new j(paramQ);
    j1.add(j2);
    DefaultTreeModel defaultTreeModel = (DefaultTreeModel)this.j.getModel();
    defaultTreeModel.reload(j1);
    this.j.setSelectionPath(new TreePath((Object[])j2.getPath()));
    this.j.setSelectionPath(new TreePath((Object[])j2.getPath()));
  }
  
  private j b(Q paramQ) {
    return (paramQ instanceof aH) ? (j)this.i.get(a) : ((paramQ instanceof ah) ? (j)this.i.get(b) : ((paramQ instanceof ac) ? (j)this.i.get(c) : null));
  }
  
  public void a(R paramR) {
    this.k = paramR;
    this.d.removeAllChildren();
    if (a(a)) {
      j j1 = new j(a);
      this.i.put(a, j1);
      this.d.add(j1);
      ArrayList<?> arrayList = new ArrayList();
      null = paramR.q();
      while (null.hasNext())
        arrayList.add(null.next()); 
      Collections.sort(arrayList, new g(this));
      for (aH aH : arrayList) {
        if (this.m == null || this.m.a((Q)aH)) {
          j j2 = new j((Q)aH);
          j1.add(j2);
        } 
      } 
    } 
    if (a(b)) {
      j j1 = new j(b);
      this.d.add(j1);
      this.i.put(b, j1);
      ArrayList<?> arrayList = new ArrayList();
      null = paramR.B();
      while (null.hasNext())
        arrayList.add(null.next()); 
      Collections.sort(arrayList, new h(this));
      for (ah ah : arrayList) {
        if (this.m == null || this.m.a((Q)ah))
          try {
            j j2 = new j((Q)ah);
            j1.add(j2);
          } catch (Exception exception) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, exception);
          }  
      } 
    } 
    if (a(c)) {
      j j1 = new j(c);
      this.d.add(j1);
      this.i.put(c, j1);
      ArrayList<?> arrayList = new ArrayList();
      arrayList.addAll(paramR.g());
      Collections.sort(arrayList, new i(this));
      for (ac ac : arrayList) {
        if (this.m == null || this.m.a((Q)ac)) {
          j j2 = new j((Q)ac);
          j1.add(j2);
        } 
      } 
    } 
    DefaultTreeModel defaultTreeModel = (DefaultTreeModel)this.j.getModel();
    defaultTreeModel.reload(this.d);
    this.j.expandPath(new TreePath((Object[])this.d.getPath()));
  }
  
  public boolean a(String paramString) {
    return this.l.contains(paramString);
  }
  
  public void b(String paramString) {
    this.l.add(paramString);
  }
  
  public void a(k paramk) {
    this.g.add(paramk);
  }
  
  private void a(j paramj) {
    for (k k : this.g)
      k.a(this.e); 
  }
  
  private void c(Q paramQ) {
    for (k k : this.g)
      k.a(paramQ); 
  }
  
  public void a(l paraml) {
    this.h.add(paraml);
  }
  
  private void d(Q paramQ) {
    for (l l : this.h)
      l.a(paramQ); 
  }
  
  private void e(Q paramQ) {
    for (l l : this.h)
      l.b(paramQ); 
  }
  
  private void c(String paramString) {
    for (l l : this.h)
      l.a(paramString); 
  }
  
  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent) {
    paramTreeSelectionEvent.getNewLeadSelectionPath();
    paramTreeSelectionEvent.getPath();
    paramTreeSelectionEvent.getOldLeadSelectionPath();
    j j1 = (j)this.j.getLastSelectedPathComponent();
    if (j1 == null)
      j1 = this.e; 
    if (j1.getParent() != null) {
      this.e = j1;
    } else {
      this.e = null;
    } 
    if (j1.a() != null) {
      this.f = j1.a();
    } else {
      this.f = null;
    } 
    c(this.f);
    a(j1);
  }
  
  public m a() {
    return this.n;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bf/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */