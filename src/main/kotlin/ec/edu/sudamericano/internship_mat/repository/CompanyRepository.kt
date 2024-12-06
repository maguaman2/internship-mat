package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository: JpaRepository<Company, Long> {
}