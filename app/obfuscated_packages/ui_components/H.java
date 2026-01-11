package ao;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class H extends JPanel implements ChangeListener {
  JSlider a = new JSlider();
  
  JLabel b = new JLabel();
  
  List c = new ArrayList();
  
  public H() {
    this.a.setOrientation(0);
    this.a.setMinimum(-75);
    this.a.setMaximum(75);
    this.a.setPaintLabels(true);
    this.a.setMinorTickSpacing(5);
    this.a.setPaintTicks(true);
    this.a.addChangeListener(this);
    setLayout(new BorderLayout(5, 5));
    add("Center", this.a);
    add("East", this.b);
  }
  
  public void a(int paramInt) {
    this.b.setText("" + paramInt);
  }
  
  public void a(ChangeListener paramChangeListener) {
    this.c.add(paramChangeListener);
  }
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    this.b.setText(Integer.toString(this.a.getValue()));
    for (ChangeListener changeListener : this.c)
      changeListener.stateChanged(paramChangeEvent); 
  }
  
  public void b(int paramInt) {
    this.a.setValue(paramInt);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */