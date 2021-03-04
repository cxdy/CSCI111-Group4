# Objective: Find the total, average, lowest, and highest rainfall values 
# for 12 months inputted by the user.

# Class: CSCI 111 - Intro to Computer Science
# Group: Project Group 4

# Initialize an empty list for the user to populate with monthly rainfall values.
yearlyRainfall = []

# Start a for loop that iterates 12 times starting from the i value equaling 1.
for i in range(1, 13):
  # User inputs an integer representing the rainfall for that month, one time for each month.
  monthlyRainfall = int(input(f"Please enter the rainfall amount for month {i}: "))
  # If the user inputted value is less than 0, make the user re-enter the rainfall for that month.
  while monthlyRainfall < 0:
    print("Invalid entry, please enter a positive, non-zero number")
    monthlyRainfall = int(input(f"Please enter the rainfall amount for month {i}: "))
  # Push the inputted monthly rainfall value to the list initialized above.
  yearlyRainfall.append(monthlyRainfall)

# Make a copy of the yearly rainfall list that was populated by the user.
sortedYearlyRainfall = yearlyRainfall.copy()

# Sort the copied list from smallest integer to largest integer.
sortedYearlyRainfall.sort()

# Initialize a total rainfall value that will be used in the next for loop.
totalRainfall = 0

# Start a for loop that with each iteration will add the value at the cooresponding index of the list.
for i in range(0, len(yearlyRainfall)):
  totalRainfall += yearlyRainfall[i]

# Get the average rainfall per month by dividing the total rainfall variable above by the length of the yearly
# rainfall list (12).
averageMonthlyRainfall = totalRainfall/len(yearlyRainfall)

# Get the minimum rainfall month by finding the first occurance index of the first value of the sorted rainfall list in 
# the yearly rainfall list. One has to be added the minRainfallMonth value because lists start at index 0.
minRainfallMonth = yearlyRainfall.index(sortedYearlyRainfall[0]) + 1

# Get the maxiumum rainfall month by finding the first occurance index of the last value of the sorted rainfall list in 
# the yearly rainfall list. One has to be added the maxRainfallMonth value because lists start at index 0.
maxRainfallMonth = yearlyRainfall.index(sortedYearlyRainfall[-1]) + 1

# Print the output as described in the assignment
print(f"The total rainfall for the year is {totalRainfall} inches.")
print(f"The average monthly rainfall for the year is {averageMonthlyRainfall:.2f} inches.")
print(f"The month with the most rain was month {maxRainfallMonth}.")
print(f"The month with the least rain was month {minRainfallMonth}.")