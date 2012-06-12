# Anton Stepan
# Problem282 - projecteuler.com
# ackermann shit

def hyper(a,n,b):
  if (n==1): return pow(a,b,14**8)
  if (b==0): return 1
  return hyper(a,n-1, hyper(a,n,b-1))

def ack(m,n):
  #if (n<4): return acklow(m,n)
  return hyper(2, m-2, n+3) - 3

def acklow(m,n):
  if (m==0): return n+1
  if (n==0): return acklow(m-1,1)
  return acklow(m-1, acklow(m,n-1))

#print '1,1 = ' + str(ack(1,1))
#print '2,2 = ' + str(ack(2,2))
#print '3,3 = ' + str(ack(3,3))
#print '4,4 = ' + str(ack(4,4))
print '5,5 = ' + str(ack(4,1))
print '5,5 = ' + str(ack(4,2))
print '5,5 = ' + str(ack(4,3))
print '5,5 = ' + str(ack(4,4))
print '5,5 = ' + str(ack(4,5))
print '5,5 = ' + str(ack(5,2))