def game():
    return 500

score = game()
with open("hiscore.txt") as a: #file name ke baad kuch nhi likhte (r ya w etc) toh woh automatically r he consider karta hai that is read
    highscore = a.read()

if highscore == '':
    with open("hiscore.txt",'w') as a:
        a.write(str(score))

elif score>int(highscore) :
    with open("hiscore.txt","w") as a:
       a.write(str(score))



