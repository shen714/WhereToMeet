//package WhereToMeet.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class User {
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(name="UserID")
//  private int id;
//  @Column(name="UserName")
//  private String userName;
//  @Column(name="Password")
//  private String password;
//
//  //private UserPreference userPrefernece;
//
//  public User() {}
//
//  public User(String userName, String password) {
//    this.userName = userName;
//    this.password = password;
//  }
//
//  public User(int id, String userName, String password) {
//    this.id = id;
//    this.userName = userName;
//    this.password = password;
//  }
//
//  public int getId() {
//    return id;
//  }
//
//  public void setId(int id) {
//    this.id = id;
//  }
//
//  public String getUserName() {
//    return userName;
//  }
//
//  public void setUserName(String userName) {
//    this.userName = userName;
//  }
//
//  public String getPassword() {
//    return password;
//  }
//
//  public void setPassword(String password) {
//    this.password = password;
//  }
//
////  public UserPreference getUserPrefernece() {
////    return userPrefernece;
////  }
////
////  public void setUserPrefernece(UserPreference userPrefernece) {
////    this.userPrefernece = userPrefernece;
////  }
//}
