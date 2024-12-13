package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.CareerCoordinatorDTO
import ec.edu.sudamericano.internship_mat.response.SuccessResponse
import ec.edu.sudamericano.internship_mat.response.FailResponse
import ec.edu.sudamericano.internship_mat.response.ErrorResponse
import ec.edu.sudamericano.internship_mat.service.CareerCoordinatorService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/career-coordinator")
class CareerCoordinatorController (
    private val service: CareerCoordinatorService
) {
    @GetMapping
    fun getAll(): ResponseEntity<Any> {
            val coordinators = service.getAll()
         return   ResponseEntity.ok(SuccessResponse(data = coordinators))
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Any> {
        val dto = service.getById(id)
        return if (dto != null) {
            ResponseEntity.ok(SuccessResponse(data = dto))
        } else {
            ResponseEntity.status(404).body(FailResponse(data = "CareerCoordinator not found"))
        }
    }


    @GetMapping("/search")
    fun getByName(@RequestParam name: String): ResponseEntity<Any> {
        val coordinators = service.getByName(name)
        return ResponseEntity.ok(SuccessResponse(data = coordinators))
    }

    @PostMapping
    fun create(@RequestBody dto: CareerCoordinatorDTO): ResponseEntity<Any> {
            val createdDto = service.create(dto)
          return  ResponseEntity.status(201).body(SuccessResponse(data = createdDto))


    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody dto: CareerCoordinatorDTO): ResponseEntity<Any> {
        val updatedDto = service.update(id, dto)
        return if (updatedDto != null) {
            ResponseEntity.ok(SuccessResponse(data = updatedDto))
        } else {
            ResponseEntity.status(404).body(FailResponse(data = "CareerCoordinator not found"))
        }
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Any> {
        return try {
            service.delete(id)
            ResponseEntity.noContent().build()
        } catch (e: Exception) {
            ResponseEntity.status(500).body(ErrorResponse(message = e.message, code = 500))
        }
    }
}