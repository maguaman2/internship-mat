package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.ParameterDTO
import ec.edu.sudamericano.internship_mat.entity.Parameter
import org.springframework.stereotype.Component

@Component
class ParameterMapper {
    fun toParameterDTO(parameter: Parameter): ParameterDTO {
        return ParameterDTO(
            id = parameter.id,
            category = parameter.category,
            description = parameter.description,
            grade = parameter.grade,
            evalId = parameter.eval.id
        )
    }
}
