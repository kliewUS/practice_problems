#1381. Design a Stack With Increment Operation
#https://leetcode.com/problems/design-a-stack-with-increment-operation/
#Basically implementing a stack, but with some extra conditions.
#When pushing, check the size of the stack. If appending the stack will exceed the maxsize, do not append it.
#For incrementing, if the size of the stack is less than k, increment all elements. Otherwise, only increment the bottom (first) k elements. 
class CustomStack:

    def __init__(self, maxSize: int):
        self.maxSize = maxSize
        self.stack = []

    def push(self, x: int) -> None:
        if(len(self.stack) < self.maxSize):
            self.stack.append(x)

    def pop(self) -> int:
        if self.stack:
            return self.stack.pop()
        else:
            return -1

    def increment(self, k: int, val: int) -> None:
        for idx, item in enumerate(self.stack):
            if idx <= k - 1:
                self.stack[idx] += val


# Your CustomStack object will be instantiated and called as such:
# obj = CustomStack(maxSize)
# obj.push(x)
# param_2 = obj.pop()
# obj.increment(k,val)