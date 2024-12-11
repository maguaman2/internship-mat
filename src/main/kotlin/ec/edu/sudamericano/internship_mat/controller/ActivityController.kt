package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.ActivityDTO
import ec.edu.sudamericano.internship_mat.service.ActivityService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/activity")
class ActivityController @Autowired constructor(
    private val activityService: ActivityService
) {

    @GetMapping
    fun getActivities(): List<ActivityDTO> {
        return activityService.getActivities()
    }
}