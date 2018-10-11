class UserDefinedExecption {
    public static void main(String args[]){
        try {
            throw new MyException(2);
        }
        catch(MyException e){
            System.out.println(e);

        }
    }
}

class MyException extends Exception {
    int a;
    MyException(int b) {
        a=b;
    }
    
}