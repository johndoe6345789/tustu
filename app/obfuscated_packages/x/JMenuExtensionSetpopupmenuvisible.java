package x;

import bA.JCheckBoxMenuItemExtension;
import bA.JMenuItemExtensionInBaPackage;
import bA.BaInterfaceFoxtrot;
import JCheckBoxMenuItemExtension.JMenuItemExtensionInBaPackage;
import com.efiAnalytics.ui.bs;
import com.efiAnalytics.ui.ci;
import com.efiAnalytics.ui.dr;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenuExtensionSetpopupmenuvisible extends JMenu implements BaInterfaceFoxtrot, bs {
  private boolean JCheckBoxMenuItemExtension = true;
  
  private ci d = null;
  
  private String JMenuItemExtensionInBaPackage = null;
  
  private JMenuItemExtensionInBaPackage BaInterfaceFoxtrot = null;
  
  private JMenuItemExtensionInBaPackage g = null;
  
  List a = new ArrayList();
  
  String b = "";
  
  private boolean h = false;
  
  public JMenuExtensionSetpopupmenuvisible() {
    this("");
  }
  
  public JMenuExtensionSetpopupmenuvisible(String paramString, boolean paramBoolean) {
    super(paramString);
    a(paramBoolean);
    addMouseListener(new b(this));
  }
  
  public JMenuExtensionSetpopupmenuvisible(String paramString) {
    this(paramString, true);
  }
  
  public void a(ci paramci) {
    this.d = paramci;
  }
  
  public void a(boolean paramBoolean) {
    this.JCheckBoxMenuItemExtension = paramBoolean;
  }
  
  public boolean b() {
    return r.a.a().JCheckBoxMenuItemExtension(r.a.bh, r.a.bi);
  }
  
  public void setPopupMenuVisible(boolean paramBoolean) {
    if (paramBoolean) {
      boolean bool = b();
      byte b1 = 0;
      for (byte b2 = 0; b2 < getItemCount(); b2++) {
        if (getItem(b2) instanceof bs) {
          bs bs1 = (bs)getItem(b2);
          if (bool) {
            if (bs1.i() != null) {
              boolean bool1 = (bs1.i() == null || bs1.i().a()) ? true : false;
              bs1.setVisible(bool1);
              if (bool1)
                b1++; 
            } else {
              bs1.setVisible(true);
              b1++;
            } 
            if (bs1.JMenuItemExtensionInBaPackage() != null)
              bs1.setEnabled(bs1.JMenuItemExtensionInBaPackage().a()); 
          } else {
            boolean bool1 = ((bs1.i() == null || bs1.i().a()) && (bs1.JMenuItemExtensionInBaPackage() == null || bs1.JMenuItemExtensionInBaPackage().a())) ? true : false;
            bs1.setVisible(bool1);
            if (bs1.JMenuItemExtensionInBaPackage() != null)
              bs1.setEnabled(bs1.JMenuItemExtensionInBaPackage().a()); 
            if (bool1)
              b1++; 
          } 
        } 
        if (getItem(b2) instanceof JCheckBoxMenuItemExtension) {
          JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = (JCheckBoxMenuItemExtension)getItem(b2);
          if (JCheckBoxMenuItemExtension.b() != null)
            JCheckBoxMenuItemExtension.setState(JCheckBoxMenuItemExtension.b().a()); 
        } 
      } 
    } 
    super.setPopupMenuVisible(paramBoolean);
  }
  
  public ci JCheckBoxMenuItemExtension() {
    return this.d;
  }
  
  public String d() {
    return this.JMenuItemExtensionInBaPackage;
  }
  
  public void b(String paramString) {
    this.JMenuItemExtensionInBaPackage = paramString;
  }
  
  public void JCheckBoxMenuItemExtension(String paramString) {}
  
  public void a(JMenuItemExtensionInBaPackage parame) {
    remove((JMenuItem)parame);
  }
  
  public JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage() {
    return this.BaInterfaceFoxtrot;
  }
  
  public void a(JMenuItemExtensionInBaPackage parame) {
    this.BaInterfaceFoxtrot = parame;
  }
  
  public void BaInterfaceFoxtrot() {
    Component[] arrayOfComponent = getComponents();
    for (int i = arrayOfComponent.length - 1; i >= 0 && !(arrayOfComponent[i] instanceof JMenuItem) && !(arrayOfComponent[i] instanceof JMenu); i--)
      remove(i); 
  }
  
  public void a(dr paramdr) {
    this.a.add(paramdr);
  }
  
  private void j() {
    Iterator<dr> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((dr)iterator.next()).a(); 
  }
  
  public String a() {
    return this.b;
  }
  
  public void setText(String paramString) {
    super.setText(paramString);
    this.b = paramString;
    if (g())
      k(); 
  }
  
  private void k() {
    Dimension dimension;
    try {
      dimension = getPreferredSize();
    } catch (Exception exception) {
      dimension = new Dimension(1, 1);
    } 
    if (getWidth() >= dimension.width && (this.b.length() <= 12 || getWidth() > dimension.width * 1.5D)) {
      if (getText().startsWith("<html>")) {
        super.setText(this.b);
        k();
      } 
    } else if (this.b.contains(" ")) {
      String[] arrayOfString = this.b.split(" ");
      String str = "<html><center>";
      for (byte b = 0; b < arrayOfString.length; b++) {
        if ((arrayOfString.length > 1 && b == 0 && arrayOfString[b].length() <= 2) || (arrayOfString.length > 2 && b == 0 && arrayOfString[b].length() <= 5)) {
          str = str + arrayOfString[b] + " ";
        } else if (arrayOfString.length > b + 1 && arrayOfString[b + 1].length() <= 2) {
          str = str + " " + arrayOfString[b];
        } else if (b < arrayOfString.length - 1) {
          str = str + arrayOfString[b];
          str = str + "<br>";
        } else {
          str = str + arrayOfString[b];
        } 
      } 
      str = str + "</center></html>";
      super.setText(str);
    } 
  }
  
  public boolean g() {
    return this.h;
  }
  
  public void b(boolean paramBoolean) {
    this.h = paramBoolean;
    k();
  }
  
  public boolean h() {
    return true;
  }
  
  public JMenuItemExtensionInBaPackage i() {
    return this.g;
  }
  
  public void b(JMenuItemExtensionInBaPackage parame) {
    this.g = parame;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/x/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */