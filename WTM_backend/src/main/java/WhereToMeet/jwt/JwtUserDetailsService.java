package WhereToMeet.jwt;

import static java.util.Collections.emptyList;

import WhereToMeet.model.ApplicationUser;
import WhereToMeet.model.UserRepository;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
   private UserRepository userRepository;

   public JwtUserDetailsService(UserRepository userRepository) {
     this.userRepository = userRepository;
   }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     ApplicationUser applicationUser = userRepository.findByUserName(username);
     if (applicationUser == null) {
       throw new UsernameNotFoundException(username);
     }
     return new User(applicationUser.getUserName(), applicationUser.getPassword(), emptyList());
  }

}


