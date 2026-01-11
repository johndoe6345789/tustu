package bz;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.io.Serializable;

public class a implements LayoutManager, Serializable {
  int a;
  
  int b;
  
  int c;
  
  int d;
  
  private boolean e = true;
  
  public a() {
    this(1, 0, 0, 0);
  }
  
  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 == 0 && paramInt2 == 0)
      throw new IllegalArgumentException("rows and cols cannot both be zero"); 
    this.c = paramInt1;
    this.d = paramInt2;
    this.a = paramInt3;
    this.b = paramInt4;
  }
  
  public void a(int paramInt) {
    if (paramInt == 0 && this.d == 0)
      throw new IllegalArgumentException("rows and cols cannot both be zero"); 
    this.c = paramInt;
  }
  
  public void b(int paramInt) {
    if (paramInt == 0 && this.c == 0)
      throw new IllegalArgumentException("rows and cols cannot both be zero"); 
    this.d = paramInt;
  }
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = paramContainer.getComponentCount();
      int j = this.c;
      int k = this.d;
      if (j > 0) {
        k = (i + j - 1) / j;
      } else {
        j = (i + k - 1) / k;
      } 
      int m = 0;
      int n = 0;
      for (byte b = 0; b < i; b++) {
        Component component = paramContainer.getComponent(b);
        Dimension dimension = component.getPreferredSize();
        if (m < dimension.width)
          m = dimension.width; 
        if (n < dimension.height)
          n = dimension.height; 
      } 
      return new Dimension(insets.left + insets.right + k * m + (k - 1) * this.a, insets.top + insets.bottom + j * n + (j - 1) * this.b);
    } 
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = paramContainer.getComponentCount();
      int j = this.c;
      int k = this.d;
      if (j > 0) {
        k = (i + j - 1) / j;
      } else {
        j = (i + k - 1) / k;
      } 
      int m = 0;
      int n = 0;
      for (byte b = 0; b < i; b++) {
        Component component = paramContainer.getComponent(b);
        Dimension dimension = component.getMinimumSize();
        if (m < dimension.width)
          m = dimension.width; 
        if (n < dimension.height)
          n = dimension.height; 
      } 
      return new Dimension(insets.left + insets.right + k * m + (k - 1) * this.a, insets.top + insets.bottom + j * n + (j - 1) * this.b);
    } 
  }
  
  public void layoutContainer(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = paramContainer.getComponentCount();
      int j = this.c;
      int k = this.d;
      boolean bool = paramContainer.getComponentOrientation().isLeftToRight();
      if (i == 0)
        return; 
      if (j > 0) {
        k = (i + j - 1) / j;
      } else {
        j = (i + k - 1) / k;
      } 
      int m = (k - 1) * this.a;
      int n = paramContainer.getWidth() - insets.left + insets.right;
      int i1 = (n - m) / k;
      int i2 = (n - i1 * k + m) / 2;
      int i3 = (j - 1) * this.b;
      int i4 = paramContainer.getHeight() - insets.top + insets.bottom;
      int i5 = (i4 - i3) / j;
      int i6 = (i4 - i5 * j + i3) / 2;
      if (bool) {
        byte b = 0;
        int i7;
        for (i7 = insets.top + i6; b < j; i7 += i5 + this.b) {
          byte b1 = 0;
          int i8;
          for (i8 = insets.left + i2; b1 < k; i8 += i1 + this.a) {
            int i9;
            if (this.e) {
              i9 = b1 * j + b;
            } else {
              i9 = b * k + b1;
            } 
            if (i9 < i)
              paramContainer.getComponent(i9).setBounds(i8, i7, i1, i5); 
            b1++;
          } 
          b++;
        } 
      } else {
        byte b = 0;
        int i7;
        for (i7 = insets.top + i6; b < j; i7 += i5 + this.b) {
          byte b1 = 0;
          int i8;
          for (i8 = paramContainer.getWidth() - insets.right - i1 - i2; b1 < k; i8 -= i1 + this.a) {
            int i9;
            if (this.e) {
              i9 = b1 * j + b;
            } else {
              i9 = b * k + b1;
            } 
            if (i9 < i)
              paramContainer.getComponent(i9).setBounds(i8, i7, i1, i5); 
            b1++;
          } 
          b++;
        } 
      } 
    } 
  }
  
  public String toString() {
    return getClass().getName() + "[hgap=" + this.a + ",vgap=" + this.b + ",rows=" + this.c + ",cols=" + this.d + "]";
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bz/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */