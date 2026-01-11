package business.query_builders;

import bA.JCheckBoxMenuItemExtension;
import bA.BaInterfaceFoxtrot;
import bH.X;
import JCheckBoxMenuItemExtension.e;
import com.efiAnalytics.ui.bs;
import com.efiAnalytics.ui.ci;
import com.efiAnalytics.ui.dr;
import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import javax.swing.event.PopupMenuListener;
import r.IOPropertiesUsingFile;
import r.RInterfaceIndia;
import s.BaInterfaceFoxtrot;

public class ManagerUsingJPopupMenu extends JButton implements BaInterfaceFoxtrot, bs, BaInterfaceFoxtrot {
  private boolean JCheckBoxMenuItemExtension = true;
  
  private ci d = null;
  
  private String e = null;
  
  private e BaInterfaceFoxtrot = null;
  
  private e g = null;
  
  private JPopupMenu h = new JPopupMenu();
  
  private int RInterfaceIndia = 0;
  
  String IOPropertiesUsingFile = "";
  
  List b = new ArrayList();
  
  public ManagerUsingJPopupMenu(String paramString, boolean paramBoolean) {
    super(paramString);
    this.IOPropertiesUsingFile = paramString;
    IOPropertiesUsingFile(paramBoolean);
    addActionListener(new JCheckBoxMenuItemExtension(this));
    setHorizontalTextPosition(4);
    setMargin(new Insets(0, 0, 0, 0));
    setFocusable(false);
    addActionListener(new d(this));
  }
  
  public void IOPropertiesUsingFile(ci paramci) {
    this.d = paramci;
  }
  
  public void IOPropertiesUsingFile(boolean paramBoolean) {
    this.JCheckBoxMenuItemExtension = paramBoolean;
  }
  
