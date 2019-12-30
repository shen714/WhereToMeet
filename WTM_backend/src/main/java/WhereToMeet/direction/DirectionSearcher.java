package WhereToMeet.direction;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class DirectionSearcher {
  private final static String KEY = "AIzaSyB40n5w-H4wEJH3E3OM4pBF435b1cPg4AE";
  private final static String ROOT_PATH = "https://maps.googleapis.com/maps/api/directions/json";
  private final static RestTemplate restTemplate = new RestTemplate();

  public static String searchForDirection(String origin, String destination) {
    //build url for requesting direction
    String directionResourceUrl = ROOT_PATH
        + "?origin={origin}"
        + "&destination={destination}"
        + "&key={key}";
    Map<String, String> uriParameters = new HashMap<>();
    uriParameters.put("origin", origin);
    uriParameters.put("destination", destination);
    uriParameters.put("key", KEY);

    //return direction response
    return restTemplate.getForObject(directionResourceUrl, String.class, uriParameters);
  }

}
