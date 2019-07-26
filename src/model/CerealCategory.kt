package me.brunqcal.RecipesMaker.model

class CerealCategory(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>): Category(name,list, generalList) {
    init {
        list.add(Ingrediente("Avena", "g"))
        list.add(Ingrediente("Trigo", "g"))
        list.add(Ingrediente("Arroz", "g"))
        list.add(Ingrediente("Maíz", "g"))
    }

    override fun ingredientList(): Unit {
        return super.ingredientList()
    }

    override fun toString(): String {
        return super.toString()
    }


}