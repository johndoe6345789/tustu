package bF;

import bH.I;
import bH.X;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class y implements TableModel {
  List a = new ArrayList();
  
  private x d = new z(this);
  
  ArrayList b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  private boolean e = false;
  
  private boolean f = false;
  
  private boolean g = false;
  
  private boolean h = false;
  
  private boolean i = false;
  
  private List j = new ArrayList();
  
  public void a(C paramC) {
    this.a.add(paramC);
  }
  
  public int a() {
    return this.a.size();
  }
  
  public int getRowCount() {
    return this.e ? b() : k();
  }
  
  public int b() {
    int i = 0;
    for (C c : this.a) {
      if (c.a() > i)
        i = c.a(); 
    } 
    return i;
  }
  
  public int getColumnCount() {
    return this.e ? k() : b();
  }
  
  public String getColumnName(int paramInt) {
    return this.e ? c(paramInt).b() : this.d.a(paramInt);
  }
  
  public void a(x paramx) {
    this.d = paramx;
  }
  
  public Class getColumnClass(int paramInt) {
    return Double.class;
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return true;
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    return this.e ? c(paramInt2).a(paramInt1) : c(paramInt1).a(paramInt2);
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    Double double_ = I.a(paramObject);
    if (double_ == null)
      return; 
    if (this.e) {
      int i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    paramInt1 = a(paramInt1);
    if (!((C)this.a.get(paramInt1)).a(paramInt2).equals(double_)) {
      ((C)this.a.get(paramInt1)).a(paramInt2, double_);
      if (!this.i) {
        a(double_, paramInt1, paramInt2);
      } else if (!d(paramInt1, paramInt2)) {
        this.j.add(new A(this, paramInt1, paramInt2));
      } 
    } 
  }
  
  private boolean d(int paramInt1, int paramInt2) {
    for (A a : this.j) {
      if (a.b == paramInt2 && a.a == paramInt1)
        return true; 
    } 
    return false;
  }
  
  public void a(Object paramObject, int paramInt1, int paramInt2) {
    if (paramObject instanceof String)
      paramObject = Double.valueOf(Double.parseDouble((String)paramObject)); 
    Double double_ = (Double)paramObject;
    if (this.e) {
      int i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    if (!((C)this.a.get(paramInt1)).a(paramInt2).equals(double_)) {
      ((C)this.a.get(paramInt1)).a(paramInt2, double_);
      a(double_, paramInt1, paramInt2);
    } 
  }
  
  private void a(Double paramDouble, int paramInt1, int paramInt2) {
    for (B b : this.b)
      b.a(paramInt1, paramInt2, paramDouble.doubleValue()); 
    if (this.e) {
      int i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    paramInt1 = b(paramInt1);
    for (TableModelListener tableModelListener : this.c) {
      TableModelEvent tableModelEvent = new TableModelEvent(this, paramInt1, paramInt1, paramInt2);
      tableModelListener.tableChanged(tableModelEvent);
    } 
  }
  
  public C a(int paramInt1, int paramInt2) {
    return this.e ? c(paramInt2) : c(paramInt1);
  }
  
  public boolean b(int paramInt1, int paramInt2) {
    if (this.e) {
      int i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    return c(paramInt1).b(paramInt2);
  }
  
  public double c(int paramInt1, int paramInt2) {
    if (this.e) {
      int i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    return c(paramInt1).c(paramInt2);
  }
  
  public void a(B paramB) {
    if (!this.b.contains(paramB))
      this.b.add(paramB); 
  }
  
  public void b(B paramB) {
    this.b.remove(paramB);
  }
  
  public void addTableModelListener(TableModelListener paramTableModelListener) {
    if (!this.c.contains(paramTableModelListener))
      this.c.add(paramTableModelListener); 
  }
  
  public void removeTableModelListener(TableModelListener paramTableModelListener) {
    this.c.remove(paramTableModelListener);
  }
  
  public x c() {
    return this.d;
  }
  
  public String[][] d() {
    if (this.e) {
      String[][] arrayOfString1 = new String[b()][1];
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
        arrayOfString1[b1][0] = this.d.a(b1); 
      return arrayOfString1;
    } 
    String[][] arrayOfString = new String[k()][1];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b][0] = c(b).b(); 
    return arrayOfString;
  }
  
  public String[] e() {
    if (g()) {
      String[] arrayOfString1 = new String[((C)this.a.get(0)).a()];
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
        arrayOfString1[b1] = X.c(((C)this.a.get(0)).a(b1).doubleValue(), ((C)this.a.get(0)).c()); 
      return arrayOfString1;
    } 
    if (h()) {
      String[] arrayOfString1 = new String[((C)this.a.get(this.a.size() - 1)).a()];
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
        arrayOfString1[b1] = X.c(((C)this.a.get(this.a.size() - 1)).a(b1).doubleValue(), ((C)this.a.get(this.a.size() - 1)).c()); 
      return arrayOfString1;
    } 
    String[] arrayOfString = new String[b()];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = this.d.a(b); 
    return arrayOfString;
  }
  
  public boolean f() {
    return this.e;
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public boolean g() {
    return this.f;
  }
  
  public void b(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public void c(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  private int k() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.a.size(); b2++) {
      if (!((C)this.a.get(b2)).g())
        b1++; 
    } 
    return this.a.size() - b1;
  }
  
  private int a(int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.a.size(); b2++) {
      if (!((C)this.a.get(b2)).g()) {
        b1++;
      } else if (b2 - b1 == paramInt) {
        return b2;
      } 
    } 
    return paramInt;
  }
  
  private int b(int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.a.size() && b2 < paramInt; b2++) {
      if (!((C)this.a.get(b2)).g()) {
        b1++;
      } else if (b2 - b1 == paramInt) {
        return b2;
      } 
    } 
    return paramInt - b1;
  }
  
  private C c(int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.a.size(); b2++) {
      if (!((C)this.a.get(b2)).g()) {
        b1++;
      } else if (b2 - b1 == paramInt) {
        return this.a.get(b2);
      } 
    } 
    return null;
  }
  
  public boolean h() {
    return this.g;
  }
  
  public void d(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  public Double[][] i() {
    Double[][] arrayOfDouble = new Double[this.a.size()][((C)this.a.get(0)).a()];
    for (byte b = 0; b < this.a.size(); b++) {
      C c = this.a.get(b);
      for (byte b1 = 0; b1 < c.a(); b1++)
        arrayOfDouble[b][b1] = c.a(b1); 
    } 
    return arrayOfDouble;
  }
  
  public void a(Double[][] paramArrayOfDouble) {
    for (byte b = 0; b < this.a.size(); b++) {
      C c = this.a.get(b);
      for (byte b1 = 0; b1 < c.a(); b1++)
        c.b(b1, paramArrayOfDouble[b][b1]); 
    } 
  }
  
  private void l() {
    for (A a : this.j) {
      double d = ((C)this.a.get(a.a)).a(a.b).doubleValue();
      a(Double.valueOf(d), a.a, a.b);
    } 
  }
  
  public boolean j() {
    return this.i;
  }
  
  public void e(boolean paramBoolean) {
    this.i = paramBoolean;
    if (!paramBoolean)
      l(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */