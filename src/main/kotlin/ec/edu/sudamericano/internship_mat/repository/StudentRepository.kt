package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface StudentRepository : JpaRepository<Student, Long> {

    fun findByNui(nui: String): Student?

    @Query(nativeQuery = true)
    fun findStudentsByCareerId(@Param("careerId") careerId: Int): List<Student>
}
