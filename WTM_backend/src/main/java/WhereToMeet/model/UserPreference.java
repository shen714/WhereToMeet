package WhereToMeet.model;

public class UserPreference {
  private String userName;
  private String preference;

  public UserPreference(String userName, String preference) {
    this.userName = userName;
    this.preference = preference;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPreference() {
    return preference;
  }

  public void setPreference(String preference) {
    this.preference = preference;
  }
}
