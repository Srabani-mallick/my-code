class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def removeLoop(head):
    if not head or not head.next:
        return

    slow = fast = head

    # Detect loop
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            break
    else:
        return

    # Find start of loop
    slow = head

    if slow == fast:
        while fast.next != slow:
            fast = fast.next
        fast.next = None
        return

    while slow.next != fast.next:
        slow = slow.next
        fast = fast.next

    fast.next = None


def printList(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")


# Create list: 1 -> 2 -> 3 -> 4 -> 5
head = Node(1)
head.next = Node(2)
head.next.next = Node(3)
head.next.next.next = Node(4)
head.next.next.next.next = Node(5)

# Create loop: 5 -> 3
head.next.next.next.next.next = head.next.next

removeLoop(head)

printList(head)