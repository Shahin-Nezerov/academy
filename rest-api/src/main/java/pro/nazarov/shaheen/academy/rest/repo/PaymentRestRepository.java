package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Payment;

@RepositoryRestResource(path = "payment",collectionResourceRel = "payment")
public interface PaymentRestRepository extends PagingAndSortingRepository <Payment, Long>{

}