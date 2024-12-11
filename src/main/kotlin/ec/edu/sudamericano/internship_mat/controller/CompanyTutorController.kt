package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.entity.CompanyTutor
import ec.edu.sudamericano.internship_mat.service.CompanyTutorService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class CompanyTutorController {
    @Autowired
    lateinit var companyTutorService: CompanyTutorService

    @GetMapping
    fun getCompanyTutor(): ResponseEntity<CompanyTutor> {
        val companyTutor = companyTutorService.getCompanyTutor()
        return ResponseEntity(CompanyTutor(), HttpStatus.OK)
    }

    @PostMapping
    fun save (@Valid @RequestBody companyTutor: CompanyTutor): ResponseEntity<String> {
        val saveCompanyTutor = companyTutorService.save(companyTutor)
        return ResponseEntity.status(2001).body(saveCompanyTutor.toString())
    }
}