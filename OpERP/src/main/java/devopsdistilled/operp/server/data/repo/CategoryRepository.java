package devopsdistilled.operp.server.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import devopsdistilled.operp.server.data.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
