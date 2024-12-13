package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "community_engagement")
data class CommunityEngagement(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val director: String,
    val description: String?,
    val phone: String,
    val email: String,
    val stamp: String
)