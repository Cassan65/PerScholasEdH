'''
Created on Sep 8, 2015

@author: STEP69
'''

#This is how we Comment
'''for multiple line comments
this is the way to go'''

def summary(a, b, c):
    print(a+b+c)

def u2(u, i, z):
    u=1
    i=1
    if u == 1 or i<0:
        print("woohoo")
        print("I am still in the if")
    else:
        print("U is not zero or I is >2")
    print("I am no longer inside a conditional")
    
def avg(x,y,z):
    average=(x+y+z)/3
    print(average)
    print(type(average))

def main():
    print ("Hello")
    print (8/4)
    summary(1,5,7)
    u2(1, 1, 2)
    avg(6,7,8)
    
main()