package WhereToMeet.direction;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.Map.Entry;

public class LegsParser {
  private final static String DISTANCE = "distance";
  private final static String DURATION = "duration";
  private final static String STEPS = "steps";

  public static Legs parseLegs(JsonNode rootNode) {
    Iterator<Entry<String, JsonNode>> fieldsIterator = rootNode.fields();

    Legs legs = new Legs();
    while (fieldsIterator.hasNext()) {
      Entry<String,JsonNode> field = fieldsIterator.next();
      String key = field.getKey();
      JsonNode value = field.getValue();
      if (key.equals(DISTANCE)) {
        legs.setDistance(value);
      } else if (key.equals(DURATION)) {
        int duration = Integer.valueOf(value.get("text").toString().replaceAll("[^0-9]", ""));
        legs.setDuration(duration);
      } else if (key.equals(STEPS))  {
          for (JsonNode step : value) {
            legs.getSteps().add(StepParser.parseStep(step));
        }
      }
    }
    return legs;
  }


}
