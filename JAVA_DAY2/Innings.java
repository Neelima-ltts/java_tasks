import java.util.*;
public class Innings{
private String tname;
private String iname;
private int runs;
 public String getTeamName() {
    return tname;
  }

  // Setter
  public void setTeamName(String tname) {
    this.tname = tname;
  }
 public String getInningsName() {
    return iname;
  }

  // Setter
  public void setInningsName(String iname) {
    this.iname = iname;
  }
 public int getRuns() {
    return runs;
  }

  // Setter
  public void setRuns(int runs) {
    this.runs = runs;
  }
public void displayInningsDetails(){
System.out.println(tname);
System.out.println(iname);
System.out.println(runs);
}
}
