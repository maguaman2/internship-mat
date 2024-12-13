package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.dto.CareerCoordinatorDTO
import ec.edu.sudamericano.internship_mat.mapper.CareerCoordinatorMapper
import ec.edu.sudamericano.internship_mat.repository.CareerCoordinatorRepository
import org.springframework.stereotype.Service

@Service
class CareerCoordinatorService (
    private val repository: CareerCoordinatorRepository,
    private val mapper: CareerCoordinatorMapper
) {
    fun getAll(): List<CareerCoordinatorDTO> {
        return repository.findAll().map { mapper.toDTO(it) }
    }

    fun getById(id: Long): CareerCoordinatorDTO? {
        return repository.findById(id).map { mapper.toDTO(it) }.orElse(null)
    }

    fun create(dto: CareerCoordinatorDTO): CareerCoordinatorDTO {
        val entity = mapper.toEntity(dto)
        return mapper.toDTO(repository.save(entity))
    }

    fun update(id: Long, dto: CareerCoordinatorDTO): CareerCoordinatorDTO? {
        return if (repository.existsById(id)) {
            val entity = mapper.toEntity(dto.copy(id = id))
            mapper.toDTO(repository.save(entity))
        } else {
            null
        }
    }

    fun getByName(name: String): List<CareerCoordinatorDTO> {
        val coordinators = repository.findByNameOrderByIdDesc(name)
        return coordinators.map { coordinator ->
            CareerCoordinatorDTO(
                id = coordinator.id,
                phoneNumber = coordinator.phoneNumber,
                coordinatorName = coordinator.coordinatorName
            )
        }
    }
    fun delete(id: Long) {
        repository.deleteById(id)
    }
}