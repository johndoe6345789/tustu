package bH;

import java.awt.Window;
import java.lang.reflect.Method;

public class K {
  public static void a(Window paramWindow) {
    try {
      Class<?> clazz = Class.forName("com.apple.eawt.FullScreenUtilities");
      Class[] arrayOfClass = { Window.class, boolean.class };
      Method method = clazz.getMethod("setWindowCanFullScreen", arrayOfClass);
      method.invoke(clazz, new Object[] { paramWindow, Boolean.valueOf(true) });
    } catch (Exception exception) {
      D.a(exception);
    } 
  }
  
  public static void b(Window paramWindow) {
    try {
      Class<?> clazz = Class.forName("com.apple.eawt.Application");
      Class[] arrayOfClass1 = new Class[0];
      Method method = clazz.getMethod("getApplication", arrayOfClass1);
      Object object = method.invoke(clazz, new Object[0]);
      Class[] arrayOfClass2 = { Window.class };
      method = clazz.getMethod("requestToggleFullScreen", arrayOfClass2);
      method.invoke(object, new Object[] { paramWindow });
    } catch (Exception exception) {
      D.a(exception);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */