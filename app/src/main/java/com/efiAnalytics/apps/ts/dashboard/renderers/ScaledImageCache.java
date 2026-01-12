package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.s;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScaledImageCache {
  private static ScaledImageCache b = null;

  private int c = 5;

  HashMap a = new HashMap<>();

  public static ScaledImageCache a() {
    if (b == null) b = new ScaledImageCache();
    return b;
  }

  public Image a(String paramString, int paramInt, Component paramComponent) {
    HashMap<Object, Object> hashMap = (HashMap) this.a.get(paramString);
    if (hashMap == null) {
      hashMap = new HashMap<>();
      this.a.put(paramString, hashMap);
    }
    Image image = (Image) hashMap.get(Integer.valueOf(paramInt));
    if (image == null) {
      image = Toolkit.getDefaultToolkit().getImage(paramString);
      MediaTracker mediaTracker = new MediaTracker(paramComponent);
      mediaTracker.addImage(image, 0);
      try {
        mediaTracker.waitForAll(250L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(s.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
      if (image.getWidth(null) <= 0 && image.getHeight(null) <= 0) return image;
      int i = image.getWidth(null) * paramInt / image.getHeight(null);
      if (i > 0 && paramInt > 0) {
        image = image.getScaledInstance(i, paramInt, 4);
        hashMap.put(Integer.valueOf(paramInt), image);
      }
    }
    if (hashMap.size() > this.c) {
      ArrayList arrayList = new ArrayList();
      arrayList.addAll(hashMap.keySet());
      for (Integer integer : arrayList) {
        if (integer.intValue() != paramInt) hashMap.remove(integer);
      }
    }
    return image;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
