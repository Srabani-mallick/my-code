def palindrome(s):
    s = s.lower()
    return s == s[::-1]


def palindrome_two(s):
    c = ""
    for ch in s:
        if ch.isalnum():  
            c += ch.lower()

    l = 0
    r = len(c) - 1
    while l < r:
        if c[l] != c[r]:
            return False
        l += 1
        r -= 1
    return True



s = input("Enter the string: ")

if palindrome(s):
    print("For-loop Check: Palindrome")
else:
    print("For-loop Check: Not Palindrome")

if palindrome_two(s):
    print("Two-pointer Check: Palindrome")
else:
    print("Two-pointer Check: Not Palindrome")
