a = open("poems.txt","r")
b = a.read()

if 'twinkle' in b:
    print("twinkle is present")
else:
    print("twinkle is not present")
a.close()