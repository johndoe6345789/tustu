package R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOInRPackage {
  private static g e = null;
  
  public static String a = "messageType";
  
  public static String b = "messageId";
  
  public static String c = "creationTime";
  
  boolean d = true;
  
  public static g a() {
    if (e == null)
      e = new g(); 
    return e;
  }
  
  public File a(l paraml) {
    Properties properties = new Properties();
    Field[] arrayOfField = paraml.getClass().getDeclaredFields();
    AccessibleObject.setAccessible((AccessibleObject[])arrayOfField, true);
    for (byte b = 0; b < arrayOfField.length; b++) {
      Field field = arrayOfField[b];
      try {
        properties.setProperty(field.getName(), "" + field.get(paraml));
      } catch (Exception exception) {}
    } 
    properties.setProperty(a, paraml.a());
    properties.setProperty(b, paraml.k());
    properties.setProperty(c, paraml.l() + "");
    return a(properties);
  }
  
  public ArrayList b() {
    ArrayList<l> arrayList = new ArrayList();
    File[] arrayOfFile = e();
    for (byte b = 0; b < arrayOfFile.length; b++) {
      try {
        l l = a(arrayOfFile[b]);
        arrayList.add(l);
      } catch (i i) {
        Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, i);
      } 
    } 
    return arrayList;
  }
  
  private l a(File paramFile) {
    Properties properties = b(paramFile);
    a a = null;
    String str = properties.getProperty(a);
    if (str.equals(l.a)) {
      a = new a();
      a(properties, a);
      return a;
    } 
    if (str.equals(l.c)) {
      j j = new j();
      a(properties, j);
      return j;
    } 
    if (str.equals(l.b))
      throw new i("Not supported messageType:" + str + "\nin message:\n" + paramFile.getAbsolutePath()); 
    throw new i("Unknown messageType:" + str + "\nin message:\n" + paramFile.getAbsolutePath());
  }
  
  private l a(Properties paramProperties, l paraml) {
    try {
      long l1 = Long.parseLong(paramProperties.getProperty(c));
      paraml.a(l1);
    } catch (Exception exception) {}
    Field[] arrayOfField = paraml.getClass().getDeclaredFields();
    AccessibleObject.setAccessible((AccessibleObject[])arrayOfField, true);
    for (byte b = 0; b < arrayOfField.length; b++) {
      Field field = arrayOfField[b];
      try {
        if (field.getType() == int.class) {
          int i = Integer.parseInt(paramProperties.getProperty(field.getName()));
          field.setInt(paraml, i);
        } else {
          field.set(paraml, paramProperties.getProperty(field.getName()));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
    return paraml;
  }
  
  private Properties b(File paramFile) {
    FileInputStream fileInputStream = null;
    try {
      Properties properties = new Properties();
      fileInputStream = new FileInputStream(paramFile);
      properties.loadFromXML(fileInputStream);
      return properties;
    } catch (Exception exception) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, exception);
      throw new i("Could not load message:\n" + paramFile.getAbsolutePath() + "\nMessage:" + exception.getMessage());
    } finally {
      try {
        fileInputStream.close();
      } catch (IOException iOException) {
        Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } 
  }
  
  private File[] e() {
    File file = c();
    return file.listFiles(new h(this));
  }
  
  public File c() {
    String str = System.getProperty("user.home") + File.separator + ".efiAnalytics" + File.separator + "messages" + File.separator;
    File file = new File(str);
    if (!file.exists())
      file.mkdirs(); 
    return file;
  }
  
  public boolean a(String paramString) {
    String str = c().getAbsolutePath() + File.separator + paramString + ".svcmsg";
    File file = new File(str);
    return file.delete();
  }
  
  private File a(Properties paramProperties) {
    FileOutputStream fileOutputStream = null;
    String str = c().getAbsolutePath() + File.separator + paramProperties.getProperty(b) + ".svcmsg";
    File file = new File(str);
    try {
      file.createNewFile();
      fileOutputStream = new FileOutputStream(file);
      paramProperties.storeToXML(fileOutputStream, "Message Stored for processing when network connectivity is available.");
    } catch (FileNotFoundException fileNotFoundException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, fileNotFoundException);
      throw new i("Create File failed:\n" + file.getAbsolutePath());
    } catch (IOException iOException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new i("unable to write message to:\n" + file.getAbsolutePath());
    } finally {
      try {
        fileOutputStream.close();
      } catch (IOException iOException) {
        Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } 
    this.d = true;
    return file;
  }
  
  boolean d() {
    if (this.d) {
      this.d = ((e()).length > 0);
      return this.d;
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/R/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */