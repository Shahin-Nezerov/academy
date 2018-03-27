package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Course;

@RepositoryRestResource(path = "course",collectionResourceRel = "course")
public interface CourseRestRepository extends PagingAndSortingRepository <Course, String>{
}