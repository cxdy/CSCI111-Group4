month = int(input("Enter a month (1-12): "))
year = int(input("Enter a year: "))

numberOfDays = 0

if (month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12):
    numberOfDays = 31
elif (month == 2):
    if((year % 100 == 0 and year % 400 == 0) or (year % 100 != 0 and year % 4 == 0)):
        numberOfDays = 29
    else:
        numberOfDays = 28
elif (month == 4 or month == 6 or month == 9 or month == 11):
    numberOfDays = 30

print(f"There are {numberOfDays} days in {month}/{year}")