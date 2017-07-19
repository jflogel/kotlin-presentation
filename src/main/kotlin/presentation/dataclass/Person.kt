package presentation.dataclass

import presentation.annotations.Dto

@Dto
data class Person(val firstName: String, val lastName: String, val age: Int)