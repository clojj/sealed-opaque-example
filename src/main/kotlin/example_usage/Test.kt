package example_usage

import com.tylerthrailkill.helpers.prettyprint.pp
import sealed_opaque.MyOpaqueType
import sealed_opaque.One
import sealed_opaque.Three
import sealed_opaque.Two

val test = MyOpaqueType.create("one")

//val invalid = MyOpaqueType.create("abc")

fun main() {

    when (test) {
        is One -> {
            pp(test)
            println(test.i)
        }
        is Two -> test.name
        is Three -> TODO()
    }
}
