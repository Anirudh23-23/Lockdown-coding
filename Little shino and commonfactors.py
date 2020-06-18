def gcd(a,b):
if a == 0:
return b
return gcd(b%a, a)

def commondiv(a,b):
n = gcd(a,b)
result = 0
i = 1
while(i <= (n**(1.0/2))):
if(n % i == 0):
if n/i == i:
result += 1
else:
result += 2
i += 1

return result

a, b = map(int, input().split())
print(commondiv(a,b)
