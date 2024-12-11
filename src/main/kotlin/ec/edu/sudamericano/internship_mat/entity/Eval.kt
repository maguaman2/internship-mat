package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*

@Entity
@Table(name = "eval")
data class EvalEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val description: String,
    val grade: Double,
    val studentId: Long,
    val companyTutorId: Long,
    val tutorAcademicId: Long
)