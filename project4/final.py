# Start a for loop with a range of 3, one iteration for each runner
for i in range(1, 4):
  # Get user inputs for both the runner's name and race time.
  competitor = str(input(f"Please enter name of runner #{i}: "))
  score = int(input(competitor + "'s finish time (in minutes): "))
  while(score <= 0):
    # If score is zero minutes, force entry retry
    if(score == 0):
      print("Their score cannot be 0 minutes.. Please try again.")
      score = int(input(competitor + "'s finish time (in minutes): "))
    # If score in negative minutes, force entry retry
    elif(score < 0):
      print("Their score cannot be less than 0 minutes.. Please try again.")
      score = int(input(competitor + "'s finish time (in minutes): "))
  if(i == 1):
    runner1 = competitor
    time1 = int(score)
    # Initially set the first score to first place
    firstPlace = runner1
  elif(i == 2):
    runner2 = competitor
    time2 = int(score)
    # If the second score is less than the first, set this score to first and push previous score to second
    if (time2 < time1) :
      firstPlace = runner2
      secondPlace = runner1
    # Else set second score to second place
    else:
      secondPlace = runner2
  elif(i == 3):
    runner3 = competitor
    time3 = int(score)
    # If third score is more than both score one and two, set it to third place
    if(time3 > time1 and time3 > time2):
      thirdPlace = runner3
    # If third score is less than both score one and two, push previous scores down one place and set this score to first
    elif (time3 < time1 and time3 < time2):
      thirdPlace = secondPlace
      secondPlace = firstPlace
      firstPlace = runner3
    else:
    # If neither of the previous conditions are met, this score must be second place
      thirdPlace = secondPlace
      secondPlace = runner3

# Print final race results.
print(f"Gold medal Winner: {firstPlace}\nSilver Medal Winner: {secondPlace}\nBronze Medal winner: {thirdPlace}")