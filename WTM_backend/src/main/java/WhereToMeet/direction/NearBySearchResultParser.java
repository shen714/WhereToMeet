package WhereToMeet.direction;

import WhereToMeet.controller.MapController;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class NearBySearchResultParser {
    private final static String RESULTS = "results";
    private final static String STATUS = "status";
    private final static String ZERO_RESULTS = "\"ZERO_RESULTS\"";
    private final static Logger log = LoggerFactory.getLogger(MapController.class);

    // TODO: parse the result into more meaningful format.
    public static Optional<String> parseNearBySearchResponse(String response) {
        JsonFactory factory = new JsonFactory();
        ObjectMapper mapper = new ObjectMapper(factory);
        Optional<String> result = Optional.empty();
        try {
            JsonNode rootNode = mapper.readTree(response);
            if (rootNode != null) {
                Iterator<Map.Entry<String, JsonNode>> fieldsIterator = rootNode.fields();
                while (fieldsIterator.hasNext()) {
                    Map.Entry<String,JsonNode> field = fieldsIterator.next();
                    String key = field.getKey();
                    JsonNode value = field.getValue();
                    if (key.equals(RESULTS)) {
                        if (value != null) {
                            result = Optional.of(value.toString());
                        }
                    } else if (key.equals(STATUS) && value.toString().equals(ZERO_RESULTS)) {
                        result = Optional.empty();
                        break;
                    }
                }
            }
        } catch (JsonMappingException e) {
            log.warn(e.toString());
            throw new IllegalStateException(e.getMessage());
        } catch(JsonProcessingException e) {
            log.warn(e.toString());
            throw new IllegalStateException(e.getMessage());
        }
        return result;
    }
}
