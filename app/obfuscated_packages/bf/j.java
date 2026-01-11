package bf;

import G.Q;
import javax.swing.tree.DefaultMutableTreeNode;
import s.g;

public class j extends DefaultMutableTreeNode {
  private Q a;
  
  public j(Q paramQ) {
    super(paramQ);
    this.a = paramQ;
  }
  
  public j(String paramString) {
    super(g.b(paramString));
  }
  
  public String toString() {
    return (a() != null) ? a().aL() : super.toString();
  }
  
  public Q a() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bf/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */