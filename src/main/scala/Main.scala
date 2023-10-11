
case class Address(city: String, region: String)

class Student(id: Int, name: String, age: Int, address: Address)
  extends Human(name, age, address)
{
  def displayInfo: String =
  {
    s"ID: $id, Name: $name, Age: $age, Address: ${address.city}, ${address.region}, Adult: $isAdult"
  }
}

class Teacher(name: String, age: Int, address: Address, val subject: String) extends Human(name, age, address)
{
  def teach: String = s"I am teaching $subject."
}

case class Human(name: String, age: Int, address: Address)
{
  def isAdult: Boolean = age >= 18
  def greet: String = s"Hello, my name is $name."
}

object Main
{
  def main(args: Array[String]): Unit =
  {

    val address = Address("City", "Region")
    val student = new Student(1, "Oleg", 20, address)
    println(student.displayInfo)

    val teacherAddress = Address("City", "Street")
    val mathTeacher = new Teacher("John", 38, teacherAddress, "Math")
    println(mathTeacher.greet)
    println(mathTeacher.teach)
    println(mathTeacher.isAdult)
  }
}