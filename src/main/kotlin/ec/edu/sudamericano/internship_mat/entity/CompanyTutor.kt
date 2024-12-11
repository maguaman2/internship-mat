package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*


@Entity
@Table(name = "company_tutor")
class CompanyTutor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name = "id")
    var id: Long? = null
    @Column (name = "full_name")
    var fullName: String? = null
    var phone: String? = null
    @Column (name = "company_id")
    var companyId: Int? = null
}