package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.response.ErrorResponse
import ec.edu.sudamericano.internship_mat.response.FailResponse
import ec.edu.sudamericano.internship_mat.response.SuccessResponse
import ec.edu.sudamericano.internship_mat.service.StudentService
import ec.edu.sudamericano.internship_mat.dto.StudentDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(
    private val studentService: StudentService
) {
    @GetMapping
    fun getAllStudents(): ResponseEntity<SuccessResponse> {
        val students = studentService.getAllStudents()
        return ResponseEntity.ok(SuccessResponse(data = students))
    }

    @GetMapping("/{nui}")
    fun getStudentByNui(@PathVariable nui: String): ResponseEntity<Any> {
        val student = studentService.getStudentByNui(nui)
        return if (student != null) {
            ResponseEntity.ok(SuccessResponse(data = student))
        } else {
            ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(FailResponse(data = mapOf("nui" to nui)))
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createStudent(@RequestBody studentDTO: StudentDTO): ResponseEntity<SuccessResponse> {
        val createdStudent = studentService.createStudent(studentDTO)
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(SuccessResponse(data = createdStudent))
    }

    @ExceptionHandler(Exception::class)
    fun handleException(exception: Exception): ResponseEntity<ErrorResponse> {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(ErrorResponse(message = exception.message, code = HttpStatus.INTERNAL_SERVER_ERROR.value()))
    }
}
