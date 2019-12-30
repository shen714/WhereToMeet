package WhereToMeet.direction;

import java.io.Serializable;

public class Routes implements Serializable {
  private String bounds;
  private Legs legs;

  public String getBounds() {
    return bounds;
  }

  public Legs getLegs() {
    return legs;
  }

  public void setBounds(String bounds) {
    this.bounds = bounds;
  }

  public void setLegs(Legs legs) {
    this.legs = legs;
  }

}
