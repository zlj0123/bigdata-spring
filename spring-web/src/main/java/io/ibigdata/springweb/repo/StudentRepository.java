package io.ibigdata.springweb.repo;

import io.ibigdata.springweb.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
