package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return  try {
            var form = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("Ru"))
            LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(form)
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }
}