# projecteuler
# problem29

numbers = [] 

for a in range (2,101):
  for b in range (2,101):
    numbers.append( pow(a,b) )

print len(set(numbers))

