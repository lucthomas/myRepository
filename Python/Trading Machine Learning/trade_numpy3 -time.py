"""Using the time function"""

import time

def test_run():

    t1 = time.time()
    print("ENFY")
    t2 = time.time()

    print("The time to make a print statement is",t2 - t1,"seconds")

if __name__ == "__main__":
    test_run()


