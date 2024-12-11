package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.CareerDto
import ec.edu.sudamericano.internship_mat.entity.Career
import ec.edu.sudamericano.internship_mat.entity.CareerCoordinator

object CareerMapper {
    fun toEntity(careerDto: CareerDto, careerCoordinator: CareerCoordinator): Career {
        val career = Career()
        career.coordinator = careerCoordinator
        career.careerName = careerDto.careerName
        return career
    }

    fun toDto(career: Career): CareerDto {
        val careerDto = CareerDto()
        careerDto.coordinatorId = career.coordinator?.id?: 0L
        careerDto.careerName = career.careerName ?: ""
        return careerDto
    }
}