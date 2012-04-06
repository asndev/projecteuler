# problem36
# projecteuler

def toBin(x):
  return bin(x)[2:]

def isPal(x):
  x = str(x)
  return x == x[::-1]

sum = 0
for i in range(0,1000001):
  if isPal(i) and isPal(toBin(i)):
    sum += i

print sum
