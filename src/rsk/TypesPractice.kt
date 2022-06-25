package rsk

interface Food{
    fun displayCalories()
}

class Carbohydrate(val name:String,val kcal:Int):Food{
    override fun displayCalories(){
        println("$kcal kcal")
    }

}

class Protein(val name:String,val kcal:Int):Food{
    override fun displayCalories(){
        println("$kcal kcal")
    }

}

fun main(args: Array<String>) {
    val rice = Carbohydrate("Rice",70)
    val beans = Protein("Beans",50)
    rice.displayCalories()
    beans.displayCalories()
}