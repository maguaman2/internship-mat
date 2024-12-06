package ec.edu.sudamericano.internship_mat.repository

import ec.edu.sudamericano.internship_mat.entity.Practice
import org.springframework.data.jpa.repository.JpaRepository


interface PracticeRepository: JpaRepository<Practice, Long>{

}