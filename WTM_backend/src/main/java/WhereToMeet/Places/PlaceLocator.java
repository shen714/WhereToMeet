package WhereToMeet.Places;

import WhereToMeet.direction.DirectionResult;
import WhereToMeet.direction.Location;
import WhereToMeet.shard.Credentials;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class PlaceLocator {
  private final static String URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";


  public static String locateThePlace(Location location, String radius, String types) {
    RestTemplate restTemplate = new RestTemplate();
    String requestUrl = URL
        + "location={location}"
        + "&radius={radius}"
        + "&types={types}"
        + "&key={key}";
    Map<String, String> uriParameters = new HashMap<>();
    uriParameters.put("location", location.getLat() + "," + location.getLng());
    uriParameters.put("radius", radius);
    uriParameters.put("types", types);
    //uriParameters.put("name", name);
    uriParameters.put("key", Credentials.KEY);
    String placeResult = restTemplate.getForObject(requestUrl, String.class, uriParameters);
    return placeResult;
  }

}
