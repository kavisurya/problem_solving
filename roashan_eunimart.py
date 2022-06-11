import sys

# a = [10,13,15,17,19]
# n = 38
a = sys.argv[1:]
n = sys.argv[2:]
ans = []
flag = 0
for i in range(len(a)):
    for j in range(0, len(a)-i):
        if sum(a[i:j]) == n:
            ans = a[i:j]
            flag = flag + 1

if flag == 0:
    pass
else:
    for i in ans:
        print(str(i)+" ", end="")
    
    if flag > 1:
        print("a b c")
    if flag > 2:
        print("x y z")