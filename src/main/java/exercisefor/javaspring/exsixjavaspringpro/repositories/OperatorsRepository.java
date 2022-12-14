package exercisefor.javaspring.exsixjavaspringpro.repositories;

import exercisefor.javaspring.exsixjavaspringpro.models.Operators;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface    OperatorsRepository extends JpaRepository<Operators, Long> {
}
