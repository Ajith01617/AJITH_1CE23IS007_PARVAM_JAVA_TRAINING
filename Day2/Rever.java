class rev{
    public static void main(String[] args) {
        String inp = "Ajith";
        StringBuilder op3 = new StringBuilder(inp);
        op3.reverse().toString();
        System.out.println(op3);
        /*char [] op = inp.toCharArray();
        char [] op2 = new char[100];
        int j=0;
        for(int i = op.length-1;i>=0;i--){
            System.out.println(op[i]);
            if(j<op.length){
                op2[j]=op[i];
                j=j+1;
            }
            
        }
        System.err.println(op2);*/
    }
}