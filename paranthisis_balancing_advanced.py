a = '((abc)((de))'

def isParanthesis(val):
    return ((val == ")" or (val == "(")))


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
        q = []
        visit = set()
        q.append(val)
        visit.add(val)

        while(len(q)):
            my_str = q[len(q)-1]
            q.pop()

            if Valid(my_str):
                print(my_str)
                # print("Balanced")

            else:
                for i in range(0, len(my_str)):
                    if isParanthesis(my_str[i]):

                        temp = my_str[0:i] + my_str[i+1:]
                            # val[0:1] + val[1:full]
                        if temp not in visit:
                            visit.add(temp)
                            q.append(temp)
                    else:
                        pass


Check(a)