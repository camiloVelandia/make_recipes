package me.brunqcal.RecipesMaker.model

class AceiteCategory(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>): Category(name,list, generalList) {
    init {
        list.add(Ingrediente("Aceite de maíz", "ml"))
        list.add(Ingrediente("Aceite de soja", "ml"))
        list.add(Ingrediente("Aceite de oliva", "ml"))
        list.add(Ingrediente("Aceite de girasol", "ml"))
        list.add(Ingrediente("Aceite de sésamo", "ml"))
    }

    override fun ingredientList(): Unit {
        return super.ingredientList()
    }

    override fun toString(): String {
        return super.toString()
    }


}