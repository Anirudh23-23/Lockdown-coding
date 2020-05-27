t=int(input())
l=list(map(int,input().split()))
s=1
for i in range(t):
    s=(s*l[i])%1000000007
print(s)
