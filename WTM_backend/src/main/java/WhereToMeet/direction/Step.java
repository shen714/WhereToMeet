package WhereToMeet.direction;

public class Step {
  private String distance;
  private int duration;
  private Location endLocation;
  private Location startLocation;

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public Location getEndLocation() {
    return endLocation;
  }

  public void setEndLocation(Location endLocation) {
    this.endLocation = endLocation;
  }

  public Location getStartLocation() {
    return startLocation;
  }

  public void setStartLocation(Location startLocation) {
    this.startLocation = startLocation;
  }

}
