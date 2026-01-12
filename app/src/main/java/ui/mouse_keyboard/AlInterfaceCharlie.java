package al;

public interface AlInterfaceCharlie {
  default boolean a(byte paramByte) {
    return (paramByte == 1 || paramByte == 3 || paramByte == 5 || paramByte == 9 || paramByte == 3);
  }

  default boolean b(byte paramByte) {
    return (paramByte == 1
        || paramByte == 0
        || paramByte == 2
        || paramByte == 3
        || paramByte == 4
        || paramByte == 5);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/al/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
