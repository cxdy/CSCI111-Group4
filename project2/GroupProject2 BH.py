
import math

x1 = float(input("Enter Point 1's x coordinate:  " ))
y1 = float(input("Enter Point 1's y coordinate:  " ))
x2 = float(input("Enter Point 2's x coordinate:  " ))
y2 = float(input("Enter Point 2's y coordinate:  " ))

distance = math.sqrt(((x2-x1)**2)+((y2-y1)**2))

print(f"The Euclidean distance between points is {distance}")
