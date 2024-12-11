package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.PracticeDto
import ec.edu.sudamericano.internship_mat.entity.Practice
import org.springframework.stereotype.Component

@Component
class PracticeMapper {


object PracticeMapper 


    fun toEntity(practiceDto: PracticeDto): Practice {
        val practice = Practice()
        practice.level = practiceDto.level
        practice.office = practiceDto.office
        practice.academiPeriodic = practiceDto.academiPeriodic
        practice.startDate = practiceDto.startdate
        practice.endDate = practiceDto.enddate
        return practice
    }


    fun toDTO(practice: Practice): PracticeDto {
        return PracticeDto(
            office = practice.office,
            level = practice.level,
            academiPeriodic = practice.academiPeriodic
        )
    }
}

