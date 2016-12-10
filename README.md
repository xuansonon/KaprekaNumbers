# KaprekaNumbers
A simple Java-based console application that finds Kapreka Numbers from a users' input ranges. Kapreka Numbers are numbers in which when rooted and seperated, it the sum of the digits is the original number. For example, let's say 45. 45 squared is 2025. When we seperate 20 and 25, the sum of those those numbers is 45. Another example could be 297. The sqaure value of 297 is 88209. The sum of 88 and 209 equals to 297. As we can see, it can be any number of digits combined so long as it's less than or equal to the number of digits of the rooted number.
<br />
<br />
### How to start the application ###
```
java KaprekaNumbers
```
You will be asked the following:
```
Please enter a starting range number:
Please enter a ending range number:
```
### Example Input and Outputs ###
### Example 1 ###
```
Starting range: 1, Ending range: 300
```
The above range will result in the below:
```
Kapreka Numbers Found: (1 - 50000)
9 (8 + 1).
45 (20 + 25).
55 (30 + 25).
99 (98 + 1).
297 (88 + 209).
```
### Example 2 ###
```
Starting range: 1, Ending range: 50000
```
The above range will result in the below:
```
Kapreka Numbers Found: (1 - 50000)
9 (8 + 1).
45 (20 + 25).
55 (30 + 25).
99 (98 + 1).
297 (88 + 209).
703 (494 + 209).
999 (998 + 1).
2223 (494 + 1729).
2728 (744 + 1984).
4879 (238 + 4641).
4950 (2450 + 2500).
5050 (2550 + 2500).
5292 (28 + 5264).
7272 (5288 + 1984).
7777 (6048 + 1729).
9999 (9998 + 1).
17344 (3008 + 14336).
22222 (4938 + 17284).
38962 (1518 + 37444).
```

### Still to do ###
- The program accurately finds Kapreka Numbers up to the 50,000 range. Any higher will result with incorrect values.

### See ###
Kapreka Numbers: https://en.wikipedia.org/wiki/Kaprekar_number
