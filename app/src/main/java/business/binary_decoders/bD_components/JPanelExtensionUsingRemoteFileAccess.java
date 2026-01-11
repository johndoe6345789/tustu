package business.binary_decoders.bD_components;

import bH.D;
import bH.ab;
import com.efiAnalytics.remotefileaccess.DirectoryFiles;
import com.efiAnalytics.remotefileaccess.DirectoryInformation;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dO;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;

public class JPanelExtensionUsingRemoteFileAccess extends JPanel implements a, bc {
  private RemoteFileAccess h = null;
  
  p a = null;
  
  ab b = null;
  
  h c = null;
  
  dO d = new dO();
  
  b e = new b(this);
  
  private g i = null;
  
  q f = new q(this);
  
  List g = null;
  
  public JPanelExtensionUsingRemoteFileAccess(RemoteFileAccess paramRemoteFileAccess, ab paramab) {
    this.h = paramRemoteFileAccess;
    this.b = paramab;
    setLayout(new BorderLayout());
    paramRemoteFileAccess.addFileDownloadProgressListener(this.e);
    JPanel jPanel1 = f();
    add("North", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("reload24.png"));
    ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(20, 20, 4));
    JLabel jLabel = new JLabel("");
    jLabel.setIcon(imageIcon);
    jLabel.setFocusable(false);
    jLabel.setToolTipText(a("Refresh SD File Information"));
    jLabel.addMouseListener(new j(this));
    jLabel.setPreferredSize(new Dimension(22, 22));
    jLabel.setFocusable(false);
    jPanel2.add("East", jLabel);
    this.c = new h(paramab);
    jPanel2.add("Center", this.c);
    add("South", jPanel2);
    paramRemoteFileAccess.addRefreshNeededListener(this.f);
    e();
  }
  
  private JPanel f() {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout(1));
    JPanel jPanel2 = new JPanel();
    jPanel2.setBorder(BorderFactory.createTitledBorder(a("SD Card File Management")));
    jPanel2.setLayout(new GridLayout(0, 1, 3, 3));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("download24.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(a("Download SD Files"), imageIcon);
    jButton.setFocusable(false);
    jButton.setHorizontalAlignment(2);
    jButton.setToolTipText(a("Download All Files"));
    jButton.addActionListener(new k(this));
    jPanel2.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("delete24.png"));
    imageIcon = new ImageIcon(image);
    jButton = new JButton(a("Delete SD Files"), imageIcon);
    jButton.setFocusable(false);
    jButton.setHorizontalAlignment(2);
    jButton.setToolTipText(a("Delete SD Files"));
    jButton.addActionListener(new l(this));
    jPanel2.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("upgrade24.png"));
    imageIcon = new ImageIcon(image);
    jButton = new JButton(a("Delete SD Files"), imageIcon);
    jButton.setFocusable(false);
    jButton.setHorizontalAlignment(2);
    jButton.setToolTipText(a("Upgrade, SD Browsing"));
    jButton.addActionListener(new m(this));
    jPanel2.add(jButton);
    jPanel1.add(jPanel2);
    return jPanel1;
  }
  
  private String a(String paramString) {
    return (this.b == null) ? paramString : this.b.a(paramString);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
  }
  
  public void a() {
    JRootPane jRootPane = getRootPane();
    if (!(jRootPane.getGlassPane() instanceof dO)) {
      this.d.b(true);
      jRootPane.setGlassPane((Component)this.d);
      Component component = jRootPane.getGlassPane();
      component.setVisible(true);
    } else {
      this.d = (dO)jRootPane.getGlassPane();
    } 
    this.d.a(a("Preparing Download") + "....");
    this.d.setVisible(true);
  }
  
  public void d() {
    this.d.setVisible(false);
  }
  
  public dO b() {
    return this.d;
  }
  
  private void g() {
    a();
    o o = new o(this);
    o.start();
  }
  
  private void h() {
    List<RemoteFileDescriptor> list = null;
    try {
      b().a(a("Retrieving File List") + "...");
      list = k();
      String str = a("Are you sure you want to download the following files?") + "\n" + a("File Count") + ": " + list.size() + "\n" + a("Total Size") + ": " + this.c.a() + "\n";
      for (byte b1 = 0; b1 < list.size(); b1++) {
        if (b1 < 4 || list.size() == 5) {
          str = str + "\n - " + ((RemoteFileDescriptor)list.get(b1)).getName();
        } else {
          str = str + "\n - (" + (list.size() - 4) + " More...)";
          break;
        } 
      } 
      if (list.isEmpty()) {
        bV.d(a("No Files Found on SD card."), this);
        d();
        return;
      } 
      if (!bV.a(str, this, true)) {
        d();
        return;
      } 
    } catch (RemoteAccessException remoteAccessException) {
      bV.d(a(remoteAccessException.getMessage()), this.c);
      d();
    } 
    Iterator<RemoteFileDescriptor> iterator = list.iterator();
    while (iterator.hasNext())
      this.e.a(iterator.next()); 
    ArrayList<String> arrayList = new ArrayList();
    for (RemoteFileDescriptor remoteFileDescriptor : list) {
      try {
        this.h.readRemoteFile(this.h.getDownloadDirectory(), remoteFileDescriptor);
      } catch (RemoteAccessException remoteAccessException) {
        String str = a("Error downloading file") + ": " + remoteFileDescriptor.getName() + "\n" + remoteAccessException.getMessage();
        if (!arrayList.contains(str)) {
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
  
  private void i() {
    a();
    b().a(a("Retrieving File List") + "...");
    n n = new n(this);
    n.start();
  }
  
  private void j() {
    List<RemoteFileDescriptor> list = null;
    try {
      list = k();
      String str = a("Are you sure you want to delete the following files?");
      for (byte b2 = 0; b2 < list.size(); b2++) {
        if (b2 < 4 || list.size() == 5) {
          str = str + "\n - " + ((RemoteFileDescriptor)list.get(b2)).getName();
        } else {
          str = str + "\n - (" + (list.size() - 4) + " More...)";
          break;
        } 
      } 
      if (list.isEmpty()) {
        bV.d(a("No Files Found on SD card."), this);
        d();
        return;
      } 
      if (!bV.a(str, this, true)) {
        d();
        return;
      } 
    } catch (RemoteAccessException remoteAccessException) {
      d();
    } 
    double d = list.size();
    byte b1 = 0;
    try {
      Iterator<RemoteFileDescriptor> iterator = list.iterator();
      while (iterator.hasNext()) {
        try {
          RemoteFileDescriptor remoteFileDescriptor = iterator.next();
          b().a(a("Deleting file") + ": " + remoteFileDescriptor.getName());
          b().a(b1++ / d);
          this.h.deleteFile(remoteFileDescriptor);
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
  
  public static void a(JComponent paramJComponent) {
    RootPaneContainer rootPaneContainer = (RootPaneContainer)paramJComponent.getTopLevelAncestor();
    if (rootPaneContainer != null) {
      rootPaneContainer.getGlassPane().setCursor(Cursor.getPredefinedCursor(3));
      rootPaneContainer.getGlassPane().setVisible(true);
    } 
  }
  
  public static void b(JComponent paramJComponent) {
    RootPaneContainer rootPaneContainer = (RootPaneContainer)paramJComponent.getTopLevelAncestor();
    if (rootPaneContainer != null) {
      rootPaneContainer.getGlassPane().setCursor(Cursor.getPredefinedCursor(0));
      rootPaneContainer.getGlassPane().setVisible(false);
    } 
  }
  
  public void e() {
    if (this.a == null || !this.a.isAlive()) {
      a(this);
      this.a = new p(this);
      this.a.start();
      D.c("Refresh File List called");
    } 
  }
  
  public void close() {
    this.h.removeFileDownloadProgressListener(this.e);
    this.h.addRefreshNeededListener(this.f);
  }
  
  public g c() {
    return this.i;
  }
  
  private List k() {
    DirectoryFiles directoryFiles = this.h.getFilesIn(null);
    DirectoryInformation directoryInformation = directoryFiles.getDirectoryInformation();
    this.c.a(directoryInformation.getFileCount());
    this.c.b(directoryInformation.getUsedBytes());
    this.c.a(directoryInformation.getTotalBytes());
    return directoryFiles.getFiles();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */