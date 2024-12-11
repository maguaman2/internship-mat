package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.dto.ParameterDTO
import ec.edu.sudamericano.internship_mat.mapper.ParameterMapper
import ec.edu.sudamericano.internship_mat.repository.ParameterRepository
import org.springframework.stereotype.Service

@Service
class ParameterService(
    private val parameterRepository: ParameterRepository,
    private val parameterMapper: ParameterMapper
) {
    fun getParameters(): List<ParameterDTO> {
        val parameters = parameterRepository.findAll()
        return parameters.map { parameterMapper.toParameterDTO(it) }
    }
}
