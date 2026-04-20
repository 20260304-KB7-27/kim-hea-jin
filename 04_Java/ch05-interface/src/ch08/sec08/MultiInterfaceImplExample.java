package ch08.sec08;

public class MultiInterfaceImplExample {
  public static void main(String[] args) {
    RemoteComtrol rc = new SmartTelevision();
    rc.turnOn();
    rc.turnOff();

    Searchable searchable = new SmartTelevision();
    searchable.search("https://www.youtube.com");
  }
}
