package com.efiAnalytics.ui;

import bH.X;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

class TableStatisticsOverlay {
  BufferedImage a = null;
  
  int b = eJ.a(25);
  
  int c = eJ.a(25);
  
  Font d = new Font("Arial Unicode MS", 1, eJ.a(18));
  
  Font e = new Font("Arial Unicode MS", 0, eJ.a(14));
  
  String f = cZ.a(this.l, "Area");
  
  String g = cZ.a(this.l, "Minimum");
  
  String h = cZ.a(this.l, "Maximum");
  
  String i = cZ.a(this.l, "Average");
  
  int j = 0;
  
  List k = new ArrayList();
  
  da(cZ paramcZ) {}
  
  public void a(Graphics paramGraphics, db paramdb) {
    Rectangle rectangle = this.l.k();
    String str1 = X.b(paramdb.a());
    String str2 = X.b(paramdb.c());
    String str3 = X.b(paramdb.d());
    String str4 = X.b(paramdb.e());
    paramGraphics.setFont(this.d);
    int i = this.d.getSize() / 2;
    int j = paramGraphics.getFontMetrics().stringWidth(str1);
    if (this.a == null || this.a.getWidth() < j * 1.1D) {
      this.k = a(this.k);
      this.j = 0;
      for (String str : this.k) {
        int i2 = paramGraphics.getFontMetrics().stringWidth(str);
        if (this.j < i2)
          this.j = i2; 
      } 
      int m = (int)(j * 1.5D);
      if (this.j > m)
        m = (int)(this.j * 1.1D); 
      int n = (paramGraphics.getFontMetrics(this.e).getHeight() + paramGraphics.getFontMetrics(this.d).getHeight()) * 4 + paramGraphics.getFontMetrics(this.d).getHeight() / 2;
      this.a = new BufferedImage(m, n, 2);
      Graphics2D graphics2D = this.a.createGraphics();
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      graphics2D.setColor(new Color(128, 128, 128, 128));
      graphics2D.fillRoundRect(0, 0, m, n, m / 6, m / 6);
      int i1 = this.e.getSize() + this.d.getSize() / 4;
      graphics2D.setFont(this.e);
      graphics2D.setColor(Color.WHITE);
      for (String str : this.k) {
        int i2 = graphics2D.getFontMetrics().stringWidth(str);
        graphics2D.drawString(str, (this.a.getWidth() - i2) / 2, i1);
        i1 += this.e.getSize() + this.d.getSize() + i;
      } 
    } 
    this.c = rectangle.y + eJ.a(5);
    this.b = rectangle.width - this.a.getWidth() - eJ.a(5);
    paramGraphics.drawImage(this.a, rectangle.x + this.b, this.c, null);
    paramGraphics.setColor(this.l.c(0));
    int k = this.c + this.e.getSize() + this.d.getSize() + this.d.getSize() / 3;
    paramGraphics.drawString(str1, rectangle.x + this.b + (this.a.getWidth() - j) / 2, k);
    k += this.e.getSize() + this.d.getSize() + i;
    j = paramGraphics.getFontMetrics().stringWidth(str2);
    paramGraphics.drawString(str2, rectangle.x + this.b + (this.a.getWidth() - j) / 2, k);
    k += this.e.getSize() + this.d.getSize() + i;
    j = paramGraphics.getFontMetrics().stringWidth(str3);
    paramGraphics.drawString(str3, rectangle.x + this.b + (this.a.getWidth() - j) / 2, k);
    k += this.e.getSize() + this.d.getSize() + i;
    j = paramGraphics.getFontMetrics().stringWidth(str4);
    paramGraphics.drawString(str4, rectangle.x + this.b + (this.a.getWidth() - j) / 2, k);
  }
  
  private List a(List<String> paramList) {
    paramList.clear();
    if (!this.l.y().isEmpty() && !this.l.j(0).isEmpty()) {
      paramList.add(this.f + " (" + this.l.j(0) + " " + this.l.y() + ")");
    } else {
      paramList.add(this.f);
    } 
    if (!this.l.j(0).isEmpty()) {
      paramList.add(this.g + " (" + this.l.j(0) + ")");
      paramList.add(this.h + " (" + this.l.j(0) + ")");
      paramList.add(this.i + " (" + this.l.j(0) + ")");
    } else {
      paramList.add(this.g);
      paramList.add(this.h);
      paramList.add(this.i);
    } 
    return paramList;
  }
  
  public void a() {
    this.k.clear();
    this.a = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/da.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */