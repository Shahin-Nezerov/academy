package pro.nazarov.shaheen.academy.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.nazarov.shaheen.academy.jpa.entity.MailTemplate;

@RepositoryRestResource(path = "mailTemplate",collectionResourceRel = "mailTemplate")
public interface MailTemplateRestRepository extends PagingAndSortingRepository <MailTemplate, String>{
}