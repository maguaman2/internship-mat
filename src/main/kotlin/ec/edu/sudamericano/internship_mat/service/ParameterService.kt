package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.dto.ParameterDto
import ec.edu.sudamericano.internship_mat.mapper.ParameterMapper
import ec.edu.sudamericano.internship_mat.repository.ParameterRepository
import org.springframework.stereotype.Service

@Service
class ParameterService(
    private val repository: ParameterRepository
) {
    fun findAll(): List<ParameterDto> =
        repository.findAll().map { ParameterMapper.toDto(it) }

    fun findById(id: Int): ParameterDto =
        repository.findById(id)
            .map { ParameterMapper.toDto(it) }
            .orElseThrow { NoSuchElementException("Parameter with id $id not found") } // Usar NoSuchElementException

    fun save(parameterDto: ParameterDto): ParameterDto =
        ParameterMapper.toDto(repository.save(ParameterMapper.toEntity(parameterDto)))

    fun update(id: Int, parameterDto: ParameterDto): ParameterDto {
        val existingParameter = findById(id)
        val updatedParameter = parameterDto.copy(id = existingParameter.id)
        return save(updatedParameter)
    }

    fun updatePartial(id: Int, parameterDto: ParameterDto): ParameterDto {
        val existingParameter = findById(id)
        val updatedParameter = existingParameter.copy(
            category = parameterDto.category ?: existingParameter.category,
            description = parameterDto.description ?: existingParameter.description,
            grade = parameterDto.grade ?: existingParameter.grade
        )
        return save(updatedParameter)
    }

    fun deleteById(id: Int) = repository.deleteById(id)
}
