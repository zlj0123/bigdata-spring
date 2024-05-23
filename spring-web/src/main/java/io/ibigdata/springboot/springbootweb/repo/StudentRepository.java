package io.ibigdata.springboot.springbootweb.repo;

import io.ibigdata.springboot.springbootweb.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
