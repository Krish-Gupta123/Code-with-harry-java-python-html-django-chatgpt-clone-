with open("this.txt") as f:
    copy = f.read()

with open("copy.txt","w") as g:
     g.write(copy)
