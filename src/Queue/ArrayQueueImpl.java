package Queue;

import java.util.Arrays;

public class ArrayQueueImpl { 
		  private int[] arr = new int[10];  
		  private int front = -1;  
		  private int rear = 0;    
		  
		  public int peek() {   
			  if(isEmpty()) 
				   return -1;
			  else
				  return arr[front];			  
		  } 
		  
		  public void enqueue(int obj){  
				
			  if(rear == arr.length) {
				  System.out.println("Resizing...");
				  resize();
			  }
		  
			  arr[rear++] = obj;
			  front = 0;
			 
				  
		  }   
	
		  public int dequeue() { 
			  if(isEmpty()){
				  return -1;
			  }
			  
			  int first = arr[front];
			  int[] temp = new int[size()];
			  System.arraycopy(arr, 1, temp, 0, size()-1);
			  arr = temp;
			  --rear;
			  if(rear == front)
				  --front;
			  return first;
		  }	       
		  
		  public boolean isEmpty(){    
			  if(front == -1)
				  return true;
			  return false;
		  }    
		
		  public int size(){    
			  return rear-front;  
		  }             
		
		  private void resize(){   
			int[] temp;
			int len = arr.length;
			int newlen = 2*arr.length;
			temp = new int[newlen];
			System.arraycopy(arr,0,temp,0,len);
			arr = temp;
		  }
} 

