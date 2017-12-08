package pro.nazarov.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestBody;
import pro.nazarov.academy.jpa.entity.Lessons;
import pro.nazarov.academy.jpa.entity.UserDetails;

import javax.validation.Valid;

@RepositoryRestResource(path = "lessons",collectionResourceRel = "lessons")
public interface LessonsRestRepository extends PagingAndSortingRepository <Lessons, Long>{

}