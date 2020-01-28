package WhereToMeet.model;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Integer> {
  public ApplicationUser findByUserName(String userName);
  public ApplicationUser findById(int id);
}
