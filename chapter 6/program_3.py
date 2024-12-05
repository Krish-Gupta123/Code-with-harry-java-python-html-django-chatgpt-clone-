text = input("enter the text : ")
spam = False # ismai boolean data type ka use karenge spam hai ya nhi pakadne ke liye

if("make a lot of money" in text): # in ka bhi use karenge ismai kyuki specific text ko point karna hai ya equal to equal to operator bhi use kar sakte the
    spam = True
elif("buy now" in text):
   spam = True
elif("subscribe this" in text):
   spam = True
elif("click this" in text):
   spam = True
else:
   spam = False

if (spam):
   print("this is a spam ")
else:
   print("this is not a spam")