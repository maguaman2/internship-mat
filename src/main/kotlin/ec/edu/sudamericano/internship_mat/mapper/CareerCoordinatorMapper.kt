package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.CareerCoordinatorDTO
import ec.edu.sudamericano.internship_mat.entity.CareerCoordinator
import org.springframework.stereotype.Component


@Component
object CareerCoordinatorMapper {
    fun toEntity(dto: CareerCoordinatorDTO): CareerCoordinator {
        return CareerCoordinator(
            id = dto.id ?: 0,
            phoneNumber = dto.phoneNumber,
            coordinatorName = dto.coordinatorName
        )
    }

    fun toDTO(entity: CareerCoordinator): CareerCoordinatorDTO {
        return CareerCoordinatorDTO(
            id = entity.id,
            phoneNumber = entity.phoneNumber,
            coordinatorName = entity.coordinatorName
        )
    }
}
