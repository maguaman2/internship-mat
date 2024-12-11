package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.CompanyDto
import ec.edu.sudamericano.internship_mat.entity.Company

object CompanyMapper {
    fun toEntity(companyDto: CompanyDto): Company {
        var company = Company()
            company.companyName = companyDto.companyName
            company.ceo = companyDto.ceo
            company.address = companyDto.address
            company.province = companyDto.province
            company.latitude = companyDto.latitude
            company.longitude = companyDto.longitude
            company.canton = companyDto.canton
        return company
    }
}