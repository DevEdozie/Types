package rsk


fun main(args: Array<String>) {
    val kevin = Student("Michael", "Ojiakor", 1, "Some Tutor")
    println(kevin.id)


}

class Program (val nickname:String){
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val kevin = Student("Michael", "Ojiakor", 1, "Some Tutor")
            println(kevin.id)
            val program = Program("Nickname")
            println(program.nickname)
            println("Static method runing")
            Program.Companion.display()
        }
        fun display(){
            println("Companion")
        }
    }
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

open class Student(firstName: String, lastName: String, _id: Int, var tutor: String = "") :
    Person(firstName, lastName) {
    val id: Int


    init {
        id = _id
    }

    override fun getAddress(): String {
        return ""
    }

    fun enrole(coursename: String) {
        val course = Courses.allCourses.filter { it.Title == coursename }
            .firstOrNull()
    }


    override fun getName(): String {
        return ""
    }

    companion object : XmlSerializer<Student> {
        override fun toXml(item: Student) {

        }

        fun createUndergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }

        fun createPostgrad(name: String): PostGraduate {
            return PostGraduate(name)
        }
    }
}


class Undergraduate(firstName: String) : Student(firstName, "", 1) {

}

class PostGraduate(firstName: String) : Student(firstName, "", 1) {

}

interface XmlSerializer<T> {
    fun toXml(item: T)
}