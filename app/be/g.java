package be;

import G.R;
import G.aI;
import G.ac;
import G.da;
import G.db;
import G.dj;
import G.dk;
import G.i;
import V.a;
import ax.U;
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

public class g extends JPanel implements o {
  i a;
  
  i b;
  
  i c;
  
  do d;
  
  JComboBox e = new JComboBox();
  
  JComboBox f = new JComboBox();
  
  R g = null;
  
  ac h = null;
  
  n i = new n();
  
  public g(R paramR) {
    setBorder(BorderFactory.createTitledBorder(s.g.b("DataLog Field")));
    setLayout(new GridLayout(0, 1, eJ.a(4), eJ.a(4)));
    ee ee = new ee();
    byte b = 18;
    this.a = new i(this, "", b);
    add(a("Log Field Name", this.a, "The name this field will have in captured data logs."));
    this.a.addKeyListener(this.i);
    this.a.addFocusListener((FocusListener)ee);
    add(a("OutputChannel", this.e, "The OutputChannel assigned to this data log field, this is the value that will be logged."));
    this.e.setPreferredSize(this.a.getPreferredSize());
    this.e.addActionListener(this.i);
    this.f.addItem(ac.e);
    this.f.addItem(ac.d);
    this.f.addItem(ac.f);
    this.f.addItem(ac.h);
    this.f.addItem(ac.c);
    this.f.addItem(ac.b);
    this.f.setSelectedItem(Integer.valueOf(0));
    this.f.setPreferredSize(this.a.getPreferredSize());
    this.f.addActionListener(new h(this));
    this.f.addActionListener(this.i);
    add(a("Value Format", this.f, "Select the format this field will be displayed in the log file. It can be the typical Numeric or one of the optional boolean formats."));
    this.d = new do("", b);
    this.d.b(0);
    this.d.addKeyListener(this.i);
    this.d.addFocusListener((FocusListener)ee);
    add(a("Decimal Place", (Component)this.d, "The number of decimal places to log."));
    this.b = new i(this, "", b);
    this.b.addKeyListener(this.i);
    this.b.addFocusListener((FocusListener)ee);
    add(a("Enabled Expression", this.b, "(Optional) If provided, this condition must be true for this field to be logged."));
    this.c = new i(this, "", b);
    this.c.addKeyListener(this.i);
    this.c.addFocusListener((FocusListener)ee);
    add(a("Record Lag", this.c, "(Optional) A number or expression resolving to the number of records to lag this field behind others. By default and in most cases this is 0."));
    a(paramR);
  }
  
  public ac a() {
    if (this.h == null)
      this.h = new ac(); 
    try {
      this.h.b(this.e.getSelectedItem().toString());
    } catch (Exception exception) {}
    try {
      db db = da.a().a(this.g, this.a.getText());
      this.h.a(db);
    } catch (V.g g1) {
      throw new a(g1.getMessage());
    } 
    if (!this.b.getText().trim().isEmpty())
      this.h.u(this.b.getText()); 
    if (!this.c.getText().trim().isEmpty())
      try {
        dj dj = dk.a((aI)this.g, this.c.getText());
        this.h.a(dj);
      } catch (V.g g1) {
        throw new a(g1.getMessage());
      }  
    if (this.d.isEnabled()) {
      this.h.a((int)Math.round(this.d.e()));
    } else {
      this.h.a(0);
      this.h.a(this.f.getSelectedItem().toString());
    } 
    return this.h;
  }
  
  private JPanel a(String paramString1, Component paramComponent, String paramString2) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JLabel jLabel = new JLabel(s.g.b(paramString1), 4);
    jPanel1.add(jLabel, "Center");
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    jPanel2.add(paramComponent, "Center");
    if (paramString2 != null && !paramString2.isEmpty()) {
      cF cF = new cF(s.g.b(paramString2), s.g.d());
      jPanel2.add((Component)cF, "East");
    } 
    jPanel1.add(jPanel2, "East");
    return jPanel1;
  }
  
  public void a(String paramString) {
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
    String str1 = this.a.getText().trim();
    R r = b.a(str1);
    if (!r.a())
      return r; 
    String str2 = this.b.getText().trim();
    if (!str2.isEmpty())
      try {
        i.a(str2, (aI)this.g);
      } catch (U u) {
        r.c();
        r.a(u.getLocalizedMessage());
        return r;
      }  
    String str3 = this.c.getText().trim();
    if (!str3.isEmpty())
      try {
        i.a(str3, (aI)this.g);
      } catch (U u) {
        r.c();
        r.a(u.getLocalizedMessage());
        return r;
      }  
    if (Double.isNaN(this.d.e())) {
      r.c();
      r.a("Please set the number of decimal places.");
      return r;
    } 
    r.b();
    return r;
  }
  
  public void a(R paramR) {
    this.g = paramR;
    this.e.removeAllItems();
    String[] arrayOfString = paramR.s();
    arrayOfString = S.a(arrayOfString);
    for (String str : arrayOfString) {
      if (!str.contains(" "))
        this.e.addItem(str); 
    } 
  }
  
  public void a(ac paramac) {
    this.h = paramac;
    this.a.setText(this.h.b());
    this.b.setText(this.h.aJ());
    String str = (this.h.g() != null) ? this.h.g().toString() : "";
    this.c.setText(str);
    this.d.a(this.h.d());
    a(this.h.a());
    this.f.setSelectedItem(this.h.k());
    this.i.b();
  }
  
  public boolean c() {
    return this.i.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */