def calculator(a,b):
    print("Enter the operation(add/sub/mul/div/mod):")
    op=input("Enter the operation")
    if op=="add":
        print("result=",a+b)
    elif op=="sub":
        print("Result=",a-b)
    elif op=="mul":
        print("Result=",a*b)
    elif op=="div":
        if b!=0:
            print("Result=",a/b)
        else:
            print("Error:Division is not possible")
    elif op=="mod":
        if b!=0:
            print("Result=",a%b)
        else:
            print("Error:modules is not possible")
    else:
        print("Error:invalid operation choice")

a=int(input("enter the first number"))
b=int(input("Enter the second number"))
print(calculator(a,b))