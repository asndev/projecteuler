# problem 24
import itertools

result = 0
for i in itertools.permutations("0123456789", 10):
	result = result + 1
	if result == 1000000:
		result = i
		break

  
print result
