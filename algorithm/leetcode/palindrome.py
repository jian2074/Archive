class Solution:
    def isPalindrome(self, x: int) -> bool:
        y = str(x)
        z = y[::-1]
        return y==z

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        elif len(str(x)) == 1:
            return True
        num_length = len(str(x))
        if (num_length % 2 == 0):
            for i in range (1, int(num_length/2)+1):
                if (int(str(x)[i-1])!= int(str(x)[-i])):
                    return False
            return True
        else:
            for i in range(1, int((num_length-1)/2)+1):
                if (int(str(x)[i-1])!= int(str(x)[-i])):
                    return False
            return True