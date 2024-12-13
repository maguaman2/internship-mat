package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.Eval
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface EvalRepository : JpaRepository<Eval, Long> {

    @Query("SELECT e FROM Eval e WHERE e.studentId > :grade ORDER BY e.grade DESC")
    fun findEvalsWithGradeGreaterThan(@Param("grade") grade: Double): List<Eval>
}