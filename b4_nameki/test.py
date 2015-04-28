#!/usr/bin/env python
# -*- coding: utf-8 -*-

def fibo(n):
    if n is 0 or n is 1:
        return 1
    return fibo(n-1) + fibo(n-2)

if __name__ == '__main__':
    ans = fibo(5)
    print(ans)
