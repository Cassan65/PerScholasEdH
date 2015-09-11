'''
Created on Sep 8, 2015

@author: STEP69
'''

#given a list of mixed data types of string and integer show the sum. 
#next, in the list create a new list of strings only
#lastly, have the user create the list via input
def listplay():
    MyList=[1,2,3,4, 5, 6, 7, 8, 9, 10, "When", "Harry", "Met", "Sally"]     
    numeros=[]
    names=[]
    for item in MyList:
        if type(item)==int: 
            numeros.append(item)
            print(numeros)
            print(sum(numeros))
        if type(item)==str:
            names.append(item)
            print(names)

#lastly, have the user create the list via input
def listplayinput():
    item=""
    MyList=[]
    numeros=[]
    names=[]
    while item != "DONE":
        item=input("Enter a string or integer and press ENTER key. (Type 'DONE' when finished)  ")
        MyList.append(item)
        for item in MyList:
            if item.isdigit()==True: 
                item=int(item)
                numeros.append(item)
                del MyList[0]
            else:
                names.append(item)
                del MyList[0]
            if item == "DONE":
                print(" ")
                print("You are DONE")
                if "DONE" in numeros:
                    numeros.remove("DONE")
                if "DONE" in names:
                    names.remove("DONE")
    print("Numbers", end = " ")
    print(numeros)
    print("Sum of numbers is: ", end = " ")
    print(sum(numeros))
    print("Names", end = " ")
    print(names)

            
#number printing study
def printit():
    print (5.0/9.0)
    print (5.0/9)
    print (5/9.0)
    print (5/9)
    print (9.0/5.0)
    print (9.0/5)
    print (9/5.0)
    print (9/5)
    
#convert from celsius to fahrenheit
def temp():
    print(" ")
    x = input("Input temperature in Celsius ")
    tempf = int(x) * 1.8 + 32.0
    print(x + " Celsius is equal to " + str(tempf) + " Fahrenheit")
    
#first 20 factorial
def factory (n):
    f = 1
    n = 0
    for n in range(20):
            n = n + 1
            f = f * n
            if n != f:
                print (n, f)
            
#factorial with break
def factbill (n):
    f = 1
    n = 0
    while f <= 1000000000:
        for n in range(n, n+1):
            n = n + 1
            f = f * n
            print (n, f)
    print("You have reached a billion")

#asc and desc lists
def alist():
    Mylist=[5, 7, 9, "Bob", "Apple", 11, 15.0]
    for a in Mylist:
        print(a)
    Mylist.reverse()
    for a in Mylist:
        print(a)
        
def exceptioncontrol():
    yoursmart=0
    while(yoursmart==0):
        try:
            a=int(input("Tell me your age as an integer "))
            print("You were born in the year of ", 2015-a)
            print(" ")
            yoursmart=1
        except:
            print("You did not enter an integer")
            print("")
        
        


   
#functioncalls
def main():
    listplay()
    listplayinput()
    temp()
    factory(1)
    factbill(1)
    alist()
    exceptioncontrol()
    printit()

    
main()
