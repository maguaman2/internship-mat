package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.Parameter
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ParameterRepository : JpaRepository<Parameter, Int> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}
