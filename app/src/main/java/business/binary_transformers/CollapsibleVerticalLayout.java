package bt;

import com.efiAnalytics.ui.cQ;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;

public class CollapsibleVerticalLayout implements LayoutManager2, ContainerListener, FocusListener {
  int a;
  
  int b = 2;
  
  private int e = -1;
  
  Container c = null;
  
  List d = new ArrayList();
  
  public CollapsibleVerticalLayout(Container paramContainer, int paramInt) {
    this.a = paramInt;
    this.c = paramContainer;
  }
  
  public CollapsibleVerticalLayout(Container paramContainer) {
    this(paramContainer, 1);
  }
  
  public void a(cQ paramcQ) {
    this.d.add(paramcQ);
  }
  
  private void b(int paramInt) {
    for (cQ cQ : this.d)
      cQ.a(paramInt); 
  }
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = paramContainer.getComponentCount();
      int j = 0;
      int k = 0;
      int m = a(paramContainer);
      for (byte b = 0; b < i; b++) {
        Component component = paramContainer.getComponent(b);
        Dimension dimension = component.getPreferredSize();
        if (j < dimension.width)
          j = dimension.width; 
        if (b == m) {
          k += dimension.height;
        } else {
          k += dimension.height / this.b;
        } 
      } 
      return new Dimension(insets.left + insets.right + j, insets.top + insets.bottom + k + (i - 1) * this.a);
    } 
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = paramContainer.getComponentCount();
      int j = 0;
      int k = 0;
      int m = a(paramContainer);
      for (byte b = 0; b < i; b++) {
        Component component = paramContainer.getComponent(b);
        Dimension dimension = component.getMinimumSize();
        if (j < dimension.width)
          j = dimension.width; 
        if (b == m) {
          k += dimension.height;
        } else {
          k += dimension.height / this.b;
        } 
      } 
      return new Dimension(insets.left + insets.right + j, insets.top + insets.bottom + k + (i - 1) * this.a);
    } 
  }
  
  public void layoutContainer(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = paramContainer.getComponentCount();
      if (i == 0)
        return; 
      int j = paramContainer.getWidth() - insets.left + insets.right;
      int k = j;
      int m = i * this.a;
      int n = paramContainer.getHeight() - insets.top + insets.bottom;
      int i1 = n - m;
      int i2 = i1 / (i + this.b);
      int i3 = i1 - i2 * (i - 1);
      byte b1 = 0;
      int i4 = insets.top;
      int i5 = a(paramContainer);
      if (i5 == -1 || i5 >= i)
        i5 = (i - 1) / 2; 
      for (byte b2 = 0; b2 < i; b2++) {
        Component component = paramContainer.getComponent(b2);
        if (b2 == i5) {
          component.setBounds(insets.left, i4, k, b1 + i3);
          i4 += this.a + b1 + i3;
        } else {
          component.setBounds(insets.left, i4, k, i2);
          i4 += this.a + i2;
        } 
      } 
    } 
  }
  
  public void addLayoutComponent(Component paramComponent, Object paramObject) {
    paramComponent.addFocusListener(this);
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      container.addContainerListener(this);
      for (Component component : container.getComponents())
        addLayoutComponent(component, (Object)null); 
    } 
  }
  
  public Dimension maximumLayoutSize(Container paramContainer) {
    return new Dimension(2147483647, 2147483647);
  }
  
  public float getLayoutAlignmentX(Container paramContainer) {
    return 0.5F;
  }
  
  public float getLayoutAlignmentY(Container paramContainer) {
    return 0.5F;
  }
  
  public void invalidateLayout(Container paramContainer) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    this.c.revalidate();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
  
  public void componentAdded(ContainerEvent paramContainerEvent) {
    if (paramContainerEvent.getChild() != null) {
      paramContainerEvent.getChild().addFocusListener(this);
      if (paramContainerEvent.getChild() instanceof Container) {
        Container container = (Container)paramContainerEvent.getChild();
        if (!a(container.getContainerListeners()))
          container.addContainerListener(this); 
      } 
    } 
  }
  
  private boolean a(ContainerListener[] paramArrayOfContainerListener) {
    for (ContainerListener containerListener : paramArrayOfContainerListener) {
      if (containerListener.equals(this))
        return true; 
    } 
    return false;
  }
  
  public void componentRemoved(ContainerEvent paramContainerEvent) {}
  
  private int a(Container paramContainer) {
    for (byte b = 0; b < paramContainer.getComponentCount(); b++) {
      Component component = paramContainer.getComponent(b);
      if (component.hasFocus()) {
        a(b);
        break;
      } 
    } 
    return this.e;
  }
  
  public void a(int paramInt) {
    if (this.e != paramInt) {
      b(paramInt);
      this.e = paramInt;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */