package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JDialog;

public class MessageDialog extends JDialog implements ActionListener {
  public boolean a = false;
  
  JButton b;
  
  JButton c;
  
  public MessageDialog(Frame paramFrame, String paramString, boolean paramBoolean) {
    super(paramFrame, "Message", true);
    setLayout(new BorderLayout());
    Panel panel = new Panel();
    panel.setLayout(new GridLayout(0, 1));
    add("Center", panel);
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "\n");
    while (stringTokenizer.hasMoreElements())
      panel.add(new Label(stringTokenizer.nextToken())); 
    add(new Label(""), "West");
    add(new Label(""), "East");
    add(new Label(""), "North");
    a(paramBoolean);
    pack();
    Dimension dimension1 = (paramFrame != null) ? paramFrame.getSize() : Toolkit.getDefaultToolkit().getScreenSize();
    Dimension dimension2 = getSize();
    Point point = (paramFrame != null) ? paramFrame.getLocation() : new Point(0, 0);
    if (point.getX() <= 0.0D || point.getY() <= 0.0D) {
      dimension1 = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation((int)(point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D), (int)(point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    } else {
      setLocation((int)(point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D), (int)(point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    } 
    setVisible(true);
  }
  
  protected void a(boolean paramBoolean) {
    Panel panel = new Panel();
    panel.setLayout(new FlowLayout());
    a(panel, paramBoolean);
    if (paramBoolean == true)
      a(panel); 
    add("South", panel);
  }
  
  protected void a(Panel paramPanel, boolean paramBoolean) {
    if (paramBoolean) {
      paramPanel.add(this.b = new JButton("Yes"));
    } else {
      paramPanel.add(this.b = new JButton("Ok"));
    } 
    this.b.addActionListener(this);
  }
  
  protected void a(Panel paramPanel) {
    paramPanel.add(this.c = new JButton("No"));
    this.c.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.b) {
      this.a = true;
      setVisible(false);
    } else if (paramActionEvent.getSource() == this.c) {
      setVisible(false);
    } 
  }
  
  public static void a(String paramString, Component paramComponent) {
    Frame frame = a(paramComponent);
    dk dk1 = new dk(frame, paramString, false);
    dk1.requestFocus();
    dk1.dispose();
  }
  
  public static Frame a(Component paramComponent) {
    while (paramComponent != null && !(paramComponent instanceof Frame))
      paramComponent = paramComponent.getParent(); 
    return (Frame)paramComponent;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */