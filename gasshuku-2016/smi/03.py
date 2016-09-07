#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import re

def enc(s):
    repatter = re.compile(r"[aiueo]")
    ans = s[0]
    for i in range(len(s)):
        if i < len(s)-1 and repatter.match(s[i]):
            ans += s[i+1]
    return ans

def max_str(s):
    ans = len(s[0])
    for i in s:
        ans = max(ans, len(i))
    return ans

def func(s, mn, k):
    if mn < k:
        return -1
    ss = []
    for i in s:
        ss.append(i[:k])
    for i in range(len(ss)-1):
        pp = ss.pop(0)
        if pp in ss:
            return func(s, mn, k+1)
    return k

if __name__ == "__main__":
    while True:
        n = int(input())
        if n is 0:
            break
        s = []
        for i in range(n):
            s.append(enc(input()))
        print(func(s, max_str(s), 1))
