package WhereToMeet.client;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoogleMapRestClient {

  private final RestTemplate restTemplate;

  public GoogleMapRestClient(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

  public String getPostsPlainJSON(String uri, String location, String radius, String types,
  String name, String key) {
    String requestUri = uri
        + "?location={location}"
        + "&radius={radius}"
        + "&types={types}"
        + "&name={name}"
        + "&key={key}";
    Map<String, String> uriParameters = new HashMap<>();
    uriParameters.put("location", location);
    uriParameters.put("radius", radius);
    uriParameters.put("types", types);
    uriParameters.put("name", name);
    uriParameters.put("key", key);
    return this.restTemplate.getForObject(requestUri, String.class, uriParameters);
  }
}
