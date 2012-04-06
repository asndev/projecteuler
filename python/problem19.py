# problem19
# Sunday = 6
import datetime

startdate = datetime.date(1901, 1, 1)
sum = 0
j = 1901
while j <= 2000:

  for i in range(1,13):
    date = datetime.date(j, i, 1)
    day = date.weekday()
    if day == 6: sum += 1
  j += 1
  
print sum
