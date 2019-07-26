package me.brunqcal.RecipesMaker.model

class CarneCategory(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>): Category(name,list, generalList){
    init {
        list.add(Ingrediente("Carne bóvida","g"))
        list.add(Ingrediente("Carne porcina", "g"))
        list.add(Ingrediente("Carne ovina", "g"))
        list.add(Ingrediente("Carne de pollo", "g"))
        list.add(Ingrediente("Carne de pescado", "g"))
    }
    override fun ingredientList(): Unit {
        return super.ingredientList()
    }

    override fun toString(): String {
        return super.toString()
    }


}