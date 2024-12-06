package ec.edu.sudamericano.internship_mat.dto

import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull

class CompanyDto {
    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    var companyName: String? = null

    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    var ceo: String? = null

    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    var address: String? = null

    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    var province: String? = null

    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    var latitude: Double? = null

    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    var longitude: Double? = null

    @NotNull("must not be null")
    @NotBlank(message = "must not be blank")
    var canton: String? = null
}