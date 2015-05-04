# -*- coding: utf-8 -*-
"""
Created on Wed Apr 22 16:19:54 2015

@author: shrav
"""
#==============================================================================
# Yield -  a generator in Py 
#def first(n):
# #    num ,nums = 0,[]
# #    while num<n:
# #      #  yield num
# #        nums.append(num)
# #        num += 1
# #    return nums
# #
# #
# #sum_of_first_n = sum(first(1000)) 
# #print sum_of_first_n    
#==============================================================================

## MAP - Lambda in Py
def cubic (x):
    return x*x*x


integer = [x for x in range(11)]   
item = [x for x in xrange(101)]
res = list(map(cubic,item))
res1 = map((lambda x:x%2 == 0), [2,3,4])
comp1 = filter((lambda x:x%2 == 1), integer)
comp2 = reduce((lambda x,y: x+y ), integer)

#print res1
#print comp1
#print comp2 
#==============================================================================
# Count occurrence of a char in a string
#==============================================================================
sentence = "the river streams revves past"
    
def countChar(s):
    s = s.lower()
    counter =list( map(s.count,s))
    l = [s.count(c) for c in s]
    return max(l)

#print countChar(sentence)    


#==============================================================================
# Print a list of files in a directory
#==============================================================================
def filelist(dir): 
    base_dir = dir
    subdir = []
    for item in os.listdir(dir):
        fullpath = os.path.join(base_dir,item)
        
        if(os.path.isdir(fullpath)):
           subdir.append(fullpath)
        else:
            print fullpath
    for d in subdir:
         filelist(d)

#filelist('/home/shrav/Interview')      

#==============================================================================
# Make a prime number list from 1 to 100
#==============================================================================
def isprime(n):
    if n<= 1:
        return False
    if n == 2:
      return True
    if n%2 == 0:
        return False

    for p in range(3,int(math.sqrt(n))+ 2):
           if n%p == 0:
               return False
           
    return True


isP = [x for x in xrange(100) if isprime(x)]       
#print isP    

#==============================================================================
# Reverse a string using recursion
#==============================================================================

def reverse(x):
    print x
    if len(x) <= 1:
        return x
    
    return reverse(x[1:])+ x[0]

string = 'malay'
#print reverse(string)    


#==============================================================================
# Merging two overlapped ranges
#==============================================================================
#def combine(data):
#    sd = sorted(data)
#    print 'sorted data = ', sd
#    stored = list(sd[0])
#    print stored
#    for s, e in sd:
#        print 's and e',s,e
#        if s <= stored[1]:
#            print 'stored[1],e',stored[1],e
#            stored[1] = max(stored[1], e)
#            print stored[1]
#        else:
#            print 'yield_A: ', tuple(stored)
#            yield tuple(stored)
#            stored[0] = s
#            print 's',s
#            stored[1] = e
#            print 'e',e
#    print 'yield_B: ', tuple(stored)
#    yield tuple(stored)
#
#
#if __name__ == '__main__':
#
#    data = [(4,9), (20, 22), (1, 3), (24, 32), (23, 31), (12, 15), (8,13)]
#   # print 'result = %s'  %(list(combine(data)))
class account:
 def Account(self,id):
    self.id =id
    id = 666

 Acc = Account(123)
 print Acc.id    











   
    
    















