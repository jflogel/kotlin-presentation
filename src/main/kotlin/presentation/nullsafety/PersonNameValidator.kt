package presentation.nullsafety

fun validateName(name: String?): Boolean {
    if (name == null) {
        return false
    }
    return name.length > 2 && name.matches("""[A-Za-z-\s]*""".toRegex())
}