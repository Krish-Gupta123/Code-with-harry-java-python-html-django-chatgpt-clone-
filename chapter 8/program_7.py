def remove_and_split(string,word):
    newstr = string.replace(word,"")
    return newstr

this = "       krish is here    "
n=remove_and_split(this,"krish")
print (n)
print(this)
print(this.strip())#strip func removes unwanted spaces