package i;

import h.h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class g {
  public static int a = 250;
  
  File b = new File(h.a(), "MLV.pipe");
  
  private static g d = null;
  
  private final int e = 86400000;
  
  private final List f = new ArrayList();
  
  h c = null;
  
  private boolean g = false;
  
  public static g a() {
    if (d == null)
      d = new g(); 
    return d;
  }
  
  public void b() {
    if (this.b.lastModified() < System.currentTimeMillis() - 86400000L)
      this.b.delete(); 
    d();
    this.c = new h(this);
    this.c.start();
  }
  
  public void c() {
    this.b.delete();
    h.a(this.c);
  }
  
  public void a(f paramf) {
    this.f.add(paramf);
  }
  
  private void a(String paramString1, String paramString2) {
    for (f f : this.f) {
      if (f.a(paramString1, paramString2))
        return; 
    } 
  }
  
  private void d() {
    if (this.b.exists()) {
      this.b.setLastModified(System.currentTimeMillis());
    } else {
      try {
        this.b.createNewFile();
      } catch (IOException iOException) {
        Logger.getLogger(g.class.getName()).log(Level.SEVERE, "Failed to create Pipe", iOException);
      } 
    } 
    this.b.deleteOnExit();
  }
  
  private void e() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new java/io/FileReader
    //   5: dup
    //   6: aload_0
    //   7: getfield b : Ljava/io/File;
    //   10: invokespecial <init> : (Ljava/io/File;)V
    //   13: astore_1
    //   14: bipush #50
    //   16: newarray char
    //   18: astore_2
    //   19: aconst_null
    //   20: astore_3
    //   21: aload_1
    //   22: aload_2
    //   23: invokevirtual read : ([C)I
    //   26: istore #4
    //   28: iload #4
    //   30: ifle -> 54
    //   33: aload_3
    //   34: ifnonnull -> 45
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore_3
    //   45: aload_3
    //   46: aload_2
    //   47: iconst_0
    //   48: iload #4
    //   50: invokevirtual append : ([CII)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: iload #4
    //   56: ifgt -> 21
    //   59: aload_1
    //   60: invokevirtual close : ()V
    //   63: goto -> 68
    //   66: astore #5
    //   68: aload_3
    //   69: ifnull -> 151
    //   72: aload_3
    //   73: invokevirtual length : ()I
    //   76: ifle -> 151
    //   79: aload_0
    //   80: getfield b : Ljava/io/File;
    //   83: invokevirtual delete : ()Z
    //   86: pop
    //   87: aload_0
    //   88: invokespecial d : ()V
    //   91: aload_3
    //   92: invokevirtual toString : ()Ljava/lang/String;
    //   95: astore #5
    //   97: aconst_null
    //   98: astore #7
    //   100: aload #5
    //   102: ldc '='
    //   104: invokevirtual indexOf : (Ljava/lang/String;)I
    //   107: istore #8
    //   109: iload #8
    //   111: iconst_m1
    //   112: if_icmpeq -> 139
    //   115: aload #5
    //   117: iconst_0
    //   118: iload #8
    //   120: invokevirtual substring : (II)Ljava/lang/String;
    //   123: astore #6
    //   125: aload #5
    //   127: iload #8
    //   129: iconst_1
    //   130: iadd
    //   131: invokevirtual substring : (I)Ljava/lang/String;
    //   134: astore #7
    //   136: goto -> 143
    //   139: aload #5
    //   141: astore #6
    //   143: aload_0
    //   144: aload #6
    //   146: aload #7
    //   148: invokespecial a : (Ljava/lang/String;Ljava/lang/String;)V
    //   151: aload_1
    //   152: ifnull -> 265
    //   155: aload_1
    //   156: invokevirtual close : ()V
    //   159: goto -> 265
    //   162: astore_2
    //   163: ldc 'error closing Pipe reader'
    //   165: invokestatic c : (Ljava/lang/String;)V
    //   168: goto -> 265
    //   171: astore_2
    //   172: aload_0
    //   173: invokespecial d : ()V
    //   176: aload_1
    //   177: ifnull -> 265
    //   180: aload_1
    //   181: invokevirtual close : ()V
    //   184: goto -> 265
    //   187: astore_2
    //   188: ldc 'error closing Pipe reader'
    //   190: invokestatic c : (Ljava/lang/String;)V
    //   193: goto -> 265
    //   196: astore_2
    //   197: ldc i/g
    //   199: invokevirtual getName : ()Ljava/lang/String;
    //   202: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   205: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   208: ldc 'Could not read from pipe file.'
    //   210: aload_2
    //   211: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   214: aload_0
    //   215: getfield b : Ljava/io/File;
    //   218: invokevirtual delete : ()Z
    //   221: pop
    //   222: aload_1
    //   223: ifnull -> 265
    //   226: aload_1
    //   227: invokevirtual close : ()V
    //   230: goto -> 265
    //   233: astore_2
    //   234: ldc 'error closing Pipe reader'
    //   236: invokestatic c : (Ljava/lang/String;)V
    //   239: goto -> 265
    //   242: astore #9
    //   244: aload_1
    //   245: ifnull -> 262
    //   248: aload_1
    //   249: invokevirtual close : ()V
    //   252: goto -> 262
    //   255: astore #10
    //   257: ldc 'error closing Pipe reader'
    //   259: invokestatic c : (Ljava/lang/String;)V
    //   262: aload #9
    //   264: athrow
    //   265: return
    // Exception table:
    //   from	to	target	type
    //   2	151	171	java/io/FileNotFoundException
    //   2	151	196	java/io/IOException
    //   2	151	242	finally
    //   59	63	66	java/io/IOException
    //   155	159	162	java/lang/Exception
    //   171	176	242	finally
    //   180	184	187	java/lang/Exception
    //   196	222	242	finally
    //   226	230	233	java/lang/Exception
    //   242	244	242	finally
    //   248	252	255	java/lang/Exception
  }
  
  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/i/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */