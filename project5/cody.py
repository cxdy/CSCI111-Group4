# Define empty list
rainList = []

# Grab input for each month
# loops 1 - 13 (starting at one, ending at 13, for a total of 12 iterations)
for i in range(1, 13, 1):
    # This is probably bad but I couldn't get the number of the month to show up in the input
    # without setting it to a string
    month = str(i)
    # Grab the input
    rainFall = int(input("Please enter the rainfall amount for month " + month + ": "))
    # Validation, verifying that the data input was a positive number
    while rainFall < 0:
        # prompt user to fix their input
        print("Invalid entry, please enter a positive number")
        rainFall = int(input("Please enter the rainfall amount for month " + month + ": "))
    # finally add the value to the list at rainList[i]
    rainList.append(rainFall)
# END LOOP

# define totalRain with val of 0
totalRain = 0
# sort the rainList least to greatest
minRain = sorted(rainList)
# sort the rainList greatest to least
maxRain = sorted(rainList, reverse=True)
# loop thru 0-11 and add the values of each index to totalRain
for i in range(0, 11, 1):
    totalRain += rainList[i]
# find average monthly rain by dividing totalRain by 12
averageRain = totalRain / 12
# indexes start at 0, but our months start at one
# add one to the index of maxMonth and minMonth to get the number 1-12
maxMonth = rainList.index(maxRain[0]) + 1
minMonth = rainList.index(minRain[0]) + 1

# return the values (added a line break for formatting)
print(f"\nThe total rainfall for the year: {totalRain} inches")
print(f"The average monthly rainfall for the year: {averageRain} inches")
print(f"It rained the most in month #{maxMonth}")
print(f"It rained the least in month #{minMonth}")
