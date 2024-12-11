package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.ActivityDTO
import ec.edu.sudamericano.internship_mat.entity.Activity
import org.springframework.stereotype.Component

class ActivityMapper {
    fun toActivityDTO(activity: Activity): ActivityDTO {
        return ActivityDTO(
            id = activity.id,
            description = activity.description,
            entranceHour = activity.entranceHour,
            departureDate = activity.departureDate,
            totalHours = activity.totalHours,
            resources = activity.resources,
            observations = activity.observations,
           // practiceId = activity.practice.id
        )
    }
}