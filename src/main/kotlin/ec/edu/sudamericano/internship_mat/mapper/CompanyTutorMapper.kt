package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.entity.CompanyTutor

class CompanyTutorMapper {
    fun toEntity(companyTutor: CompanyTutor): CompanyTutor {
        val companyTutor = CompanyTutor()
        companyTutor.id = companyTutor.id
        companyTutor.phone = companyTutor.phone
        companyTutor.fullName = companyTutor.fullName
        companyTutor.companyId = companyTutor.companyId
        return companyTutor
    }
}