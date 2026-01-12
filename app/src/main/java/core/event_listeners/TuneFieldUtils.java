package ao;

import W.j;
import W.n;
import bH.a;
import g.IOJFileChooser;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;

public class hQ {
  public static String[] a(hW paramhW) {
    null = new String[paramhW.d()];
    byte b = 0;
    Iterator<String> iterator = paramhW.c();
    while (iterator.hasNext()) {
      null[b] = iterator.next();
      b++;
    }
    return IOJFileChooser.b(null);
  }

  public static boolean a(hW paramhW, bX parambX, String paramString) {
    return a(a(paramhW), parambX, new hR(paramString));
  }

  public static boolean a(String[] paramArrayOfString, bX parambX, a parama) {
    boolean bool = false;
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (parama == null || parama.a(paramArrayOfString[b])) {
        parambX.c(paramArrayOfString[b]);
        bool = true;
      }
    }
    return bool;
  }

  public static void a(JTextComponent paramJTextComponent, String paramString) {
    hT hT;
    n n = hx.a().r();
    hS hS = null;
    if (n != null) {
      TreeSet<String> treeSet = new TreeSet();
      for (j j : n) treeSet.add(j.a());
      Object[] arrayOfObject = treeSet.toArray();
      hS = new hS(arrayOfObject);
    } else {
      hT = new hT();
    }
    KeyStroke keyStroke = KeyStroke.getKeyStroke(paramString);
    paramJTextComponent.getInputMap().put(keyStroke, paramString);
    paramJTextComponent.getActionMap().put(paramString, hT);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
