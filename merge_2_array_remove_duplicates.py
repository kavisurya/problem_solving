n=int(input())

myarr = []
a = input().split(" ")
m=int(input())
b =input().split(" ")

print(a)
print(b)

for i in a:
    if i != "":
        myarr.append(int(i))
for i in b:
    if i != "":
        myarr.append(int(i))
        

myarr = set(myarr)
myarr = sorted(list(myarr))

for i in myarr:
    print(i, end="")
    print(end=" ")
