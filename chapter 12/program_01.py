def file(filename):
    try:
        with open(filename , "r") as f:
            print(f.read())
    except FileNotFoundError:
        print(f"file not found : {filename}")
# FileNotFoundError = yeh ek inbuilt error hai file exist nhi karti hai toh
#                     program ko crash hone se bachane ke liye python 
#                     mai except ke baad errors ko khud ke marji se nhi
#                     likh sakte inbuilt errors ka naam likhna padta hai proper 
#                     for eg : ZeroDivisionError , FileExistsError , FileNotFoundError , ValueError ,TypeError

file("1.txt")
file("2.txt")
file("3.txt")
