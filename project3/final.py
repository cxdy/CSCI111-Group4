# Objective: Find the number of days in a month with a user inputted month and year.

# Class: CSCI 111 - Intro to Computer Science
# Group: Project Group 4

# Ask user to input a month in the number format and year above 1000.
month = int(input("Enter a month (1-12): "))
year = int(input("Enter a year (>1000): "))

# Set up var that will be assigned later on to represent the number of days in a particular month.
number_of_days = 0

# Start an if/elif chain that will determine the number of days in the month provided.
if (month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12) :
  number_of_days = 31
elif (month == 4 or month == 6 or month == 9 or month == 11) :
  number_of_days = 30
elif(month == 2):
  # When month equals 2, if the year provided has no remainder when both divided by 100 and 400 
  # or if the year has a remainder when divided by 100, but not when divided by 4, then assign 29 days.
  # Otherwise assign 28 days.
  if((year % 100 == 0 and year % 400 == 0) or (year % 100 != 0 and year % 4 == 0)):
    number_of_days = 29
  else:
    number_of_days = 28


# Print the number of days with the month and year provided.
print(f"There are {number_of_days} days in {month}/{year}")