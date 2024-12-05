with open("donkey.txt","r") as a:
    content = a.read()

content = content.replace("donkey","#####")

with open("donkey.txt","w") as a:
     a.write(content)