package rsk

sealed class AnimalType{
    class Wild: AnimalType()
    class Domestic:AnimalType()
}

fun handleAnimalType(type: AnimalType){
    when(type){
        is AnimalType.Domestic -> println("Domestic")
        is AnimalType.Wild -> println("Wild")
    }
}

fun main(args: Array<String>) {
    val animal:AnimalType = AnimalType.Wild()
    handleAnimalType(animal)
}