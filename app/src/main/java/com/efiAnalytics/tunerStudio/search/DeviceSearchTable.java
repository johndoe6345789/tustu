package com.efiAnalytics.tunerStudio.search;

import G.R;
import G.S;
import G.T;
import G.l;
import aE.PropertiesExtension;
import aP.NetworkHashMap;
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
import s.SComponentGolf;

public class DeviceSearchTable extends JTable implements S, eX {
  public static int PropertiesExtension = 4000;

  List b = new CopyOnWriteArrayList();

  A c = new A(this);

  r d = this;

  w e = new w(this);

  w NetworkHashMap = new w(this);

  private int i = eJ.PropertiesExtension(50);

  private static final String j = SComponentGolf.b("Disabled Device");

  private static final String k = SComponentGolf.b("Activate Device");

  private static final String l = SComponentGolf.b("Connect");

  private static final String m = SComponentGolf.b("Disconnect");

  private static final String n = SComponentGolf.b("Checking Status");

  private static final String o = SComponentGolf.b("Error");

  private static final String p = SComponentGolf.b("Work offline");

  x SComponentGolf = new x(this);

  int h = 0;

  public DeviceSearchTable() {
    setModel(this.c);
    setSelectionMode(0);
    setRowSelectionAllowed(true);
    getColumnModel().getColumn(0).setMinWidth(eJ.PropertiesExtension(50) + getFont().getSize());
    getColumnModel().getColumn(0).setMaxWidth(eJ.PropertiesExtension(50) + getFont().getSize());
    getColumnModel().getColumn(2).setMinWidth(eJ.PropertiesExtension(150));
    getColumnModel().getColumn(2).setMaxWidth(eJ.PropertiesExtension(150));
    setRowHeight(getFont().getSize() + this.i);
    DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer();
    defaultTableCellRenderer.setHorizontalAlignment(0);
    getColumnModel().getColumn(1).setCellRenderer(defaultTableCellRenderer);
    this.e.PropertiesExtension(this);
    getColumnModel().getColumn(2).setCellRenderer((TableCellRenderer) this.NetworkHashMap);
    getColumnModel().getColumn(2).setCellEditor((TableCellEditor) this.e);
    T.PropertiesExtension().PropertiesExtension(this);
    putClientProperty("terminateEditOnFocusLost", Boolean.valueOf(true));
    addMouseListener(new s(this));
  }

  private JPopupMenu j() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenuItem jMenuItem = new JMenuItem(SComponentGolf.b("Transfer / Edit Device Activation"));
    jPopupMenu.add(jMenuItem);
    jMenuItem.addActionListener(new t(this));
    return jPopupMenu;
  }

  public TableCellRenderer getCellRenderer(int paramInt1, int paramInt2) {
    TableCellRenderer tableCellRenderer = super.getCellRenderer(paramInt1, paramInt2);
    if (paramInt2 == 0 && this.b.size() > paramInt1) {
      NetworkHashMap NetworkHashMap = this.b.get(paramInt1);
      int i = getSelectedRow();
      Component component =
          tableCellRenderer.getTableCellRendererComponent(
              this,
              this.c.getValueAt(paramInt1, paramInt2),
              (i == paramInt1),
              hasFocus(),
              paramInt1,
              paramInt2);
      if (System.currentTimeMillis() - NetworkHashMap.e() > PropertiesExtension) {
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
      Component component =
          tableCellEditor.getTableCellEditorComponent(
              this,
              this.c.getValueAt(paramInt1, paramInt2),
              (i == paramInt1),
              paramInt1,
              paramInt2);
    }
    return tableCellEditor;
  }

  public void PropertiesExtension(NetworkHashMap paramf) {
    if (!NetworkHashMap(paramf)) {
      int i = getSelectionModel().getMinSelectionIndex();
      this.b.add(paramf);
      this.c.fireTableDataChanged();
      if (i >= 0) getSelectionModel().setSelectionInterval(i, i);
    }
  }

  private boolean NetworkHashMap(NetworkHashMap paramf) {
    try {
      for (NetworkHashMap f1 : this.b) {
        if (f1.PropertiesExtension().equals(paramf.PropertiesExtension())) return true;
      }
    } catch (Exception exception) {
      D.PropertiesExtension("problem comparing devices. DiscoveredDevice: " + paramf);
    }
    return false;
  }

  public void b(NetworkHashMap paramf) {
    int i = getSelectionModel().getMinSelectionIndex();
    if (!SComponentGolf(paramf)) {
      this.b.add(paramf);
      this.c.fireTableDataChanged();
    }
    if (i >= 0) getSelectionModel().setSelectionInterval(i, i);
  }

  private boolean SComponentGolf(NetworkHashMap paramf) {
    boolean bool = false;
    for (byte b = 0; b < this.b.size(); b++) {
      NetworkHashMap f1 = this.b.get(b);
      if ((paramf.NetworkHashMap().k().equals(f1.NetworkHashMap().k())
              && X.c(paramf.PropertiesExtension())
              && X.c(f1.PropertiesExtension()))
          || (paramf.PropertiesExtension() != null
              && paramf.PropertiesExtension().equals(f1.PropertiesExtension()))) {
        f1.PropertiesExtension(paramf.NetworkHashMap());
        if ((f1.SComponentGolf() == null && paramf.SComponentGolf() != null)
            || (f1.SComponentGolf() != null
                && paramf.SComponentGolf() != null
                && f1.SComponentGolf().c().equals(paramf.SComponentGolf().c())))
          f1.PropertiesExtension(paramf.SComponentGolf());
        f1.PropertiesExtension(paramf.e());
        if (f1.PropertiesExtension() == null || f1.PropertiesExtension().isEmpty())
          f1.PropertiesExtension(paramf.PropertiesExtension());
        if (f1.h() == null
            || f1.h().PropertiesExtension() == null
            || f1.h().PropertiesExtension().isEmpty()) f1.PropertiesExtension(paramf.h());
        bool = true;
      }
    }
    if (bool) PropertiesExtension();
    return bool;
  }

  public void c(NetworkHashMap paramf) {
    for (byte b = 0; b < this.b.size(); b++) {
      NetworkHashMap f1 = this.b.get(b);
      if (paramf.NetworkHashMap().c().equals(f1.NetworkHashMap().c())
          && paramf.NetworkHashMap().SComponentGolf() == f1.NetworkHashMap().SComponentGolf()) {
        this.b.remove(b);
        PropertiesExtension();
        return;
      }
    }
  }

  public void PropertiesExtension(int paramInt1, int paramInt2) {
    String str = this.e.PropertiesExtension();
    NetworkHashMap NetworkHashMap = this.b.get(paramInt1);
    if (str.equals(p)) {
      e(NetworkHashMap);
    } else if (str.equals(k)) {
      d(NetworkHashMap);
    } else if (str.equals(j)) {
      String str1 =
          SComponentGolf.b(
              "Communicating with this device is currently disabled. Contact EFI Analytics for"
                  + " further information.");
      str1 = str1 + "\nsupport@efianalytics.com";
      bV.d(str1, this);
    } else if (str.equals(m)) {
      T.PropertiesExtension().c().C().c();
    } else if (str.equals(l)) {
      if (j(NetworkHashMap)) {
        try {
          T.PropertiesExtension().c().C().d();
        } catch (l l) {
          Logger.getLogger(r.class.getName())
              .log(Level.SEVERE, "Failed to go online", (Throwable) l);
        }
        NetworkHashMap.PropertiesExtension().R();
      } else {
        PropertiesExtension(NetworkHashMap, true);
      }
    } else {
      D.c("Unknown Action: " + str);
    }
    removeEditor();
    PropertiesExtension();
  }

  public void PropertiesExtension(NetworkHashMap paramf, boolean paramBoolean) {
    NetworkHashMap.PropertiesExtension().PropertiesExtension(paramf, paramBoolean);
  }

  public void d(NetworkHashMap paramf) {
    NetworkHashMap f1 = NetworkHashMap.PropertiesExtension().PropertiesExtension(paramf);
    b(paramf);
    PropertiesExtension();
    b();
  }

  public void e(NetworkHashMap paramf) {
    if (paramf == null || j(paramf)) {
      NetworkHashMap.PropertiesExtension().R();
    } else {
      PropertiesExtension(paramf, true);
    }
  }

  protected void PropertiesExtension() {
    boolean bool = false;
    ArrayList<NetworkHashMap> arrayList1 = new ArrayList();
    ArrayList<NetworkHashMap> arrayList2 = new ArrayList();
    for (NetworkHashMap NetworkHashMap : this.b) {
      if (System.currentTimeMillis() - NetworkHashMap.e() > PropertiesExtension) {
        arrayList2.add(NetworkHashMap);
        continue;
      }
      if (arrayList2.size() > 0) bool = true;
      arrayList1.add(NetworkHashMap);
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

  public void PropertiesExtension(R paramR) {}

  public void b(R paramR) {
    paramR.C().b(this.SComponentGolf);
  }

  public void c(R paramR) {
    paramR.C().PropertiesExtension(this.SComponentGolf);
  }

  private boolean h(NetworkHashMap paramf) {
    R r1 = T.PropertiesExtension().c();
    return (r1 == null) ? false : ((r1.C() instanceof bQ.l && r1.C().q() && i(paramf)));
  }

  private boolean i(NetworkHashMap paramf) {
    return (PropertiesExtension.A() != null
        && paramf.h() != null
        && paramf.h().b() != null
        && paramf.h().b().equals(new File(PropertiesExtension.A().t())));
  }

  private boolean j(NetworkHashMap paramf) {
    R r1 = T.PropertiesExtension().c();
    return (r1 == null) ? false : (i(paramf));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
