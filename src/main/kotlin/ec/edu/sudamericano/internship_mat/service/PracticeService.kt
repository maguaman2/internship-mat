package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.dto.PracticeDto
import ec.edu.sudamericano.internship_mat.mapper.PracticeMapper
import ec.edu.sudamericano.internship_mat.repository.PracticeRepository
import org.springframework.stereotype.Service

@Service
class PracticeService
class PracticeService(
    private val repository: PracticeRepository,
    private val mapper: PracticeMapper
) {


    fun getAll(): List<PracticeDto> {
        return repository.findAll().map { mapper.toDTO(it) }
    }


    fun getById(id: Long): PracticeDto? {
        return repository.findById(id).map { mapper.toDTO(it) }.orElse(null)
    }


    fun create(dto: PracticeDto): PracticeDto {
        val entity = mapper.toEntity(dto)
        return mapper.toDTO(repository.save(entity))
    }


    fun update(id: Long, dto: PracticeDto): PracticeDto? {
        return if (repository.existsById(id)) {
            val entity = mapper.toEntity(dto.copy(id = id))
            mapper.toDTO(repository.save(entity))
        } else {
            null
        }
    }


    fun delete(id: Long) {
        repository.deleteById(id)
    }

}

