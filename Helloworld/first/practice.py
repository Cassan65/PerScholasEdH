'''
Created on Sep 8, 2015

@author: STEP69
'''
def printit():
    print (5.0/9.0)
    print (5.0/9)
    print (5/9.0)
    print (5/9)
    print (9.0/5.0)
    print (9.0/5)
    print (9/5.0)
    print (9/5)
    
def temp():
    x = input("Input temperature in Celsius ")
    tempf = int(x) * 1.8 + 32.0
    print(x + " Celsius is equal to " + str(tempf) + " Fahrenheit")
    
def factory (n):
    f = 1
    n = 0
    for n in range(20):
            n = n + 1
            f = f * n
            if n != f:
                print (n, f)
            
def factbill (n):
    f = 1
    n = 0
    while f <= 1000000000:
        for n in range(n, n+1):
            n = n + 1
            f = f * n
            print (n, f)
    print("You have reached a billion")

def main():
    printit()
    temp()
    factory(1)
    factbill(1)
    
main()
