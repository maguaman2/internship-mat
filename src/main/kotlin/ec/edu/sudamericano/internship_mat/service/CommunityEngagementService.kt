package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.entity.CommunityEngagement
import ec.edu.sudamericano.internship_mat.repository.CommunityEngagementRepository
import org.springframework.stereotype.Service

@Service
class CommunityEngagementService(
    private val communityEngagementRepository: CommunityEngagementRepository
) {

    fun getAllCommunityEngagements(): List<CommunityEngagement> =
        communityEngagementRepository.findAll()

    fun getCommunityEngagementById(id: Long): CommunityEngagement =
        communityEngagementRepository.findById(id)
            .orElseThrow { RuntimeException("Community Engagement not found") }

    fun createCommunityEngagement(communityEngagement: CommunityEngagement): CommunityEngagement =
        communityEngagementRepository.save(communityEngagement)

    fun updateCommunityEngagement(id: Long, communityEngagement: CommunityEngagement): CommunityEngagement {
        if (!communityEngagementRepository.existsById(id)) {
            throw RuntimeException("Community Engagement not found")
        }
        return communityEngagementRepository.save(communityEngagement)
    }

    fun deleteCommunityEngagement(id: Long) {
        if (!communityEngagementRepository.existsById(id)) {
            throw RuntimeException("Community Engagement not found")
        }
        communityEngagementRepository.deleteById(id)
    }

    fun findByDirector(director: String): List<CommunityEngagement> =
        communityEngagementRepository.findByDirector(director)
}