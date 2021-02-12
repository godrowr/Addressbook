package JPADataAccess;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "addressbook", path = "addressbook")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {

    List<AddressBook> findByName(@Param("name") String name);

    AddressBook findByAid(@Param("aid") long aid);
}
