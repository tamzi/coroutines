import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    val job = launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("World!")
    }
    println("Hello")
    job.join() // wait until child coroutine completes
    println("Done")
}

suspend fun doSomeStuff() = coroutineScope {
   launch {
      delay(4500L)
       println("Twende Hikking")
   }
    val asn2 =  launch {
        delay(7000L)
        println("Twende Kanisa")
    }
    println("We can do this without beer and food: ")
}
