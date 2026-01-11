package be;

import G.R;
import G.GInterfaceAi;
import G.SerializableImplExceptionprintstacktrace;
import G.GInterfaceDa;
import G.GInterfaceDb;
import G.GInterfaceDj;
import G.GInterfaceDk;
import G.i;
import V.ExceptionInVPackage;
import ax.ExceptionInAxPackage;
import bH.S;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.ee;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BeComponentGolf extends JPanel implements o {
  i ExceptionInVPackage;
  
  i b;
  
  i c;
  
  do d;
  
  JComboBox e = new JComboBox();
  
  JComboBox f = new JComboBox();
  
  R g = null;
  
  SerializableImplExceptionprintstacktrace h = null;
  
  n i = new n();
  
  public BeComponentGolf(R paramR) {
    setBorder(BorderFactory.createTitledBorder(s.g.b("DataLog Field")));
    setLayout(new GridLayout(0, 1, eJ.ExceptionInVPackage(4), eJ.ExceptionInVPackage(4)));
    ee ee = new ee();
    byte b = 18;
    this.ExceptionInVPackage = new i(this, "", b);
    add(ExceptionInVPackage("Log Field Name", this.ExceptionInVPackage, "The name this field will have in captured data logs."));
    this.ExceptionInVPackage.addKeyListener(this.i);
    this.ExceptionInVPackage.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("OutputChannel", this.e, "The OutputChannel assigned to this data log field, this is the value that will be logged."));
    this.e.setPreferredSize(this.ExceptionInVPackage.getPreferredSize());
    this.e.addActionListener(this.i);
    this.f.addItem(SerializableImplExceptionprintstacktrace.e);
    this.f.addItem(SerializableImplExceptionprintstacktrace.d);
    this.f.addItem(SerializableImplExceptionprintstacktrace.f);
    this.f.addItem(SerializableImplExceptionprintstacktrace.h);
    this.f.addItem(SerializableImplExceptionprintstacktrace.c);
    this.f.addItem(SerializableImplExceptionprintstacktrace.b);
    this.f.setSelectedItem(Integer.valueOf(0));
    this.f.setPreferredSize(this.ExceptionInVPackage.getPreferredSize());
    this.f.addActionListener(new h(this));
    this.f.addActionListener(this.i);
    add(ExceptionInVPackage("Value Format", this.f, "Select the format this field will be displayed in the log file. It can be the typical Numeric or one of the optional boolean formats."));
    this.d = new do("", b);
    this.d.b(0);
    this.d.addKeyListener(this.i);
    this.d.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Decimal Place", (Component)this.d, "The number of decimal places to log."));
    this.b = new i(this, "", b);
    this.b.addKeyListener(this.i);
    this.b.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Enabled Expression", this.b, "(Optional) If provided, this condition must be true for this field to be logged."));
    this.c = new i(this, "", b);
    this.c.addKeyListener(this.i);
    this.c.addFocusListener((FocusListener)ee);
    add(ExceptionInVPackage("Record Lag", this.c, "(Optional) A number or expression resolving to the number of records to lag this field behind others. By default and in most cases this is 0."));
    ExceptionInVPackage(paramR);
  }
  
  public SerializableImplExceptionprintstacktrace ExceptionInVPackage() {
    if (this.h == null)
      this.h = new SerializableImplExceptionprintstacktrace(); 
    try {
      this.h.b(this.e.getSelectedItem().toString());
    } catch (Exception exception) {}
    try {
      GInterfaceDb GInterfaceDb = GInterfaceDa.ExceptionInVPackage().ExceptionInVPackage(this.g, this.ExceptionInVPackage.getText());
      this.h.ExceptionInVPackage(GInterfaceDb);
    } catch (V.g g1) {
      throw new ExceptionInVPackage(g1.getMessage());
    } 
    if (!this.b.getText().trim().isEmpty())
      this.h.u(this.b.getText()); 
    if (!this.c.getText().trim().isEmpty())
      try {
        GInterfaceDj GInterfaceDj = GInterfaceDk.ExceptionInVPackage((GInterfaceAi)this.g, this.c.getText());
        this.h.ExceptionInVPackage(GInterfaceDj);
      } catch (V.g g1) {
        throw new ExceptionInVPackage(g1.getMessage());
      }  
    if (this.d.isEnabled()) {
      this.h.ExceptionInVPackage((int)Math.round(this.d.e()));
    } else {
      this.h.ExceptionInVPackage(0);
      this.h.ExceptionInVPackage(this.f.getSelectedItem().toString());
    } 
    return this.h;
  }
  
  private JPanel ExceptionInVPackage(String paramString1, Component paramComponent, String paramString2) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(eJ.ExceptionInVPackage(5), eJ.ExceptionInVPackage(5)));
    JLabel jLabel = new JLabel(s.g.b(paramString1), 4);
    jPanel1.add(jLabel, "Center");
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(eJ.ExceptionInVPackage(5), eJ.ExceptionInVPackage(5)));
    jPanel2.add(paramComponent, "Center");
    if (paramString2 != null && !paramString2.isEmpty()) {
      cF cF = new cF(s.g.b(paramString2), s.g.d());
      jPanel2.add((Component)cF, "East");
    } 
    jPanel1.add(jPanel2, "East");
    return jPanel1;
  }
  
  public void ExceptionInVPackage(String paramString) {
    boolean bool = false;
    if (paramString != null) {
      for (byte b = 0; b < this.e.getItemCount(); b++) {
        if (this.e.getItemAt(b) != null && this.e.getItemAt(b).equals(paramString)) {
          bool = true;
          break;
        } 
      } 
      if (!bool)
        this.e.addItem(paramString); 
      this.e.setSelectedItem(paramString);
    } else {
      this.e.setSelectedIndex(0);
    } 
  }
  
  public R b() {
    String str1 = this.ExceptionInVPackage.getText().trim();
    R r = b.ExceptionInVPackage(str1);
    if (!r.ExceptionInVPackage())
      return r; 
    String str2 = this.b.getText().trim();
    if (!str2.isEmpty())
      try {
        i.ExceptionInVPackage(str2, (GInterfaceAi)this.g);
      } catch (ExceptionInAxPackage u) {
        r.c();
        r.ExceptionInVPackage(u.getLocalizedMessage());
        return r;
      }  
    String str3 = this.c.getText().trim();
    if (!str3.isEmpty())
      try {
        i.ExceptionInVPackage(str3, (GInterfaceAi)this.g);
      } catch (ExceptionInAxPackage u) {
        r.c();
        r.ExceptionInVPackage(u.getLocalizedMessage());
        return r;
      }  
    if (Double.isNaN(this.d.e())) {
      r.c();
      r.ExceptionInVPackage("Please set the number of decimal places.");
      return r;
    } 
    r.b();
    return r;
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.g = paramR;
    this.e.removeAllItems();
    String[] arrayOfString = paramR.s();
    arrayOfString = S.ExceptionInVPackage(arrayOfString);
    for (String str : arrayOfString) {
      if (!str.contains(" "))
        this.e.addItem(str); 
    } 
  }
  
  public void ExceptionInVPackage(SerializableImplExceptionprintstacktrace paramac) {
    this.h = paramac;
    this.ExceptionInVPackage.setText(this.h.b());
    this.b.setText(this.h.aJ());
    String str = (this.h.g() != null) ? this.h.g().toString() : "";
    this.c.setText(str);
    this.d.ExceptionInVPackage(this.h.d());
    ExceptionInVPackage(this.h.ExceptionInVPackage());
    this.f.setSelectedItem(this.h.k());
    this.i.b();
  }
  
  public boolean c() {
    return this.i.ExceptionInVPackage();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */