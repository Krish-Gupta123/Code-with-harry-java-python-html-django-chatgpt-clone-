from functools import reduce
list = [7,27,83,62,19]
a = reduce(max,list) # max ek inbuilt func hai python mai jo koi bhi do number ko compare karke batata hai konsa bada hai
print(a)

# logic of this program:
 
# sabse pehle (reduce function) 7 aur 27 ko lega aur (max function) dekhega konsa bada hai phir 27 bada hai toh voh select
# hoke aage jaega aur 27 aur 83 compare hoga phir unmai 83 bada hai toh 83 aage jaega aur 83 aur 62 compare hoga phir 83 
# bada hai toh voh aage jaega aur 19 ke sath compare hoga aur 83 bada hai toh end mai output mai 83 return hoga output mai

