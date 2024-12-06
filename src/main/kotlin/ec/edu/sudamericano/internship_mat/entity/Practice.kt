package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*



@Entity
@Table(name = "practice")
class Practice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
}