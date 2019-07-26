package me.brunqcal.RecipesMaker.model

class HuevosCategory(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>): Category(name,list, generalList) {
    init {
        list.add(Ingrediente("Huevos de codorniz", "unidades"))
        list.add(Ingrediente("Huevos de pato", "unidades"))
        list.add(Ingrediente("Huevos de Ñandú", "unidades"))
        list.add(Ingrediente("Huevos de Gallina", "unidades"))
        list.add(Ingrediente("Huevos de Pavo", "unidades"))
    }

    override fun ingredientList(): Unit {
        return super.ingredientList()
    }

    override fun toString(): String {
        return super.toString()
    }


}