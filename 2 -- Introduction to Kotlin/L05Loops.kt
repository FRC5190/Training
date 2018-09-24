fun main(args: Array<String>) {
    repeat(10) { println(it + 1) } //starts at 0 so have to add 1
    for (i in 1..10) println(i)
    (1..10).forEach { println(it) }

    var i = 1
    while(i <= 10) {
        println(i)
        i++
    }
}