//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun Food.discountedPrice(porcentaje: Int) : Double {
        return price - ((porcentaje.toDouble() / 100) * price)
    }
    val hamburguesa = Burger("Hamburguesa con queso", 35.0)
    println(hamburguesa.cook())
    val pizza = Pizza("3 quesos", 40.0)
    println(pizza.cook())
    val helado = IceCream("Helado de fresa", 8.0)
    println(helado.cook())
    val jugo = Juice("Jugo de Naranja", 15.0)
    println(jugo.cook())
    println(jugo.pour())

    println(helado.eat())
    println("${hamburguesa.name} normalmente cuesta Q${hamburguesa.price}, ahora con descuento cuesta Q${hamburguesa.discountedPrice(10)}.")

}