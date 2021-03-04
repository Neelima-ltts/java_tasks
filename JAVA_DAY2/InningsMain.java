import java.util.*;
public class InningsMain {
  public static void main(String[] args) {
    Innings obj = new Innings();
    obj.setTeamName("rcb");
    obj.setInningsName("ibhk");
    obj.setRuns(99);
    String tname = obj.getTeamName();
    String iname = obj.getInningsName();
    int runs = obj.getRuns();
    obj.displayInningsDetails();
  }
}