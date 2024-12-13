package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.CommunityEngagementDto
import ec.edu.sudamericano.internship_mat.mapper.CommunityEngagementMapper
import ec.edu.sudamericano.internship_mat.response.SuccessResponse
import ec.edu.sudamericano.internship_mat.service.CommunityEngagementService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/community-engagements")
class CommunityEngagementController(
    private val communityEngagementService: CommunityEngagementService,
    private val communityEngagementMapper: CommunityEngagementMapper
) {

    @GetMapping
    fun getAll(): ResponseEntity<Any> {
        val engagements = communityEngagementService.getAllCommunityEngagements()
        return ResponseEntity.ok(SuccessResponse(data = engagements.map { communityEngagementMapper.toDto(it) }))
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<CommunityEngagementDto> {
        val engagement = communityEngagementService.getCommunityEngagementById(id)
        return ResponseEntity.ok(communityEngagementMapper.toDto(engagement))
    }

    @PostMapping
    fun createEngagement(@Valid @RequestBody communityEngagementDto: CommunityEngagementDto): ResponseEntity<CommunityEngagementDto> {
        val engagement = communityEngagementMapper.toEntity(communityEngagementDto)
        val savedEngagement = communityEngagementService.createCommunityEngagement(engagement)
        return ResponseEntity.ok(communityEngagementMapper.toDto(savedEngagement))
    }

    @PutMapping("/{id}")
    fun updateEngagement(
        @PathVariable id: Long,
        @Valid @RequestBody communityEngagementDto: CommunityEngagementDto
    ): ResponseEntity<CommunityEngagementDto> {
        val engagement = communityEngagementMapper.toEntity(communityEngagementDto)
        val updatedEngagement = communityEngagementService.updateCommunityEngagement(id, engagement)
        return ResponseEntity.ok(communityEngagementMapper.toDto(updatedEngagement))
    }

    @DeleteMapping("/{id}")
    fun deleteEngagement(@PathVariable id: Long): ResponseEntity<Void> {
        communityEngagementService.deleteCommunityEngagement(id)
        return ResponseEntity.noContent().build()
    }

    @GetMapping("/search")
    fun searchByDirector(@RequestParam director: String): ResponseEntity<Any> {
        val engagements = communityEngagementService.findByDirector(director)
        return ResponseEntity.ok(SuccessResponse(data = engagements.map { communityEngagementMapper.toDto(it) }))
    }
}