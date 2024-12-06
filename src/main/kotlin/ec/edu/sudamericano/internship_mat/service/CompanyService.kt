package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.dto.CompanyDto
import ec.edu.sudamericano.internship_mat.entity.Company
import ec.edu.sudamericano.internship_mat.mapper.CompanyMapper
import ec.edu.sudamericano.internship_mat.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService {
    @Autowired
    lateinit var companyRepository: CompanyRepository

    fun getAllCompanies(): List<Company> {
        return companyRepository.findAll()
    }

    fun save(companyDto: CompanyDto):Company {
        var company = CompanyMapper.toEntity(companyDto)
        return companyRepository.save(company)
    }
}