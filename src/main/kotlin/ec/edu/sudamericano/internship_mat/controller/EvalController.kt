package ec.edu.sudamericano.internship_mat.controller

import ec.edu.sudamericano.internship_mat.dto.EvalDto
import ec.edu.sudamericano.internship_mat.mapper.EvalMapper
import ec.edu.sudamericano.internship_mat.response.SuccessResponse
import ec.edu.sudamericano.internship_mat.service.EvalService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/evals")
class EvalController(
    private val evalService: EvalService,
    private val evalMapper: EvalMapper
) {

    @GetMapping
    fun getAll(): ResponseEntity<Any> {
        val evals = evalService.getAllEvals()
        return ResponseEntity.ok(SuccessResponse(data = evals.map { evalMapper.toDto(it) }))
    }

    @GetMapping("/{id}")
    fun getEvalById(@PathVariable id: Long): ResponseEntity<EvalDto> {
        val eval = evalService.getEvalById(id)
        return ResponseEntity.ok(evalMapper.toDto(eval))
    }

    @PostMapping
    fun createEval(@RequestBody evalDto: EvalDto): ResponseEntity<EvalDto> {
        val eval = evalMapper.toEntity(evalDto)
        val savedEval = evalService.createEval(eval)
        return ResponseEntity.ok(evalMapper.toDto(savedEval))
    }

    @PutMapping("/{id}")
    fun updateEval(@PathVariable id: Long, @RequestBody evalDto: EvalDto): ResponseEntity<EvalDto> {
        val eval = evalMapper.toEntity(evalDto)
        val updatedEval = evalService.updateEval(id, eval)
        return ResponseEntity.ok(evalMapper.toDto(updatedEval))
    }

    @DeleteMapping("/{id}")
    fun deleteEval(@PathVariable id: Long): ResponseEntity<Void> {
        evalService.deleteEval(id)
        return ResponseEntity.noContent().build()
    }

    @GetMapping("/grades")
    fun getEvalsWithGradeGreaterThan(@RequestParam grade: Double): ResponseEntity<Any> {
        val evals = evalService.getEvalsWithGradeGreaterThan(grade)
        return ResponseEntity.ok(SuccessResponse(data = evals.map { evalMapper.toDto(it) }))
    }
}   