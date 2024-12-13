Collection Framework

-Grp of elements stored in a single unit
- =It consists of multiple classes & interfaces
is a part java.util

-classes that were part of external library and then added in java.util pkg are known as legacy classes.

- Immutable classes:
	1.String
	2.Wrapper Classes
	3.Legacy Classes
	
-Collection Framework : 
	Consistes of Below Interfaces:
		1.Iterable
		2.Collection
		3.Map
	
													Iterable(I)
														|
														|
													Collection(I)
														|
								______________________________________________						
								|					|						 |
							List(I)				Queue(I)				   Set(I)
							|						|1.PriorityQueue(C)     |
							1.ArrayList(C)		Deque(I)					1.HastSet
							2.LinkedList(C)_________|1.ArrayDeque(C)		2.LinkedHashSet
							3.Vector
								|
							 Stack
							 
							 
							 						Map(I)
							 						  |
							 						  1.HashMap
							 						  2.LinkedHashMap
							 						  3.TreeMap