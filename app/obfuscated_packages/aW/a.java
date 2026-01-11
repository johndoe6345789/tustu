package aW;

import A.f;
import A.g;
import A.i;
import A.q;
import A.r;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import s.g;

public class a extends JPanel implements p {
  JComboBox a = new JComboBox();
  
  JScrollPane b = null;
  
  g c;
  
  i d;
  
  f e = null;
  
  o f = null;
  
  d g = new d(this);
  
  List h = new ArrayList();
  
  public a(i parami, g paramg) {
    this(parami, paramg, true);
  }
  
  public a(i parami, g paramg, boolean paramBoolean) {
    this.c = paramg;
    this.d = parami;
    List list = parami.a();
    this.a.addItem("");
    Iterator<q> iterator = list.iterator();
    while (iterator.hasNext()) {
      c c = new c(this, iterator.next());
      this.a.addItem(c);
    } 
    this.a.addItemListener(new b(this));
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setBorder(BorderFactory.createTitledBorder(g.b("Connection Type")));
    jPanel.setLayout(new FlowLayout(1));
    jPanel.add(this.a);
    if (paramBoolean)
      add("North", jPanel); 
    this.f = new o(this);
    this.f.a(this);
    this.b = new JScrollPane(this.f);
    Dimension dimension = eJ.a(360, 130);
    this.b.setMinimumSize(dimension);
    this.b.setPreferredSize(dimension);
    this.b.setMaximumSize(dimension);
    this.b.setBorder(BorderFactory.createTitledBorder(g.b("Connection Settings")));
    add("Center", this.b);
    if (paramg.a() != null)
      a(paramg.a()); 
  }
  
  public void a(f paramf) {
    if (paramf == null) {
      this.a.setSelectedIndex(0);
    } else {
      for (byte b = 0; b < this.a.getItemCount(); b++) {
        if (this.a.getItemAt(b).toString().equals(paramf.h())) {
          if (this.a.getSelectedIndex() != b)
            this.a.setSelectedIndex(b); 
          for (r r : paramf.l())
            this.f.a(r.c(), paramf.a(r.c())); 
          break;
        } 
      } 
    } 
  }
  
  private void d() {
    if (this.e != null)
      this.e.b(this.g); 
    this.e = b();
    if (this.e != null) {
      this.e.a(this.g);
      b("Driver", this.e.h());
      List list = this.e.l();
      this.f.a();
      this.f.a(list);
      for (r r : list)
        this.f.a(r.c(), this.e.a(r.c())); 
      validate();
    } else {
      this.f.a();
      validate();
      b("Driver", (String)null);
    } 
  }
  
  public void a() {
    d();
  }
  
  public Object a(String paramString) {
    return this.f.a(paramString);
  }
  
  public f b() {
    Object object = this.a.getSelectedItem();
    if (object instanceof c) {
      c c = (c)object;
      try {
        return (this.e != null && c.equals(this.e)) ? this.e : c.a().c("DEFAULT_INSTANCE");
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
        return null;
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
        return null;
      } 
    } 
    return null;
  }
  
  public boolean c() {
    return this.f.b();
  }
  
  public void a(p paramp) {
    this.h.add(paramp);
  }
  
  private void b(String paramString1, String paramString2) {
    for (p p1 : this.h)
      p1.a(paramString1, paramString2); 
  }
  
  public void a(String paramString1, String paramString2) {
    b(paramString1, paramString2);
  }
  
  public f b(String paramString) {
    for (byte b = 0; b < this.a.getItemCount(); b++) {
      if (this.a.getItemAt(b) instanceof c) {
        c c = this.a.getItemAt(b);
        if (c.a().a().equals(paramString))
          try {
            return c.a().c("DEFAULT_INSTANCE");
          } catch (InstantiationException instantiationException) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
          } catch (IllegalAccessException illegalAccessException) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
          }  
      } 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */