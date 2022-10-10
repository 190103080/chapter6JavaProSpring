package exercisefor.javaspring.exsixjavaspringpro.repositories;

import exercisefor.javaspring.exsixjavaspringpro.models.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CoursesRepository extends JpaRepository<Courses, Long> {
}
