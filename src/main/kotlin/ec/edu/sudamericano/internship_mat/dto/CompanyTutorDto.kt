package ec.edu.sudamericano.internship_mat.dto

import jakarta.validation.constraints.NotBlank

class CompanyTutorDto {
    @field:NotBlank(message = "Company Tutor ID cannot be blank")
    var companyId: Int? = null
    @field:NotBlank(message = "Company ID cannot be blank")
    var fullName: String? = null
    @field:NotBlank(message = "Full Name cannot be blank")
    var phoneNumber: String? = null
}