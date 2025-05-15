user_number = 0
count = 1
first_largest_number = 0
second_largest_number = 0

while count <= 10:
	user_number = int(input('Enter a number: '))
	count += 1
	
	if user_number > first_largest_number:
		second_largest_number = first_largest_number

		first_largest_number = user_number

	elif user_number > second_largest_number and user_number != first_largest_number:
		second_largest_number = user_number

print('The first largest value is: ',first_largest_number, second_largest_number)
	

	