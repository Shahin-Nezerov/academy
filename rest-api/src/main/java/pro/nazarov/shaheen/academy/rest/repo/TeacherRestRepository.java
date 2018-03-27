package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Teacher;

@RepositoryRestResource(path = "teacher",collectionResourceRel = "teacher")
public interface TeacherRestRepository extends PagingAndSortingRepository <Teacher, Long>{

}