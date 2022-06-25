package rsk

abstract class Animal(val name: String) {
    open fun getAnimalName(): String = "$name"
    abstract fun getFamily()
}

class Feline(var felinename: String) : Animal(felinename) {
    override fun getFamily() {
        println("${felinename} is a Feline")
    }
}

class Canine(var canineName: String) : Animal(canineName) {
    override fun getFamily() {
        println("${canineName} is a Canine")
    }
}

fun main(args: Array<String>) {
    val bruno = Canine("Bruno")
    bruno.getFamily()
    val kate = Feline("Kate")
    kate.getFamily()
}