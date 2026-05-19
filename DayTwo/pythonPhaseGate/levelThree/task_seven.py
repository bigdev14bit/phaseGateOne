sum_of_numbers = 0

for numbers in range(1, 6):
    userInput = int(input("Enter Number: "))
    
    sum_of_numbers += userInput

print("Sum of the digits:",sum_of_numbers)
