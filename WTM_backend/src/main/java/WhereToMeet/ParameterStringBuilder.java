package WhereToMeet;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ParameterStringBuilder {
  public static String getParamsString(Map<String, String> params) {
    String result = params.entrySet().stream().map(
        (entry) -> {
          try {
            return URLEncoder.encode(entry.getKey(), "UTF-8") + "=" +
                URLEncoder.encode(entry.getValue(), "UTF-8") + "&";
          } catch(UnsupportedEncodingException exception) {
            return "";
          }
        }
    ).collect(Collectors.joining());

    return result.length() > 0
        ? result.substring(0, result.length() - 1)
        : result;
  }

}
