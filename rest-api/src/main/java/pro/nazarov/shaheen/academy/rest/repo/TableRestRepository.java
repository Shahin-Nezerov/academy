package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Tables;

@RepositoryRestResource(path = "table",collectionResourceRel = "tables")
public interface TableRestRepository extends PagingAndSortingRepository <Tables, Long>{
}