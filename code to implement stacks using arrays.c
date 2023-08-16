//   code to implement stacks using arrays                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
#include <stdio.h>
#define max 3
int top;
void push();
void pri();
int stack_[max];
int main(){
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
  if(top==max-1){
    printf("overflow\n");
  }
  else {
    top=top+1;
    printf("enter the item to push");
    scanf("%d",&item);
    stack_[top]=item;
  }
}
void pri(){
  int i;
  if(top==-1){
    printf("the stack is empty");
    
  }
  else {
    for(i=top;i>=0;i--){
      printf("%d : ln\n",stack_[i]);
    }
  }
}
void pop(){
  int item;
  if(top==-1){
    printf("underflow\n");
  }
  else {
    item=stack_[top];
    printf("\n deleted elements is %d \n",item );
    top--;
  }
}
