# // Eg 1: Input: a1b10
# //        Output: abbbbbbbbbb
# // Eg: 2: Input: b3c6d15
# //           Output: bbbccccccddddddddddddddd
# // The number varies from 1 to 99.

inps = "b3c6d15"
ite = 0
val = ""

for i in inps:
    if i.isalpha():
        for j in range(ite+1 ,ite+3):
            if inps[j].isalpha():
                break;
            else:
                val = val + str(inps[j])


        for k in range(0, int(val)):
            print(i, end="")
    
    ite = ite + 1
    val= ""