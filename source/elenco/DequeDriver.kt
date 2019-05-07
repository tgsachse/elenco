package elenco

fun main() {
    val list = Deque<Int>()

    /*
    list.append(1)
    list.append(2)
    list.append(3)
    list.prepend(0)
    list.prepend(-1)
    */
    list.insert(100, 0)
    list.insert(200, 0)
    list.insert(300, 0)
    list.insert(250, 2)
    list.insert(251, 2)
    list.prepend(1000)
    list.enqueue(2000)
    list.push(3000)
    list.print()

    println(list.retrieve(0))
    println(list.retrieve(2))
}
