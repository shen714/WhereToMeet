package WhereToMeet.direction;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.Map.Entry;

public class StepParser {
  private final static String DISTANCE = "distance";
  private final static String DURATION = "duration";
  private final static String END_LOCATION = "end_location";
  private final static String START_LOCATION = "start_location";
  private final static String LAT = "lat";
  private final static String LNG = "lng";


  public static Step parseStep(JsonNode rootNode) {
    Step.Builder stepBuilder = Step.builder();

    Iterator<Entry<String, JsonNode>> fieldsIterator = rootNode.fields();
    while (fieldsIterator.hasNext()) {
      Entry<String,JsonNode> field = fieldsIterator.next();
      String key = field.getKey();
      JsonNode value = field.getValue();
      if (key.equals(DISTANCE)) {
        stepBuilder.setDistance(value.toString());
      } else if (key.equals(DURATION)) {
        int duration = Integer.valueOf(value.get("text").toString().replaceAll("[^0-9]", ""));
        stepBuilder.setDuration(duration);
      } else if (key.equals(END_LOCATION)) {
        stepBuilder.setEndLocation(new Location(
                value.get(LAT).asDouble(), value.get(LNG).asDouble()));
      } else if (key.equals(START_LOCATION)) {
        stepBuilder.setStartLocation(new Location(
            value.get(LAT).asDouble(), value.get(LNG).asDouble()));
      }
    }
    return stepBuilder.build();
  }


}
