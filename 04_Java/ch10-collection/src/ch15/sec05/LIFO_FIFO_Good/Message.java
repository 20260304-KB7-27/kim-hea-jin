package basic.ch15.sec05.LIFO_FIFO_Good;

public abstract class Message {
  private String to;

  public Message(String to) {
    this.to = to;
  }

  public String getTo() {
    return to;
  }

  // 각 메시지 타입이 구현할 추상 메서드
  public abstract void execute();
}

// 구체적인 구현 클래스들
class MailMessage extends Message {
  public MailMessage(String to) {
    super(to);
  }

  @Override
  public void execute() {
    System.out.println(getTo() + "님에게 메일을 보냅니다.");
  }
}

class SMSMessage extends Message {
  public SMSMessage(String to) {
    super(to);
  }

  @Override
  public void execute() {
    System.out.println(getTo() + "님에게 SMS를 보냅니다.");
  }
}

class KakaotalkMessage extends Message {
  public KakaotalkMessage(String to) {
    super(to);
  }

  @Override
  public void execute() {
    System.out.println(getTo() + "님에게 카카오톡을 보냅니다.");
  }
}
