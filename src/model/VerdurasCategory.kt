package me.brunqcal.RecipesMaker.model

class VerdurasCategory(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>): Category(name,list, generalList) {
    init {
        list.add(Ingrediente("Zanahoria", "g"))
        list.add(Ingrediente("Rábano", "g"))
        list.add(Ingrediente("Puerro", "g"))
        list.add(Ingrediente("Cebolla", "g"))
        list.add(Ingrediente("Coliflor", "g"))
        list.add(Ingrediente("Zapallo", "g"))
        list.add(Ingrediente("Brócoli", "g"))
        list.add(Ingrediente("Arvejas", "g"))
        list.add(Ingrediente("Berenjena", "g"))
    }

    override fun ingredientList(): Unit {
        return super.ingredientList()
    }

    override fun toString(): String {
        return super.toString()
    }
}

