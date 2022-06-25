package rsk


fun main(args: Array<String>) {
    var first = Family("Ojiakor","Nuclear")
    var second = Family("Ojiakor","Nuclear")
    println(first)

    if(first == second){
        println("Equal")
    }else{
        println("Not Equal")
    }

    var third = second.copy(type = "Polygamous")
    println(third)
}





data class Family(val name:String,val type: String)