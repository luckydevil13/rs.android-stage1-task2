package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var string = ""
        var num = 0
        var dat = LocalDate.MIN;
        for (i in blockA.indices) {
            if (blockB == Int::class && blockA[i] is Int) {
                num += (blockA[i] as Int)
            } else if (blockB == String::class && blockA[i] is String) {
                string += (blockA[i] as String)
            } else if (blockB == LocalDate::class && blockA[i] is LocalDate) {
                if ((blockA[i] as LocalDate) > dat) {
                    dat = (blockA[i] as LocalDate)
                }
            }
        }
        if (blockB == String::class) {
            return string
        } else if (blockB == LocalDate::class) {
            val formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu")
            return dat.format(formatter)
        }
        return num
    }

}
