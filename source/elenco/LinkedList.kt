package elenco

private class LinkedListNode<E>(var element: E, var nextNode: LinkedListNode<E>?)

public class LinkedList<E> {
    private var headNode: LinkedListNode<E>? = null

    private fun getLastNode(): LinkedListNode<E>? {
        if (headNode == null) {
            return null
        }

        var currentNode = headNode
        while (currentNode?.nextNode != null) {
            currentNode = currentNode.nextNode
        }

        return currentNode
    }

    public fun insert(element: E, index: Int) {



    }

    public fun enqueue(element: E) {
        append(E)
    }

    public fun append(element: E) {
        val newNode = LinkedListNode<E>(element, null)
        if (headNode == null) {
            headNode = newNode
        }
        else {
            val lastNode = getLastNode()
            lastNode!!.nextNode = newNode
        }
    }

    public fun prepend(element: E) {
        val newNode = LinkedListNode<E>(element, headNode)
        headNode = newNode
    }
}
