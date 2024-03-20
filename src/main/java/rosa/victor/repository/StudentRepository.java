package rosa.victor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rosa.victor.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);

    List<Student> findStudentByFirstNameAndAge(String firstName, Integer age);
}
