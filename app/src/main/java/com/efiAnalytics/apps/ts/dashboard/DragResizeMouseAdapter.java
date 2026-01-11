package com.efiAnalytics.apps.ts.dashboard;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

class DragResizeMouseAdapter extends MouseAdapter implements MouseMotionListener {
  List a = new ArrayList();
  
  List b = new ArrayList();
  
  List c = new ArrayList();
  
  List d = new ArrayList();
  
  boolean e = false;
  
  s f = null;
  
  Point g = null;
  
  DragResizeMouseAdapter(x paramx) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   4: invokevirtual isEnabled : ()Z
    //   7: ifne -> 29
    //   10: aload_1
    //   11: invokevirtual getSource : ()Ljava/lang/Object;
    //   14: instanceof com/efiAnalytics/apps/ts/dashboard/s
    //   17: ifeq -> 28
    //   20: aload_0
    //   21: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   24: aload_1
    //   25: invokevirtual dispatchEvent : (Ljava/awt/AWTEvent;)V
    //   28: return
    //   29: aload_0
    //   30: aload_0
    //   31: aload_1
    //   32: invokespecial a : (Ljava/awt/event/MouseEvent;)Lcom/efiAnalytics/apps/ts/dashboard/s;
    //   35: putfield f : Lcom/efiAnalytics/apps/ts/dashboard/s;
    //   38: aload_0
    //   39: getfield f : Lcom/efiAnalytics/apps/ts/dashboard/s;
    //   42: invokevirtual getParent : ()Ljava/awt/Container;
    //   45: invokevirtual getMousePosition : ()Ljava/awt/Point;
    //   48: astore_2
    //   49: aload_2
    //   50: ifnonnull -> 72
    //   53: aload_1
    //   54: invokevirtual getSource : ()Ljava/lang/Object;
    //   57: instanceof com/efiAnalytics/apps/ts/dashboard/s
    //   60: ifeq -> 71
    //   63: aload_0
    //   64: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   67: aload_1
    //   68: invokevirtual dispatchEvent : (Ljava/awt/AWTEvent;)V
    //   71: return
    //   72: aload_1
    //   73: invokevirtual getButton : ()I
    //   76: iconst_1
    //   77: if_icmpeq -> 88
    //   80: aload_1
    //   81: invokevirtual getButton : ()I
    //   84: iconst_3
    //   85: if_icmpne -> 134
    //   88: aload_1
    //   89: invokevirtual getModifiers : ()I
    //   92: iconst_2
    //   93: iand
    //   94: iconst_2
    //   95: if_icmpeq -> 102
    //   98: iconst_1
    //   99: goto -> 103
    //   102: iconst_0
    //   103: istore_3
    //   104: aload_0
    //   105: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   108: aload_0
    //   109: getfield f : Lcom/efiAnalytics/apps/ts/dashboard/s;
    //   112: invokevirtual e : (Lcom/efiAnalytics/apps/ts/dashboard/s;)Z
    //   115: ifeq -> 122
    //   118: iload_3
    //   119: ifne -> 134
    //   122: aload_0
    //   123: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   126: aload_0
    //   127: getfield f : Lcom/efiAnalytics/apps/ts/dashboard/s;
    //   130: iload_3
    //   131: invokevirtual a : (Lcom/efiAnalytics/apps/ts/dashboard/s;Z)V
    //   134: aload_1
    //   135: invokevirtual getButton : ()I
    //   138: iconst_3
    //   139: if_icmpne -> 142
    //   142: aload_1
    //   143: invokevirtual getClickCount : ()I
    //   146: iconst_2
    //   147: if_icmpne -> 169
    //   150: aload_1
    //   151: invokevirtual getButton : ()I
    //   154: iconst_1
    //   155: if_icmpne -> 169
    //   158: aload_0
    //   159: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   162: invokevirtual t : ()V
    //   165: aload_1
    //   166: invokevirtual consume : ()V
    //   169: aload_0
    //   170: getfield a : Ljava/util/List;
    //   173: invokeinterface clear : ()V
    //   178: aload_0
    //   179: getfield b : Ljava/util/List;
    //   182: invokeinterface clear : ()V
    //   187: aload_0
    //   188: getfield c : Ljava/util/List;
    //   191: invokeinterface clear : ()V
    //   196: aload_0
    //   197: getfield d : Ljava/util/List;
    //   200: invokeinterface clear : ()V
    //   205: aload_0
    //   206: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   209: invokestatic g : (Lcom/efiAnalytics/apps/ts/dashboard/x;)Ljava/util/ArrayList;
    //   212: invokevirtual iterator : ()Ljava/util/Iterator;
    //   215: astore_3
    //   216: aload_3
    //   217: invokeinterface hasNext : ()Z
    //   222: ifeq -> 321
    //   225: aload_3
    //   226: invokeinterface next : ()Ljava/lang/Object;
    //   231: checkcast com/efiAnalytics/apps/ts/dashboard/s
    //   234: astore #4
    //   236: aload_0
    //   237: getfield a : Ljava/util/List;
    //   240: aload_2
    //   241: getfield x : I
    //   244: aload #4
    //   246: invokevirtual getX : ()I
    //   249: isub
    //   250: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   253: invokeinterface add : (Ljava/lang/Object;)Z
    //   258: pop
    //   259: aload_0
    //   260: getfield b : Ljava/util/List;
    //   263: aload_2
    //   264: getfield y : I
    //   267: aload #4
    //   269: invokevirtual getY : ()I
    //   272: isub
    //   273: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   276: invokeinterface add : (Ljava/lang/Object;)Z
    //   281: pop
    //   282: aload_0
    //   283: getfield c : Ljava/util/List;
    //   286: aload #4
    //   288: invokevirtual getWidth : ()I
    //   291: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   294: invokeinterface add : (Ljava/lang/Object;)Z
    //   299: pop
    //   300: aload_0
    //   301: getfield d : Ljava/util/List;
    //   304: aload #4
    //   306: invokevirtual getHeight : ()I
    //   309: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   312: invokeinterface add : (Ljava/lang/Object;)Z
    //   317: pop
    //   318: goto -> 216
    //   321: aload_0
    //   322: aload_2
    //   323: putfield g : Ljava/awt/Point;
    //   326: aload_0
    //   327: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   330: invokevirtual requestFocus : ()V
    //   333: aload_0
    //   334: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   337: invokevirtual repaint : ()V
    //   340: aload_0
    //   341: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   344: invokestatic g : (Lcom/efiAnalytics/apps/ts/dashboard/x;)Ljava/util/ArrayList;
    //   347: invokevirtual iterator : ()Ljava/util/Iterator;
    //   350: astore_3
    //   351: aload_3
    //   352: invokeinterface hasNext : ()Z
    //   357: ifeq -> 493
    //   360: aload_3
    //   361: invokeinterface next : ()Ljava/lang/Object;
    //   366: checkcast com/efiAnalytics/apps/ts/dashboard/s
    //   369: astore #4
    //   371: aload_0
    //   372: aload_0
    //   373: getfield g : Ljava/awt/Point;
    //   376: getfield x : I
    //   379: aload #4
    //   381: invokevirtual getX : ()I
    //   384: aload #4
    //   386: invokevirtual getWidth : ()I
    //   389: iadd
    //   390: aload_0
    //   391: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   394: invokestatic h : (Lcom/efiAnalytics/apps/ts/dashboard/x;)I
    //   397: isub
    //   398: if_icmple -> 476
    //   401: aload_0
    //   402: getfield g : Ljava/awt/Point;
    //   405: getfield x : I
    //   408: aload #4
    //   410: invokevirtual getX : ()I
    //   413: aload #4
    //   415: invokevirtual getWidth : ()I
    //   418: iadd
    //   419: if_icmpge -> 476
    //   422: aload_0
    //   423: getfield g : Ljava/awt/Point;
    //   426: getfield y : I
    //   429: aload #4
    //   431: invokevirtual getY : ()I
    //   434: aload #4
    //   436: invokevirtual getHeight : ()I
    //   439: iadd
    //   440: aload_0
    //   441: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   444: invokestatic h : (Lcom/efiAnalytics/apps/ts/dashboard/x;)I
    //   447: isub
    //   448: if_icmple -> 476
    //   451: aload_0
    //   452: getfield g : Ljava/awt/Point;
    //   455: getfield y : I
    //   458: aload #4
    //   460: invokevirtual getY : ()I
    //   463: aload #4
    //   465: invokevirtual getHeight : ()I
    //   468: iadd
    //   469: if_icmpge -> 476
    //   472: iconst_1
    //   473: goto -> 477
    //   476: iconst_0
    //   477: putfield e : Z
    //   480: aload_0
    //   481: getfield e : Z
    //   484: ifeq -> 490
    //   487: goto -> 493
    //   490: goto -> 351
    //   493: aload_1
    //   494: invokevirtual getSource : ()Ljava/lang/Object;
    //   497: instanceof com/efiAnalytics/apps/ts/dashboard/s
    //   500: ifeq -> 537
    //   503: aload_0
    //   504: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   507: aload_1
    //   508: invokevirtual dispatchEvent : (Ljava/awt/AWTEvent;)V
    //   511: goto -> 537
    //   514: astore #5
    //   516: aload_1
    //   517: invokevirtual getSource : ()Ljava/lang/Object;
    //   520: instanceof com/efiAnalytics/apps/ts/dashboard/s
    //   523: ifeq -> 534
    //   526: aload_0
    //   527: getfield h : Lcom/efiAnalytics/apps/ts/dashboard/x;
    //   530: aload_1
    //   531: invokevirtual dispatchEvent : (Ljava/awt/AWTEvent;)V
    //   534: aload #5
    //   536: athrow
    //   537: return
    // Exception table:
    //   from	to	target	type
    //   0	10	514	finally
    //   29	53	514	finally
    //   72	493	514	finally
    //   514	516	514	finally
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (!this.h.L() && paramMouseEvent.getSource() instanceof s)
      this.h.dispatchEvent(paramMouseEvent); 
    if (!this.h.isEnabled())
      return; 
    s s1 = (this.f != null) ? this.f : a(paramMouseEvent);
    for (s s2 : x.g(this.h)) {
      if (this.e) {
        double d3 = s2.getWidth() / this.h.getWidth();
        double d4 = s2.getHeight() / this.h.getHeight();
        s2.setRelativeWidth(d3);
        s2.setRelativeHeight(d4);
        continue;
      } 
      double d1 = s2.getX() / this.h.getWidth();
      double d2 = s2.getY() / this.h.getHeight();
      s2.setRelativeX(d1);
      s2.setRelativeY(d2);
    } 
    this.e = false;
    s1 = null;
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (!this.h.isEnabled())
      return; 
    s s1 = (s)paramMouseEvent.getSource();
    if (s1.hasFocus() && this.h.getCursor().getType() != 0)
      this.h.setCursor(Cursor.getDefaultCursor()); 
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (!this.h.L() && paramMouseEvent.getSource() instanceof s)
      this.h.dispatchEvent(paramMouseEvent); 
    if (!this.h.isEnabled() || !this.h.L())
      return; 
    this.f.invalidate();
    if (this.e) {
      int i = 0;
      int j = 0;
      if (paramMouseEvent.getSource() instanceof x) {
        i = paramMouseEvent.getX() - this.f.getX();
        j = paramMouseEvent.getY() - this.f.getY();
        this.f.setSize(i, j);
      } else if (this.c != null && this.f != null && this.g != null) {
        Point point = this.f.getParent().getMousePosition();
        if (point != null)
          for (byte b = 0; b < x.g(this.h).size(); b++) {
            s s1 = x.g(this.h).get(b);
            i = ((Integer)this.c.get(b)).intValue() + point.x - this.g.x;
            j = ((Integer)this.d.get(b)).intValue() - this.g.y - point.y;
            s1.setSize(i, j);
          }  
      } 
    } else if (this.f != null) {
      Point point = this.f.getParent().getMousePosition();
      if (point != null && this.f != null)
        for (byte b = 0; b < x.g(this.h).size(); b++) {
          s s1 = x.g(this.h).get(b);
          int i = point.x - ((Integer)this.a.get(b)).intValue();
          int j = point.y - ((Integer)this.b.get(b)).intValue();
          s1.setLocation(i, j);
        }  
    } 
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    if (!this.h.isEnabled())
      return; 
    s s1 = (this.f != null) ? this.f : a(paramMouseEvent);
    if (s1.hasFocus() && paramMouseEvent.getX() > s1.getWidth() - x.h(this.h) && paramMouseEvent.getY() > s1.getHeight() - x.h(this.h)) {
      this.h.setCursor(Cursor.getPredefinedCursor(5));
    } else if (this.h.getCursor().getType() != 0) {
      this.h.setCursor(Cursor.getDefaultCursor());
    } 
  }
  
  private s a(MouseEvent paramMouseEvent) {
    s s1 = (s)paramMouseEvent.getSource();
    s s2 = this.h.a(s1.getX() + paramMouseEvent.getX(), s1.getY() + paramMouseEvent.getY());
    return (s2 == null) ? s1 : s2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */