package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.ParameterDto
import ec.edu.sudamericano.internship_mat.service.ParameterService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/parameter")
class ParameterController(private val parameterService: ParameterService) {

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
    fun updateParameter(@PathVariable id: Int, @RequestBody parameterDto: ParameterDto): ResponseEntity<ParameterDto> =
        ResponseEntity.ok(parameterService.update(id, parameterDto))

    @PatchMapping("/{id}")
    fun updatePartialParameter(@PathVariable id: Int, @RequestBody parameterDto: ParameterDto): ResponseEntity<ParameterDto> =
        ResponseEntity.ok(parameterService.updatePartial(id, parameterDto))

    @DeleteMapping("/{id}")
    fun deleteParameter(@PathVariable id: Int): ResponseEntity<Void> {
        parameterService.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}
