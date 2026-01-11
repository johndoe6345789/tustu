package com.efiAnalytics.ui.calculators.calculator;

import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;

public final class Calculator extends JDialog implements ActionListener {
  private final Expression a = new Expression();
  
  private Display b;
  
  private Calculator$MyKeyDispacher c = new Calculator$MyKeyDispacher(this);
  
  public Calculator() {
    this((Window)null);
  }
  
  public Calculator(Window paramWindow) {
    super(paramWindow, "Calculator");
    a();
    setSize(eJ.a(300), eJ.a(350));
    setResizable(false);
    if (paramWindow != null) {
      setDefaultCloseOperation(2);
      setLocationRelativeTo(paramWindow);
    } else {
      setLocationRelativeTo((Component)null);
    } 
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.c);
    addWindowListener(new Calculator$1(this));
    enableEvents(262144L);
    setVisible(true);
  }
  
  public void dispose() {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.c);
    super.dispose();
  }
  
  private void a() {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BoxLayout(jPanel, 1));
    this.b = new Display();
    jPanel.add(this.b);
    jPanel.add(new Keypad(this));
    add(jPanel);
  }
  
  void a(String paramString) {
    this.b.b(paramString);
  }
  
  void b(String paramString) {
    this.a.a();
    this.b.d();
    this.b.b();
  }
  
  void c(String paramString) {
    this.b.a(paramString);
    Objects.requireNonNull(this.b);
    Operator.a(paramString).map(paramOperator -> Double.valueOf(this.a.a(paramOperator, this.b.a()))).ifPresent(this.b::a);
  }
  
  void d(String paramString) {
    this.b.e();
  }
  
  void e(String paramString) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    Command command = (Command)paramActionEvent.getSource();
    command.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/calculators/calculator/Calculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */