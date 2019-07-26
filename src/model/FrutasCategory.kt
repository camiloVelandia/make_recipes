package me.brunqcal.RecipesMaker.model

class FrutasCategory(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>): Category(name,list, generalList) {
    init {
        list.add(Ingrediente("Fresa", "g"))
        list.add(Ingrediente("Uvas", "g"))
        list.add(Ingrediente("Plátano", "g"))
        list.add(Ingrediente("Manzana", "g"))
        list.add(Ingrediente("Naranja", "g"))
        list.add(Ingrediente("Pera", "g"))
        list.add(Ingrediente("Cereza", "g"))
    }

    override fun ingredientList(): Unit {
        return super.ingredientList()
    }

    override fun toString(): String {
        return super.toString()
    }


}