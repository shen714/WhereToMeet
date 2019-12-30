package WhereToMeet.direction;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;

public class Legs {
  private JsonNode distance;
  private int duration;
  private List<Step> steps = new ArrayList<>();

  public List<Step> getSteps() {
    return steps;
  }

  public void setSteps(List<Step> steps) {
    this.steps = steps;
  }

  public JsonNode getDistance() {
    return distance;
  }

  public int getDuration() {
    return duration;
  }

  public void setDistance(JsonNode distance) {
    this.distance = distance;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }
}
