package ec.edu.sudamericano.internship_mat.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size


data class CommunityEngagementDto(
    val id: Long,

    @field:NotBlank(message = "Director cannot be blank")
    @field:Size(max = 255, message = "Director cannot exceed 255 characters")
    val director: String,

    @field:Size(max = 255, message = "Description cannot exceed 255 characters")
    val description: String?,

    @field:NotBlank(message = "Phone cannot be blank")
    @field:Pattern(
        regexp = "^[+]?[0-9]*\\.?[0-9]+$",
        message = "Phone must be a valid numeric value"
    )
    val phone: String,

    @field:NotBlank(message = "Email cannot be blank")
    @field:Email(message = "Email must be a valid email address")
    val email: String,

    @field:NotBlank(message = "Stamp cannot be blank")
    @field:Size(max = 255, message = "Stamp cannot exceed 255 characters")
    val stamp: String
)
