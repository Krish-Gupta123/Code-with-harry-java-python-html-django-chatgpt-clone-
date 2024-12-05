class book_ticket:
    def __init__(self,name,fare,seats):
        self.name = name
        self.fare= fare
        self.seats = seats

    def get_status(self):
        print(f"the name of train is {self.name}")
        print(f"the number of seats in train is {self.seats}")
        print(f"total fare of your jouney is {self.fare}")

    def seats_status(self):
        if(self.seats>0):
            print(f"your seat is confirmed and your seat number = {self.seats}")
            self.seats = self.seats - 1
        else:
            print("sorry all seats are booked pls try in tadkal")

a = book_ticket("rajdhani express : 74794","150 rupees",300)
a.get_status()
a.seats_status()
a.seats_status()
a.seats_status()
a.seats_status()
# a.seats_status() ye  char bar isliye likha taki pata chale ke program seat book karne ke baad no of seats minus 
# karke seat number de rha hai