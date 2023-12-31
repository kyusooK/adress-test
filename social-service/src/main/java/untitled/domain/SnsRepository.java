package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "sns", path = "sns")
public interface SnsRepository extends PagingAndSortingRepository<Sns, Long> {}
