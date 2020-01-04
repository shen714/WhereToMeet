package WhereToMeet.direction;

public class Routes {
  private final String bounds;
  private final Legs legs;

  private Routes(Builder builder) {
    this.bounds = builder.bounds;
    this.legs = builder.legs;
  }

  public String getBounds() {
    return bounds;
  }

  public Legs getLegs() {
    return legs;
  }

  public static class Builder {
    private String bounds;
    private Legs legs;

    public Builder() {}

    public Builder setBounds(String bounds) {
      this.bounds = bounds;
      return this;
    }

    public Builder setLegs(Legs legs) {
      this.legs = legs;
      return this;
    }

    public Routes build(){
      if (bounds == null || legs == null) {
        throw new NullPointerException();
      }
      Routes routes = new Routes(this);
      return routes;
    }
  }
}
