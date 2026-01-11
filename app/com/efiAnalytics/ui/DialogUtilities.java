package com.efiAnalytics.ui;

import W.ap;
import X.d;
import bH.D;
import bH.ab;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.KeyStroke;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

public class DialogUtilities {
  static String a = null;
  
  static JFileChooser b = null;
  
  static JFileChooser c = null;
  
  static JFileChooser d = null;
  
  static JColorChooser e = null;
  
  static Color f = Color.black;
  
  static ab g = null;
  
  private static Window j = null;
  
  static bU h = null;
  
  private static File k = null;
  
  static boolean i = false;
  
  public static void a(ab paramab) {
    g = paramab;
  }
  
  public static ab a() {
    return g;
  }
  
  private static String b(String paramString) {
    if (g != null)
      paramString = g.a(paramString); 
    return paramString;
  }
  
  public static JDialog a(Window paramWindow, String paramString) {
    JDialog jDialog = new JDialog(paramWindow, b("Please wait"));
    jDialog.setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setBorder(BorderFactory.createTitledBorder(b("Please wait")));
    jPanel.setLayout(new BorderLayout(10, 10));
    JLabel jLabel = new JLabel(paramString, 0);
    jPanel.add("Center", jLabel);
    JProgressBar jProgressBar = new JProgressBar(0, 100);
    jProgressBar.setIndeterminate(true);
    jPanel.add("South", jProgressBar);
    jDialog.add("Center", jPanel);
    jDialog.pack();
    jDialog.setSize(jDialog.getWidth() + 50, jDialog.getHeight() + 30);
    a(paramWindow, jDialog);
    jDialog.setAlwaysOnTop(true);
    jDialog.setVisible(true);
    return jDialog;
  }
  
  public static Rectangle a(Rectangle paramRectangle) {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = graphicsEnvironment.getScreenDevices();
    boolean bool = true;
    for (byte b = 0; b < arrayOfGraphicsDevice.length; b++) {
      GraphicsDevice graphicsDevice = arrayOfGraphicsDevice[b];
      Rectangle rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
      if (rectangle.contains(paramRectangle.x, paramRectangle.y) || rectangle.contains(paramRectangle.x + paramRectangle.width, paramRectangle.y) || rectangle.contains(paramRectangle.x + paramRectangle.width, paramRectangle.y + paramRectangle.height) || rectangle.contains(paramRectangle.x, paramRectangle.y + paramRectangle.height)) {
        bool = false;
        if (paramRectangle.x < rectangle.x)
          paramRectangle.x = rectangle.x; 
        if (paramRectangle.y < rectangle.y)
          paramRectangle.y = rectangle.y; 
        if (paramRectangle.width > rectangle.width)
          paramRectangle.width = rectangle.width; 
        if (paramRectangle.height > rectangle.height)
          paramRectangle.height = rectangle.height; 
        if (paramRectangle.x + paramRectangle.width > rectangle.x + rectangle.width)
          paramRectangle.x = rectangle.x + rectangle.width - paramRectangle.width; 
        if (paramRectangle.y + paramRectangle.height > rectangle.y + rectangle.height)
          paramRectangle.y = rectangle.y + rectangle.height - paramRectangle.height; 
        return paramRectangle;
      } 
    } 
    if (bool) {
      Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
      if (paramRectangle.x < 0)
        paramRectangle.x = 0; 
      if (paramRectangle.y < 0)
        paramRectangle.y = 0; 
      if (paramRectangle.x + paramRectangle.width > dimension.width)
        paramRectangle.x = dimension.width - paramRectangle.width; 
      if (paramRectangle.y + paramRectangle.height > dimension.height)
        paramRectangle.y = dimension.height - paramRectangle.height; 
    } 
    return paramRectangle;
  }
  
  public static Rectangle b(Rectangle paramRectangle) {
    if (a(paramRectangle.x, paramRectangle.y) && a(paramRectangle.x + paramRectangle.width, paramRectangle.y) && a(paramRectangle.x, paramRectangle.y + paramRectangle.height) && a(paramRectangle.x + paramRectangle.width, paramRectangle.y + paramRectangle.height))
      return paramRectangle; 
    Point point = b();
    if (paramRectangle.x < 0)
      paramRectangle.x = 0; 
    if (paramRectangle.x > point.x - 100)
      paramRectangle.x = point.x - 100; 
    if (paramRectangle.y < 0)
      paramRectangle.y = 0; 
    if (paramRectangle.y > point.y - 100)
      paramRectangle.y = point.y - 100; 
    return paramRectangle;
  }
  
