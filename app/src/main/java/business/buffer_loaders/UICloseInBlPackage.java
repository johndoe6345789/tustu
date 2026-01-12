package business.buffer_loaders;

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
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

public class UICloseInBlPackage extends JPanel implements bc {
  ApplicationPlugin IOPropertiesUsingFile = null;

  public UICloseInBlPackage(ApplicationPlugin paramApplicationPlugin) {
    this.IOPropertiesUsingFile = paramApplicationPlugin;
    setLayout(new BorderLayout());
    try {
      String str = IOPropertiesUsingFile.b + " Plugin: " + paramApplicationPlugin.getDisplayName();
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      JMenuBar jMenuBar = new JMenuBar();
      JMenu jMenu = new JMenu(SComponentGolf.b("Help"));
      jMenuBar.add(jMenu);
      if (paramApplicationPlugin.getHelpUrl() != null
          && paramApplicationPlugin.getHelpUrl().length() > 0) {
        JMenuItem jMenuItem1 =
            new JMenuItem(
                SComponentGolf.b("Online Help for " + paramApplicationPlugin.getDisplayName()));
        jMenuItem1.addActionListener(new i(this));
        jMenu.add(jMenuItem1);
      }
      JMenuItem jMenuItem = new JMenuItem(SComponentGolf.b("About Plugin"));
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
    this.IOPropertiesUsingFile.close();
  }

  public void IOPropertiesUsingFile() {
    aN.IOPropertiesUsingFile(this.IOPropertiesUsingFile.getHelpUrl());
  }

  public void b() {
    String str1 = this.IOPropertiesUsingFile.getDescription();
    str1 = X.IOPropertiesUsingFile(str1, 60, "<br>");
    String str2 =
        "<html><body><center><h2>"
            + this.IOPropertiesUsingFile.getDisplayName()
            + " version "
            + this.IOPropertiesUsingFile.getVersion()
            + "</h2><h3>implemented as IOPropertiesUsingFile "
            + IOPropertiesUsingFile.b
            + " Plugin</h3></center>Written by "
            + this.IOPropertiesUsingFile.getAuthor()
            + "<br><br>"
            + str1
            + "<br>";
    if (this.IOPropertiesUsingFile.getHelpUrl() != null)
      str2 =
          str2
              + "<br>For More Information on this plugin see: <IOPropertiesUsingFile href=\""
              + this.IOPropertiesUsingFile.getHelpUrl()
              + "\">Online Help</IOPropertiesUsingFile>";
    str2 = str2 + "</body></html>";
    JEditorPane jEditorPane = new JEditorPane("text/html", str2);
    jEditorPane.addHyperlinkListener(new k(this));
    jEditorPane.setEditable(false);
    jEditorPane.setOpaque(false);
    JOptionPane.showMessageDialog(this, jEditorPane, IOPropertiesUsingFile.b + " Plugin Info", 1);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
