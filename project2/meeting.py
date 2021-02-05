# Find the distance between two points

# Author: Cody Kaczynski
# Class: CSCI 111 - Intro to Computer Science
# Group: Project Group 4

import math

# Ask for the coordinates and create arrays for each point
point1 = [float(input("Point #1 x-coord: ")), float(input("Point #1 y-coord: "))]
point2 = [float(input("Point #2 x-coord: ")), float(input("Point #2 y-coord: "))]

# Perform the first calculations
# Compare each point's difference and square it
xMath = (point2[0] - point1[0]) ** 2
yMath = (point2[1] - point1[1]) ** 2

# Find the square root
squareRoot = math.sqrt(xMath + yMath)

print(f"The distance between the two points is: {squareRoot}")