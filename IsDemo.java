class IsDemo {
    public static void main(String[] args)
    {
        char a[]={'a','b','5','?','A',' '};
        for(int i=0; i<a.length;i++)
        {
            if(Character.isDigit(a[i]))
            System.out.println(a[i]+"is a digit");
            if(Character.isLetter(a[i]))
            System.out.println(a[i]+"is a letter");
        }
    }
}