#problem34
#projecteuler

def fac(x):
  result = 1
  for i in range(2, x+1):
    result *= i
  return result

def check(x):
  word = str(x)
  sum = 0
  for i in word:
    sum += fac(int(i)) 
  return sum == x

sum = 0
for i in range(4,7*fac(9)):
  if check(i):
    sum += i
    print sum
print "Result: " + str(sum)
