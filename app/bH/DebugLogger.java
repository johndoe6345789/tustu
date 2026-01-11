package bH;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class D {
  static HashMap a = new HashMap<>();
  
  static HashMap b = new HashMap<>();
  
  private static boolean d = true;
  
  private static boolean e = false;
  
  private static s f = null;
  
  private static BufferedWriter g = null;
  
  private static List h = new ArrayList();
  
  private static List i = new ArrayList();
  
  private static String j = null;
  
  private static int k = 0;
  
  private static long l = Long.MAX_VALUE;
  
  private static int m = 120000;
  
  static PrintWriter c = null;
  
  public static boolean a() {
    return d;
  }
  
  public static void a(boolean paramBoolean) {
    d = paramBoolean;
  }
  
  public static void a(r paramr) {
    i.add(paramr);
  }
  
  private static void f(String paramString) {
    for (r r : i)
      r.a(paramString); 
  }
  
  public static void a(s params) {
    f = params;
  }
  
  public static void b() {
    for (l l : h) {
      if (l instanceof OutputStream)
        try {
          ((OutputStream)l).flush();
        } catch (Exception exception) {
          Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, exception);
        }  
    } 
  }
  
  private static ArrayList a(Thread paramThread) {
    return (ArrayList)b.get(paramThread);
  }
  
  private static ArrayList b(Thread paramThread) {
    return (ArrayList)a.get(paramThread);
  }
  
  private static void c(Thread paramThread) {
    b.remove(paramThread);
  }
  
  private static void d(Thread paramThread) {
    a.remove(paramThread);
  }
  
  public static void a(String paramString, Exception paramException) {
    paramString = "Error: " + paramString;
    g(paramString);
    f(paramString);
    ArrayList<String> arrayList = b(Thread.currentThread());
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    paramException.printStackTrace(printWriter);
    String str = stringWriter.toString();
    if (arrayList != null) {
      arrayList.add("Error: " + paramString);
      arrayList.add(str);
    } else {
      b("errorStack is null! the message should be: " + paramString + "\n" + str);
    } 
  }
  
  public static void a(String paramString) {
    paramString = "Error: " + paramString;
    g(paramString);
    f(paramString);
    ArrayList<String> arrayList = b(Thread.currentThread());
    if (arrayList != null)
      arrayList.add("Error: " + paramString); 
  }
  
  public static void b(String paramString) {
    g("Warning: " + paramString);
    ArrayList<String> arrayList = a(Thread.currentThread());
    if (arrayList != null)
      arrayList.add("Warning: " + paramString); 
  }
  
  public static void c(String paramString) {
    if (a())
      g("Debug: " + paramString); 
  }
  
  public static void d(String paramString) {
    g("Info: " + paramString);
  }
  
  private static void g(String paramString) {
    synchronized (System.out) {
      if (j == null || !j.equals(paramString) || System.currentTimeMillis() - l > m) {
        String str = DateFormat.getDateTimeInstance(3, 2).format(new Date());
        if (k > 1) {
          if (g != null) {
            try {
              g.append(str).append("[Duplicate entry] received ").append(k + " times: ").append(j).append('\n');
              g.flush();
            } catch (IOException iOException) {
              g = null;
              a("Log Write Failed, disabled output.");
            } 
          } else {
            System.out.println("[Duplicate entry] received " + k + " times: " + j);
          } 
          for (l l : h)
            l.a(str + " [Duplicate entries] received " + k + " times: " + j); 
        } 
        if (!e) {
          if (g != null) {
            try {
              g.append(str).append(" :").append(paramString).append('\n');
              g.flush();
            } catch (IOException iOException) {
              g = null;
              a("Log Write Failed, disabled output.");
            } 
          } else {
            System.out.println(str + " :" + paramString);
          } 
        } else {
          String[] arrayOfString = new String[2];
          arrayOfString[0] = str.toString();
          arrayOfString[1] = paramString;
          Logger.getLogger(D.class.getName()).log(Level.INFO, "{0}: {1}", (Object[])arrayOfString);
        } 
        for (l l : h)
          l.a(paramString); 
        k = 1;
        j = paramString;
        l = Long.MAX_VALUE;
      } else {
        if (k == 1)
          l = System.currentTimeMillis(); 
        k++;
      } 
    } 
  }
  
  public static void a(String paramString, Exception paramException, Object paramObject) {
    if (f != null) {
      f.a(paramString, paramException, paramObject);
    } else {
      if (paramException != null) {
        System.out.println("\t" + paramException.getMessage());
        paramException.printStackTrace();
        if (paramException.getMessage() != null && paramString.indexOf(paramException.getMessage()) == -1)
          paramString = paramString + "\nReported Error:\n" + paramException.getMessage(); 
      } 
      g("Error Reported: " + paramString);
    } 
  }
  
  public static void c() {
    ArrayList arrayList1 = (ArrayList)a.get(Thread.currentThread());
    if (b(Thread.currentThread()) == null) {
      arrayList1 = new ArrayList();
      a.put(Thread.currentThread(), arrayList1);
    } else {
      b(Thread.currentThread()).clear();
    } 
    ArrayList arrayList2 = (ArrayList)b.get(Thread.currentThread());
    if (arrayList2 == null) {
      arrayList2 = new ArrayList();
      b.put(Thread.currentThread(), arrayList2);
    } else {
      arrayList2.clear();
    } 
  }
  
  public static int d() {
    ArrayList arrayList = b(Thread.currentThread());
    if (arrayList == null || arrayList.isEmpty()) {
      d(Thread.currentThread());
      return 0;
    } 
    return arrayList.size();
  }
  
  public static int e() {
    ArrayList arrayList = a(Thread.currentThread());
    if (arrayList == null || arrayList.isEmpty()) {
      c(Thread.currentThread());
      return 0;
    } 
    return arrayList.size();
  }
  
  public static String f() {
    ArrayList arrayList1 = b(Thread.currentThread());
    ArrayList arrayList2 = a(Thread.currentThread());
    if (arrayList1 == null && arrayList2 == null)
      return "No errors or warnings captured."; 
    String str = "";
    if (arrayList1 != null) {
      str = arrayList1.size() + " Errors:\n";
      Iterator<E> iterator = arrayList1.iterator();
      while (iterator.hasNext())
        str = str + iterator.next().toString() + "\n"; 
      d(Thread.currentThread());
    } 
    if (arrayList2 != null) {
      str = str + "\n" + arrayList2.size() + " Warnings:\n";
      Iterator<E> iterator = arrayList2.iterator();
      while (iterator.hasNext())
        str = str + iterator.next().toString() + "\n"; 
      c(Thread.currentThread());
    } 
    return str;
  }
  
  public static void g() {
    Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
    for (Thread thread : map.keySet()) {
      c("Printing Stack for Thread: " + thread.toString());
      StackTraceElement[] arrayOfStackTraceElement = map.get(thread);
      for (byte b = 0; b < arrayOfStackTraceElement.length; b++)
        System.out.println("\t" + arrayOfStackTraceElement[b].toString()); 
    } 
  }
  
  public static void a(Exception paramException) {
    if (h() != null) {
      paramException.printStackTrace(h());
    } else {
      paramException.printStackTrace();
    } 
  }
  
  private static PrintWriter h() {
    if (c == null)
      if (g != null) {
        c = new PrintWriter(g);
      } else {
        c = new PrintWriter(System.out);
      }  
    return c;
  }
  
  public static void e(String paramString) {
    g(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */