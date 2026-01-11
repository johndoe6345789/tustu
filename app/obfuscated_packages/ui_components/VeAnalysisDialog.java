package ao;

import V.ExceptionPrintstacktrace;
import V.VInterfaceHotel;
import W.j;
import W.n;
import bH.D;
import bH.T;
import bH.X;
import bt.ManagerBfcomponentcharlie;
import com.efiAnalytics.tuningwidgets.panels.aP;
import com.efiAnalytics.ui.BinTableView;
import com.efiAnalytics.ui.b;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import ExceptionPrintstacktrace.k;
import VInterfaceHotel.b;
import VInterfaceHotel.ExceptionPrintstacktrace;
import VInterfaceHotel.i;
import i.IComponentAlpha;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.table.TableModel;

public class eK extends JDialog implements IComponentAlpha, IComponentAlpha {
  hZ IComponentAlpha = null;
  
  hz b = new hz();
  
  ArrayList c = new ArrayList();
  
  hV d = null;
  
  hY e = null;
  
  hY f = null;
  
  hY ExceptionPrintstacktrace = null;
  
  hW VInterfaceHotel = null;
  
  hZ i = null;
  
  String j;
  
  String k;
  
  n l = null;
  
  JPanel m = null;
  
  JPanel n = null;
  
  JSlider o = null;
  
  ap p = null;
  
  boolean q = true;
  
  boolean r = true;
  
  String s = "0.0";
  
  String t = "10000000.0";
  
  String u = "0";
  
  String v = "600";
  
  fp w = null;
  
  String x = "MAP";
  
  dQ y = null;
  
  ArrayList z = new ArrayList();
  
