# projecteuler
# problem 40
# antonstepan

d = "123456789"
for i in range (10, 1000001):
  d += str(i)

print int(d[0]) *int(d[9]) *int(d[100-1]) *int(d[1000-1]) *int(d[10000-1]) *int(d[100000-1]) * int(d[1000000-1])   