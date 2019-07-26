package me.brunqcal.RecipesMaker

import me.brunqcal.RecipesMaker.model.*
import java.lang.NumberFormatException

var exit = 1
var recetaList: MutableList<Ingrediente> = mutableListOf()
var aguaList: MutableList<Ingrediente> = mutableListOf()
var lacteosList: MutableList<Ingrediente> = mutableListOf()
var carnesList: MutableList<Ingrediente> = mutableListOf()
var verdurasList: MutableList<Ingrediente> = mutableListOf()
var frutasList: MutableList<Ingrediente> = mutableListOf()
var cerealList: MutableList<Ingrediente> = mutableListOf()
var huevosList: MutableList<Ingrediente> = mutableListOf()
var aceiteList: MutableList<Ingrediente> = mutableListOf()

fun main(){
    showMenu()
}
fun showMenu(){
    do {
        println("\n:: Bienvenido a Recipe Maker ::\n\n")
        println("Seleciona la opción deseada:")
        println("1. Hacer una receta.")
        println("2. Ver mis recetas.")
        println("3. Salir")
        var response: Int?
        try {
            response = readLine()?.toInt() ?: 3
        }catch (nfe: NumberFormatException){
            response = 3
        }
        when(response){
            1 -> makeRecipe()
            2 -> viewRecipe()
            3 -> exit = 0
        }
        println("Tu respuesta fue: $response")
    }while (exit.equals(1))
}

fun makeRecipe(){
    println(":: CREACIÓN DE RECETA ::")
    var finished = false
    var userRes: Int? = -1
    do {
        println("Ingrese la categoría:")
        println("1. Agua")
        println("2. Leche")
        println("3. Carne")
        println("4. Verduras")
        println("5. Frutas")
        println("6. Cereal")
        println("7, Huevos")
        println("8. Aceite")
        println("0. Salir")
        try {
            userRes = readLine()?.toInt()
        }catch (nfe: NumberFormatException){
            println("Ocurrió un fallo obteniendo su respuesta, intentelo nuevamente")
        }
        if(userRes!!.equals(0)){
            break
        }
        when(userRes){
            1 -> AguaCategory("Agua", aguaList, recetaList).ingredientList()
            2 -> LecheCategory("Lacteos", lacteosList, recetaList).ingredientList()
            3 -> CarneCategory("Carne", carnesList, recetaList).ingredientList()
            4 -> VerdurasCategory("Verduras", verdurasList, recetaList).ingredientList()
            5 -> FrutasCategory("Frutas", frutasList, recetaList).ingredientList()
            6 -> CerealCategory("Cereal", frutasList, recetaList).ingredientList()
            7 -> HuevosCategory("Huevos", huevosList, recetaList).ingredientList()
            8 -> AceiteCategory("Aceite", aceiteList, recetaList).ingredientList()
        }
    }while (!finished)
}
fun viewRecipe(){
    if(recetaList.isEmpty()){
        println("Ingresa nuevamente cuando hayas creado una receta")
    }else {
        var aux = 1
        println("\n\n")
        println("Tu receta es la siguiente:")
        for (ing in recetaList){
            println("$aux: ${ing.cantidad} ${ing.unidadMedida} de ${ing.name}\n")
            aux++
        }
        println("\n")
    }
}