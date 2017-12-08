package pro.nazarov.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestBody;
import pro.nazarov.academy.jpa.entity.User;

import javax.validation.Valid;

@RepositoryRestResource(path = "user",collectionResourceRel = "user")
public interface UserRestRepository extends PagingAndSortingRepository <User , Long>{
    User findUserByMail(@Param("mail") String mail);
    User save(@RequestBody @Valid User user);
}