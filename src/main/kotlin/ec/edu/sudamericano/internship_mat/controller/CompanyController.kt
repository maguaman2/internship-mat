package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.CompanyDto
import ec.edu.sudamericano.internship_mat.entity.Company
import ec.edu.sudamericano.internship_mat.service.CompanyService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/companies")
class CompanyController {
    @Autowired
    lateinit var companyService: CompanyService
    @GetMapping
    fun getAllCompanies() = companyService.getAllCompanies()

    @PostMapping
    fun save(@RequestBody @Valid companyDto: CompanyDto): Company {
        return companyService.save(companyDto)
    }
}