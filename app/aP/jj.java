package aP;

import bH.I;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.EventObject;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

class jj extends JTable {
  DefaultTableCellRenderer a = null;
  
  Color b = new Color(240, 240, 255);
  
  private jq d = null;
  
  public jj(jc paramjc, TableModel paramTableModel) {
    super(paramTableModel);
    setColumnSelectionAllowed(true);
    getTableHeader().setReorderingAllowed(false);
    DefaultListSelectionModel defaultListSelectionModel = new DefaultListSelectionModel();
    defaultListSelectionModel.setSelectionMode(2);
    setSelectionModel(defaultListSelectionModel);
  }
  
  public TableCellRenderer getCellRenderer(int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      if (paramInt2 == 0 && paramInt1 % 2 == 0) {
        a().setBackground(this.b);
      } else {
        a().setBackground(Color.WHITE);
      } 
      a().setForeground(Color.black);
    } 
    return a();
  }
  
  protected DefaultTableCellRenderer a() {
    if (this.a == null) {
      this.a = (DefaultTableCellRenderer)getDefaultRenderer(String.class);
      this.a.setVerticalTextPosition(0);
      this.a.setHorizontalTextPosition(0);
    } 
    return this.a;
  }
  
  protected boolean processKeyBinding(KeyStroke paramKeyStroke, KeyEvent paramKeyEvent, int paramInt, boolean paramBoolean) {
    if (paramKeyEvent.getID() == 401 && paramInt == 0) {
      if (paramKeyEvent.getModifiers() == 1)
        switch (paramKeyEvent.getKeyCode()) {
          case 61:
            SwingUtilities.invokeLater(new jk(this));
            return true;
          case 56:
            this.c.h();
            return true;
        }  
      switch (paramKeyEvent.getKeyCode()) {
        case 45:
          SwingUtilities.invokeLater(new jl(this));
          return true;
        case 109:
          SwingUtilities.invokeLater(new jm(this));
          return true;
        case 44:
          this.c.g();
          return true;
        case 46:
          this.c.a();
          return true;
        case 87:
          this.c.g();
          return true;
        case 81:
          this.c.a();
          return true;
        case 61:
          this.c.b();
          return true;
        case 107:
          this.c.j();
          return true;
      } 
      if (paramKeyEvent.getModifiers() == 0 && a(paramKeyEvent.getKeyChar()) && !I.a(paramKeyEvent.getKeyChar() + "") && paramKeyEvent.getKeyCode() != 10 && paramKeyEvent.getKeyCode() != 9 && paramKeyEvent.getKeyCode() != 38 && paramKeyEvent.getKeyCode() != 40 && paramKeyEvent.getKeyCode() != 37 && paramKeyEvent.getKeyCode() != 32 && paramKeyEvent.getKeyCode() != 39)
        return true; 
    } 
    if (paramKeyEvent.getID() == 401 && paramKeyEvent.getKeyCode() == 10 && isEditing())
      jc.a(this.c, true); 
    return super.processKeyBinding(paramKeyStroke, paramKeyEvent, paramInt, paramBoolean);
  }
  
  private boolean a(char paramChar) {
    return ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".indexOf(paramChar) != -1);
  }
  
  public TableCellEditor getDefaultEditor(Class paramClass) {
    if (this.d == null) {
      this.d = new jq(this.c);
      this.d.getComponent().setFont(getFont());
      addFocusListener(new jn(this));
    } 
    return this.d;
  }
  
  public void removeEditor() {
    int i = getEditingColumn();
    int j = getEditingRow();
    super.removeEditor();
    if (jc.a(this.c) && i >= 0 && j >= 0) {
      jo jo = new jo(this, j, i);
      SwingUtilities.invokeLater(jo);
      jc.a(this.c, false);
    } 
  }
  
  public boolean editCellAt(int paramInt1, int paramInt2, EventObject paramEventObject) {
    if (paramEventObject instanceof KeyEvent) {
      KeyEvent keyEvent = (KeyEvent)paramEventObject;
      if (keyEvent.getKeyCode() == 32)
        return false; 
    } 
    boolean bool = super.editCellAt(paramInt1, paramInt2, paramEventObject);
    if (bool)
      this.d.a(); 
    return bool;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */