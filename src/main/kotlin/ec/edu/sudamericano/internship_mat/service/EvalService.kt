package ec.edu.sudamericano.internship_mat.service

import ec.edu.sudamericano.internship_mat.entity.EvalEntity
import ec.edu.sudamericano.internship_mat.repository.EvalRepository
import org.springframework.stereotype.Service

@Service
class EvalService(private val evalRepository: EvalRepository) {

    fun getAllEvals(): List<EvalEntity> = evalRepository.findAll()

    fun getEvalById(id: Long): EvalEntity = evalRepository.findById(id).orElseThrow { RuntimeException("Eval not found") }

    fun createEval(eval: EvalEntity): EvalEntity = evalRepository.save(eval)

    fun updateEval(id: Long, eval: EvalEntity): EvalEntity {
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
}