def password(pwd):
    error=[]
    if len(pwd)<8:
        error.append("password length less than 8")
    u,l,d,c=0,0,0,0
    f=True
    for i in pwd:
        if i.isupper():
            u+=1
        elif i.islower():
            l+=1
        elif i.isdigit():
            d+=1
        elif i.isspace():
            f=False
        elif not i.isalnum():
            c+=1
    if (u==0):
        error.append("must contain at least one upper case letter")
    if (l==0):
        error.append("must contain atleast one lower case letter")
    if(d==0):
        error.append("must contain one digit")
    if not f:
        error.append("must not contain any space")
    if(c==0):
        error.append("must contain one special charater")
    return error

pwd=input("Enter the password:")
error=password(pwd)
if(len(error)==0):
    print("password is valid")
else:
    for i in error:
        print(i)