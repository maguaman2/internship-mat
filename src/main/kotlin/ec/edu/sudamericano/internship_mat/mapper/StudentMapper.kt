package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.entity.Student
import ec.edu.sudamericano.internship_mat.dto.StudentDTO
import org.springframework.stereotype.Component

@Component
class StudentMapper {

    fun toDTO(student: Student): StudentDTO {
        return StudentDTO(
            id = student.id,  // Mapeo de id
            fullName = student.fullName,
            nui = student.nui,
            photoUrl = student.photoUrl,
            careerId = student.careerId
        )
    }

    fun toEntity(studentDTO: StudentDTO): Student {
        return Student(
            fullName = studentDTO.fullName,
            nui = studentDTO.nui,
            photoUrl = studentDTO.photoUrl,
            careerId = studentDTO.careerId
        )
    }
}
