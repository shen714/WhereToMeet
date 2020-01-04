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

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class MapController {
  @GetMapping("/locations/origin={origin}&destination={destination}")
  public String getLocationsToMeet(@PathVariable String origin, @PathVariable String destination) {
    String direction = DirectionSearcher.getDirectionBetweenLocations(origin, destination);

    // parse the direction response and get the coordinator of the mid point
    DirectionResult directionResult = DirectionParser.parseTheDirectionResponse(direction);

    Location midPoint = LocationFinder.findMidPoint(directionResult);

    // get location response using the coordinator of the mid point
    return PlaceLocator.locateThePlace(midPoint, "700", "restaurant");
  }
}
