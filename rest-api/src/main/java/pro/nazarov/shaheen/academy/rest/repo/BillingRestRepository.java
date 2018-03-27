package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Billing;

@RepositoryRestResource(path = "billing",collectionResourceRel = "billing")
public interface BillingRestRepository extends PagingAndSortingRepository <Billing, Long>{

}