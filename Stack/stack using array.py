MAX = 10

def push(stack, top):
    if top == MAX - 1:
        print("Stack Overflow! Stack is Full.")
    else:
        x = int(input("Enter element to push: "))
        top += 1
        stack[top] = x
        print(f"{x} pushed into stack.")
    return top

def pop(stack, top):
    if top == -1:
        print("Stack Underflow! Stack is Empty.")
    else:
        print("Popped element:", stack[top])
        top -= 1
    return top

def display(stack, top):
    if top == -1:
        print("Stack is Empty.")
    else:
        print("Stack Elements:")
        for i in range(top, -1, -1):
            print(stack[i])

def isEmpty(top):
    return top == -1

def isFull(top):
    return top == MAX - 1


stack = [0] * MAX
top = -1

while True:
    print("\n*** MENU ***")
    print("0: Exit")
    print("1: Push")
    print("2: Pop")
    print("3: Display")
    print("4: isEmpty")
    print("5: isFull")

    choice = int(input("Enter your choice: "))

    if choice == 0:
        print("Program Terminated")
        break

    elif choice == 1:
        top = push(stack, top)

    elif choice == 2:
        top = pop(stack, top)

    elif choice == 3:
        display(stack, top)

    elif choice == 4:
        print("Stack Empty:", isEmpty(top))

    elif choice == 5:
        print("Stack Full:", isFull(top))

    else:
        print("Invalid Choice")