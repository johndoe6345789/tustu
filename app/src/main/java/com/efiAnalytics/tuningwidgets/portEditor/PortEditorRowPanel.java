package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.SerializableImpl;
import G.Manager;
import G.ArrayListExceptionprintstacktrace;
import G.GComponentBq;
import com.efiAnalytics.ui.bc;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PortEditorRowPanel extends JPanel implements F, bc {
  R a = null;
  
  private Manager h = null;
  
  private Manager i = null;
  
  private Manager j = null;
  
  q b = null;
  
  C c = null;
  
  v d = null;
  
  B e = null;
  
  B f = null;
  
  int g = -1;
  
  public PortEditorRowPanel(R paramR, ArrayListExceptionprintstacktrace paramaS, int paramInt) {
    this.a = paramR;
    this.h = this.a.c(paramaS.h());
    this.i = this.a.c(paramaS.i());
    this.j = this.a.c(paramaS.j());
    this.g = paramInt;
    setLayout(new BoxLayout(this, 0));
    this.b = new q(this.a, paramaS.o());
    this.b.b(paramInt);
    this.b.a(this);
    add(this.b);
    this.c = new C(paramR, paramaS.g(), paramaS.f(), paramaS.r(), paramaS.p(), paramaS.q());
    this.c.a(new A(this));
    this.c.a(paramInt);
    add(this.c);
    a(paramR);
    ArrayList<String> arrayList = new ArrayList();
    Iterator<String> iterator = paramaS.b();
    while (iterator.hasNext())
      arrayList.add("" + iterator.next()); 
    String[] arrayOfString = new String[arrayList.size()];
    arrayOfString = arrayList.<String>toArray(arrayOfString);
    this.d = new v(paramR, paramaS.h(), arrayOfString);
    this.d.a(paramInt);
    this.d.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
    add(this.d);
    GComponentBq GComponentBq = new GComponentBq();
    GComponentBq.b(paramaS.i());
    this.e = new B(this, paramR, GComponentBq);
    this.e.a(0, paramInt);
    add((Component)this.e);
    GComponentBq = new GComponentBq();
    GComponentBq.b(paramaS.j());
    this.f = new B(this, paramR, GComponentBq);
    this.f.a(0, paramInt);
    add((Component)this.f);
  }
  
  private void a(SerializableImpl paramaH) {
    a();
  }
  
  public void a(int paramInt) {
    this.b.a(paramInt);
    this.c.b(paramInt);
    this.d.b(paramInt);
    this.e.a(this.g, paramInt);
    this.f.a(this.g, paramInt);
  }
  
  public void a() {
    this.e.f();
    this.f.f();
  }
  
  public void close() {
    this.c.close();
    this.d.close();
    this.e.close();
    this.f.close();
    this.i.c(0.0D);
    this.i.b(1.0D);
    this.j.c(0.0D);
    this.j.b(1.0D);
  }
  
  public void a(R paramR) {
    this.c.a(paramR);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */