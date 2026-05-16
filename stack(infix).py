def postfix_to_infix(postfix):
    stack=[]
    for ch in postfix:
        if ch.isalnum():
            stack.append(ch)
        else:
            op2=stack.pop()
            op1=stack.pop()
            x='('+op1+ch+op2+')'
        stack.append(ex)
    return stack[-1]
ex="AB+"
print("postfix:",ex)
print("infix:",postfix_to_infix(ex))