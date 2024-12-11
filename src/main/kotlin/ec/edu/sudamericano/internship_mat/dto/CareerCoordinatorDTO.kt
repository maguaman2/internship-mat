package ec.edu.sudamericano.internship_mat.dto

import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull

data class CareerCoordinatorDTO (
    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
     val id: Long,

    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    val phoneNumber: String,


    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    val coordinatorName: String
 )
