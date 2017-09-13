# Using python to find the number of repetitions 

import sys
# open and read input file s
fileinput = sys.argv[1]
f= open(fileinput, 'r')
# create a dictionary called counts with key, value pairs
# key is the hex value and value is the repetitions
counts= {}
for line in f.readlines():
    line = line.rstrip('\n')
    line = line.lstrip("0")

# count repetition
    counts[line]= counts.get(line, 0) + 1

# convert hex values to int for sorting purposes
mylist = [ int(keys,16) for keys in counts.keys() ]
sortedmylist = (sorted((mylist)))
# convert back to hex and strip
hexsortedlist= ([hex(i)[2:] for i in sortedmylist])
print(hexsortedlist)
# delete any hex values that aren't repeated
for idx in range(0,len(hexsortedlist)):
    if counts[hexsortedlist[idx]]>=2:
        print(hexsortedlist[idx], counts[hexsortedlist[idx]])
