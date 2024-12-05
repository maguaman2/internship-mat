package ec.edu.sudamericano.internship_mat.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "table_name")
class Model {
    @Id
    var id: Long = TODO("initialize me")
}