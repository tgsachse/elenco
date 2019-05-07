package elenco

private class DequeNode<E>(
    var element: E,
    var nextNode: DequeNode<E>?,
    var previousNode: DequeNode<E>?
)

public class Deque<E> {
    private var size: Int = 0
    private var headNode: DequeNode<E>? = null
    private var tailNode: DequeNode<E>? = null

    /*
    private fun getLastNode(): DequeNode<E>? {
        if (headNode == null) {
            return null
        }

        var currentNode = headNode
        while (currentNode?.nextNode != null) {
            currentNode = currentNode.nextNode
        }

        return currentNode
    }*/

    public fun insert(element: E, index: Int) {
        val newNode = DequeNode<E>(element, null, null)

        if (index < 0 || index > size) {
            val message = "The index '${index}' is out of the deque's bounds!"
            throw IndexOutOfBoundsException(message)
        }

        if (headNode == null || tailNode == null) {
            headNode = newNode
            tailNode = newNode
        }
        else if (index == 0) {
            newNode.nextNode = headNode
            headNode!!.previousNode = newNode
            headNode = newNode
        }
        else if (index == size) {
            newNode.previousNode = tailNode
            tailNode!!.nextNode = newNode
            tailNode = newNode
        }
        else {
            var precedingIndex: Int
            var precedingNode: DequeNode<E>
            if (index > (size / 2)) {
                precedingIndex = size - 2
                precedingNode = tailNode!!.previousNode!!
                while (precedingIndex >= index) {
                    precedingNode = precedingNode.previousNode!!
                    precedingIndex--
                }
            }
            else {
                precedingIndex = 0
                precedingNode = headNode!!
                while (precedingIndex < (index - 1)) {
                    precedingIndex++
                    precedingNode = precedingNode.nextNode!!
                }
            }

            newNode.previousNode = precedingNode
            newNode.nextNode = precedingNode.nextNode
            newNode.nextNode!!.previousNode = newNode
            newNode.previousNode!!.nextNode = newNode
        }
        size++
    }

    public fun print() {
        var currentNode = headNode
        while (currentNode != null) {
            println("${currentNode.element}")
            currentNode = currentNode.nextNode
        }
    }

    /*
    public fun enqueue(element: E) {
        append(E)
    }

    public fun append(element: E) {
        val newNode = DequeNode<E>(element, null)
        if (headNode == null) {
            headNode = newNode
        }
        else {
            val lastNode = getLastNode()
            lastNode!!.nextNode = newNode
        }
    }

    public fun prepend(element: E) {
        val newNode = DequeNode<E>(element, headNode)
        headNode = newNode
    }*/
}
