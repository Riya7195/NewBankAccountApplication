## NewBankAccountApplication

This application uses an API to receive information fron developers end, read data from a file and store in an appropriate data strucure and generate random numbers and work with string API.

## This Application performs the following tasks:

- Read a csv file of names, social security numbers, account type and initial deposit.
- Use a proper data structure to hold these accounts.
- Both Savings and Checking accounts share the properties:( deposit,withdraw, transfer, showinfo). Here an 11 digit account number (generated with the following process: 1 or 2 depending on savings or checkings, last two digits od ssn, unique 5-digit number and random 3 digit number)
- savings account holders are given a safety box, identified by 3 digit no. and accessed with a 4 digit code.
- checking account holders are assigned with a debit card of 12 digit no. and a 4 digit pin.
- Both accounts will use an interface that determines the base interest, Savings account will use 0.25 points less than the base rate.Checkings account will use 15% of the base price.
- The showInfo method should reveal relevalent account info as well as information specific to the checking and savings account.



### Example:

#### Sample Input & Output:

```
Open a savings account
Open a checkings account
Open a checkings account
Open a checkings account
Open a savings account
Open a checkings account
Open a savings account
Open a savings account
Open a savings account
Open a checkings account
Open a savings account
Open a checkings account
Open a savings account
Open a checkings account
Open a checkings account

****************************************************
Name: Arielle Duncan
Account Number: 13810001126
Balance:1000.0
Rate: 2.25%
Your Savings Account Feautures
Safety Deposit Box ID: 142
Safety Deposit Box Key: 7115

****************************************************
Name: Marybeth Sanders
Account Number: 28310002194
Balance:2500.0
Rate: 0.375%
Your Checking Account Feautres: 
DebitCard Number: 2147483647
DebitCard PIN: 5024

****************************************************
Name: Hattie Storey
Account Number: 27510003558
Balance:3500.0
Rate: 0.375%
Your Checking Account Feautres: 
DebitCard Number: 2147483647
DebitCard PIN: 8601

****************************************************
Name: Hilary Ward
Account Number: 22310004330
Balance:6000.0
Rate: 0.375%
Your Checking Account Feautres: 
DebitCard Number: 2147483647
DebitCard PIN: 5891

****************************************************
Name: Luella Bradbury
Account Number: 14510005963
Balance:1500.0
Rate: 2.25%
Your Savings Account Feautures
Safety Deposit Box ID: 222
Safety Deposit Box Key: 6716

****************************************************
Name: Frankie Davidson
Account Number: 22710006426
Balance:10000.0
Rate: 0.375%
Your Checking Account Feautres: 
DebitCard Number: 2147483647
DebitCard PIN: 1702

****************************************************
Name: Darnell Goodman
Account Number: 1971000725
Balance:15000.0
Rate: 2.25%
Your Savings Account Feautures
Safety Deposit Box ID: 434
Safety Deposit Box Key: 6254

****************************************************
Name: Shila Obrien
Account Number: 1441000881
Balance:2200.0
Rate: 2.25%
Your Savings Account Feautures
Safety Deposit Box ID: 573
Safety Deposit Box Key: 6152

****************************************************
Name: Agnes Leonard
Account Number: 19610009305
Balance:6500.0
Rate: 2.25%
Your Savings Account Feautures
Safety Deposit Box ID: 226
Safety Deposit Box Key: 7866

****************************************************
Name: Florinda Goulding
Account Number: 26810010904
Balance:25000.0
Rate: 0.375%
Your Checking Account Feautres: 
DebitCard Number: 2147483647
DebitCard PIN: 2883

****************************************************
Name: Eliseo Waller
Account Number: 18210011523
Balance:12500.0
Rate: 2.25%
Your Savings Account Feautures
Safety Deposit Box ID: 236
Safety Deposit Box Key: 8883

****************************************************
Name: Fredia Hastings
Account Number: 21710012101
Balance:6500.0
Rate: 0.375%
Your Checking Account Feautres: 
DebitCard Number: 2147483647
DebitCard PIN: 8348

****************************************************
Name: Melody Potts
Account Number: 116100138
Balance:1500.0
Rate: 2.25%
Your Savings Account Feautures
Safety Deposit Box ID: 613
Safety Deposit Box Key: 8523

****************************************************
Name: Deadra Power
Account Number: 20110014711
Balance:4500.0
Rate: 0.375%
Your Checking Account Feautres: 
DebitCard Number: 2147483647
DebitCard PIN: 853

****************************************************
Name: Clyde Higgs
Account Number: 22910015642
Balance:1000.0
Rate: 0.375%
Your Checking Account Feautres: 
DebitCard Number: 2147483647
DebitCard PIN: 2113

```
