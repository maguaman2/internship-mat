package ec.edu.sudamericano.internship_mat.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDateTime
import java.util.*

data class PracticeDto(

    @NotNull(message = "Start date must not be null")
    var start_date: LocalDateTime? = null,

    @NotNull(message = "End date must not be null")
    var end_date: LocalDateTime? = null,

    @NotNull(message = "Office must not be null")
    @NotBlank(message = "Office must not be blank")
    var office: String? = null,

    @NotNull(message = "Level must not be null")
    @NotBlank(message = "Level must not be blank")
    var level: String? = null,

    @NotNull(message = "Academic Period must not be null")
    @NotBlank(message = "Academic Period must not be blank")
    var academi_Periodic: String? = null,


    var id: Long? = null
)
