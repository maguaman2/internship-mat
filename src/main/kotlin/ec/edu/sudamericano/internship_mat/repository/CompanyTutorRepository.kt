package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.dto.CompanyTutorDto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyTutorRepository: JpaRepository<CompanyTutorDto, Long> {

}