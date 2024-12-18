package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*

@Entity
@Table(name = "parameter")
class Parameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0

    @Column(name = "category", nullable = false)
    val category: String = ""

    @Column(name = "description", nullable = false)
    val description: String = ""

    @Column(name = "grade", nullable = false)
    val grade: Double = 0.0


}
