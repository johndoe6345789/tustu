package bq;

import bA.c;
import bA.f;
import bH.X;
import c.e;
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
import r.a;
import r.i;
import s.f;

public class b extends JButton implements f, bs, f {
  private boolean c = true;
  
  private ci d = null;
  
  private String e = null;
  
  private e f = null;
  
  private e g = null;
  
  private JPopupMenu h = new JPopupMenu();
  
  private int i = 0;
  
  String a = "";
  
  List b = new ArrayList();
  
  public b(String paramString, boolean paramBoolean) {
    super(paramString);
    this.a = paramString;
    a(paramBoolean);
    addActionListener(new c(this));
    setHorizontalTextPosition(4);
    setMargin(new Insets(0, 0, 0, 0));
    setFocusable(false);
    addActionListener(new d(this));
  }
  
  public void a(ci paramci) {
    this.d = paramci;
  }
  
  public void a(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public void c(String paramString) {
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(paramString));
    image = eJ.a(image, this, 24);
    ImageIcon imageIcon = new ImageIcon(image);
    setIcon(imageIcon);
  }
  
  public int b() {
    return this.h.getComponentCount();
  }
  
  public Component a(int paramInt) {
    return this.h.getComponent(paramInt);
  }
  
  public void b(boolean paramBoolean) {
    if (paramBoolean) {
      boolean bool = a.a().c(a.bh, a.bi);
      byte b1 = 0;
      for (byte b2 = 0; b2 < b(); b2++) {
        if (a(b2) instanceof bs) {
          bs bs1 = (bs)a(b2);
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
            if (bs1.e() != null)
              bs1.setEnabled(bs1.e().a()); 
          } else {
            boolean bool1 = ((bs1.i() == null || bs1.i().a()) && (bs1.e() == null || bs1.e().a())) ? true : false;
            bs1.setVisible(bool1);
            if (bs1.e() != null)
              bs1.setEnabled(bs1.e().a()); 
            if (bool1)
              b1++; 
          } 
        } else if (a(b2) instanceof JPopupMenu.Separator) {
          JPopupMenu.Separator separator = (JPopupMenu.Separator)a(b2);
          separator.setVisible((b1 != 0));
          b1 = 0;
        } 
        if (a(b2) instanceof c) {
          c c = (c)a(b2);
          if (c.b() != null)
            c.setState(c.b().a()); 
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
  
  public void a(PopupMenuListener paramPopupMenuListener) {
    this.h.addPopupMenuListener(paramPopupMenuListener);
  }
  
  public ci c() {
    return this.d;
  }
  
  public String d() {
    return this.e;
  }
  
  public void b(String paramString) {
    this.e = paramString;
  }
  
  private boolean j() {
    return (this.d != null && this.e != null && !this.e.equals("")) ? this.d.a(this.e) : true;
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
    return this.i;
  }
  
  public void b(int paramInt) {
    this.i = paramInt;
  }
  
  public void f() {
    Component[] arrayOfComponent = this.h.getComponents();
    for (int i = arrayOfComponent.length - 1; i >= 0 && !(arrayOfComponent[i] instanceof javax.swing.JMenuItem) && !(arrayOfComponent[i] instanceof javax.swing.JMenu); i--)
      remove(arrayOfComponent[i]); 
  }
  
  public void setText(String paramString) {
    super.setText(paramString);
    this.a = paramString;
    k();
  }
  
  private void k() {
    Dimension dimension = getPreferredSize();
    if (getWidth() >= dimension.width && (this.a.length() <= 12 || getWidth() > dimension.width * 1.5D)) {
      if (getText().startsWith("<html>")) {
        super.setText(this.a);
        k();
      } 
    } else {
      int i = getMnemonic();
      char c = (char)((i > 96) ? (i - 32) : i);
      if (this.a.contains(" ")) {
        String str1;
        char c1 = (char)(c + 32);
        int j = this.a.indexOf(c);
        if (j >= 0 && j < this.a.indexOf(c1)) {
          str1 = X.c(this.a, "" + c, "<u>" + c + "</u>");
        } else {
          str1 = X.c(this.a, "" + c1, "<u>" + c1 + "</u>");
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
  
  public void a(String paramString) {
    super.setText(paramString);
  }
  
  public String a() {
    return this.a;
  }
  
  public void a(dr paramdr) {
    this.b.add(paramdr);
  }
  
  private void l() {
    Iterator<dr> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((dr)iterator.next()).a(); 
  }
  
  public boolean h() {
    return !i.a().a("HF;'[PG-05");
  }
  
  public e i() {
    return this.f;
  }
  
  public void b(e parame) {
    this.f = parame;
  }
  
  public e e() {
    return this.g;
  }
  
  public void a(e parame) {
    this.g = parame;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bq/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */