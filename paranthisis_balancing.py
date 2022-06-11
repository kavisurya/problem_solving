a = '((abc)(de))'


def Valid(val):
    count = 0

    for i in val:
        if i == "(":
            count = count + 1
        elif i == ")":
            count = count - 1
    
    if count < 0:
        return False
    elif count == 0:
        return True

def Check(val):
    if len(val) == 0:
        return
    
    else:
        if Valid(val):
            print(val)
            print("Balanced")

        else:
            print("Not balanced")

Check(a)