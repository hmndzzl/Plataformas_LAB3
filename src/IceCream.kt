class IceCream(name: String, price: Double): Food(name, price), Dessert {
    override fun cook(): String {
        return "$name se debe mantener a una temperatura de -18º"
    }

    override fun eat(): String {
        return "$name se come en cono"
    }
}