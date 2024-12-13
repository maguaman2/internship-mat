package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.entity.Eval
import ec.edu.sudamericano.internship_mat.repository.EvalRepository
import org.springframework.stereotype.Service

@Service
class EvalService(private val evalRepository: EvalRepository) {

    fun getAllEvals(): List<Eval> = evalRepository.findAll()

    fun getEvalById(id: Long): Eval = evalRepository.findById(id).orElseThrow { RuntimeException("Eval not found") }

    fun createEval(eval: Eval): Eval = evalRepository.save(eval)

    fun updateEval(id: Long, eval: Eval): Eval {
        if (!evalRepository.existsById(id)) {
            throw RuntimeException("Eval not found")
        }
        return evalRepository.save(eval)
    }

    fun deleteEval(id: Long) {
        if (!evalRepository.existsById(id)) {
            throw RuntimeException("Eval not found")
        }
        evalRepository.deleteById(id)
    }

    fun getEvalsWithGradeGreaterThan(grade: Double): List<Eval> {
        return evalRepository.findEvalsWithGradeGreaterThan(grade)
    }
}