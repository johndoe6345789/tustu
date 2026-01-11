package bB;

import V.a;
import bH.D;
import bH.J;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class l extends JPanel implements bc {
  h a;
  
  d b;
  
  ab c;
  
  private q f = null;
  
  JButton d;
  
  JButton e;
  
  private int g;
  
  public l(ab paramab, q paramq) {
    this(paramab);
    a(paramq);
  }
  
  public l(ab paramab) {
    this.c = paramab;
    setLayout(new BorderLayout(5, eJ.a(8)));
    setBorder(BorderFactory.createEmptyBorder(eJ.a(10), eJ.a(10), eJ.a(10), eJ.a(10)));
    this.a = new h(paramab);
    JScrollPane jScrollPane = new JScrollPane(this.a);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("Center", jScrollPane);
    add("Center", jPanel1);
    jScrollPane.setPreferredSize(eJ.a(400, 180));
    this.a.getSelectionModel().addListSelectionListener(new p(this, null));
    if (!J.b()) {
      jPanel1.add("South", new JLabel(a("Use CTRL or Shift to multi-select"), 0));
    } else {
      jPanel1.add("South", new JLabel(a("Use Command, CTRL or Shift to multi-select"), 0));
    } 
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    add("South", jPanel2);
    this.b = new d(paramab);
    this.b.setEnabled(false);
    jPanel2.add("Center", this.b);
    jPanel2.setBorder(BorderFactory.createTitledBorder(a("Edit Field Attributes")));
    try {
      Image image = cO.a().a(cO.P, this);
      ImageIcon imageIcon = new ImageIcon(image);
      this.d = new JButton(a("Save"), imageIcon);
      this.d.addActionListener(new m(this));
      this.d.setEnabled(false);
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout(2));
      jPanel2.add("South", jPanel);
      this.e = new JButton("Reset Default Limits");
      this.e.addActionListener(new n(this));
      this.e.setEnabled(false);
      jPanel.add(this.e);
      jPanel.add(this.d);
    } catch (a a) {
      D.a((Exception)a);
    } 
  }
  
  private void b() {
    r r = this.f.b(this.b.e());
    if (r != null && !r.e().trim().isEmpty()) {
      String[] arrayOfString = this.b.a();
      if (arrayOfString.length > 1) {
        for (byte b = 0; b < arrayOfString.length; b++) {
          r r1 = this.a.a(arrayOfString[b]);
          if (r1 != null) {
            r1.b(r.b());
            r1.a(r.a());
            r1.a(r.f());
            this.f.a(r);
            this.f.a(r.e());
          } 
        } 
        this.a.b();
      } else {
        this.a.a(r);
        this.f.a(r);
        this.f.a(r.e());
        this.a.b();
      } 
    } else {
      String[] arrayOfString = this.b.a();
      if (arrayOfString.length > 0) {
        for (byte b = 0; b < arrayOfString.length; b++) {
          r r1 = this.a.a(arrayOfString[b]);
          if (r1 != null) {
            r1.b(Double.NaN);
            r1.a(Double.NaN);
            r1.a(-1);
            this.f.a(r1);
            this.f.a(r1.e());
          } 
        } 
        this.a.b();
      } 
    } 
    this.b.f();
    this.b.d();
    this.b.setEnabled(false);
    this.d.setEnabled(false);
    this.e.setEnabled(false);
  }
  
  private String a(String paramString) {
    return (this.c != null) ? this.c.a(paramString) : paramString;
  }
  
  public q a() {
    return this.f;
  }
  
  public void a(q paramq) {
    this.f = paramq;
    if (paramq != null) {
      ArrayList<r> arrayList = new ArrayList();
      arrayList.addAll(paramq.a());
      for (String str : paramq.b()) {
        if (!a(arrayList, str)) {
          r r = paramq.b(str);
          if (r == null) {
            a a = new a();
            a.a(str);
            a.a(Double.NaN);
            a.b(Double.NaN);
            a.a(-1);
            r = a;
          } 
          arrayList.add(r);
        } 
      } 
      Collections.sort(arrayList, new o(this));
      this.a.a(arrayList);
      this.a.a();
    } 
    this.b.a(paramq.b());
    this.b.f();
  }
  
  public void a(Window paramWindow) {
    JDialog jDialog = bV.b(this, paramWindow, a("Field Min & Max Editor"), this);
    jDialog.pack();
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
  }
  
  private boolean a(List paramList, String paramString) {
    for (r r : paramList) {
      if (r.e().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private boolean c() {
    r r = this.b.e();
    if (r != null && !r.e().trim().isEmpty()) {
      this.b.d();
      String[] arrayOfString = this.b.a();
      if (arrayOfString.length > 1) {
        for (byte b = 0; b < arrayOfString.length; b++) {
          r r1 = this.a.a(arrayOfString[b]);
          if (r1 != null) {
            r1.b(r.b());
            r1.a(r.a());
            r1.a(r.f());
            this.f.a(r1);
          } 
        } 
        this.a.b();
      } else {
        this.a.a(r);
        this.f.a(r);
      } 
      return true;
    } 
    return false;
  }
  
  private void a(int paramInt) {
    if (this.b.c()) {
      String str = a("The Field limit currently being edited has not been saved.") + "\n" + a("Would you like to save it now?");
      if (bV.a(str, this.b, true))
        if (c()) {
          this.b.f();
        } else {
          if (this.g >= 0)
            this.a.getSelectionModel().setSelectionInterval(paramInt, paramInt); 
          return;
        }  
    } 
    if (paramInt >= 0) {
      this.g = paramInt;
      r r1 = this.a.a(paramInt);
      r r2 = null;
      r2 = a().b(r1);
      this.b.a(r1.e(), r1.a(), r1.b(), r1.f());
      this.b.setEnabled(true);
      this.d.setEnabled(true);
      this.e.setEnabled(true);
      if (this.a.getSelectedRowCount() > 1) {
        int[] arrayOfInt = this.a.getSelectedRows();
        String str = "";
        for (byte b = 0; b < arrayOfInt.length; b++) {
          if (b == 0) {
            str = str + this.a.a(arrayOfInt[b]).e();
          } else {
            str = str + ", " + this.a.a(arrayOfInt[b]).e();
          } 
        } 
        this.b.a(str);
      } 
    } else {
      this.b.f();
      this.b.setEnabled(false);
      this.d.setEnabled(false);
    } 
  }
  
  public void close() {
    if (this.b.c()) {
      String str = a("The Field limit currently being edited has not been saved.") + "\n" + a("Would you like to save it now?");
      if (bV.a(str, this.b, true))
        c(); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */