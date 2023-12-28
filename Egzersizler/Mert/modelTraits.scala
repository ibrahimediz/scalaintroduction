trait Adress:
    def city: String
    def zipCode: Int

trait PersonInfo:
    def name: String
    def age: Int

class Customer(customerID: Int) extends Adress,PersonInfo:
    val city = "Istanbul"
    val zipCode = 34367
    val name = "Mert"
    val age = 26

    println(s"$customerID -> $name $age $city $zipCode")

@main def run() = {
    val result = Customer(1)
}