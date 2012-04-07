# problem 12
# projecteuler

def getTriangle(n):
  sum = 0
  for i in range (1, n+1):
    sum += i
  return sum
  
def getDiv(n):
  dividers = 2
  i = 2
  while i*i < n:
    if n%i == 0: dividers += 2
    i += 1
  return dividers
  
n = 10000
x = getTriangle(n)
max = 0

while max < 500:
  n += 1
  x += n
  tmp = getDiv(x)
  if tmp > max: max = tmp
print x