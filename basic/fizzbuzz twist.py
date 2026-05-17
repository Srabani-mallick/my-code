def fizzbuz_sum(n): 
    sum = 0
    for i in range(n + 1):

        if i % 3 == 0 and i % 5 == 0:
            print("FizzBuzz")

        elif i % 3 == 0:
            print("Fizz")

        elif i % 5 == 0:
            print("Buzz")

        else:
            sum = sum + i

    print("Sum =", sum)


num = int(input("Enter the number: "))
fizzbuz_sum(num)