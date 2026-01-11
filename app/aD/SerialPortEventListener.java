package aD;

import bH.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class SerialPortEventListener extends InputStream implements SerialPortEventListener {
  SerialPort a = null;
  
  int b = 0;
  
  byte[] c = new byte[1];
  
  byte[] d = null;
  
  int e = 200;
  
  List f = new ArrayList();
  
  public SerialPortEventListener(SerialPort paramSerialPort) {
    this.a = paramSerialPort;
    paramSerialPort.addEventListener(this);
  }
  
  public void a(SerialPortEventListener paramSerialPortEventListener) {
    if (!this.f.contains(this))
      this.f.add(paramSerialPortEventListener); 
  }
  
  public synchronized int read() {
    a();
    try {
      if (this.a.getInputBufferBytesCount() <= 0)
        try {
          wait(300L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        }  
      if (this.a.getInputBufferBytesCount() <= 0) {
        this.b = 0;
        return -1;
      } 
      int i = c.a(this.a.readBytes(1)[0]);
      this.b--;
      return i;
    } catch (SerialPortException serialPortException) {
      throw new IOException(serialPortException.getMessage() + ", Port:" + this.a.getPortName());
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new IOException(this.a.getPortName() + ": No bytes available.");
    } 
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljssc/SerialPort;
    //   4: invokevirtual isOpened : ()Z
    //   7: ifne -> 48
    //   10: new java/io/IOException
    //   13: dup
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: ldc 'serialPort '
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_0
    //   27: getfield a : Ljssc/SerialPort;
    //   30: invokevirtual getPortName : ()Ljava/lang/String;
    //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: ldc ' not open'
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual toString : ()Ljava/lang/String;
    //   44: invokespecial <init> : (Ljava/lang/String;)V
    //   47: athrow
    //   48: iconst_0
    //   49: istore #4
    //   51: aload_0
    //   52: getfield d : [B
    //   55: ifnull -> 153
    //   58: aload_0
    //   59: getfield d : [B
    //   62: arraylength
    //   63: iload_3
    //   64: if_icmpgt -> 100
    //   67: aload_0
    //   68: getfield d : [B
    //   71: iconst_0
    //   72: aload_1
    //   73: iload_2
    //   74: aload_0
    //   75: getfield d : [B
    //   78: arraylength
    //   79: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   82: iload #4
    //   84: aload_0
    //   85: getfield d : [B
    //   88: arraylength
    //   89: iadd
    //   90: istore #4
    //   92: aload_0
    //   93: aconst_null
    //   94: putfield d : [B
    //   97: goto -> 153
    //   100: aload_0
    //   101: getfield d : [B
    //   104: iconst_0
    //   105: aload_1
    //   106: iload_2
    //   107: iload_3
    //   108: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   111: iload #4
    //   113: iload_3
    //   114: iadd
    //   115: istore #4
    //   117: aload_0
    //   118: getfield d : [B
    //   121: arraylength
    //   122: aload_1
    //   123: arraylength
    //   124: isub
    //   125: newarray byte
    //   127: astore #5
    //   129: aload_0
    //   130: getfield d : [B
    //   133: iload #4
    //   135: aload #5
    //   137: iconst_0
    //   138: aload #5
    //   140: arraylength
    //   141: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   144: aload_0
    //   145: aload #5
    //   147: putfield d : [B
    //   150: iload #4
    //   152: ireturn
    //   153: aload_0
    //   154: getfield a : Ljssc/SerialPort;
    //   157: invokevirtual getInputBufferBytesCount : ()I
    //   160: aload_0
    //   161: getfield e : I
    //   164: if_icmple -> 216
    //   167: aload_0
    //   168: getfield a : Ljssc/SerialPort;
    //   171: invokevirtual getInputBufferBytesCount : ()I
    //   174: iload_3
    //   175: if_icmpgt -> 216
    //   178: aload_0
    //   179: getfield a : Ljssc/SerialPort;
    //   182: aload_0
    //   183: getfield e : I
    //   186: invokevirtual readBytes : (I)[B
    //   189: astore #5
    //   191: aload #5
    //   193: iconst_0
    //   194: aload_1
    //   195: iload #4
    //   197: iload_2
    //   198: iadd
    //   199: aload #5
    //   201: arraylength
    //   202: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   205: iload #4
    //   207: aload #5
    //   209: arraylength
    //   210: iadd
    //   211: istore #4
    //   213: goto -> 153
    //   216: iload_3
    //   217: iload #4
    //   219: isub
    //   220: istore_3
    //   221: iload #4
    //   223: iload_2
    //   224: iadd
    //   225: aload_1
    //   226: arraylength
    //   227: if_icmpge -> 392
    //   230: aload_0
    //   231: getfield a : Ljssc/SerialPort;
    //   234: invokevirtual getInputBufferBytesCount : ()I
    //   237: iload_3
    //   238: if_icmplt -> 254
    //   241: aload_0
    //   242: getfield a : Ljssc/SerialPort;
    //   245: iload_3
    //   246: invokevirtual readBytes : (I)[B
    //   249: astore #5
    //   251: goto -> 263
    //   254: aload_0
    //   255: getfield a : Ljssc/SerialPort;
    //   258: invokevirtual readBytes : ()[B
    //   261: astore #5
    //   263: aload #5
    //   265: ifnull -> 382
    //   268: aload #5
    //   270: arraylength
    //   271: ifle -> 382
    //   274: aload #5
    //   276: arraylength
    //   277: aload_1
    //   278: arraylength
    //   279: iload #4
    //   281: iload_2
    //   282: iadd
    //   283: isub
    //   284: if_icmple -> 357
    //   287: aload_0
    //   288: aload #5
    //   290: arraylength
    //   291: aload_1
    //   292: arraylength
    //   293: iload #4
    //   295: iload_2
    //   296: iadd
    //   297: isub
    //   298: isub
    //   299: newarray byte
    //   301: putfield d : [B
    //   304: aload #5
    //   306: aload #5
    //   308: arraylength
    //   309: aload_0
    //   310: getfield d : [B
    //   313: arraylength
    //   314: isub
    //   315: aload_0
    //   316: getfield d : [B
    //   319: iconst_0
    //   320: aload_0
    //   321: getfield d : [B
    //   324: arraylength
    //   325: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   328: aload #5
    //   330: arraylength
    //   331: aload_0
    //   332: getfield d : [B
    //   335: arraylength
    //   336: isub
    //   337: newarray byte
    //   339: astore #6
    //   341: aload #5
    //   343: iconst_0
    //   344: aload #6
    //   346: iconst_0
    //   347: aload #6
    //   349: arraylength
    //   350: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   353: aload #6
    //   355: astore #5
    //   357: aload #5
    //   359: iconst_0
    //   360: aload_1
    //   361: iload #4
    //   363: iload_2
    //   364: iadd
    //   365: aload #5
    //   367: arraylength
    //   368: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   371: iload #4
    //   373: aload #5
    //   375: arraylength
    //   376: iadd
    //   377: istore #4
    //   379: goto -> 392
    //   382: iload #4
    //   384: ifle -> 390
    //   387: iload #4
    //   389: ireturn
    //   390: iconst_0
    //   391: ireturn
    //   392: iload #4
    //   394: ireturn
    //   395: astore #5
    //   397: new java/io/IOException
    //   400: dup
    //   401: new java/lang/StringBuilder
    //   404: dup
    //   405: invokespecial <init> : ()V
    //   408: aload #5
    //   410: invokevirtual getMessage : ()Ljava/lang/String;
    //   413: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: ldc ', Port:'
    //   418: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: aload_0
    //   422: getfield a : Ljssc/SerialPort;
    //   425: invokevirtual getPortName : ()Ljava/lang/String;
    //   428: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   431: invokevirtual toString : ()Ljava/lang/String;
    //   434: invokespecial <init> : (Ljava/lang/String;)V
    //   437: athrow
    //   438: astore #5
    //   440: aload #5
    //   442: invokevirtual printStackTrace : ()V
    //   445: new java/io/IOException
    //   448: dup
    //   449: new java/lang/StringBuilder
    //   452: dup
    //   453: invokespecial <init> : ()V
    //   456: aload_0
    //   457: getfield a : Ljssc/SerialPort;
    //   460: invokevirtual getPortName : ()Ljava/lang/String;
    //   463: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: ldc ': No bytes available.'
    //   468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: invokevirtual toString : ()Ljava/lang/String;
    //   474: invokespecial <init> : (Ljava/lang/String;)V
    //   477: athrow
    // Exception table:
    //   from	to	target	type
    //   153	389	395	jssc/SerialPortException
    //   153	389	438	java/lang/IndexOutOfBoundsException
    //   390	391	395	jssc/SerialPortException
    //   390	391	438	java/lang/IndexOutOfBoundsException
    //   392	394	395	jssc/SerialPortException
    //   392	394	438	java/lang/IndexOutOfBoundsException
  }
  
  private void a() {
    if (this.a == null)
      throw new IOException("serialPort not set!"); 
    if (!this.a.isOpened())
      throw new IOException("serialPort " + this.a.getPortName() + " not open"); 
  }
  
  public synchronized void serialEvent(SerialPortEvent paramSerialPortEvent) {
    if (paramSerialPortEvent.isRXCHAR()) {
      this.b += paramSerialPortEvent.getEventValue();
      notify();
    } 
    for (SerialPortEventListener serialPortEventListener : this.f)
      serialPortEventListener.serialEvent(paramSerialPortEvent); 
  }
  
  public int available() {
    try {
      return this.a.getInputBufferBytesCount();
    } catch (SerialPortException serialPortException) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)serialPortException);
      return 0;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aD/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */