package bl;

import bH.X;
import com.efiAnalytics.plugin.ApplicationPlugin;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import r.a;
import s.g;

public class h extends JPanel implements bc {
  ApplicationPlugin a = null;
  
  public h(ApplicationPlugin paramApplicationPlugin) {
    this.a = paramApplicationPlugin;
    setLayout(new BorderLayout());
    try {
      String str = a.b + " Plugin: " + paramApplicationPlugin.getDisplayName();
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      JMenuBar jMenuBar = new JMenuBar();
      JMenu jMenu = new JMenu(g.b("Help"));
      jMenuBar.add(jMenu);
      if (paramApplicationPlugin.getHelpUrl() != null && paramApplicationPlugin.getHelpUrl().length() > 0) {
        JMenuItem jMenuItem1 = new JMenuItem(g.b("Online Help for " + paramApplicationPlugin.getDisplayName()));
        jMenuItem1.addActionListener(new i(this));
        jMenu.add(jMenuItem1);
      } 
      JMenuItem jMenuItem = new JMenuItem(g.b("About Plugin"));
      jMenuItem.addActionListener(new j(this));
      jMenu.add(jMenuItem);
      jPanel.add("North", jMenuBar);
      add("North", jPanel);
      add("Center", paramApplicationPlugin.getPluginPanel());
    } catch (Exception exception) {
      bV.d("Error Showing Plugin:\n" + exception.getMessage(), this);
    } 
  }
  
  public void close() {
    this.a.close();
  }
  
  public void a() {
    aN.a(this.a.getHelpUrl());
  }
  
  public void b() {
    String str1 = this.a.getDescription();
    str1 = X.a(str1, 60, "<br>");
    String str2 = "<html><body><center><h2>" + this.a.getDisplayName() + " version " + this.a.getVersion() + "</h2><h3>implemented as a " + a.b + " Plugin</h3></center>Written by " + this.a.getAuthor() + "<br><br>" + str1 + "<br>";
    if (this.a.getHelpUrl() != null)
      str2 = str2 + "<br>For More Information on this plugin see: <a href=\"" + this.a.getHelpUrl() + "\">Online Help</a>"; 
    str2 = str2 + "</body></html>";
    JEditorPane jEditorPane = new JEditorPane("text/html", str2);
    jEditorPane.addHyperlinkListener(new k(this));
    jEditorPane.setEditable(false);
    jEditorPane.setOpaque(false);
    JOptionPane.showMessageDialog(this, jEditorPane, a.b + " Plugin Info", 1);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */