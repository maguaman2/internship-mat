package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*

@Entity
@Table(name = "company")
class Company {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var companyName: String? = null
    var ceo: String? = null
    var address: String? = null
    var province: String? = null
    var latitude: Double? = null
    var longitude: Double? = null
    var canton: String? = null
}