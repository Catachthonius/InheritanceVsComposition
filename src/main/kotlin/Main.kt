//Write two different implementations of 1 parent and 2 children classes that override one method:
// one using inheritance and another using interfaces.

open class Parent {
    private var parentHeightInCm = 177
    private var parentWeightInKg = 89
    open fun printVariables() {
        println("Registered parent height is: $parentHeightInCm \n Registered parent weight is: $parentWeightInKg")
    }
}

interface Hair {
    fun hairColor()
}

class Child1 : Parent() {
    private var childHeightInCm = 92
    private var childWeightInKg = 39
    override fun printVariables() {
        println("Registered child height is: $childHeightInCm \n Registered child weight is: $childWeightInKg")
    }
}

class Child2 : Hair {
    private val childHairColor = "Brown"
    override fun hairColor() {
        println("Registered child hair color is: $childHairColor")
    }
}

fun main() {
    val runParent = Parent()
    runParent.printVariables()

    val runChild1 = Child1()
    runChild1.printVariables()

    val runChild2 = Child2()
    runChild2.hairColor()
}
