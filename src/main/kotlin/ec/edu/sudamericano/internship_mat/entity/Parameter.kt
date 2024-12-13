package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*

@Entity
@Table(name = "parameter")
data class Parameter(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(nullable = false)
    val category: String,

    @Column(nullable = false)
    val description: String,

    // Eliminar la propiedad 'scale' de la columna de tipo Double
    @Column(nullable = false)
    val grade: Double
)
