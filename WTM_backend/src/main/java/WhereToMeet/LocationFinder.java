package WhereToMeet;

import WhereToMeet.direction.DirectionResult;
import WhereToMeet.direction.Location;
import WhereToMeet.direction.Step;
import java.util.List;

public class LocationFinder {
  public static Location findMidPoint(DirectionResult result) {
    int halfDuration = result.getRoutes().getLegs().getDuration() / 2;
    List<Step> steps = result.getRoutes().getLegs().getSteps();
    int currDuration = 0;
    Location midPoint = new Location();
    for (Step step : steps) {
      currDuration += step.getDuration();
      if (currDuration >= halfDuration) {
        double startLat = step.getStartLocation().getLat();
        double startLng = step.getStartLocation().getLng();
        double endLat = step.getEndLocation().getLat();
        double endLng = step.getEndLocation().getLng();
        midPoint.setLat(startLat + (endLat - startLat) / 2);
        midPoint.setLng(startLng + (endLng - startLng) / 2);
        break;
      }
    }
    return midPoint;

  }

}
