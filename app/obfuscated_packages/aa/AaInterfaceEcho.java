package aa;

import G.Q;
import G.R;
import G.aH;
import G.dj;
import W.N;
import W.O;
import W.P;
import W.r;
import bH.X;
import java.io.BufferedWriter;
import java.util.Iterator;

public class AaInterfaceEcho implements O {
  public String a() {
    return "OutputChannels";
  }
  
  public String b() {
    return "    ;OutputChannels have to basic forms:\n    ; 1) Controller Channels - values contained in the runtime data stream recieved from the controller.\n    ; 2) Expression based Channels - new channels based on any other channels or Constant using \n    ;    mathematical operations and TunerStudio functions.\n    ; Type one are primarily used by Firmware developers, type 2 can easily be user extensions.\n    ;\n    ; Type 1 format for scalar:\n    ; channelName      = scalar, dataType,    offset, \"Units\",   scale, translate\n    ;   channelName can be any alphanumeric string. It must start with a letter and contain no special characters or white spaces.\n    ;   dataType will be U08, S08, U16, S16, U16, S32 or F32. For F32\n    ;   offset - the index of the 1st byte in the read datastream, this can be numeric or key words nextOffset and lastOffset\n    ;   scale and translate will be applied to the raw value using the standard formulas: \n    ;      msValue   = userValue / scale - translate\n    ;      userValue = (msValue + translate) * scale\n    ;   Also of note, scale and translate can be expressions, units can use String function expressions\n    ; Example:\n    ;   seconds          = scalar, U16,    0, \"s\",   1.000, 0.0\n    ;\n    ; Type 1 format for paramClass bit \n    ;   channelName = bits, dataType, offset, bitsOfInterest\n    ; Examples:\n    ;   ready            = bits,   U08,   11, [0:0]\n    ;   crank            = bits,   U08,   11, [1:1]\n    ;   startw           = bits,   U08,   11, [2:2]\n    ;   warmup           = bits,   U08,   11, [3:3]\n    ;   tpsaccaen        = bits,   U08,   11, [4:4]\n    ;   tpsaccden        = bits,   U08,   11, [5:5]\n    ;\n    ; 6 bit fields defined from 1 byte at offset 11. \n    ; the bits of interest are described in the format [n:m] where n is the starting bit and m the last bit.\n    ; in the above examples, n=m so each channel is a single bit.\n    ;\n    ;\n    ; Type 2 format:\n    ; channelName = { someExpression }, \"Units\"\n    ; someExpression can be made up of any set of constants and OutputChannels using any \n    ; of the TunerStudio operators and functions. \n    ; \n    ; For more information on TunerStudio functions, see:\n    ; https://www.tunerstudio.com/index.php/support/manuals/88-math-parser-functions\n    ;------------------------------------------------------------------------------------------\n\n    ;channelName      =  class,   dataType,   offset,     \"Units\",     scale,       translate\n    ;------------        -------  ---------   -------     --------       ------       ---------\n\n";
  }
  
  public void a(R paramR, BufferedWriter paramBufferedWriter, N paramN, r paramr) {
    Iterator<aH> iterator = paramR.q();
    while (iterator.hasNext()) {
      aH aH = iterator.next();
      if (paramr == null || paramr.a((Q)aH))
        a(paramR, aH, paramBufferedWriter); 
    } 
    paramBufferedWriter.write("\n\n");
  }
  
  private void a(R paramR, aH paramaH, BufferedWriter paramBufferedWriter) {
    if (paramaH.b().equals("formula")) {
      paramBufferedWriter.write("     ");
      paramBufferedWriter.write(paramaH.aL());
      for (int i = paramaH.aL().length(); i < P.a; i++)
        paramBufferedWriter.write(32); 
      paramBufferedWriter.write("= {");
      paramBufferedWriter.write(paramaH.k());
      paramBufferedWriter.write("}, \"");
      paramBufferedWriter.write(paramaH.e());
      paramBufferedWriter.write("\"");
      if (!paramaH.s())
        paramBufferedWriter.write(", hidden"); 
    } else if (paramaH.b().equals("scalar")) {
      paramBufferedWriter.write("     ");
      paramBufferedWriter.write(paramaH.aL());
      int i;
      for (i = paramaH.aL().length(); i < P.a; i++)
        paramBufferedWriter.write(32); 
      paramBufferedWriter.write("= scalar,    ");
      paramBufferedWriter.write(paramaH.c());
      paramBufferedWriter.write(", ");
      if (paramaH.x() >= 0L) {
        String str = Long.toHexString(paramaH.x() - paramR.O().af()).toUpperCase();
        if (paramaH.x() - paramR.O().af() > 65535L) {
          str = X.a(str, '0', 8);
        } else {
          str = X.a(str, '0', 4);
        } 
        paramBufferedWriter.write(X.a("0x" + str, ' ', P.b));
      } else {
        paramBufferedWriter.write(X.a(Double.toString(paramaH.a()), ' ', P.b));
      } 
      paramBufferedWriter.write(", ");
      for (i = paramaH.e().length(); i < P.b; i++)
        paramBufferedWriter.write(32); 
      paramBufferedWriter.write("\"");
      paramBufferedWriter.write(paramaH.e());
      paramBufferedWriter.write("\", ");
      dj dj = paramaH.g();
      if (dj instanceof G.B) {
        paramBufferedWriter.write(X.a(Double.toString(paramaH.h()), ' ', P.b));
        paramBufferedWriter.write(", ");
      } else {
        paramBufferedWriter.write("{");
        paramBufferedWriter.write(dj.toString());
        paramBufferedWriter.write(" }, ");
      } 
      dj = paramaH.j();
      if (dj instanceof G.B) {
        paramBufferedWriter.write(X.a(Double.toString(paramaH.i()), ' ', P.b));
        paramBufferedWriter.write(", ");
      } else {
        paramBufferedWriter.write("{");
        paramBufferedWriter.write(dj.toString());
        paramBufferedWriter.write(" }, ");
      } 
      if (!paramaH.s())
        paramBufferedWriter.write(", hidden"); 
    } else if (paramaH.b().equals("bits")) {
      paramBufferedWriter.write("     ");
      paramBufferedWriter.write(paramaH.aL());
      for (int i = paramaH.aL().length(); i < P.a; i++)
        paramBufferedWriter.write(32); 
      paramBufferedWriter.write("=   bits,    ");
      paramBufferedWriter.write(paramaH.c());
      paramBufferedWriter.write(", ");
      if (paramaH.x() >= 0L) {
        String str = Long.toHexString(paramaH.x() - paramR.O().af()).toUpperCase();
        if (paramaH.x() - paramR.O().af() > 65535L) {
          str = X.a(str, '0', 8);
        } else {
          str = X.a(str, '0', 4);
        } 
        paramBufferedWriter.write(X.a("0x" + str, ' ', P.b));
      } else {
        paramBufferedWriter.write(X.a(Integer.toString(paramaH.a()), ' ', P.b));
      } 
      paramBufferedWriter.write(", ");
      paramBufferedWriter.write("    [");
      paramBufferedWriter.write(paramaH.q());
      paramBufferedWriter.write(58);
      paramBufferedWriter.write("]");
    } 
    if (paramaH.aK() != null && !paramaH.aK().trim().isEmpty()) {
      paramBufferedWriter.write("; ");
      paramBufferedWriter.write(paramaH.aK());
    } 
    paramBufferedWriter.write("\n");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aa/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */