BIG O

#


Measures the efficiency
Run time charac
Basically Time complexity

O(1) constant time
O(n) loop

#

O(1), O(logn) are very fast.

#

Sorting Algo - O(nlogn)
When elements are compared with each other.

O(2n) -> Exponential takes a v long time. Example fob series recursion

2 to the power n

#

O(n + logn) is actually O(n)

O(n + m) => O(n)

#

for (i = 0; i < array.length; i++) {                      o(n)
  for (j=0; j < array.length; j++) {                           o(n)            ==> O(n pow(2)) + O(1)
    for (k=0; k < 999999999; j++) {}
  }
}

O(n pow(2)) + O(1) = O(n pow(2))

How O(logn) is calculated

https://hackernoon.com/what-does-the-time-complexity-o-log-n-actually-mean-45f94bb5bfbf
Example of Binary Search with 16 elements O(logn)


O(1) < O(log[n]) < O(n) < O(n*log[n]) < O(n^x) < O(x^n) < O(n!)