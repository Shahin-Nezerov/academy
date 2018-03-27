package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Student;

@RepositoryRestResource(path = "student",collectionResourceRel = "student")
public interface StudentRestRepository extends PagingAndSortingRepository <Student, Long>{

}