# Ackermann
# A(m,n) = (2 ^^ (m-2))  (n+3) -3

def hyper(n):
  hyperResult = 2
  while n != 0:
    hyperResult = hyperResult**2
    n -= 1
  return hyperResult

def ack(m,n):
  return (hyper(m-2)*(n+3)) - 3


## main
print "0:0" + str(ack(0,0))
print "3:0" + str(ack(3,0))
print "3:1" + str(ack(3,1))



#for i in range(0,7):
#	result += iterative_ackermann(i,i)
