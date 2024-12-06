package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*


@Entity
@Table(name = "practice")
data class  Practice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(nullable = false)
    var start_date: LocalDateTime,
    @Column(nullable = false)
    var end_date: LocalDateTime,
    @Column(nullable = false)
    var office: String,
    @Column(nullable = false)
    var level: String,
    @Column(nullable = false)
    var academi_Periodic: String,
}