package flowerstore.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
    @Query("SELECT user FROM AppUser user WHERE user.email = ?1")
    Optional<AppUser> findUserByEmail(String email);
}
