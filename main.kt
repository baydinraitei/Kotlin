
/*Tp Kotlin*/
class Person(var Name: String, var Age: Int
var personne = Person("Hassen", 24)
println (personne.name)


data class Shop(val name: String, val customers:
List<Customer>)
data class Customer(val name: String, val city: City, val
orders: List<Order>) {
    override fun toString() = "$name from ${city.name}"
}
data class Order(val products: List<Product>, val
isDelivered: Boolean)
data class Product(val name: String, val price: Double) {
    override fun toString() = "'$name' for $price"
}
data class City(val name: String) {
    override fun toString() = name
}



fun main() {
    fun start(): String = "ok"
    println(start())


    fun joinOptions(options: Collection<String>) = options.joinToString(separator = ", ", prefix = "[", postfix = "]")
    println(joinOptions(listOf("a", "b", "c"

            class Person (var nom : String, var age : Int)
    var personne = Person("Hassen", 24)
    println(personne.age)
}

var ville: Collection<City> = listOf(City("Paris"), City("monaco"))
println(ville)
fun Shop.getCitiesCustomersAreFrom(): Collection<City> {
    return customers.map { it.city }
}

fun Shop.getCustomersFrom(city: City): Collection<Customer> {

    return customers.filter { it.city.name == city.name }
}



