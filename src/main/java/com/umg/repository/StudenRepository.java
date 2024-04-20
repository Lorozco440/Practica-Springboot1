package com.umg.repository;
import com.umg.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  StudenRepository extends JpaRepository<Student, Long> {

}
