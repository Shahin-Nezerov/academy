package pro.nazarov.shaheen.academy.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import pro.nazarov.shaheen.academy.jpa.entity.User;

public interface UserRepository extends CrudRepository<User,Long> {
    User save(User user);
}
