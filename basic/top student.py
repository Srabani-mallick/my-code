def top_student(s_dict):
    avg_s = {name: sum(marks)/len(marks) for name, marks in s_dict.items()}
    t_name = max(avg_s, key=avg_s.get)
    print("Student with highest average:", top_name)
    return t_name
scores_dict = {"Ram": [85, 90, 92], "Laxman": [70, 80, 88], "Janaki": [95, 100, 90]}
top_student(s_dict)
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True
def process_dict(d):
    result = {}
    for k, v in d.items():
        if isinstance(v, list):
            result[k] = sum(x for x in v if is_prime(x))
        elif isinstance(v, tuple):
            prod = 1
            for x in v:
                if x % 2 != 0:
                    prod *= x
            result[k] = prod
    return result
data = {"A": [2, 3, 4, 5, 10], "B": (1, 2, 3, 4, 5), "C": [7, 8, 9], "D": (6, 7, 8)}
print(process_dict(data))