  public static boolean a(int paramInt1, int paramInt2) {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = graphicsEnvironment.getScreenDevices();
    for (byte b = 0; b < arrayOfGraphicsDevice.length; b++) {
      GraphicsDevice graphicsDevice = arrayOfGraphicsDevice[b];
      Rectangle rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
      if (rectangle.contains(paramInt1, paramInt2))
        return true; 
    } 
    return false;
  }
  
  public static Point b() {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = graphicsEnvironment.getScreenDevices();
    int i = 0;
    int j = 0;
    for (byte b = 0; b < arrayOfGraphicsDevice.length; b++) {
      GraphicsDevice graphicsDevice = arrayOfGraphicsDevice[b];
      Rectangle rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
      if (rectangle.x + rectangle.width > i)
        i = rectangle.x + rectangle.width; 
      if (rectangle.y + rectangle.height > j)
        j = rectangle.y + rectangle.height; 
    } 
    return new Point(i, j);
  }
  
  public static Window c() {
    return j;
  }
  
  public static void a(Window paramWindow) {
    j = paramWindow;
  }
  
  public static void a(bU parambU) {
    h = parambU;
  }
  
  public static Frame a(Component paramComponent) {
    while (paramComponent != null && !(paramComponent instanceof Frame))
      paramComponent = paramComponent.getParent(); 
    return (Frame)paramComponent;
  }
  
  public static Window b(Component paramComponent) {
    while (paramComponent != null && !(paramComponent instanceof Window))
      paramComponent = paramComponent.getParent(); 
    return (Window)paramComponent;
  }
  
  public static String a(Component paramComponent, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3) {
    return a(paramComponent, paramString1, paramArrayOfString, paramString2, paramString3, false, (ck)null);
  }
  
  public static String b(Component paramComponent, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3) {
    return a(paramComponent, paramString1, paramArrayOfString, paramString2, paramString3, true, (ck)null);
  }
  
  public static String a(Component paramComponent, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, ck paramck) {
    return a(paramComponent, paramString1, paramArrayOfString, paramString2, paramString3, false, paramck);
  }
  
  public static String b(Component paramComponent, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, ck paramck) {
    return a(paramComponent, paramString1, paramArrayOfString, paramString2, paramString3, true, paramck);
  }
  
  public static boolean d() {
    String str = System.getProperty("os.name", "Windows");
    return str.startsWith("Win");
  }
  
  public static void a(Window paramWindow, Component paramComponent) {
    int i = paramWindow.getX() + (paramWindow.getWidth() - paramComponent.getWidth()) / 2;
    int j = paramWindow.getY() + (paramWindow.getHeight() - paramComponent.getHeight()) / 2;
    paramComponent.setLocation(i, j);
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    if ((paramComponent.getLocation()).x < 0 || (paramComponent.getLocation()).y < 0 || ((paramComponent.getLocation()).x + paramComponent.getWidth() > dimension.width && !h()) || (paramComponent.getLocation()).y + paramComponent.getHeight() > dimension.height) {
      i = ((paramComponent.getLocation()).x < 0) ? 0 : (paramComponent.getLocation()).x;
      i = (i + paramComponent.getWidth() > dimension.width) ? (dimension.width - paramComponent.getWidth()) : i;
      j = ((paramComponent.getLocation()).y < 0) ? 0 : (paramComponent.getLocation()).y;
      j = (j + paramComponent.getHeight() > dimension.height) ? (dimension.height - paramComponent.getHeight()) : j;
      paramComponent.setLocation(i, j);
    } 
  }
  
  public static void a(Component paramComponent1, Component paramComponent2) {
    int i = (paramComponent1.getLocationOnScreen()).x + (paramComponent1.getWidth() - paramComponent2.getWidth()) / 2;
    int j = (paramComponent1.getLocationOnScreen()).y + (paramComponent1.getHeight() - paramComponent2.getHeight()) / 2;
    paramComponent2.setLocation(i, j);
    Rectangle rectangle = a(paramComponent2.getBounds());
    paramComponent2.setBounds(rectangle);
  }
  
