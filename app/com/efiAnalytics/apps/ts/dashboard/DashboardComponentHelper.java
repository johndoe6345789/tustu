package com.efiAnalytics.apps.ts.dashboard;

import G.R;
import G.T;
import java.awt.Color;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import r.RInterfaceIndia;

public class DashboardComponentHelper {
  public static Z a(String[] paramArrayOfString, Z paramZ) {
    Component[] arrayOfComponent = paramZ.c();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof SingleChannelDashComponent)
        a(paramArrayOfString, (SingleChannelDashComponent)arrayOfComponent[b]); 
    } 
    return paramZ;
  }
  
  public static s a(String[] paramArrayOfString, SingleChannelDashComponent paramSingleChannelDashComponent) {
    R r = T.a().c(paramSingleChannelDashComponent.getEcuConfigurationName());
    if (r == null || r.g(paramSingleChannelDashComponent.getOutputChannel()) == null)
      for (byte b = 0; b < paramArrayOfString.length; b++) {
        r = T.a().c(paramArrayOfString[b]);
        if (r.g(paramSingleChannelDashComponent.getOutputChannel()) != null) {
          paramSingleChannelDashComponent.setEcuConfigurationName(r.c());
          return paramSingleChannelDashComponent;
        } 
      }  
    return paramSingleChannelDashComponent;
  }
  
  public static x a(x paramx) {
    paramx.l(true);
    T t = paramx.X();
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(t);
    paramx.setBackground(Color.DARK_GRAY);
    boolean bool = RInterfaceIndia.a().a("d67nhtrbd4es8j");
    paramx.l(bool);
    return paramx;
  }
  
  public static boolean a() {
    return true;
  }
  
  public static boolean b() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */