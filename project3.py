class library:
    def __init__(self,booklist):
        self.booklist = booklist

    def display_list(self):
        for book in self.booklist:
            print(f"  *{book}")

    def borrowbook(self,bookname):
        self.bookname = bookname
        if bookname in self.booklist:
            print(f"hey you have been alloted {bookname} \npls handle it properly and return it within 30 days")
            self.booklist.remove(bookname)
            return True
        else:
            print(f"sorry! this book is not available now, pls wait till it is available")
            return False
        
    def returnbook(self,bookname):
        self.bookname = bookname
        self.booklist.append(bookname)
        print("thks for returning/donating {bookname}. ")
        return True

class student:
    def borrowbook(self):
        self.book = input("enter the required book which you want : ")
        return self.book
    
    def returnbook(self):
        self.book = input("enter the bookname you are returning : ")
        return self.book

    
   
if __name__ == "__main__":
    welcome_message = '''WELCOME TO CENTRAL LIBRARY
    PRESS 1 TO GET LIST OF AVAIBLE BOOKS
    PRESS 2 TO BORROW A BOOK
    PRESS 3 TO RETURN A BOOK
    PRESS 4 TO EXIT THE LIBRARY'''

    central_library = library(["python notes","c notes","c++ notes","html notes","css notes" ,"java script notes","djanjo notes","php notes","sql notes"])
    bacho = student()
    while(True):
        print(welcome_message)
        a = int(input("enter the number : "))
        if a == 1:
            central_library.display_list()
        elif a == 2:
            central_library.borrowbook(bacho.borrowbook())
        elif a == 3:
            central_library.returnbook(bacho.returnbook())
        elif a== 4:
            exit()
        else:
            print("invalid operationel")

