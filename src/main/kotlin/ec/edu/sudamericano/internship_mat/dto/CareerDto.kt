package ec.edu.sudamericano.internship_mat.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CareerDto {
    @field:NotBlank(message = "Career is obligatory")
    var careerName: String? = null

    @field:NotNull(message = "Coordinator Id is obligatory")
    var coordinatorId: Long? = null
}