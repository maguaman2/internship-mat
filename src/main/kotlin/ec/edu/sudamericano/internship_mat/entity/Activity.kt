package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name = "activity")
class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    @Column(name = "description", nullable = false)
    val description: String = ""

    @Column(name = "entrance_hour", nullable = false)
    val entranceHour: Date = Date(2024, 1, 1)

    @Column(name = "departure_date", nullable = false)
    val departureDate: Date = Date(2024, 1, 1)

    @Column(name = "total_hours", nullable = false)
    val totalHours: Double = 0.0

    @Column(name = "resources")
    val resources: String = ""

    @Column(name = "observations")
    val observations: String = ""

}
