inps = "kavinnrao"
length = len(inps)-1
for i in range(0, len(inps)):

    for j in range(0, len(inps)):
        if j == i or length == j:
            print(inps[j],end="")
        else:
            print(" ",end="")
    print()
    length = length - 1