def is_prime(n):
    if n <2: 
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True
def classify_numbers(nums):
    classification = {
        "Prime": [],
        "Composite": [],
        "Perfect Squares": [],
        "Perfect Cubes": []
    }
    for n in nums:
        if is_prime(n):
            classification["Prime"].append(n)
        elif n > 1:
            classification["Composite"].append(n)
        if int(n**0.5)**2 == n:
            classification["Perfect Squares"].append(n)
        if round(n**(1/3))**3 == n:
            classification["Perfect Cubes"].append(n)
    return classification
n = (input("Enter the numbers"))
print(n)
print(classify_numbers(n))