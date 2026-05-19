def add(firstNumber, secondNumber):

    return firstNumber + secondNumber
print("\nAdding to numbers")
print("Result",add(2, 22))

def checkEven(firstNumber):
    if firstNumber % 2 == 0:
        return "Even Number"
    else:
        return "Odd Number"
    print(firstNumber)
print("\nCheck Even Number: 17")
print("Result: Number is",checkEven(17))

def findLargest(firstNumber, secondNumber, thirdNumber):
    largest = firstNumber
    if secondNumber > largest:
        largest = secondNumber
    if thirdNumber > largest:
        largest = thirdNumber
    else:
        largest = firstNumber
    return largest

print("Largest number:",findLargest(30, 20, 10))

def squareOf(number):
    return number * number
print("Square of 6 is",squareOf(6))

def reverseLetter(letters):
    reverse = " "
    letters = "ololo"

    for letter in letters:
        reverse = reverse + letter
    print("Result:",reverse)
print(reverseLetter(letters))
