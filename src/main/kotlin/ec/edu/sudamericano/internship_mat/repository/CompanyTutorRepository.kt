package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.dto.CompanyTutorDto
import ec.edu.sudamericano.internship_mat.entity.CompanyTutor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyTutorRepository: JpaRepository<CompanyTutor, Long> {

}