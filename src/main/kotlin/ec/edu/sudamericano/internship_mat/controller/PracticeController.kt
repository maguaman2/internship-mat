package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.PracticeDto
import ec.edu.sudamericano.internship_mat.entity.Practice
import ec.edu.sudamericano.internship_mat.service.PracticeService
import ec.edu.sudamericano.internship_mat.response.SuccessResponse
import ec.edu.sudamericano.internship_mat.response.ErrorResponse
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/practice")
class PracticeController {

    @Autowired
    lateinit var practiceService: PracticeService


    @GetMapping
    fun getPractice(): ResponseEntity<Any> {
        return try {
            val practices = practiceService.getAll()
            ResponseEntity.ok(SuccessResponse(data = practices))
        } catch (e: Exception) {
            ResponseEntity.status(500).body(ErrorResponse(message = e.message, code = 500))
        }
    }


    @PostMapping
    fun save(@RequestBody @Valid practiceDto: PracticeDto): ResponseEntity<Any> {
        return try {
            val savedPractice = practiceService.create(practiceDto)
            ResponseEntity.status(201).body(SuccessResponse(data = savedPractice))
        } catch (e: Exception) {
            ResponseEntity.status(500).body(ErrorResponse(message = e.message, code = 500))
        }
    }
}
