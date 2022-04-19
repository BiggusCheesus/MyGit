#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Feb 22 22:57:37 2022

@author: biggycheese
"""

def student_func(x):
    if(x % 15 == 0):
        return 'threefive'
    elif(x % 3 == 0):
        return 'three'
    elif(x % 5 == 0): 
        return 'five'
    return x

print(student_func(4))