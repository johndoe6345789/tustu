package t;

import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class JPanelExtensionInTPackage extends JPanel {
  File a;
  
  int b = eJ.a(120);
  
  JLabel c = new JLabel("", 0);
  
  JLabel d = new JLabel("", 0);
  
  public JPanelExtensionInTPackage(aj paramaj, File paramFile) {
    this.d.setAlignmentX(0.5F);
    this.d.setAlignmentY(0.5F);
    this.d.setPreferredSize(new Dimension(this.b, this.b));
    this.d.setMinimumSize(new Dimension(this.b, this.b));
    this.c.setPreferredSize(new Dimension(this.b, getFont().getSize()));
    this.c.setMinimumSize(new Dimension(this.b, getFont().getSize()));
    setLayout(new BorderLayout());
    add("Center", this.d);
    add("South", this.c);
    a(paramFile);
  }
  
  public JPanelExtensionInTPackage(aj paramaj, int paramInt) {
    this.b = paramInt;
    this.d.setAlignmentX(0.5F);
    this.d.setAlignmentY(0.5F);
    this.d.setPreferredSize(new Dimension(paramInt, paramInt));
    this.d.setMinimumSize(new Dimension(paramInt, paramInt));
    this.c.setPreferredSize(new Dimension(paramInt, getFont().getSize()));
    this.c.setMinimumSize(new Dimension(paramInt, getFont().getSize()));
    setLayout(new BorderLayout());
    add("Center", this.d);
    add("South", this.c);
  }
  
  public void a(File paramFile) {
    this.a = paramFile;
    if (paramFile != null && paramFile.exists()) {
      Image image = Toolkit.getDefaultToolkit().getImage(paramFile.getAbsolutePath());
      MediaTracker mediaTracker = new MediaTracker(this);
      mediaTracker.addImage(image, 1);
      try {
        mediaTracker.waitForAll(250L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
      mediaTracker.removeImage(image, 1);
      float f = (image.getWidth(null) > image.getHeight(null)) ? (this.b / image.getWidth(null)) : (this.b / image.getHeight(null));
      ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(Math.round(image.getWidth(null) * f), Math.round(image.getHeight(null) * f), 1));
      this.d.setIcon(imageIcon);
      this.c.setText(paramFile.getName());
      repaint();
    } else {
      this.d.setIcon((Icon)null);
      this.c.setText("");
      repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/ar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */