package WhereToMeet.model;

import WhereToMeet.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  public User findByUserName(String userName);
  public User findById(int id);
}
