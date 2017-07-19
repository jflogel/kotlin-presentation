package presentation.typechecks

fun convertToFloat(value: Any): Float {
    return when(value) {
        is Float -> value
        is Int -> value.toFloat()
        is String -> value.toFloat()
        else -> throw Exception("not supported!")
    }
}