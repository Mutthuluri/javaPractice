//   code to implement stacks using linked lists                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
#include <stdio.h>
#include <stdlib.h>
#define max 3
int top;
void push();
void pri();
typedef struct student{
    int rollno;
    struct student *next;
}node;
node* header;
int stack_[max];
int main(){
    header= NULL;
  int choice;
  while(1){
    printf("Press 1 for push\n");
    printf("Press 2 for pop\n");
    printf("Press 3 for print\n");
    printf("Press 4 for exit\n");
    scanf("%d",&choice);
    switch(choice)
    {
      case 1: push();
      break;
      case 2: pop();
      break;
      case3 : pri();
      break;
      case4 : return 0;
      default: printf("INVALID INPUT");
    }
  }
  return 0;
}
void push(){
  int item;
  int rollno;
  if(header=NULL){
    printf("initailizing the object\n");
    header =(node*)malloc(sizeof(node));
    printf("enter the roll number");
    scanf("%d",&rollno);
  }
  else {
    header->next=(node*)malloc(sizeof(node));
    header->next->next = NULL;
    header = header->next;
    printf("enter the item to push");
    scanf("%d",&item);
    //stack_[top]=item;
  }
}
void pri(){
  node* ptr = header;
  if(header == NULL)
  {
      printf("Stact is Empty");
  }
  while(ptr != NULL)
  {
      printf("Roll Number is %d", ptr->rollno);
      ptr=ptr->next;
      
  }
  /*if(top==-1){
    printf("the stack is empty");
    
  }
  else {
    for(i=top;i>=0;i--){
      printf("%d : ln\n",stack_[i]);
    }
  }*/
}
void pop(){
  int item;
  if(header==NULL){
    printf("underflow\n");
  }
  else {
    node* item;  
    item=header;
    printf("\n deleted elements is %d \n",item->rollno );
    header = header->next;
    //free(item);
   
  }
}
