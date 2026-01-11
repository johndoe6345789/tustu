package aP;

import bH.s;
import javax.swing.JOptionPane;

class hP implements s {
  hP(hO paramhO) {}
  
  public void a(String paramString, Exception paramException, Object paramObject) {
    if (paramException != null) {
      System.out.println("\t" + paramException.getMessage());
      paramException.printStackTrace();
      if (paramException.getMessage() != null && paramString.indexOf(paramException.getMessage()) == -1)
        paramString = paramString + "\nReported Error:\n" + paramException.getMessage(); 
    } 
    JOptionPane.showMessageDialog(dd.a().c(), paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */