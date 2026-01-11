package at;

import V.a;
import ao.b;
import ao.bB;
import ao.bq;
import ao.by;
import ar.f;
import bH.D;
import bH.t;
import com.efiAnalytics.ui.bV;
import g.g;
import g.k;
import h.b;
import h.i;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class c {
  private static c a = null;
  
  private JMenu b = null;
  
  private ButtonGroup c = null;
  
  private Map d = new HashMap<>();
  
  private String[] e = new String[] { "graph0", "graph1", "graph2", "graph3", "graph4", "graph5", "graph6", "graph7", "graph8", "graph9" };
  
  public static c a() {
    if (a == null)
      a = new c(); 
    return a;
  }
  
  public void a(String paramString, File paramFile) {
    try {
      a a = new a();
      a.a(paramString, paramFile);
      for (byte b = 0; b < this.b.getMenuComponentCount(); b++) {
        JMenuItem jMenuItem = this.b.getItem(b);
        if (jMenuItem instanceof JCheckBoxMenuItem && jMenuItem.getText().equals(paramString)) {
          jMenuItem.setSelected(true);
          return;
        } 
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(paramString);
      jCheckBoxMenuItem.setActionCommand(paramString);
      jCheckBoxMenuItem.addActionListener(new d(this));
      if (this.c != null)
        this.c.add(jCheckBoxMenuItem); 
      this.b.add(jCheckBoxMenuItem);
    } catch (a a) {
      Logger.getLogger(c.class.getName()).log(Level.INFO, "Error saving Settings File.", (Throwable)a);
      bV.d(a.getLocalizedMessage(), this.b);
    } 
  }
  
  public void b() {
    i.c("userParameter_New Setting Profile Name", d());
    g g = null;
    do {
      if (g != null)
        bV.d("Invalid Profile Name: '" + g.a() + "'. Please remove any special characters.", (Component)bq.a().b()); 
      g = new g((Frame)bq.a().b(), "{New Setting Profile Name}", false, "       Save current setting components as", true);
    } while (g.a && !t.a(g.a()));
    if (g.a) {
      String str = g.a();
      a(str);
      for (byte b = 0; b < this.b.getMenuComponentCount(); b++) {
        JMenuItem jMenuItem = this.b.getItem(b);
        if (jMenuItem instanceof JCheckBoxMenuItem && jMenuItem.getText().equals(str)) {
          JCheckBoxMenuItem jCheckBoxMenuItem1 = (JCheckBoxMenuItem)jMenuItem;
          jMenuItem.setSelected(true);
          return;
        } 
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str);
      jCheckBoxMenuItem.setActionCommand(str);
      jCheckBoxMenuItem.addActionListener(new e(this));
      if (this.c != null)
        this.c.add(jCheckBoxMenuItem); 
      jCheckBoxMenuItem.setSelected(true);
      this.b.add(jCheckBoxMenuItem);
    } 
  }
  
  public void a(String paramString) {
    ArrayList<bB> arrayList = new ArrayList();
    bB bB = new bB("USER_FIELD_", "User Calculated Math Fields");
    bB.a("Your custom created Calculated Fields");
    arrayList.add(bB);
    bB = new bB("ROOT_FIELD_", "Normalized Field Name Mapping");
    bB.a("Export Field Name Mappings that are currently active.");
    arrayList.add(bB);
    bB = new bB("APPEND_FIELD_", "Active Optional and Calculated Fields");
    bB.a("Exports which Optional and Calculated Fields are active.");
    arrayList.add(bB);
    bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
    bB.a("All Quick View tabs on this PC");
    bB.b("FIELD_SELECTED_GROUP_");
    bB.b("graph0");
    bB.b("graph1");
    bB.b("graph2");
    bB.b("graph3");
    bB.b("graph4");
    bB.b("graph5");
    bB.b("graph6");
    bB.b("graph7");
    bB.b("graph8");
    bB.b("graph9");
    arrayList.add(bB);
    bB = new bB("FIELD_MIN_MAX_", "Field Min/Max Settings");
    bB.a("Export set Min & Max values and autoscale settings.");
    arrayList.add(bB);
    bB = new bB(i.S, "Viewing preferences");
    bB.b("numberOfGraphs");
    bB.b("numberOfOverlays");
    bB.b("numberOfOverlayGraphs");
    bB.a("Export number of graphs, traces per graph, Trace Value Position, etc.");
    arrayList.add(bB);
    if (b.a().a("tableGenerator")) {
      bB = new bB("TABLE_GEN_VIEW_", "Histogram Views");
      bB.a("Export Histogram / Table Generator views.");
      arrayList.add(bB);
    } 
    if (b.a().a("scatterPlots")) {
      bB = new bB("SCATTER_PLOT_VIEW_", "Scatter Plot Views");
      bB.a("Export Scatter Plot views.");
      arrayList.add(bB);
    } 
    if (b.a().a("fieldSmoothing")) {
      bB = new bB("fieldSmoothingFactor_", "Field Smoothing");
      bB.a("Export Smoothing factor for each field it has been set on.");
      arrayList.add(bB);
    } 
    if (b.a().a("scatterPlots")) {
      bB = new bB("DATA_FILTER_", "Data Filters");
      bB.a("Export data filters defined for Histograms and Scatter Plots.");
      arrayList.add(bB);
    } 
    bB = new bB("lastFileDir", "File Folders");
    bB.a("Saves you las used file dirs to the profile.");
    bB.b(i.C);
    bB.b(i.D);
    arrayList.add(bB);
    by by = new by(arrayList, true);
    by.a((Window)bq.a().b());
    List list = by.b();
    if (list.isEmpty())
      return; 
    a(paramString, list);
  }
  
  public void c() {
    String str = d();
    if (!str.equals("")) {
      List list = (List)this.d.get(str);
      if (list == null) {
        D.b("Prefixes for Setting Profile " + str + " not set!");
      } else if (list.isEmpty()) {
        D.b("Prefixes for Setting Profile " + str + " are empty!");
      } else {
        a(str, list);
      } 
    } 
  }
  
  public void a(String paramString, List paramList) {
    bq.a().e().i();
    File file = a.a(paramString);
    Properties properties = new Properties();
    for (String str : i.e.keySet()) {
      if (b(str, paramList)) {
        String str1 = i.e.getProperty(str);
        properties.setProperty(str, str1);
      } 
    } 
    this.d.put(paramString, paramList);
    try {
      if (!file.exists() && !file.createNewFile())
        k.a("Unable to write to file\n" + file.getAbsolutePath() + "\nFailed to save setting profile.", (Component)bq.a().b()); 
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      properties.store(fileOutputStream, "MegaLogViewer Settings");
      fileOutputStream.close();
    } catch (Exception exception) {
      k.a("Unable to save settings to " + file.getAbsolutePath() + "\nSee log for more detail.", (Component)bq.a().b());
      exception.printStackTrace();
    } 
  }
  
  private boolean d(String paramString) {
    for (String str : this.e) {
      if (paramString.startsWith(str))
        return true; 
    } 
    return false;
  }
  
  private boolean b(String paramString, List paramList) {
    for (String str : paramList) {
      if (paramString.startsWith(str))
        return true; 
    } 
    return false;
  }
  
  public boolean b(String paramString) {
    for (Component component : this.b.getComponents()) {
      if (component instanceof JMenuItem) {
        JMenuItem jMenuItem = (JMenuItem)component;
        if (jMenuItem.getText().equals(paramString)) {
          this.b.remove(jMenuItem);
          break;
        } 
      } 
    } 
    boolean bool = a.b(paramString);
    if (d().equals(paramString))
      i.c("SettingProfile", ""); 
    return bool;
  }
  
  public String d() {
    return i.e("SettingProfile", "");
  }
  
  public void c(String paramString) {
    c();
    if (a(paramString, true)) {
      i.c("SettingProfile", paramString);
      k.a("The Application will now restart for changes to take effect.", (Component)bq.a().b());
      f.a().a(true);
      b.a().b((Frame)bq.a().b());
    } 
  }
  
  public boolean a(String paramString, boolean paramBoolean) {
    Properties properties = new Properties();
    try {
      FileInputStream fileInputStream = new FileInputStream(a.a(paramString));
      properties.load(fileInputStream);
      fileInputStream.close();
    } catch (Exception exception) {
      k.a("Unable to load profile settings " + paramString + "\nerror loading store file.\nSee log for more detail.", (Component)bq.a().b());
      exception.printStackTrace();
      return false;
    } 
    ArrayList<String> arrayList = new ArrayList();
    if (a(properties, "USER_FIELD_")) {
      arrayList.add("USER_FIELD_");
      D.d("Load profile " + paramString + ", loading User Fields");
    } 
    if (a(properties, "ROOT_FIELD_")) {
      arrayList.add("ROOT_FIELD_");
      D.d("Load profile " + paramString + ", loading Normalized Name Mappings");
    } 
    if (a(properties, "APPEND_FIELD_")) {
      arrayList.add("APPEND_FIELD_");
      D.d("Load profile " + paramString + ", loading Select Fields");
    } 
    if (a(properties, "FIELD_GROUP_NAME_")) {
      arrayList.add("FIELD_GROUP_NAME_");
      arrayList.add("FIELD_SELECTED_GROUP_");
      arrayList.add("graph0");
      arrayList.add("graph1");
      arrayList.add("graph2");
      arrayList.add("graph3");
      arrayList.add("graph4");
      arrayList.add("graph5");
      arrayList.add("graph6");
      arrayList.add("graph7");
      arrayList.add("graph8");
      arrayList.add("graph9");
      D.d("Load profile " + paramString + ", loading Group Fields");
    } 
    if (a(properties, "FIELD_MIN_MAX_")) {
      arrayList.add("FIELD_MIN_MAX_");
      D.d("Load profile " + paramString + ", loading Mins/Maxes");
    } 
    if (b.a().a("tableGenerator") && a(properties, "TABLE_GEN_VIEW_")) {
      arrayList.add("TABLE_GEN_VIEW_");
      D.d("Load profile " + paramString + ", loading histogram Views");
    } 
    if (b.a().a("scatterPlots") && a(properties, "SCATTER_PLOT_VIEW_")) {
      arrayList.add("SCATTER_PLOT_VIEW_");
      D.d("Load profile " + paramString + ", loading Scatter Plot Views");
    } 
    if (b.a().a("fieldSmoothing") && a(properties, "fieldSmoothingFactor_")) {
      arrayList.add("fieldSmoothingFactor_");
      D.d("Load profile " + paramString + ", loading Smoothing Factors");
    } 
    if (a(properties, i.S)) {
      arrayList.add(i.S);
      arrayList.add("numberOfGraphs");
      arrayList.add("numberOfOverlays");
      arrayList.add("numberOfOverlayGraphs");
      D.d("Load profile " + paramString + ", loading User Preferences");
    } 
    if (a(properties, "lastFileDir")) {
      arrayList.add("lastFileDir");
      arrayList.add(i.C);
      arrayList.add(i.D);
      D.d("Load profile " + paramString + ", loading User Folders");
    } 
    if (a(properties, "DATA_FILTER_")) {
      arrayList.add("DATA_FILTER_");
      D.d("Load profile " + paramString + ", loading Data Filters");
    } 
    if (arrayList.isEmpty()) {
      bV.d("There are no settings in this file to import.", (Component)bq.a().b());
      return false;
    } 
    this.d.put(paramString, arrayList);
    for (String str : i.e.stringPropertyNames()) {
      if (b(str, arrayList)) {
        if (d(str)) {
          i.c(str, " ");
          continue;
        } 
        i.d(str);
      } 
    } 
    for (String str : properties.keySet()) {
      if (b(str, arrayList)) {
        String str1 = properties.getProperty(str);
        i.e.setProperty(str, str1);
      } 
    } 
    return true;
  }
  
  private boolean a(Properties paramProperties, String paramString) {
    for (String str : paramProperties.stringPropertyNames()) {
      if (str.startsWith(paramString))
        return true; 
    } 
    return false;
  }
  
  public void a(JMenu paramJMenu) {
    this.b = paramJMenu;
  }
  
  public void a(ButtonGroup paramButtonGroup) {
    this.c = paramButtonGroup;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/at/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */