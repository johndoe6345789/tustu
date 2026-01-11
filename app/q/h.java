package q;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h {
  private static h a = null;
  
  private Map b = Collections.synchronizedMap(new HashMap<>());
  
  private Map c = Collections.synchronizedMap(new HashMap<>());
  
  private Map d = new HashMap<>();
  
  public static h a() {
    if (a == null)
      a = new h(); 
    return a;
  }
  
  public synchronized Component a(Class<Component> paramClass) {
    List<Component> list1 = b(paramClass);
    List<Component> list2 = d(paramClass);
    if (list2.isEmpty()) {
      Component component1 = paramClass.newInstance();
      list1.add(component1);
      b(component1);
      return component1;
    } 
    Component component = list2.remove(0);
    list1.add(component);
    b(component);
    return component;
  }
  
  public synchronized void a(Component paramComponent) {
    List list = b(paramComponent.getClass());
    List<Component> list1 = d(paramComponent.getClass());
    c(paramComponent);
    list.remove(paramComponent);
    if (!list1.contains(paramComponent))
      list1.add(paramComponent); 
  }
  
  private List b(Class<?> paramClass) {
    List list = (List)this.c.get(paramClass);
    if (list == null) {
      list = new ArrayList();
      this.c.put(paramClass, list);
    } 
    return list;
  }
  
  private void b(Component paramComponent) {
    List list = c(paramComponent.getClass());
    for (i i : list)
      i.b(paramComponent); 
  }
  
  private void c(Component paramComponent) {
    List list = c(paramComponent.getClass());
    for (i i : list)
      i.a(paramComponent); 
  }
  
  public void a(Class paramClass, i parami) {
    List<i> list = c(paramClass);
    list.add(parami);
  }
  
  private List c(Class<?> paramClass) {
    List list = (List)this.d.get(paramClass);
    if (list == null) {
      list = new ArrayList();
      this.d.put(paramClass, list);
    } 
    return list;
  }
  
  private List d(Class<?> paramClass) {
    List<?> list = (List)this.b.get(paramClass);
    if (list == null) {
      list = Collections.synchronizedList(new ArrayList());
      this.b.put(paramClass, list);
    } 
    return list;
  }
  
  public void a(Class<Component> paramClass, int paramInt) {
    List<Component> list = d(paramClass);
    while (list.size() < paramInt) {
      Component component = paramClass.newInstance();
      list.add(component);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */