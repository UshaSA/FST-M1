numbers = list(input("Enter a sequence of values with comma separated : ").split(","))
sum = 0

for number in numbers:
  sum += int(number)

print(sum)