package WhereToMeet.direction;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.Map.Entry;

public class RoutesParser {
  private static final String BOUNDS = "bounds";
  private static final String LEGS = "legs";

  public static Routes parseRoute(JsonNode rootNode) {
    Iterator<Entry<String, JsonNode>> fieldsIterator = rootNode.fields();

    Routes.Builder routesBuilder = new Routes.Builder();
    while (fieldsIterator.hasNext()) {
      Entry<String,JsonNode> field = fieldsIterator.next();
      String key = field.getKey();
      JsonNode value = field.getValue();
      if (key.equals(BOUNDS)) {
        routesBuilder.setBounds(value.toString());
      } else if (key.equals(LEGS)) {
        routesBuilder.setLegs(LegsParser.parseLegs(value.get(0)));
      }
    }

    return routesBuilder.build();
  }

}
