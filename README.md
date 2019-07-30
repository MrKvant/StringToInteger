# StringToInteger
The function first discards as many whitespace characters as necessary
until the first non-whitespace character is found. Then, starting from
this character, takes an optional initial plus or minus sign followed by as
many numerical digits as possible, and interprets them as a numerical
value.<br>
The string can contain additional characters after those that form the
integral number, which are ignored and have no effect on the behavior
of this function.<br>
If the first sequence of non-whitespace characters in str is not a valid
integral number, or if no such sequence exists because either str is empty
or it contains only whitespace characters, no conversion is performed.
If no valid conversion could be performed, a zero value is returned.<br>
Note:<br>
(a) Only the space character ’ ’ is considered as whitespace character.<br>
(b) Assume we are dealing with an environment which could only<br>
store integers within the 32-bit signed integer range<br>

### _Startup Instructions:_
1. Clone the repository
2. Go to the folder `/out`
3. Run the command `java -cp . com.kazachenko.strtoint.Main "-4815 ABC 162342"`
