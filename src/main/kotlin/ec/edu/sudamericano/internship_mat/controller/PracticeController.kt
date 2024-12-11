package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.PracticeDto
import ec.edu.sudamericano.internship_mat.entity.Practice
import ec.edu.sudamericano.internship_mat.repository.PracticeRepository
import ec.edu.sudamericano.internship_mat.service.PracticeService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/practice")

class PracticeController 
/*
    @Autowired
    lateinit var practiceService: PracticeService

    @GetMapping
    fun getPractice() = practiceService.getPractice()

    @PostMapping
    fun save(@RequestBody @Valid practiceDto: PracticeDto): Practice {
        return practiceService.save(practiceDto)
    }
}
*/