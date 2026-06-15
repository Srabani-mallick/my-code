class Node:
    def __init__(self, info):
        self.info = info
        self.next = None


def push(top):
    x = int(input("Enter element to push: "))
    newNode = Node(x)

    newNode.next = top
    top = newNode

    print(f"{x} pushed into stack.")
    return top


def pop(top):
    if top is None:
        print("Stack Underflow! Stack is Empty.")
        return top

    print("Popped element:", top.info)
    top = top.next
    return top


def display(top):
    if top is None:
        print("Stack is Empty.")
        return

    print("Stack Elements:")
    temp = top

    while temp:
        print(temp.info)
        temp = temp.next


top = None

while True:
    print("\n**** MENU ****")
    print("0: Exit")
    print("1: Push")
    print("2: Pop")
    print("3: Display")

    choice = int(input("Enter your choice: "))

    if choice == 0:
        print("Program Terminated")
        break

    elif choice == 1:
        top = push(top)

    elif choice == 2:
        top = pop(top)

    elif choice == 3:
        display(top)

    else:
        print("Wrong Choice")