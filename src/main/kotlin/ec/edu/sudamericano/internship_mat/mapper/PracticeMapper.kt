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
        practice.academiPeriodic = practiceDto.academi_Periodic
        practice.startDate = practiceDto.start_date
        practice.endDate = practiceDto.end_date
        return practice
    }


    fun toDTO(practice: Practice): PracticeDto {
        return PracticeDto(
            start_date = practice.startDate,
            end_date = practice.endDate,
            office = practice.office,
            level = practice.level,
            academi_Periodic = practice.academiPeriodic
        )
    }
}

