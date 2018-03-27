package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestBody;
import pro.nazarov.shaheen.academy.jpa.entity.UserDetails;

import javax.validation.Valid;

@RepositoryRestResource(path = "userDetails",collectionResourceRel = "userDetails")
public interface UserDetailsRestRepository extends PagingAndSortingRepository <UserDetails, Long>{
    UserDetails findUserDetailsByFullName(@Param("fullname") String fullname);
    UserDetails save(@RequestBody @Valid UserDetails userDetails);
}