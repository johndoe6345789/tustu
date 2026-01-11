package com.efiAnalytics.tunerStudio.search;

import B.i;
import D.ExceptionInVPackage;
import V.ExceptionInVPackage;
import bS.BsInterfaceOscar;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import r.ExceptionInVPackage;

class DeviceSearchTableModel extends DefaultTableModel {
  Map ExceptionInVPackage = new HashMap<>();
  
  A(r paramr) {}
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return (paramInt2 == 2);
  }
  
  public int getColumnCount() {
    return 3;
  }
  
  public int getRowCount() {
    return this.b.b.isEmpty() ? 1 : this.b.b.size();
  }
  
  public Class getColumnClass(int paramInt) {
    return (Class)((paramInt == 0) ? ImageIcon.class : ((paramInt == 2) ? w.class : Object.class));
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt1 < this.b.b.size()) {
      f f = this.b.b.get(paramInt1);
      if (paramInt2 == 0)
        try {
          ImageIcon imageIcon = (ImageIcon)this.ExceptionInVPackage.get(f.b());
          if (imageIcon == null) {
            Image image;
            if (f.b().contains("Gen 4") || f.b().contains("Gen4")) {
              image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.af, this.b.d, 50);
            } else {
              image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.ag, this.b.d, 50);
            } 
            imageIcon = new ImageIcon(image);
            this.ExceptionInVPackage.put(f.b(), imageIcon);
          } 
          return imageIcon;
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(r.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
          return f.b();
        }  
      if (paramInt2 == 1) {
        null = "<html><center>";
        int i = eJ.ExceptionInVPackage(5);
        if (f.b().equals(BsInterfaceOscar.ExceptionInVPackage)) {
          i i1 = f.f();
          if (f.f().j() != null && !i1.j().isEmpty()) {
            null = null + "<font size=" + i + ">" + f.b() + " - " + f.f().j() + "</font><br> " + f.f().f() + "<br>Host: " + f.f().c();
          } else if (f.ExceptionInVPackage() != null && !f.ExceptionInVPackage().isEmpty()) {
            null = null + "<font size=" + i + ">" + f.b() + ", Serial# " + f.ExceptionInVPackage() + "</font><br>Host: " + f.f().c();
          } else if (f.f().f() != null && !f.f().f().isEmpty()) {
            null = null + "<font size=" + i + ">" + f.b() + " Host: " + f.f().c() + "</font><br>" + f.f().f();
          } else if (f.f().b() != null && !f.f().b().isEmpty()) {
            null = null + "<font size=" + i + ">" + f.f().b() + ", " + f.f().f() + "</font><br>Host: " + f.f().c();
          } else {
            null = null + "<font size=" + i + ">" + f.b() + ", Serial# " + f.ExceptionInVPackage() + "</font><br>Host: " + f.f().c();
          } 
        } else if (f.ExceptionInVPackage() != null && !f.ExceptionInVPackage().isEmpty()) {
          null = null + "<font size=" + i + ">" + f.b() + ", Serial# " + f.ExceptionInVPackage() + "</font><br>Host: " + f.f().c();
        } else if (f.f().j() != null && !f.f().j().isEmpty()) {
          null = null + "<font size=" + i + ">" + f.b() + " - " + f.f().j() + "</font><br> " + f.f().f() + "<br>Host: " + f.f().c();
        } else if (f.f().f() != null && !f.f().f().isEmpty()) {
          null = null + "<font size=" + i + ">" + f.b() + " Host: " + f.f().c() + "</font><br>" + f.f().f();
        } else if (f.f().b() != null && !f.f().b().isEmpty()) {
          null = null + "<font size=" + i + ">" + f.f().b() + ", " + f.f().f() + "</font><br>Host: " + f.f().c();
        } else {
          null = null + "<font size=" + i + ">" + f.b() + ", Serial# " + f.ExceptionInVPackage() + "</font><br>Host: " + f.f().c();
        } 
        ExceptionInVPackage ExceptionInVPackage = f.g();
        if (ExceptionInVPackage != null && ExceptionInVPackage.e() != null && !ExceptionInVPackage.e().isEmpty())
          null = null + " Registered to: " + ExceptionInVPackage.e() + " " + ExceptionInVPackage.f(); 
        if (f.f().h()) {
          null = null + "<br><font color=red>Currently Busy. To connect, another session must end.</font>";
        } else if (f.h() != null) {
          null = null + "<br>Local Project: " + f.h().ExceptionInVPackage();
        } 
        return null + "</center></html>";
      } 
      return (paramInt2 == 2) ? this.b.e.b() : "Huh?";
    } 
    if (paramInt2 == 0)
      try {
        ImageIcon imageIcon = (ImageIcon)this.ExceptionInVPackage.get("Searching");
        if (imageIcon == null) {
          Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.u, this.b.d, r.b(this.b));
          imageIcon = new ImageIcon(image);
          this.ExceptionInVPackage.put("Searching", imageIcon);
        } 
        return imageIcon;
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(r.class.getName()).log(Level.WARNING, "Falied to load searching ICON", (Throwable)ExceptionInVPackage);
        return "";
      }  
    if (paramInt2 == 1)
      return "<html><center><font size=+1>No " + ExceptionInVPackage.f + " found.</font><br>Connect to the same network as your " + ExceptionInVPackage.f + " and power it on, or select \"Work offline\"</center></html>"; 
    if (paramInt2 == 2) {
      String str = r.c();
      this.b.e.b(str);
      this.b.e.ExceptionInVPackage(str);
      this.b.f.b(str);
      this.b.f.ExceptionInVPackage(str);
      this.b.e.ExceptionInVPackage(true);
      return "";
    } 
    return "";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */