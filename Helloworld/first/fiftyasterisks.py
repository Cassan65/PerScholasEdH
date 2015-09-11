'''
Created on Sep 11, 2015

@author: STEP69
'''
def fiftyasterisks():
    print(" ")
    print(" ")
    print("Fifty Asterisks")
    a = "*"
    n = 50
    d = int(input("Input the number of asterisks per line  "))
    i = 1
    while i <=n:
        print(a, end=" ")
        if(i+d) % d == 0:
            print(" ")
        i = i+1

        
        
fiftyasterisks()