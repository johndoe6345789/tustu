package bl;

import G.R;
import G.S;
import G.T;
import G.SerializableImpl;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import com.efiAnalytics.plugin.ecu.ControllerException;
import com.efiAnalytics.plugin.ecu.OutputChannel;
import com.efiAnalytics.plugin.ecu.OutputChannelClient;
import com.efiAnalytics.plugin.ecu.servers.OutputChannelServer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ManagerSubscribe implements S, OutputChannelServer {
  Map a = new HashMap<>();
  
  public void subscribe(String paramString1, String paramString2, OutputChannelClient paramOutputChannelClient) {
    try {
      List<b> list = a(paramString1);
      b b = new b(this, paramOutputChannelClient);
      ManagerUsingArrayList.a().a(paramString1, paramString2, b);
      list.add(b);
    } catch (V.a a1) {
      throw new ControllerException(a1.getMessage());
    } 
  }
  
  public void unsubscribeConfiguration(String paramString) {
    List list = a(paramString);
    Iterator<GComponentCq> iterator = list.iterator();
    while (iterator.hasNext()) {
      ManagerUsingArrayList.a().a(iterator.next());
      iterator.remove();
    } 
  }
  
  public void unsubscribe(OutputChannelClient paramOutputChannelClient) {
    b b = a(paramOutputChannelClient);
    if (b != null) {
      ManagerUsingArrayList.a().a(b);
      a(b);
    } 
  }
  
  private b a(OutputChannelClient paramOutputChannelClient) {
    for (List list : this.a.values()) {
      for (b b : list) {
        if (b.a().equals(paramOutputChannelClient))
          return b; 
      } 
    } 
    return null;
  }
  
  private void a(b paramb) {
    for (List list : this.a.values()) {
      Iterator<b> iterator = list.iterator();
      while (iterator.hasNext()) {
        b b1 = iterator.next();
        if (b1.equals(paramb))
          iterator.remove(); 
      } 
    } 
  }
  
  public String[] getOutputChannels(String paramString) {
    R r = T.a().c(paramString);
    if (r == null)
      throw new ControllerException("Controller Not Found for configuration: " + paramString); 
    return r.s();
  }
  
  public OutputChannel getOutputChannel(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    if (r == null)
      throw new ControllerException("Controller Not Found for configuration: " + paramString1); 
    SerializableImpl SerializableImpl = r.g(paramString2);
    if (SerializableImpl == null)
      throw new ControllerException("OutputChannel " + paramString2 + " Not Found in configuration: " + paramString1); 
    OutputChannel outputChannel = new OutputChannel();
    outputChannel.setFormula(SerializableImpl.k());
    outputChannel.setMaxValue(SerializableImpl.m());
    outputChannel.setMinValue(SerializableImpl.n());
    outputChannel.setUnits(SerializableImpl.e());
    outputChannel.setName(paramString2);
    return outputChannel;
  }
  
  private List a(String paramString) {
    List list = (List)this.a.get(paramString);
    if (list == null) {
      list = new ArrayList();
      this.a.put(paramString, list);
    } 
    return list;
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    unsubscribeConfiguration(paramR.c());
  }
  
  public void c(R paramR) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */