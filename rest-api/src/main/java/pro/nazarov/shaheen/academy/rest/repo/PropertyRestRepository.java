package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Property;

@RepositoryRestResource(path = "property",collectionResourceRel = "property")
public interface PropertyRestRepository extends PagingAndSortingRepository <Property, String>{
}