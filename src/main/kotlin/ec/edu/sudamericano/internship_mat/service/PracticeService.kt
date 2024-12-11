package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.dto.PracticeDto
import ec.edu.sudamericano.internship_mat.entity.Practice
import ec.edu.sudamericano.internship_mat.mapper.PracticeMapper
import ec.edu.sudamericano.internship_mat.repository.PracticeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class PracticeService
/*
    @Autowired
    lateinit var practiceRepository: PracticeRepository

    fun getPractice() : List<Practice> {
        return practiceRepository.findAll()
    }

    fun save(practiceDto: PracticeDto): Practice {
        val practice = PracticeMapper.toEntity(practiceDto)
        return practiceRepository.save(practice)
    }
}
*/