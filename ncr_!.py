a = 5
b = 2

def factorial(n):
    val = 1
    for i in range(1, n+1):
        val = i * val
    return val

cal1 = factorial(a)
formula = (factorial(a-b) *  factorial(b))

print(cal1)
print(cal1/formula)
