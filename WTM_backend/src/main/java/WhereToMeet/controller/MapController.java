package WhereToMeet.controller;

import WhereToMeet.Places.PlaceLocator;
import WhereToMeet.direction.DirectionParser;
import WhereToMeet.direction.DirectionResult;
import WhereToMeet.direction.DirectionSearcher;
import WhereToMeet.direction.Location;
import WhereToMeet.LocationFinder;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class MapController {
  private final static Logger log = LoggerFactory.getLogger(MapController.class);

  @GetMapping("/locations/origin={origin}&destination={destination}")
  public String getLocationsToMeet(@PathVariable String origin, @PathVariable String destination)
      throws JsonProcessingException {
    String direction = DirectionSearcher.searchForDirection(origin, destination);

    //parse the direction response and get the coordinator of the mid point
    DirectionResult directionResult = DirectionParser.parseTheDirectionResponse(direction);

    Location midPoint = LocationFinder.findMidPoint(directionResult);

    //get location response using the coordinator of the mid point
    String locationResult = PlaceLocator.locateThePlace(midPoint, "700", "restaurant");
    return locationResult;

  }

//  @GetMapping("/map")
//  public String test() {
//    return "map.html";
//  }


//  @PostMapping("/map")
//  public String getLocations() {
//    log.info("/map");
//    GoogleMapRestClient googleMapRestClient = new GoogleMapRestClient(new RestTemplateBuilder());
//    return googleMapRestClient.getPostsPlainJSON("https://maps.googleapis.com/maps/api/place/nearbysearch/json",
//        "-33.8670522,151.1957362", "500", "food", "harbour", KEY);
//  }





}
