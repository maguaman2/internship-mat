package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.CareerDto
import ec.edu.sudamericano.internship_mat.response.ErrorResponse
import ec.edu.sudamericano.internship_mat.response.FailResponse
import ec.edu.sudamericano.internship_mat.response.SuccessResponse
import ec.edu.sudamericano.internship_mat.service.CareerService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/career")
class CareerController {
    @Autowired
    lateinit var careerService: CareerService

    @GetMapping
    fun getAllCareer(): ResponseEntity<Any> {
        return try {
            val careers = careerService.getAllCareer()
            ResponseEntity.ok(SuccessResponse(status = "success", data = careers))
        } catch (ex: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse(status = "error", message = "An unexpected error occurred", code = HttpStatus.INTERNAL_SERVER_ERROR.value()))
        }
    }

    @GetMapping("/{id}")
    fun getCareerById(@PathVariable id: Long): ResponseEntity<Any> {
        return try {
            val careerDto = careerService.getCareerById(id)
            ResponseEntity.ok(SuccessResponse(status = "success", data = careerDto))
        } catch (ex: RuntimeException) {
            ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorResponse(status = "error", message = "Career with ID $id not found", code = HttpStatus.NOT_FOUND.value()))
        } catch (ex: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse(status = "error", message = "An unexpected error occurred", code = HttpStatus.INTERNAL_SERVER_ERROR.value()))
        }
    }

    @PostMapping
    fun createCareer(@RequestBody @Valid careerDto: CareerDto): ResponseEntity<Any> {
        return try {
            val createdCareer = careerService.createCareer(careerDto)
            ResponseEntity.status(HttpStatus.CREATED).body(SuccessResponse(status = "success", data = createdCareer))
        } catch (ex: IllegalArgumentException) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(FailResponse(status = "fail", data = mapOf("error" to "Invalid career data")))
        } catch (ex: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse(status = "error", message = "An unexpected error occurred", code = HttpStatus.INTERNAL_SERVER_ERROR.value()))
        }
    }

    @GetMapping("/careerCoordinator/{careerCoordinatorId}")
    fun getCareerByCareerCoordinator(@PathVariable careerCoordinatorId: Long): ResponseEntity<Any> {
        return try {
            val careers = careerService.getCareerByCareerCoordinator(careerCoordinatorId)
            ResponseEntity.ok(SuccessResponse(status = "success", data = careers))
        } catch (ex: RuntimeException) {
            ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorResponse(status = "error", message = "Career Coordinator with ID $careerCoordinatorId not found", code = HttpStatus.NOT_FOUND.value()))
        } catch (ex: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse(status = "error", message = "An unexpected error occurred", code = HttpStatus.INTERNAL_SERVER_ERROR.value()))
        }
    }
}

