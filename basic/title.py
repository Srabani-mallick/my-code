text = input("Enter a paragraph: ")
clean = " ".join(text.split()).title()

vowels = "AEIOU"
counts = {}
for v in vowels:
    counts[v] = clean.upper().count(v)

print("Processed Text:", clean)
print("Vowel Counts:")
for v in vowels:
    print(v, ":", counts[v], end=", ")
