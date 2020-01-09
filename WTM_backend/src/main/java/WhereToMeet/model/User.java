package WhereToMeet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private int id;
  @Column(name="user_name")
  private String userName;
  @Column(name="password")
  private String password;
  @Column(name="preferred_place")
  private String preferredPlaces;

  public User() {}

  public User(String userName, String password, String preferredPlaces) {
    this.userName = userName;
    this.password = password;
    this.preferredPlaces = preferredPlaces;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPreferredPlaces() {
    return preferredPlaces;
  }

  public void setPreferredPlaces(String preferredPlaces) {
    this.preferredPlaces = preferredPlaces;
  }

  @Override
  public String toString() {
    return String.format(
        "User[id=%d, userName='%s', preference='%s']",
        id, userName, preferredPlaces);
  }


}
