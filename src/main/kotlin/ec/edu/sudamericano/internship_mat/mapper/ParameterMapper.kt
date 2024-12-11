package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.ParameterDTO
import ec.edu.sudamericano.internship_mat.entity.Parameter
import org.springframework.stereotype.Component

@Component
class ParameterMapper {
    fun toParameterDTO(parameterDTO: ParameterDTO): Parameter {
        return Parameter()
    }
}
