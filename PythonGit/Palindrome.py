#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Feb 22 20:52:44 2022

@author: biggycheese
"""

def student_func(x):
    x = x.lower().replace(" ", "")
    rx = x[::-1]
    if(x == rx):
        return True
    return False

print (student_func("Are we no drawn onward to new era"))