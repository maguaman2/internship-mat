package ec.edu.sudamericano.internship_mat.dto

data class EvalDto(
    val id: Long,
    val description: String,
    val grade: Double,
    val studentId: Long,
    val companyTutorId: Long,
    val tutorAcademicId: Long
)