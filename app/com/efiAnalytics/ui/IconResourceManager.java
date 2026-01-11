package com.efiAnalytics.ui;

import V.a;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;

public class IconResourceManager {
  private static cO av = null;
  
  private static int aw = 0;
  
  public static final int a = aw++;
  
  public static final int b = aw++;
  
  public static final int c = aw++;
  
  public static final int d = aw++;
  
  public static final int e = aw++;
  
  public static final int f = aw++;
  
  public static final int g = aw++;
  
  public static final int h = aw++;
  
  public static final int i = aw++;
  
  public static final int j = aw++;
  
  public static final int k = aw++;
  
  public static final int l = aw++;
  
  public static final int m = aw++;
  
  public static final int n = aw++;
  
  public static final int o = aw++;
  
  public static final int p = aw++;
  
  public static final int q = aw++;
  
  public static final int r = aw++;
  
  public static final int s = aw++;
  
  public static final int t = aw++;
  
  public static final int u = aw++;
  
  public static final int v = aw++;
  
  public static final int w = aw++;
  
  public static final int x = aw++;
  
  public static final int y = aw++;
  
  public static final int z = aw++;
  
  public static final int A = aw++;
  
  public static final int B = aw++;
  
  public static final int C = aw++;
  
  public static final int D = aw++;
  
  public static final int E = aw++;
  
  public static final int F = aw++;
  
  public static final int G = aw++;
  
  public static final int H = aw++;
  
  public static final int I = aw++;
  
  public static final int J = aw++;
  
  public static final int K = aw++;
  
  public static final int L = aw++;
  
  public static final int M = aw++;
  
  public static final int N = aw++;
  
  public static final int O = aw++;
  
  public static final int P = aw++;
  
  public static final int Q = aw++;
  
  public static final int R = aw++;
  
  public static final int S = aw++;
  
  public static final int T = aw++;
  
  public static final int U = aw++;
  
  public static final int V = aw++;
  
  public static final int W = aw++;
  
  public static final int X = aw++;
  
  public static final int Y = aw++;
  
  public static final int Z = aw++;
  
  public static final int aa = aw++;
  
  public static final int ab = aw++;
  
  public static final int ac = aw++;
  
  public static final int ad = aw++;
  
  public static final int ae = aw++;
  
  public static final int af = aw++;
  
  public static final int ag = aw++;
  
  public static final int ah = aw++;
  
  public static final int ai = aw++;
  
  public static final int aj = aw++;
  
  public static final int ak = aw++;
  
  public static final int al = aw++;
  
  public static final int am = aw++;
  
  public static final int an = aw++;
  
  public static final int ao = aw++;
  
  public static final int ap = aw++;
  
  public static final int aq = aw++;
  
  public static final int ar = aw++;
  
  public static final int as = aw++;
  
  public static final int at = aw++;
  
  public static final int au = aw++;
  
  private HashMap ax = new HashMap<>();
  
  public static cO a() {
    if (av == null)
      av = new cO(); 
    return av;
  }
  
  public Image a(int paramInt1, Component paramComponent, int paramInt2) {
    null = a(paramInt1);
    return eJ.a(null, paramComponent, paramInt2);
  }
  
  public Image a(int paramInt, Component paramComponent) {
    null = a(paramInt);
    return eJ.a(null, paramComponent);
  }
  
