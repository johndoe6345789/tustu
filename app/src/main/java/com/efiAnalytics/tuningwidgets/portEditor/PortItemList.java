package com.efiAnalytics.tuningwidgets.portEditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class PortItemList extends JList {
  DefaultListModel a = null;

  ArrayList b = new ArrayList();

  public PortItemList(OutputPortEditor paramOutputPortEditor) {
    this.a = new DefaultListModel();
    setModel(this.a);
    setCellRenderer(new n(paramOutputPortEditor));
    addListSelectionListener(new m(this, paramOutputPortEditor));
    setSelectionMode(0);
  }

  private void c() {
    E e = getSelectedValue();
    Iterator<ActionListener> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      ActionEvent actionEvent = new ActionEvent(this, 1001, "");
      ((ActionListener) iterator.next()).actionPerformed(actionEvent);
    }
  }

  private void a(o paramo) {
    this.a.addElement(paramo);
  }

  private void a(ActionListener paramActionListener) {
    this.b.add(paramActionListener);
  }

  public Object a() {
    return getSelectedValue();
  }

  public int b() {
    return this.a.getSize();
  }

  public Object a(int paramInt) {
    return this.a.elementAt(paramInt);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
