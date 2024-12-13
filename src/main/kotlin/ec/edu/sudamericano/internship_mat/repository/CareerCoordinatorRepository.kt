package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.CareerCoordinator
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CareerCoordinatorRepository : CrudRepository<CareerCoordinator, Long> {


    @Query("SELECT c FROM CareerCoordinator c WHERE c.coordinatorName = :name ORDER BY c.id DESC")
    fun findByNameOrderByIdDesc(name: String): List<CareerCoordinator>
}

