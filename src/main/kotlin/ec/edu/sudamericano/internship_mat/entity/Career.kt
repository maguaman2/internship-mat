package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*

@Entity
@Table(name = "career")
class Career {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null

    @Column(name = "career_name")
    var careerName: String? = null

    @Column(name = "coordinator_id")
    var coordinatorId: Long? = null
}