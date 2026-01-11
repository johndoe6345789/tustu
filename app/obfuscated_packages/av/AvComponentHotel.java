package av;

import G.Manager;
import G.CloneableImpl;
import G.c;
import G.GInterfaceDb;
import h.IOProperties;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AvComponentHotel extends g {
  private List e;
  
  protected static h a = null;
  
  public static h f() {
    if (a == null)
      a = new h(); 
    return a;
  }
  
  private AvComponentHotel() {
    a("SingleDtaMlvConfigInstance", "./inc/dtaTables.ecu");
  }
  
  public void a(String paramString) {
    try {
      c(paramString);
      a("rpmBins", 3);
      a("mapBins", 1905);
      a("tpsBins", 1999);
      b("fuelData", 303);
      b("sparkData", 23);
      b("lambdaData", 2333);
      boolean bool = ((String)this.e.get(1903)).trim().equals("0");
      String str1 = "mapBins";
      String str2 = "MAP";
      if (bool) {
        str1 = "tpsBins";
        str2 = "TPS";
      } 
      IOProperties.c("yAxisField", str2);
      c c = new c(str2);
      Iterator<CloneableImpl> iterator = this.b.n();
      while (iterator.hasNext()) {
        CloneableImpl CloneableImpl = iterator.next();
        CloneableImpl.b(str1);
        CloneableImpl.e(str2);
        CloneableImpl.b((GInterfaceDb)c);
      } 
      this.b.h().g();
      g();
    } catch (Exception exception) {
      Logger.getLogger(h.class.getName()).log(Level.SEVERE, (String)null, exception);
      throw new V.h("Failed to load tune file:\n" + paramString + "\nReported Error:\n" + exception.getMessage());
    } 
  }
  
  public void j(String paramString) {
    if (this.e == null || this.e.isEmpty() || paramString == null || paramString.isEmpty())
      return; 
    try {
      c("fuelData", 303);
      c("sparkData", 23);
      c("lambdaData", 2333);
      d(paramString);
      this.b.h().g();
    } catch (Exception exception) {
      Logger.getLogger(h.class.getName()).log(Level.SEVERE, (String)null, exception);
      throw new V.h("Failed to save tune file:\n" + paramString + "\nReported Error:\n" + exception.getMessage());
    } 
  }
  
  private int a(String paramString, int paramInt) {
    Manager Manager = this.b.c(paramString);
    double d = Manager.F().a();
    int IOProperties = Manager.b();
    double[][] arrayOfDouble = new double[IOProperties][1];
    paramInt--;
    for (byte b = 0; b < IOProperties; b++)
      arrayOfDouble[b][0] = Double.parseDouble((String)this.e.get(paramInt + b)) * d; 
    this.b.a(paramString, arrayOfDouble);
    return IOProperties;
  }
  
  private void b(String paramString, int paramInt) {
    Manager Manager = this.b.c(paramString);
    double d = Manager.F().a();
    int IOProperties = (int)(Manager.c()).b.a();
    int j = (int)(Manager.c()).a.a();
    double[][] arrayOfDouble = new double[IOProperties][j];
    paramInt--;
    for (byte b = 0; b < IOProperties; b++) {
      for (byte b1 = 0; b1 < j; b1++)
        arrayOfDouble[b][b1] = Integer.parseInt(((String)this.e.get(paramInt + b * j + b1)).trim()) * d; 
    } 
    this.b.a(paramString, arrayOfDouble);
  }
  
  private void c(String paramString, int paramInt) {
    Manager Manager = this.b.c(paramString);
    double d = Manager.F().a();
    int IOProperties = (int)(Manager.c()).b.a();
    int j = (int)(Manager.c()).a.a();
    double[][] arrayOfDouble = Manager.IOProperties(this.b.p());
    paramInt--;
    for (byte b = 0; b < IOProperties; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        this.e.set(paramInt + b * j + b1, String.format(" %d ", new Object[] { Long.valueOf(Math.round(arrayOfDouble[b][b1] / d)) }));
      } 
    } 
  }
  
  private void c(String paramString) {
    this.e = new ArrayList(2000);
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(paramString));
      String str;
      while ((str = bufferedReader.readLine()) != null)
        this.e.add(str); 
    } catch (Exception exception) {
      Logger.getLogger(h.class.getName()).log(Level.SEVERE, (String)null, exception);
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (IOException iOException) {} 
    } 
  }
  
  private void d(String paramString) {
    if (this.e == null || this.e.isEmpty())
      return; 
    File file = new File(paramString);
    if (file.exists() && file.isFile())
      file.delete(); 
    BufferedWriter bufferedWriter = null;
    try {
      bufferedWriter = new BufferedWriter(new FileWriter(paramString));
      for (String str : this.e) {
        bufferedWriter.write(str);
        bufferedWriter.newLine();
      } 
      bufferedWriter.flush();
    } catch (Exception exception) {
      Logger.getLogger(h.class.getName()).log(Level.SEVERE, (String)null, exception);
    } finally {
      if (bufferedWriter != null)
        try {
          bufferedWriter.close();
        } catch (IOException iOException) {} 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */