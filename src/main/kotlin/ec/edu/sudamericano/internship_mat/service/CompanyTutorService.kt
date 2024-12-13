package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.entity.CompanyTutor
import ec.edu.sudamericano.internship_mat.repository.CompanyTutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class CompanyTutorService {
    @Autowired
    lateinit var companyTutorRepository: CompanyTutorRepository

    fun getCompanyTutor(): List<CompanyTutor> {
        return companyTutorRepository.findAll()
    }
    fun save(companyTutor: CompanyTutor): CompanyTutor {
        return companyTutorRepository.save(companyTutor)
    }



}