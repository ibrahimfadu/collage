public class ControlStatements {
    public static void main(String args[]){
        int x=20,i=2,j=1,k=2,y=10;
        int a[]={10,15,20,25,30};
        //Nested if statements
        if(x>10){
            //if-else statement
            if(x%2==0){
                System.out.println("x is greater than 10 and even number");
            }
            else{
                System.out.println("x is greater than 10 and odd number");
            }
        }
        else{
            System.out.println("x is less than 10");
        }
        //if-else-if ladder
    if(i>10){
        System.out.println("i is greater than 10");
    }
    else if(i<10) {
        System.out.println("i is less than 10");
    }
    else{
        System.out.println("x is 10");
    }
    //Switch statements
    switch (j) {
        case 0:
            System.out.println("j is 0");
            break;
        case 1:
            System.out.println("j is 1");
            break;
        default:
        System.out.println("j is not in the list");
            break;
    }
    //loops
    while (k<=10){
        System.out.println(k);
        k=k+2;
    }
    do{
        System.out.println(y);
        y=y+1;
    }
    while(y<=10);
    for (int l=1;l<=5; l++){
        System.out.println(l);
    }
    for(int m:a){
        System.out.println(m);
    }
    }
}
