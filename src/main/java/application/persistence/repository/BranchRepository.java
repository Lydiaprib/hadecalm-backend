package application.persistence.repository;

import application.persistence.model.Branch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends MongoRepository<Branch, String> {

  List<Branch> findByParentId(String parentId);

}
