package WhereToMeet.direction;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;

public class DirectionResult implements Serializable {
  private JsonNode geocoded_waypoints;
  private Routes routes;
  private String status;

  public String getStatus() {
    return status;
  }

  public Routes getRoutes() {
    return routes;
  }

  public void setGeocoded_waypoints(JsonNode geocoded_waypoints) {
    this.geocoded_waypoints = geocoded_waypoints;
  }

  public void setRoutes(Routes routes) {
    this.routes = routes;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
