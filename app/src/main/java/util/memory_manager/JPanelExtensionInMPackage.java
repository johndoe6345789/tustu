package m;

import am.AmInterfaceEcho;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.AmInterfaceEcho;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

public class JPanelExtensionInMPackage extends JPanel {
  private List d = new ArrayList();
  
  List a = new ArrayList();
  
  List b;
  
  String c = "<html>Click 'Select and Open' to open all Data Groups or select a subset. <br>Note: By selecting all Data Groups, the Data Rate may be lowered for <br>      higher speed Data Groups.";
  
  public JPanelExtensionInMPackage(List paramList) {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createLoweredSoftBevelBorder());
    this.b = paramList;
    add("North", new JLabel(this.c, 0));
    Font font = new Font(getFont().getFontName(), 1, getFont().getSize() + 1);
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createEmptyBorder(0, eJ.a(10), 0, eJ.a(10)));
    jPanel1.setLayout(new GridLayout(0, 1));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel("Group");
    jLabel.setPreferredSize(new Dimension(eJ.a(80), 10));
    jLabel.setFont(font);
    jPanel2.add("West", jLabel);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0));
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 0));
    jLabel = new JLabel("Channel Count");
    jLabel.setFont(font);
    jPanel4.add(jLabel);
    jLabel = new JLabel("Field Count", 0);
    jLabel.setFont(font);
    jPanel4.add(jLabel);
    jLabel = new JLabel("Data Rate", 0);
    jLabel.setFont(font);
    jPanel4.add(jLabel);
    jPanel3.add(jPanel4);
    jLabel = new JLabel("Fields", 0);
    jLabel.setFont(font);
    jPanel3.add(jLabel);
    jPanel2.add("Center", jPanel3);
    JButton jButton = new JButton("Select");
    jButton.addActionListener(new AmInterfaceEcho(this, jButton));
    jPanel2.add("East", jButton);
    jLabel.setFont(font);
    jPanel1.add(jPanel2);
    for (AmInterfaceEcho AmInterfaceEcho : paramList)
      jPanel1.add(a(AmInterfaceEcho)); 
    JScrollPane jScrollPane = new JScrollPane(jPanel1);
    add("Center", jScrollPane);
  }
  
  private void a(Component paramComponent, int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenuItem jMenuItem = jPopupMenu.add("Select All");
    jMenuItem.addActionListener(new f(this));
    jMenuItem = jPopupMenu.add("Select None");
    jMenuItem.addActionListener(new g(this));
    add(jPopupMenu);
    jPopupMenu.show(paramComponent, paramInt1, paramInt2);
  }
  
  private JPanel a(AmInterfaceEcho parame) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel("Data Group " + parame.h());
    jLabel.setPreferredSize(new Dimension(eJ.a(80), 10));
    jPanel1.add("West", jLabel);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0));
    j j = new j(this, parame);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0));
    jPanel3.add(new JLabel(Integer.toString(j.a(j)), 0));
    jPanel3.add(new JLabel(Long.toString(j.b()), 0));
    jPanel3.add(new JLabel(X.c(j.a(), 2), 0));
    jPanel2.add(jPanel3);
    AmInterfaceEcho e1 = new AmInterfaceEcho();
    for (String str : j.d)
      e1.a(str); 
    jPanel2.add((Component)e1);
    jPanel1.add("Center", jPanel2);
    JCheckBox jCheckBox = new JCheckBox("load ", true);
    jCheckBox.setActionCommand(Integer.toString(parame.h()));
    this.d.add(Integer.valueOf(parame.h()));
    this.a.add(jCheckBox);
    jCheckBox.addActionListener(new h(this));
    jPanel1.add("East", jCheckBox);
    return jPanel1;
  }
  
  public static List a(Window paramWindow, List paramList, c paramc) {
    d d1 = new d(paramList);
    i i = new i(d1, paramList, paramc);
    JDialog jDialog = bV.a(d1, paramWindow, "Data Group Selector", i, "Select and Open");
    jDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    jDialog.pack();
    if (jDialog.getHeight() > paramWindow.getHeight() * 0.7D) {
      jDialog.setSize(jDialog.getWidth() + eJ.a(25), (int)(paramWindow.getHeight() * 0.7D));
    } else {
      jDialog.setSize(jDialog.getWidth() + eJ.a(25), jDialog.getHeight());
    } 
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
    return paramList;
  }
  
  public List a() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */