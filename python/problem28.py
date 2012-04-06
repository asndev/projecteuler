# projecteuler
# problem 28


# GLOBALS
i = 1
set = 2
j = 0
sum = 1

# LOOP
while i < 1001*1001:
  i += set
  j += 1
  if j == 4:
    j = 0
    set += 2
  sum += i
  print i

print "Summe: " + str(sum)
