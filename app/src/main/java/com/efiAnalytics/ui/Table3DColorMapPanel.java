package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JComponent;

public class Table3DColorMapPanel extends JComponent {
  private cD c = null;
  
  ArrayList a = new ArrayList();
  
  dD b = null;
  
  private String d = "X Axis";
  
  private String e = "Y Axis";
  
  private String f = "Z Axis";
  
  private Image g = null;
  
  public Table3DColorMapPanel() {
    this.b = new Table3DColorMapPanel(this);
    this.b.b(1000);
    Table3DColorMapPanel("Hey");
  }
  
  public Table3DColorMapPanel(cD paramcD) {
    Table3DColorMapPanel();
    Table3DColorMapPanel(paramcD);
  }
  
  public String Table3DColorMapPanel(MouseEvent paramMouseEvent) {
    int i = (int)(this.c.b() / Table3DColorMapPanel() * paramMouseEvent.getY());
    int j = (int)(this.c.a() / Table3DColorMapPanel() * paramMouseEvent.getX());
    double d = (int)(this.c.a(j, i) * 10000.0D) / 10000.0D;
    return "<html>" + this.d + ": " + this.c.a(j) + "<br>" + this.e + ": " + this.c.b(i) + "<br>" + this.f + ": " + d + "</html>";
  }
  
  public void Table3DColorMapPanel() {
    this.b.a();
  }
  
  private Image Table3DColorMapPanel() {
    if (this.g == null || this.g.getWidth(null) != Table3DColorMapPanel() || this.g.getHeight(null) != Table3DColorMapPanel())
      this.g = Table3DColorMapPanel(getWidth(), Table3DColorMapPanel()); 
    return this.g;
  }
  
  public void Table3DColorMapPanel(Graphics paramGraphics) {
    Image image = Table3DColorMapPanel();
    Table3DColorMapPanel(image.getGraphics());
    paramGraphics.drawImage(image, 0, 0, null);
  }
  
  public void Table3DColorMapPanel(Graphics paramGraphics) {
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, Table3DColorMapPanel(), Table3DColorMapPanel());
    if (this.c == null)
      return; 
    int i = Table3DColorMapPanel() / this.c.a();
    int j = Table3DColorMapPanel() / this.c.b();
    for (byte b = 0; b < this.c.b(); b++) {
      for (byte b1 = 0; b1 < this.c.a(); b1++) {
        int k = b1 * i;
        int m = b * j;
        paramGraphics.setColor(a(this.c.a(b1, b)));
        paramGraphics.fillRect(k, m, i, j);
      } 
    } 
    paramGraphics.setColor(Color.darkGray);
    paramGraphics.drawRect(0, 0, Table3DColorMapPanel() - 1, Table3DColorMapPanel() - 1);
  }
  
  public Color Table3DColorMapPanel(double paramDouble) {
    Color color1 = Table3DColorMapPanel();
    Color color2 = null;
    double d = 0.5D;
    int i;
    for (i = 0; i < this.a.size(); i++) {
      if (paramDouble < cC.a(this.a.get(i))) {
        color2 = ((cC)this.a.get(i)).b();
        if (i > 0) {
          color1 = ((cC)this.a.get(i - 1)).b();
          d = (paramDouble - ((cC)this.a.get(i - 1)).a()) / (((cC)this.a.get(i)).a() - ((cC)this.a.get(i - 1)).a());
        } 
        break;
      } 
    } 
    if (color2 == null)
      return ((cC)this.a.get(this.a.size() - 1)).b(); 
    i = (int)(color2.getRed() * d + color1.getRed() * (1.0D - d));
    int j = (int)(color2.getGreen() * d + color1.getGreen() * (1.0D - d));
    int k = (int)(color2.getBlue() * d + color1.getBlue() * (1.0D - d));
    return new Color(i, j, k);
  }
  
  public void Table3DColorMapPanel(double paramDouble, Color paramColor) {
    cC cC = new Table3DColorMapPanel(this);
    cC.a(paramDouble);
    cC.a(paramColor);
    if (this.a.size() > 0) {
      for (int i = this.a.size(); i > 0; i++) {
        if (paramDouble > cC.a(this.a.get(i - 1))) {
          this.a.add(i, cC);
          break;
        } 
      } 
    } else {
      this.a.add(cC);
    } 
  }
  
  public void Table3DColorMapPanel(cD paramcD) {
    this.c = paramcD;
    paramcD.a(new Table3DColorMapPanel(this));
  }
  
  public void Table3DColorMapPanel(String paramString) {
    this.d = paramString;
  }
  
  public void Table3DColorMapPanel(String paramString) {
    this.e = paramString;
  }
  
  public void Table3DColorMapPanel(String paramString) {
    this.f = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */