def getAmi(number):
  res = 0
  i = 1
  while (i < number+1/2):
    if number%i == 0:
      res += i
    i += 1
  return res


# - Main -
result = 0
j = 1
while j != 10001:
  x = getAmi(j)
  if getAmi(x) == j and x != j:
    print "AN = " + str(j)
    result += j
  j += 1

print "Ges.Result:" + str(result)
