package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.Feedback;

@RepositoryRestResource(path = "feedback",collectionResourceRel = "feedback")
public interface FeedbackRestRepository extends PagingAndSortingRepository <Feedback, Integer>{

}