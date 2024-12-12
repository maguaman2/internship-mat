package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.entity.Student
import ec.edu.sudamericano.internship_mat.repository.StudentRepository
import ec.edu.sudamericano.internship_mat.mapper.StudentMapper
import ec.edu.sudamericano.internship_mat.dto.StudentDTO
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class StudentService(
    private val studentRepository: StudentRepository,
    private val studentMapper: StudentMapper
) {
    fun getAllStudents(): List<StudentDTO> {
        return studentRepository.findAll().map { studentMapper.toDTO(it) }
    }

    fun getStudentByNui(nui: String): StudentDTO? {
        val student = studentRepository.findByNui(nui)
        return student?.let { studentMapper.toDTO(it) }
    }

    @Transactional
    fun createStudent(studentDTO: StudentDTO): StudentDTO {
        val studentEntity = studentMapper.toEntity(studentDTO)
        val savedStudent = studentRepository.save(studentEntity)
        return studentMapper.toDTO(savedStudent)
    }

    fun getStudentsByCareer(careerId: Int): List<StudentDTO> {
        val students = studentRepository.findStudentsByCareerId(careerId)
        return students.map { studentMapper.toDTO(it) }
    }
}
