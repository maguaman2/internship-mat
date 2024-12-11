package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*

@Entity
@Table(name = "career")
class Career {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null

    @OneToOne
    @JoinColumn(name = "coordinator_id", referencedColumnName = "id", nullable = false)
    var coordinator: CareerCoordinator? = null

    @Column(name = "career_name")
    var careerName: String? = null

}