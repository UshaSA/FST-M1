def calculate_sum(numbers):
	sum = 0
	for number in numbers:
		sum += number
	return sum

num_List = [18, 22, 10, 50]

result = calculate_sum(num_List)

print("The sum of all the elements is: " + str(result))