  public Image a(int paramInt) {
    if (paramInt == a)
      return a("resources/add20.png"); 
    if (paramInt == b)
      return a("resources/delete20.png"); 
    if (paramInt == c)
      return a("resources/Help20.png"); 
    if (paramInt == d)
      return a("resources/add24.png"); 
    if (paramInt == e)
      return a("resources/delete24.png"); 
    if (paramInt == f)
      return a("resources/Help24.png"); 
    if (paramInt == g)
      return a("resources/add32.png"); 
    if (paramInt == h)
      return a("resources/delete32.png"); 
    if (paramInt == i)
      return a("resources/Help32.png"); 
    if (paramInt == j)
      return a("resources/start_log_32.png"); 
    if (paramInt == l)
      return a("resources/stop_32.png"); 
    if (paramInt == k)
      return a("resources/play_32.png"); 
    if (paramInt == m)
      return a("resources/folder-open_32.png"); 
    if (paramInt == n)
      return a("resources/start_log_24.png"); 
    if (paramInt == p)
      return a("resources/stop_24.png"); 
    if (paramInt == o)
      return a("resources/play_24.png"); 
    if (paramInt == r)
      return a("resources/folder-open_24.png"); 
    if (paramInt == s)
      return a("resources/settings-icon_24.png"); 
    if (paramInt == t)
      return a("resources/settings-icon_32.png"); 
    if (paramInt == u)
      return a("resources/wait_blue_128.gif"); 
    if (paramInt == v)
      return a("resources/wait_blue_256.gif"); 
    if (paramInt == w)
      return a("resources/wait_greyballs_480.gif"); 
    if (paramInt == x)
      return a("resources/wait_greyballs_150.gif"); 
    if (paramInt == C)
      return a("resources/mlv24.png"); 
    if (paramInt == D)
      return a("resources/mlv32.png"); 
    if (paramInt == E)
      return a("resources/mlv32_disabled.png"); 
    if (paramInt == F)
      return a("resources/mlv32_main.png"); 
    if (paramInt == G)
      return a("resources/mlv32_compare.png"); 
    if (paramInt == H)
      return a("resources/new16.gif"); 
    if (paramInt == I)
      return a("resources/new24.gif"); 
    if (paramInt == J)
      return a("resources/move_24.png"); 
    if (paramInt == N)
      return a("resources/resize_circle_Horiz_24.png"); 
    if (paramInt == O)
      return a("resources/resize_circle_Horiz_32.png"); 
    if (paramInt == K)
      return a("resources/animatedFirmwareLoading.gif"); 
    if (paramInt == M)
      return a("resources/checkbox-checked_32.png"); 
    if (paramInt == L)
      return a("resources/checkbox-unchecked_32.png"); 
    if (paramInt == P)
      return a("resources/save_24.png"); 
    if (paramInt == Q)
      return a("resources/filter-16.png"); 
    if (paramInt == R)
      return a("resources/filter-24.png"); 
    if (paramInt == S)
      return a("resources/fit_to.png"); 
    if (paramInt == T)
      return a("resources/refresh_32.png"); 
    if (paramInt == B)
      return a("resources/bluetooth300.png"); 
    if (paramInt == U)
      return a("resources/burn_24.png"); 
    if (paramInt == V)
      return a("resources/burn_32.png"); 
    if (paramInt == W)
      return a("resources/burn_128.png"); 
    if (paramInt == X)
      return a("resources/burn_disabled_24.png"); 
    if (paramInt == Y)
      return a("resources/burn_disabled_32.png"); 
    if (paramInt == Z)
      return a("resources/burn_disabled_128.png"); 
    if (paramInt == y)
      return a("resources/menu-three-outlined-bars-narrow.png"); 
    if (paramInt == z)
      return a("resources/menu-three-outlined-bars-64.png"); 
    if (paramInt == aa)
      return a("resources/play_24.png"); 
    if (paramInt == ab)
      return a("resources/play_32.png"); 
    if (paramInt == ac)
      return a("resources/forward.gif"); 
    if (paramInt == q)
      return a("resources/stop.gif"); 
    if (paramInt == af)
      return a("resources/BigStuff3logoSquareWhite120.png"); 
    if (paramInt == ag)
      return a("resources/share_120.png"); 
    if (paramInt == A)
      return a("resources/Danger_64.png"); 
    if (paramInt == ad)
      return a("resources/undo.gif"); 
    if (paramInt == ae)
      return a("resources/redo.gif"); 
    if (paramInt == ah)
      return a("resources/up_icon128.png"); 
    if (paramInt == ai)
      return a("resources/down_128.png"); 
    if (paramInt == aj)
      return a("resources/UpBlueArrow.png"); 
    if (paramInt == ak)
      return a("resources/DownBlueArrow.png"); 
    if (paramInt == am)
      return a("resources/LeftBlueArrow.png"); 
    if (paramInt == al)
      return a("resources/RightBlueArrow.png"); 
    if (paramInt == an)
      return a("resources/UpBlueArrow_22.png"); 
    if (paramInt == ao)
      return a("resources/DownBlueArrow_22.png"); 
    if (paramInt == aq)
      return a("resources/LeftBlueArrow_22.png"); 
    if (paramInt == ap)
      return a("resources/RightBlueArrow_22.png"); 
    if (paramInt == ar)
      return a("resources/fullscreen.png"); 
    if (paramInt == as)
      return a("resources/close32.png"); 
    if (paramInt == au)
      return a("resources/more64.png"); 
    throw new a("Unknown Resource Image.");
  }
  
  public Image a(String paramString) {
    Image image = (Image)this.ax.get(paramString);
    if (image == null) {
      image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(paramString));
      this.ax.put(paramString, image);
    } 
    return image;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */