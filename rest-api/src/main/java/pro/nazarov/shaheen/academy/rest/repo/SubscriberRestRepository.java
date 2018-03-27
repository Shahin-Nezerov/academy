package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Subscriber;

@RepositoryRestResource(path = "subscriber",collectionResourceRel = "subscriber")
public interface SubscriberRestRepository extends PagingAndSortingRepository <Subscriber, Integer>{

}