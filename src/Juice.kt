class Juice(name: String, price: Double) : Drink(name, price) {

    override fun cook(): String {
        return "Para obtener $name se debe exprimir fresco"
    }

    override fun pour(): String {
        return "$name se sirve en un vaso con hielo"
    }


}