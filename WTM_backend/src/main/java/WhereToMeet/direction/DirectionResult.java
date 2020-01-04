package WhereToMeet.direction;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class DirectionResult {
  public abstract Routes getRoutes();
  public abstract String getStatus();

  static Builder builder() {
    return new AutoValue_DirectionResult.Builder();
  }

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setRoutes(Routes routes);
    abstract Builder setStatus(String status);
    abstract DirectionResult build();
  }
}
