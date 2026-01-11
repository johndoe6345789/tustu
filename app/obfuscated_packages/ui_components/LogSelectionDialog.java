package ao;

import V.ExceptionInVPackage;
import bH.J;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class bE extends JDialog {
  JLabel ExceptionInVPackage = new JLabel("", 0);
  
  String b = "<html>Select the logs you wish to close.";
  
  List c;
  
  Icon d = null;
  
  Icon e = null;
  
  Icon f = null;
  
  JButton g = new JButton("Ok");
  
  JButton h = new JButton("Cancel");
  
  List i = new ArrayList();
  
  List j = new ArrayList();
  
  public bE(Window paramWindow, List paramList1, List paramList2) {
    super(paramWindow, "Log Removal", Dialog.ModalityType.APPLICATION_MODAL);
    this.c = paramList2;
    JPanel jPanel1 = new JPanel();
    add("Center", jPanel1);
    jPanel1.setBorder(BorderFactory.createEmptyBorder(eJ.ExceptionInVPackage(15), eJ.ExceptionInVPackage(15), eJ.ExceptionInVPackage(15), eJ.ExceptionInVPackage(15)));
    jPanel1.setLayout(new BorderLayout(eJ.ExceptionInVPackage(5), eJ.ExceptionInVPackage(5)));
    jPanel1.add("North", this.ExceptionInVPackage);
    this.ExceptionInVPackage.setText(this.b);
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.E, this, eJ.ExceptionInVPackage(16));
      this.d = new ImageIcon(image);
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.F, this, eJ.ExceptionInVPackage(16));
      this.e = new ImageIcon(image);
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.G, this, eJ.ExceptionInVPackage(16));
      this.f = new ImageIcon(image);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    jPanel1.add("Center", jPanel2);
    for (File file : paramList1) {
      bI bI = new bI(this, file);
      this.j.add(bI);
      jPanel2.add(bI);
    } 
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    if (J.ExceptionInVPackage()) {
      jPanel3.add(this.g);
      jPanel3.add(this.h);
    } else {
      jPanel3.add(this.h);
      jPanel3.add(this.g);
    } 
    this.g.addActionListener(new bF(this));
    this.h.addActionListener(new bG(this));
    jPanel1.add("South", jPanel3);
  }
  
  private void ExceptionInVPackage() {
    ArrayList<File> arrayList = new ArrayList();
    for (bI bI : this.j) {
      if (bI.ExceptionInVPackage())
        arrayList.add(bI.b()); 
    } 
    ExceptionInVPackage(arrayList);
    dispose();
  }
  
  private void b() {
    ExceptionInVPackage(new ArrayList());
    dispose();
  }
  
  public void ExceptionInVPackage(bH parambH) {
    this.i.add(parambH);
  }
  
  private void ExceptionInVPackage(List paramList) {
    for (bH bH : this.i)
      bH.ExceptionInVPackage(paramList); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */