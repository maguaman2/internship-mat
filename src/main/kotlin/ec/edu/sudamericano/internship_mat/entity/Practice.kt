package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*


@Entity
@Table(name = "practice")
class  Practice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(nullable = false)
    var startDate: LocalDateTime? = null
    @Column(nullable = false)
    var endDate: LocalDateTime? = null
    @Column(nullable = false)
    var office: String? = null
    @Column(nullable = false)
    var level: String? = null
    @Column(nullable = false)
    var academiPeriodic: String? = null
}