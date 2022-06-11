
inp = "1123334432"
_consecutive = 3
count  = 1
not_found = 0
i=0
while(i < len(inp)):
    if len(inp)-_consecutive+1 == i:
        break
    else:
        if inp[i] == inp[i+1]:
            count = count + 1
            not_found = 1
        else:
            count = 1

    if count == _consecutive:
        print("yes", inp[i])
            
    i+=1

