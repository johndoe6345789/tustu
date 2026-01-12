package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.event.MouseInputAdapter;

public class ProgressPanel extends JPanel implements KeyListener, Serializable {
  JProgressBar a = new JProgressBar(0, 100);

  JLabel b = new JLabel();

  private boolean g = false;

  Image c = null;

  MouseInputAdapter d = new dP(this);

  JButton e = new JButton();

  int f = 550;

  public ProgressPanel() {
    setLayout(new GridBagLayout());
    setOpaque(false);
    this.a.setIndeterminate(true);
    this.a.setStringPainted(true);
    JPanel jPanel = new JPanel();
    jPanel.setBorder(
        BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.gray),
            BorderFactory.createEmptyBorder(10, 10, 0, 10)));
    jPanel.setLayout(new BorderLayout(10, 10));
    jPanel.add("North", this.a);
    jPanel.add("Center", this.b);
    jPanel.add("East", this.e);
    this.e.setVisible(false);
    add(jPanel, new GridBagConstraints());
    this.b.setMinimumSize(eJ.a(this.f, 20));
    this.b.setPreferredSize(eJ.a(this.f, 20));
  }

  public void a(int paramInt) {
    this.f = paramInt;
    this.b.setMinimumSize(eJ.a(paramInt, 20));
    this.b.setPreferredSize(eJ.a(paramInt, 20));
  }

  public void a(String paramString, ActionListener paramActionListener) {
    this.e.setVisible(true);
    this.e.setText(paramString);
    this.e.addActionListener(paramActionListener);
    validate();
  }

  public void a() {
    this.e.setVisible(false);
  }

  public void a(boolean paramBoolean) {
    this.a.setVisible(paramBoolean);
    if (paramBoolean) {
      this.b.setMinimumSize(eJ.a(this.f, 20));
      this.b.setPreferredSize(eJ.a(this.f, 20));
      this.b.setFont(UIManager.getFont("Label.font"));
    } else {
      this.b.setMinimumSize(eJ.a(this.f, 40));
      this.b.setPreferredSize(eJ.a(this.f, 40));
      Font font = new Font("Arial Unicode MS", 1, eJ.a(26));
      this.b.setFont(font);
    }
  }

  public void paint(Graphics paramGraphics) {
    if (this.g) {
      Image image = c();
      paramGraphics.drawImage(image, 0, 0, this);
    }
    super.paint(paramGraphics);
  }

  private Image c() {
    if (this.c == null
        || this.c.getWidth(this) != getWidth()
        || this.c.getHeight(this) != getHeight()) {
      GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
      GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
      this.c = graphicsConfiguration.createCompatibleImage(getWidth(), getHeight(), 3);
      Graphics2D graphics2D = (Graphics2D) this.c.getGraphics();
      Color color = new Color(64, 64, 64, 96);
      graphics2D.setColor(color);
      graphics2D.fillRect(0, 0, getWidth(), getHeight());
    }
    return this.c;
  }

  public void a(double paramDouble) {
    if (paramDouble < 0.0D || paramDouble > 100.0D) {
      this.a.setValue(0);
      this.a.setIndeterminate(true);
    } else {
      this.a.setIndeterminate(false);
      this.a.setValue((int) (paramDouble * 100.0D));
    }
  }

  public void a(String paramString) {
    this.b.setText(paramString);
  }

  public void b(boolean paramBoolean) {
    this.g = paramBoolean;
    if (paramBoolean) {
      addMouseListener(this.d);
      addMouseMotionListener(this.d);
      addKeyListener(this);
    } else {
      removeMouseListener(this.d);
      removeMouseMotionListener(this.d);
      removeKeyListener(this);
    }
  }

  public void setVisible(boolean paramBoolean) {
    super.setVisible(paramBoolean);
    d();
  }

  private void d() {
    int i = eJ.a(110);
    if (isShowing() && getWidth() > 0 && getWidth() < eJ.a(this.f) + i) {
      int j = getWidth() - i;
      this.b.setMinimumSize(eJ.a(j, 20));
      this.b.setPreferredSize(eJ.a(j, 20));
      doLayout();
    } else if (this.b.getWidth() != this.f) {
      this.b.setMinimumSize(eJ.a(this.f, 20));
      this.b.setPreferredSize(eJ.a(this.f, 20));
      doLayout();
    }
  }

  public void keyPressed(KeyEvent paramKeyEvent) {
    paramKeyEvent.consume();
  }

  public void keyTyped(KeyEvent paramKeyEvent) {
    paramKeyEvent.consume();
  }

  public void keyReleased(KeyEvent paramKeyEvent) {
    paramKeyEvent.consume();
  }

  public void b() {
    this.a.setValue(0);
    this.a.setIndeterminate(true);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
