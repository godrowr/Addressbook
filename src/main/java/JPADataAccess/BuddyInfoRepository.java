package JPADataAccess;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "buddyinfos", path = "buddyinfos")
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByName(@Param("name")String name);

//    List<BuddyInfo> findByPhonenumber(String phonenumber);

    BuddyInfo findById(@Param("id") long id);
}
