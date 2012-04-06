# projecteuler
# problem30

def check(x):
  word = str(x)
  sum = 0
  for i in word:
    sum += pow(int(i),5)

  return sum == x

sum = 0
for i in range (10,10000000):
  if check(i):
    sum += i
    print sum

print sum
