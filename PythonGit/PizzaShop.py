#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Feb 22 23:33:57 2022

@author: biggycheese
"""
# make sure to execute this cell so that your function is defined
# you must re-run this cell any time you make a change to this function

def cost_calculator(*pizzas, **kwargs):
    total = 0.0
    for pizza in pizzas:
        total = total + 13 + p(pizza)
    print(total)
    if('drinks' in kwargs):
        total = total + d(kwargs['drinks'])
    print(total)
    if('wings' in kwargs):
        total = total + w(kwargs['wings'])
    print(total)
    tax = total*0.0625
    if('coupon' in kwargs):
        coup = total * kwargs['coupon']
        total = total + tax - coup
    else:
        total = total + tax    
    print(total)
    return round(total, 2)
    
def p(pizza):
    t = 0.0
    for item in pizza:
            if(item == "pepperoni"):
                t = t + 1.00
            elif(item == "mushroom" or item == "olive"):
                t = t + 0.50
            elif(item == "anchovy"):
                t = t + 2.00
            elif(item == "ham"):
                t = t + 1.50
    return t

def d(drinks):
    t1 = 0.0
    for i in drinks:
        if(i == "small"):
            t1 = t1 + 2.00
        elif(i == "medium"):
            t1 = t1 + 3.00
        elif(i == "large"):
            t1 = t1 + 3.50
        elif(i == "tub"):
            t1 = t1 + 3.75
    return t1

def w(wings):
    t2 = 0.0
    for i in wings:
        if(i == 10):
            t2 = t2 + 5.00
        elif(i == 20):
            t2 = t2 + 9.00
        elif(i == 40):
            t2 = t2 + 17.50
        elif(i == 100):
            t2 = t2 + 48.00
    return t2

print(cost_calculator([], [], ["pepperoni", "pepperoni"], wings = [10, 20], drinks=["small"]))
print(cost_calculator(drinks=["small"]))
print(cost_calculator([], ["ham", "anchovy"], drinks=["tub", "tub"], coupon=0.1))


