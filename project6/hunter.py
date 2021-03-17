# Objective: Read in an addresses file and use it to create a CSV file.

# Name: Hunter Evanoff
# Class: CSCI 111 - Intro to Computer Science
# Group: Project Group 6

# Setup a csv file for the final output, with w (write) mode.
new_addresses_file = open('randomaddresses.csv', 'w')

# Open the randomaddresses.txt file in the current directory.
random_addresses = open('randomaddresses.txt', 'r')
# Return all lines in the randomaddresses.txt file into a list.
random_addresses_lines = random_addresses.readlines()
# Close the randomaddresses.txt file so that other computer operations can access it.
random_addresses.close()

count = 0

# Iterate over the random_addresses_lines list
for line in random_addresses_lines:
  count += 1
  # If there is a remainder when dividing the count interator by 2 (first line of the address), execute.
  # If there is no remainder (second line of the address), execute the else code.
  if count % 2:
    # Remove the default line break and write it with a comma at the end (CSV format)
    new_addresses_file.write(line.rstrip('\n') + ',')
  else:
    # Find the city in the line by taking a substring of all the characters up to the first occurrence of a comma. Bring in the comma as well.
    city = line[:line.index(',')+1]
    # Find the state and zip by taking all the characters after the first occurance of a comma.
    # Also strip the leading space and replace any remaing spaces (between state and zip) with a comma.
    state_and_zip = line[line.index(',')+1:].strip().replace(' ', ',')
    # If this is the last line to be written, don't add a line break, else do add a line break.
    lineEnding = '\n' if count != len(random_addresses_lines) else ''
    # Write the comma separated city and state and add on a line break
    new_addresses_file.write(city + state_and_zip + lineEnding)

# Close the randomAddresses.csv file so that other computer operations can access it.
new_addresses_file.close()