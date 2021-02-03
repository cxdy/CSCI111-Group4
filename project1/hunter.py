from time import sleep

# Source of madlib: https://www.woojr.com/disney-mad-libs-for-kids/disney-madlibs-frozen/

# Get all user inputs and store them in thier own variables.
landmass = input("Please enter a landmass: ")
female_name = input("Please enter a female name: ")
adjective1 = input("Please enter an adjective: ")
verb1 = input("Please enter a verb: ")
weather = input("Please enter a type of inclement weather: ")
food1 = input("Please enter a type of food in the non-plural form: ")
adjective2 = input("Please enter another adjective: ")
noun = input("Please enter a plural noun: ")
name = input("Please enter a name: ")
adjective3 = input("Please enter another adjective: ")
food2 = input("Please enter another type of food in the non-plural form: ")

# Store the paragraph with all the inputs above in the variable fullMessage
fullMessage = (f"Elsa is the frozen Queen of {landmass}! Her sister\'s name is {female_name}, who she loves so much! Elsa has {adjective1} powers, too! She can {verb1} ice, and make it {weather}. When she\'s angry, she sometimes accidentally creates {food1} storms, which dump {adjective2} hail and cold {noun} all over town! Don\'t worry, though. Her trusty pal, {name}, the snowman made from Elsa\'s {adjective3} powers, with a {food2} for a nose, will guide her! Maybe Elsa can teach you how to make cold {noun} out of {weather}, too!")

# Start a for loop with the range equaling the length of the fullMessage variable.
for i in range(len(fullMessage)):
  # Determine whether the current index in fullMessage is period exclamation point.
  sentence_end = fullMessage[i] == "." or fullMessage[i] == "!"
  # Print the message on a sleep timer, making a more natural reading experience. 
  # If the current index is a period or exclamation point, wait 0.8 seconds before continuing, otherwise print at a speed of 0.04 seconds.
  print(fullMessage[i], sep='', end='', flush=True); sleep(0.8) if sentence_end else sleep(0.04)