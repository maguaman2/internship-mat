package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.ActivityDTO
import ec.edu.sudamericano.internship_mat.entity.Activity
import org.springframework.stereotype.Component

class ActivityMapper {
    fun toActivityDTO(activityDTO: ActivityDTO): Activity {
        return Activity()

    }
}