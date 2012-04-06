#projecteuler
#problem56 - anton stepan

a = 0
b = 0
fin = 0

while a < 100:
  b = 0
  while b < 100:
    res = str(pow(a,b))
    tmp = 0
    for i in res:
      tmp += int(i)
    if tmp>fin: fin = tmp
    b += 1
  a += 1
print fin
