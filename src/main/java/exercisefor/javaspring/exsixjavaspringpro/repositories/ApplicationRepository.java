package exercisefor.javaspring.exsixjavaspringpro.repositories;

import exercisefor.javaspring.exsixjavaspringpro.models.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
