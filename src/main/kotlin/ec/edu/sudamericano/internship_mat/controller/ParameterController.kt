package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.ParameterDTO
import ec.edu.sudamericano.internship_mat.service.ParameterService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/parameter")
class ParameterController @Autowired constructor(
    private val parameterService: ParameterService
) {

    @GetMapping
    fun getParameters(): List<ParameterDTO> {
        return parameterService.getParameters()
    }
}
