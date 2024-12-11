package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.EvalDto
import ec.edu.sudamericano.internship_mat.entity.EvalEntity
import org.springframework.stereotype.Component

@Component
class EvalMapper {
    fun toDto(entity: EvalEntity): EvalDto {
        return EvalDto(
            id = entity.id,
            description = entity.description,
            grade = entity.grade,
            studentId = entity.studentId,
            companyTutorId = entity.companyTutorId,
            tutorAcademicId = entity.tutorAcademicId
        )
    }

    fun toEntity(dto: EvalDto): EvalEntity {
        return EvalEntity(
            id = dto.id,
            description = dto.description,
            grade = dto.grade,
            studentId = dto.studentId,
            companyTutorId = dto.companyTutorId,
            tutorAcademicId = dto.tutorAcademicId
        )
    }
}