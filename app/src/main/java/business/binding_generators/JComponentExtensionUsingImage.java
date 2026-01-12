package business.binding_generators;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.UIManager;

class JComponentExtensionUsingImage extends JComponent {
  private Image b = null;

  JComponentExtensionUsingImage(a parama) {}

  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (this.b != null) {
      paramGraphics.drawImage(this.b, 0, 0, getWidth(), getHeight(), null);
    } else {
      paramGraphics.setColor(UIManager.getColor("Label.foreground"));
      paramGraphics.drawString("Tune View Preview", 10, 20);
    }
  }

  public void a(File paramFile) {
    try {
      BufferedImage bufferedImage = ImageIO.read(paramFile);
      this.b = bufferedImage;
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName())
          .log(Level.SEVERE, "Failed to load preview image", iOException);
    }
    repaint();
  }

  private void a() {
    this.b = null;
    repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bg/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
