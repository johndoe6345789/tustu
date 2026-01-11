package com.efiAnalytics.tunerStudio.search;

import G.R;
import G.S;
import G.T;
import G.l;
import aE.a;
import aP.f;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.eX;
import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import s.g;

public class DeviceSearchTable extends JTable implements S, eX {
  public static int a = 4000;
  
  List b = new CopyOnWriteArrayList();
  
  A c = new A(this);
  
  r d = this;
  
  w e = new w(this);
  
  w f = new w(this);
  
  private int i = eJ.a(50);
  
  private static final String j = g.b("Disabled Device");
  
  private static final String k = g.b("Activate Device");
  
  private static final String l = g.b("Connect");
  
  private static final String m = g.b("Disconnect");
  
  private static final String n = g.b("Checking Status");
  
  private static final String o = g.b("Error");
  
  private static final String p = g.b("Work offline");
  
  x g = new x(this);
  
  int h = 0;
  
  public r() {
    setModel(this.c);
    setSelectionMode(0);
    setRowSelectionAllowed(true);
    getColumnModel().getColumn(0).setMinWidth(eJ.a(50) + getFont().getSize());
    getColumnModel().getColumn(0).setMaxWidth(eJ.a(50) + getFont().getSize());
    getColumnModel().getColumn(2).setMinWidth(eJ.a(150));
    getColumnModel().getColumn(2).setMaxWidth(eJ.a(150));
    setRowHeight(getFont().getSize() + this.i);
    DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer();
    defaultTableCellRenderer.setHorizontalAlignment(0);
    getColumnModel().getColumn(1).setCellRenderer(defaultTableCellRenderer);
    this.e.a(this);
    getColumnModel().getColumn(2).setCellRenderer((TableCellRenderer)this.f);
    getColumnModel().getColumn(2).setCellEditor((TableCellEditor)this.e);
    T.a().a(this);
    putClientProperty("terminateEditOnFocusLost", Boolean.valueOf(true));
    addMouseListener(new s(this));
  }
  
  private JPopupMenu j() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenuItem jMenuItem = new JMenuItem(g.b("Transfer / Edit Device Activation"));
    jPopupMenu.add(jMenuItem);
    jMenuItem.addActionListener(new t(this));
    return jPopupMenu;
  }
  
  public TableCellRenderer getCellRenderer(int paramInt1, int paramInt2) {
    TableCellRenderer tableCellRenderer = super.getCellRenderer(paramInt1, paramInt2);
    if (paramInt2 == 0 && this.b.size() > paramInt1) {
      f f = this.b.get(paramInt1);
      int i = getSelectedRow();
      Component component = tableCellRenderer.getTableCellRendererComponent(this, this.c.getValueAt(paramInt1, paramInt2), (i == paramInt1), hasFocus(), paramInt1, paramInt2);
      if (System.currentTimeMillis() - f.e() > a) {
        component.setEnabled(false);
      } else {
        component.setEnabled(true);
      } 
    } 
    return tableCellRenderer;
  }
  
  public TableCellEditor getCellEditor(int paramInt1, int paramInt2) {
    TableCellEditor tableCellEditor = super.getCellEditor(paramInt1, paramInt2);
    if (paramInt2 == 2) {
      int i = getSelectedRow();
      Component component = tableCellEditor.getTableCellEditorComponent(this, this.c.getValueAt(paramInt1, paramInt2), (i == paramInt1), paramInt1, paramInt2);
    } 
    return tableCellEditor;
  }
  
  public void a(f paramf) {
    if (!f(paramf)) {
      int i = getSelectionModel().getMinSelectionIndex();
      this.b.add(paramf);
      this.c.fireTableDataChanged();
      if (i >= 0)
        getSelectionModel().setSelectionInterval(i, i); 
    } 
  }
  
  private boolean f(f paramf) {
    try {
      for (f f1 : this.b) {
        if (f1.a().equals(paramf.a()))
          return true; 
      } 
    } catch (Exception exception) {
      D.a("problem comparing devices. DiscoveredDevice: " + paramf);
    } 
    return false;
  }
  
  public void b(f paramf) {
    int i = getSelectionModel().getMinSelectionIndex();
    if (!g(paramf)) {
      this.b.add(paramf);
      this.c.fireTableDataChanged();
    } 
    if (i >= 0)
      getSelectionModel().setSelectionInterval(i, i); 
  }
  
  private boolean g(f paramf) {
    boolean bool = false;
    for (byte b = 0; b < this.b.size(); b++) {
      f f1 = this.b.get(b);
      if ((paramf.f().k().equals(f1.f().k()) && X.c(paramf.a()) && X.c(f1.a())) || (paramf.a() != null && paramf.a().equals(f1.a()))) {
        f1.a(paramf.f());
        if ((f1.g() == null && paramf.g() != null) || (f1.g() != null && paramf.g() != null && f1.g().c().equals(paramf.g().c())))
          f1.a(paramf.g()); 
        f1.a(paramf.e());
        if (f1.a() == null || f1.a().isEmpty())
          f1.a(paramf.a()); 
        if (f1.h() == null || f1.h().a() == null || f1.h().a().isEmpty())
          f1.a(paramf.h()); 
        bool = true;
      } 
    } 
    if (bool)
      a(); 
    return bool;
  }
  
  public void c(f paramf) {
    for (byte b = 0; b < this.b.size(); b++) {
      f f1 = this.b.get(b);
      if (paramf.f().c().equals(f1.f().c()) && paramf.f().g() == f1.f().g()) {
        this.b.remove(b);
        a();
        return;
      } 
    } 
  }
  
  public void a(int paramInt1, int paramInt2) {
    String str = this.e.a();
    f f = this.b.get(paramInt1);
    if (str.equals(p)) {
      e(f);
    } else if (str.equals(k)) {
      d(f);
    } else if (str.equals(j)) {
      String str1 = g.b("Communicating with this device is currently disabled. Contact EFI Analytics for further information.");
      str1 = str1 + "\nsupport@efianalytics.com";
      bV.d(str1, this);
    } else if (str.equals(m)) {
      T.a().c().C().c();
    } else if (str.equals(l)) {
      if (j(f)) {
        try {
          T.a().c().C().d();
        } catch (l l) {
          Logger.getLogger(r.class.getName()).log(Level.SEVERE, "Failed to go online", (Throwable)l);
        } 
        f.a().R();
      } else {
        a(f, true);
      } 
    } else {
      D.c("Unknown Action: " + str);
    } 
    removeEditor();
    a();
  }
  
  public void a(f paramf, boolean paramBoolean) {
    f.a().a(paramf, paramBoolean);
  }
  
  public void d(f paramf) {
    f f1 = f.a().a(paramf);
    b(paramf);
    a();
    b();
  }
  
  public void e(f paramf) {
    if (paramf == null || j(paramf)) {
      f.a().R();
    } else {
      a(paramf, true);
    } 
  }
  
  protected void a() {
    boolean bool = false;
    ArrayList<f> arrayList1 = new ArrayList();
    ArrayList<f> arrayList2 = new ArrayList();
    for (f f : this.b) {
      if (System.currentTimeMillis() - f.e() > a) {
        arrayList2.add(f);
        continue;
      } 
      if (arrayList2.size() > 0)
        bool = true; 
      arrayList1.add(f);
    } 
    if (bool || this.h != arrayList1.size()) {
      this.b.clear();
      this.b.addAll(arrayList1);
      this.b.addAll(arrayList2);
      u u = new u(this);
      SwingUtilities.invokeLater(u);
    } 
    this.h = arrayList1.size();
  }
  
  public void b() {
    v v = new v(this);
    SwingUtilities.invokeLater(v);
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    paramR.C().b(this.g);
  }
  
  public void c(R paramR) {
    paramR.C().a(this.g);
  }
  
  private boolean h(f paramf) {
    R r1 = T.a().c();
    return (r1 == null) ? false : ((r1.C() instanceof bQ.l && r1.C().q() && i(paramf)));
  }
  
  private boolean i(f paramf) {
    return (a.A() != null && paramf.h() != null && paramf.h().b() != null && paramf.h().b().equals(new File(a.A().t())));
  }
  
  private boolean j(f paramf) {
    R r1 = T.a().c();
    return (r1 == null) ? false : (i(paramf));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */