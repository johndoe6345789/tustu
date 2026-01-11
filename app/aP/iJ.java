package aP;

import bH.D;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import r.a;

public class iJ extends JWindow {
  JLabel a = new JLabel("Starting " + a.b + " " + a.c + " " + a.a);
  
  String[] b = new String[] { "Get a better tune and Faster with VE Analyze Live!", "Load Crank Trigger logs and page through data", "Advanced 3D table features and customizations", "Support the effort to bring you better tuning tools!", "Full Screen Dashboards", "Get a Wide Selection of Gauge styles and dashboards", "Toggle from 2D to 3D view on any table", "Have multiple Tabbed dashboards open at all times", "Difference Reports - Compare your tune to a saved state or ECU", "Save comments with any setting" };
  
  public iJ(Frame paramFrame, String paramString, boolean paramBoolean) {
    super(paramFrame);
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    add("Center", jPanel);
    jPanel.setBorder(BorderFactory.createRaisedBevelBorder());
    this.a.setBorder(BorderFactory.createEtchedBorder());
    if (paramBoolean) {
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new BorderLayout());
      int k = (int)Math.round(Math.random() * (this.b.length - 1));
      jPanel1.add("Center", new JLabel(this.b[k], 2));
      JButton jButton = new JButton("Learn More!");
      jButton.addActionListener(new iK(this));
      jPanel1.add("East", jButton);
      jPanel.add("North", jPanel1);
    } 
    jPanel.add("South", this.a);
    Image image = Toolkit.getDefaultToolkit().getImage(paramString);
    char c1 = 'ľ';
    char c2 = 'Ę';
    MediaTracker mediaTracker = new MediaTracker(this);
    mediaTracker.addImage(image, 0);
    try {
      mediaTracker.waitForAll(2000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(iJ.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    if (image.getHeight(null) > eJ.a(c1)) {
      image = eJ.a(image, this, c1);
    } else if (image.getHeight(null) < eJ.a(c2)) {
      image = eJ.a(image, this, c2);
    } 
    ImageIcon imageIcon = new ImageIcon(image);
    JLabel jLabel = new JLabel();
    jLabel.setIcon(imageIcon);
    jPanel.add("Center", jLabel);
    pack();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int i = (dimension.width - (getSize()).width) / 2;
    int j = (dimension.height - (getSize()).height) / 2;
    setLocation(i, j);
    setVisible(true);
  }
  
  public boolean imageUpdate(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    D.c("info: " + paramInt1 + ", width:" + paramInt4 + ", height:" + paramInt5);
    return super.imageUpdate(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void a(String paramString) {
    this.a.setText(paramString);
    this.a.repaint();
  }
  
  public String a() {
    return this.a.getText();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */