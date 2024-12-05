with open("mine.txt","r") as a:
    c = a.read()

if 'python' in c.lower():
    print("python is present")
else:
    print("python is not present")