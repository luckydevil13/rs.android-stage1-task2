package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val arrayA = a.toUpperCase().toMutableList()
        val arrayB = b.toMutableList()
        val output: MutableList<Char> = mutableListOf()

        for (char in arrayA) {
            if (arrayB.contains(char)) {
                output.add(char)
            }
        }

        return if (output == arrayB) "YES" else "NO"
    }
}
