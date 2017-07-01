repeat=1         #to run at least once.
while repeat:       
	
	x=int(input("\nEnter an index for the square matrix: "))
	
	#creates a zero matrix
	list=[[0 for i in range(x)] for i in range(x)]

	i,a=0,1
	
	#for a 1x1 matrix, the loop is going to stop at the first control point. Each time indices are increased by 1, the code advances two more steps.
	
	for b in range(x):
		
		#goes rigt
		for j in range(b,x-b):
			list[i][j]=a
			a=a+1
			
		#control point 
		if  x%2 == 1 and b==x-2:
			break
			
		#goes down
		for i in range(b+1,x-(b)):
			list[i][j]=a
			a=a+1
			
		#goes left
		for j in reversed(range(b,x-(b+1))):
			list[i][j]=a
			a=a+1
			
		#control point	
		if  x%2 == 0 and b==x-3:
			break
			
		#goes up
		for i in reversed(range(b+1,x-(b+1))):
			list[i][j]=a
			a=a+1
			
	#output:
	print()
	for o in range(x):
		print(list[o])
		
	repeat=int(input('\nType any number to run it again, type "0" to exit. --> '))
