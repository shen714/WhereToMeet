package WhereToMeet.direction;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

@AutoValue
public abstract class Legs {
  public abstract JsonNode getDistance();
  public abstract int getDuration();
  public abstract ImmutableList<Step> getSteps();

  static Builder builder() {
    return new AutoValue_Legs.Builder();
  }

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setDistance(JsonNode distance);
    abstract Builder setDuration(int duration);
    abstract ImmutableList.Builder<Step> stepsBuilder();
    public Builder addStep(Step step) {
      stepsBuilder().add(step);
      return this;
    }
    abstract Legs build();
  }
}
