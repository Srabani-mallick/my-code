# def word_count(str):
#     c=dict()
#     words=str.split()
#     for w in words:
#         if w in c:
#             c[w]+=1
#         else:
#             c[w]=1
#     return c

# s=input("Enter the String:")
# print(word_count(s))
def remove_punctuation(t):
    punctuation_chars = '''!"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~'''
    result = ''
    for char in t:
        if char not in punctuation_chars:
            result += char
    return result


s = input("Enter a sentence: ")
clean_sentence = remove_punctuation(s)
words = clean_sentence.lower().split()


word_freq = {}
for w in words:
    if w in word_freq:
        word_freq[w] += 1
    else:
        word_freq[w] = 1


for w in sorted(word_freq):
    print(w,":",word_freq[w])
    