package bD;

import bH.D;
import bH.ab;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRootPane;
import javax.swing.JToolBar;

public class r extends JPanel implements a, bc {
  private RemoteFileAccess j = null;
  
  G a = null;
  
  C b = null;
  
  JToolBar c = null;
  
  ab d = null;
  
  h e = null;
  
  dO f = new dO();
  
  b g = new b(this);
  
  private g k = null;
  
  D h = new D(this);
  
  boolean i = false;
  
  public r(RemoteFileAccess paramRemoteFileAccess, ab paramab) {
    this.j = paramRemoteFileAccess;
    this.d = paramab;
    setLayout(new BorderLayout());
    paramRemoteFileAccess.addFileDownloadProgressListener(this.g);
    this.c = f();
    add("North", this.c);
    this.a = new G();
    add("Center", this.a);
    this.a.b().addMouseListener(new E(this));
    this.e = new h(paramab);
    add("South", this.e);
    s s = new s(this, paramRemoteFileAccess);
    String str = (paramab == null) ? "Cancel" : paramab.a("Cancel");
    this.f.a(str, s);
    paramRemoteFileAccess.addRefreshNeededListener(this.h);
    e();
  }
  
  private JToolBar f() {
    int i = eJ.a(30);
    this.c = new B(this, "Remote Files");
    this.c.setFloatable(false);
    this.c.setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 0, 3, 3));
    this.c.addSeparator();
    this.c.add(jPanel, "East");
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("download24.png"));
    image = eJ.a(image);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText(this.d.a("Download Selected File(s)"));
    jButton.addActionListener(new t(this));
    jButton.setPreferredSize(new Dimension(i, i));
    jPanel.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("reload24.png"));
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText(this.d.a("Refresh File List"));
    jButton.addActionListener(new u(this));
    jButton.setPreferredSize(new Dimension(i, i));
    jPanel.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("delete24.png"));
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    jButton = new JButton(null, imageIcon);
    jButton.setFocusable(false);
    jButton.setToolTipText(this.d.a("Delete Selected File(s)"));
    jButton.addActionListener(new v(this));
    jButton.setPreferredSize(new Dimension(i, i));
    jPanel.add(jButton);
    return this.c;
  }
  
  public void a(boolean paramBoolean) {
    this.a.a(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
  }
  
  public void a() {
    JRootPane jRootPane = getRootPane();
    if (!(jRootPane.getGlassPane() instanceof dO)) {
      this.f.b(true);
      jRootPane.setGlassPane((Component)this.f);
      Component component = jRootPane.getGlassPane();
      component.setVisible(true);
    } else {
      this.f = (dO)jRootPane.getGlassPane();
    } 
    this.f.a("Preparing Download....");
    this.f.setVisible(true);
  }
  
  public void d() {
    this.f.setVisible(false);
  }
  
  private void a(int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    jPopupMenu.add(this.d.a("Refresh")).addActionListener(new w(this));
    if (this.a.a().size() > 0) {
      jPopupMenu.add(this.d.a("Delete Selected Files")).addActionListener(new x(this));
      jPopupMenu.add(this.d.a("Download Selected Files")).addActionListener(new y(this));
    } 
    jPopupMenu.show(this.a.b(), paramInt1, paramInt2);
  }
  
  private void g() {
    List list = this.a.a();
    if (list.size() > 0) {
      setEnabled(false);
      A a1 = new A(this, list);
      a1.start();
    } 
  }
  
  private void a(List paramList) {
    this.i = false;
    Iterator<RemoteFileDescriptor> iterator = paramList.iterator();
    while (iterator.hasNext())
      this.g.a(iterator.next()); 
    ArrayList<String> arrayList = new ArrayList();
    this.a.d();
    for (RemoteFileDescriptor remoteFileDescriptor : paramList) {
      try {
        this.j.readRemoteFile(this.j.getDownloadDirectory(), remoteFileDescriptor);
      } catch (RemoteAccessException remoteAccessException) {
        String str = "Error downloading " + remoteFileDescriptor.getName() + "\n" + remoteAccessException.getMessage();
        if (!this.i && !arrayList.contains(str)) {
          D.a(str, (Exception)remoteAccessException, this);
          arrayList.add(str);
        } 
        if (remoteAccessException.isTerminalToBatch()) {
          d();
          break;
        } 
      } 
    } 
    arrayList.clear();
  }
  
  private void h() {
    a();
    b().a(this.d.a("Retrieving File List") + "...");
    List<RemoteFileDescriptor> list = this.a.a();
    String str = this.d.a("Are you sure you want to delete the following files?");
    for (byte b1 = 0; b1 < list.size(); b1++) {
      if (b1 < 4 || list.size() == 5) {
        str = str + "\n - " + ((RemoteFileDescriptor)list.get(b1)).getName();
      } else {
        str = str + "\n - (" + (list.size() - 4) + " More...)";
        break;
      } 
    } 
    if (!list.isEmpty() && bV.a(str, this, true)) {
      setEnabled(false);
      z z = new z(this, list);
      z.start();
    } else {
      d();
    } 
  }
  
  private void b(List paramList) {
    double d = paramList.size();
    byte b1 = 0;
    try {
      Iterator<RemoteFileDescriptor> iterator = paramList.iterator();
      while (iterator.hasNext()) {
        try {
          RemoteFileDescriptor remoteFileDescriptor = iterator.next();
          b().a(this.d.a("Deleting file") + ": " + remoteFileDescriptor.getName());
          b().a(b1++ / d);
          this.j.deleteFile(remoteFileDescriptor);
          ((F)this.a.a.getModel()).a(remoteFileDescriptor);
        } catch (RemoteAccessException remoteAccessException) {
          D.a(remoteAccessException.getMessage(), (Exception)remoteAccessException, this);
          if (remoteAccessException.isTerminalToBatch())
            break; 
        } 
      } 
    } finally {
      d();
    } 
  }
  
  public void e() {
    if (this.b == null || !this.b.isAlive()) {
      this.b = new C(this);
      this.b.start();
      D.c("Refresh File List called");
    } 
  }
  
  public void close() {
    this.j.removeFileDownloadProgressListener(this.g);
    this.j.removeRefreshNeededListener(this.h);
    this.j.cancelReadFile();
  }
  
  public g c() {
    return this.k;
  }
  
  public void a(g paramg) {
    this.k = paramg;
  }
  
  public dO b() {
    return this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */