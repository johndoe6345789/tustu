package at;

import V.ExceptionInVPackage;
import ao.ClassTypeInHPackage;
import ao.bB;
import ao.bq;
import ao.by;
import ar.ArComponentFoxtrot;
import bH.D;
import bH.t;
import com.efiAnalytics.ui.bV;
import ActionListenerInGPackage.ActionListenerInGPackage;
import ActionListenerInGPackage.k;
import h.ClassTypeInHPackage;
import h.IOProperties;
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

public IOJMenulass IOJMenu {
  private static c ExceptionInVPackage = null;
  
  private JMenu ClassTypeInHPackage = null;
  
  private ButtonGroup c = null;
  
  private Map d = new HashMap<>();
  
  private String[] e = new String[] { "graph0", "graph1", "graph2", "graph3", "graph4", "graph5", "graph6", "graph7", "graph8", "graph9" };
  
  public static c ExceptionInVPackage() {
    if (ExceptionInVPackage == null)
      ExceptionInVPackage = new c(); 
    return ExceptionInVPackage;
  }
  
  public void ExceptionInVPackage(String paramString, File paramFile) {
    try {
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage();
      ExceptionInVPackage.ExceptionInVPackage(paramString, paramFile);
      for (byte ClassTypeInHPackage = 0; ClassTypeInHPackage < this.ClassTypeInHPackage.getMenuComponentCount(); ClassTypeInHPackage++) {
        JMenuItem jMenuItem = this.ClassTypeInHPackage.getItem(ClassTypeInHPackage);
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
      this.ClassTypeInHPackage.add(jCheckBoxMenuItem);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(c.class.getName()).log(Level.INFO, "Error saving Settings File.", (Throwable)ExceptionInVPackage);
      bV.d(ExceptionInVPackage.getLocalizedMessage(), this.ClassTypeInHPackage);
    } 
  }
  
  public void ClassTypeInHPackage() {
    IOProperties.c("userParameter_New Setting Profile Name", d());
    ActionListenerInGPackage ActionListenerInGPackage = null;
    do {
      if (ActionListenerInGPackage != null)
        bV.d("Invalid Profile Name: '" + ActionListenerInGPackage.ExceptionInVPackage() + "'. Please remove any special characters.", (Component)bq.ExceptionInVPackage().ClassTypeInHPackage()); 
      ActionListenerInGPackage = new ActionListenerInGPackage((Frame)bq.ExceptionInVPackage().ClassTypeInHPackage(), "{New Setting Profile Name}", false, "       Save current setting components as", true);
    } while (ActionListenerInGPackage.ExceptionInVPackage && !t.ExceptionInVPackage(ActionListenerInGPackage.ExceptionInVPackage()));
    if (ActionListenerInGPackage.ExceptionInVPackage) {
      String str = ActionListenerInGPackage.ExceptionInVPackage();
      ExceptionInVPackage(str);
      for (byte ClassTypeInHPackage = 0; ClassTypeInHPackage < this.ClassTypeInHPackage.getMenuComponentCount(); ClassTypeInHPackage++) {
        JMenuItem jMenuItem = this.ClassTypeInHPackage.getItem(ClassTypeInHPackage);
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
      this.ClassTypeInHPackage.add(jCheckBoxMenuItem);
    } 
  }
  
  public void ExceptionInVPackage(String paramString) {
    ArrayList<bB> arrayList = new ArrayList();
    bB bB = new bB("USER_FIELD_", "User Calculated Math Fields");
    bB.ExceptionInVPackage("Your custom created Calculated Fields");
    arrayList.add(bB);
    bB = new bB("ROOT_FIELD_", "Normalized Field Name Mapping");
    bB.ExceptionInVPackage("Export Field Name Mappings that are currently active.");
    arrayList.add(bB);
    bB = new bB("APPEND_FIELD_", "Active Optional and Calculated Fields");
    bB.ExceptionInVPackage("Exports which Optional and Calculated Fields are active.");
    arrayList.add(bB);
    bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
    bB.ExceptionInVPackage("All Quick View tabs on this PC");
    bB.ClassTypeInHPackage("FIELD_SELECTED_GROUP_");
    bB.ClassTypeInHPackage("graph0");
    bB.ClassTypeInHPackage("graph1");
    bB.ClassTypeInHPackage("graph2");
    bB.ClassTypeInHPackage("graph3");
    bB.ClassTypeInHPackage("graph4");
    bB.ClassTypeInHPackage("graph5");
    bB.ClassTypeInHPackage("graph6");
    bB.ClassTypeInHPackage("graph7");
    bB.ClassTypeInHPackage("graph8");
    bB.ClassTypeInHPackage("graph9");
    arrayList.add(bB);
    bB = new bB("FIELD_MIN_MAX_", "Field Min/Max Settings");
    bB.ExceptionInVPackage("Export set Min & Max values and autoscale settings.");
    arrayList.add(bB);
    bB = new bB(IOProperties.S, "Viewing preferences");
    bB.ClassTypeInHPackage("numberOfGraphs");
    bB.ClassTypeInHPackage("numberOfOverlays");
    bB.ClassTypeInHPackage("numberOfOverlayGraphs");
    bB.ExceptionInVPackage("Export number of graphs, traces per graph, Trace Value Position, etc.");
    arrayList.add(bB);
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("tableGenerator")) {
      bB = new bB("TABLE_GEN_VIEW_", "Histogram Views");
      bB.ExceptionInVPackage("Export Histogram / Table Generator views.");
      arrayList.add(bB);
    } 
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("scatterPlots")) {
      bB = new bB("SCATTER_PLOT_VIEW_", "Scatter Plot Views");
      bB.ExceptionInVPackage("Export Scatter Plot views.");
      arrayList.add(bB);
    } 
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("fieldSmoothing")) {
      bB = new bB("fieldSmoothingFactor_", "Field Smoothing");
      bB.ExceptionInVPackage("Export Smoothing factor for each field it has been set on.");
      arrayList.add(bB);
    } 
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("scatterPlots")) {
      bB = new bB("DATA_FILTER_", "Data Filters");
      bB.ExceptionInVPackage("Export data filters defined for Histograms and Scatter Plots.");
      arrayList.add(bB);
    } 
    bB = new bB("lastFileDir", "File Folders");
    bB.ExceptionInVPackage("Saves you las used file dirs to the profile.");
    bB.ClassTypeInHPackage(IOProperties.C);
    bB.ClassTypeInHPackage(IOProperties.D);
    arrayList.add(bB);
    by by = new by(arrayList, true);
    by.ExceptionInVPackage((Window)bq.ExceptionInVPackage().ClassTypeInHPackage());
    List list = by.ClassTypeInHPackage();
    if (list.isEmpty())
      return; 
    ExceptionInVPackage(paramString, list);
  }
  
  public void c() {
    String str = d();
    if (!str.equals("")) {
      List list = (List)this.d.get(str);
      if (list == null) {
        D.ClassTypeInHPackage("Prefixes for Setting Profile " + str + " not set!");
      } else if (list.isEmpty()) {
        D.ClassTypeInHPackage("Prefixes for Setting Profile " + str + " are empty!");
      } else {
        ExceptionInVPackage(str, list);
      } 
    } 
  }
  
  public void ExceptionInVPackage(String paramString, List paramList) {
    bq.ExceptionInVPackage().e().IOProperties();
    File file = ExceptionInVPackage.ExceptionInVPackage(paramString);
    Properties properties = new Properties();
    for (String str : IOProperties.e.keySet()) {
      if (ClassTypeInHPackage(str, paramList)) {
        String str1 = IOProperties.e.getProperty(str);
        properties.setProperty(str, str1);
      } 
    } 
    this.d.put(paramString, paramList);
    try {
      if (!file.exists() && !file.createNewFile())
        k.ExceptionInVPackage("Unable to write to file\n" + file.getAbsolutePath() + "\nFailed to save setting profile.", (Component)bq.ExceptionInVPackage().ClassTypeInHPackage()); 
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      properties.store(fileOutputStream, "MegaLogViewer Settings");
      fileOutputStream.close();
    } catch (Exception exception) {
      k.ExceptionInVPackage("Unable to save settings to " + file.getAbsolutePath() + "\nSee log for more detail.", (Component)bq.ExceptionInVPackage().ClassTypeInHPackage());
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
  
  private boolean ClassTypeInHPackage(String paramString, List paramList) {
    for (String str : paramList) {
      if (paramString.startsWith(str))
        return true; 
    } 
    return false;
  }
  
  public boolean ClassTypeInHPackage(String paramString) {
    for (Component component : this.ClassTypeInHPackage.getComponents()) {
      if (component instanceof JMenuItem) {
        JMenuItem jMenuItem = (JMenuItem)component;
        if (jMenuItem.getText().equals(paramString)) {
          this.ClassTypeInHPackage.remove(jMenuItem);
          break;
        } 
      } 
    } 
    boolean bool = ExceptionInVPackage.ClassTypeInHPackage(paramString);
    if (d().equals(paramString))
      IOProperties.c("SettingProfile", ""); 
    return bool;
  }
  
  public String d() {
    return IOProperties.e("SettingProfile", "");
  }
  
  public void c(String paramString) {
    c();
    if (ExceptionInVPackage(paramString, true)) {
      IOProperties.c("SettingProfile", paramString);
      k.ExceptionInVPackage("The Application will now restart for changes to take effect.", (Component)bq.ExceptionInVPackage().ClassTypeInHPackage());
      ArComponentFoxtrot.ExceptionInVPackage().ExceptionInVPackage(true);
      ClassTypeInHPackage.ExceptionInVPackage().ClassTypeInHPackage((Frame)bq.ExceptionInVPackage().ClassTypeInHPackage());
    } 
  }
  
  public boolean ExceptionInVPackage(String paramString, boolean paramBoolean) {
    Properties properties = new Properties();
    try {
      FileInputStream fileInputStream = new FileInputStream(ExceptionInVPackage.ExceptionInVPackage(paramString));
      properties.load(fileInputStream);
      fileInputStream.close();
    } catch (Exception exception) {
      k.ExceptionInVPackage("Unable to load profile settings " + paramString + "\nerror loading store file.\nSee log for more detail.", (Component)bq.ExceptionInVPackage().ClassTypeInHPackage());
      exception.printStackTrace();
      return false;
    } 
    ArrayList<String> arrayList = new ArrayList();
    if (ExceptionInVPackage(properties, "USER_FIELD_")) {
      arrayList.add("USER_FIELD_");
      D.d("Load profile " + paramString + ", loading User Fields");
    } 
    if (ExceptionInVPackage(properties, "ROOT_FIELD_")) {
      arrayList.add("ROOT_FIELD_");
      D.d("Load profile " + paramString + ", loading Normalized Name Mappings");
    } 
    if (ExceptionInVPackage(properties, "APPEND_FIELD_")) {
      arrayList.add("APPEND_FIELD_");
      D.d("Load profile " + paramString + ", loading Select Fields");
    } 
    if (ExceptionInVPackage(properties, "FIELD_GROUP_NAME_")) {
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
    if (ExceptionInVPackage(properties, "FIELD_MIN_MAX_")) {
      arrayList.add("FIELD_MIN_MAX_");
      D.d("Load profile " + paramString + ", loading Mins/Maxes");
    } 
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("tableGenerator") && ExceptionInVPackage(properties, "TABLE_GEN_VIEW_")) {
      arrayList.add("TABLE_GEN_VIEW_");
      D.d("Load profile " + paramString + ", loading histogram Views");
    } 
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("scatterPlots") && ExceptionInVPackage(properties, "SCATTER_PLOT_VIEW_")) {
      arrayList.add("SCATTER_PLOT_VIEW_");
      D.d("Load profile " + paramString + ", loading Scatter Plot Views");
    } 
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("fieldSmoothing") && ExceptionInVPackage(properties, "fieldSmoothingFactor_")) {
      arrayList.add("fieldSmoothingFactor_");
      D.d("Load profile " + paramString + ", loading Smoothing Factors");
    } 
    if (ExceptionInVPackage(properties, IOProperties.S)) {
      arrayList.add(IOProperties.S);
      arrayList.add("numberOfGraphs");
      arrayList.add("numberOfOverlays");
      arrayList.add("numberOfOverlayGraphs");
      D.d("Load profile " + paramString + ", loading User Preferences");
    } 
    if (ExceptionInVPackage(properties, "lastFileDir")) {
      arrayList.add("lastFileDir");
      arrayList.add(IOProperties.C);
      arrayList.add(IOProperties.D);
      D.d("Load profile " + paramString + ", loading User Folders");
    } 
    if (ExceptionInVPackage(properties, "DATA_FILTER_")) {
      arrayList.add("DATA_FILTER_");
      D.d("Load profile " + paramString + ", loading Data Filters");
    } 
    if (arrayList.isEmpty()) {
      bV.d("There are no settings in this file to import.", (Component)bq.ExceptionInVPackage().ClassTypeInHPackage());
      return false;
    } 
    this.d.put(paramString, arrayList);
    for (String str : IOProperties.e.stringPropertyNames()) {
      if (ClassTypeInHPackage(str, arrayList)) {
        if (d(str)) {
          IOProperties.c(str, " ");
          continue;
        } 
        IOProperties.d(str);
      } 
    } 
    for (String str : properties.keySet()) {
      if (ClassTypeInHPackage(str, arrayList)) {
        String str1 = properties.getProperty(str);
        IOProperties.e.setProperty(str, str1);
      } 
    } 
    return true;
  }
  
  private boolean ExceptionInVPackage(Properties paramProperties, String paramString) {
    for (String str : paramProperties.stringPropertyNames()) {
      if (str.startsWith(paramString))
        return true; 
    } 
    return false;
  }
  
  public void ExceptionInVPackage(JMenu paramJMenu) {
    this.ClassTypeInHPackage = paramJMenu;
  }
  
  public void ExceptionInVPackage(ButtonGroup paramButtonGroup) {
    this.c = paramButtonGroup;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/at/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */