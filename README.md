# CS 3130 Design and Analysis of Algorithms Fall 2020

# -------------------------------------------------------------------------------------------------------------

# Programming Project #1 [100 points].

# Due date: Wednesday, October 7 (11:59 pm).

```
(A) [15 points] Write a recursive function that will calculate Fibonacci numbers using a recursive
definition. Write a short program to test it. The input of this program must be a positive integer
 n; the output is the corresponding Fibonacci number F(n).
```
```
(B) [20 points] Write an iterative function to calculate Fibonacci numbers. Write a test driver for it.
The input of this program must be a positive integer n; the output is the corresponding Fibonacci
 number F(n).
```
```
(C) [10 points] Write a program that will compare running time of the recursive and iterative
functions for calculating Fibonacci numbers. Call each function for the same size of input n and
find their running times. For part (E) of this project you will have to run this program multiple
 times to find out how the running time of each function depends on the value of n.
```
```
(D) [35 points] NOT RELEVANT TO PREVIOUS PARTS.
In this part of the project, write a function that will implement each Fibonacci number with the
help of an integer array of size 100 (elements of this array will be digits of the Fibonacci
number). When the function is called to find F(n), it will calculate all Fibonacci numbers from
F( 2 ) to F(n). using the basic formula F(n) = F(n-1)+F(n-2). To add two Fibonacci
numbers, the function will add elements of two arrays corresponding to F(n-1) and F(n- 2 )
and store their sums in the array corresponding to F(n). (You are NOT supposed to store ALL
arrays.) Write a program that will calculate Fibonacci numbers containing up to 100 digits.
Display the biggest Fibonacci number that has less than 100 digits. Make sure that your program
will display the error message when a Fibonacci number has 100 digits or more.
```
```
(E) [20 points] This part of the project is a written analysis of two algorithms of calculating
Fibonacci numbers: recursive (part A) and iterative (part B). Show the theoretical order of
growth of the running time for both algorithms. Then include experimental results based on part
(C) and explain them.
```
# Submit the following:

```
→ files for programs (A) – (D), each file containing the code of ONE program (as a text, Word or pdf file;
NO SCREENSHOTS!!!) and results of its execution (snippets, not typed).
→ analysis for the part (E), which MUST be typed. You may use section 2.5, Appendix B and other sources
for your theoretical analysis. Don’t forget to make the necessary references.
→Experimental results must be presented graphically and in the table format (values of n presented for two
methods may be different), and EXPLAINED.
```