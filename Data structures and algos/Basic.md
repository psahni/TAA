Code Repo
https://github.com/rasmus4200/algorithms101

Setup IntelliJ
https://docs.google.com/document/d/1ZQcD8SO98NdNTJFc_jInRq2xPuYn8IYTWZFeym0yuAg/edit#heading=h.v4j2d3593k9t

DS            API
Array         ArrayList
LinkedList
Binary tree

#

array[1] => Access element => O(1)

#

Array insertion and deletion happens in linear time. O(n)

#

Object[] newData = new Object[initialCapacity *2];

# Insert to array

for (int j = size; j > index ; j--) {
  array[j] = array[j-1]; // array[4] = array[3] and so on
}

array[index] = myValue;
size++;

# Delete from array

for (int j = index; j < size - 1; j++) {
  array[j] = array[j+1]; // array[2] = array[3] and so on
}

if (j == size - 1) {
  array[j] = null;
}

size--;


# LinkedList
- Set/Get O(n)
- Insert O(1) -> AddFront
- Delete O(n)
- Can grow incrementally

In java we have a linkedList class

linkedList = new LinkedList();

Head points the first ele

Insertion

newNode.next = head
head = newNode;


Deletion

if (head === null) {
  return;
}
if (head.data === data) {
  head = head.next
}

Node current = head;

while (current.next != null) {
  if (current.next.data == data) {
    current.next = current.next.next;
    return;
  }
  current = current.next;
}

#

Queue -> FIFO   add O(1), delete O(1), Search O(n)
Stack -> LIFO

# HashTable

Key => Hash function => Index => Value stored at this index

* If  Collision, then the values are stored in linkedList or chaining

O(1) is a good hashtable

In case of collision, it is O(n)


# Binary Tree

BFS - Breath First Search
DFS

Algo

      Root Node
Left Node   Right Node

- Create a newNode
  - If node is null then assign that newNode to node
    node = newNode
    return node

  - if node is not null

    if (newNode.key < node.key) {
      // Go Left
      node.left = insert(node.left)
    }

    if (newNode.key > node.key) {
      // Go Right
      node.right = insert(node.righ);
    }

##TODO
-  Write a java program to delete a node in Binary tree

- min
It is easy to find, since all the elements on the left hand side are smaller, so the most left element is min

Only delete has some special cases - finding the node, one child, no child, two child


- Travesal of a tree
  - In order (213)
  - Preorder (123)
  - Postorder (231)

    1
  2   3

-------------------------------------

O(logn) (Find, Insert, Delete)

-------------------------------------

https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

https://dev.to/javinpaul/how-to-implement-inorder-traversal-in-a-binary-search-tree-1787

# Binary Heap


MaxHeap In each branch, the root node has the highest value, the nodes below it are always lesser.

Two types:-
MinHeap - Min element is at the top
Max Heap - Max element is at the top

MinHeap Insert
Add the element in the end of the array
Now if the parent is bigger, swap, repeat the process

MaxHeap Insert
Add the element in the end of the array
Now if the parent is small, swap repeat the process

MinHeap - DeleteMin
Insert the last element at first position, then find the min of two childs
If the min child is smaller, then swap. if the element is smaller than the two children dont do anything, else repeat

MaxHeap - DeleteMax
Insert the last element at first position, then find the max of two childs
If the max child is bigger, then swap. if the element is bigger than the two children dont do anything, else repeat

Runtime

ExtractMax: O(1)
Heapify: O(logn) (single run)
Heap Sort: O(nlogn)


More: https://www.cs.cmu.edu/~adamchik/15-121/lectures/Binary%20Heaps/heaps.html
https://www.geeksforgeeks.org/binary-heap/

# Fibonacci Series
fib(n-1) + fib(n-2)

O(2 pow(n)) takes exponential time

For higher order nos, it slows down

Memoization
- Makes 3.333% faster

int[] memo = new int[1001]; // By default memo[i] is zero

if memo[n] == 0 then
  momo[n] = fib(n-1) + fib(n-2)

return memo[n]


# Sorting Algo's
- Bubble Sort     O(n pow(2))
- Merge sort
    Divide Conquer O(nlogn)
- Quick Sort       O(nlogn)
  We choose a pivot element, all elements left hand side of pivot
  are smaller and all elements on the right hand side are larger.
  Divide and conquer

  elements smaller..... pivot ..... elements larger === (1)

  https://www.youtube.com/watch?v=CnS2Qt8erEI

  We start with taking 0th element as Pivot, and we find and we move i and j
  so that a[i] <= Pivot and a[j] >= pivot, j--, i++ and i > j
  We swap the elements
  When j crosses i or becomes equal to i
  j > i or i == j
  then a[j] = pivot
  Now at this point (1) is satisfied

  Partition the array left and right and continue the same process

  # GRAPHS
  - G(v,E)

  - Edge list (How to reach from one vertex to other - form an array for that)
  - Adjacency Matric (map 0 and 1 for directed edges)
  - Adjacency List (What are the neighbours of a particular vertex)

#
  Breadth First Search

#

  Depth

#

AVL tree
Red Black Tree -> Coloring + Rotation

Red Black Tree: https://www.youtube.com/watch?v=qvZGUFHWChY
O(logn)

4 rules:
- Red or Black
- Root and leaves are black
- if node is red, children are black
- No two adjacent nodes are red
- All paths from root to last node must contain same no of black nodes.



https://www.geeksforgeeks.org/how-to-design-a-tiny-url-or-url-shortener/

##

careercup.com
leetcode.com

##

String[] text = {"hello", "bye"};
int total = Arrays.stream(text).mapToInt(String::length).sum();

##

Books
https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx0ZXN0MTIzNHNpbTQ2NXxneDpiYTJmYWIwYTAyOGJiZmQ

https://github.com/ndina/acm/blob/master/coders-at-work.pdf