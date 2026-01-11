package t;

import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import s.SComponentGolf;

public class ComponentPositionDialog extends a implements f {
  JPanel a = new JPanel();
  
  NumericTextField b = new NumericTextField();
  
  NumericTextField c = new NumericTextField();
  
  NumericTextField d = new NumericTextField();
  
  NumericTextField e = new NumericTextField();
  
  public r(Window paramWindow, ai paramai, String paramString) {
    super(paramWindow, paramString);
    a(paramai);
    setLayout(new BorderLayout());
    add(this.a, "Center");
    this.b.b(0);
    this.c.b(0);
    this.d.b(0);
    this.e.b(0);
    this.a.setBorder(BorderFactory.createTitledBorder(SComponentGolf.b("Component Position")));
    this.a.setLayout(new GridLayout(0, 2, eJ.a(3), eJ.a(3)));
    this.a.add(new JLabel(SComponentGolf.b("Component X :"), 4));
    this.a.add((Component)this.b);
    this.a.add(new JLabel(SComponentGolf.b("Component Y :"), 4));
    this.a.add((Component)this.c);
    this.a.add(new JLabel(SComponentGolf.b("Component Width :"), 4));
    this.a.add((Component)this.d);
    this.a.add(new JLabel(SComponentGolf.b("Component Height :"), 4));
    this.a.add((Component)this.e);
    this.b.addKeyListener(new s(this));
    this.c.addKeyListener(new t(this));
    this.d.addKeyListener(new u(this));
    this.e.addKeyListener(new v(this));
  }
  
  public void e(ArrayList<s> paramArrayList) {
    if (paramArrayList.isEmpty()) {
      setEnabled(false);
    } else if (paramArrayList.get(0) != null) {
      setEnabled(true);
      s s = paramArrayList.get(0);
      this.b.a(s.getX());
      this.c.a(s.getY());
      this.d.a(s.getWidth());
      this.e.a(s.getHeight());
    } 
    f(paramArrayList);
  }
  
  private void f(ArrayList paramArrayList) {
    Color color1 = UIManager.getColor("TextField.foreground");
    Color color2 = Color.GRAY;
    this.b.setForeground(color1);
    this.c.setForeground(color1);
    this.d.setForeground(color1);
    this.e.setForeground(color1);
    if (color2 == null)
      return; 
    for (s s : paramArrayList) {
      if (s.getX() != this.b.e()) {
        this.b.setForeground(color2);
        break;
      } 
    } 
    for (s s : paramArrayList) {
      if (s.getY() != this.c.e()) {
        this.c.setForeground(color2);
        break;
      } 
    } 
    for (s s : paramArrayList) {
      if (s.getWidth() != this.d.e()) {
        this.d.setForeground(color2);
        break;
      } 
    } 
    for (s s : paramArrayList) {
      if (s.getHeight() != this.e.e()) {
        this.e.setForeground(color2);
        break;
      } 
    } 
  }
  
  public void a(ArrayList paramArrayList) {
    e(paramArrayList);
  }
  
  public void setEnabled(boolean paramBoolean) {
    Component[] arrayOfComponent = this.a.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++)
      arrayOfComponent[b].setEnabled(paramBoolean); 
    this.a.setEnabled(paramBoolean);
  }
  
  public JPanel a() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */