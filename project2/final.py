# Find the distance between two points

# Class: CSCI 111 - Intro to Computer Science
# Group: Project Group 4

import math

# Ask for the 2 xy coordinates
x1 = float(input("Point #1 x-coord: "))
y1 = float(input("Point #1 y-coord: "))
x2 = float(input("Point #2 x-coord: "))
y2 = float(input("Point #2 y-coord: "))

# Square the difference between the (x2 - x1) vars and (y2 - y1) vars
xMath = (x2 - x1) ** 2
yMath = (y2 - y1) ** 2

# Find the square root of the sum of the xMath and yMath vars
squareRoot = math.sqrt(xMath + yMath)

print(f"The distance between the two points is: {squareRoot}")