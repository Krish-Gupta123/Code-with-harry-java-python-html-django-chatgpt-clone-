abusive = ['get_lost','fool','donkey']

with open("ignore.txt","r") as a:
    content = a.read()

for word in abusive:
    content = content.replace(word,"#####")
    with open("ignore.txt","w") as a:
         a.write(content)