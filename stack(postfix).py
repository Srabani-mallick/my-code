def precedence(op):
    if op=='^':
        return 3
    elif op==('*','/'):
        return 2
    elif op==('+','-'):
        return 1
    else:
        return 0
def is_operator(c):
    return c in['+','-','*','/','^']
def infix_to_postfix(expression):
    stack=[]
    output=[]
    for ch in expression:
        if  ch.isalnum():
            output.append(ch)
        elif ch=='(':
            stack.append(ch)
        elif ch==')':
            while stack and stack[-1]!=c:
                output.append(stack.pop())
            stack.pop()
        elif is_operator(ch):
            while(stack and precedence(stack[-1]>=precedence(ch))):
                output.append(stack.pop())
            stack.append(ch)
    while stack:
            output.append(stack.pop())
    return ''.join(output)
exp="A+B"
print("infix is:",exp)
print("postfix:",infix_to_postfix(exp))