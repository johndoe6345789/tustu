package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import W.V;
import W.X;
import W.k;
import W.l;
import al.ExceptionInVPackage;
import al.AlInterfaceBravo;
import al.AbstractInAlPackage;
import al.XMLInputFactory;
import am.XMLInputFactory;
import am.AmComponentHotel;
import am.PathTostring;
import bH.D;
import bH.X;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AkInterfaceVictor extends V {
  public static final byte[] ExceptionInVPackage = new byte[] { 77, 68, 70, 32, 32, 32, 32, 32, 52 };
  
  ArrayList AlInterfaceBravo = new ArrayList();
  
  List XMLInputFactory = new ArrayList();
  
  int VInterfaceFoxtrot = 0;
  
  boolean g = false;
  
  List AmComponentHotel = new ArrayList();
  
  AlInterfaceBravo PathTostring = null;
  
  SeekableByteChannel j = null;
  
  int k = -1;
  
  int l = 0;
  
  float[] m = null;
  
  int[] n = null;
  
  String o = null;
  
  PathTostring p = null;
  
  AmComponentHotel q = null;
  
  public static W r = null;
  
  HashMap s = new HashMap<>();
  
  public String PathTostring() {
    return X.M;
  }
  
  public boolean ExceptionInVPackage(String paramString) {
    Path path = FileSystems.getDefault().getPath(paramString, new String[0]);
    try {
      this.j = Files.newByteChannel(path, new OpenOption[] { StandardOpenOption.READ });
      String str = ExceptionInVPackage(this.j);
      if (!str.startsWith("4"))
        throw new ExceptionInVPackage("This reader is for valid MDF 4 files only!"); 
      this.p = PathTostring.ExceptionInVPackage(path, this.j);
      this.q = this.p.j();
      XMLInputFactory XMLInputFactory = new XMLInputFactory();
      Properties properties = XMLInputFactory.ExceptionInVPackage(this.q);
      StringBuilder stringBuilder = new StringBuilder();
      for (String str1 : properties.stringPropertyNames())
        stringBuilder.append(str1).append(": ").append(properties.getProperty(str1)).append("\n"); 
      List list = AbstractInAlPackage.ExceptionInVPackage(this.q);
      if (r != null)
        list = r.ExceptionInVPackage(list); 
      for (XMLInputFactory e1 : list) {
        try {
          AlInterfaceBravo b1 = new AlInterfaceBravo(this.j, e1);
          b1.ExceptionInVPackage("Data Group " + e1.AmComponentHotel());
          if (b1.c() && b1.AlInterfaceBravo() > 2L)
            this.XMLInputFactory.add(b1); 
        } catch (BufferUnderflowException|IOException bufferUnderflowException) {
          D.AlInterfaceBravo("Failed to add DataGroup: " + bufferUnderflowException.getLocalizedMessage());
        } 
      } 
      if (this.XMLInputFactory.isEmpty())
        return false; 
      for (AlInterfaceBravo b1 : this.XMLInputFactory)
        this.l += b1.VInterfaceFoxtrot(); 
      this.l -= this.XMLInputFactory.size() - 1;
      this.PathTostring = l();
      D.AbstractInAlPackage("Core Data Group selected: " + this.PathTostring.AmComponentHotel() + ", with cycle count of: " + this.PathTostring.AlInterfaceBravo());
      this.XMLInputFactory.remove(this.PathTostring);
      stringBuilder.append("------------------ Data Groups Info ------------------\n");
      stringBuilder.append("Total Channels for all groups: ").append(this.l).append("\n");
      stringBuilder.append("Data Rate driven by ").append(this.PathTostring.AmComponentHotel()).append(" Avg Records/Sec: ").append(X.c(this.PathTostring.ExceptionInVPackage(), 3)).append("\n");
      stringBuilder.append(this.PathTostring.AmComponentHotel()).append(" ").append(this.PathTostring.VInterfaceFoxtrot()).append(" Channels:\n");
      for (ExceptionInVPackage ExceptionInVPackage : this.PathTostring.XMLInputFactory()) {
        stringBuilder.append("\t").append(ExceptionInVPackage.XMLInputFactory());
        if (ExceptionInVPackage.VInterfaceFoxtrot() != null && !ExceptionInVPackage.VInterfaceFoxtrot().isEmpty()) {
          stringBuilder.append(" (").append(ExceptionInVPackage.VInterfaceFoxtrot()).append(")\n");
          continue;
        } 
        stringBuilder.append("\n");
      } 
      for (AlInterfaceBravo b1 : this.XMLInputFactory) {
        b1.ExceptionInVPackage(false);
        stringBuilder.append("\n").append(b1.AmComponentHotel()).append(" - ").append(b1.VInterfaceFoxtrot()).append(" channels ").append(" at ").append(X.c(b1.ExceptionInVPackage(), 3)).append(" rec/s ").append(" rec/s, Channels:\n");
        for (ExceptionInVPackage ExceptionInVPackage : b1.XMLInputFactory()) {
          stringBuilder.append("\t").append(ExceptionInVPackage.XMLInputFactory());
          if (ExceptionInVPackage.VInterfaceFoxtrot() != null && !ExceptionInVPackage.VInterfaceFoxtrot().isEmpty()) {
            stringBuilder.append(" (").append(ExceptionInVPackage.VInterfaceFoxtrot()).append(")\n");
            continue;
          } 
          stringBuilder.append("\n");
        } 
      } 
      this.o = stringBuilder.toString();
      return true;
    } catch (IOException iOException) {
      Logger.getLogger(V.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new ExceptionInVPackage("Unable to open file!\nError: " + iOException.getLocalizedMessage());
    } 
  }
  
  private AlInterfaceBravo l() {
    boolean bool = true;
    if (bool) {
      AlInterfaceBravo b1 = null;
      for (AlInterfaceBravo b2 : this.XMLInputFactory) {
        if (b2.c() && b2.AlInterfaceBravo() * this.l < 1200000000L && (b1 == null || b2.VInterfaceFoxtrot() > 2) && (b1 == null || b2.AlInterfaceBravo() > b1.AlInterfaceBravo()))
          b1 = b2; 
      } 
      if (b1 == null) {
        D.AlInterfaceBravo("Very large MDF4 dataset, looking for lower record core data group");
        for (AlInterfaceBravo b2 : this.XMLInputFactory) {
          if (b1 == null) {
            b1 = b2;
            continue;
          } 
          if (b2.AlInterfaceBravo() > 10000L && b2.AlInterfaceBravo() < b1.AlInterfaceBravo())
            b1 = b2; 
        } 
      } 
      return b1;
    } 
    return null;
  }
  
  public void ExceptionInVPackage() {
    try {
      this.j.close();
    } catch (Exception exception) {}
  }
  
  public Iterator AlInterfaceBravo() {
    this.k = 0;
    for (ExceptionInVPackage ExceptionInVPackage : this.PathTostring.XMLInputFactory()) {
      T t = ExceptionInVPackage(ExceptionInVPackage);
      this.AlInterfaceBravo.add(t);
    } 
    for (AlInterfaceBravo b1 : this.XMLInputFactory) {
      for (ExceptionInVPackage ExceptionInVPackage : b1.XMLInputFactory()) {
        T t = ExceptionInVPackage(ExceptionInVPackage);
        this.AlInterfaceBravo.add(t);
      } 
    } 
    this.k = this.AlInterfaceBravo.size();
    this.m = new float[this.k];
    return this.AlInterfaceBravo.iterator();
  }
  
  private T ExceptionInVPackage(ExceptionInVPackage parama) {
    AbstractInAlPackage AbstractInAlPackage = new AbstractInAlPackage();
    if (parama.XMLInputFactory().equals("time")) {
      AbstractInAlPackage.ExceptionInVPackage("Time");
      AbstractInAlPackage.ExceptionInVPackage(3);
    } else {
      AbstractInAlPackage.ExceptionInVPackage(parama.XMLInputFactory());
      AbstractInAlPackage.ExceptionInVPackage(parama.g());
    } 
    if (parama.VInterfaceFoxtrot() != null)
      AbstractInAlPackage.AlInterfaceBravo(parama.VInterfaceFoxtrot()); 
    List list = parama.AlInterfaceBravo();
    if (list != null && !list.isEmpty()) {
      l l = new l(list);
      AbstractInAlPackage.ExceptionInVPackage((k)l);
      AbstractInAlPackage.AlInterfaceBravo(255);
    } 
    if (parama.c() != 0.0D)
      AbstractInAlPackage.c((float)parama.c()); 
    if (parama.AbstractInAlPackage() != 0.0D)
      AbstractInAlPackage.AbstractInAlPackage((float)parama.AbstractInAlPackage()); 
    return AbstractInAlPackage;
  }
  
  public float[] c() {
    if (this.VInterfaceFoxtrot >= this.PathTostring.AlInterfaceBravo())
      throw new VInterfaceFoxtrot(); 
    if (this.VInterfaceFoxtrot >= 500 && k())
      throw new ExceptionInVPackage("This Edition is limited to loading 500 rows of data. \nPlease Register to load large log files."); 
    double AbstractInAlPackage = this.PathTostring.AbstractInAlPackage();
    byte b1 = 0;
    int j = 0;
    try {
      this.PathTostring.ExceptionInVPackage(AbstractInAlPackage, j, this.m);
      j += this.PathTostring.VInterfaceFoxtrot();
      b1++;
      for (AlInterfaceBravo b2 : this.XMLInputFactory) {
        try {
          b2.ExceptionInVPackage(AbstractInAlPackage, j, this.m);
        } catch (Exception exception) {
          D.AlInterfaceBravo("Error updating " + b2.AmComponentHotel() + " on record " + (this.VInterfaceFoxtrot + 1) + ". Error Message: " + exception.getLocalizedMessage());
          int k = ((Integer)this.s.getOrDefault(Integer.valueOf(b1), Integer.valueOf(0))).intValue();
          this.s.put(Integer.valueOf(b1), Integer.valueOf(++k));
          if (k > 4) {
            b2.AlInterfaceBravo(true);
            D.AlInterfaceBravo("5 Errors updating " + b2.AmComponentHotel() + ", disabling updates.");
          } 
          exception.printStackTrace();
        } 
        j += b2.VInterfaceFoxtrot();
        b1++;
      } 
    } catch (IOException iOException) {
      Logger.getLogger(V.class.getName()).log(Level.SEVERE, "Error updating data group values, record: " + this.VInterfaceFoxtrot + " Group " + b1, iOException);
      throw new VInterfaceFoxtrot();
    } 
    this.VInterfaceFoxtrot++;
    return this.m;
  }
  
  public long AbstractInAlPackage() {
    return (this.PathTostring != null) ? this.PathTostring.g().XMLInputFactory() : 200L;
  }
  
  public boolean XMLInputFactory() {
    return (this.PathTostring != null) ? ((this.VInterfaceFoxtrot < this.PathTostring.g().XMLInputFactory())) : false;
  }
  
  public boolean VInterfaceFoxtrot() {
    return false;
  }
  
  public HashMap g() {
    return new HashMap<>();
  }
  
  public String AmComponentHotel() {
    return this.o;
  }
  
  private static String ExceptionInVPackage(SeekableByteChannel paramSeekableByteChannel) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(64);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(0L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    byte[] arrayOfByte = new byte[8];
    byteBuffer.get(arrayOfByte);
    String str = new String(arrayOfByte, "ISO-8859-1");
    if (!str.equals("MDF     "))
      throw new IOException("Invalid or corrupt MDF file: " + str); 
    arrayOfByte = new byte[8];
    byteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, "ISO-8859-1");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */