package me.brunqcal.RecipesMaker.model

import me.brunqcal.RecipesMaker.makeRecipe


class LecheCategory(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>): Category(name,list, generalList){
    init {
        list.add(Ingrediente("Leche","ml"))
        list.add(Ingrediente("Yogurt", "ml"))
        list.add(Ingrediente("Mantequilla", "g"))
        list.add(Ingrediente("Queso", "g"))
    }
    override fun ingredientList(): Unit {
        return super.ingredientList()
    }

    override fun toString(): String {
        return super.toString()
    }


}