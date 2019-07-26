package me.brunqcal.RecipesMaker.model

class AguaCategory(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>): Category(name,list, generalList) {
    init {
        list.add(Ingrediente("Agua mineral", "ml"))
        list.add(Ingrediente("Agua con gas", "ml"))
        list.add(Ingrediente("Agua fría", "ml"))
        list.add(Ingrediente("Agua caliente", "ml"))
        list.add(Ingrediente("Agua a temperatura ambiente", "ml"))
    }

    override fun ingredientList(): Unit {
        return super.ingredientList()
    }

    override fun toString(): String {
        return super.toString()
    }


}
