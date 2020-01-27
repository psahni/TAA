https://www.geeksforgeeks.org/how-to-design-a-tiny-url-or-url-shortener/

Below is one important observation about possible characters in URL.

A URL character can be one of the following
1) A lower case alphabet [‘a’ to ‘z’], total 26 characters
2) An upper case alphabet [‘A’ to ‘Z’], total 26 characters
3) A digit [‘0’ to ‘9’], total 10 characters

There are total 26 + 26 + 10 = 62 possible characters.

So the task is to convert a decimal number to base 62 number.

To get the original long URL, we need to get URL id in the database. The id can be obtained using base 62 to decimal conversion.

---------------------------------------------------------------
