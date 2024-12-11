package ec.edu.sudamericano.internship_mat.dto

import org.w3c.dom.Text
import java.io.Serial
import java.util.Date

data class ActivityDTO(
    val id: Long,
    val description: String,
    val entranceHour: Date,
    val departureDate: Date,
    val totalHours: Double,
    val resources: String,
    val observations: String,
    val practiceId: Long
)
