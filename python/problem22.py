#!/usr/bin/python

file = open("names.txt", "r")
for line in file:
  words = line.split(",")

words.sort()
pos = 1
sum = 0
for word in words:
  tempSum = 0
  for i in word:
    if i != "\"": tempSum += ord(i)-64
  sum += pos * tempSum
  pos += 1

print sum
file.close()
