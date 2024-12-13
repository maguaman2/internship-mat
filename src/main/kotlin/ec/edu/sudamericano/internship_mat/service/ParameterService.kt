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
        repository.findById(id).map { ParameterMapper.toDto(it) }.orElseThrow { Exception("Parameter not found") }

    fun save(parameterDto: ParameterDto): ParameterDto =
        ParameterMapper.toDto(repository.save(ParameterMapper.toEntity(parameterDto)))

    fun deleteById(id: Int) = repository.deleteById(id)
}