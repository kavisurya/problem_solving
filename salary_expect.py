a = [
00.21,
04.51,
05.54,
09.36,
05.44,
05.04,
08.16,
08.12,
09.41,
08.03,
04.48,
06.50,
04.18,
05.34,
06.13,
05.37,
04.04,
05.27,
05.54,
05.05,
05.08,
05.03,
03.55,
05.22,
05.05,
05.17,
04.49,
05.01,]

# a = [07.22,
# 05.00,
# 04.37,
# 05.41,
# 05.43,
# 03.34,
# 04.51,
# 03.10,
# 03.00,
# 10.00,
# 05.49,
# 05.47,
# 06.32,
# 05.05,
# 09.31,
# 05.20,
# 03.18,
# 03.23,
# 10.00,
# 04.20,
# 03.20,
# 02.41,
# 04.54,
# 07.08]

count = 0.0

for i in a:
    count += i




print("total hours worked : ",count)
print("no of days worked : ", len(a))
print("mean of the hour : ",count/len(a))
print("approximately can expect salary this month : Rs.", (count)*55)