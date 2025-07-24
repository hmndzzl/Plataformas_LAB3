class Pizza(name: String, price: Double): Food(name, price) {
    override fun cook(): String{
        return "La $name se debe hornear a 250º por 10 minutos"
    }
}