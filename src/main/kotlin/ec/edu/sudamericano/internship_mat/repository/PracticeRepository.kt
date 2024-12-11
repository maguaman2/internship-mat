package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.Practice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PracticeRepository: JpaRepository<Practice, Long>{

}