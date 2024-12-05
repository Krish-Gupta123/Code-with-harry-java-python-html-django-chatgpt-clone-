c = True
i = 1
with open("mine.txt","r") as a:
    
    while c:
         c = a.readline()
         if 'python' in c.lower():
      
            print("python is present")
            print(c)
            print(f"line number = {i}")
        
         i+=1 #python mai i++,i-- nhi hota bas c aur c++ mai hota hai