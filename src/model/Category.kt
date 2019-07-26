package me.brunqcal.RecipesMaker.model


import java.lang.NumberFormatException

abstract class Category(var name: String, var list: MutableList<Ingrediente>, var generalList: MutableList<Ingrediente>){
    open fun ingredientList(): Unit{
        var finished = false //Variable para terminar el ciclo en la categoría que sea seleccioinada
        do { //ciclo do-while, así el código se ejecuta al menos 1 ves.
            var aux: Int = 0 //variable auxiliar para el índice del array
            for (ing in this.list){ //ciclo for para recorrer el array y mostrar los objetos de la categoría
                println("${aux+1}. ${ing.name}")
                aux++
            }

            println("Ingrese algún número indicado en la lista para añadir ese ingrediente a la receta. \nIngrese 0 para volver a la lista de categorías")

            var auxUserRes: Int?
            try {
                auxUserRes = readLine()?.toInt()
            }catch (nfe: NumberFormatException){
                auxUserRes = -11
            }
            //capturando respuesta del usuario

            var userRes = auxUserRes!!
            if(userRes > 0){
                generalList.add(list.get(userRes-1)) //añadiendo la respuesta del usuario al array general de la receta

            } else if(userRes <= 0){
                finished = true
                break
            }

            println("Ingrese la cantidad del ingrediente. \nLa unidad de medida de este ingrediente (${list.get(userRes-1).name}) es: ${list.get(userRes-1).unidadMedida}.\nPara cambiarla en vez de ingresar la cantidad ingrese: Cambiar")
            //Declarando la respuesta del usuario a la cantidad del ingrediente seleccionado y ver si el usuario quiere cambiar la unidad de medida por default del objeto
            var userResCantidad = readLine()

            if(userResCantidad?.toLowerCase().equals("cambiar")){
                println("Ingrese la unidad de medida deseada") //Capturando respuesta del usuario
                var unidadMedidaDeseada = readLine()
                list.get(userRes-1).unidadMedida = unidadMedidaDeseada!! //
            }
            var finishedUM = false //variable para comprobar si el coclo do while de cambiar la unidad de medida termine
            if(userResCantidad?.toLowerCase().equals("cambiar")){
                println("Ingrese la cantidad del ingrediente. \nLa unidad de medida de este ingrediente (${list.get(userRes-1).name}) es: ${list.get(userRes-1).unidadMedida}.")
                userResCantidad = readLine()

            }
            do {
                try {
                    list.get(userRes-1).cantidad = userResCantidad?.toInt()!! //intentando declarar la cantidad
                }catch (nfe: NumberFormatException){
                    println("Ingresa la unidad de medida nuevamente. Ha habido un error") //si el usuario ingresa cualquier otro string que salte un mensaje de error, haciendolo por el ciclo que tenga que ingresar la unidad nuevamente
                }
            }while (finishedUM) //verificación del ciclo
            println("\nHas ingresado ${list.get(userRes-1).cantidad} ${list.get(userRes-1).unidadMedida} de ${list.get(userRes-1).name}") //mensaje para que el usuario sepa que ingresó y cuanto
            println("¿Deseas terminar de añadir ingredientes de ESTA categoría? (Si/No)")
            var userResFinish = readLine()
            if(userResFinish?.toLowerCase()!!.equals("si")) finished = true else if(userResFinish?.toLowerCase()!!.equals("no")) finished = false else finished = false //verificación
        } while (!finished)
    }

    override fun toString(): String {
        return "La categoría seleccionada es: $name"
    }
}