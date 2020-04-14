package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        val consonants = listOf(
            'b',
            'c',
            'd',
            'f',
            'g',
            'h',
            'j',
            'k',
            'l',
            'm',
            'n',
            'p',
            'q',
            'r',
            's',
            't',
            'v',
            'x',
            'z',
            'w'
        )

        return when {
            inputString.toLowerCase().toSet().count { it in 'a'..'z' } == 26 -> {
                convert(inputString, vowels)
            }
            inputString.matches("^\\s+$".toRegex()) -> {
                ""
            }
            else -> convert(inputString, consonants)
        }
    }

    private fun convert(inputString: String, charList: List<Char>): String {
        return inputString.trim().split("\\s+".toRegex())
            .sortedBy { word -> word.count { char -> char.toLowerCase() in charList } }
            .joinToString(" ") { word ->
                word.count { char -> char.toLowerCase() in charList }.toString() + word.map { char -> if (char.toLowerCase() in charList) char.toUpperCase() else char }.joinToString("")
            }
    }
}