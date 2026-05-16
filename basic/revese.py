sentence = input("Enter a sentence: ")
sep = input("Enter a separator: ")

clean = ""
for ch in sentence:
    if ch not in string.punctuation:
        clean += ch

words = clean.lower().split()
words.sort(reverse=True)

result = ""
for i in range(len(words)):
    result += words[i]
    if i != len(words) - 1:
        result += sep
print(result)
