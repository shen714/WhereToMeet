package WhereToMeet.direction;

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
  private final static String ROUTES = "routes";
  private final static String STATUS = "status";
  private final static Logger log = LoggerFactory.getLogger(MapController.class);

  public static DirectionResult parseTheDirectionResponse(String direction) {
    JsonFactory factory = new JsonFactory();
    ObjectMapper mapper = new ObjectMapper(factory);
    DirectionResult.Builder directionResultBuilder = DirectionResult.builder();

    try {
      JsonNode rootNode = mapper.readTree(direction);
      if (rootNode != null) {
        Iterator<Entry<String, JsonNode>> fieldsIterator = rootNode.fields();
        while (fieldsIterator.hasNext()) {
          Entry<String,JsonNode> field = fieldsIterator.next();
          String key = field.getKey();
          JsonNode value = field.getValue();
          if (key.equals(ROUTES)) {
            directionResultBuilder.setRoutes(RoutesParser.parseRoute(value.get(0)));
          } else if (key.equals(STATUS)) {
            directionResultBuilder.setStatus(value.toString());
          }
        }
      }
    } catch (JsonMappingException e) {
      log.warn(e.toString());
      throw new IllegalStateException("Server error.");
    } catch(JsonProcessingException e) {
      log.warn(e.toString());
      throw new IllegalStateException("Server error.");
    }
    return directionResultBuilder.build();
  }
}
