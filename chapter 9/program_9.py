file_1 = "file1.txt"
file_2 = "donkey.txt"

with open(file_1) as f:
    a = f.read()

with open(file_2) as f:
    b = f.read()

if a == b:
    print("files are identical")
else:
    print("files are not identical")

# ye program jismai files are identical bola hai matlab file ke andar ka content same hai ya nhi ye nhi bolre 
# question ye bol rha hai ke file name same hai ya nhi yeh batao ismai file 1 aur 2 dono same daloge toh 
#  output files are identical aaega agar file 2 mai koi dusra file ka name daloge (jo folder mai exist 
# karna chaiye) toh files are not identical aaega agar dono ka content same hoga exactly toh bhi becoz ye
#  file name check karta hai not file content