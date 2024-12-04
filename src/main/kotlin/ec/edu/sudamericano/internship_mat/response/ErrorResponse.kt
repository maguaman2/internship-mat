package ec.edu.sudamericano.internship_mat.response

class ErrorResponse (
    val status: String = "error",
    val message: String? = null,
    val code: Int? = null
)