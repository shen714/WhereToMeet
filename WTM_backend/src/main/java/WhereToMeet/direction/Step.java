package WhereToMeet.direction;

import com.google.auto.value.AutoValue;
import javafx.util.Builder;

@AutoValue
public abstract class Step {
  public abstract String getDistance();
  public abstract int getDuration();
  public abstract Location getEndLocation();
  public abstract Location getStartLocation();

  static Builder builder() {
    return new AutoValue_Step.Builder();
  }

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setDistance(String distance);
    abstract Builder setDuration(int duration);
    abstract Builder setEndLocation(Location endLocation);
    abstract Builder setStartLocation(Location startLocation);

    abstract Step build();

  }

}
