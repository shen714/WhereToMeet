package WhereToMeet.direction;

import WhereToMeet.LocationFinder;
import WhereToMeet.controller.MapController;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Iterator;
import java.util.Map.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DirectionParser {
  private final static String WAYPOINTES = "geocoded_waypoints";
  private final static String ROUTES = "routes";
  private final static String STATUS = "status";
  private final static Logger log = LoggerFactory.getLogger(MapController.class);

  public static DirectionResult parseTheDirectionResponse(String direction) throws JsonProcessingException {
    JsonFactory factory = new JsonFactory();
    ObjectMapper mapper = new ObjectMapper(factory);
    DirectionResult directionResult = new DirectionResult();

    try {
      JsonNode rootNode = mapper.readTree(direction);
      if (rootNode != null) {
        Iterator<Entry<String, JsonNode>> fieldsIterator = rootNode.fields();
        while (fieldsIterator.hasNext()) {
          Entry<String,JsonNode> field = fieldsIterator.next();
          String key = field.getKey();
          JsonNode value = field.getValue();
          if (key.equals(WAYPOINTES)) {
            directionResult.setGeocoded_waypoints(value);
          } else if (key.equals(ROUTES)) {
            directionResult.setRoutes(RoutesParser.parseRoute(value.get(0)));
          } else if (key.equals(STATUS)) {
            directionResult.setStatus(value.toString());
          }
        }
      }
    } catch (JsonMappingException e) {
      log.info(e.toString());
    } catch(JsonProcessingException e) {
      log.info(e.toString());
    }
    return directionResult;
  }
}
