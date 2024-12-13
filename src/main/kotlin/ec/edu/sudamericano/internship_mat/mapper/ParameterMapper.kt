package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.ParameterDto
import ec.edu.sudamericano.internship_mat.entity.Parameter

object ParameterMapper {
    fun toDto(entity: Parameter) = ParameterDto(
        id = entity.id,
        category = entity.category,
        description = entity.description,
        grade = entity.grade
    )

    fun toEntity(dto: ParameterDto) = Parameter(
        id = dto.id ?: 0,
        category = dto.category,
        description = dto.description,
        grade = dto.grade
    )
}
