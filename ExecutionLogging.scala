def logTime[A](task: () => A): A = {
    def now = System.currentTimeMillis _
    val start = now()
    val result = task()
    val stop = now()
    println(s"Execution time: ${stop - start} ms")
    result
}