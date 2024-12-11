package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.Eval
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EvalRepository : JpaRepository<Eval, Long>