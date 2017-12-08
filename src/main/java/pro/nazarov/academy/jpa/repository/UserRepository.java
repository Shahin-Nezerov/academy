package pro.nazarov.academy.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import pro.nazarov.academy.jpa.entity.User;

public interface UserRepository extends CrudRepository<User,Long> {
    User save(User user);
}
