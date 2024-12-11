package ec.edu.sudamericano.internship_mat.dto

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import jakarta.validation.constraints.NotNull

data class EvalDto(
    val id: Long,

    @field:NotBlank(message = "Description cannot be blank")
    @field:Size(max = 200, message = "Description cannot exceed 200 characters")
    val description: String,

    @field:NotNull(message = "Grade cannot be null")
    @field:Min(value = 0, message = "Grade must be at least 0")
    @field:Max(value = 100, message = "Grade must be at most 100")
    val grade: Double,

    @field:NotNull(message = "Student ID cannot be null")
    val studentId: Long,

    @field:NotNull(message = "Company Tutor ID cannot be null")
    val companyTutorId: Long,

    @field:NotNull(message = "Tutor Academic ID cannot be null")
    val tutorAcademicId: Long
)