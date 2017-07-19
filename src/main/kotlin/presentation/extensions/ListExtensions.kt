package presentation.extensions

//fun List<Int>.doubleIt(): List<Int> {
//    return this.map { it * 2 }
//}

// more concise version of doubleIt function
fun List<Int>.doubleIt() = this.map { it * 2 }