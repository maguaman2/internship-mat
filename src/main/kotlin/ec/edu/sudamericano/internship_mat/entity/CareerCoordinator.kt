package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.*


@Entity
@Table(name = "career_coordinator")
 data class CareerCoordinator (
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 val id: Long,
 val phoneNumber: String,
 val coordinatorName: String
)
