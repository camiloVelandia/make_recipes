package me.brunqcal.RecipesMaker.model

import java.util.ArrayList

open class Ingrediente(var name: String, var unidadMedida: String){
    var cantidad: Int = 0
        set(value){
            if(value <=0){
                field = 1
            }else {
                field = value
            }
        }
    override fun toString(): String {
        return "El ingrediente selecionado es: $name y la cantidad seleccionada es de $cantidad $unidadMedida"
    }
}