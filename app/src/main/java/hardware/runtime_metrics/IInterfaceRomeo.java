package I;

import G.ManagerUsingArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

class IInterfaceRomeo extends Thread {
  public void r(q paramq) {
    super("ClockPublisher_" + Math.random());
    setDaemon(true);
  }

  public void run() {
    Calendar calendar = Calendar.getInstance();
    while (true) {
      int i = calendar.get(11);
      int j = calendar.get(12);
      int k = calendar.get(13);
      ManagerUsingArrayList.a().a("hourOfDay", i);
      ManagerUsingArrayList.a().a("minuteOfHour", j);
      ManagerUsingArrayList.a().a("secondOfMinute", k);
      int m = (int) (1000L - System.currentTimeMillis() - calendar.getTimeInMillis());
      try {
        sleep(m);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
      calendar.setTimeInMillis(System.currentTimeMillis());
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
