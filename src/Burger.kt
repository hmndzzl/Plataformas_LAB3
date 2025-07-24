class Burger(name:  String, price: Double): Food(name, price) {
    override fun cook(): String {
        return "Para cocinar la $name se debe asar la carne a la parrilla y luego tostar el pan con mantequilla"
    }
}