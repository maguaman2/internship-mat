package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.entity.CompanyTutor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class CompanyTutorService {
    @Autowired
    lateinit var companyTutorService: CompanyTutorService

    fun getCompanyTutor(): ResponseEntity<CompanyTutor> {
        return companyTutorService.getCompanyTutor()
    }
    fun save(companyTutor: CompanyTutor): ResponseEntity<CompanyTutor> {
        return companyTutorService.save(companyTutor)
    }



}