'''
Created on Sep 11, 2015

@author: STEP69
'''
def sevdaycal():
    print("Design a 7-Day Calendar")
    n = int(input("Input the number of days in the month (28-31): "))
    d = int(input("Input the starting day from 0 to 6 (0=Sun, 1=Mon,...): "))
    for j in range(d):
        print("  ", end=" ")
    i = 1
    while i <=n:
        if i <10:
            print(" " + str(i), end=" ")
        else:
            print(i, end=" ")
        if(i+d) % 7 == 0:
            print(" ")
        i = i+1
    print("")    
sevdaycal()

def eightdaycal():
    print("Design an 8-Day Calendar")
    n = int(input("Input the number of days in the month (28-31): "))
    d = int(input("Input the starting day from 0 to 8 (0=Sun, 1=Mon,...): "))
    for j in range(d):
        print("  ", end=" ")
    i = 1
    while i <=n:
        if i <10:
            print(" " + str(i), end=" ")
        else:
            print(i, end=" ")
        if(i+d) % 8 == 0:
            print(" ")
        i = i+1
        
eightdaycal()

def fivecal():
    print(" ")
    print("Now It's Time to Design 5 Calendars.")
    for k in range(0,5):
        n = int(input("Input the number of days in the month (28-31): "))
        d = int(input("Input the starting day from 0 to 8 (0=Sun, 1=Mon,...): "))
        for j in range(d):
            print("  ", end=" ")
        i = 1
        while i <=n:
            if i <10:
                print(" " + str(i), end=" ")
            else:
                print(i, end=" ")
            if(i+d) % 7 == 0:
                print(" ")
            i = i+1

fivecal()

def leapyearcal():
    print(" ")
    print(" ")
    print("Design a 7-Day Calendar with Leap Year Considered")
    y = int(input("Enter a year (e.g. 1950 or 2000)"  ))
    n = int(input("Input the number of days in the month (28-31): "))
    d = int(input("Input the starting day from 0 to 6 (0=Sun, 1=Mon,...): "))

    for j in range(d):
        print("  ", end=" ")
    i = 1
    while i <=n:
        if i <10:
            print(" " + str(i), end=" ")
        else:
            print(i, end=" ")
        if(i+d) % 7 == 0:
            print(" ")
        i = i+1
    print("")    
    if y % 4 == 0:
        if y % 400 == 0:
            print("LEAP YEAR")
        else:
            print("NOT A LEAP YEAR")
    if y % 4 != 0:
        print("NOT A LEAP YEAR")
leapyearcal()

