package business.buffer_factories;

import G.GInterfaceAh;
import G.Q;
import G.R;
import G.SerializableImpl;
import G.SerializableImplExceptionprintstacktrace;
import W.BeComponentRomeo;
import be.BeComponentRomeo;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
import s.SComponentGolf;

public class TreeSelectionListener extends JPanel implements TreeSelectionListener {
  public static String a = BeComponentRomeo.a;

  public static String b = BeComponentRomeo.b;

  public static String c = BeComponentRomeo.c;

  j d = new j("Controller");

  j e = null;

  Q f = null;

  ArrayList SComponentGolf = new ArrayList();

  ArrayList h = new ArrayList();

  HashMap i = new HashMap<>();

  JTree j;

  R k = null;

  private BeComponentRomeo m = new b(this);

  List l = new ArrayList();

  private m n = new m(this);

  public TreeSelectionListener() {
    setLayout(new BorderLayout());
    this.j = new JTree(this.d);
    this.j.setBorder(BorderFactory.createLoweredSoftBevelBorder());
    JScrollPane jScrollPane = new JScrollPane(this.j);
    jScrollPane.setPreferredSize(new Dimension(eJ.a(240), eJ.a(500)));
    this.j.addTreeSelectionListener(this);
    add(jScrollPane, "Center");
    this.j.addMouseListener(new c(this));
    Font font = (Font) UIManager.get("Tree.font");
    if (font != null) this.j.setRowHeight(font.getSize() + eJ.a(4));
  }

  private void a(MouseEvent paramMouseEvent) {
    if (this.e != null) {
      String str =
          (this.e.a() == null)
              ? this.e.getUserObject().toString()
              : ((j) this.e.getParent()).getUserObject().toString();
      JPopupMenu jPopupMenu = new JPopupMenu();
      jPopupMenu.add(SComponentGolf.b("Add") + " " + str).addActionListener(new d(this, str));
      Q q = this.e.a();
      if (q != null) {
        jPopupMenu.add(SComponentGolf.b("Edit") + " " + str).addActionListener(new e(this, q));
        jPopupMenu.add(SComponentGolf.b("Delete") + " " + str).addActionListener(new f(this, q));
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
    DefaultTreeModel defaultTreeModel = (DefaultTreeModel) this.j.getModel();
    defaultTreeModel.reload(j1);
    this.j.setSelectionPath(new TreePath((Object[]) j2.getPath()));
    this.j.setSelectionPath(new TreePath((Object[]) j2.getPath()));
  }

  private j b(Q paramQ) {
    return (paramQ instanceof SerializableImpl)
        ? (j) this.i.get(a)
        : ((paramQ instanceof GInterfaceAh)
            ? (j) this.i.get(b)
            : ((paramQ instanceof SerializableImplExceptionprintstacktrace)
                ? (j) this.i.get(c)
                : null));
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
      while (null.hasNext()) arrayList.add(null.next());
      Collections.sort(arrayList, new SComponentGolf(this));
      for (SerializableImpl SerializableImpl : arrayList) {
        if (this.m == null || this.m.a((Q) SerializableImpl)) {
          j j2 = new j((Q) SerializableImpl);
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
      while (null.hasNext()) arrayList.add(null.next());
      Collections.sort(arrayList, new h(this));
      for (GInterfaceAh GInterfaceAh : arrayList) {
        if (this.m == null || this.m.a((Q) GInterfaceAh))
          try {
            j j2 = new j((Q) GInterfaceAh);
            j1.add(j2);
          } catch (Exception exception) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, exception);
          }
      }
    }
    if (a(c)) {
      j j1 = new j(c);
      this.d.add(j1);
      this.i.put(c, j1);
      ArrayList<?> arrayList = new ArrayList();
      arrayList.addAll(paramR.SComponentGolf());
      Collections.sort(arrayList, new i(this));
      for (SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace :
          arrayList) {
        if (this.m == null || this.m.a((Q) SerializableImplExceptionprintstacktrace)) {
          j j2 = new j((Q) SerializableImplExceptionprintstacktrace);
          j1.add(j2);
        }
      }
    }
    DefaultTreeModel defaultTreeModel = (DefaultTreeModel) this.j.getModel();
    defaultTreeModel.reload(this.d);
    this.j.expandPath(new TreePath((Object[]) this.d.getPath()));
  }

  public boolean a(String paramString) {
    return this.l.contains(paramString);
  }

  public void b(String paramString) {
    this.l.add(paramString);
  }

  public void a(k paramk) {
    this.SComponentGolf.add(paramk);
  }

  private void a(j paramj) {
    for (k k : this.SComponentGolf) k.a(this.e);
  }

  private void c(Q paramQ) {
    for (k k : this.SComponentGolf) k.a(paramQ);
  }

  public void a(l paraml) {
    this.h.add(paraml);
  }

  private void d(Q paramQ) {
    for (l l : this.h) l.a(paramQ);
  }

  private void e(Q paramQ) {
    for (l l : this.h) l.b(paramQ);
  }

  private void c(String paramString) {
    for (l l : this.h) l.a(paramString);
  }

  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent) {
    paramTreeSelectionEvent.getNewLeadSelectionPath();
    paramTreeSelectionEvent.getPath();
    paramTreeSelectionEvent.getOldLeadSelectionPath();
    j j1 = (j) this.j.getLastSelectedPathComponent();
    if (j1 == null) j1 = this.e;
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
