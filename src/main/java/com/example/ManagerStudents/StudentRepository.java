package com.example.ManagerStudents;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Marks this interface as a Spring Bean and a repository
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // JpaRepository already provides:
    // - findAll()
    // - findById(ID)
    // - save(entity)
    // - deleteById(ID)
    // - and more
}