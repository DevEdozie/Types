package rsk


fun main(args: Array<String>) {
    var kevin = Students(1,"Kevin")
    var jones = Students(1,"Kevin")

    println(kevin)

    if(kevin == jones){
        println("Equal")
    }else{
        println("Not Equal")
    }

    var newKevin = kevin.copy(name = "Robert")
    println(newKevin)
}


data class Students(val id:Int,val name:String){

}