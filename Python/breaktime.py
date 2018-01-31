import webbrowser
import time

num = 0
breaks = 1
duration = 2*5

print ("Hello Hysopt")
print ("This program started on:" + time.ctime())
while(num < breaks):
    time.sleep(duration)
    webbrowser.open("https://www.youtube.com/watch?v=LvcB4qlynx4")
    num = num + 1 

