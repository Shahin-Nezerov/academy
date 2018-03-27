package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Activity;

@RepositoryRestResource(path = "activity",collectionResourceRel = "activity")
public interface ActivityRestRepository extends PagingAndSortingRepository <Activity, Long>{
}