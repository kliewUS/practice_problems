from typing import List
# Write any import statements here

def getHitProbability(R: int, C: int, G: List[List[int]]) -> float:
  # Write your code here
  battleships = 0
  
  for idx in range(len(G)):
    for jdx in range(len(G[idx])):
      if G[idx][jdx] == 1:
        battleships += 1
  
  return battleships / (R * C)
