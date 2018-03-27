package pro.nazarov.shaheen.academy.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import pro.nazarov.shaheen.academy.jpa.entity.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails,Long> {
    UserDetails save(UserDetails userDetails);
}