  public eK(hW paramhW, hY paramhY1, hY paramhY2, n paramn, Frame paramFrame, String paramString) {
    super(paramFrame, paramString, false);
    this.d = new hV();
    if (paramn.IComponentAlpha("Load") != null)
      this.x = "Load"; 
    this.x = i.IComponentAlpha("yAxisField", ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.j));
    getContentPane().add("North", d());
    IComponentAlpha(paramn);
    this.d.IComponentAlpha(this);
    this.e = b(paramhY1);
    this.ExceptionPrintstacktrace = paramhY1.e();
    if (paramhY2 == null)
      paramhY2 = this.ExceptionPrintstacktrace; 
    this.f = paramhY2;
    this.VInterfaceHotel = paramhW;
    this.l = paramn;
    this.IComponentAlpha = new hZ();
    b();
    this.IComponentAlpha.IComponentAlpha(this.e);
    int i = i.IComponentAlpha("prefFontSize", eJ.IComponentAlpha(10));
    this.IComponentAlpha.c(i);
    this.y = new dQ(i.f(), "VEAnalyze_");
    this.IComponentAlpha.IComponentAlpha((et)this.y);
    this.IComponentAlpha.VInterfaceHotel().IComponentAlpha();
    this.IComponentAlpha.b(paramhY1.i());
    j j = paramn.IComponentAlpha(ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.b));
    if (j == null) {
      this.q = false;
      c("AFR");
    } else if (j.f() < 1.1D) {
      i.c("calcType", "Gego");
      this.r = false;
    } 
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel1.setLayout(new BorderLayout());
    jPanel2.add("North", (Component)this.IComponentAlpha);
    jPanel1.add("Center", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout(2, 2));
    JButton jButton1 = new JButton("Run Analysis");
    jButton1.addActionListener(new eL(this));
    jPanel3.add("North", jButton1);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(2, 0, 2, 2));
    String str1 = i.e("calcType", "AFR");
    jPanel4.setBorder(BorderFactory.createEtchedBorder(1));
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton jRadioButton = new JRadioButton();
    jRadioButton.setText("Wideband AFR");
    jRadioButton.setToolTipText("For log files based on Wideband O2. Select correct WB sensor from menu.");
    jRadioButton.setSelected(str1.equals("AFR"));
    jRadioButton.addChangeListener(new eW(this));
    buttonGroup.add(jRadioButton);
    jPanel4.add(jRadioButton);
    jRadioButton = new JRadioButton();
    jRadioButton.setText("Narrowband O2");
    jRadioButton.setToolTipText("Used for log files with standard 0-1V Narrowband O2 sensor");
    jRadioButton.setEnabled(this.q);
    jRadioButton.setSelected(str1.equals("Gego"));
    jRadioButton.addChangeListener(new fg(this));
    buttonGroup.add(jRadioButton);
    jPanel4.add(jRadioButton);
    jPanel3.add("Center", jPanel4);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(2, 0, 2, 2));
    jButton1 = new JButton("Accept New Table");
    jButton1.addActionListener(new fh(this));
    jPanel5.add(jButton1);
    jButton1 = new JButton("Exit");
    jButton1.addActionListener(new fi(this));
    jPanel5.add(jButton1);
    jPanel3.add("East", jPanel5);
    jPanel3.setBorder(BorderFactory.createEtchedBorder(1));
    jPanel2.add("South", jPanel3);
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout());
    jPanel6.setBorder(BorderFactory.createEtchedBorder(1));
    this.m = new JPanel();
    this.m.setLayout(new BorderLayout());
    fq fq = new fq(this);
    fq.addItemListener(new fj(this));
    String[] arrayOfString = hQ.IComponentAlpha(paramhW);
    boolean bool1 = hQ.IComponentAlpha(arrayOfString, fq, new fk(this));
    boolean bool2 = hQ.IComponentAlpha(arrayOfString, fq, new fl(this));
    if (bool2 && !bool1)
      ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.VInterfaceHotel, ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.i)); 
    fq.c(this.ExceptionPrintstacktrace.z());
    JPanel jPanel7 = new JPanel();
    jPanel7.setLayout(new GridLayout(1, 0, 2, 2));
    this.p = new ap(" ");
    this.p.setFont(fq.getFont());
    this.p.IComponentAlpha(new fm(this));
    jPanel7.add(this.p);
    jPanel7.add(fq);
    TreeSet<String> treeSet = new TreeSet();
    for (j j1 : paramn)
      treeSet.add(j1.IComponentAlpha()); 
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new BorderLayout(2, 2));
    jPanel8.add("South", jPanel7);
    this.n = new JPanel();
    this.n.setLayout(new GridLayout(0, 2, 2, 2));
    jPanel8.add("Center", this.n);
    jPanel3.add("South", jPanel8);
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new GridLayout(1, 2, 2, 2));
    JPanel jPanel10 = new JPanel();
    jPanel10.setLayout(new GridLayout(1, 1));
    jPanel10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), "EGO Sensor Field"));
    JComboBox<String> jComboBox1 = new JComboBox();
    jPanel10.add(jComboBox1);
    jComboBox1.setEditable(false);
    jPanel9.add(jPanel10);
    JPanel jPanel11 = new JPanel();
    jPanel11.setLayout(new GridLayout());
    jPanel11.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), "EGO Correction Field"));
    JComboBox<String> jComboBox2 = new JComboBox();
    jPanel11.add(jComboBox2);
    jComboBox2.setEditable(false);
    jComboBox2.addItem("--- None ---");
    for (String str : treeSet) {
      jComboBox1.addItem(str);
      jComboBox2.addItem(str);
    } 
    this.k = VInterfaceHotel();
    jComboBox2.setSelectedItem(this.k);
    this.j = b(paramn);
    if (this.j == null || this.j.isEmpty() || !treeSet.contains(this.j)) {
      bV.d("Did not find expected EGO / AFR Sensor in current data log.\n\nPlease select your preferred AFR / Lambda or O2 field name\nfrom the \"EGO Sensor Field\" dropdown", paramFrame);
    } else {
      jComboBox1.setSelectedItem(this.j);
    } 
    jComboBox1.addActionListener(new eM(this));
    jComboBox2.addActionListener(new eN(this));
    jPanel9.add(jPanel11);
    JPanel jPanel12 = new JPanel();
    jPanel12.setLayout(new FlowLayout(1));
    this.i = new hZ();
    this.i.c(i);
    jPanel12.add((Component)this.i);
    this.m.add("Center", jPanel12);
    if (str1.equals("Gego") || paramhY2 == null)
      paramhY2 = this.ExceptionPrintstacktrace; 
    fq.b(paramhY2.z());
    b(paramhY2.z());
    JPanel jPanel13 = new JPanel();
    JPanel jPanel14 = new JPanel();
    JPanel jPanel15 = new JPanel();
    jPanel14.setLayout(new GridLayout(0, 2, 2, 2));
    jPanel13.setLayout(new BorderLayout());
    this.o = new JSlider();
    this.o.setMajorTickSpacing(1);
    this.o.setMinimum(0);
    this.o.setMaximum(9);
    this.o.setValue(i.IComponentAlpha("WBafrOffSet", 2));
    this.o.setPaintTrack(true);
    this.o.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), "Lambda signal delay"));
    this.o.setToolTipText("<html>Compensation for EGO sensor reading delay.<br>Value of 1 will base calculated VE on the AFR 1 records later.<br>1 to 3 works best in most circumstances. Lower RPMs generally have more<br>sensor delay than higher RPMs.");
    this.o.setPaintLabels(true);
    this.o.setSnapToTicks(true);
    this.o.addChangeListener(new eO(this));
    this.o.setEnabled(b.IComponentAlpha().IComponentAlpha("advancedVeAnalyze"));
    jPanel13.add("North", jPanel15);
    jPanel13.add("Center", jPanel9);
    JButton jButton2 = new JButton("Lambda Delay Table");
    jButton2.addActionListener(new eP(this));
    if (b.IComponentAlpha().IComponentAlpha("advancedVeAnalyze")) {
      jPanel15.add(jButton2);
    } else {
      jPanel15.add(this.o);
    } 
    JComboBox<fn> jComboBox = new JComboBox();
    jComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), "Cell Change"));
    jComboBox.setEditable(false);
    jComboBox.addItem(new fn(this, "Easy", "0.5"));
    jComboBox.addItem(new fn(this, "Normal", "3.0"));
    jComboBox.addItem(new fn(this, "Hard", "15.0"));
    jComboBox.addItem(new fn(this, "Very Hard", "100.0"));
    jPanel15.add(jComboBox);
    jComboBox.setToolTipText("<html>This impacts the amount of data required to move <br>the cell value or could be looked at as the cell<br>resistance to change. If set to Hard, the initial cell value <br>is more respected and will require stronger analysis data <br>to change.</html>");
    fn fn1 = null;
    fn fn2 = new fn(this, "", i.e("baseWeight", "3.0"));
    for (byte b = 0; b < jComboBox.getItemCount(); b++) {
      fn fn = jComboBox.getItemAt(b);
      if (fn.equals(fn2)) {
        fn1 = fn;
        break;
      } 
    } 
    if (fn1 != null)
      jComboBox.setSelectedItem(fn1); 
    jComboBox.addItemListener(new eQ(this));
    jComboBox.setEnabled(b.IComponentAlpha().IComponentAlpha("advancedVeAnalyze"));
    Dimension dimension = new Dimension((jButton2.getPreferredSize()).width, (jComboBox.getPreferredSize()).height);
    jButton2.setPreferredSize(dimension);
    jButton2.setMinimumSize(dimension);
    JButton jButton3 = new JButton("Max Value Change: " + i());
    jPanel14.add(jButton3);
    jButton3.addActionListener(new eR(this, jButton3));
    JButton jButton4 = new JButton("Max Percent Change: " + j());
    jPanel14.add(jButton4);
    jButton4.addActionListener(new eS(this, jButton4));
    JButton jButton5 = new JButton("Min RPM: " + i.IComponentAlpha("veAnalysisMinRPM", "500"));
    jButton5.setToolTipText("<html>Log entries with RPM lower that this will be<br>filtered and not included in VE Analysis.<br>Used to filter non running records or <br>inaccurrate idle AFR readings.</html>");
    jButton5.addActionListener(new eT(this));
    jPanel14.add(jButton5);
    jButton5 = new JButton("Max RPM: " + i.IComponentAlpha("veAnalysisMaxRPM", "18000"));
    jButton5.setToolTipText("<html>Log entries with RPM above this will be<br>filtered and not included in VE Analysis.<br>Used to filter faulty AFR caused by rev limiter fuel/spark cuts.<br>Leave high value if not needed.</html>");
    jButton5.addActionListener(new eU(this));
    jPanel14.add(jButton5);
    this.u = i.IComponentAlpha("veAnalyzeYAxisKeyMin", "0");
    jButton5 = new JButton("Min " + this.x + ": " + this.u);
    jButton5.setToolTipText("<html>Log entries with " + this.x + " below this value will be<br>filtered and not included in VE Analysis.<br>Used to perform VE Analyze on part of IComponentAlpha log file.<br>Leave at 0 for whole log file</html>");
    jButton5.addActionListener(new eV(this));
    jPanel14.add(jButton5);
    this.v = i.IComponentAlpha("veAnalyzeYAxisKeyMax", "600");
    jButton5 = new JButton("Max " + this.x + ": " + this.v);
    jButton5.setToolTipText("<html>Log entries with " + this.x + " greater than this will be<br>filtered and not included in VE Analysis.<br>Used to perform VE Analyze on part of IComponentAlpha VE table.<br>Leave at number higher than maximum for whole log file.</html>");
    jButton5.addActionListener(new eX(this));
    jPanel14.add(jButton5);
    jButton5 = new JButton("Min Time: Log Start");
    jButton5.setToolTipText("<html>Log entries with Time before that this will be<br>filtered and not included in VE Analysis.<br>Used to perform VE Analyze on part of IComponentAlpha VE table.<br>Leave at 0.0 for whole log file</html>");
    jButton5.addActionListener(new eY(this));
    this.n.add(jButton5);
    jButton5 = new JButton("Max Time: Log End");
    jButton5.setToolTipText("<html>Log entries with Time after this will be<br>filtered and not included in VE Analysis.<br>Used to perform VE Analyze on part of IComponentAlpha log file.<br>Leave at number higher than maximum Time for whole log file.</html>");
    jButton5.addActionListener(new eZ(this));
    this.n.add(jButton5);
    String str2 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.c);
    jButton5 = new JButton("Min " + str2 + ": " + i.e("minVEAnalysisCLT", "160"));
    jButton5.setToolTipText("<html>Log entries with CLT below this will be<br>filtered and not included in VE Analysis.<br>This is to filter records where warmup enrichment<br>is enabled. This should be 160 or higher in most cases.</html>");
    jButton5.addActionListener(new fa(this));
    jPanel14.add(jButton5);
    String str3 = i.e("customerVEAnalysisFilter", "");
    jButton5 = new JButton("Custom Filter:" + (str3.equals("") ? "Off" : "On"));
    jButton5.setEnabled(b.IComponentAlpha().IComponentAlpha("advancedVeAnalyze"));
    if (b.IComponentAlpha().IComponentAlpha("advancedVeAnalyze")) {
      jButton5.setToolTipText("<html>Performs custom filter<br>as evaluated by MLV math parser.<br>See website for more details.<br>ex. ([MAP]-[MAP-1]) &gt; 20 </html>");
      jButton5.addActionListener(new fb(this));
    } else {
      jButton5.setToolTipText("<html>Disabled on this Version.<br>Performs custom filter<br>as evaluated by MLV math parser.<br>See website for more details.<br>ex. ([MAP]-[MAP-1]) &gt; 20 </html>");
    } 
    jPanel14.add(jButton5);
    jPanel13.add("South", jPanel14);
    this.m.add("South", jPanel13);
    IComponentAlpha(i.IComponentAlpha("showVeAnalyzeAdvanced", false));
    jPanel6.add("South", this.m);
    jPanel1.add("East", jPanel6);
    getContentPane().add("Center", jPanel1);
    getContentPane().add("South", this.b);
    this.b.IComponentAlpha(false);
    this.w = new fp(this);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.w);
    pack();
    setResizable(false);
  }
  
  private JMenuBar d() {
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu1 = new JMenu("Specialized Options");
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Disable Overrun Filter");
    jCheckBoxMenuItem1.setState(i.IComponentAlpha("veAnalysisDisableOverrunFilter", false));
    jCheckBoxMenuItem1.addItemListener(new fc(this));
    jMenu1.add(jCheckBoxMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Disable Bit6 and Bit 7 Filter");
    jCheckBoxMenuItem2.setState(i.IComponentAlpha("veAnalysisBit6Bit7Filter", false));
    jCheckBoxMenuItem2.addItemListener(new fd(this));
    jMenu1.add(jCheckBoxMenuItem2);
    JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Enable Dead O2 Filter");
    jCheckBoxMenuItem3.setState(i.IComponentAlpha(i.aG, i.aH));
    jCheckBoxMenuItem3.setToolTipText("When enabled, records will be filtered when at the min or max value found in the log.");
    jCheckBoxMenuItem3.addItemListener(new fe(this));
    jMenu1.add(jCheckBoxMenuItem3);
    jMenuBar.add(jMenu1);
    JMenu jMenu2 = new JMenu("Help");
    JMenuItem jMenuItem = new JMenuItem("VE Analyze");
    jMenuItem.addActionListener(new ff(this));
    jMenu2.add(jMenuItem);
    jMenuBar.add(jMenu2);
    return jMenuBar;
  }
  
  public void IComponentAlpha(String paramString) {
    bu bu = hx.IComponentAlpha().A();
    bu.IComponentAlpha(paramString);
    bu.IComponentAlpha(this, i.b + " help");
  }
  
  private void IComponentAlpha(n paramn) {
    String str = i.e("minVEAnalysisCLT", "160");
    if (str.equals("160") || str.equals("71")) {
      String str1 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.c);
      try {
        j j = paramn.IComponentAlpha(str1);
        double d = j.f();
        if (d > 130.0D) {
          i.c("minVEAnalysisCLT", "160");
        } else {
          i.c("minVEAnalysisCLT", "71");
        } 
      } catch (Exception exception) {
        if (paramn.IComponentAlpha("PW In1") == null)
          k.IComponentAlpha("WARNING!! " + str1 + " field not found in log file.\nIt is recommended that Engine Coolant is available for VE Analyze.", this); 
      } 
    } 
  }
  
  public void IComponentAlpha(boolean paramBoolean) {
    if (paramBoolean) {
      this.p.IComponentAlpha("Hide Advanced Settings");
    } else {
      this.p.IComponentAlpha("Advanced Settings");
    } 
    this.m.setVisible(paramBoolean);
    this.n.setVisible(paramBoolean);
    i.c("showVeAnalyzeAdvanced", "" + paramBoolean);
    pack();
  }
  
  protected void IComponentAlpha(JButton paramJButton) {
    String str = k.IComponentAlpha("{New Min RPM}", true, "Log Records with RPM below this valuewill be filtered from VE Analysis.", true, this);
    if (str == null || str.equals(""))
      return; 
    i.c("veAnalysisMinRPM", str);
    paramJButton.setText("Min RPM: " + str);
  }
  
  protected void b(JButton paramJButton) {
    String str = k.IComponentAlpha("{New Max RPM}", true, "Log Records with RPM above this value will be filtered from VE Analysis.", true, this);
    if (str == null || str.equals(""))
      return; 
    i.c("veAnalysisMaxRPM", str);
    paramJButton.setText("Max RPM: " + str);
  }
  
  protected void c(JButton paramJButton) {
    String str1 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha("Time");
    String str2 = k.IComponentAlpha("{New Min " + str1 + "}", true, "Log Records with " + str1 + " before this valuewill be filtered from VE Analysis.", true, this);
    if (str2 == null || str2.equals(""))
      return; 
    this.s = str2;
    if (this.s.equals("0.0")) {
      paramJButton.setText("Min " + str1 + ": Log Start");
    } else {
      paramJButton.setText("Min " + str1 + ": " + this.s);
    } 
  }
  
  protected void d(JButton paramJButton) {
    String str1 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha("Time");
    String str2 = k.IComponentAlpha("{New Max Time}", true, "Log Records with Time after this value will be filtered from VE Analysis.", true, this);
    if (str2 == null || str2.equals(""))
      return; 
    this.t = str2;
    if (this.t.equals("10000000.0")) {
      paramJButton.setText("Max " + str1 + ": Log End");
    } else {
      paramJButton.setText("Max " + str1 + ": " + this.t);
    } 
  }
  
  protected void e(JButton paramJButton) {
    String str = k.IComponentAlpha("{New Min " + this.x + "}", true, "Log Records with " + this.x + " below this valuewill be filtered from VE Analysis.", true, this);
    if (str == null || str.equals(""))
      return; 
    this.u = str;
    paramJButton.setText("Min " + this.x + ": " + this.u);
    i.c("veAnalyzeYAxisKeyMin", this.u);
  }
  
  protected void f(JButton paramJButton) {
    String str = k.IComponentAlpha("{New Max " + this.x + "}", true, "Log Records with " + this.x + " greater than this value will be filtered from VE Analysis.", true, this);
    if (str == null || str.equals(""))
      return; 
    this.v = str;
    paramJButton.setText("Max " + this.x + ": " + this.v);
    i.c("veAnalyzeYAxisKeyMax", this.v);
  }
  
  protected void ExceptionPrintstacktrace(JButton paramJButton) {
    String str1 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.c);
    String str2 = k.IComponentAlpha("{New Minimum " + str1 + " (Coolant temperature)}", true, "Log Records with " + str1 + " less than this value\nwill be filtered from VE Analysis. Fuel enrichments during engine warm up \nwill negatively impact results. Air cooled or other special setups may need to \nlower this, otherwise normally 160" + T.IComponentAlpha() + "F to 180" + T.IComponentAlpha() + "F or 71" + T.IComponentAlpha() + "C to 82" + T.IComponentAlpha() + "C", true, this);
    if (str2 == null || str2.equals(""))
      return; 
    i.c("minVEAnalysisCLT", str2);
    paramJButton.setText("Min " + str1 + ": " + i.e("minVEAnalysisCLT", "160"));
  }
  
  protected void VInterfaceHotel(JButton paramJButton) {
    String str = "";
    str = k.IComponentAlpha(null, "{Custom filter condition}", false, "Performs custom filter as evaluated by MLV math parser.\nSee website for more details. \nex. abs([MAP]-[MAP-1]) > 20 \nfilters any record where MAP change is greater than 20 kpa from previous record.\nTo deactivate custom filter, press cancel or clear and press Ok.", true, this, new fo(this), null);
    if (str == null || str.equals(""))
      i.d("customerVEAnalysisFilter"); 
    i.c("customerVEAnalysisFilter", str);
    paramJButton.setText("Custom Filter:" + (str.equals("") ? "Off" : "On"));
  }
  
  protected hY b(hY paramhY) {
    hY hY1 = new hY();
    hY1.IComponentAlpha(paramhY.getRowCount(), paramhY.getColumnCount());
    hY1.IComponentAlpha(paramhY.j());
    hY1 = (hY)fh.IComponentAlpha(paramhY, hY1);
    hY1.d(paramhY.v());
    hY1.IComponentAlpha(paramhY.ExceptionPrintstacktrace());
    hY1.q();
    return hY1;
  }
  
  public void b(boolean paramBoolean) {
    if (this.ExceptionPrintstacktrace != null && this.ExceptionPrintstacktrace.r())
      this.ExceptionPrintstacktrace.f(); 
    if (paramBoolean)
      ExceptionPrintstacktrace(); 
    setVisible(false);
    if (this.w != null)
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.w); 
    for (bc bc : this.z)
      bc.close(); 
    dispose();
    System.gc();
  }
  
  public void IComponentAlpha(bc parambc) {
    this.z.add(parambc);
  }
  
  public void b(String paramString) {
    if (this.VInterfaceHotel.b(paramString) != null)
      this.f = this.VInterfaceHotel.b(paramString); 
    if (paramString.equals(this.ExceptionPrintstacktrace.z()))
      this.f = this.ExceptionPrintstacktrace; 
    IComponentAlpha(this.f.z(), this.f);
    this.IComponentAlpha.b("Ve: " + this.e.z());
    this.IComponentAlpha.IComponentAlpha("<html>Perform Analysis on <b>" + this.e.z() + "</b>, using AFR table: <b>" + this.f.z() + "</b><html>");
  }
  
  private void c(String paramString) {
    i.c("calcType", paramString);
  }
  
  private void e() {
    byte b = 1;
    this.f = (hY)this.i.ExceptionPrintstacktrace();
    if (i.e("calcType", "AFR").equals("Gego")) {
      j j = this.l.IComponentAlpha(this.j);
      if (j != null && j.f() > 1.2D) {
        if (bV.IComponentAlpha("You are set to Narrowband Mode, but the selected EGO Sensor Field appears to be IComponentAlpha \nWideband based on the O2 sensor voltages.\n\nAre you sure you want to process this file in Narrowband mode?", this, true)) {
          b = 2;
        } else {
          return;
        } 
      } else {
        b = 2;
      } 
    } 
    double d = Double.parseDouble(i.e("baseWeight", "3.0"));
    this.d.IComponentAlpha(d);
    E[] arrayOfE = IComponentAlpha();
    try {
      s s = null;
      if (b.IComponentAlpha().IComponentAlpha("advancedVeAnalyze"))
        s = ManagerBfcomponentcharlie.IComponentAlpha().IComponentAlpha(this.IComponentAlpha.ExceptionPrintstacktrace(), this.IComponentAlpha.getName()); 
      this.d.IComponentAlpha(this.e, this.f, s, this.l, b, this.j, this.k, arrayOfE);
    } catch (VInterfaceHotel VInterfaceHotel) {
      k.IComponentAlpha(VInterfaceHotel.getMessage(), this);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      k.IComponentAlpha(ExceptionPrintstacktrace.getMessage(), this);
      Logger.getLogger(eK.class.getName()).log(Level.WARNING, "Failed to get Lambda Delay Table", (Throwable)ExceptionPrintstacktrace);
    } 
  }
  
  public void IComponentAlpha(b[][] paramArrayOfb, int paramInt1, int paramInt2) {
    if (paramInt1 % 50 == 0 || paramInt1 == paramInt2)
      this.b.b(paramInt1 / paramInt2); 
    this.IComponentAlpha.VInterfaceHotel().m();
  }
  
  public void IComponentAlpha(b[][] paramArrayOfb, hY paramhY, int paramInt) {
    this.IComponentAlpha.repaint();
    double d1 = paramInt * 100.0D / this.l.d();
    String str = "<html><body><br><b>VE Analysis Summary</b><br>";
    str = str + "Total log records: " + this.l.d() + "<br>";
    str = str + "Filtered log records: " + paramInt + " (" + k.IComponentAlpha(d1) + "&#37;)<br>";
    str = str + "Log records used: " + (this.l.d() - paramInt) + "<br>";
    byte b1 = 0;
    double d2 = 0.0D;
    byte b2 = 0;
    double d3 = 0.0D;
    int i = paramArrayOfb.length * (paramArrayOfb[0]).length;
    int j = Math.max(1, paramhY.ExceptionPrintstacktrace());
    NumberFormat numberFormat = NumberFormat.getInstance();
    numberFormat.setMaximumFractionDigits(j);
    double d4 = 5.0D * Math.pow(0.1D, j);
    for (int k = paramArrayOfb.length - 1; k >= 0; k--) {
      for (byte b3 = 0; b3 < (paramArrayOfb[k]).length; b3++) {
        if (paramArrayOfb[k][b3].j() > 0) {
          b2++;
          d3 += paramArrayOfb[k][b3].k();
          double d = Math.abs(paramArrayOfb[k][b3].i().doubleValue() - Double.parseDouble(paramArrayOfb[k][b3].b()));
          if (d > d4) {
            b1++;
            if (d > d2)
              d2 = d; 
          } 
        } 
      } 
    } 
    d3 /= b2;
    double d5 = 100.0D * b2 / i;
    double d6 = 100.0D * b1 / i;
    str = str + "<br>";
    str = str + "Total table cells: " + i + "<br>";
    str = str + "Cells Analyzed: " + b2 + " (" + k.IComponentAlpha(d5) + "&#37;)<br>";
    str = str + "Average cell weight: " + k.IComponentAlpha(d3) + "<br>";
    str = str + "Cell values altered more than " + numberFormat.format(d4) + " : " + b1 + " (" + k.IComponentAlpha(d6) + "&#37;)<br>";
    str = str + "Max Cell Value Change: " + numberFormat.format(d2) + "<br>";
    if (d1 > 80.0D) {
      str = str + " <br>";
      str = str + "<b><font color=\"red\">!!!!!!!! WARNING !!!!!!!!</font></b><br>";
      str = str + d1 + "&#37; of your log was filtered.<br>";
      str = str + "Check your filter settings in Advanced Settings.<br>";
      E[] arrayOfE = this.d.c();
      if (arrayOfE != null) {
        int m = 0;
        String str1 = "";
        for (byte b3 = 0; b3 < arrayOfE.length; b3++) {
          if (arrayOfE[b3].IComponentAlpha() > m) {
            m = arrayOfE[b3].IComponentAlpha();
            str1 = arrayOfE[b3].b();
          } 
        } 
        if (str1.isEmpty()) {
          str1 = "AFR Value equal Min AFR Value";
          m = paramInt;
        } 
        str = str + "The settings for Filter <br>\"" + str1 + "\"<br> caused " + m + " records to be filtered.<br>";
      } 
    } 
    str = str + "<br></body></html>";
    k.IComponentAlpha(str, this);
  }
  
  public void IComponentAlpha(VInterfaceHotel paramh) {
    k.IComponentAlpha(paramh.getMessage(), this);
    paramh.printStackTrace();
  }
  
  public void IComponentAlpha(hY paramhY) {
    this.IComponentAlpha.VInterfaceHotel().setModel((TableModel)paramhY);
    paramhY.q();
  }
  
  public void IComponentAlpha(id paramid) {
    this.c.add(paramid);
  }
  
  private void f() {
    try {
      s s = ManagerBfcomponentcharlie.IComponentAlpha().IComponentAlpha(this.IComponentAlpha.ExceptionPrintstacktrace(), this.IComponentAlpha.getName());
      aP aP = new aP(null, s, this.IComponentAlpha.getName());
      IComponentAlpha((bc)aP);
      aP.setPreferredSize(new Dimension(eJ.IComponentAlpha(290), eJ.IComponentAlpha(170)));
      bV.IComponentAlpha((Component)aP, this, "Lambda Delay (ms)", (bc)aP);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.IComponentAlpha("Can not show Lambda delay Table.", (Exception)ExceptionPrintstacktrace, this);
    } 
  }
  
  private void ExceptionPrintstacktrace() {
    for (id id : this.c) {
      hY hY1 = (hY)this.IComponentAlpha.VInterfaceHotel().getModel();
      String str = hY1.z();
      id.IComponentAlpha(str, hY1);
      if (this.f != null && !this.f.z().startsWith("Default") && this.f.p() && this.i.i())
        id.IComponentAlpha(this.f.z(), this.f); 
    } 
  }
  
  public E[] IComponentAlpha() {
    ArrayList<E> arrayList = new ArrayList();
    E e = null;
    e = new E();
    e.b(4);
    e.IComponentAlpha("RPM");
    e.b(i.IComponentAlpha("veAnalysisMinRPM", "500"));
    e.d("Min RPM");
    arrayList.add(e);
    e = new E();
    e.b(2);
    e.IComponentAlpha("RPM");
    e.b(i.IComponentAlpha("veAnalysisMaxRPM", "18000"));
    e.d("Max RPM");
    arrayList.add(e);
    e = new E();
    e.b(32);
    e.IComponentAlpha("Engine");
    e.IComponentAlpha(16);
    e.d("Accel enrich Flag");
    arrayList.add(e);
    if (!i.IComponentAlpha("veAnalysisBit6Bit7Filter", false)) {
      e = new E();
      e.b(32);
      e.IComponentAlpha("Engine");
      e.IComponentAlpha(64);
      e.d("MAP Accel enrich");
      arrayList.add(e);
    } 
    e = new E();
    e.b(32);
    e.IComponentAlpha("Engine");
    e.IComponentAlpha(4);
    e.d("ASE Flag");
    arrayList.add(e);
    e = new E();
    e.b(4);
    String str1 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.c);
    e.IComponentAlpha(str1);
    float f = Float.parseFloat(i.e("minVEAnalysisCLT", "160"));
    e.IComponentAlpha(f);
    e.d("Min " + str1);
    arrayList.add(e);
    str1 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha("Time");
    e = new E();
    e.b(4);
    e.IComponentAlpha(str1);
    e.b(this.s);
    e.d("Min " + str1);
    arrayList.add(e);
    e = new E();
    e.b(2);
    e.IComponentAlpha(str1);
    e.b(this.t);
    e.d("Max " + str1);
    arrayList.add(e);
    e = new E();
    e.b(4);
    e.IComponentAlpha(this.x);
    e.b(this.u);
    e.d("Min " + this.x);
    arrayList.add(e);
    e = new E();
    e.b(2);
    e.IComponentAlpha(this.x);
    e.b(this.v);
    e.d("Max " + this.x);
    arrayList.add(e);
    if (!i.IComponentAlpha("veAnalysisDisableOverrunFilter", false)) {
      e = new E();
      str1 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.ExceptionPrintstacktrace);
      e.b(1);
      e.IComponentAlpha(str1);
      e.IComponentAlpha(0);
      e.d(str1 + " = 0ms.");
      if (str1 != null && str1.trim().length() > 0)
        arrayList.add(e); 
    } 
    String str2 = i.e("customerVEAnalysisFilter", "");
    if (!str2.equals("")) {
      e = new E();
      e.b(64);
      e.c(str2);
      e.d("Customer Filter " + str2);
      arrayList.add(e);
    } 
    if (this.l.IComponentAlpha("dMAP_Corr") != null) {
      e = new E();
      e.b(64);
      e.c("Math.abs([dMAP_Corr]) > 0.05");
      e.d("Accel Enrich Filter ");
      arrayList.add(e);
    } 
    String str3 = b(this.l);
    if (!X.c(str3) && str3.toLowerCase().contains("lambda") && this.l.IComponentAlpha(str3) != null) {
      e = new E();
      e.b(64);
      e.c("[" + str3 + "] > 1.5 || [" + str3 + "] < 0.4 ");
      e.d(str3 + " Out Of Range");
      arrayList.add(e);
      D.c("Added filter Lambda Out of range filter based on " + str3);
    } 
    e = new E();
    str1 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.b);
    e.b(8);
    e.IComponentAlpha(str1);
    e.IComponentAlpha(0.0F);
    e.d("No O2 Reading");
    arrayList.add(e);
    if (this.l.IComponentAlpha("Engine") != null && !i.IComponentAlpha("veAnalysisBit6Bit7Filter", false)) {
      e = new E();
      e.b(64);
      e.c("([Engine] | 64 == 64) || ([Engine-1] | 64 == 64) || ([Engine] | 128 == 128) || ([Engine-1] | 128 == 128)");
      e.d("Accel Enrich Filter ");
      arrayList.add(e);
    } 
    E[] arrayOfE = new E[arrayList.size()];
    for (byte b = 0; b < arrayOfE.length; b++)
      arrayOfE[b] = arrayList.get(b); 
    return arrayOfE;
  }
  
  public void IComponentAlpha(int paramInt) {
    if (this.l == null || !isVisible() || this.IComponentAlpha == null || !this.IComponentAlpha.isVisible())
      return; 
    String str1 = "";
    String str2 = "";
    try {
      str1 = Float.toString(this.l.IComponentAlpha(this.e.v()).d(paramInt));
      str2 = Float.toString(this.l.IComponentAlpha(this.e.w()).d(paramInt));
      this.IComponentAlpha.VInterfaceHotel().IComponentAlpha(str1, str2);
      if (this.i != null) {
        BinTableView binTableView = this.i.VInterfaceHotel();
        try {
          str1 = Float.toString(this.l.IComponentAlpha(this.i.ExceptionPrintstacktrace().v()).d(paramInt));
          str2 = Float.toString(this.l.IComponentAlpha(this.i.ExceptionPrintstacktrace().w()).d(paramInt));
        } catch (Exception exception) {}
        binTableView.IComponentAlpha(str1, str2);
      } 
    } catch (Exception exception) {
      System.out.println("NewVeDialog::yVal=" + str1 + ", rpm=" + str2);
      exception.printStackTrace();
    } 
  }
  
  public void IComponentAlpha(String paramString, hY paramhY) {
    i.c("lastVeAnalysisAfrTable", paramhY.z());
    this.i.IComponentAlpha(paramhY);
    this.i.VInterfaceHotel().getTableHeader().setToolTipText("RPM");
    this.i.f().setToolTipText(paramhY.v());
    this.i.b(paramString);
    pack();
    this.i.k();
  }
  
  public b[][] b() {
    double d1 = Double.MIN_VALUE;
    double d2 = Double.MIN_VALUE;
    c c = new c();
    try {
      d1 = Double.parseDouble(i.IComponentAlpha("veAnalysisWeightThreshold", "0.0"));
      System.out.println("weightThreshold set to:" + d1);
    } catch (Exception exception) {
      d1 = 0.0D;
      System.out.println("Error retrieving veAnalysisWeightThreshold from properties file. using 0.0");
    } 
    try {
      d2 = Double.parseDouble(i.IComponentAlpha("veAnalysisWindowThreshold", "0.0"));
    } catch (Exception exception) {
      d2 = 0.0D;
      System.out.println("Error retrieving veAnalysisWindowThreshold from properties file. using 0.0");
    } 
    c.c(d2);
    c.IComponentAlpha(d1);
    return this.e.IComponentAlpha(this.f, c);
  }
  
  protected void c() {
    bu bu = hx.IComponentAlpha().A();
    String str = bt.IComponentAlpha(bt.b);
    bu.IComponentAlpha(str);
    System.out.println("url:" + str);
    bu.IComponentAlpha(this, i.b + " help");
  }
  
  private String b(n paramn) {
    String str1 = "AFR(WBO2)";
    String str2 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.VInterfaceHotel);
    String str3 = i.e(i.ac, str2);
    String str4 = ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.b);
    return (paramn.IComponentAlpha(str3) != null) ? str3 : ((paramn.IComponentAlpha(str2) != null) ? str2 : ((this.l.IComponentAlpha(str1) != null) ? str1 : ((this.l.IComponentAlpha("Lambda") != null) ? "Lambda" : ((this.l.IComponentAlpha(str4) != null) ? str4 : ""))));
  }
  
  private String VInterfaceHotel() {
    return i.e(i.ad, ExceptionPrintstacktrace.IComponentAlpha().IComponentAlpha(ExceptionPrintstacktrace.e));
  }
  
  private String i() {
    return i.IComponentAlpha("veAnalysisMaxValChange", "50");
  }
  
  private void i(JButton paramJButton) {
    String str = k.IComponentAlpha("{New Maximum Cell Value Change}", true, "This is the most IComponentAlpha cell will be changed in valuefrom the starting value", true, this);
    if (str == null || str.equals(""))
      return; 
    i.c("veAnalysisMaxValChange", str);
    paramJButton.setText("Max Value Change: " + str);
  }
  
  private String j() {
    return i.IComponentAlpha("veAnalysisMaxPercentChange", "50");
  }
  
  private void j(JButton paramJButton) {
    String str = k.IComponentAlpha("{New Maximum Cell Percent Change}", true, "This is the most IComponentAlpha cell will be changed in percent from the starting value", true, this);
    if (str == null || str.equals(""))
      return; 
    i.c("veAnalysisMaxPercentChange", str);
    paramJButton.setText("Max Percent Change: " + str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */