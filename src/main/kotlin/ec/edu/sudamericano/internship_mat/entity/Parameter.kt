package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*

@Entity
@Table(name = "parameter")
data class ParameterEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(nullable = false)
    val category: String,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false, precision = 5, scale = 2)
    val grade: Double
)