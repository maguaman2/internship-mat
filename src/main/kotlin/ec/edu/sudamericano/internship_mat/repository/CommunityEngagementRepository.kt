package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.CommunityEngagement
import org.springframework.data.jpa.repository.JpaRepository

interface CommunityEngagementRepository : JpaRepository<CommunityEngagement, Long> {
    fun findByDirector(director: String): List<CommunityEngagement>
}