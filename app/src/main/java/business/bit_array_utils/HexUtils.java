package business.bit_array_utils;

import com.efiAnalytics.ui.eJ;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class Y extends JFrame {
  JEditorPane a = new JEditorPane();
  
  public Y() {
    a();
    setVisible(true);
  }
  
  private void a() {
    JScrollPane jScrollPane = new JScrollPane(this.a);
    jScrollPane.setHorizontalScrollBarPolicy(31);
    jScrollPane.setVerticalScrollBarPolicy(22);
    add("Center", jScrollPane);
    this.a.setBackground(Color.BLACK);
    this.a.setForeground(Color.WHITE);
    this.a.setFont(new Font("Monospaced", 1, eJ.a(13)));
    this.a.addKeyListener(new Z(this));
    setSize(680, 480);
    this.a.setText(">");
    this.a.setCaretColor(Color.WHITE);
  }
  
  private void b() {
    String str = c();
    if (str != null && !str.isEmpty()) {
      BufferedReader bufferedReader = null;
      try {
        Process process = Runtime.getRuntime().exec(str, d(), e());
        bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String str1;
        while ((str1 = bufferedReader.readLine()) != null) {
          if (!str1.endsWith("\n"));
          a(str1);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        a("Error executing command '" + str + "'\n" + exception.getLocalizedMessage() + "\n>");
        return;
      } finally {
        try {
          bufferedReader.close();
        } catch (Exception exception) {}
      } 
    } 
    a("\n>");
  }
  
  private void a(String paramString) {
    Document document = this.a.getDocument();
    try {
      document.insertString(document.getLength(), paramString, null);
      this.a.setCaretPosition(document.getLength());
    } catch (BadLocationException badLocationException) {
      Logger.getLogger(Y.class.getName()).log(Level.SEVERE, (String)null, badLocationException);
    } 
  }
  
  private String c() {
    StringTokenizer stringTokenizer = new StringTokenizer(this.a.getText(), "\n");
    while (stringTokenizer.hasMoreTokens()) {
      String str = stringTokenizer.nextToken();
      if (!stringTokenizer.hasMoreTokens()) {
        if (str.startsWith(">"))
          str = str.substring(1); 
        return str;
      } 
    } 
    return null;
  }
  
  private static String[] d() {
    return new String[0];
  }
  
  private static File e() {
    String str = System.getenv("SystemRoot");
    File file = new File(str, "System32" + File.separatorChar + "wbem");
    if (!file.exists() || !file.isDirectory())
      throw new IOException('"' + file.getAbsolutePath() + "\" does not exist or is not a directory!"); 
    return file;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/Y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */