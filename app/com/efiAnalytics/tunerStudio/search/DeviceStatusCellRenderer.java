package com.efiAnalytics.tunerStudio.search;

import bH.D;
import bS.o;
import com.efiAnalytics.ui.eV;
import java.awt.Component;
import javax.swing.JTable;

class DeviceStatusCellRenderer extends eV {
  w(r paramr) {}
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Component component = super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    a(paramInt1, paramInt2);
    return component;
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    Component component = super.getTableCellEditorComponent(paramJTable, paramObject, paramBoolean, paramInt1, paramInt2);
    a(paramInt1, paramInt2);
    return component;
  }
  
  public String a(int paramInt1, int paramInt2) {
    String str = "";
    if (paramInt1 < this.a.b.size() && paramInt2 == 2) {
      f f = this.a.b.get(paramInt1);
      boolean bool = f.b().equals(o.a);
      if (f.c().equals("D")) {
        str = r.d();
        a(false);
      } else if (!bool && (f.c().equals("I") || f.c().equals("O"))) {
        str = r.e();
        a(true);
      } else if (r.a(this.a, f)) {
        str = r.f();
        a(true);
      } else if (System.currentTimeMillis() - f.e() > r.a) {
        str = r.c();
        a(true);
      } else if (bool || f.c().equals("A")) {
        str = r.g();
        a(!f.f().h());
      } else if (f.c().equals("U")) {
        str = r.h();
        a(false);
      } else {
        D.a("Unknown Device Status: " + f.c());
        str = r.i();
        a(false);
      } 
      if (f.f().h()) {
        str = "Busy";
        a(false);
      } else {
        a(true);
      } 
      b(str);
      a(str);
    } else {
      b(r.c());
      a(r.c());
    } 
    return str;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */