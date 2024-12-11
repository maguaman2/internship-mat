package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.Career
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CareerRepository: JpaRepository<Career, Long> {
    fun findByCareerCoordinatorId(careerCoordinatorId: Long): List<Career>
}