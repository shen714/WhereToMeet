package WhereToMeet.direction;

import WhereToMeet.shard.Credentials;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class DirectionSearcher {
  private final static String ROOT_PATH = "https://maps.googleapis.com/maps/api/directions/json";
  private final static RestTemplate REST_TEMPLATE = new RestTemplate();

  public static String getDirectionBetweenLocations(String origin, String destination) {
    // build url for requesting direction
    String directionResourceUrl = ROOT_PATH
        + "?origin={origin}"
        + "&destination={destination}"
        + "&key={key}";
    Map<String, String> uriParameters = new HashMap<>();
    uriParameters.put("origin", origin);
    uriParameters.put("destination", destination);
    uriParameters.put("key", Credentials.KEY);

    // return direction response
    return REST_TEMPLATE.getForObject(directionResourceUrl, String.class, uriParameters);
  }
}
