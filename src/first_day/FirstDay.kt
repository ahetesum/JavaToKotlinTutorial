package first_day

/**
 * Created by A.Biswas on 10/14/2017.
 */
    fun main(args: Array<String>)
    {
        //Hello World
        println("Hello World")


        //Obtain Value from Kotlin Class
        var firstAlien= Alien();

        firstAlien.name="Changuada"

      //  println("The first first_day.Alien arrived name is->"+firstAlien.name)
        println("The first first Alien arrived name is-> ${firstAlien.name}")

        println("The first Alien have access to -> ${firstAlien.acess}")

        //Obtain Value from Java Class
        var firstPredator= Predator();
        firstPredator.name="Anowlka"

        println("The first first Predator arrived name is-> ${firstPredator.name}")

        println("The first Predator have access to -> ${firstPredator.access}")



    }
