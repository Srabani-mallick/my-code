import os
student=["Alice","Bob","Charlie","David","Eva"]
with open('student.txt','w') as f:
    for i in student:
        print(i+'\n')
print("file 'student.txt' created sucessfully")
print("contents of the file:")
with open('student.txt','r') as f:
         print(f.read())