  public static void b(Window paramWindow) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int i = (dimension.width - paramWindow.getWidth()) / 2;
    int j = (dimension.height - paramWindow.getHeight()) / 2;
    paramWindow.setLocation(i, j);
  }
  
  public static String a(Component paramComponent, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, boolean paramBoolean) {
    return a(paramComponent, paramString1, paramArrayOfString, paramString2, paramString3, paramBoolean, (ck)null);
  }
  
  public static String a(Component paramComponent, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, boolean paramBoolean, ck paramck) {
    String[] arrayOfString = a(paramComponent, paramString1, paramArrayOfString, paramString2, paramString3, paramBoolean, paramck, false);
    return (arrayOfString != null && arrayOfString.length > 0) ? arrayOfString[0] : null;
  }
  
  public static String[] a(Component paramComponent, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, boolean paramBoolean1, ck paramck, boolean paramBoolean2) {
    return a(paramComponent, paramString1, paramArrayOfString, paramString2, paramString3, paramBoolean1, paramck, paramBoolean2, null);
  }
  
  public static String[] a(Component paramComponent, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, boolean paramBoolean1, ck paramck, boolean paramBoolean2, ap paramap) {
    boolean bool = true;
    String str = "";
    if (paramArrayOfString != null)
      if (paramArrayOfString.length > 0 && !paramArrayOfString[0].contains(File.separator)) {
        for (byte b = 0; b < paramArrayOfString.length; b++)
          str = str + "*." + paramArrayOfString[b] + ";"; 
        if (str.charAt(str.length() - 1) == ';')
          str = str.substring(0, str.length() - 1); 
      } else {
        str = paramArrayOfString[0].substring(paramArrayOfString[0].lastIndexOf(File.separator) + 1);
      }  
    if (bool) {
      if (b == null) {
        g();
      } else {
        for (FileFilter fileFilter : b.getChoosableFileFilters())
          b.removeChoosableFileFilter(fileFilter); 
      } 
      b.setDialogTitle(paramString1);
      if (paramString3 != null)
        b.setCurrentDirectory(new File(paramString3)); 
      if (paramString2 != null && !paramString2.equals("")) {
        b.setSelectedFile(new File(paramString2));
      } else {
        b.setSelectedFile(new File(""));
      } 
      if (paramck != null) {
        b.setAccessory(paramck);
        b.addPropertyChangeListener(paramck);
      } 
      b.setMultiSelectionEnabled(paramBoolean2);
      if (paramArrayOfString != null && paramArrayOfString.length > 0) {
        String str2 = h.l() + " " + b("files");
        if (paramBoolean1) {
          if (paramArrayOfString.length > 5 && str.length() > 30) {
            str2 = str2 + " (" + str.substring(0, 30) + "....)";
          } else {
            str2 = str2 + " (" + str + ")";
          } 
          dd dd = new dd(str2);
          for (byte b = 0; b < paramArrayOfString.length; b++)
            dd.b(paramArrayOfString[b]); 
          b.addChoosableFileFilter(dd);
          b.setFileFilter(dd);
        } else {
          cx cx = null;
          for (String str3 : paramArrayOfString) {
            cx cx1 = new cx(str3);
            b.addChoosableFileFilter(cx1);
            if (cx == null)
              cx = cx1; 
          } 
          b.setFileFilter(cx);
          b.addPropertyChangeListener("fileFilterChanged", new bW(paramString2));
        } 
      } 
      b.setAcceptAllFileFilterUsed(true);
      if (paramap != null)
        try {
          int j = Integer.parseInt(paramap.b("fdWidth", ""));
          int k = Integer.parseInt(paramap.b("fdHeight", ""));
          if (j > 0 && k > 0)
            b.setPreferredSize(new Dimension(j, k)); 
        } catch (Exception exception) {
          D.b("No File dialog size saved, using defaults.");
        }  
      int i = paramBoolean1 ? b.showOpenDialog(paramComponent) : b.showSaveDialog(paramComponent);
      if (paramck != null) {
        b.setAccessory((JComponent)null);
        b.removePropertyChangeListener(paramck);
      } 
      String str1 = ".";
      if (b.getCurrentDirectory() != null && b.getSelectedFile() != null)
        str1 = b.getCurrentDirectory().getAbsolutePath() + File.separator + b.getSelectedFile().getName(); 
      if (paramap != null) {
        paramap.a("fdWidth", "" + b.getWidth());
        paramap.a("fdHeight", "" + b.getHeight());
      } 
      if (i == 0) {
        if (h != null && h.n() != null)
          h.b(h.n(), b.getCurrentDirectory().getAbsolutePath() + File.separator); 
        j();
        if (paramBoolean2) {
          File[] arrayOfFile = b.getSelectedFiles();
          String[] arrayOfString1 = new String[arrayOfFile.length];
          for (byte b = 0; b < arrayOfFile.length; b++)
            arrayOfString1[b] = b.getCurrentDirectory().getAbsolutePath() + File.separator + arrayOfFile[b].getName(); 
          return arrayOfString1;
        } 
        String[] arrayOfString = new String[1];
        arrayOfString[0] = str1;
        return arrayOfString;
      } 
      return null;
    } 
    FileDialog fileDialog = null;
    if (paramBoolean1) {
      fileDialog = new FileDialog(a(paramComponent), paramString1, 0);
    } else {
      fileDialog = new FileDialog(a(paramComponent), paramString1, 1);
    } 
    fileDialog.setTitle(paramString1);
    fileDialog.setFile(str);
    fileDialog.setDirectory(paramString3);
    fileDialog.setVisible(true);
    if (fileDialog.getFile() != null) {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = fileDialog.getDirectory() + fileDialog.getFile();
      return arrayOfString;
    } 
    return null;
  }
  
  public static String a(String paramString, Component paramComponent) {
    if (c == null) {
      c = new JFileChooser();
      c.setFileSelectionMode(1);
      c.setDialogTitle(b("Select Directory"));
      dd dd = new dd("");
      c.setAcceptAllFileFilterUsed(false);
      c.addChoosableFileFilter(dd);
      if (d()) {
        LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
          SwingUtilities.updateComponentTreeUI(c);
          UIManager.setLookAndFeel(lookAndFeel);
        } catch (Exception exception) {
          D.c("Unable to set windows look & feel on Directory Chooser Dialog");
        } 
      } 
    } 
    c.setCurrentDirectory(new File(paramString));
    int i = c.showDialog(paramComponent, b("Select"));
    return (i == 0) ? c.getSelectedFile().getAbsolutePath() : null;
  }
  
  public static void e() {
    b = null;
    c = null;
    d = null;
  }
  
  public static boolean f() {
    return (d != null);
  }
  
  public static void a(FileView paramFileView) {
    if (d == null) {
      d = new JFileChooser();
      d.setFileSelectionMode(2);
      d.setDialogTitle(b("Open Project"));
      dd dd = new dd("");
      d.addChoosableFileFilter(dd);
      d.setAcceptAllFileFilterUsed(false);
      d.setFileView(paramFileView);
      d.setFileFilter(new bY());
      d.addPropertyChangeListener(new bZ());
    } 
    if (d()) {
      LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
      try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.updateComponentTreeUI(d);
        UIManager.setLookAndFeel(lookAndFeel);
      } catch (Exception exception) {
        try {
          UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception exception1) {
          Logger.getLogger(bV.class.getName()).log(Level.SEVERE, (String)null, exception1);
          D.c("Unable to set cross platform look & feel also on Project Dialog");
        } 
        SwingUtilities.updateComponentTreeUI(d);
        D.c("Unable to set windows look & feel on Project Dialog");
      } 
    } 
  }
  
  public static String a(String paramString1, Component paramComponent, String paramString2, ck paramck) {
    d.setCurrentDirectory(new File(paramString1));
    d.setAccessory(paramck);
    if (paramString2 != null) {
      d.setDialogTitle(b(paramString2));
    } else {
      d.setDialogTitle(b("Open Project"));
    } 
    int i = d.showDialog(paramComponent, b("Select"));
    return (i == 0) ? d.getSelectedFile().getAbsolutePath() : null;
  }
  
  public static String b(String paramString, Component paramComponent) {
    return a(paramString, paramComponent, (String)null, (ck)null);
  }
  
  private static void j() {
    if (k != null) {
      File file = new File(k, "fileChooser.ser");
      if (file.exists())
        file.delete(); 
      d d = new d();
      try {
        d.a(b, file);
      } catch (IOException iOException) {
        D.c("Error saving cached FileChooser: " + iOException.getLocalizedMessage());
        iOException.printStackTrace();
      } 
    } 
  }
  
  public static void g() {
    if (b == null) {
      if (k != null) {
        File file = new File(k, "fileChooser.ser");
        if (file.exists()) {
          d d = new d();
          try {
            b = (JFileChooser)d.a(file);
          } catch (IOException|ClassNotFoundException iOException) {
            D.c("No cached FileChooser found.");
          } 
        } 
      } 
      if (b == null) {
        b = new JFileChooser();
        LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
        if (d() && lookAndFeel.getName().equals("Metal"))
          try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(b);
            UIManager.setLookAndFeel(lookAndFeel);
          } catch (Exception exception) {
            D.c("Unable to set windows look & feel on File Chooser Dialog");
          }  
      } 
      k();
    } 
  }
  
  public static void c(String paramString, Component paramComponent) {
    if (SwingUtilities.isEventDispatchThread()) {
      JOptionPane jOptionPane = new JOptionPane(paramString, 3);
      JDialog jDialog = jOptionPane.createDialog(paramComponent, b("Information"));
      jDialog.setModal(false);
      jDialog.setVisible(true);
    } else {
      ca ca = new ca(paramString, paramComponent);
      SwingUtilities.invokeLater(ca);
    } 
  }
  
  public static void d(String paramString, Component paramComponent) {
    if (SwingUtilities.isEventDispatchThread()) {
      JOptionPane.showMessageDialog(paramComponent, paramString);
    } else {
      cb cb = new cb(paramComponent, paramString);
      try {
        SwingUtilities.invokeAndWait(cb);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(bV.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } catch (InvocationTargetException invocationTargetException) {
        Logger.getLogger(bV.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
      } 
    } 
  }
  
  public static boolean a(String paramString, Component paramComponent, boolean paramBoolean) {
    if (paramBoolean) {
      int i = JOptionPane.showConfirmDialog(paramComponent, paramString, "", 0);
      return (i == 0);
    } 
    d(paramString, paramComponent);
    return true;
  }
  
  public static boolean b(String paramString, Component paramComponent, boolean paramBoolean) {
    if (paramBoolean) {
      int i = JOptionPane.showConfirmDialog(paramComponent, paramString, "", 0, 2);
      return (i == 0);
    } 
    d(paramString, paramComponent);
    return true;
  }
  
  public static boolean a(String paramString1, String paramString2, Component paramComponent, String[] paramArrayOfString) {
    boolean bool = false;
    int i = JOptionPane.showOptionDialog(paramComponent, paramString1, paramString2, 0, 3, null, (Object[])paramArrayOfString, paramArrayOfString[bool]);
    return (i == 0);
  }
  
  public static int b(String paramString1, String paramString2, Component paramComponent, String[] paramArrayOfString) {
    boolean bool = false;
    return JOptionPane.showOptionDialog(paramComponent, paramString1, paramString2, (paramArrayOfString.length == 3) ? 1 : 0, 3, null, (Object[])paramArrayOfString, paramArrayOfString[bool]);
  }
  
  public static String a(Component paramComponent, boolean paramBoolean, String paramString1, String paramString2) {
    fq fq = new fq(b(paramComponent), paramBoolean, paramString1, paramString2, g);
    fq.setVisible(true);
    paramComponent.requestFocus();
    String str = fq.a();
    fq.dispose();
    return str;
  }
  
  public static String a(String paramString, boolean paramBoolean, Component paramComponent) {
    return a(paramString, paramBoolean, (String)null, false, paramComponent);
  }
  
  public static String a(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, Component paramComponent) {
    fs fs = new fs(a(paramComponent), paramString1, paramBoolean1, paramString2, paramBoolean2);
    paramComponent.requestFocus();
    fs.dispose();
    return fs.a();
  }
  
  public static String a(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, Component paramComponent, String[] paramArrayOfString) {
    fs fs = new fs(a(paramComponent), paramString1, paramBoolean1, paramString2, paramBoolean2, paramArrayOfString);
    paramComponent.requestFocus();
    fs.dispose();
    return fs.a();
  }
  
  public static String a(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, Component paramComponent, fx paramfx, fy paramfy) {
    return a(paramString1, paramBoolean1, paramString2, paramBoolean2, paramComponent, paramfx, paramfy, (ab)null);
  }
  
  public static String a(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, Component paramComponent, fx paramfx, fy paramfy, ab paramab) {
    fs fs = new fs(a(paramComponent), paramString1, paramBoolean1, paramString2, paramBoolean2, paramfx, paramfy, paramab);
    paramComponent.requestFocus();
    fs.dispose();
    return fs.a();
  }
  
  public static Color a(Component paramComponent, String paramString, Color paramColor) {
    if (e == null)
      e = new JColorChooser(); 
    e.setColor(paramColor);
    f = paramColor;
    JDialog jDialog = JColorChooser.createDialog(paramComponent, paramString, true, e, new cc(), new cd());
    Point point = paramComponent.getMousePosition();
    if (point != null) {
      Point point1 = paramComponent.getLocationOnScreen();
      jDialog.setLocation(point.x + point1.x - jDialog.getWidth() / 2, point.y + point1.y - jDialog.getHeight() / 2);
      Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
      if ((jDialog.getLocation()).x < 0 || (jDialog.getLocation()).y < 0 || (jDialog.getLocation()).x + jDialog.getWidth() > dimension.width || (jDialog.getLocation()).y + jDialog.getHeight() > dimension.height) {
        byte b1 = ((jDialog.getLocation()).x < 0) ? 0 : (jDialog.getLocation()).x;
        b1 = (b1 + jDialog.getWidth() > dimension.width) ? (dimension.width - jDialog.getWidth()) : b1;
        byte b2 = ((jDialog.getLocation()).y < 0) ? 0 : (jDialog.getLocation()).y;
        b2 = (b2 + jDialog.getHeight() > dimension.height) ? (dimension.height - jDialog.getHeight()) : b2;
        jDialog.setLocation(b1, b2);
      } 
    } 
    jDialog.setVisible(true);
    return e.getColor();
  }
  
  public static JDialog a(Component paramComponent1, Component paramComponent2, String paramString, bc parambc) {
    paramString = b(paramString);
    JDialog jDialog = b(paramComponent1, paramComponent2, paramString, parambc);
    jDialog.pack();
    if (paramComponent2 != null)
      a(b(paramComponent2), jDialog); 
    jDialog.setVisible(true);
    return jDialog;
  }
  
  public static JDialog b(Component paramComponent1, Component paramComponent2, String paramString, bc parambc) {
    return a(paramComponent1, paramComponent2, paramString, parambc, "Close");
  }
  
  public static JDialog a(Component paramComponent1, Component paramComponent2, String paramString1, bc parambc, String paramString2) {
    Window window = b(paramComponent2);
    if (window != null && !(window instanceof Frame) && !(window instanceof java.awt.Dialog))
      window = null; 
    JDialog jDialog = new JDialog(window, paramString1);
    jDialog.add("Center", paramComponent1);
    JButton jButton = new JButton(b(paramString2));
    jButton.addActionListener(new ce());
    if (parambc != null)
      jButton.addActionListener(new bb(parambc)); 
    jDialog.enableInputMethods(true);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(jButton);
    jDialog.add("South", jPanel);
    return jDialog;
  }
  
  public static void a(Container paramContainer, boolean paramBoolean) {
    for (byte b = 0; b < paramContainer.getComponentCount(); b++) {
      Component component = paramContainer.getComponent(b);
      component.setEnabled(paramBoolean);
      if (component instanceof Container)
        a((Container)component, paramBoolean); 
    } 
  }
  
  public static boolean h() {
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = graphicsEnvironment.getScreenDevices();
    return (arrayOfGraphicsDevice != null && arrayOfGraphicsDevice.length > 1);
  }
  
  public static String a(Component paramComponent, String paramString) {
    Window window = b(paramComponent);
    JPanel jPanel = new JPanel();
    JLabel jLabel = new JLabel(paramString);
    JPasswordField jPasswordField = new JPasswordField(16);
    jPanel.add(jLabel);
    jPanel.add(jPasswordField);
    cf cf = new cf(jPasswordField);
    cf.start();
    String[] arrayOfString = { "OK", "Cancel" };
    int i = JOptionPane.showOptionDialog(window, jPanel, "Password", 1, -1, null, (Object[])arrayOfString, arrayOfString[0]);
    if (i == 0) {
      char[] arrayOfChar = jPasswordField.getPassword();
      return new String(arrayOfChar);
    } 
    return null;
  }
  
  private static void k() {
    bX bX = new bX();
    b.getActionMap().put("delAction", bX);
    b.getInputMap(2).put(KeyStroke.getKeyStroke("DELETE"), "delAction");
  }
  
  public static int i() {
    return JOptionPane.showConfirmDialog(b, b("Are you sure want to delete this file?"), b("Confirm"), 0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */