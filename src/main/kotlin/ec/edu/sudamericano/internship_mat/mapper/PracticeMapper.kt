package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.PracticeDto
import ec.edu.sudamericano.internship_mat.entity.Practice


object PracticeMapper {

    fun toEntity(practiceDto: PracticeDto): Practice{
        val practice = Practice()
        practice.office = practiceDto.office
        practice.academi_Periodic = practiceDto.academi_Periodic
        return practice
    }
}