package com.efiAnalytics.ui;

import bH.D;
import bH.X;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JWindow;
import javax.swing.border.Border;

public class CommentBoxWindow extends JWindow {
  JTextPane a = new JTextPane();
  
  ArrayList b = new ArrayList();
  
  bn c = null;
  
  Image d = null;
  
  Insets e = eJ.a(new Insets(44, 12, 12, 12));
  
  Image f = null;
  
  boolean g = false;
  
  boolean h = false;
  
  public CommentBoxWindow(Window paramWindow, String paramString) {
    this(paramWindow, paramString, false);
    a();
  }
  
  public CommentBoxWindow(Window paramWindow, String paramString, boolean paramBoolean) {
    super(paramWindow);
    a();
    setBackground(new Color(0, 0, 0, 0));
    this.h = paramBoolean;
    this.g = fp.c();
    if (!this.g)
      D.b("Translucent Windows not supported on this PC."); 
    d();
    this.a.setBackground(new Color(255, 255, 153, 255));
    this.a.putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
    if (paramBoolean && !paramString.startsWith("<html"))
      paramString = "<html>" + paramString; 
    if (paramBoolean) {
      this.a.setContentType("text/html");
      paramString = X.b(paramString, "\n", "<br>");
      paramString = a(paramString);
    } 
    this.a.addHyperlinkListener(new bj(this));
    this.a.setText(paramString);
    this.a.setForeground(Color.BLACK);
    this.a.setEditable(!paramBoolean);
    this.a.setCaretPosition(0);
    this.c = new bn(this, this);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.c);
    bk bk = new bk(this);
    addFocusListener(bk);
    this.a.addFocusListener(bk);
    if (paramBoolean) {
      this.d = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/commentBoxReadOnly.png"));
    } else {
      this.d = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/commentBox.png"));
    } 
    this.d = eJ.a(this.d, this);
    addMouseListener(new bo(this));
  }
  
  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(new Color(245, 245, 143));
    if (this.h) {
      paramGraphics.fill3DRect(eJ.a(278), eJ.a(13), eJ.a(35), eJ.a(48), true);
    } else {
      paramGraphics.fill3DRect(eJ.a(230), eJ.a(13), eJ.a(83), eJ.a(50), true);
    } 
    paramGraphics.drawImage(this.d, 0, 0, null);
    paintComponents(paramGraphics);
  }
  
  public void a() {
    if (!this.g);
  }
  
  public Insets getInsets() {
    return this.e;
  }
  
  private void d() {
    setLayout(new BorderLayout());
    JScrollPane jScrollPane = new JScrollPane(this.a);
    jScrollPane.setBorder((Border)null);
    add("Center", jScrollPane);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (!this.h) {
      JButton jButton1 = new JButton("Delete");
      jButton1.addActionListener(new bl(this));
      jPanel.add(jButton1);
    } 
    JButton jButton = new JButton("Save");
    jButton.addActionListener(new bm(this));
    jPanel.add(jButton);
  }
  
  protected void b() {
    e();
    dispose();
  }
  
  protected void c() {
    f();
    dispose();
  }
  
  public void dispose() {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.c);
    super.dispose();
  }
  
  private void e() {
    Iterator<fi> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((fi)iterator.next()).a(this.a.getText()); 
  }
  
  private void f() {
    Iterator<fi> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((fi)iterator.next()).a(); 
  }
  
  public void a(fi paramfi) {
    this.b.add(paramfi);
  }
  
  private String a(String paramString) {
    String[] arrayOfString = paramString.split("<br>");
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str = arrayOfString[b];
      if (!str.contains("<a h") && (str.contains("http://") || str.contains("https://"))) {
        int i = str.contains("http:") ? str.indexOf("http://") : str.indexOf("https://");
        int j = str.indexOf(" ", i);
        if (j == -1)
          j = str.length(); 
        String str1 = str.substring(0, i);
        String str2 = str.substring(i, j);
        String str3 = (j < str.length()) ? str.substring(j) : "";
        stringBuilder.append(str1);
        stringBuilder.append("<a href=\"").append(str2).append("\">").append(str2).append("</a>");
        stringBuilder.append(str3);
      } else {
        stringBuilder.append(str);
      } 
      if (b < arrayOfString.length - 1)
        stringBuilder.append("<br>"); 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */