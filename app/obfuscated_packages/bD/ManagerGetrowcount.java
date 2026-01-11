package bD;

import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import com.efiAnalytics.ui.eJ;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class ManagerGetrowcount extends AbstractTableModel {
  public static int a = 0;
  
  public static int b = 1;
  
  public static int c = 2;
  
  public static int d = 3;
  
  public static int e = 4;
  
  String[] f = new String[] { "", "Name", "Date", "Type", "Size" };
  
  Icon g = null;
  
  List h = new ArrayList();
  
  public void a(List paramList) {
    this.h.addAll(paramList);
    fireTableDataChanged();
  }
  
  public void a(RemoteFileDescriptor paramRemoteFileDescriptor) {
    this.h.remove(paramRemoteFileDescriptor);
  }
  
  public RemoteFileDescriptor a(int paramInt) {
    return this.h.get(paramInt);
  }
  
  public int getRowCount() {
    return this.h.size();
  }
  
  public int getColumnCount() {
    return this.f.length;
  }
  
  public String getColumnName(int paramInt) {
    return this.f[paramInt];
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    if (paramInt1 < this.h.size()) {
      RemoteFileDescriptor remoteFileDescriptor = this.h.get(paramInt1);
      switch (paramInt2) {
        case 0:
          return b(remoteFileDescriptor);
        case 1:
          return remoteFileDescriptor.getName();
        case 2:
          return new Date(remoteFileDescriptor.getLastModified());
        case 3:
          return a(remoteFileDescriptor.getName());
        case 4:
          return Long.valueOf(remoteFileDescriptor.getSize());
      } 
      return "";
    } 
    return null;
  }
  
  private String a(String paramString) {
    return (paramString == null) ? "" : (paramString.toUpperCase().endsWith(".MS3") ? "MS3 SD Log" : (paramString.toUpperCase().endsWith(".FRD") ? "Formatted Raw Data" : (paramString.toUpperCase().endsWith(".MSL") ? "MegaSquirt Log" : (paramString.toUpperCase().endsWith(".MLG") ? "MLG Data Log" : (paramString.toUpperCase().endsWith(".CSV") ? "CSV Data Log" : ((paramString.lastIndexOf(".") != -1) ? paramString.substring(paramString.lastIndexOf(".") + 1) : "Other"))))));
  }
  
  private Icon b(RemoteFileDescriptor paramRemoteFileDescriptor) {
    if (this.g == null) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("logIcon.gif"));
      image = eJ.a(image);
      this.g = new ImageIcon(image);
    } 
    return this.g;
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {}
  
  public void a() {
    this.h.clear();
    fireTableDataChanged();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */