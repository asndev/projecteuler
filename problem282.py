result = 0

# Ackermann
# A(m,n) = (2 ^^ (m-2))  (n+3) -3

def hyper(n):
  hyperResult = 0
  while n != 0:
    hyperResult = hyperResult^^2
    n -= 1
  return hyperResult

print 

#for i in range(0,7):
#	result += iterative_ackermann(i,i)
