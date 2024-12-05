package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.service.StudentService
import ec.edu.sudamericano.internship_mat.dto.StudentDTO
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(
    private val studentService: StudentService
) {
    @GetMapping
    fun getAllStudents(): List<StudentDTO> {
        return studentService.getAllStudents()
    }

    @GetMapping("/{nui}")
    fun getStudentByNui(@PathVariable nui: String): StudentDTO? {
        return studentService.getStudentByNui(nui)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createStudent(@RequestBody studentDTO: StudentDTO): StudentDTO {
        return studentService.createStudent(studentDTO)
    }
}
