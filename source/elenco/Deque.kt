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

    // Insert an element at an index in the deque.
    public fun insert(element: E, index: Int) {
        if (index < 0 || index > size) {
            throw IndexOutOfBoundsException(
                "The given index '${index}' is out of the deque's bounds!"
            )
        }

        val newNode = DequeNode<E>(element, null, null)

        // If the deque is empty, point both the head and tail at the new node.
        if (headNode == null || tailNode == null) {
            headNode = newNode
            tailNode = newNode
        }

        // If the index is 0, prepend the new node to the front of the deque.
        else if (index == 0) {
            newNode.nextNode = headNode
            headNode!!.previousNode = newNode
            headNode = newNode
        }

        // If the index is the size of the deque, append the new node to the
        // back of the deque.
        else if (index == size) {
            newNode.previousNode = tailNode
            tailNode!!.nextNode = newNode
            tailNode = newNode
        }

        // Otherwise, find the node that precedes the desired index and insert
        // after that node.
        else {
            var precedingIndex: Int
            var precedingNode: DequeNode<E>

            // Start the preceding node at the back of the deque if the desired
            // index is in the back half. Recalculate the preceding node until
            // the preceding node is positioned right before the desired index.
            if (index > (size / 2)) {
                precedingIndex = size - 2
                precedingNode = tailNode!!.previousNode!!
                while (precedingIndex >= index) {
                    precedingNode = precedingNode.previousNode!!
                    precedingIndex--
                }
            }

            // Otherwise, start the preceding node at the front of the deque.
            // Recalculate the preceding node until the preceding node is
            // positioned right before the desired index.
            else {
                precedingIndex = 0
                precedingNode = headNode!!
                while (precedingIndex < (index - 1)) {
                    precedingNode = precedingNode.nextNode!!
                    precedingIndex++
                }
            }

            // Insert the new node into the deque after the preceding node.
            newNode.previousNode = precedingNode
            newNode.nextNode = precedingNode.nextNode
            newNode.nextNode!!.previousNode = newNode
            newNode.previousNode!!.nextNode = newNode
        }
        size++
    }

    // Prepend an element to the front of the deque.
    public fun prepend(element: E) {
        insert(element, 0)
    }

    // Append an element to the back of the deque.
    public fun append(element: E) {
        insert(element, size)
    }

    // Enqueue an element at the back of the deque.
    public fun enqueue(element: E) {
        append(element)
    }

    // Push an element onto the top (front) of the deque.
    public fun push(element: E) {
        prepend(element)
    }

    public fun retrieve(index: Int): E {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException(
                "The given index '${index}' is out of the deque's bounds!"
            )
        }

        var currentIndex: Int
        var currentNode: DequeNode<E>
        if (index > (size / 2)) {
            currentIndex = size - 1
            currentNode = tailNode!!
            while (currentIndex > index) {
                currentNode = currentNode.previousNode!!
                currentIndex--
            }
        }

        else {
            currentIndex = 0
            currentNode = headNode!!
            while (currentIndex < index) {
                currentNode = currentNode.nextNode!!
                currentIndex++
            }
        }

        return currentNode.element
    }

    // temp
    public fun print() {
        var currentNode = headNode
        while (currentNode != null) {
            println("${currentNode.element}")
            currentNode = currentNode.nextNode
        }
    }
}