  public void JCheckBoxMenuItemExtension(String paramString) {
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(paramString));
    image = eJ.IOPropertiesUsingFile(image, this, 24);
    ImageIcon imageIcon = new ImageIcon(image);
    setIcon(imageIcon);
  }
  
  public int b() {
    return this.h.getComponentCount();
  }
  
  public Component IOPropertiesUsingFile(int paramInt) {
    return this.h.getComponent(paramInt);
  }
  
  public void b(boolean paramBoolean) {
    if (paramBoolean) {
      boolean bool = IOPropertiesUsingFile.IOPropertiesUsingFile().JCheckBoxMenuItemExtension(IOPropertiesUsingFile.bh, IOPropertiesUsingFile.bi);
      byte b1 = 0;
      for (byte b2 = 0; b2 < b(); b2++) {
        if (IOPropertiesUsingFile(b2) instanceof bs) {
          bs bs1 = (bs)IOPropertiesUsingFile(b2);
          if (bool) {
            if (bs1.RInterfaceIndia() != null) {
              boolean bool1 = (bs1.RInterfaceIndia() == null || bs1.RInterfaceIndia().IOPropertiesUsingFile()) ? true : false;
              bs1.setVisible(bool1);
              if (bool1)
                b1++; 
            } else {
              bs1.setVisible(true);
              b1++;
            } 
            if (bs1.e() != null)
              bs1.setEnabled(bs1.e().IOPropertiesUsingFile()); 
          } else {
            boolean bool1 = ((bs1.RInterfaceIndia() == null || bs1.RInterfaceIndia().IOPropertiesUsingFile()) && (bs1.e() == null || bs1.e().IOPropertiesUsingFile())) ? true : false;
            bs1.setVisible(bool1);
            if (bs1.e() != null)
              bs1.setEnabled(bs1.e().IOPropertiesUsingFile()); 
            if (bool1)
              b1++; 
          } 
        } else if (IOPropertiesUsingFile(b2) instanceof JPopupMenu.Separator) {
          JPopupMenu.Separator separator = (JPopupMenu.Separator)IOPropertiesUsingFile(b2);
          separator.setVisible((b1 != 0));
          b1 = 0;
        } 
        if (IOPropertiesUsingFile(b2) instanceof JCheckBoxMenuItemExtension) {
          JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = (JCheckBoxMenuItemExtension)IOPropertiesUsingFile(b2);
          if (JCheckBoxMenuItemExtension.b() != null)
            JCheckBoxMenuItemExtension.setState(JCheckBoxMenuItemExtension.b().IOPropertiesUsingFile()); 
        } 
      } 
    } 
    if (g() == 1) {
      this.h.show(this, getWidth(), getHeight() / 2);
    } else {
      this.h.show(this, 0, getHeight());
    } 
    this.h.requestFocus();
  }
  
  public void IOPropertiesUsingFile(PopupMenuListener paramPopupMenuListener) {
    this.h.addPopupMenuListener(paramPopupMenuListener);
  }
  
  public ci JCheckBoxMenuItemExtension() {
    return this.d;
  }
  
  public String d() {
    return this.e;
  }
  
  public void b(String paramString) {
    this.e = paramString;
  }
  
  private boolean j() {
    return (this.d != null && this.e != null && !this.e.equals("")) ? this.d.IOPropertiesUsingFile(this.e) : true;
  }
  
  public void setEnabled(boolean paramBoolean) {
    if ((!paramBoolean || !j()) && isEnabled()) {
      super.setEnabled(false);
    } else if (paramBoolean != isEnabled()) {
      super.setEnabled(paramBoolean);
    } 
  }
  
  public Component getComponent() {
    return this;
  }
  
  public void addSeparator() {
    this.h.addSeparator();
  }
  
  public Component add(Component paramComponent) {
    this.h.add(paramComponent);
    return paramComponent;
  }
  
  public int g() {
    return this.RInterfaceIndia;
  }
  
  public void b(int paramInt) {
    this.RInterfaceIndia = paramInt;
  }
  
  public void BaInterfaceFoxtrot() {
    Component[] arrayOfComponent = this.h.getComponents();
    for (int RInterfaceIndia = arrayOfComponent.length - 1; RInterfaceIndia >= 0 && !(arrayOfComponent[RInterfaceIndia] instanceof javax.swing.JMenuItem) && !(arrayOfComponent[RInterfaceIndia] instanceof javax.swing.JMenu); RInterfaceIndia--)
      remove(arrayOfComponent[RInterfaceIndia]); 
  }
  
  public void setText(String paramString) {
    super.setText(paramString);
    this.IOPropertiesUsingFile = paramString;
    k();
  }
  
  private void k() {
    Dimension dimension = getPreferredSize();
    if (getWidth() >= dimension.width && (this.IOPropertiesUsingFile.length() <= 12 || getWidth() > dimension.width * 1.5D)) {
      if (getText().startsWith("<html>")) {
        super.setText(this.IOPropertiesUsingFile);
        k();
      } 
    } else {
      int RInterfaceIndia = getMnemonic();
      char JCheckBoxMenuItemExtension = (char)((RInterfaceIndia > 96) ? (RInterfaceIndia - 32) : RInterfaceIndia);
      if (this.IOPropertiesUsingFile.contains(" ")) {
        String str1;
        char c1 = (char)(JCheckBoxMenuItemExtension + 32);
        int j = this.IOPropertiesUsingFile.indexOf(JCheckBoxMenuItemExtension);
        if (j >= 0 && j < this.IOPropertiesUsingFile.indexOf(c1)) {
          str1 = X.JCheckBoxMenuItemExtension(this.IOPropertiesUsingFile, "" + JCheckBoxMenuItemExtension, "<u>" + JCheckBoxMenuItemExtension + "</u>");
        } else {
          str1 = X.JCheckBoxMenuItemExtension(this.IOPropertiesUsingFile, "" + c1, "<u>" + c1 + "</u>");
        } 
        String[] arrayOfString = str1.split(" ");
        String str2 = "<html><center>";
        for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
          if ((arrayOfString.length > 1 && b1 == 0 && arrayOfString[b1].length() <= 2) || (arrayOfString.length > 2 && b1 == 0 && arrayOfString[b1].length() <= 5)) {
            str2 = str2 + arrayOfString[b1] + " ";
          } else if (arrayOfString.length > b1 + 1 && arrayOfString[b1 + 1].length() <= 2) {
            str2 = str2 + " " + arrayOfString[b1];
          } else if (b1 < arrayOfString.length - 1) {
            str2 = str2 + arrayOfString[b1];
            str2 = str2 + "<br>";
          } else {
            str2 = str2 + arrayOfString[b1];
          } 
        } 
        str2 = str2 + "</center></html>";
        super.setText(str2);
      } 
    } 
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    k();
  }
  
  public void IOPropertiesUsingFile(String paramString) {
    super.setText(paramString);
  }
  
  public String IOPropertiesUsingFile() {
    return this.IOPropertiesUsingFile;
  }
  
  public void IOPropertiesUsingFile(dr paramdr) {
    this.b.add(paramdr);
  }
  
  private void l() {
    Iterator<dr> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((dr)iterator.next()).IOPropertiesUsingFile(); 
  }
  
  public boolean h() {
    return !RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("HF;'[PG-05");
  }
  
  public e RInterfaceIndia() {
    return this.BaInterfaceFoxtrot;
  }
  
  public void b(e parame) {
    this.BaInterfaceFoxtrot = parame;
  }
  
  public e e() {
    return this.g;
  }
  
  public void IOPropertiesUsingFile(e parame) {
    this.g = parame;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bq/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */