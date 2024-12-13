package ec.edu.sudamericano.internship_mat.dto

data class StudentDTO(
    val id: Long,  // Asegúrate de que se incluya el id
    val fullName: String,
    val nui: String,
    val photoUrl: String?,
    val careerId: Int?
)
