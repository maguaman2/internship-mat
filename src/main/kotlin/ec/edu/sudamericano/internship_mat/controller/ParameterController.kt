package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.ParameterDto
import ec.edu.sudamericano.internship_mat.service.ParameterService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/parameter")
class ParameterController {

    @Autowired
    private lateinit var parameterService: ParameterService

    @GetMapping
    fun getAllParameters(): ResponseEntity<List<ParameterDto>> =
        ResponseEntity.ok(parameterService.findAll())

    @GetMapping("/{id}")
    fun getParameterById(@PathVariable id: Int): ResponseEntity<ParameterDto> =
        ResponseEntity.ok(parameterService.findById(id))

    @PostMapping
    fun createParameter(@RequestBody parameterDto: ParameterDto): ResponseEntity<ParameterDto> =
        ResponseEntity.status(HttpStatus.CREATED).body(parameterService.save(parameterDto))

    @PutMapping("/{id}")
    fun updateParameter(@PathVariable id: Int, @RequestBody parameterDto: ParameterDto): ResponseEntity<ParameterDto> {
        val updatedParameter = parameterDto.copy(id = id)
        return ResponseEntity.ok(parameterService.save(updatedParameter))
    }

    @DeleteMapping("/{id}")
    fun deleteParameter(@PathVariable id: Int): ResponseEntity<Void> {
        parameterService.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}