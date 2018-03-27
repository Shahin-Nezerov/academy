package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Group;

@RepositoryRestResource(path = "group",collectionResourceRel = "group")
public interface GroupRestRepository extends PagingAndSortingRepository <Group, String>{
}