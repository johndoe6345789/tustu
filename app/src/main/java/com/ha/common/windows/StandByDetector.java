package com.ha.common.windows;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class StandByDetector {
  private b a;

  public StandByDetector(b paramb) {
    this.a = paramb;
    init();
  }

  private native boolean init();

  public native void setAllowStandby(boolean paramBoolean);

  public static void main(String[] paramArrayOfString) {
    StandByDetector standByDetector = new StandByDetector(new a());
    standByDetector.setAllowStandby(false);
    JFrame jFrame = new JFrame();
    jFrame.getContentPane().add(new JLabel("close to end test"));
    jFrame.setSize(300, 100);
    jFrame.setVisible(true);
    jFrame.setDefaultCloseOperation(3);
  }

  static {
    System.loadLibrary("StandByDetector");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/ha/common/windows/StandByDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
