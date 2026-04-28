package basic.ch15.sec05.LIFO_FIFO_Bad;

public class Message {
  public String command;
  public String to;

  public Message(String command, String to) {
    this.command = command;
    this.to = to;
  }
}
