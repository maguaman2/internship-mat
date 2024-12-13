package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*

@Entity
@Table(name = "student")
data class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "full_name", length = 100, nullable = false)
    val fullName: String,

    @Column(name = "nui", length = 15, nullable = false, unique = true)
    val nui: String,

    @Column(name = "photo_url")
    val photoUrl: String? = null,

    @Column(name = "career_id")
    val careerId: Int? = null
)
