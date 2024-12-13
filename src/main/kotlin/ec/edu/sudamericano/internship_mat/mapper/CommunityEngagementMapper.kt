package ec.edu.sudamericano.internship_mat.mapper

import ec.edu.sudamericano.internship_mat.dto.CommunityEngagementDto
import ec.edu.sudamericano.internship_mat.entity.CommunityEngagement
import org.springframework.stereotype.Component


@Component
class CommunityEngagementMapper {

    fun toDto(entity: CommunityEngagement): CommunityEngagementDto {
        return CommunityEngagementDto(
            id = entity.id,
            director = entity.director,
            description = entity.description,
            phone = entity.phone,
            email = entity.email,
            stamp = entity.stamp
        )
    }

    fun toEntity(dto: CommunityEngagementDto): CommunityEngagement {
        return CommunityEngagement(
            id = dto.id,
            director = dto.director,
            description = dto.description,
            phone = dto.phone,
            email = dto.email,
            stamp = dto.stamp
        )
    }
}