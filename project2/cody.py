# Find the distance between two points

# Author: Cody Kaczynski
# Class: CSCI 111 - Intro to Computer Science
# Group: Project Group 4

# Ask for the coordinates
x1 = float(input("Point #1 x-coord: "))
y1 = float(input("Point #1 y-coord: "))
x2 = float(input("Point #2 x-coord: "))
y2 = float(input("Point #2 y-coord: "))

# Create arrays for each point
point1 = [x1, y1]
point2 = [x2, y2]

# Perform the first calculations
# Compare each point's difference and square it
xMath = (point2[0] - point1[0]) ** 2
yMath = (point2[1] - point1[1]) ** 2

# Find the square root
squareRoot = (xMath + yMath) ** 0.5

print ("The distance between the two points is: ", squareRoot)

"""
EXAMPLE OUTPUT
codykaczynski$ python main.py
Point #1 x-coord: -2
Point #1 y-coord: 2
Point #2 x-coord: 2
Point #2 y-coord: -1
('The distance between the two points is: ', 5.0)
"""
