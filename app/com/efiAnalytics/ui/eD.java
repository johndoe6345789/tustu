package com.efiAnalytics.ui;

import com.sun.javafx.application.PlatformImpl;
import java.awt.BorderLayout;
import java.awt.Component;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.JPanel;

public class eD extends JPanel {
  private Stage a;
  
  private WebView b;
  
  private JFXPanel c;
  
  private JButton d;
  
  private WebEngine e;
  
  public eD() {
    a();
  }
  
  private void a() {
    this.c = new JFXPanel();
    b();
    setLayout(new BorderLayout());
    add((Component)this.c, "Center");
    this.d = new JButton();
    this.d.addActionListener(new eE(this));
    this.d.setText("Reload");
    this.c.addComponentListener(new eG(this));
  }
  
  private void b() {
    PlatformImpl.startup(new eI(this));
  }
  
  private void c() {
    int i = getParent().getWidth();
    int j = getParent().getHeight();
    this.b.setMinSize(i, j);
    this.b.setPrefSize(i, j);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */