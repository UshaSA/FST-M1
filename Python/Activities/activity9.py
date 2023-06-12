input_1 = [16,20,27,90,11]
input_2 = [22,55,10,12,34]

# Print the lists
print("First List ", input_1)
print("Second List ", input_2)

thirdList = []

for num in input_1:
    if (num % 2 != 0):
        thirdList.append(num)

for num in input_2:
    if (num % 2 == 0):
        thirdList.append(num)

print("result List is:")
print(thirdList)