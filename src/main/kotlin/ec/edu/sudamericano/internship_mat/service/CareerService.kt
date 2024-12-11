package ec.edu.sudamericano.internship_mat.service


import ec.edu.sudamericano.internship_mat.dto.CareerDto
import ec.edu.sudamericano.internship_mat.mapper.CareerMapper
import ec.edu.sudamericano.internship_mat.repository.CareerCoordinatorRepository
import ec.edu.sudamericano.internship_mat.repository.CareerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CareerService {
    @Autowired
    lateinit var careerRepository: CareerRepository

    @Autowired
    lateinit var careerCoordinatorRepository: CareerCoordinatorRepository

    fun getAllCareer(): List<CareerDto> {
        val careers = careerRepository.findAll()
        return careers.map { CareerMapper.toDto(it) }
    }

    fun getCareerById(id: Long): CareerDto {
        val career = careerRepository.findById(id).orElseThrow {
            RuntimeException("Career not found")
        }
        return CareerMapper.toDto(career)
    }

    fun createCareer(careerDto: CareerDto): CareerDto {
        val careerCoordinator = careerCoordinatorRepository.findById(careerDto.coordinatorId!!).orElseThrow {
            RuntimeException("Career Coordinator with ID ${careerDto.coordinatorId} not found")
        }
        val career = CareerMapper.toEntity(careerDto, careerCoordinator)
        val savedCareer = careerRepository.save(career)
        return CareerMapper.toDto(savedCareer)
    }

    fun getCareerByCareerCoordinator(careerCoordinatorId: Long): List<CareerDto> {
        careerCoordinatorRepository.findById(careerCoordinatorId).orElseThrow {
            RuntimeException("Career Coordinator with ID $careerCoordinatorId not found")
        }
        return careerRepository.findByCareerCoordinatorId(careerCoordinatorId).map { CareerMapper.toDto(it) }
    }
}


