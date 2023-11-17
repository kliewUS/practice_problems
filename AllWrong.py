# Write any import statements here

def getWrongAnswers(N: int, C: str) -> str:
  # Write your code here
  res = ""
  for ch in C:
    if ch == 'A':
      res += 'B'
    else: 
      res += 'A'
  
  return res
