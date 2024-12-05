dictionary = {"pankha":"fan",
              "pocha":"mop",
              "murti":"statue",
              "naam":"name"
}


print("options are",dictionary.keys())
a = input("enter the hindi word whose english translation is needed = ")

# print("english translation of " + a + " is",dictionary[a])
# display a error if word is not in dictionary

# or

print("english translation of " + a + " is",dictionary.get(a))
# display none if word is not in dictionary