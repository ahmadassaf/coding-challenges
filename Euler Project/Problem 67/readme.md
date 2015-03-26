Problem No.67: Maximum path sum II
==========================

By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

                                   3
                                  7 4
                                 2 4 6
                                8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), a 15K text file containing a triangle with one-hundred rows.

NOTE: This is a much more difficult version of [Problem 18](https://projecteuler.net/problem=18). It is not possible to try every route to solve this problem, as there are 299 altogether! If you could check one trillion (1012) routes every second it would take over twenty billion years to check them all. There is an efficient algorithm to solve it.

- [Original Link](https://projecteuler.net/problem=67)

## Notes

The difference between this solution and the one in 18 is that we want to automate the reading of the traingle from a `.txt` file instead of converting it manually into an array.