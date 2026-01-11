package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

public class TuningViewKeyDispatcher implements KeyEventDispatcher {
  J a = null;
  
  R(J paramJ1, J paramJ2) {
    this.a = paramJ2;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   4: invokevirtual B : ()Z
    //   7: ifeq -> 21
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual getSource : ()Ljava/lang/Object;
    //   15: invokespecial a : (Ljava/lang/Object;)Z
    //   18: ifne -> 23
    //   21: iconst_0
    //   22: ireturn
    //   23: aload_1
    //   24: invokevirtual getID : ()I
    //   27: sipush #401
    //   30: if_icmpne -> 273
    //   33: aload_1
    //   34: invokevirtual getKeyCode : ()I
    //   37: lookupswitch default -> 229, 9 -> 222, 37 -> 141, 38 -> 168, 39 -> 105, 40 -> 195, 127 -> 96
    //   96: aload_0
    //   97: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   100: invokevirtual d : ()V
    //   103: iconst_1
    //   104: ireturn
    //   105: aload_1
    //   106: invokevirtual getModifiers : ()I
    //   109: bipush #64
    //   111: if_icmpeq -> 122
    //   114: aload_1
    //   115: invokevirtual getModifiers : ()I
    //   118: iconst_1
    //   119: if_icmpne -> 132
    //   122: aload_0
    //   123: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   126: invokevirtual D : ()V
    //   129: goto -> 139
    //   132: aload_0
    //   133: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   136: invokevirtual I : ()V
    //   139: iconst_1
    //   140: ireturn
    //   141: aload_1
    //   142: invokevirtual getModifiers : ()I
    //   145: iconst_1
    //   146: if_icmpne -> 159
    //   149: aload_0
    //   150: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   153: invokevirtual E : ()V
    //   156: goto -> 166
    //   159: aload_0
    //   160: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   163: invokevirtual J : ()V
    //   166: iconst_1
    //   167: ireturn
    //   168: aload_1
    //   169: invokevirtual getModifiers : ()I
    //   172: iconst_1
    //   173: if_icmpne -> 186
    //   176: aload_0
    //   177: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   180: invokevirtual G : ()V
    //   183: goto -> 193
    //   186: aload_0
    //   187: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   190: invokevirtual K : ()V
    //   193: iconst_1
    //   194: ireturn
    //   195: aload_1
    //   196: invokevirtual getModifiers : ()I
    //   199: iconst_1
    //   200: if_icmpne -> 213
    //   203: aload_0
    //   204: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   207: invokevirtual F : ()V
    //   210: goto -> 220
    //   213: aload_0
    //   214: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   217: invokevirtual L : ()V
    //   220: iconst_1
    //   221: ireturn
    //   222: aload_0
    //   223: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   226: invokevirtual N : ()V
    //   229: aload_0
    //   230: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   233: invokevirtual B : ()Z
    //   236: ifeq -> 273
    //   239: aload_1
    //   240: invokevirtual getModifiers : ()I
    //   243: iconst_2
    //   244: if_icmpne -> 256
    //   247: aload_1
    //   248: invokevirtual getKeyCode : ()I
    //   251: bipush #67
    //   253: if_icmpne -> 256
    //   256: aload_1
    //   257: invokevirtual getModifiers : ()I
    //   260: iconst_2
    //   261: if_icmpne -> 273
    //   264: aload_1
    //   265: invokevirtual getKeyCode : ()I
    //   268: bipush #86
    //   270: if_icmpne -> 273
    //   273: aload_1
    //   274: invokevirtual getID : ()I
    //   277: sipush #402
    //   280: if_icmpne -> 393
    //   283: aload_1
    //   284: invokevirtual getKeyCode : ()I
    //   287: tableswitch default -> 393, 37 -> 342, 38 -> 359, 39 -> 316, 40 -> 376
    //   316: aload_1
    //   317: invokevirtual getModifiers : ()I
    //   320: bipush #64
    //   322: if_icmpeq -> 333
    //   325: aload_1
    //   326: invokevirtual getModifiers : ()I
    //   329: iconst_1
    //   330: if_icmpne -> 342
    //   333: aload_0
    //   334: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   337: invokevirtual H : ()V
    //   340: iconst_1
    //   341: ireturn
    //   342: aload_1
    //   343: invokevirtual getModifiers : ()I
    //   346: iconst_1
    //   347: if_icmpne -> 359
    //   350: aload_0
    //   351: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   354: invokevirtual H : ()V
    //   357: iconst_1
    //   358: ireturn
    //   359: aload_1
    //   360: invokevirtual getModifiers : ()I
    //   363: iconst_1
    //   364: if_icmpne -> 376
    //   367: aload_0
    //   368: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   371: invokevirtual H : ()V
    //   374: iconst_1
    //   375: ireturn
    //   376: aload_1
    //   377: invokevirtual getModifiers : ()I
    //   380: iconst_1
    //   381: if_icmpne -> 393
    //   384: aload_0
    //   385: getfield b : Lcom/efiAnalytics/apps/ts/tuningViews/J;
    //   388: invokevirtual H : ()V
    //   391: iconst_1
    //   392: ireturn
    //   393: iconst_0
    //   394: ireturn
  }
  
  private boolean a(Object paramObject) {
    if (!(paramObject instanceof Component))
      return false; 
    Component component = (Component)paramObject;
    if (this.a.equals(paramObject))
      return true; 
    while (component != null) {
      if (component.equals(this.a) || (J.d(this.b) != null && component.equals(J.d(this.b)) && J.b(this.b).contains(paramObject)))
        return true; 
      component = component.getParent();
      if (component instanceof java.awt.Window)
        return false; 
    } 
    Component[] arrayOfComponent = this.b.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (paramObject.equals(arrayOfComponent[b]))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */